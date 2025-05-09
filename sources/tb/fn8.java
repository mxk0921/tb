package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fn8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f19417a;
    public final long b;
    public final int c;
    public final int d;
    public boolean e = false;

    public fn8(int i, int i2, long j, long j2) {
        this.c = i;
        this.d = i2;
        this.f19417a = j;
        this.b = j2;
    }

    public static fn8 a(int i, int i2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("7aa4e7", new Object[]{new Integer(i), new Integer(i2), new Long(j), new Long(j2)});
        }
        return new fn8(i, i2, j, j2);
    }

    public static fn8 b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("4fd0a947", new Object[]{new Long(j), new Long(j2)});
        }
        return new fn8(1, 1, j, j2);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af392e40", new Object[]{this});
        }
        return "ExSum{s=" + this.f19417a + ",e=" + this.b + ",d=" + ptt.a(this.f19417a, this.b) + ",t=" + this.c + ",x=" + this.d + ",m=" + (this.e ? 1 : 0) + '}';
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExecutionSummary{startTime=" + this.f19417a + ", endTime=" + this.b + ", duration=" + ptt.a(this.f19417a, this.b) + ", total=" + this.c + ", executed=" + this.d + ", isMainThread=" + (this.e ? 1 : 0) + '}';
    }
}
