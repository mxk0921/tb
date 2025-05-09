package com.ali.user.mobile.login.newui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.login.ui.FaceLoginView;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewAlipayFragment extends NewBaseLoginFragment implements FaceLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View mAlipayLoginBtn;
    public TextView mRecommendLoginTV;
    public String mSource;
    public UserLoginPresenter mUserLoginPresenter;
    public LoginParam loginParam = null;
    private boolean isClicked = false;

    static {
        t2o.a(70254603);
        t2o.a(70254788);
    }

    public static /* synthetic */ boolean access$002(NewAlipayFragment newAlipayFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59098961", new Object[]{newAlipayFragment, new Boolean(z)})).booleanValue();
        }
        newAlipayFragment.isClicked = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(NewAlipayFragment newAlipayFragment, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewAlipayFragment");
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

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_alipay_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return UTConstans.PageName.UT_PAGE_ALIPAY;
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
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
        }
        this.mUserLoginPresenter = new UserLoginPresenter(this, this.loginParam);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
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
        showBottomOther(view);
        View findViewById = view.findViewById(R.id.aliuser_login_login_btn);
        this.mAlipayLoginBtn = findViewById;
        setOnClickListener(findViewById);
        this.mUserLoginPresenter.onStart();
        TextView textView = (TextView) view.findViewById(R.id.aliuser_login_login_btn_tv);
        if (CommonUtil.autoCheckbox()) {
            textView.setText(getResources().getString(R.string.ali_user_alipay_login_auto));
        }
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(textView, this.mRecommendLoginTV, this.mProtocolTV);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("resumeToOnekey" + getPageName(), 10000);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.mUserLoginPresenter.onActivityResult(i, i2, intent);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        if (view.getId() != R.id.aliuser_login_login_btn) {
            super.onClick(view);
        } else if (!this.isClicked || LoginSwitch.getSwitch("ignoreLoginClickCheck", "false")) {
            this.isClicked = true;
            new Handler().postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewAlipayFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewAlipayFragment.access$002(NewAlipayFragment.this, false);
                    }
                }
            }, 200L);
            if (CommonUtil.autoCheckbox()) {
                CheckBox checkBox = this.mProtocolCB;
                if (checkBox != null) {
                    checkBox.setChecked(true);
                }
                addControl("checkAgreement_auto");
                doRealAction(LoginClickAction.ACTION_ALIPAY, showXianyuTogether());
                return;
            }
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else {
            UserTrackAdapter.sendUT(getPageName(), "duplicateLoginClick");
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
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null) {
            userLoginPresenter.onDestory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UserTrackAdapter.pageDisAppear(getActivity());
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public boolean showMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c018ff7d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ali.user.mobile.login.ui.FaceLoginView
    public void toLastLoginFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db8452f", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (!(userLoginPresenter == null || userLoginPresenter.getLoginParam() == null)) {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.goPwdOrSMSFragment(intent);
    }
}
