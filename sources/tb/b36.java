package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.industry.tbiunicontainer.core.component.DXLoadStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class b36 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(804257825);
    }

    public static final boolean a(DXTemplateItem dXTemplateItem, DXLoadStrategy dXLoadStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b675619", new Object[]{dXTemplateItem, dXLoadStrategy})).booleanValue();
        }
        ckf.g(dXLoadStrategy, "dxLoadStrategy");
        if (dXTemplateItem == null || dXLoadStrategy == DXLoadStrategy.DOUBLE_RENDER || dXLoadStrategy == DXLoadStrategy.TARGET_ONLY) {
            return true;
        }
        return false;
    }

    public static final void c(ua6 ua6Var, DXTemplateItem dXTemplateItem, c36 c36Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d9e6ba", new Object[]{ua6Var, dXTemplateItem, c36Var});
            return;
        }
        ckf.g(ua6Var, "renderConfig");
        ckf.g(dXTemplateItem, "templateItem");
        DXResult<DXRootView> o = ua6Var.c().o(ua6Var.a(), dXTemplateItem);
        DXRenderOptions.b bVar = new DXRenderOptions.b();
        Integer f = ua6Var.f();
        if (f != null) {
            bVar.G(f.intValue());
        }
        Integer d = ua6Var.d();
        if (d != null) {
            bVar.t(d.intValue());
        }
        DXResult<DXRootView> i1 = ua6Var.c().i1(ua6Var.a(), o.f7291a, dXTemplateItem, ua6Var.b(), -1, bVar.q());
        if (i1.f7291a != null) {
            if (i1.d() || i1.a() != null) {
                wfr wfrVar = wfr.INSTANCE;
                wfrVar.b("DXLoader", "load dx " + dXTemplateItem.f7343a + " has error : " + i1.a());
            }
            if (c36Var != null) {
                DXRootView dXRootView = i1.f7291a;
                ckf.f(dXRootView, "renderResult.result");
                c36Var.a(dXRootView);
            }
        } else if (c36Var != null) {
            f a2 = i1.a();
            ckf.f(a2, "renderResult.dxError");
            c36Var.c(dXTemplateItem, a2);
        }
    }

    public static final boolean b(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2, DXLoadStrategy dXLoadStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1345436", new Object[]{dXTemplateItem, dXTemplateItem2, dXLoadStrategy})).booleanValue();
        }
        ckf.g(dXTemplateItem2, "targetTemplate");
        ckf.g(dXLoadStrategy, "dxLoadStrategy");
        if (dXTemplateItem == null) {
            return false;
        }
        return dXTemplateItem.b == dXTemplateItem2.b || dXLoadStrategy == DXLoadStrategy.DOUBLE_RENDER || dXLoadStrategy == DXLoadStrategy.LOCAL_ONLY;
    }
}
