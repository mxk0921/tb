package com.taobao.android.livehome.plugin.atype.flexalocal.dinamic.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.common.TypedObject;
import java.util.HashMap;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DinamicDataObject extends TypedObject {
    public static final String KEY_DATA = "data";
    public static final String KEY_TYPE = "_type_";
    public static final String KEY_VIEW_POSITION = "_position_";
    public HashMap<String, Object> data;
    public DinamicTemplateDataObject template = new DinamicTemplateDataObject();
    public boolean playOnce = false;
    public boolean isDinamicX = false;

    static {
        t2o.a(310378530);
    }

    public static int parseInt(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (Exception e) {
            r0h.b("DinamicDataObject", e.getMessage());
            return 0;
        }
    }

    public int getPosition() {
        HashMap<String, Object> hashMap = this.data;
        if (hashMap == null) {
            return 0;
        }
        if (this.isDinamicX) {
            Object obj = hashMap.get("data");
            if (obj instanceof JSONObject) {
                return parseInt(((JSONObject) obj).get(KEY_VIEW_POSITION));
            }
        }
        return parseInt(this.data.get(KEY_VIEW_POSITION));
    }

    public String getType() {
        HashMap<String, Object> hashMap = this.data;
        if (hashMap == null) {
            return null;
        }
        if (this.isDinamicX) {
            Object obj = hashMap.get("data");
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).getString(KEY_TYPE);
            }
        }
        return (String) this.data.get(KEY_TYPE);
    }

    public void setPosition(int i) {
        HashMap<String, Object> hashMap = this.data;
        if (hashMap == null) {
            return;
        }
        if (this.isDinamicX) {
            Object obj = hashMap.get("data");
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put(KEY_VIEW_POSITION, (Object) Integer.valueOf(i));
                return;
            }
            return;
        }
        hashMap.put(KEY_VIEW_POSITION, Integer.valueOf(i));
    }

    public void setType(String str) {
        HashMap<String, Object> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.data) == null) {
            return;
        }
        if (this.isDinamicX) {
            Object obj = hashMap.get("data");
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put(KEY_TYPE, (Object) str);
                return;
            }
            return;
        }
        hashMap.put(KEY_TYPE, str);
    }
}
