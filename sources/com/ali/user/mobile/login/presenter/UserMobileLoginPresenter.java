package com.ali.user.mobile.login.presenter;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.ali.user.mobile.ability.excutor.ExecutorCenter;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.login.LoginExecutorParams;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginApi;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.SmsCodeCacheUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UserMobileLoginPresenter extends BaseLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254732);
    }

    public UserMobileLoginPresenter(BaseLoginView baseLoginView, LoginParam loginParam) {
        super(baseLoginView, loginParam);
    }

    public static /* synthetic */ void access$000(UserMobileLoginPresenter userMobileLoginPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd84de6f", new Object[]{userMobileLoginPresenter, str});
        } else {
            userMobileLoginPresenter.newSendSms(str);
        }
    }

    public static /* synthetic */ Object ipc$super(UserMobileLoginPresenter userMobileLoginPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/presenter/UserMobileLoginPresenter");
    }

    private void newSendSMSAction(LoginParam loginParam, String str, LoginTasksCallback<LoginReturnData> loginTasksCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7707c420", new Object[]{this, loginParam, str, loginTasksCallback});
        } else if (TextUtils.isEmpty(str)) {
            LoginApi.smsSend(loginParam, buildTrackingModel(), this.mViewer, loginTasksCallback);
        } else {
            loginParam.loginId = str;
            LoginApi.nickSmsSend(loginParam, buildTrackingModel(), this.mViewer, loginTasksCallback);
        }
    }

    private void newSendSms(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2964c2c2", new Object[]{this, str});
            return;
        }
        this.mViewer.showLoading();
        newSendSMSAction(this.mLoginParam, str, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    UserMobileLoginPresenter.this.dismissLoading();
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onFail(LoginException<LoginReturnData> loginException) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    return;
                }
                BaseLoginView baseLoginView = UserMobileLoginPresenter.this.mViewer;
                if (baseLoginView != null && baseLoginView.isActive()) {
                    UserMobileLoginPresenter.this.dismissLoading();
                    if (loginException.getCode() != 800) {
                        String msg = loginException.getMsg();
                        if (TextUtils.isEmpty(msg)) {
                            msg = ResourceUtil.getNetworkError();
                        }
                        UserMobileLoginPresenter.this.mViewer.toast(msg, 0);
                    } else if (UserMobileLoginPresenter.this.mViewer == null) {
                    } else {
                        if (loginException.getOrinResponse().code != 14100 || !SmsCodeCacheUtils.checkAndSetSmsCodeVaild(UserMobileLoginPresenter.this.mLoginParam)) {
                            String str2 = loginException.getOrinResponse().message;
                            if (TextUtils.isEmpty(str2)) {
                                str2 = ResourceUtil.getNetworkError();
                            }
                            BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                            baseLoginView2.alert(str2, "", baseLoginView2.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.3.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    BaseLoginView baseLoginView3 = UserMobileLoginPresenter.this.mViewer;
                                    if (baseLoginView3 != null && baseLoginView3.isActive()) {
                                        UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                    }
                                }
                            }, null, null);
                            return;
                        }
                        UserMobileLoginPresenter userMobileLoginPresenter = UserMobileLoginPresenter.this;
                        ((UserMobileLoginView) userMobileLoginPresenter.mViewer).onSMSOverLimit(userMobileLoginPresenter.mLoginParam, loginException.getOrinResponse());
                    }
                }
            }

            @Override // com.ali.user.mobile.callback.LoginTasksCallback
            public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                BaseLoginView baseLoginView = UserMobileLoginPresenter.this.mViewer;
                if (baseLoginView != null && baseLoginView.isActive()) {
                    UserMobileLoginPresenter.this.dismissLoading();
                    LoginReturnData loginReturnData = rpcResponse.returnValue;
                    if (loginReturnData != null) {
                        UserMobileLoginPresenter.this.mLoginParam.smsSid = loginReturnData.extMap.get("smsSid");
                        UserMobileLoginPresenter.this.mLoginParam.codeLength = loginReturnData.extMap.get(RegistConstants.REGISTER_CODE_LENGTH);
                        if (!TextUtils.isEmpty(loginReturnData.extMap.get("helpVideoUrl"))) {
                            UserMobileLoginPresenter.this.mLoginParam.helpUrl = loginReturnData.extMap.get("helpVideoUrl");
                        }
                        LoginParam loginParam = UserMobileLoginPresenter.this.mLoginParam;
                        SmsCodeCacheUtils.setSmsCodeCache(loginParam.loginId, loginParam.phoneCode, loginParam.smsSid, loginParam.codeLength, System.currentTimeMillis() + LoginSwitch.getSwitch("code_cache_expire_time", (int) RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT));
                        if (TextUtils.equals(rpcResponse.actionType, "SUCCESS")) {
                            int i = rpcResponse.code;
                            if (i == 14050) {
                                BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                                baseLoginView2.alert("", rpcResponse.message, baseLoginView2.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.3.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                            return;
                                        }
                                        BaseLoginView baseLoginView3 = UserMobileLoginPresenter.this.mViewer;
                                        if (baseLoginView3 != null && baseLoginView3.isActive()) {
                                            UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                        }
                                    }
                                }, null, null);
                                UserMobileLoginPresenter userMobileLoginPresenter = UserMobileLoginPresenter.this;
                                ((UserMobileLoginView) userMobileLoginPresenter.mViewer).onSendSMSSuccess(userMobileLoginPresenter.mLoginParam, 60000L, false);
                            } else if (i == 14142) {
                                if (UserMobileLoginPresenter.this.mViewer.getBaseActivity() instanceof UserLoginActivity) {
                                    ((UserLoginActivity) UserMobileLoginPresenter.this.mViewer.getBaseActivity()).setNeedSMSCheck(false);
                                }
                                LoginReturnData loginReturnData2 = rpcResponse.returnValue;
                                if (loginReturnData2 != null && loginReturnData2.extMap != null) {
                                    UserMobileLoginPresenter.this.mViewer.alert(loginReturnData2.extMap.get("dialogTitle"), rpcResponse.returnValue.extMap.get("dialogContent"), rpcResponse.returnValue.extMap.get("dialogRightBtn"), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.3.2
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(DialogInterface dialogInterface, int i2) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                                return;
                                            }
                                            BaseLoginView baseLoginView3 = UserMobileLoginPresenter.this.mViewer;
                                            if (baseLoginView3 != null && baseLoginView3.isActive()) {
                                                UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                                UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_input_code");
                                            }
                                            UserMobileLoginPresenter userMobileLoginPresenter2 = UserMobileLoginPresenter.this;
                                            BaseLoginView baseLoginView4 = userMobileLoginPresenter2.mViewer;
                                            if (baseLoginView4 != null && (baseLoginView4 instanceof UserMobileLoginView)) {
                                                ((UserMobileLoginView) baseLoginView4).onSendSMSSuccess(userMobileLoginPresenter2.mLoginParam, 60000L, true);
                                            }
                                        }
                                    }, rpcResponse.returnValue.extMap.get("dialogLeftBtn"), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.3.3
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(DialogInterface dialogInterface, int i2) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                                return;
                                            }
                                            BaseLoginView baseLoginView3 = UserMobileLoginPresenter.this.mViewer;
                                            if (baseLoginView3 != null && baseLoginView3.isActive()) {
                                                UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                                UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_resend");
                                            }
                                            AnonymousClass3 r4 = AnonymousClass3.this;
                                            UserMobileLoginPresenter userMobileLoginPresenter2 = UserMobileLoginPresenter.this;
                                            userMobileLoginPresenter2.mLoginParam.resendAlert = false;
                                            UserMobileLoginPresenter.access$000(userMobileLoginPresenter2, str);
                                        }
                                    });
                                    UserTrackAdapter.UIShown(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert");
                                }
                            } else {
                                UserMobileLoginPresenter userMobileLoginPresenter2 = UserMobileLoginPresenter.this;
                                BaseLoginView baseLoginView3 = userMobileLoginPresenter2.mViewer;
                                if (baseLoginView3 != null && (baseLoginView3 instanceof UserMobileLoginView)) {
                                    ((UserMobileLoginView) baseLoginView3).onSendSMSSuccess(userMobileLoginPresenter2.mLoginParam, 60000L, true);
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public void buildSMSLoginParam(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f637ea", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        BaseLoginView baseLoginView = this.mViewer;
        if (baseLoginView instanceof UserMobileLoginView) {
            buildSMSLoginParam(str, str2, z, ((UserMobileLoginView) baseLoginView).getCountryCode(), ((UserMobileLoginView) this.mViewer).getPhoneCode());
        } else {
            buildSMSLoginParam(str, str2, z, o78.CHINA_MAINLAND, "86");
        }
    }

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public String getLocalLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11b97ab", new Object[]{this});
        }
        return LoginType.LocalLoginType.SMS_LOGIN;
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
            LoginApi.smsLogin(this.mLoginParam.clone(), buildTrackingModel(), this.mViewer, new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        UserMobileLoginPresenter.this.dismissLoading();
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                        return;
                    }
                    BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        UserMobileLoginPresenter.this.dismissLoading();
                        if (loginException.getCode() == 700) {
                            UserMobileLoginPresenter userMobileLoginPresenter = UserMobileLoginPresenter.this;
                            userMobileLoginPresenter.onReceiveAlert(userMobileLoginPresenter.mLoginParam, loginException.getOrinResponse());
                            return;
                        }
                        UserMobileLoginPresenter.this.mViewer.toast(loginException.getMsg(), 0);
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

    @Override // com.ali.user.mobile.login.presenter.BaseLoginPresenter
    public void onReceiveAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3ecfd1", new Object[]{this, loginParam, rpcResponse});
        } else if (this.mViewer != null) {
            String str2 = rpcResponse.message;
            LoginReturnData loginReturnData = rpcResponse.returnValue;
            if (loginReturnData == null || loginReturnData.extMap == null) {
                str = "";
            } else {
                str = loginReturnData.extMap.get("dialogTitle");
                str2 = rpcResponse.returnValue.extMap.get("dialogContent");
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = ResourceUtil.getNetworkError();
            }
            BaseLoginView baseLoginView = this.mViewer;
            baseLoginView.alert(str, str2, baseLoginView.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                        UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                        ((UserMobileLoginView) UserMobileLoginPresenter.this.mViewer).onCheckCodeError();
                    }
                }
            }, null, null);
        }
    }

    public void sendSMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc4a8b8", new Object[]{this});
        } else {
            sendSMS("");
        }
    }

    public void sendSuccess(boolean z, int i, Map<String, String> map, CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744aef71", new Object[]{this, new Boolean(z), new Integer(i), map, commonUICallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("millSecond", 60000L);
        hashMap.put("needToast", String.valueOf(z));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (map != null) {
            hashMap.put("result", JSON.parseObject(JSON.toJSONString(map), SmsApplyResult.class));
        }
        if (commonUICallback != null) {
            commonUICallback.onResult(CommonUICallback.ACTION_HANDLE_SEND_SMS_SUCCESS, hashMap);
        }
    }

    public void sendSMS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78261482", new Object[]{this, str});
        } else {
            newSendSms(str);
        }
    }

    public void sendSMS(final Activity activity, final LoginParam loginParam, final CommonUICallback commonUICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398f044", new Object[]{this, activity, loginParam, commonUICallback});
            return;
        }
        LoginExecutorParams loginExecutorParams = new LoginExecutorParams();
        loginExecutorParams.type = getLocalLoginType();
        loginExecutorParams.params = loginParam;
        ExecutorCenter.execute("sendlogincode", new ExecutorContext.ExcutorContextBuilder().context(activity).params(loginExecutorParams).build(), new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                } else if (executorResult.success) {
                    final RpcResponse rpcResponse = (RpcResponse) executorResult.bizInfo.get("data");
                    final LoginReturnData loginReturnData = (LoginReturnData) rpcResponse.returnValue;
                    UserMobileLoginPresenter.this.mLoginParam.smsSid = loginReturnData.extMap.get("smsSid");
                    UserMobileLoginPresenter.this.mLoginParam.codeLength = loginReturnData.extMap.get(RegistConstants.REGISTER_CODE_LENGTH);
                    if (!TextUtils.isEmpty(loginReturnData.extMap.get("helpVideoUrl"))) {
                        UserMobileLoginPresenter.this.mLoginParam.helpUrl = loginReturnData.extMap.get("helpVideoUrl");
                    }
                    LoginParam loginParam2 = UserMobileLoginPresenter.this.mLoginParam;
                    SmsCodeCacheUtils.setSmsCodeCache(loginParam2.loginId, loginParam2.phoneCode, loginParam2.smsSid, loginParam2.codeLength, System.currentTimeMillis() + LoginSwitch.getSwitch("code_cache_expire_time", (int) RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT));
                    if (TextUtils.equals(rpcResponse.actionType, "SUCCESS")) {
                        int i = rpcResponse.code;
                        if (i == 14050) {
                            BaseLoginView baseLoginView = UserMobileLoginPresenter.this.mViewer;
                            baseLoginView.alert("", rpcResponse.message, baseLoginView.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                        return;
                                    }
                                    BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                                    if (baseLoginView2 != null && baseLoginView2.isActive()) {
                                        UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                    }
                                    AnonymousClass4 r4 = AnonymousClass4.this;
                                    UserMobileLoginPresenter.this.sendSuccess(false, rpcResponse.code, loginReturnData.extMap, commonUICallback);
                                }
                            }, null, null);
                        } else if (i == 14142) {
                            if (UserMobileLoginPresenter.this.mViewer.getBaseActivity() instanceof UserLoginActivity) {
                                ((UserLoginActivity) UserMobileLoginPresenter.this.mViewer.getBaseActivity()).setNeedSMSCheck(false);
                            }
                            T t = rpcResponse.returnValue;
                            if (t != 0 && ((LoginReturnData) t).extMap != null) {
                                String str = ((LoginReturnData) t).extMap.get("dialogTitle");
                                String str2 = ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogContent");
                                String str3 = ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogLeftBtn");
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                            return;
                                        }
                                        BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                                        if (baseLoginView2 != null && baseLoginView2.isActive()) {
                                            UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                            UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_input_code");
                                        }
                                        AnonymousClass4 r4 = AnonymousClass4.this;
                                        UserMobileLoginPresenter.this.sendSuccess(false, rpcResponse.code, loginReturnData.extMap, commonUICallback);
                                    }
                                };
                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                            return;
                                        }
                                        BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                                        if (baseLoginView2 != null && baseLoginView2.isActive()) {
                                            UserMobileLoginPresenter.this.mViewer.dismissAlertDialog();
                                            UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert_resend");
                                        }
                                        AnonymousClass4 r4 = AnonymousClass4.this;
                                        LoginParam loginParam3 = loginParam;
                                        loginParam3.resendAlert = false;
                                        UserMobileLoginPresenter.this.sendSMS(activity, loginParam3, commonUICallback);
                                    }
                                };
                                UserTrackAdapter.UIShown(UserMobileLoginPresenter.this.mViewer.getPageName(), "resend_alert");
                                UserMobileLoginPresenter.this.mViewer.alert(str, str2, ((LoginReturnData) rpcResponse.returnValue).extMap.get("dialogRightBtn"), onClickListener, str3, onClickListener2);
                            }
                        } else {
                            UserMobileLoginPresenter.this.sendSuccess(true, i, loginReturnData.extMap, commonUICallback);
                        }
                    }
                } else {
                    Map<String, Object> map = executorResult.bizInfo;
                    if (map == null || !(map.get("data") instanceof RpcResponse)) {
                        UserMobileLoginPresenter.this.sendToast(executorResult);
                        return;
                    }
                    RpcResponse rpcResponse2 = (RpcResponse) executorResult.bizInfo.get("data");
                    int i2 = rpcResponse2.code;
                    if (i2 == 14120) {
                        T t2 = rpcResponse2.returnValue;
                        String str4 = (t2 == 0 || ((LoginReturnData) t2).extMap == null) ? null : ((LoginReturnData) t2).extMap.get("dialogContent");
                        UserTrackAdapter.sendUT(UserMobileLoginPresenter.this.mViewer.getPageName(), "CheckSimilarity");
                        BaseLoginView baseLoginView2 = UserMobileLoginPresenter.this.mViewer;
                        baseLoginView2.alert(str4, "", baseLoginView2.getBaseActivity().getResources().getString(R.string.aliuser_re_enter), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                                } else {
                                    UserTrackAdapter.control(UserMobileLoginPresenter.this.mViewer.getPageName(), "Button-Alert-CheckSimilarity-no");
                                }
                            }
                        }, UserMobileLoginPresenter.this.mViewer.getBaseActivity().getResources().getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.presenter.UserMobileLoginPresenter.4.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                                    return;
                                }
                                UserTrackAdapter.control(UserMobileLoginPresenter.this.mViewer.getPageName(), "Button-Alert-CheckSimilarity-yes");
                                commonUICallback.onResult(6002, null);
                            }
                        });
                    } else if (i2 != 14100 || !SmsCodeCacheUtils.checkAndSetSmsCodeVaild(loginParam)) {
                        UserMobileLoginPresenter.this.sendToast(executorResult);
                    } else {
                        LoginTLogAdapter.e("sms_cache", "use cache, smsSid: " + loginParam.smsSid);
                        HashMap hashMap = new HashMap();
                        hashMap.put("smsSid", loginParam.smsSid);
                        hashMap.put(RegistConstants.REGISTER_CODE_LENGTH, loginParam.codeLength);
                        hashMap.put("sendType", "sms");
                        UserMobileLoginPresenter.this.sendSuccess(false, rpcResponse2.code, hashMap, commonUICallback);
                    }
                }
            }
        });
    }

    public void buildSMSLoginParam(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4313ffe", new Object[]{this, str, str2, new Boolean(z), str3, str4});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.nativeLoginType = LoginType.ServerLoginType.SMSLogin.getType();
        this.mLoginParam.isFromAccount = this.mViewer.isHistoryMode();
        this.mLoginParam.site = this.mViewer.getLoginSite();
        LoginParam loginParam = this.mLoginParam;
        loginParam.loginId = str;
        loginParam.smsCode = str2;
        if (loginParam.ext == null) {
            loginParam.ext = new HashMap();
        }
        this.mLoginParam.ext.put(LoginConstants.MTOP_API_REFERENCE, ApiReferer.generateApiReferer());
        this.mLoginParam.ext.put("showReigsterPolicy", "true");
        LoginParam loginParam2 = this.mLoginParam;
        loginParam2.countryCode = str3;
        loginParam2.phoneCode = str4;
        if (!loginParam2.isFromAccount) {
            loginParam2.deviceTokenKey = "";
        }
        loginParam2.hid = 0L;
        loginParam2.sendAudio = z;
        LoginTLogAdapter.e("login_optimize", "after build SMS Param");
    }
}
