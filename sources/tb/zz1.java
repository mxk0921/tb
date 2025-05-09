package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import tb.h9;
import tb.n9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class zz1<P extends h9, CONTEXT extends n9> implements IAKPopRender<P, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public tsd f33115a;
    public fee b;
    public h9 c;

    static {
        t2o.a(336593032);
        t2o.a(336593036);
    }

    /* renamed from: a */
    public void j(CONTEXT context, P p, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cea3496", new Object[]{this, context, p, view, iabVar});
            return;
        }
        ckf.g(context, "abilityRuntimeContext");
        ckf.g(p, "params");
        ckf.g(iabVar, "callback");
        this.c = p;
        Context d = context.d();
        fee feeVar = null;
        if (!(d instanceof tsd)) {
            d = null;
        }
        this.f33115a = (tsd) d;
        Context d2 = context.d();
        if (d2 instanceof fee) {
            feeVar = d2;
        }
        this.b = feeVar;
    }

    public final void b(tsd tsdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5db2ca", new Object[]{this, tsdVar});
        } else {
            this.f33115a = tsdVar;
        }
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
        e9 e9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        h9 h9Var = this.c;
        if (h9Var != null && (e9Var = h9Var.f20479a) != null && !e9Var.K()) {
            return;
        }
        if (ckf.b(str, IAKPopRender.LifecycleType.CHANGE_POSITION) || ckf.b(str, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
            tsd tsdVar = this.f33115a;
            if (tsdVar != null) {
                tsdVar.S0(jSONObject);
                return;
            }
            return;
        }
        tsd tsdVar2 = this.f33115a;
        if (tsdVar2 != null) {
            tsdVar2.G(str, jSONObject);
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
    public void h(String str, JSONObject jSONObject) {
        e9 e9Var;
        fee feeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "type");
        h9 h9Var = this.c;
        if (h9Var != null && (e9Var = h9Var.f20479a) != null && e9Var.L() && (feeVar = this.b) != null) {
            feeVar.h(str, jSONObject);
        }
    }
}
