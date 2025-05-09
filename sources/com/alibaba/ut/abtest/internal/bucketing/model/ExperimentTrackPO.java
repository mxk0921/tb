package com.alibaba.ut.abtest.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExperimentTrackPO implements Serializable {
    private static final long serialVersionUID = 8095814974350608428L;
    @JSONField(name = "global")
    public boolean appScope;
    @JSONField(name = "eventIds")
    public int[] eventIds;
    @JSONField(name = "pageNames")
    public String[] pageNames;

    static {
        t2o.a(961544343);
    }
}
