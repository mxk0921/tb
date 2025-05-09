package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.RequestType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21778a;
    public final String b;
    public final Map<String, Object> c;
    public final Map<String, Object> d;
    public final boolean e;
    public final boolean f;
    public final RequestType g;
    public final int h;
    public final boolean i;
    public final int j;
    public final String k;
    public final int l;
    public final String m;
    public final boolean n;
    public final long o;
    public final boolean p;
    public final String q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean c;
        public int d;
        public boolean e;
        public boolean g;
        public Map<String, String> h;
        public String i;
        public final String j;

        /* renamed from: a  reason: collision with root package name */
        public String f21779a = "1.0";
        public RequestType b = RequestType.GET;
        public final long f = 10000;

        static {
            t2o.a(919601179);
        }

        public a(String str) {
            ckf.g(str, "api");
            this.j = str;
        }

        public final j5o a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j5o) ipChange.ipc$dispatch("de67b4df", new Object[]{this});
            }
            return new j5o(this.j, this.f21779a, this.h, null, false, false, this.b, 0, this.c, this.d, null, 0, null, this.e, this.f, this.g, this.i);
        }

        public final a b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7801decb", new Object[]{this, map});
            }
            ckf.g(map, "data");
            this.h = map;
            return this;
        }

        public final a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("20244c06", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public final a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9eb337a9", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public final a e(RequestType requestType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c6ccaa5", new Object[]{this, requestType});
            }
            ckf.g(requestType, "requestType");
            this.b = requestType;
            return this;
        }

        public final a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a5e178c", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public final a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c86dbeee", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public final a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8e328318", new Object[]{this, str});
            }
            ckf.g(str, "v");
            this.f21779a = str;
            return this;
        }

        public final a i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d442bf7c", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }
    }

    static {
        t2o.a(919601178);
    }

    public j5o(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, boolean z, boolean z2, RequestType requestType, int i, boolean z3, int i2, String str3, int i3, String str4, boolean z4, long j, boolean z5, String str5) {
        ckf.g(str, "api");
        ckf.g(requestType, "requestType");
        this.f21778a = str;
        this.b = str2;
        this.c = map;
        this.d = map2;
        this.e = z;
        this.f = z2;
        this.g = requestType;
        this.h = i;
        this.i = z3;
        this.j = i2;
        this.k = str3;
        this.l = i3;
        this.m = str4;
        this.n = z4;
        this.o = j;
        this.p = z5;
        this.q = str5;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.f21778a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.k;
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this});
        }
        return this.q;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a9eb0a7", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof j5o) {
                j5o j5oVar = (j5o) obj;
                if (!(ckf.b(this.f21778a, j5oVar.f21778a) && ckf.b(this.b, j5oVar.b) && ckf.b(this.c, j5oVar.c) && ckf.b(this.d, j5oVar.d) && this.e == j5oVar.e && this.f == j5oVar.f && ckf.b(this.g, j5oVar.g) && this.h == j5oVar.h && this.i == j5oVar.i && this.j == j5oVar.j && ckf.b(this.k, j5oVar.k) && this.l == j5oVar.l && ckf.b(this.m, j5oVar.m) && this.n == j5oVar.n && this.o == j5oVar.o && this.p == j5oVar.p && ckf.b(this.q, j5oVar.q))) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.d;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a40a375", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("913ddec7", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f21778a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        Map<String, Object> map2 = this.d;
        if (map2 != null) {
            i4 = map2.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i14 = z ? 1 : 0;
        int i15 = z ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z2 = this.f;
        if (z2) {
            z2 = true;
        }
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = (i16 + i17) * 31;
        RequestType requestType = this.g;
        if (requestType != null) {
            i5 = requestType.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (((i19 + i5) * 31) + this.h) * 31;
        boolean z3 = this.i;
        if (z3) {
            z3 = true;
        }
        int i21 = z3 ? 1 : 0;
        int i22 = z3 ? 1 : 0;
        int i23 = (((i20 + i21) * 31) + this.j) * 31;
        String str3 = this.k;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (((i23 + i6) * 31) + this.l) * 31;
        String str4 = this.m;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 31;
        boolean z4 = this.n;
        if (z4) {
            z4 = true;
        }
        int i26 = z4 ? 1 : 0;
        int i27 = z4 ? 1 : 0;
        int a2 = (((i25 + i26) * 31) + en9.a(this.o)) * 31;
        boolean z5 = this.p;
        if (!z5) {
            i9 = z5 ? 1 : 0;
        }
        int i28 = (a2 + i9) * 31;
        String str5 = this.q;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i28 + i8;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23a8c578", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30ac38f", new Object[]{this})).longValue();
        }
        return this.o;
    }

    public final RequestType k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("f7ff2806", new Object[]{this});
        }
        return this.g;
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1bc1805", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.m;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("527e0bf3", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1b78cbd", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this});
        }
        return this.b;
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf1c6be1", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RequestParams(api=" + this.f21778a + ", v=" + this.b + ", data=" + this.c + ", headers=" + this.d + ", ecode=" + this.e + ", needSession=" + this.f + ", requestType=" + this.g + ", timeOut=" + this.h + ", useWua=" + this.i + ", wuaType=" + this.j + ", bizId=" + this.k + ", pageIndex=" + this.l + ", topic=" + this.m + ", prefetch=" + this.n + ", prefetchTimeOut=" + this.o + ", usePrefetch=" + this.p + ", dataType=" + this.q + f7l.BRACKET_END_STR;
    }
}
