package com.alibaba.android.aura.nodemodel;

import com.alibaba.android.aura.nodemodel.branch.AURABranchModel;
import com.alibaba.android.aura.nodemodel.subscriberelation.AURASubscribeRelationModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAPluginNodeModel implements Serializable {
    @JSONField(name = "bizCode")
    public String bizCode;
    @JSONField(name = "branches")
    public List<AURABranchModel> branches;
    @JSONField(name = "flows")
    public List<AURAFlowNodeModel> flows;
    @JSONField(name = "name")
    public String name;
    public Map<String, AURASubscribeRelationModel> subscribeRelationModel;

    static {
        t2o.a(79691911);
    }
}
