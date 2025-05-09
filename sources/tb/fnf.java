package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TITLE_BAR_COMMON = "common";
    public static final String TITLE_BAR_PLACEHOLDER = "placeholder";
    public static final String TITLE_TEXT = "text";

    /* renamed from: a  reason: collision with root package name */
    public String f19419a;
    public float b;
    public boolean i;
    public float l;
    public boolean c = true;
    public boolean d = true;
    public final boolean e = true;
    public boolean f = true;
    public String g = "common";
    public boolean h = true;
    public float j = 254.0f;
    public boolean k = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297120);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        @JvmStatic
        public final fnf a(IrpDatasource irpDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fnf) ipChange.ipc$dispatch("45b9a46", new Object[]{this, irpDatasource});
            }
            ckf.g(irpDatasource, "datasource");
            fnf fnfVar = new fnf();
            fnf.a(fnfVar, irpDatasource.A().get("UIMode"));
            if (irpDatasource.c0()) {
                fnfVar.q(false);
                fnfVar.r(false);
                fnfVar.t(false);
                fnfVar.p(false);
                fnfVar.z("text");
                fnfVar.v(0.0f);
                fnfVar.x("https://gw.alicdn.com/imgextra/i4/O1CN01bcKBsP24QqDxt5tlK_!!6000000007386-0-tps-750-1624.jpg");
                return fnfVar;
            } else if (fnfVar.m() || irpDatasource.b0()) {
                fnfVar.r(false);
                fnfVar.t(false);
                fnfVar.s(false);
                fnfVar.w(30.0f);
                fnfVar.y(true);
                fnfVar.u(195.0f);
                fnfVar.v(0.6f);
                fnfVar.p(true);
                return fnfVar;
            } else {
                if (irpDatasource.a0()) {
                    fnfVar.z("text");
                }
                if (irpDatasource.X()) {
                    fnfVar.p(false);
                    fnfVar.v(0.0f);
                    fnfVar.u(0.0f);
                    fnfVar.z("placeholder");
                }
                fnfVar.t(!Localization.o());
                return fnfVar;
            }
        }
    }

    static {
        t2o.a(481297119);
    }

    public static final /* synthetic */ void a(fnf fnfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b266adf", new Object[]{fnfVar, str});
        } else {
            fnfVar.f19419a = str;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2bfeb1", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f991c4b2", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb8182", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b6da7", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65085fd", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff087019", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2d1d641", new Object[]{this})).floatValue();
        }
        return this.j;
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a74e89a6", new Object[]{this})).floatValue();
        }
        return this.l;
    }

    public final float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("668a53ba", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d7d4cee", new Object[]{this});
        }
        return this.g;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3a97ec", new Object[]{this});
        }
        String str = this.f19419a;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d2773f", new Object[]{this})).booleanValue();
        }
        return ckf.b("listOnly", l());
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7590e09", new Object[]{this})).booleanValue();
        }
        if (this.l == 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c1965b9", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a420e23b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb8138a", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc12df05", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26048807", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b218f7d3", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a728119b", new Object[]{this, new Float(f)});
        } else {
            this.j = f;
        }
    }

    public final void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2626c3e", new Object[]{this, new Float(f)});
        } else {
            this.l = f;
        }
    }

    public final void w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec0f42", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f1f9f", new Object[]{this, str});
        } else {
            ckf.g(str, "<set-?>");
        }
    }

    public final void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a64d987", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cac548", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.g = str;
    }
}
