package com.alipay.security.mobile.alipayauthenticatorservice.adapter;

import android.content.Context;
import android.os.Bundle;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.adapter.FingerprintAdapter;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AuthenticatorAgent mAuthenticatorAgent;
    private AuthenticatorCallback mAuthenticatorCallback;
    private Context mContext;

    private AuthenticatorAgent(Context context) {
        this.mContext = context;
    }

    public static synchronized AuthenticatorAgent getInstance(Context context) {
        synchronized (AuthenticatorAgent.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AuthenticatorAgent) ipChange.ipc$dispatch("492f414f", new Object[]{context});
            }
            if (context != null) {
                context = context.getApplicationContext();
            }
            if (mAuthenticatorAgent == null) {
                mAuthenticatorAgent = new AuthenticatorAgent(context);
            }
            return mAuthenticatorAgent;
        }
    }

    private int handleFingerprintCommand(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8395f1", new Object[]{this, bundle})).intValue();
        }
        if (this.mContext == null) {
            return 101;
        }
        try {
            int i = bundle.getInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, -1);
            if (i == 12) {
                throw new Exception("error path: handleFingerprintCommand");
            } else if (i != 14) {
                throw new Exception("error path: handleFingerprintCommand");
            } else {
                throw new Exception("error path: handleFingerprintCommand");
            }
        } catch (Exception unused) {
            return 101;
        }
    }

    public AuthenticatorCallback getAuthenticatorCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorCallback) ipChange.ipc$dispatch("e41ec74", new Object[]{this});
        }
        return this.mAuthenticatorCallback;
    }

    public int processCommand(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98118784", new Object[]{this, bundle})).intValue();
        }
        if (this.mContext == null || bundle == null) {
            return 0;
        }
        int i = bundle.getInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE, 0);
        if (i == Constants.TYPE_BRACELET) {
            return -1;
        }
        if (i == Constants.TYPE_FINGERPRINT) {
            return handleFingerprintCommand(bundle);
        }
        return 101;
    }

    public void processCommmandAsync(Bundle bundle, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca814c25", new Object[]{this, bundle, authenticatorCallback});
            return;
        }
        int i = bundle.getInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE);
        if (i != Constants.TYPE_BRACELET && i == Constants.TYPE_FINGERPRINT) {
            this.mAuthenticatorCallback = authenticatorCallback;
            FingerprintAdapter.getInstance(this.mContext).handleAsyncMessage(bundle);
        }
    }
}
