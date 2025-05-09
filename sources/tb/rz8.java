package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rz8 implements qz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_STANDARD = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f27692a;
    public long b;
    public long c;
    public long d;
    public String e;

    public rz8(String str, int i) {
        this.f27692a = str;
    }

    @Override // tb.qz8
    public void a(Long l, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e59963", new Object[]{this, l, str});
            return;
        }
        long d = d(l);
        this.d = d;
        long j = this.b;
        long j2 = 0;
        if (d - j > 0) {
            j2 = d - j;
        }
        this.c = j2;
        this.e = str;
    }

    @Override // tb.qz8
    public void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f08e28", new Object[]{this, l});
        } else {
            this.b = d(l);
        }
    }

    @Override // tb.qz8
    public void c(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08253d9", new Object[]{this, l});
        } else {
            a(l, null);
        }
    }

    public final long d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3a6473e", new Object[]{this, l})).longValue();
        }
        if (l == null || l.longValue() <= 0) {
            return e();
        }
        return l.longValue();
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d139e2a0", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis();
    }

    @Override // tb.qz8
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return this.f27692a;
    }
}
