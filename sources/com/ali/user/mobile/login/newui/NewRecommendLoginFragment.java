package com.ali.user.mobile.login.newui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.EmailLoginPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.LoginFlowReturnData;
import com.ali.user.mobile.login.presenter.RecommendLoginPresenter;
import com.ali.user.mobile.login.presenter.SMSNickLoginPresenter;
import com.ali.user.mobile.login.presenter.SimVerifyPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.ILoginMethodChange;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.RecommendLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserLoginView;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.BottomMethodFragment;
import com.ali.user.mobile.ui.widget.LoginMethodItem;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.activity.auth.QrScan;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.f7l;
import tb.o78;
import tb.pg1;
import tb.rmo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewRecommendLoginFragment extends NewBaseLoginFragment implements RecommendLoginView, UserMobileLoginView, UserLoginView, ILoginMethodChange {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ui.RecommendLoginFragment";
    public boolean fromOversea;
    public View mAccountClearBtn;
    public RelativeLayout mAccountRL;
    public TextWatcher mAccountTextWatcher;
    public View mAlipayLL;
    public TextView mAlipayLoginTV;
    public View mDivider;
    public EmailLoginPresenter mEmailLoginPresenter;
    public TextView mLeftFuncTV;
    public EditText mLoginAccountET;
    public String mLoginFlowId;
    public LoginFlowReturnData mLoginFlowReturnData;
    public RecommendLoginPresenter mLoginPresenter;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mOriginUserInput;
    public View mPasswordClearBtn;
    public EditText mPasswordET;
    public RelativeLayout mPasswordRL;
    public View mQrDividerView;
    public TextView mQrLoginTV;
    public String mRecommendLoginId;
    public Button mRecommendLoginNextBtn;
    public String mRecommendLoginType;
    public View mRegPart;
    public TextView mRegTV;
    public RegionInfo mRegionInfo;
    public TextView mRegionTV;
    public TextView mRightFuncTV;
    public SMSNickLoginPresenter mSMSNickLoginPresenter;
    public ImageView mShowPasswordIV;
    public SimVerifyPresenter mSimLoginPresenter;
    public TextView mTipsTV;
    public UserLoginPresenter mUserLoginPresenter;
    public TextView moreFuncMenu;
    private int originalAccountETPadding;
    public String paramModeState;
    public boolean supportOverseaSimLogin;
    public LoginParam mLoginParam = null;
    public List<String> mAvailableLoginModes = new ArrayList();
    public boolean takeAvaliable = true;
    public LoginModeState mCurrentLoginModeState = LoginModeState.LOCATION;
    public boolean mobileCheckSimilarity = true;
    private boolean needPwdInputUT = true;
    private boolean accountUT = true;
    private boolean isClicked = false;
    public boolean degradeToSMS = false;
    private String previousCleanText = "";
    private int previousCleanLength = 0;

    /* compiled from: Taobao */
    /* renamed from: com.ali.user.mobile.login.newui.NewRecommendLoginFragment$16  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class AnonymousClass16 {
        public static final /* synthetic */ int[] $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState;

        static {
            int[] iArr = new int[LoginModeState.values().length];
            $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState = iArr;
            try {
                iArr[LoginModeState.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.SMS_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.SIM_LOGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.SCAN_FACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.BIOMETRIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AccountTextWatcher implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(70254668);
        }

        public AccountTextWatcher() {
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
            } else {
                NewRecommendLoginFragment.this.onAccountEditTextChange(charSequence);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class MobileTextWatcher extends PhoneNumberFormattingTextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<EditText> editText;

        static {
            t2o.a(70254669);
        }

        public static /* synthetic */ Object ipc$super(MobileTextWatcher mobileTextWatcher, String str, Object... objArr) {
            if (str.hashCode() == 1731819568) {
                super.onTextChanged((CharSequence) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewRecommendLoginFragment$MobileTextWatcher");
        }

        @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            try {
                String replaceAll = charSequence.toString().trim().replaceAll(" ", "");
                NewRecommendLoginFragment.access$902(NewRecommendLoginFragment.this, replaceAll);
                NewRecommendLoginFragment.access$1002(NewRecommendLoginFragment.this, replaceAll.length());
            } catch (Exception e) {
                LoginTLogAdapter.e(NewRecommendLoginFragment.TAG, "beforeTextChanged exception ", e);
            }
        }

        @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            super.onTextChanged(charSequence, i, i2, i3);
            NewRecommendLoginFragment.this.onAccountEditTextChange(charSequence);
            try {
                if (LoginSwitch.getSwitch("countDelete", "true") && charSequence != null) {
                    String replaceAll = charSequence.toString().trim().replaceAll(" ", "");
                    int length = replaceAll.length();
                    if (length == 11 && length > NewRecommendLoginFragment.access$1000(NewRecommendLoginFragment.this)) {
                        UserTrackAdapter.sendUT(NewRecommendLoginFragment.this.getPageName(), "Input11", String.valueOf(i2), String.valueOf(i3), null);
                    }
                    if (NewRecommendLoginFragment.access$1000(NewRecommendLoginFragment.this) == 11 && (length < NewRecommendLoginFragment.access$1000(NewRecommendLoginFragment.this) || (length == NewRecommendLoginFragment.access$1000(NewRecommendLoginFragment.this) && !replaceAll.equals(NewRecommendLoginFragment.access$900(NewRecommendLoginFragment.this))))) {
                        UserTrackAdapter.sendUT(NewRecommendLoginFragment.this.getPageName(), "InputDelete");
                    }
                    NewRecommendLoginFragment.access$902(NewRecommendLoginFragment.this, replaceAll);
                    NewRecommendLoginFragment.access$1002(NewRecommendLoginFragment.this, length);
                }
            } catch (Throwable th) {
                LoginTLogAdapter.e(NewRecommendLoginFragment.TAG, "onTextchange exception ", th);
            }
        }

        private MobileTextWatcher(EditText editText, String str) {
            super(str);
            this.editText = new WeakReference<>(editText);
        }
    }

    static {
        t2o.a(70254651);
        t2o.a(70254800);
        t2o.a(70254806);
        t2o.a(70254805);
        t2o.a(70254796);
    }

    public static /* synthetic */ boolean access$002(NewRecommendLoginFragment newRecommendLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a0e0fa4", new Object[]{newRecommendLoginFragment, new Boolean(z)})).booleanValue();
        }
        newRecommendLoginFragment.alipayInstalled = z;
        return z;
    }

    public static /* synthetic */ int access$1000(NewRecommendLoginFragment newRecommendLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87511b5a", new Object[]{newRecommendLoginFragment})).intValue();
        }
        return newRecommendLoginFragment.previousCleanLength;
    }

    public static /* synthetic */ int access$1002(NewRecommendLoginFragment newRecommendLoginFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe51b471", new Object[]{newRecommendLoginFragment, new Integer(i)})).intValue();
        }
        newRecommendLoginFragment.previousCleanLength = i;
        return i;
    }

    public static /* synthetic */ boolean access$102(NewRecommendLoginFragment newRecommendLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25cf8b65", new Object[]{newRecommendLoginFragment, new Boolean(z)})).booleanValue();
        }
        newRecommendLoginFragment.alipayInstalled = z;
        return z;
    }

    public static /* synthetic */ void access$1100(NewRecommendLoginFragment newRecommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b237d0", new Object[]{newRecommendLoginFragment, str});
        } else {
            newRecommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$1200(NewRecommendLoginFragment newRecommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb1962f", new Object[]{newRecommendLoginFragment, str});
        } else {
            newRecommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ boolean access$200(NewRecommendLoginFragment newRecommendLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ae238", new Object[]{newRecommendLoginFragment})).booleanValue();
        }
        return newRecommendLoginFragment.needPwdInputUT;
    }

    public static /* synthetic */ boolean access$202(NewRecommendLoginFragment newRecommendLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1910726", new Object[]{newRecommendLoginFragment, new Boolean(z)})).booleanValue();
        }
        newRecommendLoginFragment.needPwdInputUT = z;
        return z;
    }

    public static /* synthetic */ void access$300(NewRecommendLoginFragment newRecommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8076c55d", new Object[]{newRecommendLoginFragment, str});
        } else {
            newRecommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ boolean access$402(NewRecommendLoginFragment newRecommendLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b913fea8", new Object[]{newRecommendLoginFragment, new Boolean(z)})).booleanValue();
        }
        newRecommendLoginFragment.isClicked = z;
        return z;
    }

    public static /* synthetic */ void access$500(NewRecommendLoginFragment newRecommendLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d97a91", new Object[]{newRecommendLoginFragment});
        } else {
            newRecommendLoginFragment.goAlipay();
        }
    }

    public static /* synthetic */ int access$600(NewRecommendLoginFragment newRecommendLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac0902a3", new Object[]{newRecommendLoginFragment})).intValue();
        }
        return newRecommendLoginFragment.originalAccountETPadding;
    }

    public static /* synthetic */ int access$602(NewRecommendLoginFragment newRecommendLoginFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7096b648", new Object[]{newRecommendLoginFragment, new Integer(i)})).intValue();
        }
        newRecommendLoginFragment.originalAccountETPadding = i;
        return i;
    }

    public static /* synthetic */ void access$700(NewRecommendLoginFragment newRecommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0743ed9", new Object[]{newRecommendLoginFragment, str});
        } else {
            newRecommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ String access$900(NewRecommendLoginFragment newRecommendLoginFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ed43533", new Object[]{newRecommendLoginFragment});
        }
        return newRecommendLoginFragment.previousCleanText;
    }

    public static /* synthetic */ String access$902(NewRecommendLoginFragment newRecommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33d296b", new Object[]{newRecommendLoginFragment, str});
        }
        newRecommendLoginFragment.previousCleanText = str;
        return str;
    }

    private void addHintPadding(View view) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331192a2", new Object[]{this, view});
        } else if (view != null) {
            try {
                View view2 = this.mFragmentView;
                if (view2 != null && (findViewById = view2.findViewById(R.id.aliuser_login_coupon_tip)) != null && findViewById.getVisibility() == 0) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.bottomMargin = (int) (getResources().getDisplayMetrics().density * 12.0f);
                    view.setLayoutParams(layoutParams);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void buildLoginParamUT(LoginParam loginParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47213ff", new Object[]{this, loginParam, str});
            return;
        }
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = str;
        loginParam.sdkTraceId = ApiReferer.generateTraceId(str, getPageName(), this.mLoginFlowId);
    }

    public static /* synthetic */ Object ipc$super(NewRecommendLoginFragment newRecommendLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1659124207:
                super.directToOneKeyFragment((Map) objArr[0]);
                return null;
            case -1641657532:
                super.showBottomMenuForFirstPage();
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
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewRecommendLoginFragment");
        }
    }

    private boolean isRecommendPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d858ec6c", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.paramModeState, LoginModeState.LOCATION.name());
    }

    private static boolean pwd(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da3ee54f", new Object[]{loginModeState})).booleanValue();
        }
        if (loginModeState == LoginModeState.PASSWORD) {
            return true;
        }
        return false;
    }

    private boolean sendSms() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7422acbc", new Object[]{this})).booleanValue();
        }
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        userMobileLoginPresenter.sendSMS(this.mAttachedActivity, userMobileLoginPresenter.getLoginParam(), getUICallback(this.mMobileLoginPresenter.getLoginParam()));
        return true;
    }

    private static boolean smsOrSim(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f335e31", new Object[]{loginModeState})).booleanValue();
        }
        if (loginModeState == LoginModeState.SMS_LOGIN || loginModeState == LoginModeState.SIM_LOGIN) {
            return true;
        }
        return false;
    }

    private static boolean supportToSms() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d753f5a", new Object[0])).booleanValue();
        }
        return LoginSwitch.getSwitch("degradeSupportPwd2Sms", "true");
    }

    private void updateLoginParamWhenRecommend(String str, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e32d43", new Object[]{this, str, loginParam});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        LoginParam loginParam2 = this.mLoginParam;
        loginParam2.hid = loginParam.hid;
        loginParam2.countryCode = loginParam.countryCode;
        loginParam2.phoneCode = loginParam.phoneCode;
        View view = this.mAccountClearBtn;
        if (view != null) {
            view.setVisibility(8);
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

    public void adjustMobileETMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06d7b51", new Object[]{this});
        } else if (!LoginSwitch.getSwitch("closeTextWatcher", "false") && !isRecommendPage()) {
            RegionInfo regionInfo = this.mRegionInfo;
            if (regionInfo == null || !TextUtils.equals(o78.CHINA_MAINLAND, regionInfo.domain)) {
                resetTextWatcher();
                return;
            }
            TextWatcher textWatcher = this.mAccountTextWatcher;
            if (textWatcher != null) {
                this.mLoginAccountET.removeTextChangedListener(textWatcher);
            }
            MobileTextWatcher mobileTextWatcher = new MobileTextWatcher(this.mLoginAccountET, Locale.CHINA.getCountry());
            this.mAccountTextWatcher = mobileTextWatcher;
            this.mLoginAccountET.addTextChangedListener(mobileTextWatcher);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void clearPasswordInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf5829", new Object[]{this});
        }
    }

    public void clickMenu(String str, LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d6f0b7", new Object[]{this, str, loginModeState});
        } else if (isActive()) {
            switchLoginModeHit(loginModeState);
            if (TextUtils.equals(str, LoginModeState.SCAN_FACE.name())) {
                addCheckAction(LoginClickAction.ACTION_FACE);
            } else if (TextUtils.equals(str, LoginModeState.SMS_LOGIN.name()) && !TextUtils.isEmpty(this.mLoginParam.phoneCode)) {
                addCheckAction(LoginClickAction.ACTION_SEND_SMS);
            } else if (TextUtils.equals(str, LoginModeState.BIOMETRIC.name())) {
                addCheckAction(LoginClickAction.ACTION_FINGER);
            } else if (TextUtils.equals(str, LoginModeState.EMAIL_CODE_LOGIN.name())) {
                addCheckAction(LoginClickAction.ACTION_EMAIL_SEND);
            } else if (TextUtils.equals(str, LoginModeState.SIM_LOGIN.name())) {
                addCheckAction(LoginClickAction.ACTION_SIM_VERIFY);
            } else {
                updateLoginModeState(loginModeState);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void directToOneKeyFragment(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1bc611", new Object[]{this, map});
            return;
        }
        EditText editText = this.mLoginAccountET;
        if (editText != null && !TextUtils.isEmpty(editText.getText().toString())) {
            this.interact = true;
        }
        super.directToOneKeyFragment(map);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment
    public void doRealAction(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb87a817", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onClickLoginAction(z);
        } else if (i == LoginClickAction.ACTION_PWD) {
            onClickLoginAction(z);
        } else if (i == LoginClickAction.ACTION_FACE) {
            onFaceLogin();
        } else if (i == LoginClickAction.ACTION_SEND_SMS) {
            onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN, z);
        } else if (i == LoginClickAction.ACTION_EMAIL_SEND) {
            onSendEmailAction();
        } else if (i == LoginClickAction.ACTION_SIM_VERIFY) {
            onSimVerify();
        } else {
            super.doRealAction(i, z);
        }
    }

    public void editLoginAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cedbb35", new Object[]{this});
        } else if (!this.degradeToSMS) {
            String str = this.paramModeState;
            LoginModeState loginModeState = LoginModeState.LOCATION;
            if (!TextUtils.equals(str, loginModeState.name()) || this.supportOverseaSimLogin) {
                return;
            }
            if (this.mCurrentLoginModeState != loginModeState) {
                updateLoginModeState(loginModeState);
                resetLoginAccountETPadding();
                LoginParam loginParam = this.mLoginParam;
                if (loginParam == null || TextUtils.isEmpty(loginParam.phoneCode)) {
                    addControl("change_nick");
                } else {
                    addControl("sms_input");
                }
                initParams();
                onPwdError();
                return;
            }
            addControl("input");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        EditText editText = this.mLoginAccountET;
        if (editText == null) {
            return "";
        }
        return editText.getText().toString().trim().replaceAll(" ", "");
    }

    public String getAccountNameForPassword(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d6cffed", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.trim().replaceAll(" ", "");
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment
    public BottomMethodFragment getBottomMethodFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomMethodFragment) ipChange.ipc$dispatch("fd18ea78", new Object[]{this});
        }
        return new BottomMethodFragment();
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

    public int getEditHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a559bcc1", new Object[]{this})).intValue();
        }
        return 48;
    }

    public String getHintAccountText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f43ea15c", new Object[]{this});
        }
        if (this.supportOverseaSimLogin && this.mCurrentLoginModeState == LoginModeState.SMS_LOGIN) {
            return getString(R.string.aliuser_recommend_login_mobile_hint);
        }
        if (this.mCurrentLoginModeState == LoginModeState.SMS_LOGIN) {
            return getString(R.string.aliuser_recommend_login_mobile_hint);
        }
        return getString(R.string.aliuser_taobao_recommend_login_hint);
    }

    public String getHitPrefix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d981da00", new Object[]{this, str});
        }
        if (TextUtils.equals(str, LoginModeState.SMS_LOGIN.name())) {
            return "sms_chooseother";
        }
        if (TextUtils.equals(str, LoginModeState.PASSWORD.name())) {
            return "pwd_chooseother";
        }
        if (TextUtils.equals(str, LoginModeState.SIM_LOGIN.name())) {
            return "onekey_chooseother";
        }
        if (TextUtils.equals(str, LoginModeState.SCAN_FACE.name())) {
            return "face_chooseother";
        }
        if (TextUtils.equals(str, LoginModeState.BIOMETRIC.name())) {
            return "bio_chooseother";
        }
        return "";
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        if (TextUtils.equals(this.paramModeState, LoginModeState.LOCATION.name())) {
            return R.layout.aliuser_fragment_recommend_login_new;
        }
        return R.layout.aliuser_fragment_recommend_degrade_new;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        if (LoginModeState.SMS_LOGIN.name().equals(this.paramModeState)) {
            return UTConstant.PageName.UT_PAGE_SMS_LOGIN0;
        }
        if (LoginModeState.PASSWORD.name().equals(this.paramModeState)) {
            return UTConstant.PageName.UT_PAGE_PWD_LOGIN0;
        }
        return UTConstans.PageName.UT_PAGE_RECOMMEND_LOGIN;
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

    public CommonUICallback getUICallback(final LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("6dfa55a0", new Object[]{this, loginParam});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                switch (i) {
                    case 5001:
                        NewRecommendLoginFragment.this.pwdErrorToSMS();
                        return;
                    case 5002:
                        NewRecommendLoginFragment.this.onFaceLogin();
                        return;
                    case 5003:
                        NewRecommendLoginFragment.access$500(NewRecommendLoginFragment.this);
                        return;
                    case 5004:
                    default:
                        return;
                    case CommonUICallback.ACTION_PWD_ERROR_SHOW_EYE /* 5005 */:
                        if (NewRecommendLoginFragment.this.isActive() && LoginSwitch.getSwitch("show_password_hint", "true")) {
                            NewRecommendLoginFragment.this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            NewRecommendLoginFragment.this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                            NewRecommendLoginFragment newRecommendLoginFragment = NewRecommendLoginFragment.this;
                            newRecommendLoginFragment.mShowPasswordIV.setContentDescription(newRecommendLoginFragment.getString(R.string.aliuser_assist_password_show));
                            NewRecommendLoginFragment.this.mShowPasswordIV.setTag(Boolean.TRUE);
                            UserTrackAdapter.sendControlUT(NewRecommendLoginFragment.this.getPageName(), "Button-ShowPwd");
                            return;
                        }
                        return;
                    case 5006:
                        if (NewRecommendLoginFragment.this.isActive()) {
                            NewRecommendLoginFragment.this.onGetAccessTokenFail(loginParam);
                            return;
                        }
                        return;
                    case CommonUICallback.ACTION_ONEKEY_SEND_SMS /* 5007 */:
                        if (NewRecommendLoginFragment.this.isActive() && map != null && !TextUtils.isEmpty((String) map.get("mobile"))) {
                            NewRecommendLoginFragment.this.onNeedVerifyMobile("", (String) map.get("mobile"));
                            return;
                        }
                        return;
                    case CommonUICallback.ACTION_HANDLE_SEND_SMS_SUCCESS /* 5008 */:
                        if (NewRecommendLoginFragment.this.isActive() && map != null) {
                            NewRecommendLoginFragment.this.onSendSMSSuccess(loginParam, ((Long) map.get("millSecond")).longValue(), Boolean.parseBoolean("needToast"));
                            return;
                        }
                        return;
                    case CommonUICallback.ACTION_HANDLE_SEND_EMAIL_SUCCESS /* 5009 */:
                        if (NewRecommendLoginFragment.this.isActive() && map != null) {
                            NewRecommendLoginFragment.this.onSendEmailSuccess();
                            return;
                        }
                        return;
                }
            }
        };
    }

    public void goToSMSVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
            return;
        }
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity != null) {
            userLoginActivity.goToSMSVerificationPage(intent);
            NewSMSLoginVerification.mLoginMethodChange = this;
        }
    }

    public void initRegionInfo(LoginParam loginParam) {
        LoginFlowReturnData loginFlowReturnData;
        RegionInfo regionInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1fcd56", new Object[]{this, loginParam});
        } else if (this.degradeToSMS) {
            LoginTLogAdapter.e(getPageName(), "degradeToSMS");
            resizeLoginAccountETPadding();
            adjustMobileETMaxLength();
        } else {
            LoginApprearanceExtensions appreanceExtentions = AliUserLogin.getAppreanceExtentions();
            if ((appreanceExtentions == null || appreanceExtentions.needCountryModule()) && ((loginFlowReturnData = this.mLoginFlowReturnData) == null || TextUtils.isEmpty(loginFlowReturnData.maskMobile))) {
                if (loginParam != null) {
                    regionInfo = new RegionInfo();
                    regionInfo.domain = loginParam.countryCode;
                    regionInfo.code = loginParam.phoneCode;
                } else {
                    regionInfo = DataProviderFactory.getDataProvider().getCurrentRegion();
                }
                if (regionInfo == null || TextUtils.isEmpty(regionInfo.domain)) {
                    regionInfo = DataProviderFactory.getDataProvider().getCurrentRegion();
                }
                if (regionInfo == null || TextUtils.isEmpty(regionInfo.domain) || TextUtils.isEmpty(regionInfo.code)) {
                    if (regionInfo == null) {
                        str = "";
                    } else {
                        str = regionInfo.domain;
                    }
                    regionInfo = CountryUtil.matchRegionFromLocal(getContext(), str);
                }
                if (regionInfo != null) {
                    this.mRegionInfo = regionInfo;
                    this.mRegionTV.setVisibility(0);
                    this.mRegionTV.setText(this.mRegionInfo.code);
                    resizeLoginAccountETPadding();
                    adjustMobileETMaxLength();
                    return;
                }
                return;
            }
            this.mRegionTV.setVisibility(8);
        }
    }

    public boolean isChineseMobile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a71e97ba", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.replaceAll(" ", "").matches("^{0,1}1\\d{10}$");
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("resumeToOnekey" + getPageName(), 10000);
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

    public void onAccountEditTextChange(CharSequence charSequence) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91ce80", new Object[]{this, charSequence});
            return;
        }
        if (!TextUtils.isEmpty(charSequence) && (button = this.mRecommendLoginNextBtn) != null) {
            button.setEnabled(true);
        }
        this.needPwdInputUT = true;
        if (this.accountUT && !TextUtils.isEmpty(charSequence)) {
            this.accountUT = false;
            UserTrackAdapter.sendUT(getPageName(), "Input");
        }
        if (this.mAccountClearBtn == null) {
            return;
        }
        if (this.mCurrentLoginModeState != LoginModeState.LOCATION && isRecommendPage()) {
            return;
        }
        if (charSequence == null || charSequence.length() == 0) {
            if (this.mAccountClearBtn.getVisibility() != 8) {
                this.mAccountClearBtn.setVisibility(8);
            }
        } else if (this.mAccountClearBtn.getVisibility() != 0) {
            this.mAccountClearBtn.setVisibility(0);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        }
    }

    public void onClickLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b821dd", new Object[]{this});
        } else {
            onClickLoginAction(false);
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
        RecommendLoginPresenter recommendLoginPresenter = this.mLoginPresenter;
        if (recommendLoginPresenter != null) {
            recommendLoginPresenter.onDestory();
        }
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null) {
            userLoginPresenter.onDestory();
        }
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        if (userMobileLoginPresenter != null) {
            userMobileLoginPresenter.onDestory();
        }
        FaceLoginPresenter faceLoginPresenter = this.mFaceLoginPresenter;
        if (faceLoginPresenter != null) {
            faceLoginPresenter.onDestory();
        }
        SimVerifyPresenter simVerifyPresenter = this.mSimLoginPresenter;
        if (simVerifyPresenter != null) {
            simVerifyPresenter.onDestory();
        }
        SMSNickLoginPresenter sMSNickLoginPresenter = this.mSMSNickLoginPresenter;
        if (sMSNickLoginPresenter != null) {
            sMSNickLoginPresenter.onDestory();
        }
    }

    public void onFaceLogin() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be39df4", new Object[]{this});
        } else if (ServiceFactory.getService(FaceService.class) != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.hid = this.mLoginParam.hid;
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null) {
                loginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
            }
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName(), this.mLoginFlowId);
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            LoginContext.sCurrentLoginParam = loginParam;
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (loginFlowReturnData == null || (map = loginFlowReturnData.ext) == null || !"true".equals(map.get("preCheckVerify"))) {
                this.mFaceLoginPresenter.fetchScanToken(loginParam);
            } else {
                this.mFaceLoginPresenter.activeFaceLogin(loginParam);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onFingerLogin() {
        BioPresenter bioPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e64a28", new Object[]{this});
        } else if (ServiceFactory.getService(FingerprintService.class) != null && (bioPresenter = this.mBioPresenter) != null) {
            bioPresenter.buildLoginParam();
            this.mBioPresenter.mLoginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.BIO_LOGIN, getPageName());
            LoginParam loginParam = this.mBioPresenter.mLoginParam;
            loginParam.utPageName = LoginType.LocalLoginType.BIO_LOGIN;
            loginParam.utPageName = getPageName();
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mBioPresenter.mLoginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.BIO_LOGIN, hashMap);
            UserLoginActivity userLoginActivity = this.mUserLoginActivity;
            if (userLoginActivity != null) {
                this.mBioPresenter.mLoginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
            }
            BioPresenter bioPresenter2 = this.mBioPresenter;
            LoginParam loginParam2 = bioPresenter2.mLoginParam;
            loginParam2.biometricId = this.mLoginFlowReturnData.biometricId;
            bioPresenter2.login(this.mAttachedActivity, loginParam2, getUICallback(loginParam2));
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onFlowLimitLocked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117ae149", new Object[]{this, str});
        } else if (isActive()) {
            ArrayList arrayList = new ArrayList();
            LoginModeState loginModeState = LoginModeState.PASSWORD;
            arrayList.add(loginModeState.name());
            LoginParam loginParam = new LoginParam();
            loginParam.loginId = str;
            if (isChineseMobile(str)) {
                loginParam.countryCode = o78.CHINA_MAINLAND;
                loginParam.phoneCode = "+86";
                LoginModeState loginModeState2 = LoginModeState.SMS_LOGIN;
                arrayList.add(loginModeState2.name());
                onRecommendSmsLogin(loginModeState2.name(), arrayList, loginParam);
                return;
            }
            onRecommendPwdLogin(loginModeState.name(), arrayList, loginParam);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onForgetPasswordAction() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf966a84", new Object[]{this});
            return;
        }
        String accountName = getAccountName();
        if (this.mRegionTV.getVisibility() == 0) {
            String phoneCode = getPhoneCode();
            if (!"86".equals(phoneCode)) {
                accountName = phoneCode + "-" + accountName;
            }
        }
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter == null || userLoginPresenter.getLoginParam() == null) {
            str = "";
        } else {
            str = this.mUserLoginPresenter.mLoginParam.source;
        }
        this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, str);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onGuideH5(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse) {
        final String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a350433f", new Object[]{this, loginParam, rpcResponse});
            return;
        }
        LoginFlowReturnData loginFlowReturnData = rpcResponse.returnValue;
        if (loginFlowReturnData == null || loginFlowReturnData.ext == null) {
            str = "";
            str3 = str;
            str2 = str3;
        } else {
            str = rpcResponse.returnValue.ext.get("dialogActionUrl");
            str2 = loginFlowReturnData.ext.get("dialogActionText");
            str3 = rpcResponse.returnValue.ext.get("dialogContent");
        }
        alert("", str3, getString(R.string.aliuser_continue_login), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else if (NewRecommendLoginFragment.this.isActive()) {
                    dialogInterface.dismiss();
                    Map<String, String> map = NewRecommendLoginFragment.this.mLoginPresenter.mLoginParam.ext;
                    if (map != null) {
                        map.remove("canHandleGuideH5");
                    }
                    NewRecommendLoginFragment.this.mLoginPresenter.getLoginFlow();
                }
            }
        }, str2, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else if (NewRecommendLoginFragment.this.isActive()) {
                    dialogInterface.dismiss();
                    LoginReturnData loginReturnData = new LoginReturnData();
                    loginReturnData.site = NewRecommendLoginFragment.this.getLoginSite();
                    NavigatorManager.getInstance().navToWebViewPage(NewRecommendLoginFragment.this.getBaseActivity(), str, null, loginReturnData);
                }
            }
        });
    }

    @Override // com.ali.user.mobile.login.ui.ILoginMethodChange
    public void onMethodChange(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8109c178", new Object[]{this, loginModeState});
            return;
        }
        switchLoginModeHit(loginModeState);
        updateLoginModeState(loginModeState);
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onNeedAlert(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6912462", new Object[]{this, loginParam, rpcResponse});
        } else if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.codeGroup) && "mobileNeedCheck".equals(rpcResponse.codeGroup)) {
            LoginFlowReturnData loginFlowReturnData = rpcResponse.returnValue;
            if (loginFlowReturnData == null || loginFlowReturnData.ext == null) {
                str = "";
            } else {
                loginFlowReturnData.ext.get("dialogTitle");
                str = rpcResponse.returnValue.ext.get("dialogContent");
            }
            UserTrackAdapter.sendUT(getPageName(), "CheckSimilarity");
            alert("", str, getString(R.string.aliuser_re_enter), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        NewRecommendLoginFragment.access$1100(NewRecommendLoginFragment.this, "Button-Alert-CheckSimilarity-no");
                    }
                }
            }, getString(R.string.aliuser_continue_use), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (NewRecommendLoginFragment.this.isActive()) {
                        NewRecommendLoginFragment newRecommendLoginFragment = NewRecommendLoginFragment.this;
                        newRecommendLoginFragment.mobileCheckSimilarity = false;
                        NewRecommendLoginFragment.access$1200(newRecommendLoginFragment, "Button-Alert-CheckSimilarity-yes");
                        NewRecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_LOGIN);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onNeedVerifyMobile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1188b84b", new Object[]{this, str, str2});
        } else if (isActive()) {
            this.mMobileLoginPresenter.buildSMSLoginParam(str2, null, false);
            this.mMobileLoginPresenter.sendSMS();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.UserLoginView
    public void onPwdError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5f51", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendBioLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407fa49d", new Object[]{this, str, list, loginParam});
        } else if (isActive()) {
            regView(false);
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (!(loginParam == null || (editText = this.mLoginAccountET) == null)) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.BIOMETRIC);
            this.mAccountRL.requestFocus();
            if (LoginSwitch.getSwitch(LoginSwitch.BIO_LOGIN_AUTO, "false")) {
                onClickLoginAction();
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendEmailLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38909549", new Object[]{this, str, list, loginParam});
        } else if (isActive()) {
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (!(loginParam == null || (editText = this.mLoginAccountET) == null)) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.EMAIL_CODE_LOGIN);
            this.mAccountRL.requestFocus();
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendEmailReg(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc989a34", new Object[]{this, str, list, loginParam});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendFaceLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fd7d0e", new Object[]{this, str, list, loginParam});
        } else if (isActive()) {
            regView(false);
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (!(loginParam == null || (editText = this.mLoginAccountET) == null)) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.SCAN_FACE);
            this.mAccountRL.requestFocus();
            if (LoginSwitch.getSwitch(LoginSwitch.FACE_LOGIN_AUTO, "false")) {
                onClickLoginAction();
            }
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

    public void onSendEmailAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0518b72", new Object[]{this});
            return;
        }
        try {
            this.mEmailLoginPresenter.buildEmailLoginParam(getAccountName(), null);
            buildLoginParamUT(this.mEmailLoginPresenter.getLoginParam(), "emailLogin");
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mEmailLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_EMAIL_ACTION, "", "emailLogin", hashMap);
            EmailLoginPresenter emailLoginPresenter = this.mEmailLoginPresenter;
            emailLoginPresenter.sendEmailCode(this.mAttachedActivity, emailLoginPresenter.getLoginParam(), getUICallback(this.mEmailLoginPresenter.getLoginParam()));
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th);
        }
    }

    public void onSendEmailSuccess() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a4edf5", new Object[]{this});
        } else if (isActive()) {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mEmailLoginPresenter.mLoginParam));
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_METHODS, JSON.toJSONString(this.mAvailableLoginModes));
            intent.putExtra("pageTag", FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG);
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (!(loginFlowReturnData == null || (map = loginFlowReturnData.ext) == null)) {
                intent.putExtra("preCheckVerify", map.get("preCheckVerify"));
                intent.putExtra("verify", this.mLoginFlowReturnData.ext.get("verify"));
            }
            intent.putExtra("havanaId", this.mLoginParam.hid);
            goToSMSVerificationPage(intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(LoginParam loginParam, long j, boolean z) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca12e0c5", new Object[]{this, loginParam, new Long(j), new Boolean(z)});
        } else if (isActive()) {
            Intent intent = new Intent();
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (loginFlowReturnData == null || TextUtils.isEmpty(loginFlowReturnData.maskMobile)) {
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
            } else {
                intent.putExtra("maskMobile", this.mLoginFlowReturnData.maskMobile);
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
            }
            if (this.takeAvaliable) {
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_METHODS, JSON.toJSONString(this.mAvailableLoginModes));
            }
            intent.putExtra("pageTag", FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG);
            LoginFlowReturnData loginFlowReturnData2 = this.mLoginFlowReturnData;
            if (!(loginFlowReturnData2 == null || (map = loginFlowReturnData2.ext) == null)) {
                intent.putExtra("preCheckVerify", map.get("preCheckVerify"));
                intent.putExtra("verify", this.mLoginFlowReturnData.ext.get("verify"));
            }
            intent.putExtra("havanaId", this.mLoginParam.hid);
            goToSMSVerificationPage(intent);
        }
    }

    public void onSendSmsAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb87b39", new Object[]{this, str});
        } else {
            onSendSmsAction(str, false);
        }
    }

    public void onSimVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e54c518", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.loginId = getAccountName();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName(), this.mLoginFlowId);
        loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        loginParam.utPageName = getPageName();
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (userLoginActivity != null) {
            loginParam.alipayInstalled = userLoginActivity.mAlipayInstall;
        }
        this.mSimLoginPresenter.login(this.mAttachedActivity, loginParam, getUICallback(loginParam));
    }

    public void regView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbd3174", new Object[]{this, new Boolean(z)});
        } else if (this.mFragmentView != null) {
            setVisibility(this.mRegPart, z);
        }
    }

    public void resetLoginAccountETPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4b0156", new Object[]{this});
            return;
        }
        if (this.originalAccountETPadding == 0) {
            this.originalAccountETPadding = this.mLoginAccountET.getPaddingLeft();
        }
        EditText editText = this.mLoginAccountET;
        editText.setPadding(this.originalAccountETPadding, editText.getPaddingTop(), this.mLoginAccountET.getPaddingRight(), this.mLoginAccountET.getPaddingBottom());
    }

    public void resetTextWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3839e787", new Object[]{this});
        } else if (!LoginSwitch.getSwitch("closeTextWatcher", "false") && !isRecommendPage()) {
            TextWatcher textWatcher = this.mAccountTextWatcher;
            if (textWatcher != null) {
                this.mLoginAccountET.removeTextChangedListener(textWatcher);
            }
            AccountTextWatcher accountTextWatcher = new AccountTextWatcher();
            this.mAccountTextWatcher = accountTextWatcher;
            this.mLoginAccountET.addTextChangedListener(accountTextWatcher);
        }
    }

    public void resizeLoginAccountETPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244e2d91", new Object[]{this});
        } else {
            this.mRegionTV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    if (NewRecommendLoginFragment.access$600(NewRecommendLoginFragment.this) == 0) {
                        NewRecommendLoginFragment newRecommendLoginFragment = NewRecommendLoginFragment.this;
                        NewRecommendLoginFragment.access$602(newRecommendLoginFragment, newRecommendLoginFragment.mLoginAccountET.getPaddingLeft());
                    }
                    NewRecommendLoginFragment.this.mRegionTV.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    NewRecommendLoginFragment newRecommendLoginFragment2 = NewRecommendLoginFragment.this;
                    newRecommendLoginFragment2.mLoginAccountET.setPadding(newRecommendLoginFragment2.mRegionTV.getWidth() + NewRecommendLoginFragment.access$600(NewRecommendLoginFragment.this), NewRecommendLoginFragment.this.mLoginAccountET.getPaddingTop(), NewRecommendLoginFragment.this.mLoginAccountET.getPaddingRight(), NewRecommendLoginFragment.this.mLoginAccountET.getPaddingBottom());
                }
            });
        }
    }

    public void setLeftVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95603c92", new Object[]{this, new Boolean(z)});
            return;
        }
        setVisibility(this.mLeftFuncTV, z);
        if (z) {
            View view = this.mRegPart;
            if (view != null) {
                setVisibility(this.mDivider, view.getVisibility());
                return;
            }
            return;
        }
        setVisibility(this.mDivider, false);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
            return;
        }
        EditText editText = this.mLoginAccountET;
        if (editText != null) {
            this.mOriginUserInput = str;
            editText.setText(str);
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment
    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else {
            super.showBottomMenuForFirstPage();
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void showFindPasswordAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8313525e", new Object[]{this, loginParam, rpcResponse});
        } else {
            showFindPasswordAlert(loginParam, rpcResponse, this.mUserLoginPresenter, this.mPasswordET, this.mShowPasswordIV);
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

    public void showMoreLoginModeMenu(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940a8aaf", new Object[]{this, loginModeState});
            return;
        }
        BottomMethodFragment bottomMethodFragment = getBottomMethodFragment();
        ArrayList arrayList = new ArrayList();
        for (final String str : this.mAvailableLoginModes) {
            if (!TextUtils.equals(loginModeState.name(), str)) {
                final LoginModeState valueOf = LoginModeState.valueOf(str);
                if (valueOf.loginModeName > 0) {
                    LoginMethodItem create = LoginModeState.create(this, valueOf);
                    create.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMethodFragment, create) { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str2, Object... objArr) {
                            str2.hashCode();
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewRecommendLoginFragment$10");
                        }

                        @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                        public void onClickMenuItem(View view, MenuItem menuItem) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem});
                            } else {
                                NewRecommendLoginFragment.this.clickMenu(str, valueOf);
                            }
                        }
                    });
                    arrayList.add(create);
                }
            }
        }
        bottomMethodFragment.setMethods(arrayList);
        bottomMethodFragment.setMenuTitle(getString(R.string.aliuser_more_login_mode_title));
        bottomMethodFragment.setControlHitPrefix(getHitPrefix(this.mRecommendLoginType));
        bottomMethodFragment.show(getFragmentManager(), getPageName());
    }

    public void switchLoginModeHit(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9521cfad", new Object[]{this, loginModeState});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), loginModeState.controllName, this.mRecommendLoginType);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void updateAccountInfo(LoginFlowReturnData loginFlowReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4189dac", new Object[]{this, loginFlowReturnData});
        } else {
            this.mLoginFlowReturnData = loginFlowReturnData;
        }
    }

    public void updateLoginHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da5e7ce", new Object[]{this});
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(getHintAccountText());
            int i = 16;
            if (this.needAdaptElder) {
                i = ElderUtil.getScaleSize(16);
            }
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, spannableString.length(), 33);
            this.mLoginAccountET.setHint(new SpannedString(spannableString));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void updateOtherLoginMode(final LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1070e3", new Object[]{this, loginModeState});
            return;
        }
        List<String> list = this.mAvailableLoginModes;
        if (list == null || list.size() == 0) {
            setLeftVisibility(false);
        } else if (this.mAvailableLoginModes.size() == 1) {
            setLeftVisibility(false);
        } else if (this.mAvailableLoginModes.size() == 2) {
            if (loginModeState != LoginModeState.LOCATION) {
                for (String str : this.mAvailableLoginModes) {
                    if (!TextUtils.equals(loginModeState.name(), str)) {
                        final LoginModeState valueOf = LoginModeState.valueOf(str);
                        if (valueOf.loginModeName > 0) {
                            setLeftVisibility(true);
                            if (!this.fromOversea || !TextUtils.equals(valueOf.name(), LoginModeState.SMS_LOGIN.name())) {
                                this.mLeftFuncTV.setText(valueOf.loginModeName);
                            } else {
                                this.mLeftFuncTV.setText(R.string.aliuser_login_sms_login_oversea);
                            }
                            this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.8
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                        return;
                                    }
                                    NewRecommendLoginFragment.this.switchLoginModeHit(valueOf);
                                    NewRecommendLoginFragment.this.updateLoginModeState(valueOf);
                                }
                            });
                        } else {
                            setLeftVisibility(false);
                        }
                    }
                }
                return;
            }
            setLeftVisibility(false);
        } else if (loginModeState != LoginModeState.LOCATION) {
            setLeftVisibility(true);
            this.mLeftFuncTV.setText(R.string.aliuser_login_more_login);
            this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    NewRecommendLoginFragment.access$700(NewRecommendLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER);
                    NewRecommendLoginFragment.this.showMoreLoginModeMenu(loginModeState);
                }
            });
        } else {
            setLeftVisibility(false);
        }
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.mLoginParam = null;
        if (arguments != null) {
            try {
                this.fromOneKey = arguments.getBoolean(LoginConstant.FROM_ONE_KEY, false);
                this.mPreviousChecked = arguments.getBoolean("check");
                String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                arguments.remove(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                if (!TextUtils.isEmpty(str)) {
                    this.mLoginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                }
                this.supportOverseaSimLogin = arguments.getBoolean("supportOverseaSimLogin", false);
                String string = arguments.getString(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.LOCATION.name());
                this.paramModeState = string;
                this.mCurrentLoginModeState = LoginModeState.parse(string);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mSource = this.mLoginParam.source;
        this.mLoginPresenter = new RecommendLoginPresenter(this, this.mLoginParam.clone());
        LoginParam loginParam = this.mLoginParam;
        loginParam.token = null;
        loginParam.tokenType = null;
        this.mUserLoginPresenter = new UserLoginPresenter(this, this.mLoginParam.clone());
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.mLoginParam.clone());
        this.mSimLoginPresenter = new SimVerifyPresenter(this, this.mLoginParam.clone());
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.mLoginParam.clone());
        this.mSMSNickLoginPresenter = new SMSNickLoginPresenter(this, this.mLoginParam.clone());
        this.mBioPresenter = new BioPresenter(this, this.mLoginParam.clone());
        this.mEmailLoginPresenter = new EmailLoginPresenter(this, this.mLoginParam.clone());
    }

    public void nickSendSMS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d1101f", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mSMSNickLoginPresenter.buildSMSLoginParam(getAccountName(), null, false);
        this.mSMSNickLoginPresenter.getLoginParam().regXianyu = z;
        this.mSMSNickLoginPresenter.getLoginParam().resendAlert = this.mUserLoginActivity.isNeedSMSCheck();
        this.mSMSNickLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
        this.mSMSNickLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
        buildLoginParamUT(this.mSMSNickLoginPresenter.getLoginParam(), LoginType.LocalLoginType.NICK_SMS_LOGIN);
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.mSMSNickLoginPresenter.getLoginParam().sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.NICK_SMS_LOGIN, hashMap);
        if (this.mUserLoginActivity != null) {
            this.mSMSNickLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
        }
        SMSNickLoginPresenter sMSNickLoginPresenter = this.mSMSNickLoginPresenter;
        sMSNickLoginPresenter.sendSMS(this.mAttachedActivity, sMSNickLoginPresenter.getLoginParam(), getUICallback(this.mSMSNickLoginPresenter.getLoginParam()));
    }

    public void onClickLoginAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24ccc97", new Object[]{this, new Boolean(z)});
            return;
        }
        switch (AnonymousClass16.$SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[this.mCurrentLoginModeState.ordinal()]) {
            case 1:
                if (TextUtils.isEmpty(getAccountName())) {
                    toast(getString(R.string.aliuser_taobao_recommend_login_hint), 0);
                    return;
                }
                this.mOriginUserInput = getAccountName();
                this.mLoginPresenter.buildLoginParam(getAccountName(), "", this.mobileCheckSimilarity);
                try {
                    IDialogHelper iDialogHelper = this.mDialogHelper;
                    if (iDialogHelper != null) {
                        iDialogHelper.hideInputMethod();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                String str = AppInfo.getInstance().getUtdid() + String.valueOf(System.currentTimeMillis() / 1000);
                this.mLoginFlowId = str;
                this.mLoginPresenter.mLoginParam.sdkTraceId = str;
                HashMap hashMap = new HashMap();
                hashMap.put("sdkTraceId", this.mLoginFlowId);
                UserTrackAdapter.control(getPageName(), "confirm", "", hashMap);
                LoginParam loginParam = this.mLoginPresenter.mLoginParam;
                if (loginParam.ext == null) {
                    loginParam.ext = new HashMap();
                }
                if (CommonUtil.isInABTestRegion("canHandleGuideH5", -1)) {
                    this.mLoginPresenter.mLoginParam.ext.put("canHandleGuideH5", "true");
                }
                this.mLoginPresenter.getLoginFlow();
                return;
            case 2:
                onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN, z);
                return;
            case 3:
                String trim = this.mPasswordET.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    toast(getString(R.string.aliuser_sign_in_please_enter_password), 0);
                    return;
                }
                IDialogHelper iDialogHelper2 = this.mDialogHelper;
                if (iDialogHelper2 != null) {
                    iDialogHelper2.hideInputMethod();
                }
                String accountName = getAccountName();
                if (this.mRegionTV.getVisibility() == 0) {
                    String phoneCode = getPhoneCode();
                    if (!"86".equals(phoneCode)) {
                        accountName = phoneCode + "-" + accountName;
                    }
                }
                this.mUserLoginPresenter.buildLoginParam(accountName, trim);
                this.mUserLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.PWD_LOGIN, getPageName(), this.mLoginFlowId);
                this.mUserLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.PWD_LOGIN;
                this.mUserLoginPresenter.getLoginParam().utPageName = getPageName();
                if (!TextUtils.isDigitsOnly(this.mUserLoginPresenter.getLoginParam().loginId)) {
                    if (TextUtils.equals(this.paramModeState, LoginModeState.LOCATION.name())) {
                        this.mUserLoginPresenter.getLoginParam().fromRecommendLogin = "1";
                    } else if (supportToSms()) {
                        this.mUserLoginPresenter.getLoginParam().fromRecommendLogin = "2";
                    }
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("sdkTraceId", this.mUserLoginPresenter.getLoginParam().sdkTraceId + "");
                UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.PWD_LOGIN, hashMap2);
                if (this.mUserLoginActivity != null) {
                    this.mUserLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
                }
                UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
                userLoginPresenter.login(this.mAttachedActivity, userLoginPresenter.getLoginParam(), getUICallback(this.mUserLoginPresenter.getLoginParam()));
                return;
            case 4:
                addControl("onekey");
                onSimVerify();
                return;
            case 5:
                onFaceLogin();
                return;
            case 6:
                onFingerLogin();
                return;
            default:
                return;
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail(LoginParam loginParam) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f903ba0", new Object[]{this, loginParam});
            return;
        }
        if (loginParam != null) {
            z = loginParam.regXianyu;
        }
        onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN, z);
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendPwdLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579d2708", new Object[]{this, str, list, loginParam});
        } else if (isActive()) {
            regView(false);
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (!(loginParam == null || (editText = this.mLoginAccountET) == null)) {
                editText.setText(getAccountNameForPassword(loginParam.loginId));
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.PASSWORD);
            if (!CommonUtil.isInABTestRegion("pwdShowRegion", 10000) || TextUtils.isEmpty(loginParam.countryCode)) {
                this.mRegionTV.setVisibility(8);
            } else {
                this.mRegionTV.setVisibility(0);
                initRegionInfo(loginParam);
            }
            this.mPasswordET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    EditText editText2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NewRecommendLoginFragment.this.mPasswordRL.setVisibility(0);
                    if (NewRecommendLoginFragment.this.getContext() != null && NewRecommendLoginFragment.this.isActive() && (editText2 = NewRecommendLoginFragment.this.mPasswordET) != null) {
                        editText2.requestFocus();
                        NewRecommendLoginFragment.this.mPasswordET.requestFocusFromTouch();
                        InputMethodManager inputMethodManager = (InputMethodManager) NewRecommendLoginFragment.this.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(NewRecommendLoginFragment.this.mPasswordET, 1);
                        }
                    }
                }
            }, 300L);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendSimLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1214ae", new Object[]{this, str, list, loginParam});
        } else if (isActive()) {
            regView(false);
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (!(loginParam == null || (editText = this.mLoginAccountET) == null)) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            initRegionInfo(loginParam);
            updateLoginModeState(LoginModeState.SIM_LOGIN);
            this.mAccountRL.requestFocus();
            if (LoginSwitch.getSwitch(LoginSwitch.SIM_LOGIN_AUTO, "true")) {
                onClickLoginAction(loginParam.regXianyu);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendSmsLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6129f86c", new Object[]{this, str, list, loginParam});
        } else if (isActive()) {
            regView(false);
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (!(loginParam == null || (editText = this.mLoginAccountET) == null)) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            initRegionInfo(loginParam);
            updateLoginModeState(LoginModeState.SMS_LOGIN);
            this.mAccountRL.requestFocus();
            if (LoginSwitch.getSwitch(LoginSwitch.REG_TO_LOGIN_SENDSMS, "true") && loginParam.callRpc) {
                onClickLoginAction(loginParam.regXianyu);
            } else if (LoginSwitch.getSwitch(LoginSwitch.SMS_LOGIN_AUTO, "false")) {
                onClickLoginAction(loginParam.regXianyu);
            }
        }
    }

    public void onSendSmsAction(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8579ebb", new Object[]{this, str, new Boolean(z)});
            return;
        }
        LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
        if (loginFlowReturnData == null || TextUtils.isEmpty(loginFlowReturnData.maskMobile)) {
            try {
                if (!LoginSwitch.getSwitch("checkMobileValid", "true") || !LoginModeState.SMS_LOGIN.name().equals(this.paramModeState) || isMobileValid(getAccountName())) {
                    this.mMobileLoginPresenter.buildSMSLoginParam(getAccountName(), null, false);
                    this.mMobileLoginPresenter.getLoginParam().regXianyu = z;
                    this.mMobileLoginPresenter.getLoginParam().resendAlert = this.mUserLoginActivity.isNeedSMSCheck();
                    this.mMobileLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
                    this.mMobileLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
                    if (this.mUserLoginActivity != null) {
                        this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
                    }
                    buildLoginParamUT(this.mMobileLoginPresenter.getLoginParam(), str);
                    if (this.mMobileLoginPresenter.getLoginParam().ext != null) {
                        this.mMobileLoginPresenter.getLoginParam().ext.put("showReigsterPolicy", "true");
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
                    UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", str, hashMap);
                    sendSms();
                    return;
                }
                toast(getString(R.string.aliuser_phone_number_invalidate), 0);
                UserTrackAdapter.sendUT(getPageName(), UTConstans.CustomEvent.UT_MOBILE_INVALID);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            nickSendSMS(z);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void pwdErrorToSMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab6e9da", new Object[]{this});
        } else if (supportToSms()) {
            nickSendSMS(false);
        } else {
            onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN);
        }
    }

    private boolean pwdInDegradePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93115c0e", new Object[]{this})).booleanValue();
        }
        return !isRecommendPage() && pwd(this.mCurrentLoginModeState) && LoginSwitch.getSwitch("pwdClick", "true");
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        int id = view.getId();
        if (id == R.id.ali_user_login_alipay_login_tv) {
            if (pwdInDegradePage()) {
                commonAddCheck(LoginClickAction.ACTION_ALIPAY, 0, this.mProtocolCB, this.mProtocolCBXianyu);
            } else {
                addCheckAction(LoginClickAction.ACTION_ALIPAY);
            }
        } else if (id == R.id.aliuser_recommend_login_reg_tv) {
            addControl("register");
            RegistParam registParam = new RegistParam();
            registParam.registSite = getLoginSite();
            registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
            registParam.source = this.mSource;
            try {
                if (this.mUserLoginActivity.fireAppLaunchRes != null) {
                    HashMap hashMap = new HashMap();
                    registParam.externParams = hashMap;
                    hashMap.put(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(this.mUserLoginActivity.fireAppLaunchRes));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(this.mAttachedActivity, registParam);
        } else if (id == R.id.aliuser_recommend_login_next_btn) {
            if (!this.isClicked || LoginSwitch.getSwitch("ignoreLoginClickCheck", "false")) {
                this.isClicked = true;
                new Handler().postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NewRecommendLoginFragment.access$402(NewRecommendLoginFragment.this, false);
                        }
                    }
                }, 200L);
                if (pwdInDegradePage()) {
                    addCheckAction(LoginClickAction.ACTION_PWD);
                } else {
                    addCheckAction(LoginClickAction.ACTION_LOGIN);
                }
            } else {
                UserTrackAdapter.sendUT(getPageName(), "duplicateLoginClick");
            }
        } else if (id == R.id.aliuser_recommend_login_region_tv) {
            addControl("Button-Region");
            Intent intent = new Intent(this.mAttachedActivity, AliUserRegisterChoiceRegionActivity.class);
            intent.putExtra("from_login", true);
            this.mAttachedActivity.startActivityForResult(intent, 2001);
        } else if (id == R.id.aliuser_recommend_login_account_et) {
            editLoginAccount();
        } else if (id == R.id.aliuser_recommend_login_right_func_tv) {
            addControl("Button-ResetPwd");
            onForgetPasswordAction();
        } else if (id == R.id.aliuser_recommend_login_show_password_btn) {
            int selectionEnd = this.mPasswordET.getSelectionEnd();
            if (view.getTag() == null || !((Boolean) view.getTag()).booleanValue()) {
                this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                this.mShowPasswordIV.setContentDescription(getString(R.string.aliuser_assist_password_show));
                view.setTag(Boolean.TRUE);
                addControl("Button-ShowPwd");
            } else {
                this.mPasswordET.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility_off);
                this.mShowPasswordIV.setContentDescription(getString(R.string.aliuser_assist_password_hide));
                addControl("Button-HidePwd");
                view.setTag(Boolean.FALSE);
            }
            if (selectionEnd > 0) {
                this.mPasswordET.setSelection(selectionEnd);
            }
            this.mPasswordET.postInvalidate();
        } else if (id == R.id.aliuser_recommend_login_menu) {
            addControl("more");
            showBottomMenu();
        } else if (id == R.id.aliuser_login_account_clear_iv) {
            addControl(pg1.ATOM_EXT_clear);
            EditText editText = this.mLoginAccountET;
            if (editText != null) {
                editText.getEditableText().clear();
                this.mLoginAccountET.setEnabled(true);
            }
        } else if (id == R.id.aliuser_recommend_login_password_clear_iv) {
            EditText editText2 = this.mPasswordET;
            if (editText2 != null) {
                editText2.getEditableText().clear();
            }
        } else {
            super.onClick(view);
        }
    }

    public void updateLoginModeState(LoginModeState loginModeState) {
        String str;
        int i;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c8f43a", new Object[]{this, loginModeState});
            return;
        }
        this.mCurrentLoginModeState = loginModeState;
        TextView textView2 = this.mTipsTV;
        if (textView2 != null) {
            textView2.setVisibility(8);
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
            TextView textView3 = this.mTipsTV;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else if (smsOrSim(loginModeState)) {
            this.mLoginAccountET.setText(this.mRecommendLoginId);
            if (this.supportOverseaSimLogin || LoginModeState.SMS_LOGIN.name().equals(this.paramModeState)) {
                this.mLoginAccountET.setInputType(3);
            } else {
                this.mLoginAccountET.setInputType(1);
            }
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (!(loginFlowReturnData == null || TextUtils.isEmpty(loginFlowReturnData.maskMobile) || (textView = this.mTipsTV) == null)) {
                textView.setVisibility(0);
                addHintPadding(this.mTipsTV);
                this.mRegionTV.setVisibility(8);
                TextView textView4 = this.mTipsTV;
                int i2 = R.string.aliuser_sms_nick_login_tips;
                textView4.setText(getString(i2, this.mLoginFlowReturnData.maskMobile + " "));
            }
        } else {
            this.mLoginAccountET.setText(this.mRecommendLoginId);
        }
        if (smsOrSim(loginModeState)) {
            initRegionInfo(this.mLoginParam);
        } else if (loginModeState == LoginModeState.PASSWORD) {
            LoginFlowReturnData loginFlowReturnData2 = this.mLoginFlowReturnData;
            if (loginFlowReturnData2 == null || TextUtils.isEmpty(loginFlowReturnData2.countryCode)) {
                this.mRegionTV.setVisibility(8);
                resetLoginAccountETPadding();
                resetTextWatcher();
            } else {
                this.mRegionTV.setVisibility(0);
                initRegionInfo(this.mLoginParam);
            }
        } else {
            resetLoginAccountETPadding();
            resetTextWatcher();
        }
        this.mRightFuncTV.setVisibility(loginModeState.rightFuncTVVisibility);
        if (loginModeState.protocolVisibility != 0 || ServiceFactory.getService(NumberAuthService.class) == null || ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() == null) {
            str = str2;
        } else {
            str2 = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
            str = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
        }
        int i3 = LoginStatus.degradeHegui;
        if (i3 == 0) {
            TextView textView5 = this.mProtocolTV;
            if (textView5 != null) {
                textView5.setVisibility(0);
                generateProtocol(str2, str, false);
            }
        } else if (i3 == 1) {
            if (isRecommendPage() || smsOrSim(loginModeState)) {
                generateProtocol(str2, str, true);
            } else {
                generateProtocol(str2, str, false);
            }
        } else if (isRecommendPage() || smsOrSim(loginModeState)) {
            generateProtocol(str2, str, false);
            generateXianyuProtocol();
            setVisibility(this.mProtocolContentXianyu, true);
        } else {
            generateProtocol(str2, str, false);
            setVisibility(this.mProtocolContentXianyu, false);
        }
        if (loginModeState.passwordVisibility == 0) {
            viewVisibleAnimate(this.mPasswordRL, getEditHeight());
        } else {
            viewGoneAnimate(this.mPasswordRL);
        }
        boolean autoCheckbox = CommonUtil.autoCheckbox();
        Button button = this.mRecommendLoginNextBtn;
        if (autoCheckbox) {
            i = loginModeState.loginBtnTextAuto;
        } else {
            i = loginModeState.loginBtnText;
        }
        button.setText(i);
        if (this.supportOverseaSimLogin || LoginModeState.SMS_LOGIN.name().equals(this.paramModeState) || LoginModeState.PASSWORD.name().equals(this.paramModeState)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(LoginModeState.PASSWORD.name());
            arrayList.add(LoginModeState.SMS_LOGIN.name());
            this.mAvailableLoginModes = arrayList;
            updateOtherLoginMode(loginModeState);
            return;
        }
        updateOtherLoginMode(loginModeState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        RegionInfo regionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 2001) {
            int i3 = AnonymousClass16.$SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[this.mCurrentLoginModeState.ordinal()];
            if (i3 == 1) {
                this.mLoginPresenter.onActivityResult(i, i2, intent);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            if (i == 1001) {
                                this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
                            } else if (i == 1003) {
                                this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
                            } else {
                                this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
                            }
                        }
                    } else if (i == 1001) {
                        this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
                    } else if (i == 1003) {
                        this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
                    } else {
                        this.mSimLoginPresenter.onActivityResult(i, i2, intent);
                    }
                } else if (i == 1001) {
                    this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
                } else if (i == 1003) {
                    this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
                } else if (i == 1004) {
                    this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
                } else {
                    this.mUserLoginPresenter.onActivityResult(i, i2, intent);
                }
            } else if (i == 1004) {
                this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
            } else if (i == 1003) {
                this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
            } else {
                this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
            }
            rmo.k(SNSPlatform.PLATFORM_GOOGLE, i, i2, intent);
            rmo.k(SNSPlatform.PLATFORM_FACEBOOK, i, i2, intent);
            rmo.k(SNSPlatform.PLATFORM_LINE, i, i2, intent);
        } else if (intent != null) {
            RegionInfo regionInfo2 = (RegionInfo) intent.getParcelableExtra("region");
            this.supportOverseaSimLogin = CountryUtil.supportOverseaSimLogin(this.mUserLoginActivity.fireAppLaunchRes, regionInfo2, false);
            if (!(regionInfo2 == null || (regionInfo = this.mRegionInfo) == null || TextUtils.equals(regionInfo2.code, regionInfo.code))) {
                this.degradeToSMS = true;
                this.mAvailableLoginModes.remove(LoginModeState.SCAN_FACE.name());
                this.mAvailableLoginModes.remove(LoginModeState.SIM_LOGIN.name());
                updateLoginModeState(this.mCurrentLoginModeState);
            }
            this.mRegionInfo = regionInfo2;
            if (regionInfo2 != null) {
                this.mRegionTV.setText(regionInfo2.code);
            }
            resizeLoginAccountETPadding();
            adjustMobileETMaxLength();
        }
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        AppLaunchInfoResponseData appLaunchInfoResponseData;
        T t;
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
        this.mUserLoginActivity = (UserLoginActivity) getActivity();
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else {
                    NewRecommendLoginFragment.access$102(NewRecommendLoginFragment.this, false);
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    NewRecommendLoginFragment.access$002(NewRecommendLoginFragment.this, true);
                }
            }
        });
        resetActionBar();
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (!(userLoginActivity == null || (appLaunchInfoResponseData = userLoginActivity.fireAppLaunchRes) == null || (t = appLaunchInfoResponseData.returnValue) == 0)) {
            AppLaunchInfo appLaunchInfo = (AppLaunchInfo) t;
            if (appLaunchInfo.fromOversea) {
                this.fromOversea = true;
                if (TextUtils.equals(this.mCurrentLoginModeState.name(), LoginModeState.SMS_LOGIN.name())) {
                    UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_OVERSEA_LOGIN_SHOW, String.valueOf(appLaunchInfo.supportOverseaSimLogin), null);
                }
            }
        }
        this.mRegPart = this.mFragmentView.findViewById(R.id.aliuser_reg_part);
        this.mAccountClearBtn = view.findViewById(R.id.aliuser_login_account_clear_iv);
        this.mPasswordClearBtn = view.findViewById(R.id.aliuser_recommend_login_password_clear_iv);
        this.mAccountRL = (RelativeLayout) view.findViewById(R.id.aliuser_recommend_login_account_rl);
        this.mRegTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_reg_tv);
        this.mDivider = view.findViewById(R.id.aliuser_divider);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_recommend_login_reg_tip_tv);
        EditText editText = (EditText) view.findViewById(R.id.aliuser_recommend_login_account_et);
        this.mLoginAccountET = editText;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view2, new Boolean(z)});
                } else if (z) {
                    NewRecommendLoginFragment.this.editLoginAccount();
                } else {
                    View view3 = NewRecommendLoginFragment.this.mAccountClearBtn;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
            }
        });
        this.mLoginAccountET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                EditText editText2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (NewRecommendLoginFragment.this.getContext() != null && NewRecommendLoginFragment.this.isActive() && (editText2 = NewRecommendLoginFragment.this.mLoginAccountET) != null) {
                    editText2.requestFocus();
                    NewRecommendLoginFragment.this.mLoginAccountET.requestFocusFromTouch();
                    InputMethodManager inputMethodManager = (InputMethodManager) NewRecommendLoginFragment.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(NewRecommendLoginFragment.this.mLoginAccountET, 1);
                    }
                }
            }
        }, 300L);
        updateLoginHint();
        if (isRecommendPage()) {
            AccountTextWatcher accountTextWatcher = new AccountTextWatcher();
            this.mAccountTextWatcher = accountTextWatcher;
            this.mLoginAccountET.addTextChangedListener(accountTextWatcher);
        }
        Button button = (Button) view.findViewById(R.id.aliuser_recommend_login_next_btn);
        this.mRecommendLoginNextBtn = button;
        button.setEnabled(false);
        TextView textView2 = (TextView) view.findViewById(R.id.aliuser_recommend_login_region_tv);
        this.mRegionTV = textView2;
        textView2.setVisibility(8);
        this.mLeftFuncTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_left_func_tv);
        this.mRightFuncTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_right_func_tv);
        this.mPasswordRL = (RelativeLayout) view.findViewById(R.id.aliuser_recommend_login_password_rl);
        EditText editText2 = (EditText) view.findViewById(R.id.aliuser_recommend_login_password_et);
        this.mPasswordET = editText2;
        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mPasswordET.addTextChangedListener(new TextWatcher() { // from class: com.ali.user.mobile.login.newui.NewRecommendLoginFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (NewRecommendLoginFragment.this.mPasswordClearBtn == null) {
                } else {
                    if (charSequence == null || charSequence.length() == 0) {
                        if (NewRecommendLoginFragment.this.mPasswordClearBtn.getVisibility() != 8) {
                            NewRecommendLoginFragment.this.mPasswordClearBtn.setVisibility(8);
                        }
                    } else if (NewRecommendLoginFragment.this.mPasswordClearBtn.getVisibility() != 0) {
                        NewRecommendLoginFragment.this.mPasswordClearBtn.setVisibility(0);
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (NewRecommendLoginFragment.this.mPasswordET != null && charSequence != null && charSequence.length() > 0 && NewRecommendLoginFragment.access$200(NewRecommendLoginFragment.this)) {
                    NewRecommendLoginFragment.access$202(NewRecommendLoginFragment.this, false);
                    NewRecommendLoginFragment.access$300(NewRecommendLoginFragment.this, "password_input");
                }
            }
        });
        this.mShowPasswordIV = (ImageView) view.findViewById(R.id.aliuser_recommend_login_show_password_btn);
        this.mTipsTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_tip_tv);
        TextView textView3 = (TextView) view.findViewById(R.id.aliuser_recommend_login_menu);
        this.moreFuncMenu = textView3;
        setOnClickListener(this.mRegTV, this.mRecommendLoginNextBtn, this.mLeftFuncTV, this.mRightFuncTV, this.mShowPasswordIV, this.mLoginAccountET, this.mRegionTV, textView3, this.mAccountClearBtn, this.mPasswordClearBtn);
        this.mLoginPresenter.onStart();
        LoginParam loginParam = this.mLoginParam;
        if (loginParam.callRpc) {
            loginParam.callRpc = false;
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        }
        updateLoginModeState(this.mCurrentLoginModeState);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mRegTV, this.mRecommendLoginNextBtn, this.mRegionTV, this.mLoginAccountET, this.mPasswordET, this.mLeftFuncTV, this.mRightFuncTV, textView, this.moreFuncMenu, this.mProtocolTV);
        }
        hideInputMethod(this.mRecommendLoginNextBtn);
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        this.mAlipayLL = view.findViewById(R.id.aliuser_sns_alipay_ll);
        this.mQrLoginTV = (TextView) view.findViewById(R.id.aliuser_qrlogin_tv);
        this.mQrDividerView = view.findViewById(R.id.aliuser_qrlogin_divider);
        TextView textView4 = this.mQrLoginTV;
        if (textView4 != null) {
            setOnClickListener(textView4);
            QrScan.showQrScan(this.mUserLoginActivity, this.mQrLoginTV, this.mQrDividerView, false);
        }
        TextView textView5 = this.mAlipayLoginTV;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
            AlipayAuth.showAlipay(this, this.mAlipayLoginTV, this.mAlipayLL, isRecommendPage());
        }
    }
}
