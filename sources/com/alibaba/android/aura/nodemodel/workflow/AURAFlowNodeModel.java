package com.alibaba.android.aura.nodemodel.workflow;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAFlowNodeModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "aspectExtensions")
    public Map<String, List<AURAExecuteNodeModel>> aspectExtensions;
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "nodes")
    public List<AURAExecuteNodeModel> nodes;
    @JSONField(name = "type")
    public String type;

    static {
        t2o.a(79691919);
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }
}
