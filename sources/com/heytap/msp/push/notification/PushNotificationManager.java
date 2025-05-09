package com.heytap.msp.push.notification;

import com.heytap.msp.push.notification.PushNotification;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;
import tb.y5n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PushNotificationManager {
    private PushNotification.Builder builder;
    private Executor executor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SingletonHolder {
        private static final PushNotificationManager INSTANCE = new PushNotificationManager();

        static {
            t2o.a(612368457);
        }

        private SingletonHolder() {
        }
    }

    static {
        t2o.a(612368455);
    }

    public static PushNotificationManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void enqueue(final ISortListener iSortListener) {
        if (this.executor == null) {
            this.executor = new ThreadPoolExecutor(1, 0, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(16), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.executor.execute(new Runnable() { // from class: com.heytap.msp.push.notification.PushNotificationManager.1
            @Override // java.lang.Runnable
            public void run() {
                y5n.i().s(PushNotificationManager.this.builder, iSortListener);
            }
        });
    }

    public void execute(ISortListener iSortListener) {
        y5n.i().s(this.builder, iSortListener);
    }

    public PushNotificationManager with(PushNotification.Builder builder) {
        this.builder = builder;
        return this;
    }
}
