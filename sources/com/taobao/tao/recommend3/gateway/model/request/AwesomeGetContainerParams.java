package com.taobao.tao.recommend3.gateway.model.request;

import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwesomeGetContainerParams implements Serializable, IMTOPDataObject {
    public long baseCacheTime;
    public JSONObject bizParams;
    public long clientReqOffsetTime;
    public long clientReqTime;
    public long deltaCacheTime;
    public List<String> deltaSections;
    public AwesomeGetPageData pageParams;
    public JSONObject passParams;
    public long realBaseCacheTime;
    public String requestType;

    static {
        t2o.a(729809697);
        t2o.a(589299906);
    }
}
