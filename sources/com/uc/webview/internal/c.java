package com.uc.webview.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c extends BroadcastReceiver {
    private static Method c;

    /* renamed from: a  reason: collision with root package name */
    Context f14368a;
    a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    public c(Context context) {
        this.f14368a = context.getApplicationContext();
        try {
            c = PowerManager.class.getMethod("isScreenOn", new Class[0]);
        } catch (Exception unused) {
        }
    }

    public static boolean a(PowerManager powerManager) {
        try {
            return ((Boolean) c.invoke(powerManager, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.b.a();
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.b.b();
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.b.c();
        }
    }

    public static final boolean a(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }
}
