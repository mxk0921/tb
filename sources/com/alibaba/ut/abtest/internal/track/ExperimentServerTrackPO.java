package com.alibaba.ut.abtest.internal.track;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ExperimentServerTrackPO implements Serializable {
    private static final long serialVersionUID = -3300734741556496704L;
    @JSONField(name = "bucketId")
    public long bucketId;
    @JSONField(name = "component")
    public String component;
    @JSONField(name = "experimentId")
    public long experimentId;
    @JSONField(name = "module")
    public String module;
    @JSONField(name = "releaseId")
    public long releaseId;
    @JSONField(name = "trackConfigs")
    public String trackConfigs;
    @JSONField(name = "type")
    public String type;

    static {
        t2o.a(961544364);
    }
}
