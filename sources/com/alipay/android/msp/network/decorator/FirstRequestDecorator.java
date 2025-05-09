package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.UserLocation;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FirstRequestDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String exteranl = "partner=\"\"&extern_token=\"GZ00UU9M9BtHDxKTeWXXwFWcG6bHe1mobilegwGZ00\"&logon_id=\"15997894630\"&biz_type=\"setting\"&biz_sub_type=\"\"&app_name=\"alipay\"&user_id=2088102140781758&page_id=0";

    public FirstRequestDecorator() {
    }

    public static /* synthetic */ Object ipc$super(FirstRequestDecorator firstRequestDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/FirstRequestDecorator");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public String undo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f39cf9", new Object[]{this, obj});
        }
        return null;
    }

    public FirstRequestDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IChannelInfo channelInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
        String str2 = new String(bArr);
        final GlobalHelper instance = GlobalHelper.getInstance();
        JSONObject jSONObject = new JSONObject();
        RequestConfig requestConfig = this.mRequestConfig;
        if (requestConfig != null && requestConfig.hasTryLogin()) {
            jSONObject.put(MspFlybirdDefine.FLYBIRD_LOGIN, (Object) "1");
        }
        jSONObject.put("tid", (Object) TidStorage.getInstance().getTid());
        String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(instance.getContext());
        if (TextUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 2));
        } else {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 1));
        }
        jSONObject.put(MspGlobalDefine.DECAY, (Object) PhoneCashierMspEngine.getMspWallet().getExtractData());
        jSONObject.put(MspGlobalDefine.HAS_ALIPAY, (Object) Boolean.valueOf(DeviceInfo.hasAlipayWallet(instance.getContext())));
        jSONObject.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str2);
        jSONObject.put("user_id", (Object) MspContextUtil.getUserId());
        jSONObject.put(MspGlobalDefine.PA, (Object) MspConfig.getInstance().getPa(instance.getContext()));
        if (OrderInfoUtil.isOutTradeOrder(str2)) {
            jSONObject.put(MspGlobalDefine.EXTOK, (Object) PhoneCashierMspEngine.getMspWallet().getAuthToken());
        }
        String engineParams = PluginManager.getRender().getEngineParams();
        if (engineParams.contains("||")) {
            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "FirstRequestDecorator.todo", "bpArgsError:".concat(engineParams));
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_BP_ARGS_ERROR, "bp:".concat(engineParams));
            }
        }
        jSONObject.put(MspGlobalDefine.LANG, (Object) Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes())));
        jSONObject.put("bp", (Object) engineParams);
        jSONObject.put(MspGlobalDefine.TRID, (Object) PhoneCashierMspEngine.getMspWallet().getTrId());
        MspInitAssistService sdkInstance = MspInitAssistService.getSdkInstance();
        if (!(sdkInstance == null || (channelInfo = sdkInstance.getChannelInfo()) == null)) {
            jSONObject.put(MspGlobalDefine.APP_KEY, (Object) channelInfo.getAppKey());
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(this.mRequestConfig.getBizId());
        if (tradeContextByBizId == null || !tradeContextByBizId.isFromWallet() || tradeContextByBizId.isFromOutScheme()) {
            jSONObject.put(MspFlybirdDefine.TRDFROM, (Object) "0");
        } else {
            jSONObject.put(MspFlybirdDefine.TRDFROM, (Object) "1");
        }
        jSONObject.put("utdid", (Object) instance.getUtdid(instance.getContext()));
        jSONObject.put(MspNetConstants.Request.NEW_CLIENT_KEY, (Object) TidStorage.getInstance().genClientKey());
        MspHardwarePayUtil.getInstance().initHardwarePay(instance.getContext(), this.mBizId, jSONObject);
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.network.decorator.FirstRequestDecorator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UserLocation.locationInit(instance.getContext(), Utils.shouldGetLocationInfo(instance.getContext()));
                }
            }
        });
        JSONObject jSONObject2 = new JSONObject();
        if (str2.contains("sina") && str2.contains("payment_setting")) {
            jSONObject2.put("type", (Object) "cashier");
            jSONObject2.put("method", (Object) "main");
        } else if (str2.contains(BizContext.KEY_SETTING_FILTER)) {
            jSONObject2.put("type", (Object) BizContext.KEY_SETTING_FILTER);
            jSONObject2.put("method", (Object) "list");
        } else {
            jSONObject2.put("type", (Object) this.mRequestConfig.getType());
            jSONObject2.put("method", (Object) this.mRequestConfig.getMethod());
        }
        jSONObject.put("action", (Object) jSONObject2);
        jSONObject.put("gzip", (Object) Boolean.valueOf(this.mRequestConfig.isSupportGzip()));
        jSONObject.put(MspGlobalDefine.INSIDE_ENV, (Object) this.mRequestConfig.getExtendParams(MspGlobalDefine.EXT_INSIDE_ENV));
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "FirstRequestDecorator.todo", "FirstRequest:".concat(String.valueOf(jSONObject)));
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return jSONObject.toString().getBytes();
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.todo(jSONObject.toString().getBytes(), str);
    }
}
