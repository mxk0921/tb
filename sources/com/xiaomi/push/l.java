package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f15000a;

    /* renamed from: a  reason: collision with other field name */
    private static final Object f1477a = new Object();
    private static volatile Handler b;

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return a(context, broadcastReceiver, intentFilter, null, i);
    }

    private static Handler b() {
        if (f15000a == null) {
            synchronized (l.class) {
                try {
                    if (f15000a == null) {
                        HandlerThread handlerThread = new HandlerThread("handle_receiver");
                        handlerThread.start();
                        f15000a = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15000a;
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        return a(context, broadcastReceiver, intentFilter, str, b(), i);
    }

    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Intent registerReceiver;
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        return registerReceiver;
    }

    public static Handler a() {
        if (b == null) {
            synchronized (f1477a) {
                try {
                    if (b == null) {
                        HandlerThread handlerThread = new HandlerThread("receiver_task");
                        handlerThread.start();
                        b = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }
}
