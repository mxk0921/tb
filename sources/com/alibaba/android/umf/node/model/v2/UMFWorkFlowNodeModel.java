package com.alibaba.android.umf.node.model.v2;

import com.alibaba.android.umf.node.model.IUMFNodeModel;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFWorkFlowNodeModel extends UMFBaseNodeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "type")
    public String type;
    private List<IUMFNodeModel> workFlowNodeModels;
    @JSONField(name = "nodes")
    public List<String> workFlowNodes;

    static {
        t2o.a(79692011);
    }

    public static /* synthetic */ Object ipc$super(UMFWorkFlowNodeModel uMFWorkFlowNodeModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/model/v2/UMFWorkFlowNodeModel");
    }

    public void addNodeModel(IUMFNodeModel iUMFNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5883dcb", new Object[]{this, iUMFNodeModel});
            return;
        }
        if (this.workFlowNodeModels == null) {
            this.workFlowNodeModels = new ArrayList();
        }
        this.workFlowNodeModels.add(iUMFNodeModel);
    }

    @Override // com.alibaba.android.umf.node.model.IUMFNodeModel
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35374867", new Object[]{this});
        }
        return "workFlow";
    }

    public List<IUMFNodeModel> getWorkFlowNodeModels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("51bd82ff", new Object[]{this});
        }
        return this.workFlowNodeModels;
    }
}
