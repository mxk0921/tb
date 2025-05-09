package com.taobao.weex.dom.binding;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class JSONUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661602);
    }

    public static boolean isJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2935439", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof JSONObject) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).startsWith("{");
        }
        return false;
    }

    public static JSONObject toJSON(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("957e7566", new Object[]{obj});
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return JSON.parseObject(obj.toString());
    }

    public static boolean isJSON(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20148e27", new Object[]{str})).booleanValue() : str.startsWith("{");
    }
}
