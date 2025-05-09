package com.alipay.android.msp.framework.offline;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OfflineRenderLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JSONObject analysisActivityPageInfo(Context context, Map<String, String> map, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1d3f044", new Object[]{this, context, map, jSONObject});
        }
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("serverSideData")) == null)) {
            String string = jSONObject2.getString("tplVersion");
            String string2 = jSONObject2.getString("mspVersion");
            if (TextUtils.equals(string, GlobalConstant.getTemplateVersion()) && TextUtils.equals(string2, GlobalSdkConstant.getMspVersion())) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("normalData");
                return jSONObject3 != null ? jSONObject3 : new JSONObject();
            }
        }
        new OfflineRenderReport(map).reportActivity(context);
        JSONObject jSONObject4 = jSONObject.getJSONObject("defaultData");
        return jSONObject4 != null ? jSONObject4 : new JSONObject();
    }

    public String analysisRenderInfo(Context context, Map<String, String> map, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4b121f2", new Object[]{this, context, map, str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject.getBooleanValue("unifyPage")) {
            jSONObject = analysisResultPageInfo(context, map, parseObject);
        } else {
            jSONObject = analysisActivityPageInfo(context, map, parseObject);
        }
        return jSONObject.toJSONString();
    }

    public JSONObject analysisResultPageInfo(Context context, Map<String, String> map, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("13b068f6", new Object[]{this, context, map, jSONObject});
        }
        if (TextUtils.equals(jSONObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID), "3")) {
            jSONObject.put(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID, MspFlybirdDefine.FLYBIRD_RESULT_TPL);
        }
        if (TextUtils.equals(MspFlybirdDefine.FLYBIRD_RESULT_TPL, jSONObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID)) && (jSONObject2 = jSONObject.getJSONObject("reportVer")) != null) {
            String string = jSONObject2.getString("tplVersion");
            String string2 = jSONObject2.getString("mspVersion");
            if (!TextUtils.equals(string, GlobalConstant.getTemplateVersion()) || !TextUtils.equals(string2, GlobalSdkConstant.getMspVersion())) {
                new OfflineRenderReport(map).reportUseDefaultResultInfo(context);
                jSONObject.put(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID, MspFlybirdDefine.DEFAULT_RESULT_TPL_ID);
                jSONObject.put("tpl", "");
            }
        }
        return jSONObject;
    }
}
