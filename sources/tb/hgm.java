package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hgm implements IContainerService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f20629a;

    static {
        t2o.a(491782605);
        t2o.a(488636647);
    }

    public hgm(e3b e3bVar) {
        this.f20629a = e3bVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
        } else if (iUiRefreshActionModel != null && TextUtils.equals(iUiRefreshActionModel.getUiOperationType(), "uiRefresh")) {
            boolean isEmpty = TextUtils.isEmpty(iUiRefreshActionModel.getErrorCode());
            boolean equals = TextUtils.equals("remote", iUiRefreshActionModel.getDataSourceType());
            if (!equals || !isEmpty) {
                vfm.f("PopOnUiRefreshListener ", "ui refresh error, isRemote=" + equals + ", success=" + isEmpty);
                return;
            }
            IContainerDataModel containerModel = iUiRefreshActionModel.getContainerModel();
            if (containerModel == null) {
                vfm.f("PopOnUiRefreshListener ", "ui refresh error, dataModel is null");
                return;
            }
            IContainerInnerDataModel base = containerModel.getBase();
            if (base == null || base.getPageParams() == null) {
                vfm.f("PopOnUiRefreshListener ", "ui refresh error, base is null or pageParams is null");
                return;
            }
            boolean equals2 = TextUtils.equals(iUiRefreshActionModel.getDataChangeType(), "base");
            if (TextUtils.equals("coldStart", iUiRefreshActionModel.getRequestType()) || base.getPageParams().getPageNum() == 0) {
                z = true;
            }
            if (vfm.a() && z) {
                z = !TextUtils.equals(iUiRefreshActionModel.getRequestType(), "scrollNextPage");
            }
            if (!equals2 || z) {
                ArrayList arrayList = new ArrayList();
                if (equals2 && base.getPopData() != null) {
                    arrayList.addAll(base.getPopData());
                }
                IContainerInnerDataModel delta = containerModel.getDelta();
                if (!(delta == null || delta.getPopData() == null)) {
                    arrayList.addAll(delta.getPopData());
                }
                this.f20629a.j().k(equals2, iUiRefreshActionModel.getRequestType(), arrayList);
                return;
            }
            vfm.f("PopOnUiRefreshListener ", "ui refresh error, not firstPage base refresh");
        }
    }
}
