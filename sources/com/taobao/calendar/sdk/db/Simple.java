package com.taobao.calendar.sdk.db;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class Simple implements Serializable {
    static {
        t2o.a(414187569);
    }

    public JSONArray getJSONArrayfromString(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public JSONObject getJSONObjectfromString(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public abstract void parse(String str);

    public String toString() {
        return JSON.toJSONString(this);
    }
}
