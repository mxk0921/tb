package com.alipay.android.msp.framework.helper;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.exception.PublicKeyException;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.network.decorator.BytesEncryptDecorator;
import com.alipay.android.msp.network.decorator.BytesEnvelopDecorator;
import com.alipay.android.msp.network.decorator.DynamicHostEnvelopDecorator;
import com.alipay.android.msp.network.decorator.PublicKeyDecorator;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HandleResponseDataUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a037f38", new Object[]{mspTradeContext});
            return;
        }
        TradeLogicData tradeLogicData = mspTradeContext.getTradeLogicData();
        if (tradeLogicData != null && tradeLogicData.getRetryTimes() < 3) {
            ActionsCreator.get(mspTradeContext).createNetRetryRequestAction();
            tradeLogicData.updateRetryTimes();
        }
    }

    public static void b(JSONObject jSONObject) throws AppErrorException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            if (jSONObject.containsKey("public_key")) {
                str = jSONObject.getString("public_key");
            } else {
                str = jSONObject.getString(MspFlybirdDefine.FLYBIRD_PKEY);
            }
            if (!TextUtils.isEmpty(str)) {
                MspConfig.getInstance().setRsaPublicKey(str);
                return;
            }
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 203));
        }
    }

    public static void c(JSONObject jSONObject) throws AppErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey(MspFlybirdDefine.FLYBIRD_PKEY)) {
            String string = jSONObject.getString(MspFlybirdDefine.FLYBIRD_PKEY);
            if (!TextUtils.isEmpty(string)) {
                MspConfig.getInstance().setRsaPublicKey(string);
                return;
            }
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 203));
        }
    }

    public static String parsePbV1DataToRendData(JSONObject jSONObject, MspTradeContext mspTradeContext) throws JSONException, AppErrorException {
        RequestConfig requestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dce528b1", new Object[]{jSONObject, mspTradeContext});
        }
        int parseInt = Integer.parseInt(jSONObject.getString("code"));
        String string = jSONObject.getString("params");
        LogUtil.record(4, "HandleResponseDataUtil.parsePbV1DataToRendData", "ResData ".concat(String.valueOf(string)));
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        JSONObject parseObject = JSON.parseObject(string);
        TradeLogicData tradeLogicData = mspTradeContext.getTradeLogicData();
        if (tradeLogicData != null) {
            requestConfig = tradeLogicData.getRequestConfig();
            if (requestConfig != null) {
                if (parseObject.containsKey(MspGlobalDefine.SESSION)) {
                    requestConfig.setSessionId(parseObject.getString(MspGlobalDefine.SESSION));
                }
                if (parseObject.containsKey(MspGlobalDefine.UAC)) {
                    requestConfig.setmUac(parseObject.getIntValue(MspGlobalDefine.UAC));
                    tradeLogicData.setUac(parseObject.getIntValue(MspGlobalDefine.UAC));
                } else {
                    requestConfig.setmUac(0);
                    tradeLogicData.setUac(0);
                }
                if (parseObject.containsKey(MspFlybirdDefine.FLYBIRD_PKEY)) {
                    b(parseObject);
                }
                if (parseObject.containsKey("trade_no")) {
                    tradeLogicData.setTradeNo(parseObject.getString("trade_no"));
                    LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "LogicMessageHandlerAdapter.parseResponseRpcData", "params tradeno");
                }
            }
        } else {
            requestConfig = null;
        }
        String string2 = jSONObject.getString("mspParam");
        if (!TextUtils.isEmpty(string2)) {
            MspConfig.getInstance().updateLastMspParams(string2);
            mspTradeContext.setSpmDpToken(string2);
        }
        if (requestConfig == null) {
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("mini_app_error", mspTradeContext.getContext().getString(R.string.mini_app_error), new Object[0]), 4));
        } else if (parseInt != 1000) {
            tradeLogicData.setSessionId(requestConfig.getSessionId());
            mspTradeContext.getMspNetHandler().setNetError(false);
            mspTradeContext.getMspNetHandler().setNetErrorCode("");
            mspTradeContext.getStatisticInfo().updateAttr(Vector.Id, "sessionId", requestConfig.getSessionId());
            if (requestConfig.isFirstRequest()) {
                AlertIntelligenceEngine.recordBizInfo(mspTradeContext, "first_rpc_resp_pbv1");
                AlertIntelligenceEngine.recordBizInfoSecond(mspTradeContext, requestConfig.getSessionId());
            }
            return string;
        } else if (string != null) {
            b(parseObject);
            a(mspTradeContext);
            return "";
        } else {
            mspTradeContext.getStatisticInfo().addError(ErrorType.DATA, ErrorCode.DATA_GET_RSA_KEY, "缺少RSA-KEY数据");
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 202));
        }
    }

    public static boolean handlePbV2Data(JSONObject jSONObject, MspTradeContext mspTradeContext) throws JSONException, AppErrorException {
        RequestConfig requestConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fab3e61b", new Object[]{jSONObject, mspTradeContext})).booleanValue();
        }
        int i = -1;
        try {
            if (jSONObject.containsKey("code")) {
                i = Integer.parseInt(jSONObject.getString("code"));
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        LogUtil.record(4, "HandleResponseDataUtil.handlePbV2Data", "ResData not null");
        TradeLogicData tradeLogicData = mspTradeContext.getTradeLogicData();
        if (tradeLogicData != null) {
            requestConfig = tradeLogicData.getRequestConfig();
            if (requestConfig != null) {
                if (!TextUtils.isEmpty(jSONObject.getString(MspGlobalDefine.SESSION))) {
                    requestConfig.setSessionId(jSONObject.getString(MspGlobalDefine.SESSION));
                }
                if (!TextUtils.isEmpty(jSONObject.getString(MspGlobalDefine.UAC))) {
                    requestConfig.setmUac(Integer.parseInt(jSONObject.getString(MspGlobalDefine.UAC)));
                    tradeLogicData.setUac(Integer.parseInt(jSONObject.getString(MspGlobalDefine.UAC)));
                } else {
                    requestConfig.setmUac(0);
                    tradeLogicData.setUac(0);
                }
                if (!TextUtils.isEmpty(jSONObject.getString(MspFlybirdDefine.FLYBIRD_PKEY))) {
                    c(jSONObject);
                }
                if (!TextUtils.isEmpty(jSONObject.getString("trade_no"))) {
                    tradeLogicData.setTradeNo(jSONObject.getString("trade_no"));
                    LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "LogicMessageHandlerAdapter.parseResponseRpcData", "params tradeno");
                }
                if (!TextUtils.isEmpty(jSONObject.getString(MspGlobalDefine.UNAME))) {
                    tradeLogicData.setUserName(jSONObject.getString(MspGlobalDefine.UNAME));
                }
                if (!TextUtils.isEmpty(jSONObject.getString(MspGlobalDefine.UURL))) {
                    tradeLogicData.setUserLogoUrl(jSONObject.getString(MspGlobalDefine.UURL));
                }
            }
        } else {
            requestConfig = null;
        }
        if (jSONObject.containsKey("user_id")) {
            mspTradeContext.setServerFoundUserId(jSONObject.getString("user_id"));
        }
        String string = jSONObject.getString("mspParam");
        if (!TextUtils.isEmpty(string)) {
            MspConfig.getInstance().updateLastMspParams(string);
            mspTradeContext.setSpmDpToken(string);
        }
        if (requestConfig == null) {
            if (tradeLogicData == null) {
                return false;
            }
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("mini_app_error", mspTradeContext.getContext().getString(R.string.mini_app_error), new Object[0]), 4));
        } else if (i != 1000) {
            tradeLogicData.setSessionId(requestConfig.getSessionId());
            mspTradeContext.getMspNetHandler().setNetError(false);
            mspTradeContext.getMspNetHandler().setNetErrorCode("");
            mspTradeContext.getStatisticInfo().updateAttr(Vector.Id, "sessionId", requestConfig.getSessionId());
            if (requestConfig.isFirstRequest()) {
                AlertIntelligenceEngine.recordBizInfo(mspTradeContext, "first_rpc_resp_pbv2");
                AlertIntelligenceEngine.recordBizInfoSecond(mspTradeContext, requestConfig.getSessionId());
            }
            return true;
        } else if (!TextUtils.isEmpty(jSONObject.getString(MspFlybirdDefine.FLYBIRD_PKEY))) {
            c(jSONObject);
            a(mspTradeContext);
            return false;
        } else {
            mspTradeContext.getStatisticInfo().addError(ErrorType.DATA, ErrorCode.DATA_GET_RSA_KEY, "缺少RSA-KEY数据");
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 202));
        }
    }

    public static String parseBytesDataToRendData(byte[] bArr, MspTradeContext mspTradeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d517fe", new Object[]{bArr, mspTradeContext});
        }
        if (mspTradeContext == null) {
            return "";
        }
        LogUtil.record(2, "", "HandleResponseDataUtil::parseBytesDataToRendData", "startPay");
        TradeLogicData tradeLogicData = mspTradeContext.getTradeLogicData();
        RequestConfig requestConfig = tradeLogicData != null ? tradeLogicData.getRequestConfig() : null;
        BytesEnvelopDecorator bytesEnvelopDecorator = new BytesEnvelopDecorator(mspTradeContext.getBizId(), new PublicKeyDecorator(mspTradeContext.getBizId(), new BytesEncryptDecorator()));
        bytesEnvelopDecorator.setRequestConfig(requestConfig);
        try {
            String str = (String) bytesEnvelopDecorator.undo(bArr);
            if (tradeLogicData != null) {
                tradeLogicData.setIsSupportGzip(requestConfig.isSupportGzip());
                tradeLogicData.setSessionId(requestConfig.getSessionId());
                tradeLogicData.setUac(requestConfig.getmUac());
                tradeLogicData.setTradeNo(requestConfig.getmTradeNo());
                mspTradeContext.getMspNetHandler().setNetError(false);
                mspTradeContext.getMspNetHandler().setNetErrorCode("");
            }
            return str;
        } catch (PublicKeyException unused) {
            a(mspTradeContext);
            return "";
        }
    }

    public static String parseDynamicHostDataTpRendData(byte[] bArr, MspTradeContext mspTradeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b26bedb", new Object[]{bArr, mspTradeContext});
        }
        LogUtil.record(2, "", "HandleResponseDataUtil::parseDynamicHostDataTpRendData", "startPay");
        TradeLogicData tradeLogicData = mspTradeContext.getTradeLogicData();
        RequestConfig requestConfig = tradeLogicData != null ? tradeLogicData.getRequestConfig() : null;
        JSONObject parseObject = JSON.parseObject(new String(bArr));
        PublicKeyDecorator publicKeyDecorator = new PublicKeyDecorator(mspTradeContext.getBizId(), new DynamicHostEnvelopDecorator());
        publicKeyDecorator.setRequestConfig(requestConfig);
        try {
            String str = (String) publicKeyDecorator.undo(parseObject);
            if (tradeLogicData != null) {
                tradeLogicData.setIsSupportGzip(requestConfig.isSupportGzip());
                tradeLogicData.setSessionId(requestConfig.getSessionId());
                tradeLogicData.setUac(requestConfig.getmUac());
                tradeLogicData.setTradeNo(requestConfig.getmTradeNo());
                mspTradeContext.getMspNetHandler().setNetError(false);
                mspTradeContext.getMspNetHandler().setNetErrorCode("");
            }
            return str;
        } catch (PublicKeyException unused) {
            a(mspTradeContext);
            return "";
        }
    }
}
