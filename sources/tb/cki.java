package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cki {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_MAX_CACHE_SIZE = 104857600;
    public static final int LOW_MAX_CACHE_SIZE = 78643200;

    static {
        t2o.a(620757134);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61dc73b8", new Object[]{context})).intValue();
        }
        return b(context, 52428800, 5);
    }

    public static int b(Context context, int i, int i2) {
        long j;
        int i3;
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c9cf6d8", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            j = activityManager.getMemoryClass() * 1048576;
        } else {
            j = 0;
        }
        long min = Math.min(maxMemory, j);
        if (min < 33554432) {
            i3 = 6291456;
        } else if (min < 67108864) {
            i3 = 10485760;
        } else {
            i3 = (int) (min / i2);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            if (is64Bit) {
                int min2 = Math.min(i, i3);
                fiv.c("MemCacheBuilder", "maxValue: " + min2, new Object[0]);
                return min2;
            }
        }
        return Math.min(36700160, i3);
    }
}
