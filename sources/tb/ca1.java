package tb;

import android.app.ApplicationExitInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ca1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_ANR = 6;
    public static final int REASON_CRASH = 4;
    public static final int REASON_CRASH_NATIVE = 5;
    public static final int REASON_DEPENDENCY_DIED = 12;
    public static final int REASON_EXCESSIVE_RESOURCE_USAGE = 9;
    public static final int REASON_EXIT_SELF = 1;
    public static final int REASON_FREEZER = 14;
    public static final int REASON_INITIALIZATION_FAILURE = 7;
    public static final int REASON_LOW_MEMORY = 3;
    public static final int REASON_OTHER = 13;
    public static final int REASON_PERMISSION_CHANGE = 8;
    public static final int REASON_SIGNALED = 2;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_USER_REQUESTED = 10;
    public static final int REASON_USER_STOPPED = 11;
    public static final ca1 k = new ca1();

    /* renamed from: a  reason: collision with root package name */
    public final int f16934a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final String j;

    public ca1() {
    }

    public static int h(ApplicationExitInfo applicationExitInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8a09471", new Object[]{applicationExitInfo})).intValue();
        }
        try {
            return ((Integer) xva.a(r01.a(), applicationExitInfo, "mSubReason")).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("MetricKit.ApplicationExitCollectResult", "mSubReason get fail.", th);
            return -1;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
        }
        String str = this.h;
        return str == null ? "null" : str;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
        }
        return this.j;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b4ab44f", new Object[]{this})).intValue();
        }
        return this.f16934a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d2e8b15", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2ade1ff", new Object[]{this});
        }
        return k(this.c);
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96fb0197", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "timestamp=" + this.g + " pid=" + this.f16934a + " process=" + this.b + " reason=" + this.c + " (" + k(this.c) + ") subReason=" + i() + " status=" + this.d + " pss=" + this.e + " rss=" + this.f + " description=" + this.h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ca1(android.app.ApplicationExitInfo r14) {
        /*
            r13 = this;
            java.lang.String r1 = tb.x01.a(r14)
            long r2 = tb.t01.a(r14)
            int r4 = tb.v01.a(r14)
            int r5 = tb.o01.a(r14)
            int r6 = h(r14)
            int r7 = tb.u01.a(r14)
            java.lang.String r8 = tb.s01.a(r14)
            long r9 = tb.z01.a(r14)
            r0 = 10
            long r9 = r9 << r0
            long r11 = tb.a11.a(r14)
            long r11 = r11 << r0
            r0 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ca1.<init>(android.app.ApplicationExitInfo):void");
    }

    public static String k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("381c6ce1", new Object[]{new Integer(i)});
        }
        try {
            return (String) xva.c(r01.a(), "reasonCodeToString", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("MetricKit.ApplicationExitCollectResult", "reasonCodeToString fail.", th);
            return String.valueOf(i);
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31ccd1cb", new Object[]{this});
        }
        try {
            return (String) xva.c(r01.a(), "subreasonToString", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(this.i)});
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("MetricKit.ApplicationExitCollectResult", "subreasonToString fail.", th);
            return String.valueOf(this.i);
        }
    }

    public ca1(String str, long j, int i, int i2, int i3, int i4, String str2, long j2, long j3) {
        this.b = str;
        this.j = str;
        this.g = j;
        this.f16934a = i;
        this.c = i2;
        this.i = i3;
        this.d = i4;
        this.h = str2;
        this.e = j2;
        this.f = j3;
    }
}
