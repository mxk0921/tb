package com.alibaba.ut.abtest.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bqm;
import tb.i2p;
import tb.kpw;
import tb.ku0;
import tb.kva;
import tb.nsw;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UTABTestApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "WVUTABTestApi";
    private static final String TAG = "UTABTestApiPlugin";

    static {
        t2o.a(961544403);
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
            return;
        }
        UTABTest.activateServer(new JSONObject(str).optString("server"));
        if (wVCallBackContext != null) {
            wVCallBackContext.success(new WVApiResponse().toJsonString());
        }
    }

    private void getVariations(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945be884", new Object[]{this, str, wVCallBackContext});
        } else {
            getVariations(2, str, wVCallBackContext);
        }
    }

    public static /* synthetic */ Object ipc$super(UTABTestApiPlugin uTABTestApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/windvane/UTABTestApiPlugin");
    }

    private void isSwitchOpened(String str, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28bd95", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String string = new JSONObject(str).getString("switchName");
        boolean isSwitchOpened = EVO.isSwitchOpened(wVCallBackContext.getWebview().getContext(), string);
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(string, isSwitchOpened);
        nswVar.d("data", jSONObject);
        wVCallBackContext.success(nswVar);
    }

    private void mockSwitches(String str, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848246da", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject(kva.SERIALIZE_EXP_VARIATIONS);
        Iterator<String> keys = jSONObject2.keys();
        JSONObject jSONObject3 = new JSONObject(bqm.a().d("ab_mock_switches", "{}"));
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        bqm.a().g("ab_mock_switches", jSONObject3.toString());
        nsw nswVar = new nsw();
        nswVar.d("data", jSONObject);
        nswVar.b("msg", "mock success, please restart app");
        wVCallBackContext.success(nswVar);
    }

    private void getVariations(int i, String str, WVCallBackContext wVCallBackContext) throws Exception {
        VariationSet variationSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cab3ed", new Object[]{this, new Integer(i), str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("component");
        String optString2 = jSONObject.optString("module");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            if (i == 1) {
                variationSet = UTABTest.activate(optString, optString2);
            } else {
                variationSet = UTABTest.getVariations(optString, optString2);
            }
            HashMap hashMap = new HashMap();
            for (Variation variation : variationSet) {
                hashMap.put(variation.getName(), variation.getValue(null));
            }
            WVActivateApiResponseData wVActivateApiResponseData = new WVActivateApiResponseData();
            wVActivateApiResponseData.setExperimentBucketId(variationSet.getExperimentBucketId());
            wVActivateApiResponseData.setExperimentId(variationSet.getExperimentId());
            wVActivateApiResponseData.setExperimentReleaseId(variationSet.getExperimentReleaseId());
            wVActivateApiResponseData.setVariations(hashMap);
            if (wVCallBackContext != null) {
                wVCallBackContext.success(new WVApiResponse(wVActivateApiResponseData).toJsonString());
            }
        } else if (wVCallBackContext != null) {
            wVCallBackContext.error(new WVApiResponse(1001).toJsonString());
        }
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
            ku0.j("UTABTestApiPlugin.execute", e);
            if (wVCallBackContext != null) {
                try {
                    wVCallBackContext.error();
                } catch (Throwable unused) {
                    ku0.j("UTABTestApiPlugin.execute.error", e);
                }
            }
        }
        if (TextUtils.equals(i2p.TYPE_ACTIVATE, str)) {
            activate(str2, wVCallBackContext);
            return true;
        } else if (TextUtils.equals("getVariations", str)) {
            getVariations(str2, wVCallBackContext);
            return true;
        } else if (TextUtils.equals(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, str)) {
            activateServer(str2, wVCallBackContext);
            return true;
        } else if (TextUtils.equals("mockSwitches", str)) {
            mockSwitches(str2, wVCallBackContext);
            return true;
        } else {
            if (TextUtils.equals("isSwitchOpened", str)) {
                isSwitchOpened(str2, wVCallBackContext);
                return true;
            }
            return false;
        }
    }
}
