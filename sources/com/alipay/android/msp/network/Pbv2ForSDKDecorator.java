package com.alipay.android.msp.network;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspExtInfoModel;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.util.FwUtils;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestDataV2;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Pbv2ForSDKDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("bc71f049", new Object[]{this, requestConfig, str, new Integer(i)}) : todo(requestConfig, str, i, false);
    }

    public static JSONObject a(JSONObject jSONObject, MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85081b02", new Object[]{jSONObject, mspTradeContext, str});
        }
        if (mspTradeContext == null) {
            return jSONObject;
        }
        MspExtInfoModel extInfoModel = mspTradeContext.getExtInfoModel();
        extInfoModel.setVIData(str);
        try {
            LogUtil.record(2, "Pbv2:", "new extInfo = " + JSON.toJSON(extInfoModel));
            jSONObject = JsonUtil.merge(jSONObject, (JSONObject) JSON.toJSON(extInfoModel));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            mspTradeContext.getStatisticInfo().addError(ErrorType.DEFAULT, "assembleExtInfoError", e);
        }
        LogUtil.record(2, "Pbv2:", "final extInfo = ".concat(String.valueOf(jSONObject)));
        jSONObject.remove("tc_verify_token");
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_ID_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_API_KEY);
        return jSONObject;
    }

    public static JSONObject b(JSONObject jSONObject, MspTradeContext mspTradeContext, String str, int i, String str2) {
        Map<String, String> extInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36c2aa0b", new Object[]{jSONObject, mspTradeContext, str, new Integer(i), str2});
        }
        jSONObject.put(MspGlobalDefine.MSP_SWITCH_VERSION, (Object) DrmManager.getInstance(GlobalHelper.getInstance().getContext()).getVersion());
        LogUtil.record(2, "RpcRequestDecoratorForSdk:getVidataTime", "assembleOldExtInfo");
        String certsn = PhoneCashierMspEngine.getMspViSec().getCertsn();
        if (!TextUtils.isEmpty(certsn)) {
            jSONObject.put(MspGlobalDefine.CERTSN, (Object) certsn);
        }
        jSONObject.put("utdid", (Object) str2);
        jSONObject.put("agednessVersion", (Object) Boolean.valueOf(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)));
        jSONObject.put("isLowDevice", (Object) Boolean.valueOf(MspLowDeviceManager.getInstance().isLowDevice()));
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("VIData", (Object) str);
        }
        jSONObject.put(MspGlobalDefine.LANG, (Object) Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes())));
        if (mspTradeContext != null) {
            String str3 = mspTradeContext.getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(MspGlobalDefine.INSIDE_ENV, (Object) str3);
            }
            LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "extend map = " + mspTradeContext.getAllExtendParamsMap());
        }
        String join = TextUtils.join("|", FwUtils.concatList(FwUtils.concatList(ThirdPayManager.getAvailableThirdPayTypes(GlobalHelper.getInstance().getContext()), ThirdPayManager.getExternalProvidedThirdPayTypes(mspTradeContext)), ThirdPayManager.getListCupDirectApps()));
        if (!TextUtils.isEmpty(join)) {
            jSONObject.put("supported_3rd_pay", (Object) join);
        }
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before getBizInfo");
        if (mspTradeContext != null) {
            try {
                extInfo = mspTradeContext.getPaySession().getExtInfo();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        } else {
            extInfo = null;
        }
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "extendInfo map = ".concat(String.valueOf(extInfo)));
        if (extInfo != null && extInfo.size() > 0) {
            for (String str4 : extInfo.keySet()) {
                if (!TextUtils.isEmpty(str4)) {
                    String str5 = extInfo.get(str4);
                    if (!TextUtils.isEmpty(str5)) {
                        jSONObject.put(str4, (Object) str5);
                    }
                }
            }
            ApLinkTokenUtils.fixApLinkToken(jSONObject, i);
        }
        if (mspTradeContext != null) {
            try {
                if (!TextUtils.isEmpty(mspTradeContext.getAllExtendParamsMap().get("user_token")) && !jSONObject.containsKey("user_token")) {
                    jSONObject.put("user_token", (Object) mspTradeContext.getAllExtendParamsMap().get("user_token"));
                }
                if (!TextUtils.isEmpty(mspTradeContext.getAllExtendParamsMap().get("user_token_type")) && !jSONObject.containsKey("user_token_type")) {
                    jSONObject.put("user_token_type", (Object) mspTradeContext.getAllExtendParamsMap().get("user_token_type"));
                }
                if (!TextUtils.isEmpty(mspTradeContext.getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV)) && !jSONObject.containsKey(MspGlobalDefine.EXT_INSIDE_ENV)) {
                    jSONObject.put(MspGlobalDefine.EXT_INSIDE_ENV, (Object) mspTradeContext.getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV));
                }
            } catch (Throwable th2) {
                LogUtil.record(8, "fill_token", "failed to fill");
                LogUtil.printExceptionStackTrace(th2);
            }
        }
        return jSONObject;
    }

    public RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("f92cc6a7", new Object[]{this, requestConfig, str, new Integer(i), new Boolean(z)}) : todo(requestConfig, str, i, z, false);
    }

    public RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i, boolean z, boolean z2) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("53ccbc09", new Object[]{this, requestConfig, str, new Integer(i), new Boolean(z), new Boolean(z2)}) : todo(requestConfig, str, i, z, z2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x020a, code lost:
        if (android.text.TextUtils.equals(com.alipay.android.msp.framework.preload.PreloadManager.getPreloadCache().getCachedHasAlipayString(com.alipay.android.msp.framework.helper.GlobalHelper.getInstance().getContext(), r10), "1") != false) goto L_0x020c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.msp.network.model.RpcRequestDataV2 todo(com.alipay.android.msp.network.model.RequestConfig r21, final java.lang.String r22, final int r23, boolean r24, boolean r25, com.alipay.android.msp.utils.TimingUtil.TimingMsMap<com.alipay.android.msp.utils.TimingUtil.PreposeTimingEnum> r26) throws com.alibaba.fastjson.JSONException {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.Pbv2ForSDKDecorator.todo(com.alipay.android.msp.network.model.RequestConfig, java.lang.String, int, boolean, boolean, com.alipay.android.msp.utils.TimingUtil$TimingMsMap):com.alipay.android.msp.network.model.RpcRequestDataV2");
    }
}
