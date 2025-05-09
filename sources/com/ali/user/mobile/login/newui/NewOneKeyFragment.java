package com.ali.user.mobile.login.newui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.OneKeyLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.OneKeyLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ui.LoginCouponHelper;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewOneKeyFragment extends NewBaseLoginFragment implements OneKeyLoginView, UserMobileLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mMobileNum;
    public Button mOneKeyLoginButton;
    public TextView mShowIdTextView;
    public String mSource;
    public OneKeyLoginPresenter oneKeyLoginPresenter;
    public LoginParam loginParam = null;
    public boolean isSendSms = false;
    private boolean isClicked = false;

    static {
        t2o.a(70254629);
        t2o.a(70254799);
        t2o.a(70254806);
    }

    public static /* synthetic */ boolean access$002(NewOneKeyFragment newOneKeyFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bed0f6b0", new Object[]{newOneKeyFragment, new Boolean(z)})).booleanValue();
        }
        newOneKeyFragment.isClicked = z;
        return z;
    }

    public static /* synthetic */ void access$100(NewOneKeyFragment newOneKeyFragment, View view, Button button, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5baa35", new Object[]{newOneKeyFragment, view, button, imageView});
        } else {
            newOneKeyFragment.handleLayoutLogic(view, button, imageView);
        }
    }

    private void handleLayoutLogic(View view, Button button, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe1503f", new Object[]{this, view, button, imageView});
            return;
        }
        try {
            int height = button.getHeight();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = height;
            imageView.setLayoutParams(layoutParams);
            int[] iArr = new int[2];
            button.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((RelativeLayout) view.findViewById(R.id.aliuser_user_login_ll)).getLocationOnScreen(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            int width = imageView.getWidth();
            if (!(imageView.getDrawable() == null || imageView.getDrawable().getIntrinsicHeight() == 0)) {
                width = (imageView.getDrawable().getIntrinsicWidth() * height) / imageView.getDrawable().getIntrinsicHeight();
            }
            layoutParams.width = width;
            imageView.setLayoutParams(layoutParams);
            setupScanAnimation(imageView, i, button.getWidth(), width, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initParams() {
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
                    LoginParam loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                    this.loginParam = loginParam;
                    if (loginParam != null) {
                        this.mSource = loginParam.source;
                    }
                }
                this.mMobileNum = arguments.getString("number", "");
                this.mProtocolTitle = arguments.getString("protocolName", "");
                this.mProtocolUrl = arguments.getString("protocolURL", "");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginParam();
        }
        this.oneKeyLoginPresenter = new OneKeyLoginPresenter(this, this.loginParam);
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam);
    }

    public static /* synthetic */ Object ipc$super(NewOneKeyFragment newOneKeyFragment, String str, Object... objArr) {
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
            case -880302057:
                super.doRealAction(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewOneKeyFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        } else {
            PrivacyUtil.addMoreMenus(bottomMenuFragment, list, this);
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void doRealAction(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb87a817", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onOneKeyLogin(z);
        } else {
            super.doRealAction(i, z);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        return o78.CHINA_MAINLAND;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getFindAccountText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e44708e", new Object[]{this});
        }
        return getString(R.string.aliuser_find_account);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_onekey_login_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "Page_onekey_login";
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        return "86";
    }

    public void goToSMSVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
            return;
        }
        try {
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null) {
                userLoginActivity.goToSMSVerificationPage(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.isSendSms) {
            this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
        } else {
            this.oneKeyLoginPresenter.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
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
        OneKeyLoginPresenter oneKeyLoginPresenter = this.oneKeyLoginPresenter;
        if (oneKeyLoginPresenter != null) {
            oneKeyLoginPresenter.onDestory();
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail(LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f903ba0", new Object[]{this, loginParam});
        } else if (isActivityAvaiable()) {
            dismissLoading();
            toast(getString(R.string.aliuser_onekey_login_fail_tip), 0);
            switchToRecommendLogin();
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSOverLimit(LoginParam loginParam, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c779557c", new Object[]{this, loginParam, rpcResponse});
        } else {
            onSMSSendFail(loginParam, rpcResponse);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(LoginParam loginParam, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389eeea9", new Object[]{this, loginParam, rpcResponse});
        } else if (rpcResponse != null && rpcResponse.code == 14100 && isActive()) {
            onSendSMSSuccess(loginParam, 60000L, false);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(LoginParam loginParam, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca12e0c5", new Object[]{this, loginParam, new Long(j), new Boolean(z)});
        } else if (isActive()) {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mMobileLoginPresenter.mLoginParam));
            intent.putExtra("pageTag", FragmentConstant.ONE_KEY_LOGIN_FRAGMENT_TAG);
            goToSMSVerificationPage(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        try {
            final Button button = (Button) view.findViewById(R.id.aliuser_onekey_login_btn);
            final ImageView imageView = (ImageView) view.findViewById(R.id.scan_overlay);
            imageView.setVisibility(4);
            button.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ali.user.mobile.login.newui.NewOneKeyFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    try {
                        Button button2 = button;
                        if (button2 != null) {
                            button2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                        NewOneKeyFragment.access$100(NewOneKeyFragment.this, view, button, imageView);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public boolean showMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c018ff7d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void switchToRecommendLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97b4543", new Object[]{this});
        } else {
            switchAccount();
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_onekey_login_btn) {
            if (!this.isClicked || LoginSwitch.getSwitch("ignoreLoginClickCheck", "false")) {
                this.isClicked = true;
                new Handler().postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewOneKeyFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NewOneKeyFragment.access$002(NewOneKeyFragment.this, false);
                        }
                    }
                }, 200L);
                addCheckAction(LoginClickAction.ACTION_LOGIN);
                return;
            }
            UserTrackAdapter.sendUT(getPageName(), "duplicateLoginClick");
        } else if (id == R.id.aliuser_switch_recommend_login) {
            addControl("otherid");
            switchToRecommendLogin();
        } else {
            super.onClick(view);
        }
    }

    public void onOneKeyLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6da45c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isSendSms = false;
        this.loginParam.sdkTraceId = ApiReferer.generateTraceId("oneKeyLogin", getPageName());
        LoginParam loginParam = this.loginParam;
        loginParam.loginSourceType = "oneKeyLogin";
        loginParam.utPageName = getPageName();
        this.loginParam.regXianyu = z;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SIM_LOGIN, hashMap);
        this.oneKeyLoginPresenter.login();
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

    private void setupScanAnimation(final ImageView imageView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4117d4b", new Object[]{this, imageView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            imageView.setY(i4);
            imageView.setTranslationX(0.0f);
            imageView.setVisibility(0);
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "x", i - i3, i + i2);
            ofFloat.setDuration(800L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(0);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.ali.user.mobile.login.newui.NewOneKeyFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewOneKeyFragment$3");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        imageView.setVisibility(4);
                    }
                }
            });
            new Handler().post(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewOneKeyFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ofFloat.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().setTitle("");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        UserLoginActivity userLoginActivity = (UserLoginActivity) getActivity();
        this.mUserLoginActivity = userLoginActivity;
        LoginCouponHelper.handleCoupon(view, userLoginActivity);
        resetActionBar();
        this.mShowIdTextView = (TextView) view.findViewById(R.id.aliuser_login_account_tv);
        try {
            if (LoginSwitch.getSwitch("useActivityCacheMobile", "true") && TextUtils.isEmpty(this.mMobileNum)) {
                this.mMobileNum = this.mUserLoginActivity.cacheMaskMobile;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (this.mShowIdTextView != null && !TextUtils.isEmpty(this.mMobileNum)) {
            this.mShowIdTextView.setText(this.mMobileNum);
        }
        this.mOneKeyLoginButton = (Button) view.findViewById(R.id.aliuser_onekey_login_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mOneKeyLoginButton.setText(getResources().getString(R.string.aliuser_onekey_history_button_text_auto));
        }
        showBottomAlipay(view);
        showQrLogin(view);
        setOnClickListener(this.mOneKeyLoginButton);
        this.oneKeyLoginPresenter.onStart();
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mOneKeyLoginButton, this.mShowIdTextView);
        }
    }
}
