package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.newui.NewOneKeyFragment;
import com.ali.user.mobile.login.ui.BaseLoginView;
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
public class OneKeyLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = "login.".concat(OneKeyLoginPresenter.class.getSimpleName());

    static {
        t2o.a(70254717);
    }

    public OneKeyLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public static /* synthetic */ Object ipc$super(OneKeyLoginPresenter oneKeyLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/OneKeyLoginPresenter");
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.SIM_LOGIN;
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            LoginApi.simLogin(this.mLoginParam, buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.OneKeyLoginPresenter.1
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
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    BaseLoginView baseLoginView2 = OneKeyLoginPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        if (loginException.getCode() == 3010 || loginException.getCode() == 14076) {
                            OneKeyLoginPresenter.this.mViewer.toast(ResourceUtil.getStringById("aliuser_onekey_login_fail_tip"), 0);
                            BaseLoginView baseLoginView3 = OneKeyLoginPresenter.this.mViewer;
                            if (baseLoginView3 instanceof NewOneKeyFragment) {
                                ((NewOneKeyFragment) baseLoginView3).switchToRecommendLogin();
                            }
                        } else if (loginException.getCode() == 14044 && loginException.getOrinResponse() != null && loginException.getOrinResponse().returnValue != null) {
                            BaseLoginView baseLoginView4 = OneKeyLoginPresenter.this.mViewer;
                            if (baseLoginView4 instanceof NewOneKeyFragment) {
                                ((NewOneKeyFragment) baseLoginView4).onNeedVerifyMobile(loginException.getMsg(), loginException.getOrinResponse().returnValue.mobile);
                            }
                        } else if (loginException.getCode() == 800 || loginException.getCode() == 700) {
                            OneKeyLoginPresenter oneKeyLoginPresenter = OneKeyLoginPresenter.this;
                            oneKeyLoginPresenter.onReceiveToast(oneKeyLoginPresenter.mLoginParam, loginException.getOrinResponse());
                        } else {
                            OneKeyLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
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
}
