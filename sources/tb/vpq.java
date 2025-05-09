package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30159a;
    public boolean b;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4260e5c", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e66575", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd28bf1b", new Object[]{this});
        }
        return this.f30159a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a53771c4", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e32c8edd", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8863ec4", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c420414c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2dfd168", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb38a6f", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9216f923", new Object[]{this, str});
        } else {
            this.f30159a = str;
        }
    }

    public void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fa3d68", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe2f66f", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }
}
