package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.SmsCodeCacheUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SMSNickLoginPresenter extends UserMobileLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254724);
    }

    public SMSNickLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public static /* synthetic */ Object ipc$super(SMSNickLoginPresenter sMSNickLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/SMSNickLoginPresenter");
    }

    @Override // com.ali.user.mobile.login.presenter.UserMobileLoginPresenter
    public void buildSMSLoginParam(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f637ea", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        LoginParam loginParam = this.mLoginParam;
        loginParam.loginId = str;
        loginParam.smsCode = str2;
        if (loginParam.ext == null) {
            loginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.generateApiReferer());
        LoginParam loginParam2 = this.mLoginParam;
        loginParam2.deviceTokenKey = "";
        loginParam2.hid = 0L;
        loginParam2.sendAudio = z;
        loginParam2.nickSms = true;
    }

    @Override // com.ali.user.mobile.login.presenter.UserMobileLoginPresenter, com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.NICK_SMS_LOGIN;
    }

    @Override // com.ali.user.mobile.login.presenter.UserMobileLoginPresenter, com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView != null && baseLoginView.isActive()) {
            LoginApi.nickSmsLogin(this.mLoginParam.clone(), buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.SMSNickLoginPresenter.1
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
                    BaseLoginView baseLoginView2 = SMSNickLoginPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        if (loginException.getCode() == 700) {
                            SMSNickLoginPresenter sMSNickLoginPresenter = SMSNickLoginPresenter.this;
                            sMSNickLoginPresenter.onReceiveAlert(sMSNickLoginPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        SMSNickLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        SmsCodeCacheUtils.clearSmsCodeCache();
                    }
                }
            });
        }
    }
}
