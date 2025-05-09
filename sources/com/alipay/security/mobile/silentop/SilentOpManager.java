package com.alipay.security.mobile.silentop;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.util.AsyncCall;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SilentOpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void access$000(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c002b8c5", new Object[]{context, str, str2});
        } else {
            submitResponse(context, str, str2);
        }
    }

    private static void silentRegIFAA(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269b4825", new Object[]{context});
        } else if (IFAAManagerAdaptor.isIgnoreFpIndex(context)) {
            AuthenticatorLOG.fpInfo("silentRegIFAA");
            AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(2, SilentOpDataHelper.getInstance().getRegInfo());
            authenticatorMessage.setAuthenticatorType(Constants.TYPE_FINGERPRINT);
            authenticatorMessage.setId(SilentOpDataHelper.getInstance().getBizID());
            AuthenticatorManager.getInstance(context).startAuth(context, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    } else if (authenticatorResponse.getResult() == 100) {
                        SilentOpManager.access$000(context, authenticatorResponse.getData(), SilentOpDataHelper.CMD_SILENT_REG_IFAA);
                    }
                }
            }, null);
        }
    }

    private static void silentRegKM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c23a1a8", new Object[0]);
        }
    }

    private static void silentUpdateKM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cedbe7", new Object[0]);
        }
    }

    private static void submitResponse(final Context context, final String str, final String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696e8c5c", new Object[]{context, str, str2});
            return;
        }
        SilenceRpcResult silenceRpcResult = (SilenceRpcResult) new AsyncCall() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.3
        }.callFunc(new FutureTask(new Callable<SilenceRpcResult>() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
                if (r2.equals("register") != false) goto L_0x004c;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[ADDED_TO_REGION] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.alipay.security.mobile.silentop.SilenceRpcResult call() {
                /*
                    r5 = this;
                    r0 = 0
                    r1 = 1
                    com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.security.mobile.silentop.SilentOpManager.AnonymousClass2.$ipChange
                    boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r3 == 0) goto L_0x0015
                    java.lang.String r3 = "c765b5fb"
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r0] = r5
                    java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
                    com.alipay.security.mobile.silentop.SilenceRpcResult r0 = (com.alipay.security.mobile.silentop.SilenceRpcResult) r0
                    return r0
                L_0x0015:
                    java.lang.String r2 = r1
                    int r3 = r2.hashCode()
                    r4 = -1561676218(0xffffffffa2eab646, float:-6.3618817E-18)
                    if (r3 == r4) goto L_0x0040
                    r4 = -690213213(0xffffffffd6dc2ea3, float:-1.21046431E14)
                    if (r3 == r4) goto L_0x0036
                    r0 = 1440705988(0x55df6dc4, float:3.07078166E13)
                    if (r3 == r0) goto L_0x002b
                    goto L_0x004b
                L_0x002b:
                    java.lang.String r0 = "ifaa_v2_register"
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto L_0x004b
                    r0 = 1
                    goto L_0x004c
                L_0x0036:
                    java.lang.String r3 = "register"
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L_0x004b
                    goto L_0x004c
                L_0x0040:
                    java.lang.String r0 = "km_update"
                    boolean r0 = r2.equals(r0)
                    if (r0 == 0) goto L_0x004b
                    r0 = 2
                    goto L_0x004c
                L_0x004b:
                    r0 = -1
                L_0x004c:
                    if (r0 == 0) goto L_0x0052
                    if (r0 == r1) goto L_0x0052
                    r0 = 0
                    return r0
                L_0x0052:
                    com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl r0 = new com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl
                    android.content.Context r1 = r2
                    r0.<init>(r1)
                    java.lang.Class<com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi> r1 = com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi.class
                    java.lang.Object r1 = r0.getRpcProxy(r1)
                    com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi r1 = (com.alipay.security.mobile.silentop.MobileBiometricSilenceOpenClientApi) r1
                    com.alipay.mobile.common.rpc.RpcInvokeContext r0 = r0.getRpcInvokeContext(r1)
                    com.alipay.security.mobile.rpc.ReadSettingServerUrl r2 = com.alipay.security.mobile.rpc.ReadSettingServerUrl.getInstance()
                    android.content.Context r3 = r2
                    java.lang.String r2 = r2.getGWFURL(r3)
                    r0.setGwUrl(r2)
                    com.alipay.security.mobile.silentop.BiometricSilenceOperationSubmitData r0 = new com.alipay.security.mobile.silentop.BiometricSilenceOperationSubmitData
                    r0.<init>()
                    java.lang.String r2 = r3
                    r0.bizData = r2
                    com.alipay.security.mobile.silentop.SilentOpDataHelper r2 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
                    java.lang.String r2 = r2.getBizID()
                    r0.bizId = r2
                    android.content.Context r2 = r2
                    java.lang.String r2 = com.alipay.security.mobile.cache.AuthenticatorModel.getTempUserId(r2)
                    r0.userId = r2
                    android.content.Context r2 = r2
                    com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager r2 = com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.getInstance(r2)
                    java.lang.String r3 = r0.userId
                    java.lang.String r2 = r2.getSecData(r3)
                    r0.secData = r2
                    com.alipay.security.mobile.silentop.SilentOpDataHelper r2 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
                    com.alipay.security.mobile.silentop.IfaaProductInfoData r2 = r2.getProductInfo()
                    r0.ifaaProductInfoData = r2
                    com.alipay.security.mobile.silentop.SilenceRpcResult r0 = r1.doSilenceRegisterWithResult(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.silentop.SilentOpManager.AnonymousClass2.call():com.alipay.security.mobile.silentop.SilenceRpcResult");
            }
        }), 10000);
        if (!SilentOpDataHelper.CMD_SILENT_REG_IFAA.equals(str2)) {
            return;
        }
        if (silenceRpcResult == null || !silenceRpcResult.isSuccess()) {
            try {
                if (("silent reg ifaa err: " + silenceRpcResult) != null) {
                    str3 = silenceRpcResult.getMessage();
                } else {
                    str3 = "silenceRpcResult null";
                }
                AuthenticatorLOG.debug(str3);
                AuthenticatorLOG.fpInfo("DeReg IFAA");
                String deregInfo = SilentOpDataHelper.getInstance().getDeregInfo();
                if (TextUtils.isEmpty(deregInfo)) {
                    AuthenticatorLOG.fpInfo("DeReg IFAA err,dereinfo is null");
                } else {
                    AuthenticatorManager.getInstance(context).startDeReg(context, deregInfo, Constants.TYPE_FINGERPRINT, new AuthenticatorCallback() { // from class: com.alipay.security.mobile.silentop.SilentOpManager.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                        public void callback(AuthenticatorResponse authenticatorResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            } else if (authenticatorResponse.getResult() == 100) {
                                AuthenticatorLOG.fpInfo("DeReg IFAA succ");
                            } else {
                                AuthenticatorLOG.fpInfo("DeReg IFAA failed,code " + authenticatorResponse.getResult());
                            }
                        }
                    });
                }
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo("silenceRpcResult is null. e = " + e.toString());
            }
        } else {
            AuthenticatorLOG.fpInfo("Silent reg IFAA succ");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r2.equals(com.alipay.security.mobile.silentop.SilentOpDataHelper.CMD_KM_FP_UPDATE) == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void doSilentOp(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.security.mobile.silentop.SilentOpManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "2a246e00"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "doSilentOp:"
            r2.<init>(r3)
            com.alipay.security.mobile.silentop.SilentOpDataHelper r3 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
            java.lang.String r3 = r3.getOpCmd()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r2)
            com.alipay.security.mobile.silentop.SilentOpDataHelper r2 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
            java.lang.String r2 = r2.getOpCmd()
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1561676218: goto L_0x0058;
                case -690213213: goto L_0x004c;
                case 1440705988: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            r0 = -1
            goto L_0x0062
        L_0x0040:
            java.lang.String r0 = "ifaa_v2_register"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r0 = 2
            goto L_0x0062
        L_0x004c:
            java.lang.String r0 = "register"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x003e
        L_0x0056:
            r0 = 1
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "km_update"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0062
            goto L_0x003e
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0074;
                case 2: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x008f
        L_0x0066:
            com.alipay.security.mobile.silentop.SilentOpDataHelper r0 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
            boolean r0 = r0.isSuccess()
            if (r0 == 0) goto L_0x0082
            silentRegIFAA(r5)
            goto L_0x0082
        L_0x0074:
            com.alipay.security.mobile.silentop.SilentOpDataHelper r5 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
            boolean r5 = r5.isSuccess()
            if (r5 == 0) goto L_0x008f
            silentRegKM()
            goto L_0x008f
        L_0x0082:
            com.alipay.security.mobile.silentop.SilentOpDataHelper r5 = com.alipay.security.mobile.silentop.SilentOpDataHelper.getInstance()
            boolean r5 = r5.isSuccess()
            if (r5 == 0) goto L_0x008f
            silentUpdateKM()
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.silentop.SilentOpManager.doSilentOp(android.content.Context):void");
    }
}
