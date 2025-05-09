package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExperimentVariationConfigV5PO implements Serializable {
    public static final String SCOPE_APP = "app";
    @JSONField(name = Constants.Name.SCOPE)
    public String scope;

    static {
        t2o.a(961544223);
    }
}
