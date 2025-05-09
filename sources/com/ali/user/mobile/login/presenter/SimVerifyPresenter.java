package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.OneKeyLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SimVerifyPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = "login.".concat(SimVerifyPresenter.class.getSimpleName());

    static {
        t2o.a(70254726);
    }

    public SimVerifyPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public static /* synthetic */ Object ipc$super(SimVerifyPresenter simVerifyPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/SimVerifyPresenter");
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
    }

    public void login(final LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd2a50d", new Object[]{this, loginParam});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            LoginApi.mobileVerifyLogin(loginParam, buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.SimVerifyPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    int i;
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    BaseLoginView baseLoginView2 = SimVerifyPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        RpcResponse<LoginReturnData> orinResponse = loginException.getOrinResponse();
                        if (orinResponse == null) {
                            SimVerifyPresenter.this.mViewer.toast(ResourceUtil.getStringById("aliuser_onekey_login_fail_tip2"), 0);
                        } else if (loginException.getCode() == 3013 || loginException.getCode() == 14076 || (i = orinResponse.code) == 3013 || i == 14076) {
                            BaseLoginView baseLoginView3 = SimVerifyPresenter.this.mViewer;
                            if (baseLoginView3 instanceof OneKeyLoginView) {
                                ((OneKeyLoginView) baseLoginView3).onGetAccessTokenFail(loginParam);
                            }
                        } else if ((loginException.getCode() == 14044 || loginException.getCode() == 14163 || (i2 = orinResponse.code) == 14044 || i2 == 14163) && orinResponse.returnValue != null) {
                            BaseLoginView baseLoginView4 = SimVerifyPresenter.this.mViewer;
                            if (baseLoginView4 instanceof OneKeyLoginView) {
                                ((OneKeyLoginView) baseLoginView4).onNeedVerifyMobile(loginException.getMsg(), orinResponse.returnValue.mobile);
                            }
                        } else if (loginException.getCode() == 800 || loginException.getCode() == 700) {
                            SimVerifyPresenter simVerifyPresenter = SimVerifyPresenter.this;
                            simVerifyPresenter.onReceiveToast(simVerifyPresenter.mLoginParam, orinResponse);
                        } else {
                            SimVerifyPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                        }
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }
            });
        }
    }

    public void simLoginWithUserInput(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c058c", new Object[]{this, str, new Long(j)});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        LoginParam loginParam = this.mLoginParam;
        loginParam.loginId = str;
        if (j != 0) {
            loginParam.hid = j;
            loginParam.isFromAccount = true;
        }
        login(loginParam);
    }
}
