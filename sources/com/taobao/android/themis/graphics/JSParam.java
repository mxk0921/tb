package com.taobao.android.themis.graphics;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JSParam {
    public static final int BOOLEAN = 1;
    public static final int DOUBLE = 4;
    public static final int FLOAT = 6;
    public static final int INTEGER = 5;
    public static final int JSON = 3;
    public static final int STRING = 2;
    public Object data;
    public int type;

    public JSParam(Object obj) {
        if (obj == null) {
            this.type = 2;
            this.data = "";
            return;
        }
        this.data = obj;
        if (obj instanceof Integer) {
            this.type = 5;
            this.data = (Integer) obj;
        } else if (obj instanceof Double) {
            this.type = 4;
            this.data = (Double) obj;
        } else if (obj instanceof Float) {
            this.type = 6;
            this.data = (Float) obj;
        } else if (obj instanceof Boolean) {
            this.type = 1;
            this.data = (Boolean) obj;
        } else if (obj instanceof String) {
            this.type = 2;
        } else if (obj instanceof JSONObject) {
            this.type = 3;
            this.data = ((JSONObject) obj).toString();
        } else if (obj instanceof JSONArray) {
            this.type = 3;
            this.data = ((JSONArray) obj).toString();
        }
    }
}
