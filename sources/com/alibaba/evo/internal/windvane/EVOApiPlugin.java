package com.alibaba.evo.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.windvane.WVActivateApiResponseData;
import com.alibaba.ut.abtest.internal.windvane.WVApiResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.i2p;
import tb.kpw;
import tb.ku0;
import tb.n;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EVOApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "WVEvoApi";
    private static final String TAG = "EVOApiPlugin";

    static {
        t2o.a(961544249);
    }

    private void activateServer(String str, WVCallBackContext wVCallBackContext) throws Exception {
        HashMap hashMap;
        JSONArray names;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f485e4", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("data");
            if (!TextUtils.isEmpty(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
                if (optJSONObject == null || (names = optJSONObject.names()) == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    for (int i = 0; i < names.length(); i++) {
                        String string = names.getString(i);
                        hashMap.put(string, optJSONObject.get(string));
                    }
                }
                EVO.activateServerSync(optString, hashMap, this.mContext);
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

    private void getPageActivateTrackIds(String str, WVCallBackContext wVCallBackContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1e59b3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        String h = n.j().n().h();
        HashMap hashMap = new HashMap();
        hashMap.put("trackIds", h);
        if (wVCallBackContext != null) {
            wVCallBackContext.success(new WVApiResponse(hashMap).toJsonString());
        }
    }

    public static /* synthetic */ Object ipc$super(EVOApiPlugin eVOApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/evo/internal/windvane/EVOApiPlugin");
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
            ku0.j("EVOApiPlugin.execute", e);
            if (wVCallBackContext != null) {
                try {
                    wVCallBackContext.success(new WVApiResponse(1000).toJsonString());
                } catch (Throwable th) {
                    ku0.j("EVOApiPlugin.execute.success", th);
                }
            }
        }
        if (TextUtils.equals(i2p.TYPE_ACTIVATE, str)) {
            activate(str2, wVCallBackContext);
            return true;
        } else if (TextUtils.equals(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, str)) {
            activateServer(str2, wVCallBackContext);
            return true;
        } else {
            if (TextUtils.equals("getPageActivateTrackIds", str)) {
                getPageActivateTrackIds(str2, wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    private void activate(String str, WVCallBackContext wVCallBackContext) throws Exception {
        HashMap hashMap;
        JSONArray names;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67059481", new Object[]{this, str, wVCallBackContext});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("namespace");
            String optString2 = jSONObject.optString("key");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
                if (optJSONObject == null || (names = optJSONObject.names()) == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    for (int i = 0; i < names.length(); i++) {
                        String string = names.getString(i);
                        hashMap.put(string, optJSONObject.get(string));
                    }
                }
                VariationSet activateSync = EVO.activateSync(optString, optString2, hashMap, this.mContext);
                HashMap hashMap2 = new HashMap();
                for (Variation variation : activateSync) {
                    hashMap2.put(variation.getName(), variation.getValue(null));
                }
                WVActivateApiResponseData wVActivateApiResponseData = new WVActivateApiResponseData();
                if (activateSync.getExperimentBucketId() > 0 || !hashMap2.isEmpty()) {
                    wVActivateApiResponseData.setExperimentBucketId(activateSync.getExperimentBucketId());
                    wVActivateApiResponseData.setExperimentId(activateSync.getExperimentId());
                    wVActivateApiResponseData.setExperimentReleaseId(activateSync.getExperimentReleaseId());
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
