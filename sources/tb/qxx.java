package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;
import com.taobao.adaemon.TriggerInstrumentation;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class qxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qxx b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26994a;

    static {
        t2o.a(499122205);
    }

    public final void b() {
        Method method;
        boolean z;
        if (TriggerInstrumentation.triggered.get()) {
            pxx.f26392a.e("ProcessAdjuster", "schedule triggered", new Object[0]);
            return;
        }
        Iterator it = ((ArrayList) cux.b(o41.a())).iterator();
        while (it.hasNext()) {
            if (((ActivityManager.RunningAppProcessInfo) it.next()).processName.equals(o41.a().getPackageName())) {
                pxx.f26392a.e("ProcessAdjuster", "schedule exit by running process", new Object[0]);
                return;
            }
        }
        if (a.v().A(o41.a())) {
            pxx.f26392a.e("ProcessAdjuster", "schedule exit by proc machine", new Object[0]);
            return;
        }
        Context a2 = o41.a();
        pxx.f26392a.e("ProcessAdjuster", "adjustAdj start", new Object[0]);
        try {
            Method declaredMethod = Application.class.getSuperclass().getDeclaredMethod("getBaseContext", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(a2, new Object[0]);
            Method k = StaticHook.k(Class.forName("android.app.ContextImpl"), "getUserId", new Class[0]);
            k.setAccessible(true);
            Integer num = (Integer) k.invoke(invoke, new Object[0]);
            num.intValue();
            Method declaredMethod2 = Class.forName("android.app.ActivityManager").getDeclaredMethod("getService", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(null, new Object[0]);
            try {
                Class<?> cls = invoke2.getClass();
                Class<?> cls2 = Class.forName("android.app.IInstrumentationWatcher");
                Class<?> cls3 = Class.forName("android.app.IUiAutomationConnection");
                Class cls4 = Integer.TYPE;
                method = StaticHook.g(cls, "startInstrumentation", ComponentName.class, String.class, cls4, Bundle.class, cls2, cls3, cls4, String.class);
            } catch (Throwable unused) {
                method = null;
            }
            if (method != null) {
                z = true;
            } else {
                z = false;
            }
            pxx.f26392a.e("ProcessAdjuster", "adjustAdj ready", "reflectSuccess", Boolean.valueOf(z));
            if (z) {
                AlarmObject alarmObject = new AlarmObject();
                alarmObject.module = "keepalive";
                alarmObject.modulePoint = "hide_api";
                alarmObject.arg = "";
                alarmObject.isSuccess = true;
                AppMonitor.getInstance().commitAlarm(alarmObject);
                method.setAccessible(true);
                method.invoke(invoke2, new ComponentName(a2.getPackageName(), "com.taobao.adaemon.TriggerInstrumentation"), null, 0, null, null, null, num, null);
            } else {
                AlarmObject alarmObject2 = new AlarmObject();
                alarmObject2.module = "keepalive";
                alarmObject2.modulePoint = "hide_api";
                alarmObject2.arg = "";
                alarmObject2.errorCode = null;
                alarmObject2.errorMsg = null;
                alarmObject2.isSuccess = false;
                AppMonitor.getInstance().commitAlarm(alarmObject2);
            }
        } catch (Throwable th) {
            this.f26994a = true;
            pxx pxxVar = pxx.f26392a;
            pxxVar.d("ProcessAdjuster", "adjustAdj err", th, new Object[0]);
            pxxVar.d("ProcessAdjuster", "adjustAdj err Cause", th.getCause(), new Object[0]);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        pxx.f26392a.e("ProcessAdjuster", "schedule", new Object[0]);
        if (!this.f26994a) {
            izx.b().schedule(new Runnable() { // from class: tb.zvx
                @Override // java.lang.Runnable
                public final void run() {
                    qxx.this.b();
                }
            }, 30, TimeUnit.SECONDS);
        }
    }
}
