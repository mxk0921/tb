package com.ali.user.mobile.login.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.SMSNickLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.ui.AliUserSmsCodeView;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.AliUserDialog;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.CountDownButton;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AliUserSMSLoginVerificationFragment extends BaseLoginFragment implements UserMobileLoginView, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ILoginMethodChange mLoginMethodChange;
    public String fromPageTag;
    public long havanaId;
    public LoginParam loginParam = null;
    public AliUserDialog mAliUserDialog;
    public ArrayList<String> mAvailableLoginModes;
    public TextView mChangeLogin;
    public int mErrorCode;
    public String mMaskMobile;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public SMSNickLoginPresenter mNickLoginPresenter;
    public String mOutterSourcePage;
    public CountDownButton mSendSMSCodeBtn;
    public AliUserSmsCodeView mSmsCodeView;
    public String preCheckVerify;
    public boolean supportOverseaSimLogin;
    public String verify;

    static {
        t2o.a(70254748);
        t2o.a(70254806);
    }

    public static /* synthetic */ void access$000(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d46d479", new Object[]{aliUserSMSLoginVerificationFragment, str});
        } else {
            aliUserSMSLoginVerificationFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3715d3a", new Object[]{aliUserSMSLoginVerificationFragment, str});
        } else {
            aliUserSMSLoginVerificationFragment.addControl(str);
        }
    }

    public static /* synthetic */ IDialogHelper access$200(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogHelper) ipChange.ipc$dispatch("93cd13ee", new Object[]{aliUserSMSLoginVerificationFragment});
        }
        return aliUserSMSLoginVerificationFragment.mDialogHelper;
    }

    public static /* synthetic */ IDialogHelper access$300(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDialogHelper) ipChange.ipc$dispatch("4f76420d", new Object[]{aliUserSMSLoginVerificationFragment});
        }
        return aliUserSMSLoginVerificationFragment.mDialogHelper;
    }

    public static /* synthetic */ void access$400(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f0f77d", new Object[]{aliUserSMSLoginVerificationFragment, str});
        } else {
            aliUserSMSLoginVerificationFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$500(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b803e", new Object[]{aliUserSMSLoginVerificationFragment, str});
        } else {
            aliUserSMSLoginVerificationFragment.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(AliUserSMSLoginVerificationFragment aliUserSMSLoginVerificationFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1078532824:
                return new Boolean(super.isHistoryMode());
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/AliUserSMSLoginVerificationFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
            return;
        }
        toast(str2, 0);
        onCheckCodeError();
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        LoginParam loginParam = this.loginParam;
        if (loginParam == null) {
            return o78.CHINA_MAINLAND;
        }
        return loginParam.countryCode;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_sms_login_verification;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        if (this.loginParam == null || TextUtils.isEmpty(this.mOutterSourcePage)) {
            return UTConstans.PageName.UT_PAGE_LOGIN_SMS_CODE;
        }
        return this.mOutterSourcePage + "_inputcode";
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        LoginParam loginParam = this.loginParam;
        if (loginParam == null) {
            return "86";
        }
        return loginParam.phoneCode;
    }

    public void goBack() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
        } else if (getActivity() instanceof AliUserCodeActivity) {
            getActivity().finish();
        } else {
            try {
                this.mUserLoginActivity.mFragmentManager.popBackStack();
                UserLoginActivity userLoginActivity = this.mUserLoginActivity;
                if (TextUtils.isEmpty(this.fromPageTag)) {
                    str = FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG;
                } else {
                    str = this.fromPageTag;
                }
                userLoginActivity.mCurrentFragmentTag = str;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        if (!this.supportOverseaSimLogin || (loginParam = this.loginParam) == null) {
            return super.isHistoryMode();
        }
        return loginParam.isFromAccount;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (!TextUtils.isEmpty(this.mMaskMobile)) {
            this.mNickLoginPresenter.onActivityResult(i, i2, intent);
        } else {
            this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        this.mAliUserDialog = AliUserDialog.Builder(getActivity()).setTitle(getString(R.string.aliuser_exit_smscode_hint)).setOnNegativeClickListener(getString(R.string.aliuser_title_back), new AliUserDialog.NegativeClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.NegativeClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = AliUserSMSLoginVerificationFragment.this.mAliUserDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                AliUserSMSLoginVerificationFragment.access$500(AliUserSMSLoginVerificationFragment.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CLICK);
                if (AliUserSMSLoginVerificationFragment.this.isActive() && AliUserSMSLoginVerificationFragment.this.getActivity() != null) {
                    AliUserSMSLoginVerificationFragment.this.goBack();
                }
            }
        }).setOnPositiveClickListener(getString(R.string.aliuser_wait_a_moment), new AliUserDialog.PositiveClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.AliUserDialog.PositiveClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AliUserDialog aliUserDialog = AliUserSMSLoginVerificationFragment.this.mAliUserDialog;
                if (aliUserDialog != null) {
                    aliUserDialog.dismiss();
                }
                AliUserSMSLoginVerificationFragment.access$400(AliUserSMSLoginVerificationFragment.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CANCEL);
            }
        }).build().shown();
        return true;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
            return;
        }
        AliUserSmsCodeView aliUserSmsCodeView = this.mSmsCodeView;
        if (aliUserSmsCodeView != null) {
            aliUserSmsCodeView.clearText();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_login_send_smscode_btn) {
            addControl("inputcode_again");
            sendCodeAction();
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
        try {
            initParams();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        if (userMobileLoginPresenter == null || userMobileLoginPresenter.getLoginParam() == null) {
            menu.clear();
            return;
        }
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        try {
            MenuItem findItem = menu.findItem(R.id.aliuser_menu_item_help);
            SpannableString spannableString = new SpannableString(getResources().getString(R.string.aliuser_sms_need_help));
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_color_orange)), 0, spannableString.length(), 0);
            findItem.setTitle(spannableString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mLoginMethodChange = null;
    }

    public void onFaceLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be39df4", new Object[]{this});
        } else if (ServiceFactory.getService(FaceService.class) != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.hid = this.havanaId;
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName(), AppInfo.getInstance().getUtdid() + String.valueOf(System.currentTimeMillis() / 1000));
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null) {
                loginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
            }
            LoginContext.sCurrentLoginParam = loginParam;
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            if ("true".equals(this.verify)) {
                this.mFaceLoginPresenter.fetchScanToken(loginParam);
            } else if ("true".equals(this.preCheckVerify)) {
                this.mFaceLoginPresenter.activeFaceLogin(loginParam);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSOverLimit(LoginParam loginParam, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c779557c", new Object[]{this, loginParam, rpcResponse});
        } else if (isActive() && rpcResponse != null && rpcResponse.code == 14100) {
            onSendSMSSuccess(loginParam, 60000L, false);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(LoginParam loginParam, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389eeea9", new Object[]{this, loginParam, rpcResponse});
            return;
        }
        AliUserSmsCodeView aliUserSmsCodeView = this.mSmsCodeView;
        if (aliUserSmsCodeView != null) {
            aliUserSmsCodeView.clearText();
        }
    }

    public void onSendSMSAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704a1b2f", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mMaskMobile)) {
            SMSNickLoginPresenter sMSNickLoginPresenter = this.mNickLoginPresenter;
            if (sMSNickLoginPresenter != null && sMSNickLoginPresenter.getLoginParam() != null) {
                this.mNickLoginPresenter.getLoginParam().utPageName = getPageName();
                this.mNickLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.NICK_SMS_LOGIN;
                this.mNickLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.NICK_SMS_LOGIN, getPageName());
                if (this.mUserLoginActivity != null) {
                    this.mNickLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
                }
                this.mNickLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
                this.mNickLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
                HashMap hashMap = new HashMap();
                hashMap.put("sdkTraceId", this.mNickLoginPresenter.getLoginParam().sdkTraceId + "");
                UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.NICK_SMS_LOGIN, hashMap);
                SMSNickLoginPresenter sMSNickLoginPresenter2 = this.mNickLoginPresenter;
                sMSNickLoginPresenter2.sendSMS(sMSNickLoginPresenter2.getLoginParam().loginId);
            }
        } else {
            UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
            if (userMobileLoginPresenter != null && userMobileLoginPresenter.getLoginParam() != null) {
                this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
                this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
                this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, getPageName());
                if (this.mUserLoginActivity != null) {
                    this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
                }
                this.mMobileLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
                this.mMobileLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
                UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.SMS_LOGIN, hashMap2);
                AppMonitorAdapter.commitSuccess("Page_Member_Login", "loginMonitorPoint", "action=smsAction;biz=smsLogin;page=" + getPageName());
                this.mMobileLoginPresenter.sendSMS();
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(LoginParam loginParam, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca12e0c5", new Object[]{this, loginParam, new Long(j), new Boolean(z)});
        } else {
            this.mSendSMSCodeBtn.startCountDown(j, 1000L);
        }
    }

    public void sendCodeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538b8b32", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AliUserSmsCodeView aliUserSmsCodeView = AliUserSMSLoginVerificationFragment.this.mSmsCodeView;
                    if (aliUserSmsCodeView != null) {
                        aliUserSmsCodeView.clearText();
                    }
                    try {
                        AliUserSMSLoginVerificationFragment.this.onSendSMSAction();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void showMoreLoginModeMenu(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940a8aaf", new Object[]{this, loginModeState});
            return;
        }
        this.mChangeLogin.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (AliUserSMSLoginVerificationFragment.access$200(AliUserSMSLoginVerificationFragment.this) != null) {
                        AliUserSMSLoginVerificationFragment.access$300(AliUserSMSLoginVerificationFragment.this).hideInputMethod();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 100L);
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.mAvailableLoginModes.iterator();
        while (it.hasNext()) {
            final String next = it.next();
            if (!TextUtils.equals(loginModeState.name(), next)) {
                com.ali.user.mobile.ui.widget.MenuItem menuItem = new com.ali.user.mobile.ui.widget.MenuItem();
                final LoginModeState valueOf = LoginModeState.valueOf(next);
                int i = valueOf.loginModeName;
                if (i > 0) {
                    menuItem.setText(getString(i));
                    menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/AliUserSMSLoginVerificationFragment$5");
                        }

                        @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                        public void onClickMenuItem(View view, com.ali.user.mobile.ui.widget.MenuItem menuItem2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                            } else if (AliUserSMSLoginVerificationFragment.this.isActive()) {
                                AliUserSMSLoginVerificationFragment.this.switchLoginModeHit(valueOf);
                                if (AliUserSMSLoginVerificationFragment.this.havanaId == 0 || !LoginModeState.SCAN_FACE.name().equals(next)) {
                                    ILoginMethodChange iLoginMethodChange = AliUserSMSLoginVerificationFragment.mLoginMethodChange;
                                    if (iLoginMethodChange != null) {
                                        iLoginMethodChange.onMethodChange(valueOf);
                                    }
                                    AliUserSMSLoginVerificationFragment.mLoginMethodChange = null;
                                    boolean supportOverseaSimLogin = CountryUtil.supportOverseaSimLogin(AliUserSMSLoginVerificationFragment.this.mUserLoginActivity.fireAppLaunchRes);
                                    if (supportOverseaSimLogin) {
                                        Intent intent = new Intent();
                                        intent.putExtra("supportOverseaSimLogin", supportOverseaSimLogin);
                                        intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, valueOf.name());
                                        AliUserSMSLoginVerificationFragment.this.mUserLoginActivity.switchToRecommendLogin(intent);
                                    } else if (AliUserSMSLoginVerificationFragment.this.isActive() && AliUserSMSLoginVerificationFragment.this.getActivity() != null) {
                                        AliUserSMSLoginVerificationFragment.this.goBack();
                                    }
                                } else {
                                    AliUserSMSLoginVerificationFragment.this.onFaceLogin();
                                }
                            }
                        }
                    });
                    arrayList.add(menuItem);
                }
            }
        }
        bottomMenuFragment.setMenuItems(arrayList);
        bottomMenuFragment.setMenuTitle(getString(R.string.aliuser_more_login_mode_title));
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    public void switchLoginModeHit(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9521cfad", new Object[]{this, loginModeState});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), loginModeState.controllName, "");
        }
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.loginParam = null;
        if (arguments != null) {
            String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
            if (!TextUtils.isEmpty(str)) {
                LoginParam loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                this.loginParam = loginParam;
                if (loginParam != null) {
                    this.mOutterSourcePage = loginParam.utPageName;
                    loginParam.utPageName = getPageName();
                }
            }
            this.mMaskMobile = (String) arguments.get("maskMobile");
            arguments.putString("maskMobile", "");
            this.fromPageTag = arguments.getString("pageTag");
            String string = arguments.getString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_METHODS);
            this.preCheckVerify = arguments.getString("preCheckVerify");
            this.verify = arguments.getString("verify");
            this.havanaId = arguments.getLong("havanaId");
            if (!TextUtils.isEmpty(string)) {
                try {
                    ArrayList<String> arrayList = (ArrayList) JSON.parseObject(string, ArrayList.class);
                    this.mAvailableLoginModes = arrayList;
                    if (arrayList != null) {
                        LoginModeState loginModeState = LoginModeState.SCAN_FACE;
                        if (!arrayList.contains(loginModeState.name())) {
                            if (!"true".equals(this.preCheckVerify)) {
                                if ("true".equals(this.verify)) {
                                }
                            }
                            this.mAvailableLoginModes.add(loginModeState.name());
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.supportOverseaSimLogin = arguments.getBoolean("supportOverseaSimLogin", false);
            this.mErrorCode = arguments.getInt("errorCode", 0);
        }
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam);
        this.mNickLoginPresenter = new SMSNickLoginPresenter(this, this.loginParam);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
    }

    public void submitLoginForm() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e52409c", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mMaskMobile)) {
            str = LoginType.LocalLoginType.NICK_SMS_LOGIN;
        } else {
            str = LoginType.LocalLoginType.SMS_LOGIN;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", str, hashMap);
        try {
            IDialogHelper iDialogHelper = this.mDialogHelper;
            if (iDialogHelper != null) {
                iDialogHelper.hideInputMethod();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.mMaskMobile)) {
            this.mNickLoginPresenter.buildSMSLoginParam(this.loginParam.loginId, this.mSmsCodeView.getText(), false);
            this.mNickLoginPresenter.getLoginParam().utPageName = getPageName();
            this.mNickLoginPresenter.login();
            return;
        }
        this.mMobileLoginPresenter.buildSMSLoginParam(this.loginParam.loginId, this.mSmsCodeView.getText(), false);
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.login();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        ArrayList<String> arrayList;
        LoginParam loginParam;
        LoginParam loginParam2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mUserLoginActivity = (UserLoginActivity) getActivity();
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().setTitle("");
            ((BaseActivity) getActivity()).setNavigationBackIcon();
        } catch (Throwable unused) {
        }
        resetActionBar();
        TextView textView = (TextView) view.findViewById(R.id.aliuser_login_sms_code_secondary_title_tv);
        if (14050 == this.mErrorCode || ((loginParam2 = this.loginParam) != null && TextUtils.isEmpty(loginParam2.phoneCode))) {
            textView.setText(getString(R.string.aliuser_sms_code_secondary_title_14050));
        } else {
            LoginParam loginParam3 = this.loginParam;
            if (loginParam3 != null && !TextUtils.isEmpty(loginParam3.loginId)) {
                String str = this.mMaskMobile;
                if (TextUtils.isEmpty(str)) {
                    if ("86".equals(this.loginParam.phoneCode)) {
                        String str2 = this.loginParam.loginId;
                        if (str2.length() == 11) {
                            str2 = this.loginParam.loginId.substring(0, 3) + " " + this.loginParam.loginId.substring(3, 7) + " " + this.loginParam.loginId.substring(7, 11);
                        }
                        str = " " + str2;
                    } else {
                        str = " +" + this.loginParam.phoneCode + "  " + this.loginParam.loginId;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.aliuser_sms_code_secondary_title, str));
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#111111"));
                if (isChineseLanguage()) {
                    try {
                        spannableStringBuilder.setSpan(foregroundColorSpan, 7, string.length() - 10, 33);
                        spannableStringBuilder.setSpan(new StyleSpan(1), 7, string.length() - 10, 33);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                textView.setText(spannableStringBuilder);
            }
        }
        AliUserSmsCodeView aliUserSmsCodeView = (AliUserSmsCodeView) view.findViewById(R.id.aliuser_login_sms_code_view);
        this.mSmsCodeView = aliUserSmsCodeView;
        if (!(aliUserSmsCodeView == null || (loginParam = this.loginParam) == null || TextUtils.isEmpty(loginParam.codeLength))) {
            this.mSmsCodeView.setTextCount(Integer.parseInt(this.loginParam.codeLength));
        }
        this.mSmsCodeView.setOnCompletedListener(new AliUserSmsCodeView.OnCompletedListener() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.register.ui.AliUserSmsCodeView.OnCompletedListener
            public void onCompleted(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d93484bd", new Object[]{this, str3});
                } else {
                    AliUserSMSLoginVerificationFragment.this.submitLoginForm();
                }
            }
        });
        this.mSmsCodeView.focus();
        this.mSmsCodeView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view2, new Boolean(z)});
                } else if (z) {
                    AliUserSMSLoginVerificationFragment.access$000(AliUserSMSLoginVerificationFragment.this, "inputcode_input");
                }
            }
        });
        CountDownButton countDownButton = (CountDownButton) view.findViewById(R.id.aliuser_login_send_smscode_btn);
        this.mSendSMSCodeBtn = countDownButton;
        countDownButton.setOnClickListener(this);
        this.mSendSMSCodeBtn.setGetCodeTitle(R.string.aliuser_signup_verification_reGetCode2);
        this.mSendSMSCodeBtn.setTickTitleRes(R.string.aliuser_sms_code_success_hint2);
        this.mSendSMSCodeBtn.startCountDown(60000L, 1000L);
        TextView textView2 = (TextView) view.findViewById(R.id.aliuser_change_login);
        this.mChangeLogin = textView2;
        if (textView2 != null) {
            if (!LoginSwitch.getSwitch("showOther", "true") || (arrayList = this.mAvailableLoginModes) == null || arrayList.size() <= 1) {
                this.mChangeLogin.setVisibility(8);
            } else {
                this.mChangeLogin.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserSMSLoginVerificationFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            return;
                        }
                        AliUserSMSLoginVerificationFragment.access$100(AliUserSMSLoginVerificationFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER);
                        AliUserSMSLoginVerificationFragment.this.showMoreLoginModeMenu(LoginModeState.SMS_LOGIN);
                    }
                });
            }
        }
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mSendSMSCodeBtn, this.mChangeLogin, textView);
        }
    }
}
