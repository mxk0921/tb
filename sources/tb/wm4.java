package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wm4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30775a;
    public final i69 b;
    public final k69 c;

    static {
        t2o.a(486539614);
    }

    public wm4(cfc cfcVar) {
        this.f30775a = cfcVar;
        this.b = new i69(cfcVar);
        this.c = new k69(cfcVar);
    }

    public final void a(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79871cdf", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        } else {
            this.b.g(iContainerDataModel, iUiRefreshActionModel);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
        } else {
            this.c.b();
        }
    }

    public void d(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19df0ab", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        } else {
            e(iContainerDataModel, iUiRefreshActionModel);
        }
    }

    public final void e(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde18a8c", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        } else if ("scrollToTop".equals(iUiRefreshActionModel.getUiOperationType())) {
            c();
        } else {
            a(iContainerDataModel, iUiRefreshActionModel);
            b(this.f30775a);
        }
    }

    public final void b(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd39f0cb", new Object[]{this, cfcVar});
            return;
        }
        String containerId = cfcVar.getContainerType().getContainerId();
        if (!f4b.b("refreshAfterDataProcess", true) || !TextUtils.equals(containerId, "newface_home_sub")) {
            IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
            if (iHostService == null) {
                fve.e("ContainerRefresher", "refreshFinish, hostService == null");
                return;
            }
            ged k = iHostService.getInvokeCallback().k();
            if (k == null) {
                fve.e("ContainerRefresher", "refreshFinish, pullDownRefreshCallback == null");
            } else {
                k.i();
            }
        }
    }
}
