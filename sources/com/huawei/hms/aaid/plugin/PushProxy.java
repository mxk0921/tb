package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import org.json.JSONObject;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    tct<Void> subscribe(Context context, String str, String str2);

    tct<Void> turnOff(Context context, String str);

    tct<Void> turnOn(Context context, String str);

    tct<Void> unsubscribe(Context context, String str, String str2);
}
