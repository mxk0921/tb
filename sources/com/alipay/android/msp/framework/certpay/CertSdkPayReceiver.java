package com.alipay.android.msp.framework.certpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CertSdkPayReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CertSdkPayReceiver certSdkPayReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/certpay/CertSdkPayReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.onReceive", "onReceive");
        if (intent == null) {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.onReceive", "传入LiveConnectReceiver的intent为空，退出");
            return;
        }
        String stringExtra = intent.getStringExtra("certpay_session");
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.onReceive", stringExtra);
        if (!TextUtils.isEmpty(stringExtra)) {
            String stringExtra2 = intent.getStringExtra(MspGlobalDefine.SCHEME_PAY_RESULT);
            try {
                String oldSession = CertPayManager.getInstance(context).getOldSession(stringExtra);
                LogUtil.record(2, "AlipayStore:onMspAction", "oldSession=".concat(String.valueOf(oldSession)));
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(!TextUtils.isEmpty(oldSession) ? Integer.parseInt(oldSession) : -1);
                if (mspContextByBizId instanceof MspTradeContext) {
                    MspTradeContext mspTradeContext = (MspTradeContext) mspContextByBizId;
                    MspPayResult mspPayResult = mspTradeContext.getMspPayResult();
                    if (mspPayResult != null) {
                        mspPayResult.setSourceResult(stringExtra2);
                    }
                    LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.exit", stringExtra2);
                    mspTradeContext.exit(0);
                    return;
                }
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "CertPayExitBizIdError", "CertPayExitBizIdError");
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "CertPayExitException", e);
            }
        }
    }
}
