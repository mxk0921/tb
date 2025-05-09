package com.alipay.android.msp.network.decorator;

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
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RpcRequestDecoratorV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
            jSONObject = JsonUtil.merge(jSONObject, (JSONObject) JSON.toJSON(extInfoModel));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            mspTradeContext.getStatisticInfo().addError(ErrorType.DEFAULT, "assembleExtInfoError", e);
        }
        jSONObject.remove("tc_verify_token");
        jSONObject.remove("terminal_custom_info");
        jSONObject.remove("terminal_source");
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_ID_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_API_KEY);
        return jSONObject;
    }

    public static RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("f92cc6a7", new Object[]{requestConfig, str, new Integer(i), new Boolean(z)}) : todo(requestConfig, str, i, z, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:27|(2:33|(1:35)(2:36|(1:38)(2:39|(1:41)(31:42|43|(1:47)|48|(1:50)(1:52)|51|53|(3:55|(1:57)(1:58)|59)(1:60)|61|(1:63)(1:64)|65|(1:72)(1:71)|73|(1:75)|76|(1:80)|81|(3:142|83|(13:85|89|(1:91)|92|(1:94)(1:95)|96|144|97|(4:99|103|(1:105)|106)|102|103|(0)|106))|88|89|(0)|92|(0)(0)|96|144|97|(0)|102|103|(0)|106))))(1:31)|32|43|(2:45|47)|48|(0)(0)|51|53|(0)(0)|61|(0)(0)|65|(1:67)|72|73|(0)|76|(2:78|80)|81|(0)|88|89|(0)|92|(0)(0)|96|144|97|(0)|102|103|(0)|106) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03c9, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0319 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c5 A[Catch: all -> 0x03c8, TRY_LEAVE, TryCatch #1 {all -> 0x03c8, blocks: (B:97:0x03bd, B:99:0x03c5), top: B:144:0x03bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.android.msp.network.model.RpcRequestDataV2 todo(com.alipay.android.msp.network.model.RequestConfig r28, final java.lang.String r29, final int r30, boolean r31, boolean r32) throws com.alibaba.fastjson.JSONException {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.decorator.RpcRequestDecoratorV2.todo(com.alipay.android.msp.network.model.RequestConfig, java.lang.String, int, boolean, boolean):com.alipay.android.msp.network.model.RpcRequestDataV2");
    }

    public static JSONObject b(JSONObject jSONObject, MspTradeContext mspTradeContext, String str, String str2, int i, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50c7e7b8", new Object[]{jSONObject, mspTradeContext, str, str2, new Integer(i), requestConfig});
        }
        jSONObject.put(MspGlobalDefine.MSP_SWITCH_VERSION, (Object) DrmManager.getInstance(GlobalHelper.getInstance().getContext()).getVersion());
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before sourceBundleId");
        if (!TextUtils.isEmpty(str) && mspTradeContext != null) {
            jSONObject.put("sourceBundleId", (Object) str);
            jSONObject.put("sourceBundleSigMd5", (Object) mspTradeContext.getPaySession().getInvokeFromAppSign());
        }
        jSONObject.put("agednessVersion", (Object) Boolean.valueOf(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)));
        jSONObject.put("isLowDevice", (Object) Boolean.valueOf(MspLowDeviceManager.getInstance().isLowDevice()));
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("VIData", (Object) str2);
        }
        String extendParams = requestConfig.getExtendParams(MspGlobalDefine.EXT_INSIDE_ENV);
        if (!TextUtils.isEmpty(extendParams)) {
            jSONObject.put(MspGlobalDefine.INSIDE_ENV, (Object) extendParams);
        }
        PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_BUILD_GET_EXTINFO");
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before sourceBundleId");
        Map<String, String> map = null;
        String join = TextUtils.join("|", FwUtils.concatMultiList(ThirdPayManager.getAvailableThirdPayTypes(GlobalHelper.getInstance().getContext()), ThirdPayManager.getExternalProvidedThirdPayTypes(mspTradeContext), mspTradeContext != null ? mspTradeContext.getPaySession().getInstalled3rdAppList() : null, ThirdPayManager.getListCupDirectApps()));
        if (!TextUtils.isEmpty(join)) {
            jSONObject.put("supported_3rd_pay", (Object) join);
        }
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before getBizInfo");
        if (mspTradeContext != null) {
            try {
                map = mspTradeContext.getPaySession().getExtInfo();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        if (map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = map.get(str3);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject.put(str3, (Object) str4);
                    }
                }
            }
            ApLinkTokenUtils.fixApLinkToken(jSONObject, i);
        }
        return jSONObject;
    }
}
