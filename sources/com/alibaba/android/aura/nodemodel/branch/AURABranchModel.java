package com.alibaba.android.aura.nodemodel.branch;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURABranchModel implements Serializable {
    @JSONField(name = "cacheValue")
    public boolean cacheValue = true;
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "conditions")
    public List<AURAConditionModel> conditions;

    static {
        t2o.a(79691912);
    }
}
