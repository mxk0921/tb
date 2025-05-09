package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qqa extends v12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539324);
    }

    public qqa(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(qqa qqaVar, String str, Object... objArr) {
        if (str.hashCode() == -1396630579) {
            super.r((BaseSectionModel) objArr[0], (BaseSubItemModel) objArr[1], (View) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/event/dx/tap/HTap");
    }

    @Override // tb.v12
    public void p(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2db99c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        fve.f("HTap", "首页点击无记录");
        s();
    }

    @Override // tb.v12
    public void r(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc11bcd", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        super.r(baseSectionModel, baseSubItemModel, view);
        u4b.h(baseSubItemModel);
        u4b.b(baseSubItemModel);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf6534a", new Object[]{this});
            return;
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) h().a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService != null) {
            iSmartBackRefreshService.setDirectClickInInfoFlow(true);
        }
    }
}
