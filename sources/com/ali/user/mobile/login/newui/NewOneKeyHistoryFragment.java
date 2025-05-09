package com.ali.user.mobile.login.newui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.SimVerifyPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.OneKeyLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewOneKeyHistoryFragment extends NewBaseHistoryFragment implements OneKeyLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mMobileNum;
    public Button mOneKeyLoginButton;
    public LoginParam mOrinParam;
    public SimVerifyPresenter mSimLoginPresenter;
    public LoginParam loginParam = null;
    public boolean isSendSms = false;
    private boolean isClicked = false;

    static {
        t2o.a(70254634);
        t2o.a(70254799);
    }

    public static /* synthetic */ boolean access$002(NewOneKeyHistoryFragment newOneKeyHistoryFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89d170c4", new Object[]{newOneKeyHistoryFragment, new Boolean(z)})).booleanValue();
        }
        newOneKeyHistoryFragment.isClicked = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(NewOneKeyHistoryFragment newOneKeyHistoryFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewOneKeyHistoryFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void appendIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        } else if (intent != null) {
            intent.putExtra(LoginConstant.FROM_ONE_KEY, true);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        HistoryAccount historyAccount = this.mUserLoginActivity.mHistoryAccount;
        if (historyAccount != null) {
            return historyAccount.mobile;
        }
        return "";
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_new_fragment_history;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "Page_history_onekey";
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        try {
            Bundle arguments = getArguments();
            this.loginParam = null;
            if (arguments != null) {
                this.mPreviousChecked = arguments.getBoolean("check");
                String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
                if (!TextUtils.isEmpty(str)) {
                    this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                }
            }
            if (ServiceFactory.getService(NumberAuthService.class) != null && ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() != null) {
                this.mMobileNum = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("number");
                this.mProtocolTitle = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
                this.mProtocolUrl = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
            }
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.isHistoryMode = true;
        LoginParam loginParam = this.loginParam;
        if (loginParam != null) {
            this.mOrinParam = loginParam.clone();
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginParam();
        }
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam.clone());
        this.mSimLoginPresenter = new SimVerifyPresenter(this, this.loginParam.clone());
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam.clone());
        super.initViews(view);
        if (!(this.mTitleView == null || (historyAccount = this.mUserLoginActivity.mHistoryAccount) == null || TextUtils.isEmpty(historyAccount.mobile))) {
            this.mTitleView.setText(StringUtil.dataMasking(this.mUserLoginActivity.mHistoryAccount.mobile));
            this.historyHid = this.mUserLoginActivity.mHistoryAccount.userId;
        }
        this.mOneKeyLoginButton = (Button) view.findViewById(R.id.aliuser_login_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mOneKeyLoginButton.setText(getResources().getString(R.string.aliuser_onekey_history_button_text_auto));
        } else {
            this.mOneKeyLoginButton.setText(getResources().getString(R.string.aliuser_onekey_history_button_text));
        }
        setOnClickListener(this.mOneKeyLoginButton);
        showBottomAlipay(view);
        showQrLogin(view);
        this.mSimLoginPresenter.onStart();
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mOneKeyLoginButton);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_login_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initParams();
        this.isSendSms = false;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        FaceLoginPresenter faceLoginPresenter = this.mFaceLoginPresenter;
        if (faceLoginPresenter != null) {
            faceLoginPresenter.onDestory();
        }
        SimVerifyPresenter simVerifyPresenter = this.mSimLoginPresenter;
        if (simVerifyPresenter != null) {
            simVerifyPresenter.onDestory();
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f903ba0", new Object[]{this, loginParam});
            return;
        }
        HistoryAccount historyAccount = this.mUserLoginActivity.mHistoryAccount;
        if (historyAccount == null || TextUtils.isEmpty(historyAccount.mobile)) {
            switchToSmsLogin(false);
        } else {
            onNeedVerifyMobile("", this.mUserLoginActivity.mHistoryAccount.mobile);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment
    public void switchToPwdLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343fb322", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, false);
        intent.putExtra("degrade", false);
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        intent.putExtra(LoginConstant.FROM_ONE_KEY, true);
        this.mUserLoginActivity.gotoPwdLoginFragment(intent);
    }

    public void switchToSmsLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb67b0e", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LoginConstant.FROM_ONE_KEY, true);
        intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, false);
        intent.putExtra("degrade", false);
        intent.putExtra("hasSendSms", z);
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null) {
            intent.putExtra("check", checkBox.isChecked());
        }
        LoginParam loginParam = this.mOrinParam;
        if (loginParam != null) {
            LoginParam loginParam2 = this.mMobileLoginPresenter.mLoginParam;
            if (loginParam2 != null) {
                loginParam.smsSid = loginParam2.smsSid;
            }
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.gotoMobileLoginFragment(intent);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809ca427", new Object[]{this});
            return;
        }
        addControl("onekey");
        if (!this.isClicked || LoginSwitch.getSwitch("ignoreLoginClickCheck", "false")) {
            this.isClicked = true;
            new Handler().postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewOneKeyHistoryFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewOneKeyHistoryFragment.access$002(NewOneKeyHistoryFragment.this, false);
                    }
                }
            }, 200L);
            this.mSimLoginPresenter.simLoginWithUserInput(getAccountName(), this.historyHid);
            return;
        }
        UserTrackAdapter.sendUT(getPageName(), "duplicateLoginClick");
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onNeedVerifyMobile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1188b84b", new Object[]{this, str, str2});
            return;
        }
        this.isSendSms = true;
        this.mMobileLoginPresenter.buildSMSLoginParam(str2, null, false);
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SIM_LOGIN;
        this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SIM_LOGIN, getPageName());
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.SMS_LOGIN, hashMap);
        this.mMobileLoginPresenter.sendSMS();
    }
}
