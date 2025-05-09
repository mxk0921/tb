package com.alipay.android.msp.core.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CertPayReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CertPayReceiver certPayReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/component/CertPayReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertPayReceiver.onReceive", "CertPayReceiver，退出");
        } else {
            try {
                String stringExtra = intent.getStringExtra("certpay_session");
                if (!TextUtils.isEmpty(stringExtra) && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(CashierSceneDictionary.getInstance().getCertPayBizId(stringExtra))) != null) {
                    ActionsCreator.get(mspContextByBizId).createEventAction(new EventAction("exit"));
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
