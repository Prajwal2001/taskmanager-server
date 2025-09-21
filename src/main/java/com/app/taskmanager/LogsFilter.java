package com.app.taskmanager;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class LogsFilter extends Filter<ILoggingEvent> {

    private Thread thread;

    public LogsFilter(Thread thread) {
        this.thread = thread;
    }

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (Thread.currentThread().equals(thread)) {
            return FilterReply.ACCEPT;
        } else {
            return FilterReply.DENY;
        }
    }
}
