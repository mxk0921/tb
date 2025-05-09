package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.nanocompose.base.hostingview.NCHostingView;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import tb.epz;
import tb.k8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fpz<PARAMS extends epz, CONTEXT extends k8> implements IAKPopRender<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432105);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements eoz {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.eoz
        public final void a(TemplateItem templateItem, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2aad936", new Object[]{this, templateItem, new Boolean(z), str});
                return;
            }
            ckf.g(templateItem, "templateItem");
            iih iihVar = iih.INSTANCE;
            iihVar.b("TAKNanoComposePopRender", "nano template downloadCallback success:" + z + ", errorMsg:" + str);
        }
    }

    static {
        t2o.a(786432104);
        t2o.a(336593036);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
        } else {
            ckf.g(str, "type");
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "nano";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
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

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc9c903", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
        } else {
            ckf.g(str, "type");
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    /* renamed from: a */
    public void j(CONTEXT context, PARAMS params, View view, iab iabVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c470b8c7", new Object[]{this, context, params, view, iabVar});
            return;
        }
        ckf.g(context, "stdPopContext");
        ckf.g(params, "params");
        ckf.g(iabVar, "callback");
        Context d = context.d();
        Context context2 = null;
        if (d == null) {
            iabVar.a(new a8(90001, "DxPopNoAppCtx"), null);
            return;
        }
        eiz eizVar = eiz.INSTANCE;
        Context d2 = context.d();
        if (d2 != null) {
            context2 = d2.getApplicationContext();
        }
        if (context2 != null) {
            eizVar.b((Application) context2);
            if (TextUtils.isEmpty(params.f)) {
                str = q4r.BIZ_STD_DX_POP;
            } else {
                str = params.f;
                ckf.f(str, "params.bizId");
            }
            ciz a2 = ciz.Companion.a(new c6z(str));
            TemplateItem templateItem = new TemplateItem(params.l(), params.n(), params.m());
            NCHostingView b2 = a2.b(d);
            b2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            JSONObject jSONObject = params.g;
            ckf.f(jSONObject, "params.content");
            qhz qhzVar = new qhz(b2, templateItem, jSONObject);
            shz shzVar = new shz();
            shzVar.f(hrz.b((byte) 0));
            shzVar.e(drz.b((byte) 0));
            shzVar.d(b.INSTANCE);
            xhv xhvVar = xhv.INSTANCE;
            qhzVar.f(shzVar);
            a2.d(qhzVar);
            iabVar.onRenderSuccess(b2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }
}
