package tb;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cvh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static long f17352a = -1;
    public static long b = -1;
    public static long c = -1;
    public static long d = -1;
    public static long e = -1;

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("610acfac", new Object[]{new Long(j)})).longValue();
        }
        return (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcd29fb5", new Object[0])).longValue();
        }
        return SystemClock.elapsedRealtime();
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b6f80c2", new Object[0])).longValue();
        }
        long j = e;
        if (j > 0) {
            return j;
        }
        long j2 = nca.l;
        if (j2 > 0) {
            e = a(j2);
        }
        return e;
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8bfc3b2", new Object[0])).longValue();
        }
        long j = d;
        if (j > 0) {
            return j;
        }
        long j2 = nca.j;
        if (j2 > 0) {
            d = a(j2);
        }
        return d;
    }

    public static long e() {
        long j;
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        try {
            long j2 = nca.i;
            if (j2 > 0) {
                return j2;
            }
            long j3 = f17352a;
            if (j3 > 0) {
                return j3;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                startUptimeMillis = Process.getStartUptimeMillis();
                f17352a = startUptimeMillis;
            } else {
                long a2 = xym.a();
                if (a2 != SystemClock.uptimeMillis()) {
                    j = System.currentTimeMillis() - a2;
                } else {
                    j = Process.getElapsedCpuTime();
                }
                f17352a = SystemClock.uptimeMillis() - j;
            }
            return f17352a;
        } catch (Throwable unused) {
            return SystemClock.uptimeMillis();
        }
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("532f1bc0", new Object[0])).longValue();
        }
        long j = b;
        if (j > 0) {
            return j;
        }
        if (nca.i > 0) {
            long a2 = a(e());
            b = a2;
            return a2;
        }
        long j2 = c;
        if (j2 > 0) {
            return j2;
        }
        long a3 = a(e());
        c = a3;
        return a3;
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("395b4894", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }
}
