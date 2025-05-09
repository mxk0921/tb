package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TACommands;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ta.TAInterationV1;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintDataUtil;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.ifaf.OperationHeader;
import org.ifaa.ifaf.message.IFAFMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintRegister extends FingerprintAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintRegister";

    public FingerprintRegister(Context context, Bundle bundle) {
        super(context, bundle);
    }

    public static /* synthetic */ Object ipc$super(FingerprintRegister fingerprintRegister, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/alipayauthenticatorservice/fingerprint/flow/FingerprintRegister");
    }

    private Bundle sendMessageToTee() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("79d0ad85", new Object[]{this});
        }
        IFAFMessage parseIFAFMessage = IFAFMessage.parseIFAFMessage(this.mMessage.getString(AuthenticatorMessage.KEY_MESSAGE));
        byte[] decode = Base64.decode(parseIFAFMessage.getSignedData().getIdentifyData(), 8);
        TrackEvent.getIns().event(this.mMessage, "send message to tee start");
        BioBehaviorUtils.getInstance().add(this.mMessage, "send message to tee start");
        Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.mContext, TACommands.COMMAND_FINGERPRINT_REG, decode);
        if (sendCommandAndData.getStatus() == 0) {
            TrackEvent.getIns().event(this.mMessage, "send message to tee end,success");
            BioBehaviorUtils.getInstance().add(this.mMessage, "send message to tee end,success");
            new OperationHeader();
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 100, FingerprintDataUtil.makeRegResponse(this.mAAID, parseIFAFMessage.getHeader(), sendCommandAndData));
        }
        BioBehaviorUtils instance = BioBehaviorUtils.getInstance();
        Bundle bundle = this.mMessage;
        instance.add(bundle, "send message to tee end,failed:" + sendCommandAndData.getStatusStringIFAA2());
        TrackEvent ins = TrackEvent.getIns();
        Bundle bundle2 = this.mMessage;
        ins.event(bundle2, "send message to tee end,failed:" + sendCommandAndData.getStatusStringIFAA2());
        String str = TAG;
        AuthenticatorLOG.error(str, "fingerprint register result not 0, " + sendCommandAndData.getStatusString());
        return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuth
    public Bundle doTransaction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b5ac169e", new Object[]{this});
        }
        if (!this.isFingerprintAuthSuccess) {
            TrackEvent.getIns().event(this.mMessage, "end,fp_auth failed ");
            BioBehaviorUtils.getInstance().add(this.mMessage, "end,fp_auth failed ");
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
        }
        try {
            return sendMessageToTee();
        } catch (Exception e) {
            AuthenticatorLOG.error("fingerprint register", e);
            return FingerprintDataUtil.constructResultBundle(getReponseType(), 101);
        }
    }

    @Override // com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.flow.FingerprintAuth
    public int getReponseType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5abf12c", new Object[]{this})).intValue();
        }
        return 8;
    }
}
