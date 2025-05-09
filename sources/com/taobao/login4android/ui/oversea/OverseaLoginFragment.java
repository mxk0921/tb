package com.taobao.login4android.ui.oversea;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.newui.NewRecommendLoginFragment;
import com.ali.user.mobile.login.presenter.LoginFlowReturnData;
import com.ali.user.mobile.login.presenter.RegionPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.RegionDialogFragment;
import com.ali.user.mobile.register.ui.RegionListener;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OverseaLoginFragment extends NewRecommendLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipay;
    public TextView mAlipayHK;
    public View mAlipayHKLL;
    public View mAlipayLL;
    public TextView mFacebook;
    public LinearLayout mFbLL;
    public LinearLayout mGgLL;
    public TextView mGoogle;
    public View mRegPart;
    public RegionPresenter mRegionPresenter;
    public View mWelcomeTV;
    public TextView snsTextView;

    static {
        t2o.a(70254994);
    }

    public static /* synthetic */ RegionInfo access$002(OverseaLoginFragment overseaLoginFragment, RegionInfo regionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("d935423d", new Object[]{overseaLoginFragment, regionInfo});
        }
        overseaLoginFragment.mRegionInfo = regionInfo;
        return regionInfo;
    }

    public static /* synthetic */ RegionInfo access$100(OverseaLoginFragment overseaLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("d40139bd", new Object[]{overseaLoginFragment});
        }
        return overseaLoginFragment.mRegionInfo;
    }

    public static /* synthetic */ void access$1000(OverseaLoginFragment overseaLoginFragment, LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9cf1c9", new Object[]{overseaLoginFragment, loginModeState});
        } else {
            overseaLoginFragment.showMoreLoginModeMenu(loginModeState);
        }
    }

    public static /* synthetic */ void access$1100(OverseaLoginFragment overseaLoginFragment, LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d180768", new Object[]{overseaLoginFragment, loginModeState});
        } else {
            overseaLoginFragment.switchLoginModeHit(loginModeState);
        }
    }

    public static /* synthetic */ RegionInfo access$200(OverseaLoginFragment overseaLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("9c5f5e5c", new Object[]{overseaLoginFragment});
        }
        return overseaLoginFragment.mRegionInfo;
    }

    public static /* synthetic */ TextView access$300(OverseaLoginFragment overseaLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("9b5f760e", new Object[]{overseaLoginFragment});
        }
        return overseaLoginFragment.mRegionTV;
    }

    public static /* synthetic */ void access$400(OverseaLoginFragment overseaLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108f39b", new Object[]{overseaLoginFragment});
        } else {
            overseaLoginFragment.resizeLoginAccountETPadding();
        }
    }

    public static /* synthetic */ void access$500(OverseaLoginFragment overseaLoginFragment, LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2b9f3", new Object[]{overseaLoginFragment, loginModeState});
        } else {
            overseaLoginFragment.switchLoginModeHit(loginModeState);
        }
    }

    public static /* synthetic */ void access$600(OverseaLoginFragment overseaLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c87e39d", new Object[]{overseaLoginFragment});
        } else {
            overseaLoginFragment.gotoEmailActivity();
        }
    }

    public static /* synthetic */ void access$700(OverseaLoginFragment overseaLoginFragment, LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a8e531", new Object[]{overseaLoginFragment, loginModeState});
        } else {
            overseaLoginFragment.switchLoginModeHit(loginModeState);
        }
    }

    public static /* synthetic */ void access$800(OverseaLoginFragment overseaLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30aff3a9", new Object[]{overseaLoginFragment, str});
        } else {
            overseaLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$900(OverseaLoginFragment overseaLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82bcd6a", new Object[]{overseaLoginFragment, str});
        } else {
            overseaLoginFragment.addControl(str);
        }
    }

    private void gotoEmailActivity() {
        AppLaunchInfoResponseData appLaunchInfoResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7040beaf", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (!(userLoginActivity == null || (appLaunchInfoResponseData = userLoginActivity.fireAppLaunchRes) == null)) {
            bundle.putString(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(appLaunchInfoResponseData));
        }
        NavigatorManager.getInstance().navToEmailLoginPage(getActivity(), bundle);
    }

    public static /* synthetic */ Object ipc$super(OverseaLoginFragment overseaLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -353043723:
                super.resetActionBar();
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/ui/oversea/OverseaLoginFragment");
        }
    }

    private void setFunctionTV(TextView textView, final LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbeac6ee", new Object[]{this, textView, loginModeState});
            return;
        }
        textView.setVisibility(0);
        textView.setText(loginModeState.loginModeName);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LoginModeState loginModeState2 = LoginModeState.EMAIL_PASSWORD;
                LoginModeState loginModeState3 = loginModeState;
                if (loginModeState2 == loginModeState3) {
                    OverseaLoginFragment.access$600(OverseaLoginFragment.this);
                    return;
                }
                OverseaLoginFragment.access$1100(OverseaLoginFragment.this, loginModeState3);
                OverseaLoginFragment.this.updateLoginModeState(loginModeState);
            }
        });
    }

    public void applyRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a37f89", new Object[]{this});
        } else {
            this.mRegionPresenter.region(0);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doInResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ead564", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_recommend_oversea_mobile;
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return UTConstant.PageName.UT_PAGE_SMS_OVERSEA;
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment
    public void goToSMSVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
        } else if (this.mUserLoginActivity != null) {
            intent.putExtra(LoginConstant.FROM_OVERSEA, true);
            this.mUserLoginActivity.goToSMSVerificationPage(intent);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mRegionPresenter = new RegionPresenter(this);
        super.initViews(view);
        int i3 = 8;
        if (isChineseLanguage()) {
            this.moreFuncMenu.setVisibility(8);
            EditText editText = this.mLoginAccountET;
            int i4 = R.drawable.aliuser_edittext_bg_tb;
            editText.setBackgroundResource(i4);
            this.mPasswordET.setBackgroundResource(i4);
        } else {
            this.moreFuncMenu.setVisibility(8);
            EditText editText2 = this.mLoginAccountET;
            int i5 = R.drawable.aliuser_edittext_square_bg;
            editText2.setBackgroundResource(i5);
            this.mPasswordET.setBackgroundResource(i5);
        }
        this.mWelcomeTV = view.findViewById(R.id.aliuser_welcome);
        this.mRegPart = view.findViewById(R.id.aliuser_reg_part);
        if (!isChineseLanguage()) {
            this.mWelcomeTV.setVisibility(8);
            this.mRegPart.setVisibility(8);
            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }
        }
        this.snsTextView = (TextView) view.findViewById(R.id.aliuser_sns_hint_tv);
        this.mAlipayHK = (TextView) view.findViewById(R.id.ali_user_login_alipayhk_login_tv);
        this.mAlipayHKLL = view.findViewById(R.id.aliuser_sns_alipayhk_ll);
        this.mAlipayHK.setOnClickListener(this);
        this.mAlipay = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        this.mAlipayLL = view.findViewById(R.id.aliuser_sns_alipay_ll);
        this.takeAvaliable = false;
        TextView textView = this.mAlipay;
        if (textView != null) {
            textView.setOnClickListener(this);
            showAlipay();
        }
        this.mGoogle = (TextView) view.findViewById(R.id.aliuser_recommend_google);
        this.mFacebook = (TextView) view.findViewById(R.id.aliuser_recommend_facebook);
        boolean supportGoogleFB = UserLoginActivity.supportGoogleFB();
        TextView textView2 = this.snsTextView;
        if (this.mUserLoginActivity.mAlipayInstall || supportGoogleFB) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        View view2 = this.mAlipayLL;
        if (this.mUserLoginActivity.mAlipayInstall) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        TextView textView3 = this.mAlipay;
        if (this.mUserLoginActivity.mAlipayInstall) {
            i3 = 0;
        }
        textView3.setVisibility(i3);
        AlipayAuth.supportAlipayHK(getActivity(), new CommonCallback() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i6, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i6), str});
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else if (LanguageUtil.isHK()) {
                    OverseaLoginFragment.this.snsTextView.setVisibility(0);
                    OverseaLoginFragment.this.mAlipayHK.setVisibility(0);
                    OverseaLoginFragment.this.mAlipayHKLL.setVisibility(0);
                }
            }
        });
        this.mGgLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_gg_ll);
        this.mFbLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_fb_ll);
        if (supportGoogleFB) {
            LinearLayout linearLayout = this.mGgLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView4 = this.mGoogle;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.mGoogle.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            OverseaLoginFragment.this.addCheckAction(LoginClickAction.ACTION_GOOGLE_LOGIN);
                        }
                    }
                });
            }
            LinearLayout linearLayout2 = this.mFbLL;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView5 = this.mFacebook;
            if (textView5 != null) {
                textView5.setVisibility(0);
                this.mFacebook.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            OverseaLoginFragment.this.addCheckAction(LoginClickAction.ACTION_FACEBOOK_LOGIN);
                        }
                    }
                });
            }
            setupLineLogin(view);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.ali_user_login_alipay_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else if (id == R.id.ali_user_login_alipayhk_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAYHK_LOGIN);
        } else if (id == R.id.aliuser_recommend_login_region_tv) {
            addControl("Button-Region");
            applyRegion();
        } else if (id == R.id.aliuser_recommend_login_menu) {
            addControl("help");
            openHelp();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        if (isChineseLanguage()) {
            menu.clear();
            menuInflater.inflate(R.menu.aliuser_menu, menu);
            try {
                menu.findItem(R.id.aliuser_menu_item_help).setTitle(getResources().getString(R.string.aliuser_need_help));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        } else if (isActive()) {
            RegionDialogFragment regionDialogFragment = new RegionDialogFragment();
            regionDialogFragment.setList(list, hashMap, list2);
            regionDialogFragment.setRegionListener(new RegionListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.register.ui.RegionListener
                public void onClick(RegionInfo regionInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9431c0af", new Object[]{this, regionInfo});
                        return;
                    }
                    OverseaLoginFragment.access$002(OverseaLoginFragment.this, regionInfo);
                    if (OverseaLoginFragment.access$100(OverseaLoginFragment.this) != null) {
                        OverseaLoginFragment.access$300(OverseaLoginFragment.this).setText(OverseaLoginFragment.access$200(OverseaLoginFragment.this).code);
                        OverseaLoginFragment.access$400(OverseaLoginFragment.this);
                    }
                }
            });
            regionDialogFragment.setCurrentRegion(this.mRegionInfo);
            regionDialogFragment.setupAdapter(getActivity());
            try {
                regionDialogFragment.show(getActivity().getSupportFragmentManager(), "MobileRegionDialog");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void resetActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4faf5", new Object[]{this});
        } else if (isChineseLanguage()) {
            super.resetActionBar();
        } else {
            this.mUserLoginActivity.setBackground(true);
        }
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipay, null, false);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment
    public void updateOtherLoginMode(final LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1070e3", new Object[]{this, loginModeState});
            return;
        }
        List<String> list = this.mAvailableLoginModes;
        if (list == null || list.size() == 0) {
            this.mLeftFuncTV.setVisibility(8);
        } else if (this.mAvailableLoginModes.size() == 1 && this.mCurrentLoginModeState == LoginModeState.SIM_LOGIN) {
            final LoginModeState valueOf = LoginModeState.valueOf(this.mAvailableLoginModes.get(0));
            if (valueOf.loginModeName > 0) {
                this.mLeftFuncTV.setVisibility(0);
                this.mLeftFuncTV.setText(valueOf.loginModeName);
                this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        OverseaLoginFragment.access$500(OverseaLoginFragment.this, valueOf);
                        OverseaLoginFragment.this.updateLoginModeState(valueOf);
                    }
                });
                return;
            }
            this.mLeftFuncTV.setVisibility(8);
        } else if (this.mAvailableLoginModes.size() == 1) {
            this.mLeftFuncTV.setVisibility(8);
        } else if (this.mAvailableLoginModes.size() != 2 || this.mCurrentLoginModeState == LoginModeState.SIM_LOGIN) {
            if (this.mAvailableLoginModes.size() == 3) {
                LoginModeState loginModeState2 = this.mCurrentLoginModeState;
                LoginModeState loginModeState3 = LoginModeState.SMS_LOGIN;
                if (loginModeState2 == loginModeState3) {
                    setFunctionTV(this.mLeftFuncTV, LoginModeState.PASSWORD);
                    setFunctionTV(this.mRightFuncTV, LoginModeState.EMAIL_PASSWORD);
                } else if (loginModeState2 == LoginModeState.PASSWORD) {
                    setFunctionTV(this.mLeftFuncTV, loginModeState3);
                    this.mRightFuncTV.setVisibility(0);
                    this.mRightFuncTV.setText(getString(R.string.aliuser_sign_in_forget_password));
                    this.mRightFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            OverseaLoginFragment.access$800(OverseaLoginFragment.this, "Button-ResetPwd");
                            OverseaLoginFragment.this.onForgetPasswordAction();
                        }
                    });
                }
            } else if (loginModeState != LoginModeState.LOCATION) {
                this.mLeftFuncTV.setVisibility(0);
                this.mLeftFuncTV.setText(R.string.aliuser_login_more_login);
                this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        OverseaLoginFragment.access$900(OverseaLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER);
                        OverseaLoginFragment.access$1000(OverseaLoginFragment.this, loginModeState);
                    }
                });
            } else {
                this.mLeftFuncTV.setVisibility(8);
            }
        } else if (loginModeState != LoginModeState.LOCATION) {
            for (String str : this.mAvailableLoginModes) {
                if (!TextUtils.equals(loginModeState.name(), str)) {
                    final LoginModeState valueOf2 = LoginModeState.valueOf(str);
                    if (valueOf2.loginModeName > 0) {
                        this.mLeftFuncTV.setVisibility(0);
                        if (TextUtils.equals(valueOf2.name(), LoginModeState.SMS_LOGIN.name())) {
                            this.mLeftFuncTV.setText(R.string.aliuser_login_sms_login_oversea);
                        } else {
                            this.mLeftFuncTV.setText(valueOf2.loginModeName);
                        }
                        this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaLoginFragment.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                LoginModeState loginModeState4 = valueOf2;
                                if (loginModeState4 == LoginModeState.EMAIL_PASSWORD) {
                                    OverseaLoginFragment.access$600(OverseaLoginFragment.this);
                                    return;
                                }
                                OverseaLoginFragment.access$700(OverseaLoginFragment.this, loginModeState4);
                                OverseaLoginFragment.this.updateLoginModeState(valueOf2);
                            }
                        });
                    } else {
                        this.mLeftFuncTV.setVisibility(8);
                    }
                }
            }
        } else {
            this.mLeftFuncTV.setVisibility(8);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewRecommendLoginFragment
    public void updateLoginModeState(LoginModeState loginModeState) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c8f43a", new Object[]{this, loginModeState});
            return;
        }
        this.mCurrentLoginModeState = loginModeState;
        TextView textView = this.mTipsTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
        updateLoginHint();
        this.mLoginAccountET.setInputType(1);
        this.mRegionTV.setVisibility(loginModeState.regionTVVisibility);
        String str2 = "";
        if (loginModeState == LoginModeState.LOCATION) {
            if (!TextUtils.isEmpty(this.mOriginUserInput)) {
                this.mLoginAccountET.setText(this.mOriginUserInput);
                this.mLoginAccountET.setSelection(this.mOriginUserInput.length());
            }
        } else if (loginModeState == LoginModeState.PASSWORD) {
            this.mLoginAccountET.setText(getAccountNameForPassword(this.mRecommendLoginId));
            this.mPasswordET.setText(str2);
            TextView textView2 = this.mTipsTV;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            LoginModeState loginModeState2 = LoginModeState.SMS_LOGIN;
            if (loginModeState == loginModeState2 || loginModeState == LoginModeState.SIM_LOGIN) {
                this.mLoginAccountET.setText(this.mRecommendLoginId);
                if (this.supportOverseaSimLogin || loginModeState2.name().equals(this.paramModeState)) {
                    this.mLoginAccountET.setInputType(2);
                } else {
                    this.mLoginAccountET.setInputType(1);
                }
                if (this.mTipsTV != null) {
                    LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
                    if (loginFlowReturnData == null || TextUtils.isEmpty(loginFlowReturnData.maskMobile)) {
                        this.mTipsTV.setText(getString(R.string.aliuser_oversea_mobile_hint));
                    } else {
                        this.mTipsTV.setVisibility(0);
                        this.mRegionTV.setVisibility(8);
                        TextView textView3 = this.mTipsTV;
                        int i = R.string.aliuser_sms_nick_login_tips;
                        textView3.setText(getString(i, this.mLoginFlowReturnData.maskMobile + " "));
                    }
                }
                this.mRightFuncTV.setVisibility(0);
                this.mRightFuncTV.setText(R.string.aliuser_oversea_email_pwd_login);
            } else {
                this.mLoginAccountET.setText(this.mRecommendLoginId);
            }
        }
        LoginModeState loginModeState3 = LoginModeState.SMS_LOGIN;
        if (loginModeState == loginModeState3 || loginModeState == LoginModeState.SIM_LOGIN) {
            initRegionInfo(this.mLoginParam);
        } else {
            resetLoginAccountETPadding();
        }
        this.mRightFuncTV.setVisibility(loginModeState.rightFuncTVVisibility);
        TextView textView4 = this.mProtocolTV;
        if (textView4 != null) {
            textView4.setVisibility(0);
            if (loginModeState.protocolVisibility != 0 || ServiceFactory.getService(NumberAuthService.class) == null || ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() == null) {
                str = str2;
            } else {
                str2 = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
                str = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
            }
            generateProtocol(str2, str);
        }
        if (loginModeState.passwordVisibility == 0) {
            viewVisibleAnimate(this.mPasswordRL, 45);
        } else {
            viewGoneAnimate(this.mPasswordRL);
        }
        this.mRecommendLoginNextBtn.setText(loginModeState.loginBtnText);
        if (this.supportOverseaSimLogin || loginModeState3.name().equals(this.paramModeState) || LoginModeState.PASSWORD.name().equals(this.paramModeState)) {
            if (TextUtils.equals(loginModeState3.name(), loginModeState.name())) {
                this.mRecommendLoginNextBtn.setText(R.string.aliuser_confirm);
            }
            ArrayList arrayList = new ArrayList();
            if (isChineseLanguage()) {
                arrayList.add(LoginModeState.PASSWORD.name());
            }
            arrayList.add(loginModeState3.name());
            arrayList.add(LoginModeState.EMAIL_PASSWORD.name());
            this.mAvailableLoginModes = arrayList;
            updateOtherLoginMode(loginModeState);
            return;
        }
        updateOtherLoginMode(loginModeState);
    }
}
