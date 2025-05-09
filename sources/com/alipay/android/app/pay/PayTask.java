package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.selftest.SelfTestManager;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.framework.certpay.CertPayManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MspAsyncTask;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.net.MalformedURLException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayTask extends MspAsyncTask<Object, Void, MspResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity activity;
    private OnPayListener x;
    private boolean y = false;
    private IAlipayCallback z = new IAlipayCallback() { // from class: com.alipay.android.app.pay.PayTask.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.pay.callback.IAlipayCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32b5bd9d", new Object[]{this, str, str2, new Integer(i), bundle});
                return;
            }
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "PayTask.startActivity", "startActivity, className = " + str2 + ", callingPid = " + i);
            Activity activity = null;
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt(MspBaseActivity.KEY_ID, i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            intent.setClassName(str, str2);
            if (PayTask.access$000(PayTask.this) != null) {
                try {
                    if (!DrmManager.getInstance(PayTask.access$000(PayTask.this)).isDegrade(DrmKey.DEGRADE_START_SDK_ACTIVITY_NEW_TASK, true, PayTask.access$000(PayTask.this))) {
                        intent.addFlags(268435456);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                PayTask.access$000(PayTask.this).startActivity(intent);
                return;
            }
            try {
                MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
                if (tradeContextByBizId != null) {
                    tradeContextByBizId.getStatisticInfo().addError("np", "PayTaskActNull", "bizid=".concat(String.valueOf(i)));
                }
                try {
                    activity = PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity();
                } catch (Throwable unused) {
                }
                if (activity != null) {
                    activity.startActivity(intent);
                } else if (tradeContextByBizId != null) {
                    tradeContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "TopActNull", "bizid=".concat(String.valueOf(i)));
                }
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface CupDirectAppsCallback {
        void onResult(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnPayListener {
        void onPayFailed(Context context, String str, String str2, String str3);

        void onPaySuccess(Context context, String str, String str2, String str3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface TaoBaoOnPayListener extends OnPayListener {
        void onTaoBaoPayFailed(Context context, String str, String str2, String str3, String str4, String str5, String str6);

        void onTaoBaoPaySuccess(Context context, String str, String str2, String str3, String str4, String str5, String str6);
    }

    public PayTask(Activity activity, OnPayListener onPayListener) {
        this.activity = activity;
        this.x = onPayListener;
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "PayTask.PayTask", "PayTask init");
    }

    public static /* synthetic */ Activity access$000(PayTask payTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("51492303", new Object[]{payTask});
        }
        return payTask.activity;
    }

    private MspResult b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResult) ipChange.ipc$dispatch("650c634d", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder("processSDKPay orderInfo = ");
        sb.append(str);
        sb.append(" extendParams = ");
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.hashCode());
        CertPayManager.getInstance(this.activity).initCallBack(sb2.toString(), "");
        String paramsError = Result.getParamsError();
        if (this.activity == null) {
            return new MspResult(paramsError);
        }
        try {
            try {
                if (this.z != null) {
                    MspContextManager.getInstance().registerCallback(this.z, null);
                }
                if (this.y) {
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("&bizcontext=\"{\"biz_type\":\"payment_setting\"}\"");
                    }
                    MspEngine.startPay(new MspPaySession(str, null, false));
                    paramsError = "true";
                } else if (str.startsWith("http")) {
                    paramsError = c(str);
                } else {
                    paramsError = MspEngine.startPay(new MspPaySession(str, str2, false));
                }
                LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "PayTask.processSDKPay", paramsError);
                if (this.z != null) {
                    MspContextManager.getInstance().unregisterAlipayCallback(this.z);
                    CertPayManager.dispose();
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            this.y = false;
            return new MspResult(paramsError);
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        try {
            String[] split = str.split("\\?");
            String str2 = split[0];
            if (!str2.contains("alipay") && !str2.contains("taobao")) {
                throw new MalformedURLException();
            }
            String[] split2 = split[1].split("&");
            return MspEngine.startPay(new MspPaySession(split[0].contains("alipay") ? c(split2) : b(split2), null, false));
        } catch (Exception unused) {
            return Result.getParamsError();
        }
    }

    public static Map<String, Object> decCashierObfs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b1b0467", new Object[]{str});
        }
        return MspEngine.decCashierObfs(str);
    }

    public static JSONObject getPreposeCashierRequestParams(Map<String, String> map, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("520aae1a", new Object[]{map, context});
        }
        return MspEngine.getPreposeCashierRequestParams(map, context);
    }

    public static /* synthetic */ Object ipc$super(PayTask payTask, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute((PayTask) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/pay/PayTask");
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.activity = null;
        this.z = null;
        this.x = null;
    }

    public void manager(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7639a7e", new Object[]{this, str});
            return;
        }
        this.y = true;
        execute(str);
    }

    public void pay(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22352ac3", new Object[]{this, str, str2});
            return;
        }
        "pay orderInfo = ".concat(String.valueOf(str));
        execute(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x0023
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static void getCupDirectApps(android.content.Context r4, com.alipay.android.app.pay.PayTask.CupDirectAppsCallback r5) {
        /*
            r0 = 2
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.app.pay.PayTask.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "35d018f2"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r4
            r4 = 1
            r0[r4] = r5
            r1.ipc$dispatch(r2, r0)
            return
        L_0x0015:
            if (r4 != 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r1 = "phonecashiermsp"
            java.lang.String r2 = "PayTask.getCupDirectApps"
            com.alipay.android.msp.utils.LogUtil.record(r0, r1, r2)
            java.lang.Class<com.alipay.android.msp.biz.thirdpay.CUPThirdPayImpl> r0 = com.alipay.android.msp.biz.thirdpay.CUPThirdPayImpl.class
            goto L_0x0028
        L_0x0023:
            r0 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
            r0 = 0
        L_0x0028:
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            com.alipay.android.app.pay.PayTask$2 r0 = new com.alipay.android.app.pay.PayTask$2     // Catch: all -> 0x0034
            r0.<init>()     // Catch: all -> 0x0034
            com.alipay.android.msp.utils.MQPThirdPayUtils.getCupDirectApps(r4, r0)     // Catch: all -> 0x0034
            return
        L_0x0034:
            r4 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.pay.PayTask.getCupDirectApps(android.content.Context, com.alipay.android.app.pay.PayTask$CupDirectAppsCallback):void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    public MspResult doInBackground(Object... objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResult) ipChange.ipc$dispatch("f31a5ffe", new Object[]{this, objArr});
        }
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "PayTask.doInBackground", "PayTask doInBackground startPay ");
        SelfTestManager.triggerSelfTestAsync(this.activity);
        GlobalConstant.loadProperties(this.activity);
        String str = null;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String obj2 = objArr[0].toString();
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        if (objArr.length >= 2 && (obj = objArr[1]) != null) {
            str = obj.toString();
        }
        return b(obj2, str);
    }

    public void onPostExecute(MspResult mspResult) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a812f1", new Object[]{this, mspResult});
            return;
        }
        super.onPostExecute((PayTask) mspResult);
        if (this.x != null) {
            if (mspResult != null && TextUtils.equals(mspResult.resultStatus, "9000")) {
                OnPayListener onPayListener = this.x;
                if (onPayListener instanceof TaoBaoOnPayListener) {
                    ((TaoBaoOnPayListener) onPayListener).onTaoBaoPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, mspResult.result, mspResult.openTime, mspResult.netError, mspResult.extendInfo);
                } else {
                    onPayListener.onPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, mspResult.result);
                }
            } else if (mspResult == null || !TextUtils.equals(mspResult.resultStatus, "10000")) {
                OnPayListener onPayListener2 = this.x;
                String str3 = "操作已经取消。";
                String str4 = "";
                if (onPayListener2 instanceof TaoBaoOnPayListener) {
                    TaoBaoOnPayListener taoBaoOnPayListener = (TaoBaoOnPayListener) onPayListener2;
                    Activity activity = this.activity;
                    if (mspResult == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(ResultStatus.CANCELED.getStatus());
                        str2 = sb.toString();
                    } else {
                        str2 = mspResult.resultStatus;
                    }
                    if (mspResult != null) {
                        str3 = mspResult.memo;
                    }
                    String str5 = mspResult == null ? str4 : mspResult.result;
                    String str6 = mspResult == null ? str4 : mspResult.openTime;
                    String str7 = mspResult == null ? str4 : mspResult.netError;
                    if (mspResult != null) {
                        str4 = mspResult.extendInfo;
                    }
                    taoBaoOnPayListener.onTaoBaoPayFailed(activity, str2, str3, str5, str6, str7, str4);
                    return;
                }
                Activity activity2 = this.activity;
                if (mspResult == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ResultStatus.CANCELED.getStatus());
                    str = sb2.toString();
                } else {
                    str = mspResult.resultStatus;
                }
                if (mspResult != null) {
                    str3 = mspResult.memo;
                }
                if (mspResult != null) {
                    str4 = mspResult.result;
                }
                onPayListener2.onPayFailed(activity2, str, str3, str4);
            } else {
                String str8 = mspResult.result;
                if (!TextUtils.isEmpty(str8)) {
                    str8 = str8.replace("BANK_CARD-", "BANK_CARD;");
                }
                OnPayListener onPayListener3 = this.x;
                if (onPayListener3 instanceof TaoBaoOnPayListener) {
                    ((TaoBaoOnPayListener) onPayListener3).onTaoBaoPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, str8, mspResult.openTime, mspResult.netError, mspResult.extendInfo);
                } else {
                    onPayListener3.onPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, str8);
                }
            }
        }
    }

    public void pay(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8c49cd", new Object[]{this, str, str2, str3});
            return;
        }
        "payWithParams orderInfo = ".concat(String.valueOf(str));
        "payWithParams extendParams = ".concat(String.valueOf(str2));
        execute(str, str2);
    }

    private static String c(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be5c5fcb", new Object[]{strArr});
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        for (String str5 : strArr) {
            if (str5.contains("sid")) {
                str = str5.substring(str5.indexOf(Constants.SIDW) + 4);
            } else if (str5.contains("trade_no")) {
                str2 = str5.substring(str5.indexOf("trade_no=") + 9);
            } else if (str5.contains("appevn")) {
                str3 = str5.substring(str5.indexOf("appevn=") + 7);
            } else if (str5.contains("payPhaseId")) {
                str4 = str5.substring(str5.indexOf("payPhaseId=") + 11);
            }
        }
        String str6 = "extern_token=\"" + str + "\"&trade_no=\"" + str2 + "\"&app_name=\"tb\"&partner=\"TAOBAO_PARTNER_ORDER\"";
        if (!TextUtils.isEmpty(str3)) {
            str6 = str6 + "&appevn=\"" + str3 + "\"";
        }
        if (TextUtils.isEmpty(str4)) {
            return str6;
        }
        return str6 + "&payPhaseId=\"" + str4 + "\"";
    }

    private static String b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31bc34ca", new Object[]{strArr});
        }
        for (String str : strArr) {
            if (str.contains("signStr")) {
                return str.substring(str.indexOf("signStr=") + 8);
            }
        }
        return null;
    }
}
