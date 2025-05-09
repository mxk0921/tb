package com.ali.user.mobile.login.newui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.OneKeyLoginPresenter;
import com.ali.user.mobile.login.ui.BaseLoginView;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.OceanRegisterParam;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.register.ui.RegisterFormView;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewOneKeyRegFragment extends BaseRegisterFragment implements RegisterFormView, BaseLoginView, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.numAuthReg";
    public String mMobileNum;
    public String mOneKeyMobileNum;
    public Button mOneKeyRegBtn;
    public String mProtocolTitle;
    public String mProtocolUrl;
    public RegistParam mRegistParam;
    public TextView mShowIdTextView;
    public TextView mSwitchMobileRegTV;
    public OneKeyLoginPresenter oneKeyLoginPresenter;
    public OceanRegisterParam mTraceParam = new OceanRegisterParam();
    private long lastClickRegisterBtnTime = 0;

    static {
        t2o.a(70254636);
        t2o.a(70254847);
        t2o.a(70254782);
    }

    public static /* synthetic */ void access$000(NewOneKeyRegFragment newOneKeyRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbba585c", new Object[]{newOneKeyRegFragment, str});
        } else {
            newOneKeyRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(NewOneKeyRegFragment newOneKeyRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e33a9d", new Object[]{newOneKeyRegFragment, str});
        } else {
            newOneKeyRegFragment.addControl(str);
        }
    }

    private void initParams() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.mMobileNum = arguments.getString(RegistConstants.REGISTER_MOBILE_NUM);
                this.mOneKeyMobileNum = arguments.getString("number", "");
                this.mProtocolTitle = arguments.getString("protocolName", "");
                this.mProtocolUrl = arguments.getString("protocolURL", "");
                Serializable serializable = arguments.getSerializable(RegistConstants.REGISTPARAM);
                if (serializable instanceof RegistParam) {
                    this.mRegistParam = (RegistParam) serializable;
                }
                RegistParam registParam = this.mRegistParam;
                if (registParam != null && (map = registParam.externParams) != null) {
                    String str = map.get(LoginConstant.APPLAUNCH_INFO);
                    if (!TextUtils.isEmpty(str)) {
                        this.mFireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(str, AppLaunchInfoResponseData.class);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(NewOneKeyRegFragment newOneKeyRegFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -1010147231:
                super.dismissAlertDialog();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewOneKeyRegFragment");
        }
    }

    public void createPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f203b93", new Object[]{this});
        } else {
            this.oneKeyLoginPresenter = new OneKeyLoginPresenter(this, null);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
        } else {
            super.dismissAlertDialog();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public HistoryAccount getHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("81832384", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_fragment_onekey_register_tb_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        return DataProviderFactory.getDataProvider().getSite();
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return UTConstans.PageName.UT_PAGE_ONEKEY_REG_NEW;
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public String getRegType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this});
        }
        return "oneKeyRegister";
    }

    public CommonUICallback getUICallback(final LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("6dfa55a0", new Object[]{this, loginParam});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.newui.NewOneKeyRegFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                SmsApplyResult smsApplyResult;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i == 5006) {
                    NewOneKeyRegFragment.this.switchToMobileRegPage();
                } else if (i != 6001) {
                    if (i == 6003) {
                        NewOneKeyRegFragment.this.switchToMobileRegPage();
                    }
                } else if (map != null) {
                    long longValue = ((Long) map.get("millSecond")).longValue();
                    try {
                        smsApplyResult = (SmsApplyResult) map.get("result");
                    } catch (Throwable th) {
                        th.printStackTrace();
                        smsApplyResult = null;
                    }
                    NewOneKeyRegFragment.this.onSendSMSSuccess(loginParam, longValue, smsApplyResult);
                }
            }
        };
    }

    @Override // com.ali.user.mobile.login.newui.BaseRegisterFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
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
        try {
            TextView textView = (TextView) view.findViewById(R.id.aliuser_login_account_tv);
            this.mShowIdTextView = textView;
            if (textView != null && !TextUtils.isEmpty(this.mOneKeyMobileNum)) {
                this.mShowIdTextView.setText(this.mOneKeyMobileNum);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.mOneKeyRegBtn = (Button) view.findViewById(R.id.aliuser_onekey_reg_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mOneKeyRegBtn.setText(getResources().getString(R.string.aliuser_agree_and_onekey_reg_tb_auto));
        }
        this.mOneKeyRegBtn.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.aliuser_switch_recommend_login);
        this.mSwitchMobileRegTV = textView2;
        textView2.setOnClickListener(this);
        showBottomAlipay(view);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mOneKeyRegBtn, this.mSwitchMobileRegTV, this.mShowIdTextView, this.mProtocolTV);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public boolean isActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        return isActivityAvaiable();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        alert("", getString(R.string.aliuser_onekey_reg_retain_title), getString(R.string.aliuser_reg_continue), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewOneKeyRegFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    NewOneKeyRegFragment.access$000(NewOneKeyRegFragment.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CANCEL);
                }
            }
        }, getString(R.string.aliuser_exit), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewOneKeyRegFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                NewOneKeyRegFragment.access$100(NewOneKeyRegFragment.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CLICK);
                if (NewOneKeyRegFragment.this.getActivity() != null) {
                    NewOneKeyRegFragment.this.getActivity().finish();
                }
            }
        });
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_onekey_reg_btn) {
            addCheckAction(LoginClickAction.ACTION_REG);
        } else if (id == R.id.aliuser_switch_recommend_login) {
            addControl(UTConstans.Controls.UT_OTHER_NUMBERS);
            switchToMobileRegPage();
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        createPresenter();
        initParams();
    }

    @Override // com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
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

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), new HashMap());
        UserTrackAdapter.updatePageName(getActivity(), getPageName());
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public void onSendSMSSuccess(LoginParam loginParam, long j, SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d70ad1d", new Object[]{this, loginParam, new Long(j), smsApplyResult});
        }
    }

    @Override // com.ali.user.mobile.login.newui.BaseRegisterFragment
    public void regTaobaoOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456c3735", new Object[]{this});
        } else {
            commonAddCheckTaobaoOnly(LoginClickAction.ACTION_REG, this.mProtocolCB);
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void registerAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1871b814", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickRegisterBtnTime >= 1000) {
            this.lastClickRegisterBtnTime = currentTimeMillis;
            OceanRegisterParam oceanRegisterParam = new OceanRegisterParam();
            this.mTraceParam = oceanRegisterParam;
            oceanRegisterParam.loginSourcePage = getPageName();
            this.mTraceParam.loginSourceType = "oneKeyRegister";
            String generateTraceId = ApiReferer.generateTraceId("oneKeyRegister", getPageName());
            this.mTraceParam.traceId = generateTraceId;
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("sdkTraceId", generateTraceId);
                UserTrackAdapter.control(getPageName(), UTConstans.Controls.UT_REG_BTN, "", hashMap);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            LoginParam loginParam = new LoginParam();
            HashMap hashMap2 = new HashMap();
            loginParam.ext = hashMap2;
            hashMap2.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SIM_LOGIN, getPageName(), AppInfo.getInstance().getUtdid() + String.valueOf(System.currentTimeMillis() / 1000));
            loginParam.loginSourceType = LoginType.LocalLoginType.SIM_LOGIN;
            loginParam.utPageName = getPageName();
            loginParam.regXianyu = z;
            this.oneKeyLoginPresenter.login(this.mAttachedActivity, loginParam, getUICallback(loginParam));
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void switchToMobileRegPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddbe139", new Object[]{this});
        } else if (getActivity() != null) {
            Intent intent = new Intent();
            CheckBox checkBox = this.mProtocolCB;
            if (checkBox != null) {
                intent.putExtra("check", checkBox.isChecked());
            }
            CheckBox checkBox2 = this.mProtocolCBXianyu;
            if (checkBox2 != null) {
                intent.putExtra("xianyu_check", checkBox2.isChecked());
            }
            ((AliUserRegisterActivity) getActivity()).gotoTwoStepMobileRegFragment(intent);
        }
    }
}
