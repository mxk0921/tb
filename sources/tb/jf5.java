package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jf5 implements rgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f21968a;
    public final zn7 c;
    public final wve d;

    static {
        t2o.a(486539493);
        t2o.a(488636659);
    }

    public jf5(cfc cfcVar, DinamicXEngine dinamicXEngine) {
        this.f21968a = cfcVar;
        wve wveVar = new wve(cfcVar, dinamicXEngine);
        this.d = wveVar;
        this.c = new zn7(cfcVar, dinamicXEngine, wveVar);
    }

    @Override // tb.rgc
    public void bindData(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        f94 a2 = uit.a(baseSectionModel.getTemplate());
        String d = a2.d();
        long currentTimeMillis = System.currentTimeMillis();
        InfoFlowDxUserContext infoFlowDxUserContext = new InfoFlowDxUserContext(this.f21968a, baseSectionModel);
        eve.c("InfoFlowDxRender", "bindData_" + d);
        if (a2.i()) {
            this.c.c(view, baseSectionModel, infoFlowDxUserContext);
        }
        eve.b("InfoFlowDxRender", "bindData_" + d);
        if (eue.b()) {
            fve.k("DXCardRender", "卡片 " + a2.d() + " bindData 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // tb.rgc
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        bqa.d("DXCardRender", "createView...viewType:" + i);
        f94 a2 = this.d.a(i);
        if (a2 == null) {
            return null;
        }
        String d = a2.d();
        long currentTimeMillis = System.currentTimeMillis();
        eve.c("InfoFlowDxRender", "createView_" + d);
        View d2 = d(viewGroup, a2, i);
        eve.b("InfoFlowDxRender", "createView_" + d);
        if (!eue.b()) {
            return d2;
        }
        fve.k("DXCardRender", "卡片 " + a2.d() + " createView 耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        return d2;
    }

    public final View d(ViewGroup viewGroup, f94 f94Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1a2b73f2", new Object[]{this, viewGroup, f94Var, new Integer(i)});
        }
        if (f94Var.i()) {
            return this.c.d(viewGroup.getContext(), viewGroup, f94Var.c(), i);
        }
        return new View(viewGroup.getContext());
    }

    @Override // tb.rgc
    public int getViewType(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        return this.d.d(baseSectionModel, baseSectionModel.getTemplate());
    }

    @Override // tb.rgc
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        int c = this.d.c(baseSectionModel.getTemplate());
        bqa.d("DXCardRender", "preRender...viewType:" + c + " , name:" + baseSectionModel.getSectionBizCode());
        f94 a2 = this.d.a(c);
        if (a2 != null && a2.i()) {
            this.c.l(context, a2.c(), baseSectionModel, z, i, new InfoFlowDxUserContext(this.f21968a, baseSectionModel));
        }
    }
}
