package com.uc.webview.export.multiprocess.helper;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f14332a;
    private static Method b;

    static {
        Method method = null;
        try {
            d a2 = d.a();
            if (e.b()) {
                method = Context.class.getDeclaredMethod("bindIsolatedService", Intent.class, Integer.TYPE, String.class, Executor.class, ServiceConnection.class);
            }
            a2.close();
        } catch (Exception unused) {
        } finally {
            f14332a = method;
        }
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, Handler handler) {
        if (Build.VERSION.SDK_INT < 24) {
            c.b("BindService", "doBindService - bindService A");
            return context.bindService(intent, serviceConnection, 65);
        }
        try {
            c.b("BindService", "doBindService - bindServiceByReflection");
            if (b == null) {
                b = Context.class.getDeclaredMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class);
            }
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            return ((Boolean) b.invoke(context2, intent, serviceConnection, 65, handler, Process.myUserHandle())).booleanValue();
        } catch (Throwable unused) {
            c.b("BindService", "doBindService - bindService B");
            return context.bindService(intent, serviceConnection, 65);
        }
    }
}
