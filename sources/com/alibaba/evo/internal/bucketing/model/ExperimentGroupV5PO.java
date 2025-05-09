package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import tb.kva;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExperimentGroupV5PO implements Serializable {
    private static final long serialVersionUID = -4453267950431636643L;
    @JSONField(name = "conditions")
    public String condition;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "ignoreUrls")
    public Set<String> ignoreUrls;
    @JSONField(name = "ratioRanges")
    public int[][] ratioRange;
    @JSONField(name = kva.SERIALIZE_EXP_VARIATIONS)
    public Map<String, String> variations;

    static {
        t2o.a(961544211);
    }
}
