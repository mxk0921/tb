package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IRecbotService extends ISubService {
    public static final String SERVICE_NAME = "RecbotService";

    void adjustStart(String str, boolean z, String str2, boolean z2);

    void hideRecbotView();

    boolean isRecbotRequesting();

    void showRecbotView(String str, JSONObject jSONObject);
}
