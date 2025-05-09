package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.phone.seauthenticator.iotauth.AuthViewManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpNormalAuthDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.agent.managerservice.ServiceImpl;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintBroadcastUtil;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.silentop.SilentOpDataHelper;
import com.alipay.security.mobile.silentop.SilentOpManager;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.opa;
import tb.r6p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AuthenticatorManager f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3769a;
    public AuthNotify b;
    public BroadcastReceiver c;
    public int d = 3;
    public FaceAuthManager e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface AuthNotify {
        void onAuthDone(Context context);

        void onAuthFail(Context context);

        void onAuthNoMatch(Context context);

        void onAuthNoMatchTooMuch(Context context);

        void onAuthSuccess(Context context);

        void onAuthTimeout(Context context);

        void onCompleteAuth(Context context);

        void onProcessAuth(Context context);

        void onStartAuth(Context context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Callback {
        void onResult(AuthenticatorResponse authenticatorResponse);
    }

    public AuthenticatorManager(Context context) {
        this.f3769a = context;
        if ("off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_AIDL_MANAGER_SWITCH, "")) || Build.VERSION.SDK_INT < 28) {
            AuthenticatorLOG.fpInfo("AuthenticatorManager  aidl :: get instance.");
            return;
        }
        AuthenticatorLOG.fpInfo("AuthenticatorManager aidl :: ifaa create AuthenticatorManager");
        ServiceImpl.getInstance(context);
    }

    public static /* synthetic */ AuthNotify access$000(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthNotify) ipChange.ipc$dispatch("70a2fdec", new Object[]{authenticatorManager});
        }
        return authenticatorManager.b;
    }

    public static /* synthetic */ int access$100(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b290ae99", new Object[]{authenticatorManager})).intValue();
        }
        return authenticatorManager.d;
    }

    public static /* synthetic */ int access$110(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b98739a", new Object[]{authenticatorManager})).intValue();
        }
        int i = authenticatorManager.d;
        authenticatorManager.d = i - 1;
        return i;
    }

    public static /* synthetic */ BroadcastReceiver access$200(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("e940cc7c", new Object[]{authenticatorManager});
        }
        return authenticatorManager.c;
    }

    public static /* synthetic */ Context access$300(AuthenticatorManager authenticatorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e59757dc", new Object[]{authenticatorManager});
        }
        return authenticatorManager.f3769a;
    }

    public static synchronized AuthenticatorManager getInstance(Context context) {
        synchronized (AuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AuthenticatorManager) ipChange.ipc$dispatch("7d0e3044", new Object[]{context});
            }
            if (f == null && context != null) {
                f = new AuthenticatorManager(context.getApplicationContext());
            }
            return f;
        }
    }

    public static synchronized String getSecCamData(Context context) {
        synchronized (AuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2cbd5b9d", new Object[]{context});
            }
            return opa.k().i(context);
        }
    }

    public static synchronized void startSecCamH5Auth(Context context, String str, r6p r6pVar) {
        synchronized (AuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b4eb323", new Object[]{context, str, r6pVar});
            } else if (r6pVar == null || context == null || TextUtils.isEmpty(str)) {
                r6pVar.authResult(-2, "parameter is null");
            } else {
                try {
                    opa.k().o(context, str, r6pVar);
                } catch (Exception unused) {
                    r6pVar.authResult(-1, "face logic error.");
                }
            }
        }
    }

    public final FaceAuthManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceAuthManager) ipChange.ipc$dispatch("42966b95", new Object[]{this});
        }
        if (this.e == null) {
            this.e = FaceAuthManager.getInstance(this.f3769a);
        }
        return this.e;
    }

    public synchronized boolean hasEnroll(int i) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cce33780", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1) {
                IAuthenticator create = AuthenticatorApi.create(this.f3769a, 1);
                if (create != null) {
                    if (create.registedFingerPrintNumber() <= 0) {
                        z = false;
                    }
                    return z;
                }
            } else if (i == 4) {
                return a().hasEnroll();
            }
            return false;
        }
    }

    public synchronized void processAfterAuth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37de7cc6", new Object[]{this, str});
        } else if (!"off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_SILENT_REG, ""))) {
            AuthenticatorLOG.fpInfo("processAfterAuth:" + str);
            if (SilentOpDataHelper.getInstance().initData(str)) {
                SilentOpManager.doSilentOp(this.f3769a);
                return;
            }
            AuthenticatorLOG.fpInfo("silent op,initData error, bicAsyncData " + str);
        }
    }

    public synchronized int startBioManager(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("656a1c28", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 1) {
            IAuthenticator create = AuthenticatorApi.create(this.f3769a, 1);
            if (create != null) {
                create.process(new AuthenticatorMessage(16, 0));
                return 0;
            }
        } else if (i == 4) {
            a().startBioManager();
            return 0;
        }
        return 111;
    }

    public int startDeReg(Context context, String str, int i, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73524465", new Object[]{this, context, str, new Integer(i), authenticatorCallback})).intValue();
        }
        IAuthenticator create = AuthenticatorApi.create(context, i);
        if (create == null) {
            return -1;
        }
        create.process(new AuthenticatorMessage(4, 2, str), authenticatorCallback);
        return 0;
    }

    public void stopAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250f4097", new Object[]{this, context});
            return;
        }
        try {
            AuthenticatorLOG.fpInfo("cancel on background");
            IAuthenticator create = AuthenticatorApi.create(context, 1);
            if (create != null) {
                create.cancel();
            }
            AuthNotify authNotify = this.b;
            if (authNotify != null) {
                authNotify.onCompleteAuth(context);
            }
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
    }

    public synchronized String getSecData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d285eb2a", new Object[]{this, str});
        }
        TrackEvent.mUserId = str;
        return AuthenticatorApi.getRegAuthData(this.f3769a, 0, 0, str);
    }

    public final AuthNotify b(Context context, int i, final AuthenticatorMessage authenticatorMessage, final IAuthenticator iAuthenticator, String str, final Callback callback) {
        IBiometricValidateDialog iBiometricValidateDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthNotify) ipChange.ipc$dispatch("3fd4913d", new Object[]{this, context, new Integer(i), authenticatorMessage, iAuthenticator, str, callback});
        }
        if (i != 1) {
            return null;
        }
        if (authenticatorMessage.getType() != 2 && authenticatorMessage.getType() != 3) {
            return null;
        }
        AuthenticatorLOG.fpInfo(str);
        if (authenticatorMessage.getUiType() != 1 || "off".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_BIO_NEW_UI, ""))) {
            if (CommonUtils.isBlank(AuthenticatorApi.getFingerprintExtInfo(context))) {
                AuthenticatorLOG.fpInfo("normal auth");
                iBiometricValidateDialog = new FpNormalAuthDialog();
            } else {
                AuthenticatorLOG.fpInfo("fullscreen auth");
                iBiometricValidateDialog = new FpFullViewDialog();
            }
            iBiometricValidateDialog.showDialog(context, 1, context.getString(R.string.fp_auth_start_title), new IBiometricValidateDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog.IDialogActionListener
                public void onAction(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    AuthenticatorLOG.fpInfo("action: " + i2);
                    if (i2 == 1) {
                        AuthenticatorLOG.fpInfo("user cancel");
                    } else if (i2 == 2) {
                        AuthenticatorLOG.fpInfo("system cancel");
                    } else if (i2 == 3) {
                        AuthenticatorLOG.fpInfo("fallback");
                    }
                    iAuthenticator.cancel();
                    AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(1, 1);
                    authenticatorResponse.setResult(102);
                    callback.onResult(authenticatorResponse);
                }
            });
            return iBiometricValidateDialog;
        }
        IBiometricValidateNewDialog authDialog = AuthViewManager.getAuthDialog(context);
        authDialog.showDialog(1, context.getString(R.string.fp_auth_start_title), authenticatorMessage.getSwitchBtnType(), new IBiometricValidateNewDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog.IDialogActionListener
            public void onAction(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i2)});
                    return;
                }
                AuthenticatorLOG.fpInfo("action: " + i2);
                if (i2 == 1) {
                    AuthenticatorLOG.fpInfo("user cancel");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "user cancel");
                } else if (i2 == 2) {
                    AuthenticatorLOG.fpInfo("system cancel");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "system cancel");
                } else if (i2 == 3) {
                    AuthenticatorLOG.fpInfo("fallback");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to pwd");
                } else if (i2 == 4) {
                    AuthenticatorLOG.fpInfo(Constants.STRING_AUTH_SWITCH);
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to other");
                }
                iAuthenticator.cancel();
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(1, 1);
                if (i2 == 4) {
                    authenticatorResponse.setResult(135);
                } else if (i2 == 3) {
                    authenticatorResponse.setResult(121);
                } else {
                    authenticatorResponse.setResult(102);
                }
                callback.onResult(authenticatorResponse);
            }
        });
        return authDialog;
    }

    public synchronized void stopAuth(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd9454c", new Object[]{this, context, new Integer(i)});
            return;
        }
        if (i == Constants.TYPE_FINGERPRINT) {
            AuthenticatorLOG.fpInfo("cancel on background");
            IAuthenticator create = AuthenticatorApi.create(context, 1);
            if (create != null) {
                create.cancel();
            }
            AuthNotify authNotify = this.b;
            if (authNotify != null) {
                authNotify.onCompleteAuth(context);
            }
        } else if (i == Constants.TYPE_FACE) {
            a().cancel();
        }
    }

    public synchronized int startAuth(final Context context, final AuthenticatorMessage authenticatorMessage, final Callback callback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0cc09e", new Object[]{this, context, authenticatorMessage, callback, str})).intValue();
        }
        PreDataHelper.getInstance().initClientText(str);
        if (authenticatorMessage.getAuthenticatorType() == 1) {
            BioBehaviorUtils.getInstance().add(authenticatorMessage, "start auth");
            final IAuthenticator create = AuthenticatorApi.create(this.f3769a, 1);
            if (authenticatorMessage.getType() == 2 && IFAAManagerAdaptor.isIgnoreFpIndex(this.f3769a)) {
                create.process(authenticatorMessage, new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            return;
                        }
                        callback.onResult(authenticatorResponse);
                        create.cancel();
                    }
                });
            } else if (authenticatorMessage.getType() == 2 || authenticatorMessage.getType() == 3) {
                this.d = 3;
                AuthenticatorLOG.fpInfo("start to call startAuth...");
                AuthenticatorCallback authenticatorCallback = new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            return;
                        }
                        int result = authenticatorResponse.getResult();
                        if (result == 100) {
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthDone(context);
                        } else if (result == 101) {
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthFail(context);
                        } else if (result == 103) {
                            AuthenticatorManager.access$110(AuthenticatorManager.this);
                            if (AuthenticatorManager.access$100(AuthenticatorManager.this) > 0) {
                                AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthNoMatch(context);
                                create.cancel();
                                create.process(authenticatorMessage, this);
                            } else {
                                AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthNoMatch(context);
                            }
                        } else if (result == 113) {
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthTimeout(context);
                        } else if (result == 129) {
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthNoMatchTooMuch(context);
                        }
                        if ((authenticatorResponse.getResult() != 103 || AuthenticatorManager.access$100(AuthenticatorManager.this) <= 0) && authenticatorResponse.getResult() != 102) {
                            callback.onResult(authenticatorResponse);
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onCompleteAuth(context);
                            create.cancel();
                            AuthenticatorManager.access$300(AuthenticatorManager.this).unregisterReceiver(AuthenticatorManager.access$200(AuthenticatorManager.this));
                        }
                    }
                };
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/phone/seauthenticator/iotauth/authmanager/AuthenticatorManager$3");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            return;
                        }
                        int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                        if (intExtra == 2) {
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onProcessAuth(context);
                        } else if (intExtra == 100) {
                            AuthenticatorManager.access$000(AuthenticatorManager.this).onAuthSuccess(context);
                        }
                    }
                };
                this.c = broadcastReceiver;
                this.f3769a.registerReceiver(broadcastReceiver, FingerprintBroadcastUtil.getIdentifyChangeBroadcastFilter());
                if (create != null) {
                    AuthNotify b = b(context, 1, authenticatorMessage, create, str, callback);
                    this.b = b;
                    if (b != null) {
                        create.process(authenticatorMessage, authenticatorCallback);
                        return 0;
                    }
                }
            }
        } else if (authenticatorMessage.getAuthenticatorType() == 4) {
            return a().startAuth(context, authenticatorMessage, callback, str);
        }
        return 111;
    }
}
