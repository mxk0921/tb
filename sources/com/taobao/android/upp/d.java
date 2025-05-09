package com.taobao.android.upp;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ucp.UcpResponse;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface d {
    public static final String KEY_FIND_SOLUTION_STEP = "find_solution";
    public static final String KEY_SOLUTION_FINISHED_STEP = "solution_finish";
    public static final String KEY_SOLUTION_GET_INPUT_STEP = "solution_get_input";
    public static final String KEY_SOLUTION_MODEL_STEP = "solution_model";
    public static final String KEY_SOLUTION_PREPARE_STEP = "solution_prepare";
    public static final String KEY_SOLUTION_RUNNABLE_STEP = "solution_runnable";
    public static final String KEY_UPP_SCHEME_PARAMS_ALGORITHM = "bizParamsForAlg";
    public static final String KEY_UPP_SCHEME_PARAMS_BIZ_DATA = "candidates";
    public static final String KEY_UPP_SCHEME_PARAMS_UPP_INFO = "upp";
    public static final String UPP_DOWNGRADE = "UPPInnerDowngradeCode";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(UcpResponse ucpResponse);
    }

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    void addBizFeatures(Map<String, Object> map, String str);

    boolean isDisableWithSchemeIdAndBizIdString(String str);

    boolean isUppEnabled();

    @Deprecated
    String registerResourceSpace(String str, Object obj, String str2, JSONObject jSONObject, b bVar);

    void registerUPPCallbackWithScene(String str, Object obj, b bVar);

    void sendUCPEventWithScene(String str, String str2, JSONObject jSONObject);
}
