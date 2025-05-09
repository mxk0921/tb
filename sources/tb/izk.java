package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class izk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double c;

    /* renamed from: a  reason: collision with root package name */
    public long f21663a = 0;
    public long b = 0;
    public long d = 0;

    static {
        t2o.a(1004536610);
    }

    public final double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("430f2070", new Object[]{this})).doubleValue();
        }
        return ((ju6.a() - this.f21663a) - this.c) - vu3.b.GEO_NOT_SUPPORT;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebfc9e1", new Object[]{this});
        } else {
            this.b = ju6.a();
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfea63f0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.d = ju6.a();
        }
    }

    public final void d() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d98b050", new Object[]{this});
            return;
        }
        long a2 = ju6.a();
        if (this.b >= vu3.b.GEO_NOT_SUPPORT) {
            this.c += a2 - j;
        }
        this.b = 0L;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee65524d", new Object[]{this});
        } else {
            this.f21663a = ju6.a();
        }
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6b13794", new Object[]{this})).longValue();
        }
        long a2 = ju6.a();
        long j = this.d;
        if (j <= 0) {
            return 0L;
        }
        return a2 - j;
    }
}
