package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.list.InteractiveShowInfo;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponseData;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.fkx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractiveComponent implements INetDataObject, IInteractiveProxy.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String kTBLiveInteractiveDynamicDefaultComptType = "default";
    private static final String kTBLiveInteractiveDynamicMessageComptType = "message";
    public String actionUrl;
    public String bundleMD5;
    public String bundleUrl;
    public int componentStatus;
    public String comptType;
    public String currentState;
    public String customizedMtop;
    public int customizedType;
    public JSONObject extraParams;
    public String fedName;
    public boolean floatingLayerStatus;
    public String iconAction;
    public String iconUrl;
    public String iconViewStyle;
    public String id;
    public boolean interactivePanelDisplayOnly;
    public boolean isFistShow;
    public boolean isNeedShowEntrance;
    public boolean isNotifying;
    public boolean isRightAnimated;
    public boolean isShowInInteractivePanel;
    public String label;
    public boolean migrationFlag;
    public String name;
    public JSONObject notificationViewParams;
    public String panelTitle;
    public String priority;
    public boolean rightShowFlag;
    public int showOrder;
    public String type;
    public String version;
    public JSON viewParams;

    static {
        t2o.a(295699826);
        t2o.a(806355930);
        t2o.a(806355276);
    }

    public InteractiveComponent() {
        this.interactivePanelDisplayOnly = false;
        this.componentStatus = 0;
        this.floatingLayerStatus = false;
        this.customizedType = 0;
        this.showOrder = -1;
        this.migrationFlag = false;
        this.rightShowFlag = false;
        this.isNeedShowEntrance = false;
        this.isNotifying = false;
        this.isRightAnimated = false;
        this.isFistShow = false;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getFedName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b97e93bf", new Object[]{this});
        }
        return this.fedName;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getIconViewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719813c", new Object[]{this});
        }
        return this.iconViewStyle;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("730a5c7b", new Object[]{this});
        }
        return this.label;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getPanelTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9bada8f", new Object[]{this});
        }
        return this.panelTitle;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f425cc1f", new Object[]{this});
        }
        return this.priority;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public int getShowOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fbcc295", new Object[]{this})).intValue();
        }
        return this.showOrder;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public JSON getViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("4ed5b427", new Object[]{this});
        }
        return this.viewParams;
    }

    public void initComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd803ad", new Object[]{this});
        } else {
            this.componentStatus = 2;
        }
    }

    public boolean isDefaultComponentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e39281eb", new Object[]{this})).booleanValue();
        }
        return "default".equals(this.comptType);
    }

    public boolean isFloatingLayerStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c76a8a3e", new Object[]{this})).booleanValue();
        }
        return this.floatingLayerStatus;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public boolean isInitComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cae99a7", new Object[]{this})).booleanValue();
        }
        if (this.componentStatus == 2) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public boolean isInteractivePanelDisplayOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cdff1ed", new Object[]{this})).booleanValue();
        }
        return this.interactivePanelDisplayOnly;
    }

    public boolean isLoadComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b589b91", new Object[]{this})).booleanValue();
        }
        if (this.componentStatus >= 1) {
            return true;
        }
        return false;
    }

    public boolean isMessageComponentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a75ce5", new Object[]{this})).booleanValue();
        }
        return "message".equals(this.comptType);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public boolean isMigrationFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f8dc3db", new Object[]{this})).booleanValue();
        }
        return this.migrationFlag;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public boolean isNeedShowEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("993c48de", new Object[]{this})).booleanValue();
        }
        return this.isNeedShowEntrance;
    }

    public boolean isRightAnimated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489fdce0", new Object[]{this})).booleanValue();
        }
        return this.isRightAnimated;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public boolean isRightShowFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("378b9846", new Object[]{this})).booleanValue();
        }
        return this.rightShowFlag;
    }

    public void loadComponentComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a820597", new Object[]{this});
        } else {
            this.componentStatus = 1;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public JSONObject parseJsonTBLiveInteractiveComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6ea39f7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.id);
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("fedName", (Object) this.fedName);
        jSONObject.put("label", (Object) this.label);
        jSONObject.put("iconUrl", (Object) this.iconUrl);
        jSONObject.put("type", (Object) this.type);
        jSONObject.put("isShowInInteractivePanel", (Object) Boolean.valueOf(this.isShowInInteractivePanel));
        jSONObject.put("panelTitle", (Object) this.panelTitle);
        jSONObject.put("interactivePanelDisplayOnly", (Object) Boolean.valueOf(this.interactivePanelDisplayOnly));
        jSONObject.put("version", (Object) this.version);
        jSONObject.put("iconAction", (Object) this.iconAction);
        jSONObject.put("actionUrl", (Object) this.actionUrl);
        jSONObject.put("iconViewStyle", (Object) this.iconViewStyle);
        jSONObject.put("showOrder", (Object) Integer.valueOf(this.showOrder));
        jSONObject.put("rightShowFlag", (Object) Boolean.valueOf(this.rightShowFlag));
        jSONObject.put("migrationFlag", (Object) Boolean.valueOf(this.migrationFlag));
        jSONObject.put("isNeedShowEntrance", (Object) Boolean.valueOf(this.isNeedShowEntrance));
        jSONObject.put("isNotifying", (Object) Boolean.valueOf(this.isNotifying));
        jSONObject.put("notificationViewParams", (Object) this.notificationViewParams);
        jSONObject.put("viewParams", (Object) this.viewParams);
        jSONObject.put("extraParams", (Object) this.extraParams);
        jSONObject.put("componentStatus", (Object) Integer.valueOf(this.componentStatus));
        jSONObject.put("floatingLayerStatus", (Object) Boolean.valueOf(this.floatingLayerStatus));
        jSONObject.put("priority", (Object) this.priority);
        jSONObject.put("isRightAnimated", (Object) Boolean.valueOf(this.isRightAnimated));
        return jSONObject;
    }

    public void setFloatingLayerStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621cf712", new Object[]{this, new Boolean(z)});
        } else {
            this.floatingLayerStatus = z;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e
    public void setRightAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a335c2b0", new Object[]{this, new Boolean(z)});
        } else {
            this.isRightAnimated = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TBLiveInteractiveComponent{comptType='" + this.comptType + "', name='" + this.name + "', fedName='" + this.fedName + "', label='" + this.label + "', type='" + this.type + "', isShowInInteractivePanel=" + this.isShowInInteractivePanel + ", panelTitle=" + this.panelTitle + ", interactivePanelDisplayOnly=" + this.interactivePanelDisplayOnly + ", currentState='" + this.currentState + "', version='" + this.version + "', bundleUrl='" + this.bundleUrl + "', bundleMD5='" + this.bundleMD5 + "', iconAction='" + this.iconAction + "', actionUrl='" + this.actionUrl + "', iconViewStyle='" + this.iconViewStyle + "', customizedType=" + this.customizedType + ", customizedMtop='" + this.customizedMtop + "', showOrder=" + this.showOrder + ", migrationFlag=" + this.migrationFlag + ", rightShowFlag=" + this.rightShowFlag + ", isNeedShowEntrance=" + this.isNeedShowEntrance + ", isNotifying=" + this.isNotifying + ", notificationViewParams=" + this.notificationViewParams + ", viewParams=" + this.viewParams + ", extraParams=" + this.extraParams + ", isFistShow=" + this.isFistShow + ", componentStatus=" + this.componentStatus + ", floatingLayerStatus=" + this.floatingLayerStatus + ", priority=" + this.priority + ", isRightAnimated=" + this.isRightAnimated + '}';
    }

    public void updateViewParams(InteractiveShowInfo interactiveShowInfo) {
        JSON json;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdce73ee", new Object[]{this, interactiveShowInfo});
            return;
        }
        this.isNeedShowEntrance = interactiveShowInfo.isNeedShow;
        this.isNotifying = interactiveShowInfo.isNotifying;
        this.notificationViewParams = fkx.d(interactiveShowInfo.notificationViewParams);
        Object a2 = fkx.a(interactiveShowInfo.viewParams);
        if (a2 instanceof JSON) {
            json = (JSON) a2;
        } else {
            json = null;
        }
        this.viewParams = json;
        this.extraParams = fkx.d(interactiveShowInfo.extraParams);
        if (!TextUtils.isEmpty(interactiveShowInfo.iconAction)) {
            this.iconAction = interactiveShowInfo.iconAction;
        }
        if (!TextUtils.isEmpty(interactiveShowInfo.actionUrl)) {
            this.actionUrl = interactiveShowInfo.actionUrl;
        }
        if (!TextUtils.isEmpty(interactiveShowInfo.iconViewStyle)) {
            this.iconViewStyle = interactiveShowInfo.iconViewStyle;
        }
    }

    public InteractiveComponent(MtopMediaplatformDetailComponentlistResponseData.Component component) {
        boolean z = false;
        this.interactivePanelDisplayOnly = false;
        this.componentStatus = 0;
        this.floatingLayerStatus = false;
        this.customizedType = 0;
        this.showOrder = -1;
        this.migrationFlag = false;
        this.rightShowFlag = false;
        this.isNeedShowEntrance = false;
        this.isNotifying = false;
        this.isRightAnimated = false;
        this.isFistShow = false;
        this.id = component.id;
        this.name = component.name;
        this.fedName = component.fedName;
        this.label = component.label;
        this.iconUrl = component.iconUrl;
        this.comptType = component.comptType;
        this.type = component.type;
        this.version = component.version;
        this.bundleUrl = component.bundleUrl;
        this.bundleMD5 = component.bundleMD5;
        this.iconAction = component.iconAction;
        this.actionUrl = component.actionUrl;
        this.iconViewStyle = component.iconViewStyle;
        this.customizedType = component.customizedType;
        this.customizedMtop = component.customizedMtop;
        this.isShowInInteractivePanel = component.hideable == 1 ? true : z;
        this.panelTitle = component.panelTitle;
        this.interactivePanelDisplayOnly = component.interactivePanelDisplayOnly;
        this.showOrder = component.showOrder;
        this.currentState = component.currentState;
        this.migrationFlag = component.migrationFlag;
        this.rightShowFlag = component.rightShowFlag;
        this.priority = component.priority;
    }
}
