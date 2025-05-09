package com.alibaba.ut.abtest.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExperimentResponseData implements Serializable {
    private static final long serialVersionUID = -3645512069349237184L;
    @JSONField(name = "groups")
    public List<ExperimentGroupPO> groups;
    @JSONField(name = "sign")
    public String sign;
    @JSONField(name = "version")
    public long version;

    static {
        t2o.a(961544341);
    }
}
