package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.MtopRequest;
import tb.z2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class a3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final MtopRequest f15529a;
    public final MtopBusiness b;
    public dxl c;
    public int d;
    public String e;
    public Boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final a3o a(MtopRequest mtopRequest, MtopBusiness mtopBusiness) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a3o) ipChange.ipc$dispatch("fea25e15", new Object[]{this, mtopRequest, mtopBusiness});
            }
            ckf.g(mtopRequest, "mtopRequest");
            ckf.g(mtopBusiness, "mtopBusiness");
            return new a3o(mtopRequest, mtopBusiness, null, 0, null, null, 60, null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public a3o(MtopRequest mtopRequest, MtopBusiness mtopBusiness, dxl dxlVar, int i, String str, Boolean bool) {
        ckf.g(mtopRequest, "mtopRequest");
        ckf.g(mtopBusiness, "mtopBusiness");
        ckf.g(dxlVar, "performance");
        ckf.g(str, z2k.d.ATTACHED_RESPONSE_HEADER_REQ_ID);
        this.f15529a = mtopRequest;
        this.b = mtopBusiness;
        this.c = dxlVar;
        this.d = i;
        this.e = str;
        this.f = bool;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8066943", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final Boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("eff661bd", new Object[]{this});
        }
        return this.f;
    }

    public final MtopBusiness c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("7f3ef02f", new Object[]{this});
        }
        return this.b;
    }

    public final MtopRequest d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        return this.f15529a;
    }

    public final dxl e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxl) ipChange.ipc$dispatch("45c9a3e8", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a3o) {
                a3o a3oVar = (a3o) obj;
                if (!ckf.b(this.f15529a, a3oVar.f15529a) || !ckf.b(this.b, a3oVar.b) || !ckf.b(this.c, a3oVar.c) || this.d != a3oVar.d || !ckf.b(this.e, a3oVar.e) || !ckf.b(this.f, a3oVar.f)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1604a36", new Object[]{this});
        }
        return this.e;
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0acfbf", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void h(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b0481", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        MtopRequest mtopRequest = this.f15529a;
        if (mtopRequest != null) {
            i = mtopRequest.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        MtopBusiness mtopBusiness = this.b;
        if (mtopBusiness != null) {
            i2 = mtopBusiness.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        dxl dxlVar = this.c;
        if (dxlVar != null) {
            i3 = dxlVar.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (((i7 + i3) * 31) + this.d) * 31;
        String str = this.e;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Boolean bool = this.f;
        if (bool != null) {
            i5 = bool.hashCode();
        }
        return i9 + i5;
    }

    public final void i(dxl dxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd9e368", new Object[]{this, dxlVar});
            return;
        }
        ckf.g(dxlVar, "<set-?>");
        this.c = dxlVar;
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7819268", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.e = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Request(mtopRequest=" + this.f15529a + ", mtopBusiness=" + this.b + ", performance=" + this.c + ", allTimeOutSeconds=" + this.d + ", reqId=" + this.e + ", disableJSONParse=" + this.f + f7l.BRACKET_END_STR;
    }

    public /* synthetic */ a3o(MtopRequest mtopRequest, MtopBusiness mtopBusiness, dxl dxlVar, int i, String str, Boolean bool, int i2, a07 a07Var) {
        this(mtopRequest, mtopBusiness, (i2 & 4) != 0 ? new dxl() : dxlVar, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? null : bool);
    }
}
