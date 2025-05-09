package com.alipay.security.mobile.fingerprint.adapter;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.adapter.AuthenticatorAgent;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TACommands;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TAInterationV1;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorResponseUtil;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.ifaa.auth.FaceAuthenticator;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.ifaf.OperationHeader;
import org.ifaa.ifaf.message.IFAFMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintAuthenticator extends FingerprintAuthenticatorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FingerprintAuthenticator(Context context) {
        super(context);
    }

    public static /* synthetic */ Context access$000(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("35a41013", new Object[]{fingerprintAuthenticator});
        }
        return fingerprintAuthenticator.context;
    }

    public static /* synthetic */ AuthenticatorResponse access$100(FingerprintAuthenticator fingerprintAuthenticator, AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorResponse) ipChange.ipc$dispatch("947926b2", new Object[]{fingerprintAuthenticator, authenticatorMessage});
        }
        return fingerprintAuthenticator.sendMessageToTee(authenticatorMessage);
    }

    public static /* synthetic */ Context access$200(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("887301d1", new Object[]{fingerprintAuthenticator});
        }
        return fingerprintAuthenticator.context;
    }

    public static /* synthetic */ Context access$300(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b1da7ab0", new Object[]{fingerprintAuthenticator});
        }
        return fingerprintAuthenticator.context;
    }

    public static /* synthetic */ Object ipc$super(FingerprintAuthenticator fingerprintAuthenticator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/fingerprint/adapter/FingerprintAuthenticator");
    }

    private AuthenticatorResponse sendMessageToTee(AuthenticatorMessage authenticatorMessage) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorResponse) ipChange.ipc$dispatch("5cdd0939", new Object[]{this, authenticatorMessage});
        }
        IFAFMessage parseIFAFMessage = IFAFMessage.parseIFAFMessage(authenticatorMessage.getData());
        Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.context, TACommands.COMMAND_FINGERPRINT_REG, Base64.decode(parseIFAFMessage.getSignedData().getIdentifyData(), 8));
        BioBehaviorUtils.getInstance().add(authenticatorMessage, "send message to tee start");
        if (sendCommandAndData.getStatus() == 0) {
            BioBehaviorUtils.getInstance().add(authenticatorMessage, "send message to tee end,success");
            String deviceModel = IFAAFingerprintManagerAdapter.getInstance(this.context).getDeviceModel();
            new OperationHeader();
            bundle = FingerprintDataUtil.constructResultBundle(8, 100, FingerprintDataUtil.makeRegResponse(deviceModel, parseIFAFMessage.getHeader(), sendCommandAndData));
        } else {
            BioBehaviorUtils instance = BioBehaviorUtils.getInstance();
            instance.add(authenticatorMessage, "send message to tee end,failed:" + sendCommandAndData.getStatusStringIFAA2());
            bundle = FingerprintDataUtil.constructResultBundle(8, 101);
        }
        Message message = new Message();
        message.setData(bundle);
        return AuthenticatorResponseUtil.getAuthenticatorResponse(message);
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public boolean isIgnoreFpIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1354e977", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void register(final AuthenticatorMessage authenticatorMessage, final AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea8ea70", new Object[]{this, authenticatorMessage, authenticatorCallback});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
                    if (r3 == null) goto L_0x007e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
                    r0 = java.lang.Integer.valueOf(r3.getResult());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
                    r5.append(r0);
                    r2.add(r4, r5.toString());
                    com.alipay.security.mobile.util.BioBehaviorUtils.getInstance().commit(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
                    if (r3 == null) goto L_0x007e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
                    return;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r7 = this;
                        java.lang.String r0 = "response is null"
                        java.lang.String r1 = "leave bioSDK with result:"
                        java.lang.String r2 = "fp register response result: "
                        com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.AnonymousClass2.$ipChange
                        boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r4 == 0) goto L_0x001a
                        java.lang.String r0 = "5c510192"
                        r1 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r2 = 0
                        r1[r2] = r7
                        r3.ipc$dispatch(r0, r1)
                        return
                    L_0x001a:
                        r3 = 0
                        com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator r4 = com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.this     // Catch: all -> 0x0039, Exception -> 0x003c
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r5 = r2     // Catch: all -> 0x0039, Exception -> 0x003c
                        com.alipay.security.mobile.auth.message.AuthenticatorResponse r3 = com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.access$100(r4, r5)     // Catch: all -> 0x0039, Exception -> 0x003c
                        if (r3 == 0) goto L_0x003e
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0039, Exception -> 0x003c
                        r4.<init>(r2)     // Catch: all -> 0x0039, Exception -> 0x003c
                        int r2 = r3.getResult()     // Catch: all -> 0x0039, Exception -> 0x003c
                        r4.append(r2)     // Catch: all -> 0x0039, Exception -> 0x003c
                        java.lang.String r2 = r4.toString()     // Catch: all -> 0x0039, Exception -> 0x003c
                        com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r2)     // Catch: all -> 0x0039, Exception -> 0x003c
                        goto L_0x0043
                    L_0x0039:
                        r2 = move-exception
                        goto L_0x00ab
                    L_0x003c:
                        r2 = move-exception
                        goto L_0x0092
                    L_0x003e:
                        java.lang.String r2 = "fp register response is null"
                        com.alipay.security.mobile.auth.AuthenticatorLOG.fpInfo(r2)     // Catch: all -> 0x0039, Exception -> 0x003c
                    L_0x0043:
                        int r2 = r3.getResult()     // Catch: all -> 0x0039, Exception -> 0x005d
                        r4 = 100
                        if (r2 == r4) goto L_0x0061
                        android.os.Handler r2 = new android.os.Handler     // Catch: all -> 0x0039, Exception -> 0x005d
                        android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: all -> 0x0039, Exception -> 0x005d
                        r2.<init>(r4)     // Catch: all -> 0x0039, Exception -> 0x005d
                        com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator$2$1 r4 = new com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator$2$1     // Catch: all -> 0x0039, Exception -> 0x005d
                        r4.<init>()     // Catch: all -> 0x0039, Exception -> 0x005d
                        r2.post(r4)     // Catch: all -> 0x0039, Exception -> 0x005d
                        goto L_0x0061
                    L_0x005d:
                        r2 = move-exception
                        r2.printStackTrace()     // Catch: all -> 0x0039, Exception -> 0x003c
                    L_0x0061:
                        com.alipay.security.mobile.auth.AuthenticatorCallback r2 = r3
                        if (r2 == 0) goto L_0x00aa
                        r2.callback(r3)
                        com.alipay.security.mobile.util.BioBehaviorUtils r2 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r4 = r2
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r1)
                        if (r3 != 0) goto L_0x0076
                        goto L_0x007e
                    L_0x0076:
                        int r0 = r3.getResult()
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    L_0x007e:
                        r5.append(r0)
                        java.lang.String r0 = r5.toString()
                        r2.add(r4, r0)
                        com.alipay.security.mobile.util.BioBehaviorUtils r0 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r1 = r2
                        r0.commit(r1)
                        goto L_0x00aa
                    L_0x0092:
                        r2.printStackTrace()     // Catch: all -> 0x0039
                        com.alipay.security.mobile.auth.AuthenticatorCallback r2 = r3
                        if (r2 == 0) goto L_0x00aa
                        r2.callback(r3)
                        com.alipay.security.mobile.util.BioBehaviorUtils r2 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r4 = r2
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>(r1)
                        if (r3 != 0) goto L_0x0076
                        goto L_0x007e
                    L_0x00aa:
                        return
                    L_0x00ab:
                        com.alipay.security.mobile.auth.AuthenticatorCallback r4 = r3
                        if (r4 == 0) goto L_0x00db
                        r4.callback(r3)
                        com.alipay.security.mobile.util.BioBehaviorUtils r4 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r5 = r2
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>(r1)
                        if (r3 != 0) goto L_0x00c0
                        goto L_0x00c8
                    L_0x00c0:
                        int r0 = r3.getResult()
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    L_0x00c8:
                        r6.append(r0)
                        java.lang.String r0 = r6.toString()
                        r4.add(r5, r0)
                        com.alipay.security.mobile.util.BioBehaviorUtils r0 = com.alipay.security.mobile.util.BioBehaviorUtils.getInstance()
                        com.alipay.security.mobile.auth.message.AuthenticatorMessage r1 = r2
                        r0.commit(r1)
                    L_0x00db:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.AnonymousClass2.run():void");
                }
            }, FaceAuthenticator.THREADNAME).start();
        }
    }

    @Override // com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticatorAdapter, com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, final AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
            return;
        }
        BioBehaviorUtils.getInstance().add(authenticatorMessage, "enter in bioSDK");
        BioBehaviorUtils.getInstance().add(authenticatorMessage, "ignore fp index");
        if (authenticatorMessage.getType() == 2 && authenticatorMessage.getFeatureType() == 1) {
            register(authenticatorMessage, authenticatorCallback);
            return;
        }
        authenticatorMessage.setAuthenticatorType(Constants.TYPE_FINGERPRINT);
        final Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, authenticatorMessage.getType());
        bundle.putString(AuthenticatorMessage.KEY_MESSAGE, authenticatorMessage.getData());
        bundle.putInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE, authenticatorMessage.getAuthenticatorType());
        bundle.putString(AuthenticatorMessage.KEY_EXTRA_PARAMS, authenticatorMessage.getExtraParams());
        bundle.putInt("KEY_VERSION", authenticatorMessage.getVersion());
        bundle.putInt(AuthenticatorMessage.KEY_FEATURE, authenticatorMessage.getFeatureType());
        bundle.putString(AuthenticatorMessage.KEY_VERIFY_ID, authenticatorMessage.getId());
        new Thread(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AuthenticatorAgent.getInstance(FingerprintAuthenticator.access$000(FingerprintAuthenticator.this)).processCommmandAsync(bundle, authenticatorCallback);
                }
            }
        }).start();
    }
}
