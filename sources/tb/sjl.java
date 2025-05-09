package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class sjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sjl empty = new sjl();

    /* renamed from: a  reason: collision with root package name */
    public String f28091a;
    public int b;
    public int c;
    public int d;
    public long e;
    public String f;
    public boolean g = false;
    public int h = -1;

    static {
        t2o.a(628097222);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea1b0ec7", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71e423f4", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5420cd", new Object[]{this});
        }
        return this.f;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("892f956c", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf030d0d", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec97f168", new Object[]{this});
        }
        return this.f28091a;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63747c0c", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b529970e", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9039bb", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public sjl j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjl) ipChange.ipc$dispatch("32d373b7", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        return this;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffecaa42", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93198049", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public sjl m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjl) ipChange.ipc$dispatch("c393e6d7", new Object[]{this, new Integer(i)});
        }
        this.d = i;
        return this;
    }

    public sjl n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjl) ipChange.ipc$dispatch("5af2cdbe", new Object[]{this, new Integer(i)});
        }
        this.b = i;
        return this;
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3143960e", new Object[]{this, str});
        } else {
            this.f28091a = str;
        }
    }

    public sjl p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjl) ipChange.ipc$dispatch("88f00d9", new Object[]{this, new Long(j)});
        }
        this.e = j;
        return this;
    }
}
