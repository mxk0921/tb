package com.taobao.tao.topmultitab.service.editionswitch;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.topmultitab.service.base.IHomeStaticService;
import tb.r1c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomeEditionSwitchService extends IHomeStaticService {
    public static final String SERVICE_NAME = "HomeEditionSwitchService";

    void addEditionSwitchListener(r1c r1cVar);

    void initEditionSwitch();

    void removeEditionSwitchListener(r1c r1cVar);

    void updateEditionSwitch(Context context, String str);

    void updateRevisionSwitch(JSONObject jSONObject);
}
