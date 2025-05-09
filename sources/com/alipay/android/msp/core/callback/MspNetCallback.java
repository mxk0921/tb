package com.alipay.android.msp.core.callback;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.HandleResponseDataUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.network.model.CustomCallback;
import com.alipay.android.msp.network.model.NetResponseData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspNetCallback extends CustomCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspTradeContext f3541a;
    public RequestConfig b;

    public MspNetCallback(MspTradeContext mspTradeContext) {
        this.f3541a = mspTradeContext;
    }

    public static /* synthetic */ Object ipc$super(MspNetCallback mspNetCallback, String str, Object... objArr) {
        if (str.hashCode() == 2035146358) {
            return super.onReqEnd((NetResponseData) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/callback/MspNetCallback");
    }

    @Override // com.alipay.android.msp.network.model.CustomCallback
    public CustomCallback.WhatNext onBuildRequestConfig(RequestConfig requestConfig) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback.WhatNext) ipChange.ipc$dispatch("a3149ad9", new Object[]{this, requestConfig});
        }
        MspTradeContext mspTradeContext = this.f3541a;
        if (mspTradeContext != null) {
            mspTradeContext.setSubmitState(true);
        }
        this.b = requestConfig;
        MspTradeContext mspTradeContext2 = this.f3541a;
        if (mspTradeContext2 == null || !mspTradeContext2.isUpgradePreRendTpl()) {
            MspTradeContext mspTradeContext3 = this.f3541a;
            if (!(mspTradeContext3 == null || requestConfig == null || requestConfig.isFirstRequest())) {
                try {
                    MspBasePresenter mspBasePresenter = mspTradeContext3.getMspBasePresenter();
                    if (!(mspBasePresenter == null || (activity = mspBasePresenter.getActivity()) == null)) {
                        PreRendManager.getInstance().preRendTpl(activity, mspTradeContext3.getBizId(), requestConfig.getActionJson(), null, "network");
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        } else if (TextUtils.equals("cashier", requestConfig.getType()) && TextUtils.equals("main", requestConfig.getMethod()) && this.f3541a.getContext() != null) {
            MspRender.triggerPreRenderQUICKPAY(MspFlybirdDefine.FLYBIRD_HOME_TPL, this.f3541a.getContext().getApplicationContext());
        }
        return CustomCallback.WhatNext.CONTINUE;
    }

    @Override // com.alipay.android.msp.network.model.CustomCallback
    public CustomCallback.WhatNext onReqException(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback.WhatNext) ipChange.ipc$dispatch("68312b45", new Object[]{this, th});
        }
        MspTradeContext mspTradeContext = this.f3541a;
        if (mspTradeContext != null) {
            mspTradeContext.setSubmitState(false);
            RequestConfig requestConfig = this.b;
            if (requestConfig != null) {
                if (requestConfig.isFirstRequest()) {
                    str = "/cashier/main";
                } else if (!TextUtils.isEmpty(this.b.getActionJson())) {
                    try {
                        str = JSON.parseObject(this.b.getActionJson()).getString("name");
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
                SpmHelper.spmExpSubmitResponse(this.f3541a, str, "true", null, false);
            }
            str = "";
            SpmHelper.spmExpSubmitResponse(this.f3541a, str, "true", null, false);
        }
        return CustomCallback.WhatNext.CONTINUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:57|10|(6:19|(4:21|(1:23)(1:26)|27|(1:29)(2:30|31))(1:32)|56|34|(3:39|40|(1:42)(2:45|(1:47)(1:48)))|50)|33|56|34|(1:36)(4:37|39|40|(0)(0))|50) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9 A[Catch: Exception -> 0x00e0, TRY_ENTER, TryCatch #0 {Exception -> 0x00e0, blocks: (B:34:0x00be, B:37:0x00c3, B:39:0x00c9, B:42:0x00d9, B:45:0x00e2, B:47:0x00ea, B:48:0x00f1), top: B:56:0x00be, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:34:0x00be, B:37:0x00c3, B:39:0x00c9, B:42:0x00d9, B:45:0x00e2, B:47:0x00ea, B:48:0x00f1), top: B:56:0x00be, outer: #1 }] */
    @Override // com.alipay.android.msp.network.model.CustomCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.msp.network.model.CustomCallback.WhatNext onReqEnd(com.alipay.android.msp.network.model.NetResponseData r7) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.callback.MspNetCallback.onReqEnd(com.alipay.android.msp.network.model.NetResponseData):com.alipay.android.msp.network.model.CustomCallback$WhatNext");
    }

    public final CustomCallback.WhatNext a(NetResponseData netResponseData, StEvent stEvent) throws AppErrorException {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomCallback.WhatNext) ipChange.ipc$dispatch("458c0b64", new Object[]{this, netResponseData, stEvent});
        }
        ResData response = netResponseData.getResponse();
        RequestConfig config = netResponseData.getRequest().getConfig();
        try {
            jSONObject = response.toJsonData();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            jSONObject = null;
        }
        NativeDynFunManager.processWithFallbackAsync(this.f3541a.getBizId(), DynConstants.DynFunNames.F_RESOLVE_RES, new Object[]{jSONObject, "rpc"}, NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
        if (jSONObject == null) {
            return CustomCallback.WhatNext.TERMINATE;
        }
        LogUtil.record(2, "MspNetCallback:onRpcResponse", "response not null");
        DrmManager.getInstance(this.f3541a.getContext()).onUpdate(jSONObject);
        TradeLogicData tradeLogicData = this.f3541a.getTradeLogicData();
        if (tradeLogicData == null) {
            return CustomCallback.WhatNext.TERMINATE;
        }
        if (jSONObject.containsKey("mspParam")) {
            tradeLogicData.setLdcHeaders(jSONObject.getString("mspParam"));
            LogUtil.record(4, "MspNetCallback.onReqEnd", "mspParam" + jSONObject.getString("mspParam"));
        }
        if (jSONObject.containsKey("resultStatus")) {
            String string = jSONObject.getString("resultStatus");
            if (TextUtils.equals(string, "1002") || TextUtils.equals(string, "1003")) {
                ExceptionUtils.sendUiMsgWhenException(this.f3541a.getBizId(), new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("flybird_mobilegwerror_tips", this.f3541a.getContext().getString(R.string.flybird_mobilegwerror_tips), new Object[0]), 303)));
            }
        }
        if (config.isPbv3ForSdk() || config.isPbv2() || config.isPbv3()) {
            if (HandleResponseDataUtil.handlePbV2Data(jSONObject, this.f3541a)) {
                ActionsCreator.get(this.f3541a).createUIShowAction(jSONObject, false, stEvent);
            }
        } else if (config.isPbV1()) {
            String parsePbV1DataToRendData = HandleResponseDataUtil.parsePbV1DataToRendData(jSONObject, this.f3541a);
            if (!TextUtils.isEmpty(parsePbV1DataToRendData)) {
                ActionsCreator.get(this.f3541a).createUIShowAction(JSON.parseObject(parsePbV1DataToRendData), false, stEvent);
            } else {
                throw new AppErrorException(ExceptionUtils.createExceptionMsg(206));
            }
        }
        RequestConfig requestConfig = this.b;
        if (requestConfig != null) {
            if (requestConfig.isFirstRequest()) {
                str = "/cashier/main";
            } else if (!TextUtils.isEmpty(this.b.getActionJson())) {
                try {
                    str = JSON.parseObject(this.b.getActionJson()).getString("name");
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            SpmHelper.spmExpSubmitResponse(this.f3541a, str, "false", jSONObject.getString("end_code"), false);
            return CustomCallback.WhatNext.CONTINUE;
        }
        str = "";
        SpmHelper.spmExpSubmitResponse(this.f3541a, str, "false", jSONObject.getString("end_code"), false);
        return CustomCallback.WhatNext.CONTINUE;
    }
}
