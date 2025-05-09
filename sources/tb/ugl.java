package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ugl implements IUiRefreshActionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f29359a;

    static {
        t2o.a(491782453);
        t2o.a(488636490);
    }

    public ugl(cfc cfcVar) {
        this.f29359a = cfcVar;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.f29359a.getContainerType().getContainerId();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public IContainerDataModel getContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("697d3f50", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f29359a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        return iContainerDataService.getContainerData();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataChangeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1799b5ef", new Object[]{this});
        }
        return "delta";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataSourceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("831c9fe4", new Object[]{this});
        }
        return "remote";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getRequestType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getUiOperationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c08da82", new Object[]{this});
        }
        return "uiRefresh";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public boolean isSecondReturn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73b38699", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
