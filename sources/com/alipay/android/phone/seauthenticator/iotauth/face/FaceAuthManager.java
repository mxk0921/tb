package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.F;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerAdapter;
import com.alipay.security.mobile.api.BICDataModel;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.face.FaceAuthenticatorAdapter;
import com.alipay.security.mobile.ifaa.auth.FaceAuthenticator;
import com.alipay.security.mobile.ifaa.auth.IAuthenticator;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FaceAuthManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static FaceAuthManager h;

    /* renamed from: a  reason: collision with root package name */
    public final FaceAuthenticator f3775a;
    public IAuthenticator e;
    public FaceAuthDialog g;
    public int b = 3;
    public boolean c = false;
    public boolean startCheck = false;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public boolean f = true;

    public FaceAuthManager(Context context) {
        FaceAuthenticator faceAuthenticator = new FaceAuthenticator();
        this.f3775a = faceAuthenticator;
        faceAuthenticator.init(context);
    }

    public static /* synthetic */ boolean access$000(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("616615f9", new Object[]{faceAuthManager})).booleanValue();
        }
        return faceAuthManager.c;
    }

    public static /* synthetic */ boolean access$002(FaceAuthManager faceAuthManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccfa5885", new Object[]{faceAuthManager, new Boolean(z)})).booleanValue();
        }
        faceAuthManager.c = z;
        return z;
    }

    public static /* synthetic */ FaceAuthDialog access$100(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceAuthDialog) ipChange.ipc$dispatch("3780d291", new Object[]{faceAuthManager});
        }
        return faceAuthManager.g;
    }

    public static /* synthetic */ int access$200(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9368b926", new Object[]{faceAuthManager})).intValue();
        }
        return faceAuthManager.b;
    }

    public static /* synthetic */ int access$202(FaceAuthManager faceAuthManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db4bdd25", new Object[]{faceAuthManager, new Integer(i)})).intValue();
        }
        faceAuthManager.b = i;
        return i;
    }

    public static /* synthetic */ boolean access$300(FaceAuthManager faceAuthManager, AuthenticatorMessage authenticatorMessage, AuthenticatorManager.Callback callback, IAuthenticator.Callback callback2, FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a0a970", new Object[]{faceAuthManager, authenticatorMessage, callback, callback2, faceAnimationManager})).booleanValue();
        }
        return faceAuthManager.a(authenticatorMessage, callback, callback2, faceAnimationManager);
    }

    public static /* synthetic */ AtomicBoolean access$400(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("9391b471", new Object[]{faceAuthManager});
        }
        return faceAuthManager.d;
    }

    public static /* synthetic */ FaceAuthenticator access$500(FaceAuthManager faceAuthManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceAuthenticator) ipChange.ipc$dispatch("25e8a709", new Object[]{faceAuthManager});
        }
        return faceAuthManager.f3775a;
    }

    public static FaceAuthManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceAuthManager) ipChange.ipc$dispatch("2cb3b532", new Object[]{context});
        }
        if (h == null) {
            h = new FaceAuthManager(context);
        }
        return h;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f3775a.cancel();
        }
    }

    public int dereg(String str, IAuthenticator.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("246d4471", new Object[]{this, str, callback})).intValue();
        }
        if (this.f3775a == null) {
            return -1;
        }
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage();
        authenticatorMessage.setAuthenticatorType(Constants.TYPE_FACE);
        authenticatorMessage.setData(str);
        authenticatorMessage.setType(4);
        this.f3775a.deregister(authenticatorMessage, callback);
        return 0;
    }

    public BICDataModel getFaceBicDataModel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BICDataModel) ipChange.ipc$dispatch("619d302f", new Object[]{this, context});
        }
        com.alipay.security.mobile.auth.IAuthenticator iAuthenticator = this.e;
        if (iAuthenticator == null) {
            try {
                com.alipay.security.mobile.auth.IAuthenticator create = AuthenticatorFactory.create(context, 4);
                this.e = create;
                if (!(create instanceof FaceAuthenticatorAdapter)) {
                    return null;
                }
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo(e);
                return null;
            }
        } else if (!(iAuthenticator instanceof FaceAuthenticatorAdapter)) {
            return null;
        }
        try {
            String deviceId = this.e.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = "null";
            }
            return new BICDataModel(deviceId, Build.MODEL, IFAAFingerprintManagerAdapter.getInstance(context).getDeviceModel(), 0, Constants.TYPE_FACE, 102, this.f3775a.hasEnroll() ? 1 : 0, 1, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean hasEnroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fe6486b", new Object[]{this})).booleanValue();
        }
        return this.f3775a.hasEnroll();
    }

    public int startAuth(final Context context, final AuthenticatorMessage authenticatorMessage, final AuthenticatorManager.Callback callback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0cc09e", new Object[]{this, context, authenticatorMessage, callback, str})).intValue();
        }
        AuthenticatorLOG.faceInfo("call FaceAuthManager start Auth");
        this.b = 3;
        this.c = false;
        this.startCheck = false;
        b();
        if (authenticatorMessage.getType() == 2) {
            this.f3775a.register(authenticatorMessage, new IAuthenticator.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onAuthStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    } else {
                        callback.onResult(authenticatorResponse);
                    }
                }
            });
            return 111;
        } else if (authenticatorMessage.getType() != 3) {
            return 111;
        } else {
            if (CommonUtils.isBlank(authenticatorMessage.getData())) {
                AuthenticatorLOG.faceInfo(F.a.d);
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
                authenticatorResponse.setResult(101);
                callback.onResult(authenticatorResponse);
                return 101;
            }
            final FaceAnimationManager faceAnimationManager = FaceAuthActivity.animationCall;
            this.c = false;
            this.d.getAndSet(false);
            final ConditionVariable conditionVariable = new ConditionVariable();
            conditionVariable.close();
            final IAuthenticator.Callback callback2 = new IAuthenticator.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onAuthStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i)});
                    } else if (i == 4 && !FaceAuthManager.this.startCheck) {
                        faceAnimationManager.startCheck();
                        FaceAuthManager.this.startCheck = true;
                    }
                }

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse2});
                        return;
                    }
                    int result = authenticatorResponse2.getResult();
                    if (result == 100) {
                        FaceAuthManager.access$002(FaceAuthManager.this, true);
                        if (FaceAuthManager.access$100(FaceAuthManager.this) != null) {
                            FaceAuthManager.access$100(FaceAuthManager.this).onAuthSuccess(context);
                        }
                        faceAnimationManager.updateUI(3);
                        faceAnimationManager.checkSuccess(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else {
                                    conditionVariable.open();
                                }
                            }
                        });
                    } else if (result == 101) {
                        if (FaceAuthManager.access$100(FaceAuthManager.this) != null) {
                            FaceAuthManager.access$100(FaceAuthManager.this).onAuthFail(context);
                        }
                        if (FaceAuthManager.access$200(FaceAuthManager.this) <= 0) {
                            FaceAuthManager.access$002(FaceAuthManager.this, true);
                        }
                        faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else if (FaceAuthManager.access$200(FaceAuthManager.this) > 0) {
                                    AuthenticatorLOG.faceInfo("check fail end with RESULT_FAILURE");
                                    AnonymousClass2 r0 = AnonymousClass2.this;
                                    FaceAuthManager.access$300(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                } else {
                                    conditionVariable.open();
                                }
                            }
                        });
                    } else if (result == 103) {
                        if (FaceAuthManager.access$100(FaceAuthManager.this) != null) {
                            FaceAuthManager.access$100(FaceAuthManager.this).onAuthNoMatch(context);
                        }
                        if (FaceAuthManager.access$200(FaceAuthManager.this) <= 0) {
                            FaceAuthManager.access$002(FaceAuthManager.this, true);
                        }
                        faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else if (FaceAuthManager.access$200(FaceAuthManager.this) > 0) {
                                    AuthenticatorLOG.faceInfo("check fail end with RESULT_NO_MATCH");
                                    AnonymousClass2 r0 = AnonymousClass2.this;
                                    FaceAuthManager.access$300(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                } else {
                                    conditionVariable.open();
                                }
                            }
                        });
                    } else if (result == 113) {
                        if (FaceAuthManager.access$100(FaceAuthManager.this) != null) {
                            FaceAuthManager.access$100(FaceAuthManager.this).onAuthNoMatch(context);
                        }
                        if (FaceAuthManager.access$200(FaceAuthManager.this) <= 0) {
                            FaceAuthManager.access$002(FaceAuthManager.this, true);
                        }
                        if (FaceAuthManager.this.startCheck) {
                            faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                                public void onAnimationEnd() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                    } else if (FaceAuthManager.access$200(FaceAuthManager.this) > 0) {
                                        AuthenticatorLOG.faceInfo("check fail end with RESULT_TIMEOUT");
                                        AnonymousClass2 r0 = AnonymousClass2.this;
                                        FaceAuthManager.access$300(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                    } else {
                                        conditionVariable.open();
                                    }
                                }
                            });
                        } else {
                            faceAnimationManager.captureFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                                public void onAnimationEnd() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                    } else if (FaceAuthManager.access$200(FaceAuthManager.this) > 0) {
                                        AuthenticatorLOG.faceInfo("capture fail end with RESULT_TIMEOUT");
                                        AnonymousClass2 r0 = AnonymousClass2.this;
                                        FaceAuthManager.access$300(FaceAuthManager.this, authenticatorMessage, callback, this, faceAnimationManager);
                                    } else {
                                        conditionVariable.open();
                                    }
                                }
                            });
                        }
                    } else if (result == 129) {
                        if (FaceAuthManager.access$100(FaceAuthManager.this) != null) {
                            FaceAuthManager.access$100(FaceAuthManager.this).onAuthNoMatchTooMuch(context);
                        }
                        FaceAuthManager.access$002(FaceAuthManager.this, true);
                        faceAnimationManager.checkFail(new FaceAnimationManager.AnimationCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.2.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.AnimationCallback
                            public void onAnimationEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7c281bbd", new Object[]{this});
                                } else {
                                    conditionVariable.open();
                                }
                            }
                        });
                    }
                    if (!FaceAuthManager.access$000(FaceAuthManager.this)) {
                        return;
                    }
                    if (FaceAuthManager.access$400(FaceAuthManager.this).compareAndSet(false, true)) {
                        conditionVariable.block(5000L);
                        faceAnimationManager.checkFinish(0L);
                        callback.onResult(authenticatorResponse2);
                        AuthenticatorLOG.faceInfo("startauth callback onResult: " + authenticatorResponse2.getResult());
                        return;
                    }
                    AuthenticatorLOG.faceInfo("startauth callback onResult no valid : " + authenticatorResponse2.getResult());
                }
            };
            FaceAnimationManager.ActionCallback actionCallback = new FaceAnimationManager.ActionCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/phone/seauthenticator/iotauth/face/FaceAuthManager$3");
                }

                @Override // com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.ActionCallback
                public void onAction(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                    } else if (i == 0) {
                        AuthenticatorLOG.faceInfo("action code start to authentication");
                        faceAnimationManager.updateUI(1);
                        FaceAuthManager.access$300(FaceAuthManager.this, authenticatorMessage, callback, callback2, faceAnimationManager);
                    } else {
                        if (i != 4) {
                            FaceAuthManager.access$500(FaceAuthManager.this).cancel();
                        }
                        FaceAuthManager.access$202(FaceAuthManager.this, 0);
                        if (callback != null) {
                            AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse();
                            authenticatorResponse2.setResult(101);
                            if (i == 1) {
                                authenticatorResponse2.setResult(102);
                            } else if (i == 2) {
                                authenticatorResponse2.setResult(121);
                            } else if (i == 3) {
                                authenticatorResponse2.setResult(134);
                            } else if (i == 4) {
                                authenticatorResponse2.setResult(403);
                            } else if (i == 5) {
                                authenticatorResponse2.setResult(135);
                            }
                            if (FaceAuthManager.access$400(FaceAuthManager.this).compareAndSet(false, true)) {
                                callback.onResult(authenticatorResponse2);
                                AuthenticatorLOG.faceInfo("startauth callback action: " + i);
                                return;
                            }
                            AuthenticatorLOG.faceInfo("startauth callback action no valid: " + i);
                        }
                    }
                }
            };
            this.b = 3;
            if (!IFAAManagerAdaptor.isSupportBioType(Constants.TYPE_FACE, context) || this.f3775a.getEnabled() != 1000) {
                AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse();
                authenticatorResponse2.setResult(129);
                callback.onResult(authenticatorResponse2);
                AuthenticatorLOG.faceInfo("startauth check onResult:RESULT_SYSTEMBLOCK firsttime because enable vaule: ");
            } else {
                FaceAuthActivity.actionCallback = actionCallback;
                Intent intent = new Intent();
                intent.putExtra(FaceAuthActivity.KEY_SWITCH_BTN_TYPE, authenticatorMessage.getSwitchBtnType());
                intent.putExtra(FaceAuthActivity.KEY_UI_STYLE, this.f ? 1 : 0);
                intent.setClass(context, FaceAuthActivity.class);
                context.startActivity(intent);
                if (this.f) {
                    this.g = FaceAuthActivity.notify;
                }
            }
            return 0;
        }
    }

    public int startBioManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb036881", new Object[]{this})).intValue();
        }
        this.f3775a.startBIOManager();
        return 0;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73120a7", new Object[]{this});
        } else if ("true".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_FACE_ID_UI_RALL_BACK, ""))) {
            this.f = false;
        } else {
            this.f = true;
        }
    }

    public final boolean a(AuthenticatorMessage authenticatorMessage, AuthenticatorManager.Callback callback, IAuthenticator.Callback callback2, FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a48e971d", new Object[]{this, authenticatorMessage, callback, callback2, faceAnimationManager})).booleanValue();
        }
        if (this.f3775a.getEnabled() == 1000) {
            int i = this.b;
            if (i == 3) {
                faceAnimationManager.updateUI(1);
            } else if (i == 2) {
                faceAnimationManager.updateUI(2);
            }
            AuthenticatorLOG.faceInfo("start call faceAuthenticator authenticate ...");
            this.startCheck = false;
            this.f3775a.authenticate(authenticatorMessage, callback2);
            this.b--;
            faceAnimationManager.startCapture();
            return true;
        }
        faceAnimationManager.checkFinish(0L);
        AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
        authenticatorResponse.setResult(129);
        callback.onResult(authenticatorResponse);
        AuthenticatorLOG.faceInfo("startauth check onResult:RESULT_SYSTEMBLOCK because enalbe value ");
        return false;
    }

    public int startAuth(Context context, String str, AuthenticatorMessage authenticatorMessage, AuthenticatorManager.Callback callback, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e91ee3a8", new Object[]{this, context, str, authenticatorMessage, callback, str2})).intValue();
        }
        if (authenticatorMessage.getType() != 3 || (!TextUtils.isEmpty(str) && this.f3775a.getUserStatusWithToken(str) == 2)) {
            return startAuth(context, authenticatorMessage, callback, str2);
        }
        AuthenticatorLOG.faceInfo("token:" + str + ", face not registed");
        AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(authenticatorMessage.getType(), authenticatorMessage.getVersion(), null);
        authenticatorResponse.setResult(115);
        callback.onResult(authenticatorResponse);
        return 115;
    }
}
