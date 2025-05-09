package com.taobao.weex.dom.binding;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.esl;
import tb.m1u;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ELUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BINDING = "@binding";
    public static final String COMPONENT_PROPS = "@componentProps";
    public static final String[] EXCLUDES_BINDING = {"clickEventParams"};
    public static final String IS_COMPONENT_ROOT = "@isComponentRoot";

    static {
        t2o.a(985661601);
    }

    public static boolean isBinding(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ae37862", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof JSONObject) {
            if (((JSONObject) obj).containsKey(BINDING)) {
                return true;
            }
            return false;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                if (isBinding(jSONArray.get(i))) {
                    return true;
                }
            }
            return false;
        } else if (!(obj instanceof String) || ((String) obj).indexOf(BINDING) < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static Object vforBlock(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46a32bf5", new Object[]{obj});
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.containsKey(WXStatement.WX_FOR_LIST)) {
                return obj;
            }
            Object obj2 = jSONObject.get(WXStatement.WX_FOR_LIST);
            if (obj2 instanceof m1u) {
                return obj;
            }
            jSONObject.put(WXStatement.WX_FOR_LIST, (Object) esl.g(obj2.toString()));
            return obj;
        } else if (obj instanceof String) {
            return vforBlock(JSON.parseObject(obj.toString()));
        } else {
            return obj;
        }
    }

    public static Object bindingBlock(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff6906e7", new Object[]{obj});
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.containsKey(BINDING)) {
                Object obj2 = jSONObject.get(BINDING);
                if (!(obj2 instanceof m1u)) {
                    jSONObject.put(BINDING, (Object) esl.g(obj2.toString()));
                }
            }
            for (String str : jSONObject.keySet()) {
                if ((jSONObject.get(str) instanceof JSONObject) && ((JSONObject) jSONObject.get(str)).containsKey(BINDING)) {
                    JSONObject jSONObject2 = (JSONObject) jSONObject.get(str);
                    Object obj3 = jSONObject2.get(BINDING);
                    if (!(obj3 instanceof m1u)) {
                        jSONObject2.put(BINDING, (Object) esl.g(obj3.toString()));
                    }
                }
            }
            return obj;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                bindingBlock(jSONArray.get(i));
            }
            return obj;
        } else if (!(obj instanceof String)) {
            return obj;
        } else {
            String obj4 = obj.toString();
            if (obj4.startsWith("{")) {
                return bindingBlock(JSON.parseObject(obj4));
            }
            return obj4.startsWith("[") ? bindingBlock(JSON.parseArray(obj4)) : obj;
        }
    }
}
