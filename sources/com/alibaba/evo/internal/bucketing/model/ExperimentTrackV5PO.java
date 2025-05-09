package com.alibaba.evo.internal.bucketing.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExperimentTrackV5PO implements Serializable {
    private static final long serialVersionUID = 1584139115513200489L;
    @JSONField(name = "global")
    public boolean appScope;
    @JSONField(name = "pageNames")
    public String[] pageNames;

    static {
        t2o.a(961544214);
    }
}
