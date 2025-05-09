package com.taobao.android.detail.ttdetail.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import tb.cy9;
import tb.jos;
import tb.nb4;
import tb.oa4;
import tb.t2o;
import tb.tgh;
import tb.tua;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RuntimeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262834);
    }

    public static RuntimeParam[] a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeParam[]) ipChange.ipc$dispatch("6753a56d", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null || runtimeAbilityParamArr.length == 0) {
            return null;
        }
        RuntimeParam[] runtimeParamArr = new RuntimeParam[runtimeAbilityParamArr.length];
        int length = runtimeAbilityParamArr.length;
        for (int i = 0; i < length; i++) {
            RuntimeAbilityParam runtimeAbilityParam = runtimeAbilityParamArr[i];
            runtimeParamArr[i] = new RuntimeParam(runtimeAbilityParam.getKey(), runtimeAbilityParam.getValue());
        }
        return runtimeParamArr;
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b36164c", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return jSONObject.getJSONObject("_client_ut_args_");
    }

    public static String c(oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8569e34", new Object[]{oa4Var});
        }
        String str = null;
        if (oa4Var == null) {
            return null;
        }
        if (oa4Var instanceof jos) {
            return UserBehaviorUtils.COMPONENT_NAME_NAVI_BAR;
        }
        if (oa4Var instanceof tua) {
            return UserBehaviorUtils.COMPONENT_NAME_GALLERY_CONTAINER;
        }
        nb4 componentData = oa4Var.getComponentData();
        if (componentData == null) {
            return null;
        }
        String g = componentData.g();
        if ((oa4Var.getParentComponent() instanceof cy9) && !TextUtils.isEmpty(g)) {
            str = "GalleryLightoff_" + g;
        }
        if (TextUtils.isEmpty(str)) {
            str = componentData.k();
        }
        if (TextUtils.isEmpty(str)) {
            return componentData.g();
        }
        return str;
    }

    public static String d(oa4 oa4Var) {
        nb4 componentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c62f3c2b", new Object[]{oa4Var});
        }
        if (oa4Var == null || (componentData = oa4Var.getComponentData()) == null) {
            return null;
        }
        String k = componentData.k();
        if (TextUtils.isEmpty(k)) {
            return componentData.g();
        }
        return k;
    }

    public static JSONObject f(JSONObject jSONObject, RuntimeParam... runtimeParamArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d7ba403", new Object[]{jSONObject, runtimeParamArr});
        }
        if (jSONObject == null) {
            return jSONObject;
        }
        if (runtimeParamArr == null || runtimeParamArr.length == 0) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.RuntimeUtils.1
            {
                putAll(JSONObject.this);
            }
        };
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if (TextUtils.equals("_client_ut_args_", runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof JSONObject) {
                    jSONObject2.put("_client_ut_args_", value);
                } else {
                    StringBuilder sb = new StringBuilder("mergedClientUtArgs found _client_ut_args_ is not JsonObject value: ");
                    if (value != null) {
                        str = value.toString();
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                    tgh.b("RuntimeUtils", sb.toString());
                }
            }
        }
        return jSONObject2;
    }

    public static boolean h(String str, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afbc3d5", new Object[]{str, runtimeParamArr})).booleanValue();
        }
        if (runtimeParamArr == null) {
            return false;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, runtimeParam.getKey())) {
                if (runtimeParam.getValue() != null) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean i(RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a894709", new Object[]{runtimeParamArr})).booleanValue();
        }
        if (runtimeParamArr == null) {
            return false;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if ("isPreLoadPageKey".equals(runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }

    public static oa4 e(RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("167837a1", new Object[]{runtimeParamArr});
        }
        if (runtimeParamArr == null) {
            return null;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if ("ttTriggerComponent".equals(runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof oa4) {
                    return (oa4) value;
                }
            }
        }
        return null;
    }

    public static String g(RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfbd8575", new Object[]{runtimeParamArr});
        }
        if (runtimeParamArr == null) {
            return null;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if ("pageKey".equals(runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof String) {
                    return (String) value;
                }
            }
        }
        return null;
    }

    public static boolean j(RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5db192e6", new Object[]{runtimeParamArr})).booleanValue();
        }
        if (runtimeParamArr == null) {
            return false;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if ("useBundleAdjust".equals(runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }

    public static boolean k(RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6f8a6fd", new Object[]{runtimeParamArr})).booleanValue();
        }
        if (runtimeParamArr == null) {
            return false;
        }
        for (RuntimeParam runtimeParam : runtimeParamArr) {
            if ("useMtopPost".equals(runtimeParam.getKey())) {
                Object value = runtimeParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }
}
