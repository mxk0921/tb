package com.alibaba.android.aura.nodemodel.branch;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAConditionModel implements Serializable {
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "input")
    public Map<String, String> input;
    @JSONField(name = x96.PATH_OPERATOR)
    public String operator;

    static {
        t2o.a(79691914);
    }
}
