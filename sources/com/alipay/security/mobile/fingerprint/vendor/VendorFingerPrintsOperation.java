package com.alipay.security.mobile.fingerprint.vendor;

import com.alipay.security.mobile.agent.AlipayAuthenticator;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorOperation;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VendorFingerPrintsOperation extends AuthenticatorOperation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean isInited;
    public final String aTAG = VendorFingerPrintsOperation.class.getSimpleName();
    public int mVender_type;

    public VendorFingerPrintsOperation(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback, int i) {
        super(authenticatorMessage, authenticatorCallback);
        this.mVender_type = i;
    }

    public static /* synthetic */ Object ipc$super(VendorFingerPrintsOperation vendorFingerPrintsOperation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/fingerprint/vendor/VendorFingerPrintsOperation");
    }

    @Override // com.alipay.security.mobile.auth.AuthenticatorOperation, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            AlipayAuthenticator.Instance().processAsync(this.mAuthenticatorMessage, this.mAuthenticatorCallback, this.mVender_type);
        }
    }
}
