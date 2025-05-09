package com.taobao.keepalive.periodic;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.keepalive.periodic.AliveReceiver;
import tb.c0;
import tb.izx;
import tb.pxx;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AliveReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static PendingIntent f10874a;

    static {
        t2o.a(499122196);
    }

    public static /* synthetic */ void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            b(context);
        }
    }

    public static /* synthetic */ Object ipc$super(AliveReceiver aliveReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/periodic/AliveReceiver");
    }

    public static void b(Context context) {
        boolean canScheduleExactAlarms;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        pxx.f26392a.e("AliveReceiver", "rescheduleAlarm", new Object[0]);
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 31) {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis() + 10800000;
            if (f10874a == null) {
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.addFlags(32);
                intent.setAction("com.taobao.alive.action.schedule");
                f10874a = ya.e(context, 0, intent, z ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0);
            }
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (z) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                if (!canScheduleExactAlarms) {
                    alarmManager.set(0, currentTimeMillis, f10874a);
                    return;
                }
            }
            if (i >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, f10874a);
            } else {
                alarmManager.setExact(0, currentTimeMillis, f10874a);
            }
        } catch (Throwable th) {
            pxx.f26392a.d("AliveReceiver", "rescheduleAlarm err", th, new Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent == null ? null : intent.getAction();
        if (TextUtils.isEmpty(action)) {
            pxx.f26392a.e("AliveReceiver", "empty action", new Object[0]);
            return;
        }
        pxx.f26392a.e("AliveReceiver", "onReceive", "action", action);
        if (!"com.taobao.alive.action.schedule".equals(action)) {
            return;
        }
        if (c0.e("anr_normal_change")) {
            izx.b().execute(new Runnable() { // from class: tb.gt0
                @Override // java.lang.Runnable
                public final void run() {
                    AliveReceiver.a(context);
                }
            });
        } else {
            b(context);
        }
    }
}
