package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxcontainerview.DXContainerView;
import java.util.HashMap;
import tb.n9;
import tb.p4r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class h38<PARAMS extends p4r, CONTEXT extends n9> extends ActivityLifeCycleCbRender<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DXContainerView f;
    public CONTEXT g;
    public int h;
    public int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements jh5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ iab b;
        public final /* synthetic */ Context c;

        public a(String str, p4r p4rVar, iab iabVar, Context context) {
            this.b = iabVar;
            this.c = context;
        }

        @Override // tb.jh5
        public void b(String str, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
                return;
            }
            iab iabVar = this.b;
            iabVar.a(new a8(90001, str + "|DxError=" + fVar), new PopErrorView(this.c, h38.g(h38.this)));
        }

        @Override // tb.jh5
        public void c(DXRootView dXRootView) {
            DXContainerView f;
            DinamicXEngine dinamicXEngine;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecdbf3d8", new Object[]{this, dXRootView});
            } else if (dXRootView != null && (f = h38.f(h38.this)) != null && (dinamicXEngine = f.getDinamicXEngine()) != null) {
                dinamicXEngine.t0(dXRootView);
            }
        }
    }

    static {
        t2o.a(786432069);
    }

    public static final /* synthetic */ DXContainerView f(h38 h38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXContainerView) ipChange.ipc$dispatch("7ea8cf11", new Object[]{h38Var});
        }
        return h38Var.f;
    }

    public static final /* synthetic */ h9 g(h38 h38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("fe016bed", new Object[]{h38Var});
        }
        return h38Var.c;
    }

    public static /* synthetic */ Object ipc$super(h38 h38Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/pop/DxRender");
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void e(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cc3545", new Object[]{this, str, bundle});
        } else {
            ckf.g(str, "eventType");
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
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        ckf.g(view, "contentView");
        return false;
    }

    /* renamed from: o */
    public void c(CONTEXT context, PARAMS params, View view, iab iabVar) {
        String str;
        DinamicXEngine dinamicXEngine;
        String str2;
        zq g;
        av5 s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe017a", new Object[]{this, context, params, view, iabVar});
            return;
        }
        ckf.g(context, "abilityRtCtx");
        ckf.g(params, "params");
        ckf.g(iabVar, "callback");
        Context d = context.d();
        this.g = context;
        Boolean bool = null;
        if (d == null) {
            iabVar.a(new a8(90001, "DxPopNoAppCtx"), null);
            return;
        }
        if (TextUtils.isEmpty(params.f)) {
            str = q4r.BIZ_STD_DX_POP;
        } else {
            str = params.f;
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
        this.f = new DXContainerView(d, dinamicXEngine, str, params.e, params.g, false);
        String str3 = params.j;
        if (str3 == null) {
            y7 a3 = context.a();
            str3 = (a3 == null || (g = a3.g()) == null) ? null : g.getNamespace();
        }
        String str4 = str3 != null ? str3 : "AbilityKit";
        DXContainerView dXContainerView = this.f;
        if (dXContainerView != null) {
            DinamicXEngine dinamicXEngine3 = dXContainerView.getDinamicXEngine();
            if (dinamicXEngine3 != null) {
                dht.a(str4, dinamicXEngine3);
            }
            HashMap hashMap = new HashMap();
            p18 p18Var = params.l;
            if (p18Var != null) {
                bool = Boolean.valueOf(p18Var.a());
            }
            if (bool.booleanValue()) {
                str2 = "downloadFirst";
            } else {
                str2 = "renderFirst";
            }
            hashMap.put(x96.REFRESH_TYPE, str2);
            xhv xhvVar = xhv.INSTANCE;
            dXContainerView.setExtraParams(hashMap);
            dXContainerView.setDXContainerViewRenderListener(new a(str4, params, iabVar, d));
            dXContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            iabVar.onRenderSuccess(dXContainerView);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        DXRuntimeContext p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i != this.h || i2 != this.i) {
            this.h = i;
            this.i = i2;
            DXRenderOptions.b t = new DXRenderOptions.b().G(DXWidgetNode.DXMeasureSpec.c(i, 1073741824)).t(DXWidgetNode.DXMeasureSpec.c(this.i, 1073741824));
            CONTEXT context = this.g;
            fl6 fl6Var = null;
            if (!(context instanceof tk6)) {
                context = null;
            }
            tk6 tk6Var = (tk6) context;
            if (!(tk6Var == null || (p = tk6Var.p()) == null)) {
                fl6Var = p.S();
            }
            DXRenderOptions q = t.E(fl6Var).q();
            DXContainerView dXContainerView = this.f;
            if (dXContainerView != null) {
                h9 h9Var = this.c;
                ckf.d(h9Var);
                dXContainerView.renderDXRootView(h9Var.g, q);
            }
        }
    }
}
