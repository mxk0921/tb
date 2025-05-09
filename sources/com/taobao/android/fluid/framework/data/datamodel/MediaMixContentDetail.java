package com.taobao.android.fluid.framework.data.datamodel;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaMixContentDetail implements IMTOPDataObject, Serializable {
    public Map<String, Object> businessExtraMap;
    public Map<String, Object> config;
    public int currentDataVersion;
    public Map<String, Object> edgeComputeConfig;
    public boolean isBackUp;
    public List<MediaContentDetailData> list;
    public int nextDataVersion;
    public String noMoreData;
    public String noMoreMsg;
    public List<MediaContentDetailData> pitList;
    public Map<String, Object> transmission;

    static {
        t2o.a(468714203);
        t2o.a(589299906);
    }
}
