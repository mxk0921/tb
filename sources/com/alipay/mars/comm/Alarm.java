package com.alipay.mars.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import tb.f7l;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Alarm extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f3866a;
    public static WakerLock b;
    public static Alarm c;
    public static final TreeSet<Object[]> d = new TreeSet<>(new ComparatorAlarm());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ComparatorAlarm implements Comparator<Object[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ComparatorAlarm() {
        }

        public int compare(Object[] objArr, Object[] objArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("295e3f", new Object[]{this, objArr, objArr2})).intValue();
            }
            TSetData tSetData = TSetData.ID;
            return (int) (((Long) objArr[tSetData.ordinal()]).longValue() - ((Long) objArr2[tSetData.ordinal()]).longValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TSetData {
        ID,
        WAITTIME,
        PENDINGINTENT
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return i | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        return i;
    }

    public static PendingIntent b(long j, long j2, Context context) {
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.Alarm", "setAlarmMgr error", th);
                return null;
            }
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            LogCatUtil.error("bifrost.Alarm", "am == null");
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("ALARM_ACTION(" + String.valueOf(Process.myPid()) + f7l.BRACKET_END_STR);
        intent.putExtra("ID", j);
        intent.putExtra("PID", Process.myPid());
        PendingIntent e = ya.e(context, (int) j, intent, a(268435456));
        boolean booleanValue = Build.VERSION.SDK_INT >= 31 ? ((Boolean) Class.forName("android.app.AlarmManager").getMethod("canScheduleExactAlarms", new Class[0]).invoke(alarmManager, new Object[0])).booleanValue() : true;
        LogCatUtil.info("bifrost.Alarm", "canScheduleExactAlarms = " + booleanValue);
        if (booleanValue) {
            alarmManager.setExact(2, j2, e);
        }
        return e;
    }

    public static final int getLastAlarmMiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67b9513b", new Object[0])).intValue();
        }
        return f3866a;
    }

    public static /* synthetic */ Object ipc$super(Alarm alarm, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mars/comm/Alarm");
    }

    private native void onAlarm(long j);

    public static void resetAlarm(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fccf61f", new Object[]{context});
        } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            TreeSet<Object[]> treeSet = d;
            synchronized (treeSet) {
                if (context == null) {
                    try {
                        context = BifrostEnvUtils.getContext();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<Object[]> it = treeSet.iterator();
                while (it.hasNext()) {
                    d(context, (PendingIntent) it.next()[TSetData.PENDINGINTENT.ordinal()]);
                }
                d.clear();
                Alarm alarm = c;
                if (alarm != null) {
                    context.unregisterReceiver(alarm);
                    c = null;
                }
            }
        }
    }

    public final void c(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            return;
        }
        try {
            f3866a = (int) (SystemClock.elapsedRealtime() - ((Long) objArr[TSetData.WAITTIME.ordinal()]).longValue());
        } catch (Throwable th) {
            LogCatUtil.warn("bifrost.Alarm", "[recordLastAlarmMiss] Exception: " + th.toString());
        }
    }

    public static boolean d(Context context, PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae56420", new Object[]{context, pendingIntent})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.Alarm", "cancelAlarmMgr error", th);
                return false;
            }
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            LogCatUtil.error("bifrost.Alarm", "am == null");
            return false;
        } else if (pendingIntent == null) {
            LogCatUtil.error("bifrost.Alarm", "pendingIntent == null");
            return false;
        } else {
            alarmManager.cancel(pendingIntent);
            pendingIntent.cancel();
            return true;
        }
    }

    public static boolean stop(long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d646bd1", new Object[]{new Long(j), context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("bifrost.Alarm", "stop error", th);
        }
        if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            return false;
        }
        if (context == null) {
            context = BifrostEnvUtils.getContext();
        }
        if (context == null) {
            LogCatUtil.error("bifrost.Alarm", "context==null");
            return false;
        }
        TreeSet<Object[]> treeSet = d;
        synchronized (treeSet) {
            if (b == null) {
                b = new WakerLock(context);
                LogCatUtil.info("bifrost.Alarm", "stop new wakerlock");
            }
            if (c == null) {
                c = new Alarm();
                context.registerReceiver(c, new IntentFilter());
                LogCatUtil.info("bifrost.Alarm", "stop new Alarm");
            }
            Iterator<Object[]> it = treeSet.iterator();
            while (it.hasNext()) {
                Object[] next = it.next();
                if (((Long) next[TSetData.ID.ordinal()]).longValue() == j) {
                    d(context, (PendingIntent) next[TSetData.PENDINGINTENT.ordinal()]);
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (context != null && intent != null) {
            try {
                long longExtra = intent.getLongExtra("ID", 0L);
                Long valueOf = Long.valueOf(longExtra);
                int intExtra = intent.getIntExtra("PID", 0);
                if (0 != longExtra && intExtra != 0 && intExtra == Process.myPid()) {
                    TreeSet<Object[]> treeSet = d;
                    synchronized (treeSet) {
                        Iterator<Object[]> it = treeSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            Object[] next = it.next();
                            if (((Long) next[TSetData.ID.ordinal()]).equals(valueOf)) {
                                c(next);
                                it.remove();
                                break;
                            }
                        }
                    }
                    WakerLock wakerLock = b;
                    if (wakerLock != null) {
                        wakerLock.lock(200L);
                    }
                    if (z) {
                        onAlarm(longExtra);
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.Alarm", "onReceive error", th);
            }
        }
    }

    public static boolean start(long j, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c34a64", new Object[]{new Long(j), new Integer(i), context})).booleanValue();
        }
        try {
            if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i < 0) {
                return false;
            }
            if (context == null) {
                context = BifrostEnvUtils.getContext();
            }
            if (context == null) {
                return false;
            }
            TreeSet<Object[]> treeSet = d;
            synchronized (treeSet) {
                if (b == null) {
                    b = new WakerLock(context);
                    LogCatUtil.info("bifrost.Alarm", "start new wakerlock");
                }
                if (c == null) {
                    Alarm alarm = new Alarm();
                    c = alarm;
                    context.registerReceiver(alarm, new IntentFilter("ALARM_ACTION(" + String.valueOf(Process.myPid()) + f7l.BRACKET_END_STR));
                }
                Iterator<Object[]> it = treeSet.iterator();
                while (it.hasNext()) {
                    if (((Long) it.next()[TSetData.ID.ordinal()]).longValue() == j) {
                        return false;
                    }
                }
                if (i >= 0) {
                    elapsedRealtime += i;
                }
                PendingIntent b2 = b(j, elapsedRealtime, context);
                if (b2 == null) {
                    return false;
                }
                d.add(new Object[]{Long.valueOf(j), Long.valueOf(elapsedRealtime), b2});
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.error("bifrost.Alarm", "start error", th);
            return false;
        }
    }
}
