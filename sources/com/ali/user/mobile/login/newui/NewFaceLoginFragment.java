package com.ali.user.mobile.login.newui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.login.ui.FaceLoginView;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewFaceLoginFragment extends NewBaseHistoryFragment implements FaceLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LoginParam loginParam = null;
    public Button mScanLoginButton;
    public String mSource;
    public UserLoginPresenter mUserLoginPresenter;

    static {
        t2o.a(70254624);
        t2o.a(70254788);
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
    }

    public static /* synthetic */ Object ipc$super(NewFaceLoginFragment newFaceLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1829513635:
                super.doRealAction(((Number) objArr[0]).intValue());
                return null;
            case -1824869764:
                super.onPrepareOptionsMenu((Menu) objArr[0]);
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewFaceLoginFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_FACE) {
            onFaceLogin(false);
        } else {
            super.doRealAction(i);
        }
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
        return "Page_FaceLogin";
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mScanLoginButton = (Button) view.findViewById(R.id.aliuser_login_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mScanLoginButton.setText(getResources().getString(R.string.aliuser_scan_login_text_auto));
        } else {
            this.mScanLoginButton.setText(getResources().getString(R.string.aliuser_scan_login_text));
        }
        setOnClickListener(this.mScanLoginButton);
        this.mUserLoginPresenter.onStart();
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mScanLoginButton);
        }
        showBottomAlipay(view);
        showQrLogin(view);
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
        if (view.getId() == R.id.aliuser_login_btn) {
            addCheckAction(LoginClickAction.ACTION_FACE);
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
    }

    public void onDeleteAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b9756a", new Object[]{this});
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
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null) {
            userLoginPresenter.onDestory();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        try {
            menu.findItem(R.id.aliuser_menu_item_more).setVisible(false);
            menu.findItem(R.id.aliuser_menu_item_help).setVisible(true);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment
    public void switchToPwdLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343fb322", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (!(userLoginPresenter == null || userLoginPresenter.getLoginParam() == null)) {
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
        }
        switchToPwdLogin(loginParam);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment
    public void switchToSmsLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab34886", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (!(userLoginPresenter == null || userLoginPresenter.getLoginParam() == null)) {
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
        }
        switchToSmsLogin(loginParam);
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
