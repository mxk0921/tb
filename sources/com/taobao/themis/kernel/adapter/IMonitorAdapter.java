package com.taobao.themis.kernel.adapter;

import com.alibaba.fastjson.JSONObject;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IMonitorAdapter extends n8s {
    void trackAlarm(boolean z, String str, String str2, String str3, String str4, String str5);

    void trackCounter(String str, String str2, int i, String str3);

    void trackStat(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2);
}
