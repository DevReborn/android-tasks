package com.reborn.tasks.android;

import android.os.Handler;
import android.os.Looper;

import com.reborn.tasks.ITaskExecutor;
import com.reborn.tasks.TaskExecutor;
import com.reborn.tasks.TaskFactory;

public class AndroidTaskFactory extends TaskFactory {
    private static final ITaskExecutor _executor = new TaskExecutor() {
        private final Handler _handler = new Handler(Looper.getMainLooper());

        @Override
        public void postback(final Runnable postback) {
            _handler.post(postback);
        }
    };

    public AndroidTaskFactory() {
        super(_executor);
    }
}
