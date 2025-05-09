package com.alibaba.android.aura.nodemodel.workflow;

import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAExecuteNodeModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "branch")
    public AURANodeBranchModel branch;
    public String code;
    public Map<String, List<AURAExecuteNodeModel>> extensions;
    public String type;

    static {
        t2o.a(79691918);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "code=" + this.code + ", type=" + this.type;
    }
}
