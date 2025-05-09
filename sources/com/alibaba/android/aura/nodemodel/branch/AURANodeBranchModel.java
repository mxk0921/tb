package com.alibaba.android.aura.nodemodel.branch;

import com.alibaba.fastjson.annotation.JSONField;
import tb.t2o;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURANodeBranchModel {
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "default")
    public String defaultValue;
    @JSONField(name = x96.PATH_OPERATOR)
    public String operator;

    static {
        t2o.a(79691915);
    }

    public AURANodeBranchModel() {
    }

    public AURANodeBranchModel(String str, boolean z, String str2) {
        this.code = str;
        this.defaultValue = String.valueOf(z);
        this.operator = str2;
    }
}
