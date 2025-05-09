package com.unionpay.tsmservice.mini.result;

import android.os.Parcelable;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
abstract class BaseResult implements Parcelable {
    public abstract void initWithJSONObject(JSONObject jSONObject);

    public abstract JSONObject toJSONObject();
}
