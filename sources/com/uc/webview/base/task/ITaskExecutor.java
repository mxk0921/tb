package com.uc.webview.base.task;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ITaskExecutor {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile ITaskExecutor sInstance;

        public static ITaskExecutor get() {
            return sInstance;
        }

        public static void set(ITaskExecutor iTaskExecutor) {
            sInstance = iTaskExecutor;
        }
    }

    public abstract void execute(Runnable runnable);

    public abstract void schedule(Runnable runnable, long j);
}
