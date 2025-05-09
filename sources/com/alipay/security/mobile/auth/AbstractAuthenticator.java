package com.alipay.security.mobile.auth;

import android.content.Context;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AbstractAuthenticator implements IAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IAuthenticator next;
    public Context context = null;
    public boolean supported = false;

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void cancel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9196b8e7", new Object[]{this, context});
        } else {
            cancel();
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        return 0;
    }

    public abstract void doAuthenticate(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback);

    public abstract void doDeregister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback);

    public abstract void doRegister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback);

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.context;
    }

    public IAuthenticator getNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("861d3959", new Object[]{this});
        }
        return this.next;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public synchronized String getTrustDeviceToken(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            return null;
        }
        return (String) ipChange.ipc$dispatch("b62f9a71", new Object[]{this, bArr});
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public boolean isIgnoreFpIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1354e977", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b0a92f", new Object[]{this})).booleanValue();
        }
        return this.supported;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void prapareKeyPair() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a9a6dd", new Object[]{this});
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
            return;
        }
        AuthenticatorLOG.fpInfo("SamsungNNLFIDOFingerPrint.processAsync enter [type:" + authenticatorMessage.getType() + "]");
        int type = authenticatorMessage.getType();
        if (type == 2) {
            doRegister(authenticatorMessage, authenticatorCallback);
        } else if (type == 3) {
            doAuthenticate(authenticatorMessage, authenticatorCallback);
        } else if (type == 4) {
            doDeregister(authenticatorMessage, authenticatorCallback);
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int registedFingerPrintNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f7fc392", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.context = context;
        }
    }

    public void setNext(IAuthenticator iAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed12e56f", new Object[]{this, iAuthenticator});
        } else {
            this.next = iAuthenticator;
        }
    }

    public void setSupported(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4147dc41", new Object[]{this, new Boolean(z)});
        } else {
            this.supported = z;
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public String process(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f121a629", new Object[]{this, authenticatorMessage});
        }
        throw new UnsupportedOperationException("Synchronous process is not supported");
    }
}
