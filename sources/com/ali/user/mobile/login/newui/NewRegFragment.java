package com.ali.user.mobile.login.newui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.RegionPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.OceanRegisterParam;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity;
import com.ali.user.mobile.register.ui.RegionDialogFragment;
import com.ali.user.mobile.register.ui.RegionListener;
import com.ali.user.mobile.register.ui.RegisterFormView;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import tb.f7l;
import tb.o78;
import tb.rmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewRegFragment extends BaseRegisterFragment implements RegisterFormView, UserMobileLoginView, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.twoStepMobileReg";
    public boolean alipayInstalled;
    public String mCodeLength;
    public View mMobileClearBtn;
    public EditText mMobileET;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mMobileNum;
    public String mMobileStr;
    public TextWatcher mMobileTextWatcher;
    public Button mRegBtn;
    public LinearLayout mRegBtnLL;
    public RegionInfo mRegionInfo;
    public RegionPresenter mRegionPresenter;
    public TextView mRegionTV;
    public RegistParam mRegistParam;
    public String mSessionId;
    public String mSource;
    public TextView mTitleTV;
    public TextView mWelcomeTV;
    public int originalAccountETPadding;
    public TextView toEmailTV;
    public boolean mobileCheckSimilarity = true;
    public boolean isVoice = false;
    public OceanRegisterParam mTraceParam = new OceanRegisterParam();
    private boolean mobileUT = true;
    private boolean checkcodeUT = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class MobileTextWatcher extends PhoneNumberFormattingTextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<EditText> editText;

        static {
            t2o.a(70254680);
        }

        public static /* synthetic */ Object ipc$super(MobileTextWatcher mobileTextWatcher, String str, Object... objArr) {
            if (str.hashCode() == 1731819568) {
                super.onTextChanged((CharSequence) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewRegFragment$MobileTextWatcher");
        }

        @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            super.onTextChanged(charSequence, i, i2, i3);
            if (NewRegFragment.access$200(NewRegFragment.this) && !TextUtils.isEmpty(charSequence)) {
                NewRegFragment.access$202(NewRegFragment.this, false);
                UserTrackAdapter.sendUT(NewRegFragment.this.getPageName(), "InputPhone");
            }
            NewRegFragment.this.checkRegAble(this.editText.get());
        }

        private MobileTextWatcher(EditText editText, String str) {
            super(str);
            this.editText = new WeakReference<>(editText);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class RegTextWatcher implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<EditText> editText;

        static {
            t2o.a(70254681);
        }

        public RegTextWatcher(EditText editText) {
            this.editText = new WeakReference<>(editText);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (this.editText.get().getId() != R.id.aliuser_register_mobile_et || NewRegFragment.this.mMobileClearBtn == null) {
                if (this.editText.get().getId() == R.id.aliuser_register_sms_code_et && charSequence != null && charSequence.length() > 0 && NewRegFragment.access$300(NewRegFragment.this)) {
                    NewRegFragment.access$302(NewRegFragment.this, false);
                    UserTrackAdapter.sendUT(NewRegFragment.this.getPageName(), "InputCode");
                }
            } else if (charSequence != null && charSequence.length() != 0) {
                if (NewRegFragment.access$200(NewRegFragment.this)) {
                    NewRegFragment.access$202(NewRegFragment.this, false);
                    UserTrackAdapter.sendUT(NewRegFragment.this.getPageName(), "InputPhone");
                }
                if (NewRegFragment.this.mMobileClearBtn.getVisibility() != 0 && NewRegFragment.this.mMobileClearBtn.isEnabled()) {
                    NewRegFragment.this.mMobileClearBtn.setVisibility(0);
                }
            } else if (NewRegFragment.this.mMobileClearBtn.getVisibility() != 8) {
                NewRegFragment.this.mMobileClearBtn.setVisibility(8);
            }
            NewRegFragment.this.checkRegAble(this.editText.get());
        }
    }

    static {
        t2o.a(70254670);
        t2o.a(70254847);
        t2o.a(70254806);
    }

    public static /* synthetic */ void access$000(NewRegFragment newRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af6d5e3", new Object[]{newRegFragment, str});
        } else {
            newRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$100(NewRegFragment newRegFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseActivity) ipChange.ipc$dispatch("cd75e2a6", new Object[]{newRegFragment});
        }
        return newRegFragment.mAttachedActivity;
    }

    public static /* synthetic */ boolean access$200(NewRegFragment newRegFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5aa5adf", new Object[]{newRegFragment})).booleanValue();
        }
        return newRegFragment.mobileUT;
    }

    public static /* synthetic */ boolean access$202(NewRegFragment newRegFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33d8b09b", new Object[]{newRegFragment, new Boolean(z)})).booleanValue();
        }
        newRegFragment.mobileUT = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(NewRegFragment newRegFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("defeb020", new Object[]{newRegFragment})).booleanValue();
        }
        return newRegFragment.checkcodeUT;
    }

    public static /* synthetic */ boolean access$302(NewRegFragment newRegFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350f037a", new Object[]{newRegFragment, new Boolean(z)})).booleanValue();
        }
        newRegFragment.checkcodeUT = z;
        return z;
    }

    public static /* synthetic */ void access$400(NewRegFragment newRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472671e7", new Object[]{newRegFragment, str});
        } else {
            newRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$500(NewRegFragment newRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3258e8", new Object[]{newRegFragment, str});
        } else {
            newRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(NewRegFragment newRegFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewRegFragment");
        }
    }

    public void adjustMobileETMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06d7b51", new Object[]{this});
            return;
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo == null || !TextUtils.equals(o78.CHINA_MAINLAND, regionInfo.domain)) {
            this.mMobileET.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
            TextWatcher textWatcher = this.mMobileTextWatcher;
            if (textWatcher != null) {
                this.mMobileET.removeTextChangedListener(textWatcher);
            }
            RegTextWatcher regTextWatcher = new RegTextWatcher(this.mMobileET);
            this.mMobileTextWatcher = regTextWatcher;
            this.mMobileET.addTextChangedListener(regTextWatcher);
        } else {
            this.mMobileET.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
            TextWatcher textWatcher2 = this.mMobileTextWatcher;
            if (textWatcher2 != null) {
                this.mMobileET.removeTextChangedListener(textWatcher2);
            }
            MobileTextWatcher mobileTextWatcher = new MobileTextWatcher(this.mMobileET, Locale.CHINA.getCountry());
            this.mMobileTextWatcher = mobileTextWatcher;
            this.mMobileET.addTextChangedListener(mobileTextWatcher);
        }
        this.mMobileET.setText(getMobile());
    }

    public void applyRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a37f89", new Object[]{this});
        } else {
            this.mRegionPresenter.region(1);
        }
    }

    public void checkRegAble(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2b5472", new Object[]{this, editText});
        } else if (TextUtils.isEmpty(this.mMobileET.getText().toString())) {
            this.mRegBtn.setEnabled(false);
            this.mRegBtnLL.setBackgroundDrawable(null);
        } else {
            this.mRegBtn.setEnabled(true);
        }
    }

    public void clearMobile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5398ca56", new Object[]{this});
            return;
        }
        this.mMobileET.getEditableText().clear();
        this.mMobileET.setEnabled(true);
        this.isVoice = false;
    }

    public void createPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f203b93", new Object[]{this});
            return;
        }
        this.mRegionPresenter = new RegionPresenter(this);
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, new LoginParam());
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

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (isActivityAvaiable()) {
            dismissProgress();
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo == null || TextUtils.isEmpty(regionInfo.domain)) {
            return o78.CHINA_MAINLAND;
        }
        return this.mRegionInfo.domain;
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
        return R.layout.aliuser_fragment_two_step_mobile_register_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        return DataProviderFactory.getDataProvider().getSite();
    }

    public String getMobile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c96e2a61", new Object[]{this});
        }
        return this.mMobileET.getText().toString().trim().replaceAll(" ", "");
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return UTConstans.PageName.UT_PAGE_SMS_REG;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo == null || TextUtils.isEmpty(regionInfo.code)) {
            return "86";
        }
        return this.mRegionInfo.code.replace(f7l.PLUS, "");
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public String getRegType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this});
        }
        return UTConstant.Args.UT_MOBILE_REG;
    }

    public CommonUICallback getUICallback(final LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("6dfa55a0", new Object[]{this, loginParam});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                Throwable th;
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i == 5008 || i == 6001) {
                    if (map != null) {
                        long longValue = ((Long) map.get("millSecond")).longValue();
                        SmsApplyResult smsApplyResult = null;
                        try {
                            smsApplyResult = (SmsApplyResult) map.get("result");
                            if (smsApplyResult != null) {
                                try {
                                    if (!TextUtils.isEmpty(smsApplyResult.smsSid)) {
                                        NewRegFragment.this.mSessionId = smsApplyResult.smsSid;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    th.printStackTrace();
                                    NewRegFragment.this.onSendSMSSuccess(loginParam, longValue, smsApplyResult);
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        NewRegFragment.this.onSendSMSSuccess(loginParam, longValue, smsApplyResult);
                    }
                } else if (i == 6002) {
                    NewRegFragment newRegFragment = NewRegFragment.this;
                    newRegFragment.mobileCheckSimilarity = false;
                    LoginParam loginParam2 = loginParam;
                    if (loginParam2 != null) {
                        z = loginParam2.regXianyu;
                    }
                    newRegFragment.sendCodeAction(z);
                }
            }
        };
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void goFacebook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f179155", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_FACEBOOK;
        rmo.b(sNSPlatform, null, null);
        rmo.m(sNSPlatform, this.mAttachedActivity, hashMap);
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void goGoogle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e20548", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_GOOGLE;
        rmo.b(sNSPlatform, DataProviderFactory.getDataProvider().getClientId(sNSPlatform.getPlatform()), null);
        rmo.m(sNSPlatform, this.mAttachedActivity, hashMap);
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void goLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda2383", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, getPageName());
        hashMap.put("alipayInstalled", String.valueOf(this.alipayInstalled));
        SNSPlatform sNSPlatform = SNSPlatform.PLATFORM_LINE;
        rmo.b(sNSPlatform, DataProviderFactory.getDataProvider().getClientId(sNSPlatform.getPlatform()), null);
        rmo.m(sNSPlatform, this.mAttachedActivity, hashMap);
    }

    public void initRegionInfo() {
        String str;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b94e79", new Object[]{this});
            return;
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.mFireAppLaunchRes;
        if (appLaunchInfoResponseData != null && (t = appLaunchInfoResponseData.returnValue) != 0 && !TextUtils.isEmpty(((AppLaunchInfo) t).regPhoneCode) && !TextUtils.isEmpty(((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regCountryCode) && !TextUtils.isEmpty(((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regCheckPattern)) {
            RegionInfo regionInfo = new RegionInfo();
            this.mRegionInfo = regionInfo;
            T t2 = this.mFireAppLaunchRes.returnValue;
            regionInfo.code = ((AppLaunchInfo) t2).regPhoneCode;
            regionInfo.domain = ((AppLaunchInfo) t2).regCountryCode;
            regionInfo.checkPattern = ((AppLaunchInfo) t2).regCheckPattern;
        }
        RegionInfo regionInfo2 = this.mRegionInfo;
        if (regionInfo2 == null || TextUtils.isEmpty(regionInfo2.code) || TextUtils.isEmpty(this.mRegionInfo.domain)) {
            RegionInfo currentRegion = DataProviderFactory.getDataProvider().getCurrentRegion();
            if (currentRegion == null || TextUtils.isEmpty(currentRegion.domain) || TextUtils.isEmpty(currentRegion.name) || TextUtils.isEmpty(currentRegion.code)) {
                if (currentRegion == null) {
                    str = "";
                } else {
                    str = currentRegion.domain;
                }
                currentRegion = CountryUtil.matchRegionFromLocal(getContext(), str);
            }
            this.mRegionInfo = currentRegion;
        }
        LoginApprearanceExtensions appreanceExtentions = AliUserLogin.getAppreanceExtentions();
        if (appreanceExtentions == null || appreanceExtentions.needCountryModule()) {
            RegionInfo regionInfo3 = this.mRegionInfo;
            if (regionInfo3 != null && !TextUtils.isEmpty(regionInfo3.code)) {
                this.mRegionTV.setVisibility(0);
                this.mRegionTV.setText(this.mRegionInfo.code);
                resizeMobileETPadding();
            }
        } else {
            this.mRegionTV.setVisibility(8);
        }
        adjustMobileETMaxLength();
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
        this.toEmailTV = (TextView) view.findViewById(R.id.aliuser_to_email);
        EditText editText = (EditText) view.findViewById(R.id.aliuser_register_mobile_et);
        this.mMobileET = editText;
        editText.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                EditText editText2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (NewRegFragment.this.getContext() != null && NewRegFragment.this.isActive() && (editText2 = NewRegFragment.this.mMobileET) != null) {
                    editText2.requestFocus();
                    NewRegFragment.this.mMobileET.requestFocusFromTouch();
                    InputMethodManager inputMethodManager = (InputMethodManager) NewRegFragment.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(NewRegFragment.this.mMobileET, 1);
                    }
                }
            }
        }, 300L);
        this.mRegBtnLL = (LinearLayout) view.findViewById(R.id.aliuser_register_reg_btn_ll);
        this.mRegBtn = (Button) view.findViewById(R.id.aliuser_register_reg_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mRegBtn.setText(getResources().getString(R.string.aliuser_agree_and_reg_tb_auto));
        }
        this.mRegBtn.setOnClickListener(this);
        this.mWelcomeTV = (TextView) view.findViewById(R.id.aliuser_register_tips_tv);
        this.mTitleTV = (TextView) view.findViewById(R.id.aliuser_register_tips_title);
        ((RelativeLayout) view.findViewById(R.id.aliuser_region_rl)).setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_region_tv);
        this.mRegionTV = textView;
        textView.setOnClickListener(this);
        initRegionInfo();
        View findViewById = view.findViewById(R.id.aliuser_login_mobile_clear_iv);
        this.mMobileClearBtn = findViewById;
        if (findViewById != null) {
            ViewProxy.setOnClickListener(findViewById, this);
        }
        if (!TextUtils.isEmpty(this.mMobileNum)) {
            this.mMobileET.setText(this.mMobileNum);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.aliuser_reg_func_menu);
        if (textView2 != null) {
            if (LanguageUtil.isHK()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView2.setOnClickListener(this);
        }
        showBottomAlipay(view);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mMobileET, this.mRegionTV, this.mProtocolTV, this.mRegBtn, this.mWelcomeTV, textView2);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isMobileValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae9a785", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo != null && !TextUtils.isEmpty(regionInfo.checkPattern)) {
            String replaceAll = str.replaceAll(" ", "");
            String replace = this.mRegionInfo.code.replace(f7l.PLUS, "");
            return (replace + replaceAll).matches(this.mRegionInfo.checkPattern);
        } else if (str.length() < 6 || str.length() > 20) {
            return false;
        } else {
            return true;
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
        if (i2 == -1 && i == 2001 && intent != null) {
            RegionInfo regionInfo = (RegionInfo) intent.getParcelableExtra("region");
            this.mRegionInfo = regionInfo;
            if (regionInfo != null) {
                this.mRegionTV.setText(regionInfo.code);
                resizeMobileETPadding();
                adjustMobileETMaxLength();
            }
        }
        rmo.k(SNSPlatform.PLATFORM_GOOGLE, i, i2, intent);
        rmo.k(SNSPlatform.PLATFORM_FACEBOOK, i, i2, intent);
        rmo.k(SNSPlatform.PLATFORM_LINE, i, i2, intent);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        alert("", getString(R.string.aliuser_reg_retain_title), getString(R.string.aliuser_reg_continue), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    UserTrackAdapter.control(NewRegFragment.this.getPageName(), UTConstans.Controls.UT_REG_BACK_BUTTON_CANCEL, "", new HashMap());
                }
            }
        }, getString(R.string.aliuser_exit), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                UserTrackAdapter.control(NewRegFragment.this.getPageName(), UTConstans.Controls.UT_REG_BACK_BUTTON_CLICK, "", new HashMap());
                if (NewRegFragment.this.getActivity() != null) {
                    NewRegFragment.this.getActivity().finish();
                }
            }
        });
        return true;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.ali_user_login_alipay_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else if (id == R.id.aliuser_register_send_smscode_btn) {
            addCheckAction(LoginClickAction.ACTION_REG_SEND_SMS);
        } else if (id == R.id.aliuser_register_reg_btn) {
            addCheckAction(LoginClickAction.ACTION_REG);
        } else if (id == R.id.aliuser_region_rl || id == R.id.aliuser_region_tv) {
            if (!isChineseLanguage() || DataProviderFactory.getDataProvider().isForigenLocation()) {
                applyRegion();
                return;
            }
            addControl("Button-ChooseCountry");
            this.mAttachedActivity.startActivityForResult(new Intent(this.mAttachedActivity, AliUserRegisterChoiceRegionActivity.class), 2001);
        } else if (id == R.id.aliuser_login_mobile_clear_iv) {
            clearMobile();
        } else if (id == R.id.aliuser_reg_func_menu) {
            addControl(UTConstans.Controls.UT_HELP);
            BaseActivity baseActivity = this.mAttachedActivity;
            if (baseActivity instanceof AliUserRegisterActivity) {
                ((AliUserRegisterActivity) baseActivity).goHelp();
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable(RegistConstants.REGISTPARAM);
                if (serializable instanceof RegistParam) {
                    this.mRegistParam = (RegistParam) serializable;
                }
                RegistParam registParam = this.mRegistParam;
                if (!(registParam == null || (map = registParam.externParams) == null)) {
                    String str = map.get(LoginConstant.APPLAUNCH_INFO);
                    if (!TextUtils.isEmpty(str)) {
                        this.mFireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(str, AppLaunchInfoResponseData.class);
                    }
                }
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    this.mMobileNum = arguments2.getString(RegistConstants.REGISTER_MOBILE_NUM);
                    this.mRegionInfo = (RegionInfo) JSON.parseObject(arguments2.getString("region"), RegionInfo.class);
                    this.mSessionId = arguments2.getString("session_id");
                    this.mCodeLength = arguments2.getString(RegistConstants.REGISTER_CODE_LENGTH);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        createPresenter();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mRegionPresenter.onDestory();
        this.mMobileET.removeTextChangedListener(this.mMobileTextWatcher);
        super.onDestroy();
    }

    @Override // com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        } else if (isActive()) {
            RegionDialogFragment regionDialogFragment = new RegionDialogFragment();
            regionDialogFragment.setList(list, hashMap, list2);
            regionDialogFragment.setRegionListener(new RegionListener() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.register.ui.RegionListener
                public void onClick(RegionInfo regionInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9431c0af", new Object[]{this, regionInfo});
                        return;
                    }
                    NewRegFragment newRegFragment = NewRegFragment.this;
                    newRegFragment.mRegionInfo = regionInfo;
                    if (regionInfo != null) {
                        newRegFragment.mRegionTV.setText(regionInfo.code);
                        NewRegFragment.this.resizeMobileETPadding();
                        NewRegFragment.this.adjustMobileETMaxLength();
                    }
                }
            });
            regionDialogFragment.setCurrentRegion(this.mRegionInfo);
            regionDialogFragment.setupAdapter(getActivity());
            try {
                regionDialogFragment.show(getActivity().getSupportFragmentManager(), "MobileRegisterRegionDialog");
            } catch (Exception e) {
                e.printStackTrace();
            }
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
        UserTrackAdapter.updatePageName(getActivity(), getPageName());
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
    public void onSendSMSSuccess(LoginParam loginParam, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca12e0c5", new Object[]{this, loginParam, new Long(j), new Boolean(z)});
        }
    }

    @Override // com.ali.user.mobile.login.newui.BaseRegisterFragment
    public void regTaobaoOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456c3735", new Object[]{this});
            return;
        }
        String mobile = getMobile();
        this.mMobileStr = mobile;
        if (!isMobileValid(mobile)) {
            toast(getString(R.string.aliuser_phone_number_invalidate), 0);
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
        if (!isMobileValid(getMobile())) {
            UserTrackAdapter.sendUT(getPageName(), UTConstans.CustomEvent.UT_MOBILE_INVALID);
        } else {
            OceanRegisterParam oceanRegisterParam = new OceanRegisterParam();
            this.mTraceParam = oceanRegisterParam;
            oceanRegisterParam.loginSourcePage = getPageName();
            this.mTraceParam.loginSourceType = getRegType();
            this.mTraceParam.traceId = ApiReferer.generateTraceId(getRegType(), getPageName());
        }
        sendCodeAction(z);
    }

    public void resizeMobileETPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae86933", new Object[]{this});
        } else {
            this.mRegionTV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    NewRegFragment.this.mRegionTV.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    NewRegFragment newRegFragment = NewRegFragment.this;
                    if (newRegFragment.originalAccountETPadding == 0) {
                        newRegFragment.originalAccountETPadding = newRegFragment.mMobileET.getPaddingLeft();
                    }
                    NewRegFragment newRegFragment2 = NewRegFragment.this;
                    EditText editText = newRegFragment2.mMobileET;
                    int width = newRegFragment2.mRegionTV.getWidth();
                    NewRegFragment newRegFragment3 = NewRegFragment.this;
                    editText.setPadding(width + newRegFragment3.originalAccountETPadding, newRegFragment3.mMobileET.getPaddingTop(), NewRegFragment.this.mRegionTV.getWidth() + 30, NewRegFragment.this.mMobileET.getPaddingBottom());
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void sendCodeAction(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de68de2", new Object[]{this, new Boolean(z)});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        NewRegFragment.access$000(NewRegFragment.this, "Button-SendSms");
                        NewRegFragment newRegFragment = NewRegFragment.this;
                        newRegFragment.mMobileStr = newRegFragment.getMobile();
                        NewRegFragment newRegFragment2 = NewRegFragment.this;
                        if (!newRegFragment2.isMobileValid(newRegFragment2.mMobileStr)) {
                            NewRegFragment newRegFragment3 = NewRegFragment.this;
                            newRegFragment3.toast(newRegFragment3.getString(R.string.aliuser_phone_number_invalidate), 0);
                        } else {
                            NewRegFragment newRegFragment4 = NewRegFragment.this;
                            newRegFragment4.mMobileLoginPresenter.buildSMSLoginParam(newRegFragment4.getMobile(), null, NewRegFragment.this.isVoice);
                            NewRegFragment.this.mMobileLoginPresenter.getLoginParam().regXianyu = z;
                            LoginParam loginParam = NewRegFragment.this.mMobileLoginPresenter.getLoginParam();
                            NewRegFragment newRegFragment5 = NewRegFragment.this;
                            loginParam.smsSid = newRegFragment5.mSessionId;
                            newRegFragment5.mMobileLoginPresenter.getLoginParam().utPageName = NewRegFragment.this.getPageName();
                            NewRegFragment.this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
                            NewRegFragment.this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, NewRegFragment.this.getPageName());
                            Map<String, String> map = NewRegFragment.this.mMobileLoginPresenter.getLoginParam().ext;
                            map.put(ApiConstants.ApiField.MOBILE_CHECK_SIMILARITY, NewRegFragment.this.mobileCheckSimilarity + "");
                            NewRegFragment.this.mMobileLoginPresenter.getLoginParam().ext.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
                            LoginParam loginParam2 = NewRegFragment.this.mMobileLoginPresenter.getLoginParam();
                            NewRegFragment newRegFragment6 = NewRegFragment.this;
                            loginParam2.alipayInstalled = newRegFragment6.alipayInstalled;
                            UserMobileLoginPresenter userMobileLoginPresenter = newRegFragment6.mMobileLoginPresenter;
                            BaseActivity access$100 = NewRegFragment.access$100(newRegFragment6);
                            LoginParam loginParam3 = NewRegFragment.this.mMobileLoginPresenter.getLoginParam();
                            NewRegFragment newRegFragment7 = NewRegFragment.this;
                            userMobileLoginPresenter.sendSMS(access$100, loginParam3, newRegFragment7.getUICallback(newRegFragment7.mMobileLoginPresenter.getLoginParam()));
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public void onSendSMSSuccess(LoginParam loginParam, long j, SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d70ad1d", new Object[]{this, loginParam, new Long(j), smsApplyResult});
        } else if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
            intent.putExtra(RegistConstants.REGISTER_MOBILE_NUM, getMobile());
            intent.putExtra("session_id", TextUtils.isEmpty(smsApplyResult.smsSid) ? this.mSessionId : smsApplyResult.smsSid);
            intent.putExtra(RegistConstants.REGISTER_CODE_LENGTH, TextUtils.isEmpty(smsApplyResult.codeLength) ? this.mCodeLength : smsApplyResult.codeLength);
            intent.putExtra(RegistConstants.REGISTER_TRACE_PARAM, JSON.toJSONString(this.mTraceParam));
            RegionInfo regionInfo = this.mRegionInfo;
            intent.putExtra("region", regionInfo == null ? "" : JSON.toJSONString(regionInfo));
            if (UserLoginActivity.displayOversea(this.mFireAppLaunchRes)) {
                intent.putExtra(LoginConstant.FROM_OVERSEA, true);
            }
            ((AliUserRegisterActivity) getActivity()).gotoSmsCodeFragment(intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(final LoginParam loginParam, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389eeea9", new Object[]{this, loginParam, rpcResponse});
        } else if (isActive()) {
            if (rpcResponse != null && rpcResponse.code == 458825) {
                UserTrackAdapter.sendUT(getPageName(), "CheckSimilarity");
                alert(rpcResponse.message, "", getString(R.string.aliuser_re_enter), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            NewRegFragment.access$400(NewRegFragment.this, "Button-Alert-CheckSimilarity-no");
                        }
                    }
                }, getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRegFragment.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        boolean z = false;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        NewRegFragment newRegFragment = NewRegFragment.this;
                        newRegFragment.mobileCheckSimilarity = false;
                        NewRegFragment.access$500(newRegFragment, "Button-Alert-CheckSimilarity-yes");
                        NewRegFragment newRegFragment2 = NewRegFragment.this;
                        LoginParam loginParam2 = loginParam;
                        if (loginParam2 != null) {
                            z = loginParam2.regXianyu;
                        }
                        newRegFragment2.sendCodeAction(z);
                    }
                });
            } else if (rpcResponse == null || rpcResponse.code != 458826) {
                Properties properties = LoginComponent.getProperties();
                String pageName = getPageName();
                String str = "";
                if (rpcResponse != null) {
                    str = rpcResponse.code + str;
                }
                UserTrackAdapter.sendUT(pageName, UTConstans.CustomEvent.UT_SMS_SEND_FAIL, str, getRegType(), properties);
                if (rpcResponse == null || rpcResponse.code == 4) {
                    toast(getString(R.string.aliuser_sever_error), 0);
                } else {
                    toast(rpcResponse.message, 0);
                }
            } else {
                toast(getResources().getString(R.string.aliuser_reg_mobile_exist), 0);
                UserTrackAdapter.sendUT(getPageName(), "RegisterBlock");
                if (getActivity() != null) {
                    LoginParam loginParam2 = new LoginParam();
                    loginParam2.loginId = getMobile();
                    loginParam2.callRpc = true;
                    WebViewActivity.goFistLoginPage(getActivity(), true, true, loginParam);
                }
            }
        }
    }
}
