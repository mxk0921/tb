package com.alibaba.ut.abtest.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.i2p;
import tb.kpw;
import tb.ku0;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UTABTestApiPluginV2 extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "WVABTestApi";
    private static final String TAG = "UTABTestApiPluginV2";

    static {
        t2o.a(961544404);
    }

    private void activate(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67059481", new Object[]{this, str, wVCallBackContext});
        } else {
            getVariations(1, str, wVCallBackContext);
        }
    }

    private void activateServer(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f485e4", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str)) {
            String optString = new JSONObject(str).optString("data");
            if (!TextUtils.isEmpty(optString)) {
                UTABTest.activateServer(optString);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success(new WVApiResponse(0).toJsonString());
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
            }
        } else if (wVCallBackContext != null) {
            wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
        }
    }

    public static /* synthetic */ Object ipc$super(UTABTestApiPluginV2 uTABTestApiPluginV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/windvane/UTABTestApiPluginV2");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
        } catch (Exception e) {
            ogh.j(TAG, "WindVane Api " + str + " 执行错误！", e);
            ku0.j("UTABTestApiPluginV2.execute", e);
            if (wVCallBackContext != null) {
                try {
                    wVCallBackContext.success(new WVApiResponse(1000).toJsonString());
                } catch (Throwable unused) {
                    ku0.j("UTABTestApiPluginV2.execute.success", e);
                }
            }
        }
        if (TextUtils.equals(i2p.TYPE_ACTIVATE, str)) {
            activate(str2, wVCallBackContext);
            return true;
        }
        if (TextUtils.equals(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, str)) {
            activateServer(str2, wVCallBackContext);
            return true;
        }
        return false;
    }

    private void getVariations(int i, String str, WVCallBackContext wVCallBackContext) throws Exception {
        HashMap hashMap;
        VariationSet variationSet;
        JSONArray names;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cab3ed", new Object[]{this, new Integer(i), str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("component");
            String optString2 = jSONObject.optString("module");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
                if (optJSONObject == null || (names = optJSONObject.names()) == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string = names.getString(i2);
                        hashMap.put(string, optJSONObject.get(string));
                    }
                }
                if (i == 1) {
                    variationSet = UTABTest.activate(optString, optString2, hashMap, null);
                } else {
                    variationSet = UTABTest.getVariations(optString, optString2, hashMap);
                }
                HashMap hashMap2 = new HashMap();
                for (Variation variation : variationSet) {
                    hashMap2.put(variation.getName(), variation.getValue(null));
                }
                WVActivateApiResponseData wVActivateApiResponseData = new WVActivateApiResponseData();
                if (variationSet.getExperimentBucketId() > 0 || !hashMap2.isEmpty()) {
                    wVActivateApiResponseData.setExperimentBucketId(variationSet.getExperimentBucketId());
                    wVActivateApiResponseData.setExperimentId(variationSet.getExperimentId());
                    wVActivateApiResponseData.setExperimentReleaseId(variationSet.getExperimentReleaseId());
                    wVActivateApiResponseData.setVariations(hashMap2);
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success(new WVApiResponse(wVActivateApiResponseData).toJsonString());
                    }
                } else if (wVCallBackContext != null) {
                    wVCallBackContext.success(new WVApiResponse(1000).toJsonString());
                }
            } else if (wVCallBackContext != null) {
                wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
            }
        } else if (wVCallBackContext != null) {
            wVCallBackContext.success(new WVApiResponse(1001).toJsonString());
        }
    }
}
