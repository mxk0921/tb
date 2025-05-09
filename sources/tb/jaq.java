package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737149079);
    }

    public static long a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2be7c39", new Object[]{context, new Long(j)})).longValue();
        }
        return context.getSharedPreferences("cache_cleaner_auto_clear_sp", 0).getLong("last_monitor_and_auto_clear_time", j);
    }

    public static long b(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fe9b37b", new Object[]{context, new Long(j)})).longValue();
        }
        return context.getSharedPreferences("cache_cleaner_auto_clear_sp", 0).getLong("auto_clear_update", j);
    }

    public static void c(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa449f4", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("cache_cleaner_auto_clear_sp", 0).edit();
        edit.putLong("auto_clear_update", j);
        edit.apply();
    }

    public static void d(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49455632", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("cache_cleaner_auto_clear_sp", 0).edit();
        edit.putLong("last_monitor_and_auto_clear_time", j);
        edit.apply();
    }
}
