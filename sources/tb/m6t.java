package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m6t extends tjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ncc f;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public boolean t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ncc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f23813a;

        public a(m6t m6tVar, Map map) {
            this.f23813a = map;
        }

        @Override // tb.ncc
        public Map<String, String> getHeartParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
            }
            return this.f23813a;
        }
    }

    static {
        t2o.a(806356413);
    }

    public m6t(String str, boolean z, String str2, String str3, ncc nccVar) {
        super(str, z, str2, str3, null);
        this.f = nccVar;
    }

    public static /* synthetic */ Object ipc$super(m6t m6tVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/pm/TaoLivePMModel");
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f09e4", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1948dab8", new Object[]{this});
        }
        return this.o;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cabfede5", new Object[]{this});
        }
        return this.p;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d671a911", new Object[]{this});
        }
        return this.q;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d0cc7f7", new Object[]{this});
        }
        return this.r;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780e09bb", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6570dc", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a827f73b", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14cbff24", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b60f986", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("979ef67d", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1c32a7", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b5b881a", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39087dbc", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a9e3fa2", new Object[]{this, str});
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2663c5", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39134034", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5fa3045", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48fbb57c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf470ca", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68ac9bc", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44725e26", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2ccab3", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4425c9", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77def99", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f9a85", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720b3ec7", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public m6t(String str, boolean z, String str2, String str3, Map<String, String> map) {
        super(str, z, str2, str3, map);
        this.f = new a(this, map);
    }
}
