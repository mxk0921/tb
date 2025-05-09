package com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UiRefreshActionModel implements IUiRefreshActionModel, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_CHANGE_TYPE_BASE = "base";
    public static final String DATA_CHANGE_TYPE_DELTA = "delta";
    public static final String DATA_SOURCE_TYPE_DOWNLOAD = "download";
    public static final String DATA_SOURCE_TYPE_LOCAL = "local";
    public static final String DATA_SOURCE_TYPE_REMOTE = "remote";
    public static final String OPERATION_TYPE_SCROLL_TO_TOP = "scrollToTop";
    public static final String OPERATION_TYPE_UI_REFRESH = "uiRefresh";
    public String containerId;
    public IContainerDataModel containerModel;
    public String dataChangeType;
    public String dataSourceType;
    public String errorCode;
    public String errorMsg;
    public boolean isSecondReturn;
    public String requestType;
    @JSONField(name = "UIOperation")
    public JSONObject subUiOperation;
    @JSONField(name = "_msgType")
    public String uiOperationType = "uiRefresh";

    static {
        t2o.a(491782787);
        t2o.a(488636490);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.containerId;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public IContainerDataModel<?> getContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("697d3f50", new Object[]{this});
        }
        return this.containerModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataChangeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1799b5ef", new Object[]{this});
        }
        return this.dataChangeType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataSourceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("831c9fe4", new Object[]{this});
        }
        return this.dataSourceType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.errorCode;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getRequestType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
        }
        return this.requestType;
    }

    public JSONObject getSubUiOperation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6eb43ef0", new Object[]{this});
        }
        return this.subUiOperation;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getUiOperationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c08da82", new Object[]{this});
        }
        return this.uiOperationType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public boolean isSecondReturn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73b38699", new Object[]{this})).booleanValue();
        }
        return this.isSecondReturn;
    }
}
