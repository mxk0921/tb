package com.alipay.android.phone.seauthenticator.iotauth;

import android.content.Context;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.NewFpFullViewDialog;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AuthViewManager b;

    /* renamed from: a  reason: collision with root package name */
    public IBiometricValidateNewDialog f3768a = null;

    public static IBiometricValidateNewDialog getAuthDialog(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateNewDialog) ipChange.ipc$dispatch("77cc5cf1", new Object[]{context});
        }
        if (!IFAAManagerAdaptor.isUnderScreen(context)) {
            AuthenticatorLOG.fpInfo("new normal auth");
            return new FpAuthDialog(context);
        } else if ("off".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_BIO_NEW_UI_COMPAT, ""))) {
            return new NewFpFullViewDialog(context);
        } else {
            return new FpFullViewCompatDialog(context);
        }
    }

    public static synchronized AuthViewManager getInstance() {
        synchronized (AuthViewManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AuthViewManager) ipChange.ipc$dispatch("2b222e72", new Object[0]);
            }
            if (b == null) {
                b = new AuthViewManager();
            }
            return b;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6218536", new Object[]{this});
            return;
        }
        IBiometricValidateNewDialog iBiometricValidateNewDialog = this.f3768a;
        if (iBiometricValidateNewDialog != null && iBiometricValidateNewDialog.isShowing()) {
            this.f3768a.dismiss();
        }
        this.f3768a = null;
    }

    public void dismissDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        IBiometricValidateNewDialog iBiometricValidateNewDialog = this.f3768a;
        if (iBiometricValidateNewDialog != null) {
            iBiometricValidateNewDialog.dismiss(0);
        }
    }

    public void startFpVerifyUI(final Context context, final AuthenticatorMessage authenticatorMessage, final IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90043168", new Object[]{this, context, authenticatorMessage, iDialogActionListener});
            return;
        }
        if (this.f3768a != null) {
            a();
        }
        this.f3768a = getAuthDialog(context);
        this.f3768a.showDialog(1, context.getString(R.string.fp_auth_default_text), authenticatorMessage.getSwitchBtnType(), new IBiometricValidateNewDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.AuthViewManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog.IDialogActionListener
            public void onAction(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                    return;
                }
                AuthenticatorLOG.fpInfo("action: " + i);
                if (i == 1) {
                    AuthenticatorLOG.fpInfo("user cancel");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "user cancel");
                    AuthViewManager.this.updateVerifyUI(context, 102, true);
                } else if (i == 2) {
                    AuthenticatorLOG.fpInfo("system cancel");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "system cancel");
                    AuthViewManager.this.updateVerifyUI(context, 102, true);
                } else if (i == 3) {
                    AuthenticatorLOG.fpInfo("fallback");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to pwd");
                    AuthViewManager.this.updateVerifyUI(context, 121, true);
                } else if (i == 4) {
                    AuthenticatorLOG.fpInfo(Constants.STRING_AUTH_SWITCH);
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to other");
                    AuthViewManager.this.updateVerifyUI(context, 135, true);
                }
                iDialogActionListener.onAction(i);
            }
        });
    }

    public void updateVerifyUI(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea8059c", new Object[]{this, context, new Integer(i), new Boolean(z)});
            return;
        }
        IBiometricValidateNewDialog iBiometricValidateNewDialog = this.f3768a;
        if (iBiometricValidateNewDialog != null) {
            if (i == 100) {
                iBiometricValidateNewDialog.onAuthSuccess(context);
            } else if (i == 101) {
                iBiometricValidateNewDialog.onAuthFail(context);
            } else if (i != 103) {
                if (i == 129) {
                    iBiometricValidateNewDialog.onAuthNoMatchTooMuch(context);
                }
            } else if (!z) {
                iBiometricValidateNewDialog.onAuthNoMatch(context);
            } else {
                iBiometricValidateNewDialog.onAuthNoMatchTooMuch(context);
            }
            if (z) {
                this.f3768a.onCompleteAuth(context);
            }
        }
    }
}
