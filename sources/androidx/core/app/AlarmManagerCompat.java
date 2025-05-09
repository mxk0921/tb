package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AlarmManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static AlarmManager.AlarmClockInfo createAlarmClockInfo(long j, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AlarmManager.AlarmClockInfo) ipChange.ipc$dispatch("5bb6bd32", new Object[]{new Long(j), pendingIntent});
            }
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        public static void setAlarmClock(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17f02a95", new Object[]{alarmManager, obj, pendingIntent});
            } else {
                alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62b095e", new Object[]{alarmManager, new Integer(i), new Long(j), pendingIntent});
            } else {
                alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
            }
        }

        public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("420cd039", new Object[]{alarmManager, new Integer(i), new Long(j), pendingIntent});
            } else {
                alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static boolean canScheduleExactAlarms(AlarmManager alarmManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8342e20a", new Object[]{alarmManager})).booleanValue();
            }
            return alarmManager.canScheduleExactAlarms();
        }
    }

    private AlarmManagerCompat() {
    }

    public static boolean canScheduleExactAlarms(AlarmManager alarmManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8342e20a", new Object[]{alarmManager})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.canScheduleExactAlarms(alarmManager);
        }
        return true;
    }

    public static void setAlarmClock(AlarmManager alarmManager, long j, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5965df79", new Object[]{alarmManager, new Long(j), pendingIntent, pendingIntent2});
        } else {
            Api21Impl.setAlarmClock(alarmManager, Api21Impl.createAlarmClockInfo(j, pendingIntent), pendingIntent2);
        }
    }

    public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62b095e", new Object[]{alarmManager, new Integer(i), new Long(j), pendingIntent});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setAndAllowWhileIdle(alarmManager, i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void setExact(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec706cf2", new Object[]{alarmManager, new Integer(i), new Long(j), pendingIntent});
        } else {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420cd039", new Object[]{alarmManager, new Integer(i), new Long(j), pendingIntent});
        } else if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setExactAndAllowWhileIdle(alarmManager, i, j, pendingIntent);
        } else {
            setExact(alarmManager, i, j, pendingIntent);
        }
    }
}
