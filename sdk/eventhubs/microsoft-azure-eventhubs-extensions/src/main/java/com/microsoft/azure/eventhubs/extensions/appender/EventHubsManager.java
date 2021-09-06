// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.extensions.appender;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.AbstractManager;
import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventDataBatch;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.messaging.eventhubs.EventHubProducerClient;

import java.io.IOException;


public final class EventHubsManager extends AbstractManager {
    //private static final ScheduledExecutorService EXECUTOR_SERVICE = Executors.newScheduledThreadPool(1);
    private final String eventHubConnectionString;
    //private EventHubClient eventHubSender;
    private EventDataBatch eventDataBatch;
    private EventHubProducerClient eventHubSender;

    protected EventHubsManager(final String name, final String eventHubConnectionString) {
        super(LoggerContext.getContext(true), name);
        this.eventHubConnectionString = eventHubConnectionString;
    }

   public void send(final byte[] msg) {
	eventDataBatch = this.eventHubSender.createBatch();

        if (msg != null) {
            EventData data = new EventData(msg);
	        this.eventDataBatch.tryAdd(data);
            this.eventHubSender.send(this.eventDataBatch);
        }
    }

    public void send(final Iterable<byte[]> messages) {
        if (messages != null) {
	        this.eventDataBatch = this.eventHubSender.createBatch();
            for (byte[] eventData : messages) {
                // try to add the event from the array to the batch
                if (!this.eventDataBatch.tryAdd(new EventData(eventData))) {
                    // if the batch is full, send it and then create a new batch
                    this.eventHubSender.send(eventDataBatch);
                    this.eventDataBatch = this.eventHubSender.createBatch();

                    // Try to add that event that couldn't fit before.
                    if (!this.eventDataBatch.tryAdd(new EventData(eventData))) {
                        throw new IllegalArgumentException("Event is too large for an empty batch. Max size: "
                            + this.eventDataBatch.getMaxSizeInBytes());
                    }
                }
            }
        // send the last batch of remaining events
        if (this.eventDataBatch.getCount() > 0) {
            this.eventHubSender.send(eventDataBatch);
        }
        this.eventHubSender.close();
    }
}

    public void startup() throws IOException {
   	this.eventHubSender = new EventHubClientBuilder()
            .connectionString(this.eventHubConnectionString)
            .buildProducerClient();
    }
}
