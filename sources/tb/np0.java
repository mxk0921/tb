package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class np0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public long[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("b22d5df5", new Object[]{this});
        }
        long[] e = e();
        long j = e[0];
        return new long[]{j, j - ((e[1] + e[2]) + e[3])};
    }

    public long[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("ff8bc9bf", new Object[]{this}) : new long[]{Runtime.getRuntime().maxMemory() >> 10, (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 10};
    }

    public long[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("85733c5", new Object[]{this}) : new long[]{Debug.getNativeHeapSize() >> 10, (Debug.getNativeHeapAllocatedSize() - Debug.getNativeHeapFreeSize()) >> 10};
    }

    public int[] d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("d40e771a", new Object[]{this, context});
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return new int[]{activityManager.getMemoryClass(), activityManager.getLargeMemoryClass()};
    }

    public long[] f(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("604db449", new Object[]{this, context, new Integer(i)});
        }
        long[] jArr = new long[3];
        try {
            if (i >= 0) {
                Debug.MemoryInfo memoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{i})[0];
                jArr[0] = memoryInfo.dalvikPss;
                jArr[1] = memoryInfo.nativePss;
                jArr[2] = memoryInfo.getTotalPss();
            } else {
                jArr[0] = 0;
                jArr[1] = 0;
                jArr[2] = 0;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jArr;
    }

    public final long[] e() {
        long[] jArr = new long[4];
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", String.class, String[].class, long[].class);
            long[] jArr2 = {30, -30};
            Object[] objArr = {"/proc/meminfo", new String[]{"MemTotal:", "MemFree:", "Buffers:", "Cached:"}, jArr2};
            if (method != null) {
                method.invoke(null, objArr);
                for (int i = 0; i < 4; i++) {
                    jArr[i] = jArr2[i];
                }
            }
            return jArr;
        } catch (Exception e) {
            e.printStackTrace();
            return jArr;
        }
    }
}
