package com.ali.user.mobile.login.newui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.login.presenter.BaseLoginPresenter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewFingerLoginFragment extends NewBaseHistoryFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LoginParam loginParam = null;
    public Button mainButton;

    static {
        t2o.a(70254625);
    }

    public static /* synthetic */ Object ipc$super(NewFingerLoginFragment newFingerLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 230173107:
                super.switchToHistoryMode((HistoryAccount) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewFingerLoginFragment");
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
        return "Page_BioLogin";
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
            try {
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
            } catch (Throwable unused) {
            }
        }
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
        this.mPresenter = new BaseLoginPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mainButton = (Button) view.findViewById(R.id.aliuser_login_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mainButton.setText(getResources().getString(R.string.aliuser_finger_button_text_auto));
        } else {
            this.mainButton.setText(getResources().getString(R.string.aliuser_finger_button_text));
        }
        showBottomAlipay(view);
        showQrLogin(view);
        setOnClickListener(this.mainButton);
        this.mPresenter.onStart();
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mainButton);
        }
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
            addCheckAction(LoginClickAction.ACTION_FINGER);
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

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment
    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        } else {
            super.switchToHistoryMode(historyAccount);
        }
    }
}
