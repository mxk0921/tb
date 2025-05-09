package com.meizu.cloud.pushsdk.c.c;

import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f5776a;
    private final String b;

    public c(int i, String str) {
        this.f5776a = i;
        this.b = str;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.f5776a);
            jSONObject.put(AgooConstants.MESSAGE_BODY, this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "[NetResponse] " + jSONObject.toString();
    }
}
