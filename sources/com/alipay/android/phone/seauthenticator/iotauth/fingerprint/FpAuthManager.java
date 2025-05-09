package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.FingerprintBroadcastUtil;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.api.BICDataModel;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.cache.AuthenticatorModel;
import com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticatorAdapter;
import com.alipay.security.mobile.ifaa.device.IFAADevice;
import com.alipay.security.mobile.util.BioBehaviorUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FpAuthManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static FpAuthManager e;

    /* renamed from: a  reason: collision with root package name */
    public int f3776a = 3;
    public IAuthenticator b;
    public IBiometricValidateDialog c;
    public BroadcastReceiver d;

    public static /* synthetic */ IBiometricValidateDialog access$000(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateDialog) ipChange.ipc$dispatch("e2ec5a2f", new Object[]{fpAuthManager});
        }
        return fpAuthManager.c;
    }

    public static /* synthetic */ int access$100(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbd5cf49", new Object[]{fpAuthManager})).intValue();
        }
        return fpAuthManager.f3776a;
    }

    public static /* synthetic */ int access$110(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa873968", new Object[]{fpAuthManager})).intValue();
        }
        int i = fpAuthManager.f3776a;
        fpAuthManager.f3776a = i - 1;
        return i;
    }

    public static /* synthetic */ IAuthenticator access$200(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("b28224d2", new Object[]{fpAuthManager});
        }
        return fpAuthManager.b;
    }

    public static /* synthetic */ BroadcastReceiver access$300(FpAuthManager fpAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("bb64c0cf", new Object[]{fpAuthManager});
        }
        return fpAuthManager.d;
    }

    public static FpAuthManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FpAuthManager) ipChange.ipc$dispatch("63a0d662", new Object[0]);
        }
        if (e == null) {
            e = new FpAuthManager();
        }
        return e;
    }

    public int dereg(Context context, String str, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("252e378d", new Object[]{this, context, str, callback})).intValue();
        }
        if (this.b == null) {
            try {
                IAuthenticator create = AuthenticatorFactory.create(context, 1);
                this.b = create;
                create.setContext(context);
            } catch (Exception e2) {
                AuthenticatorLOG.fpInfo(e2);
                return -1;
            }
        }
        try {
            AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage();
            authenticatorMessage.setAuthenticatorType(Constants.TYPE_FINGERPRINT);
            authenticatorMessage.setData(str);
            authenticatorMessage.setType(4);
            this.b.cancel();
            this.b.process(authenticatorMessage, new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                public void callback(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    } else {
                        callback.onResult(authenticatorResponse);
                    }
                }
            });
            return 0;
        } catch (Exception e3) {
            AuthenticatorLOG.fpInfo(e3);
            return -1;
        }
    }

    public void stopAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250f4097", new Object[]{this, context});
            return;
        }
        try {
            AuthenticatorLOG.fpInfo("cancel on background");
            IAuthenticator create = AuthenticatorFactory.create(context, 1);
            if (create != null) {
                create.cancel();
            }
            IBiometricValidateDialog iBiometricValidateDialog = this.c;
            if (iBiometricValidateDialog != null) {
                iBiometricValidateDialog.onCompleteAuth(context);
            }
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
        }
    }

    public BICDataModel getFpBicDataModel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BICDataModel) ipChange.ipc$dispatch("b06ae262", new Object[]{this, context});
        }
        IAuthenticator iAuthenticator = this.b;
        if (iAuthenticator == null) {
            try {
                IAuthenticator create = AuthenticatorFactory.create(context, 1);
                this.b = create;
                create.setContext(context);
                if (!(this.b instanceof FingerprintAuthenticatorAdapter)) {
                    return null;
                }
            } catch (Exception e2) {
                AuthenticatorLOG.fpInfo(e2);
                return null;
            }
        } else if (!(iAuthenticator instanceof FingerprintAuthenticatorAdapter)) {
            return null;
        }
        try {
            String deviceId = IFAADevice.getInstance(context).getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = "null";
            }
            String deviceModel = IFAAFingerprintManagerAdapter.getInstance(context).getDeviceModel();
            boolean hasEnrolledFingerprints = IFAAFingerprintManagerAdapter.getInstance(context).hasEnrolledFingerprints();
            String fingerprintExtInfo = IFAAManagerAdaptor.getFingerprintExtInfo(context);
            int supportBioTypes = IFAAManagerAdaptor.getSupportBioTypes(context);
            return new BICDataModel(deviceId, Build.MODEL, deviceModel, 0, Constants.TYPE_FINGERPRINT, 102, hasEnrolledFingerprints ? 1 : 0, 1, ((Constants.TYPE_FINGERPRINT & supportBioTypes) == 0 || (supportBioTypes & 16) == 0 || CommonUtils.isBlank(fingerprintExtInfo)) ? 0 : 1);
        } catch (Exception unused) {
            return null;
        }
    }

    public final IBiometricValidateDialog a(Context context, int i, final AuthenticatorMessage authenticatorMessage, final IAuthenticator iAuthenticator, final IAuthenticatorManager.Callback callback) {
        IBiometricValidateDialog iBiometricValidateDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBiometricValidateDialog) ipChange.ipc$dispatch("5eb6d429", new Object[]{this, context, new Integer(i), authenticatorMessage, iAuthenticator, callback});
        }
        if (i != 1) {
            return null;
        }
        if (authenticatorMessage.getType() != 2 && authenticatorMessage.getType() != 3) {
            return null;
        }
        if (CommonUtils.isBlank(AuthenticatorApi.getFingerprintExtInfo(context))) {
            AuthenticatorLOG.fpInfo("normal auth");
            iBiometricValidateDialog = new FpNormalAuthDialog();
        } else {
            AuthenticatorLOG.fpInfo("fullscreen auth");
            iBiometricValidateDialog = new FpFullViewDialog();
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
        if (TextUtils.isEmpty(clientText)) {
            int type = authenticatorMessage.getType();
            if (type == 2) {
                clientText = context.getString(R.string.fp_auth_start_title);
            } else if (type != 3) {
                clientText = context.getString(R.string.fp_auth_default_text);
            } else {
                clientText = context.getString(R.string.fp_auth_default_text);
            }
        }
        iBiometricValidateDialog.showDialog(context, 1, clientText, new IBiometricValidateDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateDialog.IDialogActionListener
            public void onAction(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i2)});
                    return;
                }
                AuthenticatorLOG.fpInfo("action: " + i2);
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(1, 1);
                if (i2 == 1) {
                    AuthenticatorLOG.fpInfo("user cancel");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "user cancel");
                    authenticatorResponse.setResult(102);
                } else if (i2 == 2) {
                    AuthenticatorLOG.fpInfo("system cancel");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "system cancel");
                    authenticatorResponse.setResult(102);
                } else if (i2 == 3) {
                    AuthenticatorLOG.fpInfo("fallback");
                    BioBehaviorUtils.getInstance().add(authenticatorMessage, "change to pwd");
                    authenticatorResponse.setResult(121);
                }
                iAuthenticator.cancel();
                callback.onResult(authenticatorResponse);
            }
        });
        return iBiometricValidateDialog;
    }

    public int startVerify(final Context context, String str, final AuthenticatorMessage authenticatorMessage, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13189fd4", new Object[]{this, context, str, authenticatorMessage, callback})).intValue();
        }
        final Context applicationContext = context.getApplicationContext();
        this.f3776a = 3;
        AuthenticatorModel.saveUserIdTemp(applicationContext, str);
        if (this.b == null) {
            try {
                IAuthenticator create = AuthenticatorFactory.create(applicationContext, 1);
                this.b = create;
                create.setContext(applicationContext);
            } catch (Exception e2) {
                AuthenticatorLOG.fpInfo(e2);
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
                authenticatorResponse.setResult(101);
                BioBehaviorUtils.getInstance().add(authenticatorMessage, "authenticator create failed");
                BioBehaviorUtils instance = BioBehaviorUtils.getInstance();
                instance.add(authenticatorMessage, "leave bioSDK with result:" + authenticatorResponse.getResult());
                BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                callback.onResult(authenticatorResponse);
                return 101;
            }
        }
        try {
            if (authenticatorMessage.getType() == 3 && this.b.checkUserStatus(str) != 2) {
                AuthenticatorLOG.faceInfo("face not registed");
                AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
                authenticatorResponse2.setResult(115);
                BioBehaviorUtils.getInstance().add(authenticatorMessage, "check available failed");
                BioBehaviorUtils instance2 = BioBehaviorUtils.getInstance();
                instance2.add(authenticatorMessage, "leave bioSDK with result:" + authenticatorResponse2.getResult());
                BioBehaviorUtils.getInstance().commit(authenticatorMessage);
                callback.onResult(authenticatorResponse2);
                return 115;
            } else if (authenticatorMessage.getType() != 2 && authenticatorMessage.getType() != 3) {
                return 111;
            } else {
                BioBehaviorUtils.getInstance().add(authenticatorMessage, "check available pass");
                this.f3776a = 3;
                AuthenticatorCallback authenticatorCallback = new AuthenticatorCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse3});
                            return;
                        }
                        int result = authenticatorResponse3.getResult();
                        if (result == 100) {
                            FpAuthManager.access$000(FpAuthManager.this).onAuthDone(context);
                        } else if (result == 101) {
                            FpAuthManager.access$000(FpAuthManager.this).onAuthFail(context);
                        } else if (result == 103) {
                            FpAuthManager.access$110(FpAuthManager.this);
                            if (FpAuthManager.access$100(FpAuthManager.this) > 0) {
                                FpAuthManager.access$000(FpAuthManager.this).onAuthNoMatch(context);
                                FpAuthManager.access$200(FpAuthManager.this).cancel();
                                FpAuthManager.access$200(FpAuthManager.this).process(authenticatorMessage, this);
                            } else {
                                FpAuthManager.access$000(FpAuthManager.this).onAuthNoMatch(context);
                            }
                        } else if (result == 113) {
                            FpAuthManager.access$000(FpAuthManager.this).onAuthTimeout(context);
                        } else if (result == 129) {
                            FpAuthManager.access$000(FpAuthManager.this).onAuthNoMatchTooMuch(context);
                        }
                        if ((authenticatorResponse3.getResult() != 103 || FpAuthManager.access$100(FpAuthManager.this) <= 0) && authenticatorResponse3.getResult() != 102) {
                            callback.onResult(authenticatorResponse3);
                            FpAuthManager.access$000(FpAuthManager.this).onCompleteAuth(context);
                            FpAuthManager.access$200(FpAuthManager.this).cancel();
                            applicationContext.unregisterReceiver(FpAuthManager.access$300(FpAuthManager.this));
                        }
                    }
                };
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/phone/seauthenticator/iotauth/fingerprint/FpAuthManager$2");
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
                            FpAuthManager.access$000(FpAuthManager.this).onProcessAuth(context);
                        } else if (intExtra == 100) {
                            FpAuthManager.access$000(FpAuthManager.this).onAuthSuccess(context);
                        }
                    }
                };
                this.d = broadcastReceiver;
                applicationContext.registerReceiver(broadcastReceiver, FingerprintBroadcastUtil.getIdentifyChangeBroadcastFilter());
                IAuthenticator iAuthenticator = this.b;
                if (iAuthenticator == null) {
                    return 111;
                }
                IBiometricValidateDialog a2 = a(context, 1, authenticatorMessage, iAuthenticator, callback);
                this.c = a2;
                if (a2 == null) {
                    return 111;
                }
                this.b.process(authenticatorMessage, authenticatorCallback);
                return 0;
            }
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
            IBiometricValidateDialog iBiometricValidateDialog = this.c;
            if (iBiometricValidateDialog == null) {
                return 111;
            }
            iBiometricValidateDialog.onCompleteAuth(context);
            return 111;
        }
    }
}
