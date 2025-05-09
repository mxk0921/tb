package com.ali.user.mobile.login.newui;

import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewAlipayHistoryFragment extends NewBaseHistoryFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isClicked = false;
    public View mAlipayLoginBtn;

    static {
        t2o.a(70254605);
    }

    public static /* synthetic */ boolean access$002(NewAlipayHistoryFragment newAlipayHistoryFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee0a4f3", new Object[]{newAlipayHistoryFragment, new Boolean(z)})).booleanValue();
        }
        newAlipayHistoryFragment.isClicked = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(NewAlipayHistoryFragment newAlipayHistoryFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ali/user/mobile/login/newui/NewAlipayHistoryFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doInResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ead564", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_history_alipay_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return UTConstans.PageName.UT_PAGE_ALIPAY_HISTORY;
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.aliuser_login_login_btn);
        this.mAlipayLoginBtn = findViewById;
        setOnClickListener(findViewById);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_login_login_btn_tv);
        if (CommonUtil.autoCheckbox()) {
            textView.setText(getResources().getString(R.string.ali_user_alipay_login_auto));
        }
        super.initViews(view);
        this.mBioPresenter = new BioPresenter(this, new LoginParam());
        showQrLogin(view);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.aliuser_login_login_btn) {
            super.onClick(view);
        } else if (!this.isClicked || LoginSwitch.getSwitch("ignoreLoginClickCheck", "false")) {
            this.isClicked = true;
            new Handler().postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewAlipayHistoryFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewAlipayHistoryFragment.access$002(NewAlipayHistoryFragment.this, false);
                    }
                }
            }, 200L);
            if (CommonUtil.autoCheckbox()) {
                CheckBox checkBox = this.mProtocolCB;
                if (checkBox != null) {
                    checkBox.setChecked(true);
                }
                addControl("checkAgreement_auto");
                doRealAction(LoginClickAction.ACTION_ALIPAY);
                return;
            }
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else {
            UserTrackAdapter.sendUT(getPageName(), "duplicateLoginClick");
        }
    }
}
