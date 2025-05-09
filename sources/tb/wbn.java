package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.infoflow.protocol.subservice.biz.IWindVaneService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wbn extends v12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final wz4 d = new wz4();

    static {
        t2o.a(486539325);
    }

    public wbn(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(wbn wbnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1396630579) {
            super.r((BaseSectionModel) objArr[0], (BaseSubItemModel) objArr[1], (View) objArr[2]);
            return null;
        } else if (hashCode == 1167917573) {
            super.k((BaseSectionModel) objArr[0], (BaseSubItemModel) objArr[1], (String) objArr[2], (View) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/core/event/dx/tap/RTap");
        }
    }

    @Override // tb.v12
    public void k(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459d0205", new Object[]{this, baseSectionModel, baseSubItemModel, str, view});
        } else if (this.d.d(h(), str, view)) {
            fve.e("RTap", "共享元素动画处理跳转");
        } else {
            super.k(baseSectionModel, baseSubItemModel, str, view);
        }
    }

    @Override // tb.v12
    public void p(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2db99c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
        } else if (view != null) {
            s(baseSubItemModel.getClickParam().getItemId());
            u(baseSectionModel, baseSubItemModel);
            t();
        }
    }

    @Override // tb.v12
    public void r(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc11bcd", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        super.r(baseSectionModel, baseSubItemModel, view);
        vve.l(h(), view, baseSectionModel, baseSubItemModel, null);
        hue.b(baseSectionModel, baseSubItemModel);
        due.b(baseSubItemModel.getClickParam());
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0cab2", new Object[]{this, str});
            return;
        }
        ICacheService iCacheService = (ICacheService) h().a(ICacheService.class);
        if (iCacheService == null) {
            fve.e("RTap", "cacheService == null");
        } else {
            iCacheService.getClickCache().a(str);
        }
    }

    public final void t() {
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

    public final void u(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711628ba", new Object[]{this, baseSectionModel, baseSubItemModel});
            return;
        }
        IWindVaneService iWindVaneService = (IWindVaneService) h().a(IWindVaneService.class);
        if (iWindVaneService != null) {
            iWindVaneService.updateWindVaneClick(baseSectionModel, baseSubItemModel);
        }
    }
}
