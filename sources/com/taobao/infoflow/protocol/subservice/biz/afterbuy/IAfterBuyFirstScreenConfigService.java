package com.taobao.infoflow.protocol.subservice.biz.afterbuy;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IAfterBuyFirstScreenConfigService extends ISubService {
    public static final String SERVICE_NAME = "IAfterBuyFirstScreenConfigService";

    JSONObject getFirstScreenEffectConfig(String str);
}
