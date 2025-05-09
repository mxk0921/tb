package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a9;
import tb.n9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ij0<P extends a9, CONTEXT extends n9> extends zz1<P, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final View d;

    static {
        t2o.a(786432107);
    }

    public ij0(View view) {
        this.d = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ij0 ij0Var, String str, Object... objArr) {
        if (str.hashCode() == 1558852758) {
            ij0Var.j((n9) objArr[0], (h9) objArr[1], (View) objArr[2], (iab) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/nativeview/render/AkNativeViewRender");
    }

    /* renamed from: c */
    public void j(CONTEXT context, P p, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41b2806", new Object[]{this, context, p, view, iabVar});
            return;
        }
        ckf.g(context, "abilityRuntimeContext");
        ckf.g(p, "params");
        ckf.g(iabVar, "callback");
        j(context, p, view, iabVar);
        View view2 = this.d;
        if (view2 != null) {
            iabVar.onRenderSuccess(view2);
        } else {
            iabVar.a(new a8(10015, "nativeView is null"), null);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "view";
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
        if (view instanceof d9c) {
            return view.canScrollVertically(i);
        }
        return false;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }
}
