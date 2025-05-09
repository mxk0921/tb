package com.alipay.android.msp.pay;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.encrypt.TriDes;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspByPassProcessor;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.network.http.http.PhoneCashierHttpClient;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.logging.api.LogCustomerControl;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.customer.LogUploadInfo;
import com.alipay.mobile.common.logging.api.customer.LogWriteInfo;
import com.alipay.mobile.common.logging.api.customer.UploadResultInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspPayClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspTradeContext f3715a;
    public final MspPayResult b;
    public boolean c = false;
    public boolean d = false;
    public final int mBizId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface CheckPayResult {
        public static final String CONTINUE = "continue";
        public static final String DUP_5S = "pay_ns_dup";
        public static final String NOT_LOGIN = "pay_login";
    }

    public MspPayClient(MspTradeContext mspTradeContext) {
        this.mBizId = mspTradeContext.getBizId();
        this.f3715a = mspTradeContext;
        this.b = mspTradeContext.getMspPayResult();
    }

    public static /* synthetic */ MspTradeContext access$000(MspPayClient mspPayClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("d40c0d0e", new Object[]{mspPayClient});
        }
        return mspPayClient.f3715a;
    }

    public void exitWithoutPage() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90310380", new Object[]{this});
            return;
        }
        MspTradeContext mspTradeContext = this.f3715a;
        if (mspTradeContext != null) {
            if (mspTradeContext.getOrderInfo() != null) {
                MspContextManager.getInstance().removeRawBizId(this.f3715a.getOrderInfo().hashCode());
            }
            MspPayResult mspPayResult = this.b;
            if (mspPayResult != null) {
                str = mspPayResult.formatResult(1);
            } else {
                str = "";
            }
            a(str);
        }
    }

    public final void b(String str, String str2, Context context) {
        String str3;
        String str4;
        MspPaySession.SchemePayModel schemePayModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d63e1cc", new Object[]{this, str, str2, context});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        String sb2 = sb.toString();
        Intent intent = new Intent(MspGlobalDefine.SCHEME_PAY_ACTION);
        MspPaySession paySession = this.f3715a.getPaySession();
        if (paySession == null || (schemePayModel = paySession.getSchemePayModel()) == null) {
            str3 = null;
            str4 = null;
        } else {
            str3 = schemePayModel.desKey;
            str4 = schemePayModel.packageName;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(str4)) {
                intent.setPackage(str4);
            }
            intent.putExtra(MspGlobalDefine.SCHEME_PAY_SESSION, TriDes.encrypt(str3, sb2));
            intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, TriDes.encrypt(str3, str2));
            LogUtil.record(4, "MspPayClient:sendSchemePayResult", "mCtx=" + this.f3715a);
            context.sendBroadcast(intent);
        }
    }

    public final String f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bd66cb2", new Object[]{this, str, new Integer(i)});
        }
        if (d(this.f3715a, i, this.mBizId)) {
            return CheckPayResult.DUP_5S;
        }
        Context context = this.f3715a.getContext();
        if (context != null) {
            context.getPackageName();
        }
        this.f3715a.isFromWallet();
        PhoneCashierMspEngine.getMspWallet().clearCheckLoginStatus();
        this.f3715a.setPaying(true);
        MspContextManager.getInstance().clearFingerPayTask(this.f3715a, str);
        if (!this.f3715a.isFromWallet()) {
            PhoneCashierMspEngine.getMspViSec().cleanFpCache();
        }
        try {
            if (GlobalSdkConstant.getSdkType()) {
                return "continue";
            }
            LoggerFactory.getLogContext().setLogCustomerControl(new LogCustomerControl() { // from class: com.alipay.android.msp.pay.MspPayClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.logging.api.LogCustomerControl
                public UploadResultInfo isLogUpload(LogUploadInfo logUploadInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (UploadResultInfo) ipChange2.ipc$dispatch("13849b1", new Object[]{this, logUploadInfo});
                    }
                    UploadResultInfo uploadResultInfo = new UploadResultInfo();
                    uploadResultInfo.isUpload = false;
                    return uploadResultInfo;
                }

                @Override // com.alipay.mobile.common.logging.api.LogCustomerControl
                public boolean isLogWrite(LogWriteInfo logWriteInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8dc020d8", new Object[]{this, logWriteInfo})).booleanValue();
                    }
                    return true;
                }
            });
            return "continue";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "continue";
        }
    }

    public final void g(String str, String str2) {
        String str3;
        String str4;
        String str5;
        MspPaySession.CertPayModel certPayModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b99188", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        String sb2 = sb.toString();
        MspPaySession paySession = this.f3715a.getPaySession();
        if (paySession == null || (certPayModel = paySession.getCertPayModel()) == null) {
            str4 = null;
            str5 = null;
            str3 = null;
        } else {
            str4 = certPayModel.pid;
            str3 = certPayModel.packageName;
            str5 = certPayModel.callbackUrl;
        }
        if (!TextUtils.isEmpty(str4) && !str.contains("biz_type=\"share_pp\"")) {
            try {
                Context context = this.f3715a.getContext();
                Intent intent = new Intent("com.alipay.android.app.certpayresult");
                intent.putExtra("certpay_session", sb2);
                intent.putExtra(MspGlobalDefine.SCHEME_PAY_RESULT, str2);
                if (!TextUtils.isEmpty(str3)) {
                    intent.setPackage(str3);
                }
                LogUtil.record(2, "MspPayClient:sendCertPayResult", "mspCtx=" + this.f3715a);
                context.sendBroadcast(intent);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (!DeviceInfo.isProcessExit(this.f3715a.getContext(), str4)) {
                try {
                    PhoneCashierMspEngine.getMspJump().processScheme(str5);
                } catch (Exception e2) {
                    LogUtil.printExceptionStackTrace(e2);
                }
            }
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd94b9dd", new Object[]{this, str});
        } else if (!this.d) {
            this.d = true;
            if (!GlobalSdkConstant.getSdkType()) {
                try {
                    LoggerFactory.getLogContext().setLogCustomerControl(null);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            MspTradeContext mspTradeContext = this.f3715a;
            if (mspTradeContext != null) {
                if (str != null) {
                    mspTradeContext.getStatisticInfo().updateResult(str, this.f3715a.getCurrentWinTpName());
                } else {
                    mspTradeContext.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_PAY_RESULT_NULL, ErrorCode.DEFAULT_PAY_RESULT_NULL);
                }
                try {
                    this.f3715a.isFromWallet();
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
            final MspTradeContext mspTradeContext2 = this.f3715a;
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.pay.MspPayClient.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspTradeContext mspTradeContext3 = mspTradeContext2;
                    if (mspTradeContext3 != null) {
                        mspTradeContext3.getStatisticInfo().updateBiz(mspTradeContext2.getClientLogData());
                        mspTradeContext2.getStatisticInfo().updateAttr(Vector.Device, "oaid", PhoneCashierMspEngine.getMspBase().getOaid(mspTradeContext2.getContext()));
                        mspTradeContext2.getStatisticInfo().onStatisticEnd();
                    }
                }
            }, 300L);
            Context context = mspTradeContext2.getContext();
            if (context == null || !DrmManager.getInstance(context).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, context)) {
                TaskHelper.execute(monitorRunnable, 300L);
            } else {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 300L, TaskHelper.ThreadName.UI_CONTEXT);
            }
            LogUtil.record(4, "phonecashiermsp#MspService", "PayEntrance.onPayEnd");
            String str2 = "";
            if (!this.c) {
                String globalSession = (this.f3715a == null || mspTradeContext2.getGlobalSession() == null) ? str2 : mspTradeContext2.getGlobalSession();
                LogUtil.record(4, "PayEntrance.onPayEnd", " ,sessionId=".concat(String.valueOf(globalSession)));
                BroadcastUtil.sendEndBroadcast(GlobalHelper.getInstance().getContext(), globalSession, this.f3715a, str);
            }
            if (PhoneCashierHttpClient.isNeedShutdownAtPayEnd()) {
                LogUtil.record(4, "PayEntrance.onPayEnd", "net cost too long:shutdown");
                try {
                    PhoneCashierHttpClient.newInstance().shutdown();
                } catch (Throwable th3) {
                    LogUtil.printExceptionStackTrace(th3);
                }
                PhoneCashierHttpClient.setIsNeedShutdownAtPayEnd(false);
            }
            PluginManager.getDnsEngine().updateDns();
            if (this.f3715a != null) {
                FlybirdUtil.initHTTPDNS(mspTradeContext2);
                this.f3715a.setPaying(false);
            }
            try {
                MspContextManager.getInstance().removeMspContextByBizId(this.mBizId);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (MspByPassProcessor.isUpdateSceneEnabled("scene4")) {
                MspByPassProcessor.getInstance().triggerByPassProcess(LogItem.TemplateUpdateScene.CashierExit);
            }
            MspPayResult mspPayResult = this.b;
            if (mspPayResult != null) {
                str2 = mspPayResult.getEndCode();
            }
            SpmHelper.spmExpPayActionEnd(this.f3715a, str2);
        }
    }

    public final void e() {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
            return;
        }
        MspTradeContext mspTradeContext = this.f3715a;
        if (mspTradeContext != null) {
            String orderInfo = mspTradeContext.getOrderInfo();
            if (!TextUtils.isEmpty(orderInfo)) {
                MspPaySession paySession = this.f3715a.getPaySession();
                boolean z = paySession != null && paySession.isFromWalletH5Pay();
                boolean z2 = orderInfo.contains("h5_route_token=\"") && orderInfo.contains("is_h5_route=\"true\"") && !z;
                if (orderInfo.contains("isMoveTaskToBack=\"true\"")) {
                    z2 = true;
                }
                if (!TextUtils.isEmpty((paySession == null || paySession.getCertPayModel() == null) ? null : paySession.getCertPayModel().pid) && !orderInfo.contains("external_spec_action=\"/shareppay/sendMsg\"")) {
                    z2 = true;
                }
                if (this.f3715a.isSchemePay()) {
                    z2 = true;
                }
                String[] split = orderInfo.split("&");
                int length = split.length;
                while (true) {
                    if (i >= length) {
                        str = null;
                        break;
                    }
                    str = split[i];
                    if (!TextUtils.isEmpty(str) && str.startsWith("bizcontext=")) {
                        break;
                    }
                    i++;
                }
                if (!TextUtils.isEmpty(str) && str.contains("\"fromH5\":\"true\"") && !z) {
                    z2 = true;
                }
                String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GO_WHERE_FROM_ON_PAY_END);
                String outPackageName = this.f3715a.getOutPackageName();
                String sceneType = paySession != null ? paySession.getSceneType() : null;
                boolean isConfigJsonContainsTarget = Utils.isConfigJsonContainsTarget(walletConfig, outPackageName, "blackPkg", "whitePkg", "all");
                boolean equals = "h5Route".equals(sceneType);
                LogUtil.record(2, "MspPayClient:tryMoveTaskToBack", "needJumpBack=" + isConfigJsonContainsTarget + ", isMoveTaskToBack=" + z2 + ", orderSceneType=" + sceneType);
                if (isConfigJsonContainsTarget && z2) {
                    try {
                        if (PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity() != null) {
                            Intent launchIntentForPackage = PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity().getPackageManager().getLaunchIntentForPackage(outPackageName);
                            if (launchIntentForPackage != null) {
                                launchIntentForPackage.setPackage(null);
                                PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity().startActivity(launchIntentForPackage);
                            }
                            this.f3715a.getMspPayResult().setWontCallbackUrlJump(true);
                            EventLogUtil.logPayEvent("1010469", "packageName", outPackageName, "scene", sceneType);
                            return;
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
                if (!equals && z2) {
                    try {
                        if (PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity() != null) {
                            PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity().moveTaskToBack(true);
                        }
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
        if (r5 != r6) goto L_0x0111;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x000c, B:10:0x0030, B:12:0x0042, B:13:0x0044, B:15:0x004e, B:17:0x0058, B:19:0x0062, B:22:0x006c, B:24:0x007e, B:26:0x0089, B:27:0x00a5, B:29:0x00cb, B:31:0x00d1, B:32:0x00dc, B:38:0x00fb, B:41:0x0105, B:46:0x0115, B:48:0x011b, B:52:0x0124, B:54:0x014c, B:55:0x0154, B:57:0x016d, B:58:0x0170, B:60:0x0181, B:62:0x0190, B:64:0x0196, B:65:0x019e, B:67:0x01a4, B:69:0x01ae, B:71:0x01b6, B:72:0x01c3, B:74:0x01e1), top: B:79:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean d(com.alipay.android.msp.core.context.MspTradeContext r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.pay.MspPayClient.d(com.alipay.android.msp.core.context.MspTradeContext, int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x020c, code lost:
        if (r11.f3715a.isSchemePay() != false) goto L_0x020e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020e, code lost:
        b(r4, r0, r11.f3715a.getContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0217, code lost:
        e();
        a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0256, code lost:
        if (r11.f3715a.isSchemePay() == false) goto L_0x0217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025b, code lost:
        return r11.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.msp.pay.results.MspPayResult pay() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.pay.MspPayClient.pay():com.alipay.android.msp.pay.results.MspPayResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x016e A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x000c, B:6:0x0012, B:10:0x003b, B:15:0x0051, B:16:0x007c, B:18:0x00ac, B:20:0x00c5, B:23:0x00cd, B:26:0x00da, B:32:0x00f9, B:35:0x0122, B:37:0x012c, B:40:0x0136, B:42:0x013c, B:44:0x0142, B:46:0x0148, B:50:0x0150, B:52:0x015a, B:54:0x0160, B:55:0x0168, B:57:0x016e, B:59:0x0178, B:62:0x0183, B:65:0x019a, B:67:0x01b9, B:68:0x01d5, B:70:0x0226), top: B:77:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x000c, B:6:0x0012, B:10:0x003b, B:15:0x0051, B:16:0x007c, B:18:0x00ac, B:20:0x00c5, B:23:0x00cd, B:26:0x00da, B:32:0x00f9, B:35:0x0122, B:37:0x012c, B:40:0x0136, B:42:0x013c, B:44:0x0142, B:46:0x0148, B:50:0x0150, B:52:0x015a, B:54:0x0160, B:55:0x0168, B:57:0x016e, B:59:0x0178, B:62:0x0183, B:65:0x019a, B:67:0x01b9, B:68:0x01d5, B:70:0x0226), top: B:77:0x000c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean c(int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.pay.MspPayClient.c(int, int, int):boolean");
    }
}
