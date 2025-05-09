package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class h3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Class<?> A;
    public final boolean B;
    public final boolean C;
    public final boolean D;

    /* renamed from: a  reason: collision with root package name */
    public final String f20395a;
    public final String b;
    public final Map<String, String> c;
    public final l3o d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    @Deprecated
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final Object r;
    public final String s;
    public String t;
    public Map<String, String> u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean A;
        public Class<?> B;

        /* renamed from: a  reason: collision with root package name */
        public String f20396a;
        public String b;
        public Map<String, String> c;
        public l3o d;
        public String e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        @Deprecated
        public int k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public int q;
        public Object r;
        public String s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public boolean z;

        static {
            t2o.a(589300028);
        }

        public b A(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6da5b7ac", new Object[]{this, str});
            }
            if (str != null) {
                this.f20396a = str;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ea3712e1", new Object[]{this, str});
            }
            this.s = str;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("977cfafd", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1614d726", new Object[]{this, str});
            }
            this.p = str;
            return this;
        }

        @Deprecated
        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9ceb241e", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cb5573ed", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1ab305f", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public h3o g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h3o) ipChange.ipc$dispatch("c5d703ce", new Object[]{this});
            }
            if (this.f20396a != null) {
                return new h3o(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b h(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7bd74a6e", new Object[]{this, cls});
            }
            this.B = cls;
            return this;
        }

        public b i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3a639e27", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.f = i;
            }
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2de46c83", new Object[]{this, new Boolean(z)});
            }
            this.z = z;
            return this;
        }

        public b k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("20b1ccfd", new Object[]{this, new Integer(i)});
            }
            this.q = i;
            return this;
        }

        public b l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("87dbcc94", new Object[]{this, new Boolean(z)});
            }
            this.A = z;
            return this;
        }

        public b m(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("99494094", new Object[]{this, map});
            }
            if (map != null) {
                this.c = map;
            }
            return this;
        }

        public b n(String str, l3o l3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("80eff38f", new Object[]{this, str, l3oVar});
            }
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (l3oVar != null || !xvj.c(str)) {
                this.b = str;
                this.d = l3oVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f4a27e0b", new Object[]{this, str});
            }
            this.n = str;
            return this;
        }

        public b p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("977e75fb", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.g = i;
            }
            return this;
        }

        public b q(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f6e856d8", new Object[]{this, obj});
            }
            this.r = obj;
            return this;
        }

        public b r(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("705ecc0e", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public b s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5092dc3b", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a32f3f43", new Object[]{this, new Boolean(z)});
            }
            this.t = z;
            return this;
        }

        public b u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3bf25f62", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public b v(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8c7b544", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            if (i2 > 0) {
                this.h = i;
            }
            if (i2 > 0) {
                this.i = i2;
            }
            return this;
        }

        public b w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("924359d6", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public b x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("def0fe77", new Object[]{this, new Boolean(z)});
            }
            this.u = z;
            return this;
        }

        public b y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c1afa42d", new Object[]{this, new Boolean(z)});
            }
            this.v = z;
            return this;
        }

        public b z(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6845657c", new Object[]{this, new Boolean(z)});
            }
            this.y = z;
            return this;
        }

        public b() {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.t = true;
            this.u = false;
            this.v = false;
            this.b = "GET";
            this.c = new HashMap();
        }

        public b(h3o h3oVar) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.t = true;
            this.u = false;
            this.v = false;
            this.f20396a = h3oVar.f20395a;
            this.b = h3oVar.b;
            this.d = h3oVar.d;
            this.c = new HashMap(h3oVar.c);
            this.e = h3oVar.e;
            this.f = h3oVar.f;
            this.g = h3oVar.g;
            this.j = h3oVar.j;
            this.k = h3oVar.k;
            this.l = h3oVar.l;
            this.m = h3oVar.m;
            this.n = h3oVar.o;
            this.o = h3oVar.n;
            this.p = h3oVar.p;
            this.r = h3oVar.r;
            this.s = h3oVar.s;
            this.t = h3oVar.v;
            this.u = h3oVar.w;
            this.w = h3oVar.y;
            this.x = h3oVar.z;
            this.B = h3oVar.A;
            this.h = h3oVar.h;
            this.i = h3oVar.i;
            this.y = h3oVar.B;
            this.z = h3oVar.C;
        }
    }

    static {
        t2o.a(589300026);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8099702", new Object[]{this, str});
        }
        return this.c.get(str);
    }

    public b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd0dbf4a", new Object[]{this});
        }
        return new b();
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821380aa", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.c.put(str, str2);
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Request{ url=");
        sb.append(this.f20395a);
        sb.append(", method=");
        sb.append(this.b);
        sb.append(", appKey=");
        sb.append(this.n);
        sb.append(", authCode=");
        sb.append(this.p);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", seqNo=");
        sb.append(this.e);
        sb.append(", connectTimeoutMills=");
        sb.append(this.f);
        sb.append(", readTimeoutMills=");
        sb.append(this.g);
        sb.append(", retryTimes=");
        sb.append(this.j);
        sb.append(", bizId=");
        if (!TextUtils.isEmpty(this.l)) {
            str = this.l;
        } else {
            str = String.valueOf(this.k);
        }
        sb.append(str);
        sb.append(", bizTopic=");
        sb.append(this.m);
        sb.append(", pTraceId=");
        sb.append(this.o);
        sb.append(", env=");
        sb.append(this.q);
        sb.append(", reqContext=");
        sb.append(this.r);
        sb.append(", api=");
        sb.append(this.s);
        sb.append("}");
        return sb.toString();
    }

    public h3o(b bVar) {
        this.f20395a = bVar.f20396a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.o = bVar.n;
        this.n = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.v = bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.B;
        this.h = bVar.h;
        this.i = bVar.i;
        this.B = bVar.y;
        this.C = bVar.z;
        this.D = bVar.A;
    }
}
