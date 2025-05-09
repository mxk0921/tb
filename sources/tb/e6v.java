package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e6v implements IContainerService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782539);
        t2o.a(488636647);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        String requestType = iUiRefreshActionModel.getRequestType();
        String containerId = iUiRefreshActionModel.getContainerId();
        String d = d(requestType, iUiRefreshActionModel.getDataSourceType());
        rca.e(c(d), true, d, containerId);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        String requestType = iUiRefreshActionModel.getRequestType();
        String containerId = iUiRefreshActionModel.getContainerId();
        String d = d(requestType, iUiRefreshActionModel.getDataSourceType());
        rca.f(c(d), d, containerId);
        if (TextUtils.equals(requestType, "coldStart")) {
            rca.c(containerId, "homeUiRefresh", 1);
        }
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e94b91d6", new Object[]{this, str});
        }
        return str + "SubContainerUiRefresh";
    }

    public final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0a23ee5", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (TextUtils.equals(str2, "local")) {
            return s0j.MTS_SUB_STAGE_LOAD_CACHE;
        }
        return "coldStart";
    }
}
