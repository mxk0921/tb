package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ICampaignRequestService extends ISubService {
    public static final String SERVICE_NAME = "CampaignRequestService";

    void setUserOnceRequestBizParams(JSONObject jSONObject, List<String> list);
}
