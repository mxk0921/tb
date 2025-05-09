package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.content.Context;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthManager;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpAuthManager;
import com.alipay.security.mobile.api.BICDataModel;
import com.alipay.security.mobile.api.BICDataUtil;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerAdapter;
import com.alipay.security.mobile.ifaa.auth.IAuthenticator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalAuthenticatorManager implements IAuthenticatorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static GlobalAuthenticatorManager b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3770a;

    public GlobalAuthenticatorManager(Context context) {
        this.f3770a = context.getApplicationContext();
    }

    public static synchronized GlobalAuthenticatorManager getInstance(Context context) {
        synchronized (GlobalAuthenticatorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GlobalAuthenticatorManager) ipChange.ipc$dispatch("3cc24221", new Object[]{context});
            }
            if (b == null) {
                b = new GlobalAuthenticatorManager(context);
            }
            return b;
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public String getSecData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5a3e4b4", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        BICDataModel fpBicDataModel = FpAuthManager.getInstance().getFpBicDataModel(this.f3770a);
        if (fpBicDataModel != null) {
            arrayList.add(fpBicDataModel);
        }
        BICDataModel faceBicDataModel = FaceAuthManager.getInstance(this.f3770a).getFaceBicDataModel(this.f3770a);
        if (faceBicDataModel != null) {
            arrayList.add(faceBicDataModel);
        }
        String globalSecDataJson = BICDataUtil.getGlobalSecDataJson(arrayList, this.f3770a);
        AuthenticatorLOG.fpInfo("GlobalAuthenticatorManager.getSecData: " + globalSecDataJson);
        return globalSecDataJson;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public int startAuth(Context context, String str, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4953b1c4", new Object[]{this, context, str, callback})).intValue();
        }
        PreDataHelper instance = PreDataHelper.getInstance();
        if (instance.initData(str) != 0) {
            AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
            authenticatorResponse.setResult(101);
            callback.onResult(authenticatorResponse);
            return -1;
        }
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(3, instance.getRenderData());
        authenticatorMessage.setAuthenticatorType(instance.getProductType());
        authenticatorMessage.setId(instance.getVerifyId());
        if (instance.getProductType() == Constants.TYPE_FINGERPRINT) {
            return FpAuthManager.getInstance().startVerify(context, instance.getToken(), authenticatorMessage, callback);
        }
        if (instance.getProductType() == Constants.TYPE_FACE) {
            return FaceAuthManager.getInstance(this.f3770a).startAuth(context, instance.getToken(), authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse2});
                    } else {
                        callback.onResult(authenticatorResponse2);
                    }
                }
            }, "");
        }
        AuthenticatorResponse authenticatorResponse2 = new AuthenticatorResponse();
        authenticatorResponse2.setResult(111);
        callback.onResult(authenticatorResponse2);
        return -1;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public boolean startBIOManager(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59501839", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return IFAAManagerAdapter.getInstance(this.f3770a).startBIOManager(i);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public int startDeReg(String str, int i, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbdb89a4", new Object[]{this, str, new Integer(i), callback})).intValue();
        }
        if (i == Constants.TYPE_FINGERPRINT) {
            return FpAuthManager.getInstance().dereg(this.f3770a, str, callback);
        }
        if (i == Constants.TYPE_FACE) {
            return FaceAuthManager.getInstance(this.f3770a).dereg(str, new IAuthenticator.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.ifaa.auth.IAuthenticator.Callback
                public void onAuthStatus(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50675803", new Object[]{this, new Integer(i2)});
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
        }
        return -1;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public int startReg(Context context, String str, int i, final IAuthenticatorManager.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25cbe01b", new Object[]{this, context, str, new Integer(i), callback})).intValue();
        }
        PreDataHelper.getInstance().initClientText(null);
        AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(2, str);
        authenticatorMessage.setAuthenticatorType(i);
        if (i == Constants.TYPE_FINGERPRINT) {
            return FpAuthManager.getInstance().startVerify(context, "", authenticatorMessage, callback);
        }
        if (i == Constants.TYPE_FACE) {
            return FaceAuthManager.getInstance(this.f3770a).startAuth(context, authenticatorMessage, new AuthenticatorManager.Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.authmanager.GlobalAuthenticatorManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
                public void onResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
                    } else {
                        callback.onResult(authenticatorResponse);
                    }
                }
            }, "");
        }
        return -1;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.IAuthenticatorManager
    public void stopAuth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc55e4d2", new Object[]{this, new Integer(i)});
        } else if (i == Constants.TYPE_FINGERPRINT) {
            FpAuthManager.getInstance().stopAuth(this.f3770a);
        } else if (i == Constants.TYPE_FACE) {
            FaceAuthManager.getInstance(this.f3770a).cancel();
        }
    }
}
