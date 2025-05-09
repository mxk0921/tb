package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.dxu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFPluginNode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "UMFPluginNodeV2";
    @JSONField(name = "bizCode")
    public String bizCode;
    @JSONField(name = "extensions")
    public List<UMFServiceExtensionNodeModel> extensions;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "services")
    public List<UMFServiceNodeModel> services;
    @JSONField(name = "workFlows")
    public List<UMFWorkFlowNodeModel> workFlows;

    static {
        t2o.a(79692008);
        t2o.a(79692005);
    }

    private UMFServiceExtensionNodeModel findExtensionNodeModel(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFServiceExtensionNodeModel) ipChange.ipc$dispatch("54adf2f8", new Object[]{this, str, str2});
        }
        List<UMFServiceExtensionNodeModel> list = this.extensions;
        if (list == null || list.isEmpty()) {
            dxu.a().e("UMFPluginNodeV2", "findExtensionNodeModel#extensions is empty, make sure your config is correct");
            return null;
        }
        for (UMFServiceExtensionNodeModel uMFServiceExtensionNodeModel : this.extensions) {
            if (str2.equals(uMFServiceExtensionNodeModel.getId())) {
                return uMFServiceExtensionNodeModel;
            }
        }
        return null;
    }

    private void transformService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df909b0", new Object[]{this});
            return;
        }
        List<UMFServiceNodeModel> list = this.services;
        if (list == null || list.isEmpty()) {
            dxu.a().i("UMFPluginNodeV2", "transformService#services is empty");
            return;
        }
        for (UMFServiceNodeModel uMFServiceNodeModel : this.services) {
            Map<String, List<String>> map = uMFServiceNodeModel.extensions;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        UMFServiceExtensionNodeModel findExtensionNodeModel = findExtensionNodeModel(key, str);
                        if (findExtensionNodeModel != null) {
                            uMFServiceNodeModel.addExtensionModel(key, findExtensionNodeModel);
                        }
                    }
                }
            }
        }
    }

    private void transformWorkflow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db796252", new Object[]{this});
            return;
        }
        List<UMFWorkFlowNodeModel> list = this.workFlows;
        if (list == null || list.isEmpty()) {
            dxu.a().i("UMFPluginNodeV2", "transformWorkflow#workFlows is empty");
            return;
        }
        for (UMFWorkFlowNodeModel uMFWorkFlowNodeModel : this.workFlows) {
            List<String> list2 = uMFWorkFlowNodeModel.workFlowNodes;
            if (list2 != null && !list2.isEmpty()) {
                for (String str : list2) {
                    UMFServiceNodeModel serviceNode = getServiceNode(str);
                    if (serviceNode != null) {
                        uMFWorkFlowNodeModel.addNodeModel(serviceNode);
                    } else {
                        UMFWorkFlowNodeModel workFlowNode = getWorkFlowNode(str);
                        if (workFlowNode != null) {
                            uMFWorkFlowNodeModel.addNodeModel(workFlowNode);
                        }
                    }
                }
            }
        }
    }

    public void onFinishParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb246688", new Object[]{this});
            return;
        }
        transformService();
        transformWorkflow();
    }

    public UMFServiceNodeModel getServiceNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFServiceNodeModel) ipChange.ipc$dispatch("2307ca5", new Object[]{this, str});
        }
        List<UMFServiceNodeModel> list = this.services;
        if (list == null) {
            return null;
        }
        for (UMFServiceNodeModel uMFServiceNodeModel : list) {
            if (str.equals(uMFServiceNodeModel.id)) {
                return uMFServiceNodeModel;
            }
        }
        return null;
    }

    public UMFWorkFlowNodeModel getWorkFlowNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFWorkFlowNodeModel) ipChange.ipc$dispatch("a28fad41", new Object[]{this, str});
        }
        List<UMFWorkFlowNodeModel> list = this.workFlows;
        if (list == null) {
            return null;
        }
        for (UMFWorkFlowNodeModel uMFWorkFlowNodeModel : list) {
            if (str.equals(uMFWorkFlowNodeModel.code)) {
                return uMFWorkFlowNodeModel;
            }
        }
        return null;
    }
}
