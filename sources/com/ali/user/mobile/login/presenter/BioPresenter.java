package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TrackingModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BioPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LoginParam mLoginParam;

    static {
        t2o.a(70254708);
    }

    public BioPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
        this.mViewer = baseLoginView;
        this.mLoginParam = loginParam;
    }

    private TrackingModel buildTrackingModel(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackingModel) ipChange.ipc$dispatch("5a6bdd75", new Object[]{this, loginParam});
        }
        TrackingModel trackingModel = new TrackingModel();
        trackingModel.pageName = loginParam.utPageName;
        String localLoginType = getLocalLoginType();
        trackingModel.loginType = localLoginType;
        trackingModel.traceId = ApiReferer.generateTraceId(localLoginType, trackingModel.pageName);
        return trackingModel;
    }

    public static /* synthetic */ Object ipc$super(BioPresenter bioPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/BioPresenter");
    }

    public void buildLoginParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7124bf39", new Object[]{this});
        } else if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.BIO_LOGIN;
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
            LoginParam clone = this.mLoginParam.clone();
            LoginApi.fingerLogin(clone, buildTrackingModel(clone), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.BioPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        BioPresenter.this.dismissLoading();
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    BaseLoginView baseLoginView2 = BioPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        BioPresenter.this.dismissLoading();
                        if (loginException.getCode() == 700) {
                            BioPresenter bioPresenter = BioPresenter.this;
                            bioPresenter.onReceiveAlert(bioPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        BioPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        BioPresenter.this.dismissLoading();
                    }
                }
            });
        }
    }
}
