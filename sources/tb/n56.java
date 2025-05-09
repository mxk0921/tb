package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.TemplateView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n56 extends nu<TemplateView, o56> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEMPLATE_TEMPLATE = -2672413305820574652L;

    static {
        t2o.a(444596466);
    }

    public static /* synthetic */ Object ipc$super(n56 n56Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/widget/DXNanoTemplateComponentDesc");
    }

    @Override // tb.nu
    public lrb c(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrb) ipChange.ipc$dispatch("bf1820b2", new Object[]{this, tn6Var});
        }
        return null;
    }

    @Override // tb.nu
    public wij d(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wij) ipChange.ipc$dispatch("83bb1c71", new Object[]{this, tn6Var});
        }
        return new vn6(tn6Var);
    }

    @Override // tb.nu
    public void h(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98922cf0", new Object[]{this, tn6Var});
        }
    }

    @Override // tb.nu
    public void i(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ebac0", new Object[]{this, tn6Var});
        }
    }

    public final DXTemplateItem m(o56 o56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("5ecec400", new Object[]{this, o56Var});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = o56Var.f25147a;
        try {
            dXTemplateItem.b = Long.parseLong(o56Var.c);
        } catch (NumberFormatException unused) {
            dXTemplateItem.b = -1L;
        }
        dXTemplateItem.c = o56Var.b;
        dXTemplateItem.g = true;
        return dXTemplateItem;
    }

    /* renamed from: n */
    public o56 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o56) ipChange.ipc$dispatch("154c06dd", new Object[]{this});
        }
        return new o56();
    }

    /* renamed from: o */
    public TemplateView f(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateView) ipChange.ipc$dispatch("d98c3c42", new Object[]{this, tn6Var});
        }
        return new TemplateView(tn6Var.a());
    }

    /* renamed from: p */
    public void l(tn6 tn6Var, TemplateView templateView, o56 o56Var, o56 o56Var2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b3e033", new Object[]{this, tn6Var, templateView, o56Var, o56Var2});
        } else if (o56Var2.m() == 2) {
            templateView.setOrientation(o56Var2.k);
        } else if (o56Var2.m() == 3) {
            DXRuntimeContext dXRuntimeContext = tn6Var.i().getDXRuntimeContext();
            Object O = dXRuntimeContext.O();
            if (O instanceof JSONObject) {
                jSONObject = (JSONObject) O;
            } else {
                jSONObject = dXRuntimeContext.i();
            }
            templateView.shareDXEngine(dXRuntimeContext.r());
            templateView.setData(m(o56Var2), jSONObject, dXRuntimeContext.S(), tn6Var.i());
        }
    }
}
