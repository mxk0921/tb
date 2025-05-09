package com.alibaba.ut.abtest.internal.windvane;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kva;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WVActivateApiResponseData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "experimentBucketId")
    private long experimentBucketId;
    @JSONField(name = "experimentId")
    private long experimentId;
    @JSONField(name = "experimentReleaseId")
    private long experimentReleaseId;
    @JSONField(name = kva.SERIALIZE_EXP_VARIATIONS)
    private Map<String, Object> variations;

    static {
        t2o.a(961544405);
    }

    @Deprecated
    public long getExperimentBucketId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ceabe33", new Object[]{this})).longValue();
        }
        return this.experimentBucketId;
    }

    @Deprecated
    public long getExperimentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce6309e9", new Object[]{this})).longValue();
        }
        return this.experimentId;
    }

    @Deprecated
    public long getExperimentReleaseId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64f91dca", new Object[]{this})).longValue();
        }
        return this.experimentReleaseId;
    }

    public Map<String, Object> getVariations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a5875b2", new Object[]{this});
        }
        return this.variations;
    }

    @Deprecated
    public void setExperimentBucketId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d65d9", new Object[]{this, new Long(j)});
        } else {
            this.experimentBucketId = j;
        }
    }

    @Deprecated
    public void setExperimentId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d994b7e3", new Object[]{this, new Long(j)});
        } else {
            this.experimentId = j;
        }
    }

    @Deprecated
    public void setExperimentReleaseId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f7dcba", new Object[]{this, new Long(j)});
        } else {
            this.experimentReleaseId = j;
        }
    }

    public void setVariations(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abae61c", new Object[]{this, map});
        } else {
            this.variations = map;
        }
    }
}
