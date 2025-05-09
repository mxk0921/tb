package tb;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886342);
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcd9dc49", new Object[]{context})).longValue();
        }
        if (context == null) {
            return Long.MAX_VALUE;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return Long.MAX_VALUE;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Throwable th) {
            hav.a("UltronMemoryUtils", th.getMessage());
            return Long.MAX_VALUE;
        }
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e1461fc", new Object[]{context})).longValue();
        }
        return a(context) / 1048576;
    }
}
