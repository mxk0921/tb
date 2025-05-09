package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.n9;
import tb.p4r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q4r<PARAMS extends p4r, CONTEXT extends n9> extends zz1<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_STD_DX_POP = "DxStdPop";
    public static final a Companion = new a(null);
    public DXRootView d;
    public CONTEXT e;
    public int f;
    public int g;
    public iab h;
    public c48 i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432075);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements k1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ iab b;
        public final /* synthetic */ Context c;

        public b(iab iabVar, Context context) {
            this.b = iabVar;
            this.c = context;
        }

        @Override // tb.k1c
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                return;
            }
            ckf.g(dXRootView, "dxRootView");
            q4r.this.f(dXRootView);
            iab d = q4r.this.d();
            ckf.d(d);
            d.onRenderSuccess(dXRootView);
        }

        @Override // tb.k1c
        public void b(String str, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
                return;
            }
            ckf.g(str, "msg");
            iab iabVar = this.b;
            iabVar.a(new a8(90001, str + "|DxError=" + fVar), new PopErrorView(this.c, q4r.c(q4r.this)));
        }
    }

    static {
        t2o.a(786432074);
    }

    public static final /* synthetic */ h9 c(q4r q4rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("e5352dc2", new Object[]{q4rVar});
        }
        return q4rVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(q4r q4rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1314487601) {
            super.n((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == 1558852758) {
            q4rVar.j((n9) objArr[0], (h9) objArr[1], (View) objArr[2], (iab) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbabilitykit/dx/pop/TAKDxPopRender");
        }
    }

    public final iab d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iab) ipChange.ipc$dispatch("7a09cf8b", new Object[]{this});
        }
        return this.h;
    }

    /* renamed from: e */
    public void j(CONTEXT context, PARAMS params, View view, iab iabVar) {
        DinamicXEngine dinamicXEngine;
        String str;
        zq g;
        av5 s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a666ce", new Object[]{this, context, params, view, iabVar});
            return;
        }
        ckf.g(context, "akCtx");
        ckf.g(params, "params");
        ckf.g(iabVar, "callback");
        j(context, params, view, iabVar);
        this.e = context;
        this.h = iabVar;
        Context d = context.d();
        String str2 = null;
        if (d == null) {
            iabVar.a(new a8(90001, "DxPopNoAppCtx"), null);
            return;
        }
        if (!params.l.c() || !(context instanceof tk6)) {
            dinamicXEngine = null;
        } else {
            DXRuntimeContext p = ((tk6) context).p();
            DinamicXEngine f = (p == null || (s = p.s()) == null) ? null : s.f();
            if (f == null) {
                q9 e = context.e();
                Object a2 = e != null ? e.a() : null;
                if (!(a2 instanceof DinamicXEngine)) {
                    a2 = null;
                }
                DinamicXEngine dinamicXEngine2 = (DinamicXEngine) a2;
                if (dinamicXEngine2 != null) {
                    dinamicXEngine = dinamicXEngine2;
                }
            }
            dinamicXEngine = f;
        }
        if (TextUtils.isEmpty(params.f)) {
            str = BIZ_STD_DX_POP;
        } else {
            str = params.f;
        }
        y7 a3 = context.a();
        String str3 = params.j;
        if (str3 != null) {
            str2 = str3;
        } else if (!(a3 == null || (g = a3.g()) == null)) {
            str2 = g.getNamespace();
        }
        String str4 = str2 != null ? str2 : "AbilityKit";
        p18 p18Var = params.l;
        ckf.f(p18Var, "params.dxConfig");
        ckf.f(str, "bizId");
        c48 c48Var = new c48(d, p18Var, str, str4, dinamicXEngine, a3);
        c48Var.g(new b(iabVar, d));
        dht.a(mii.NAME_SPACE_MEGA_DESIGN, c48Var.h());
        xhv xhvVar = xhv.INSTANCE;
        this.i = c48Var;
    }

    public final void f(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873ee3ee", new Object[]{this, dXRootView});
        } else {
            this.d = dXRootView;
        }
    }

    public final void g() {
        DXRootView dXRootView;
        CONTEXT context;
        Context context2;
        fl6 fl6Var;
        f fVar;
        DXRootView dXRootView2;
        DXRuntimeContext p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7efb38", new Object[]{this});
        } else if (this.i != null && (dXRootView = this.d) != null && (context = this.e) != null && this.c != null && dXRootView != null && this.f > 0 && this.g > 0) {
            if (context != null) {
                context2 = context.d();
            } else {
                context2 = null;
            }
            if (context2 != null) {
                DXRenderOptions.b t = new DXRenderOptions.b().G(DXWidgetNode.DXMeasureSpec.c(this.f, 1073741824)).t(DXWidgetNode.DXMeasureSpec.c(this.g, 1073741824));
                CONTEXT context3 = this.e;
                if (!(context3 instanceof tk6)) {
                    context3 = null;
                }
                tk6 tk6Var = (tk6) context3;
                if (tk6Var == null || (p = tk6Var.p()) == null) {
                    fl6Var = null;
                } else {
                    fl6Var = p.S();
                }
                DXRenderOptions q = t.E(fl6Var).q();
                c48 c48Var = this.i;
                ckf.d(c48Var);
                DinamicXEngine h = c48Var.h();
                DXRootView dXRootView3 = this.d;
                ckf.d(dXRootView3);
                DXTemplateItem dxTemplateItem = dXRootView3.getDxTemplateItem();
                h9 h9Var = this.c;
                ckf.d(h9Var);
                DXResult<DXRootView> i1 = h.i1(context2, dXRootView3, dxTemplateItem, h9Var.g, -1, q);
                if (i1 == null || i1.d() || (dXRootView2 = i1.f7291a) == null) {
                    iab iabVar = this.h;
                    if (iabVar != null) {
                        StringBuilder sb = new StringBuilder("DxRenderError|DxError=");
                        if (i1 != null) {
                            fVar = i1.a();
                        } else {
                            fVar = null;
                        }
                        sb.append(fVar);
                        iabVar.a(new a8(90001, sb.toString()), null);
                        return;
                    }
                    return;
                }
                this.d = dXRootView2;
                c48 c48Var2 = this.i;
                ckf.d(c48Var2);
                c48Var2.h().t0(i1.f7291a);
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "dx";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
            return;
        }
        c48 c48Var = this.i;
        if (c48Var != null) {
            c48Var.h().u0(this.d);
            c48Var.i();
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        ckf.g(view, "contentView");
        return false;
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        super.n(str, jSONObject);
        c48 c48Var = this.i;
        if (c48Var != null) {
            ckf.d(c48Var);
            c48Var.h().v().l(str, jSONObject);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f = i;
        this.g = i2;
        g();
    }
}
