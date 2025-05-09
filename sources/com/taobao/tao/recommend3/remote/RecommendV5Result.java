package com.taobao.tao.recommend3.remote;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendV5Result implements Serializable, IMTOPDataObject {
    public long cacheTimestamp;
    public long currentTimeMillis;
    public Map<String, String> currentUTParam;
    public Map<String, String> currentePageParam;
    public long expireIntervalTimeMillis;
    public JSONObject ext;
    public String isLastPage;
    public String itemLastCount;
    public String pageTotal;
    public List<SectionModel> sections;
    public String userId;

    static {
        t2o.a(729809874);
        t2o.a(589299906);
    }
}
