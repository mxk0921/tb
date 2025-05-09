package com.ali.user.mobile.login.newui;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.OceanRegisterParam;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.register.ui.AliUserSmsCodeViewNew;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.ui.widget.CountDownButton;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.f7l;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewRegSMSVerification extends BaseFragment implements UserMobileLoginView, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.numAuthReg";
    public boolean alipayInstalled;
    public String codeLength;
    public boolean fromOversea;
    public String mAreaCode;
    public String mCountryCode;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mMobileNum;
    public CountDownButton mSendSMSCodeBtn;
    public String mSessionId;
    public AliUserSmsCodeViewNew mSmsCodeView;
    public OceanRegisterParam mTraceParam;
    public String regionInfoStr;
    public LoginParam loginParam = null;
    public boolean isVoice = false;

    static {
        t2o.a(70254682);
        t2o.a(70254806);
    }

    public static /* synthetic */ void access$000(NewRegSMSVerification newRegSMSVerification, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6926363d", new Object[]{newRegSMSVerification, str});
        } else {
            newRegSMSVerification.addControl(str);
        }
    }

    public static /* synthetic */ Object ipc$super(NewRegSMSVerification newRegSMSVerification, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1824869764:
                super.onPrepareOptionsMenu((Menu) objArr[0]);
                return null;
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
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewRegSMSVerification");
        }
    }

    public void backClickedYes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576a1a8e", new Object[]{this});
            return;
        }
        addControl(UTConstans.Controls.UT_REG_BACK_BUTTON_CLICK);
        if (getActivity() != null) {
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            UserTrackAdapter.sendUT(getPageName(), "single_register_cancel", "", getRegType(), properties);
            getActivity().finish();
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

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mCountryCode)) {
            return o78.CHINA_MAINLAND;
        }
        return this.mCountryCode;
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
        return R.layout.aliuser_fragment_register_sms_verification_new;
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
        return UTConstans.PageName.UT_PAGE_SMS_CODE;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mAreaCode)) {
            return "86";
        }
        return this.mAreaCode.replace(f7l.PLUS, "");
    }

    public String getRegType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this});
        }
        return UTConstant.Args.UT_MOBILE_REG;
    }

    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.newui.NewRegSMSVerification.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                Throwable th;
                Throwable th2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                SmsApplyResult smsApplyResult = null;
                if (i != 5008) {
                    if (i != 5009) {
                        if (i != 6001) {
                            return;
                        }
                    } else if (NewRegSMSVerification.this.isActive() && map != null) {
                        try {
                            smsApplyResult = (SmsApplyResult) map.get("result");
                            try {
                                NewRegSMSVerification.this.mSessionId = smsApplyResult.emailSid;
                            } catch (Throwable th3) {
                                th2 = th3;
                                smsApplyResult = smsApplyResult;
                                th2.printStackTrace();
                                NewRegSMSVerification.this.onSendEmailSuccess(smsApplyResult);
                                return;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                        NewRegSMSVerification.this.onSendEmailSuccess(smsApplyResult);
                        return;
                    } else {
                        return;
                    }
                }
                if (map != null) {
                    long longValue = ((Long) map.get("millSecond")).longValue();
                    try {
                        smsApplyResult = (SmsApplyResult) map.get("result");
                        if (smsApplyResult != null) {
                            try {
                                if (!TextUtils.isEmpty(smsApplyResult.smsSid)) {
                                    NewRegSMSVerification.this.mSessionId = smsApplyResult.smsSid;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                smsApplyResult = smsApplyResult;
                                th.printStackTrace();
                                NewRegSMSVerification.this.onSendSMSSuccess(longValue, smsApplyResult);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    NewRegSMSVerification.this.onSendSMSSuccess(longValue, smsApplyResult);
                }
            }
        };
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        try {
            updateLogo((TUrlImageView) view.findViewById(R.id.aliuser_taobao_logo));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.login.newui.NewRegSMSVerification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else {
                    NewRegSMSVerification.this.alipayInstalled = false;
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    NewRegSMSVerification.this.alipayInstalled = true;
                }
            }
        });
        try {
            if (!(getActivity() == null || ((BaseActivity) getActivity()).getSupportActionBar() == null)) {
                ((BaseActivity) getActivity()).getSupportActionBar().setTitle("");
                ((BaseActivity) getActivity()).setNavigationBackIcon();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        TextView textView = (TextView) view.findViewById(R.id.aliuser_register_sms_code_secondary_title_tv);
        setSecondTV(textView);
        AliUserSmsCodeViewNew aliUserSmsCodeViewNew = (AliUserSmsCodeViewNew) view.findViewById(R.id.aliuser_register_sms_code_view);
        this.mSmsCodeView = aliUserSmsCodeViewNew;
        this.codeLength = "4";
        if (aliUserSmsCodeViewNew != null && !TextUtils.isEmpty("4")) {
            this.mSmsCodeView.setTextCount(Integer.parseInt(this.codeLength));
        }
        this.mSmsCodeView.setOnCompletedListener(new AliUserSmsCodeViewNew.OnCompletedListener() { // from class: com.ali.user.mobile.login.newui.NewRegSMSVerification.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.register.ui.AliUserSmsCodeViewNew.OnCompletedListener
            public void onCompleted(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d93484bd", new Object[]{this, str});
                } else {
                    NewRegSMSVerification.this.submitRegisterForm();
                }
            }
        });
        this.mSmsCodeView.focus();
        CountDownButton countDownButton = (CountDownButton) view.findViewById(R.id.aliuser_register_send_smscode_btn);
        this.mSendSMSCodeBtn = countDownButton;
        countDownButton.setOnClickListener(this);
        this.mSendSMSCodeBtn.setGetCodeTitle(R.string.aliuser_signup_verification_reGetCode2);
        this.mSendSMSCodeBtn.setTickTitleRes(R.string.aliuser_sms_code_success_hint2);
        this.mSendSMSCodeBtn.startCountDown(60000L, 1000L);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mSendSMSCodeBtn, textView);
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

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        } else {
            this.mSmsCodeView.clearText();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_register_send_smscode_btn) {
            this.isVoice = false;
            sendCodeAction();
            this.mSendSMSCodeBtn.setBackgroundDrawable(null);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initParams();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        SpannableString spannableString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        try {
            MenuItem findItem = menu.findItem(R.id.aliuser_menu_item_help);
            if (this.fromOversea) {
                spannableString = new SpannableString(getResources().getString(R.string.aliuser_sms_need_help_new));
                spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_color_orange)), 0, spannableString.length(), 0);
            } else {
                spannableString = new SpannableString(getResources().getString(R.string.aliuser_help));
                spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_showloginId_text_color)), 0, spannableString.length(), 0);
            }
            findItem.setTitle(spannableString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == R.id.aliuser_menu_item_help) {
            openHelp();
        }
        return super.onOptionsItemSelected(menuItem);
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
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        int i = R.id.aliuser_menu_item_help;
        if (menu.findItem(i) != null) {
            int i2 = R.id.aliuser_menu_item_more;
            if (menu.findItem(i2) != null) {
                menu.findItem(i2).setVisible(false);
                menu.findItem(i).setVisible(true);
            }
        }
        super.onPrepareOptionsMenu(menu);
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
        }
    }

    public void onSendEmailSuccess(SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cb9a57", new Object[]{this, smsApplyResult});
        }
    }

    public void onSendSMSAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704a1b2f", new Object[]{this});
            return;
        }
        this.mMobileLoginPresenter.buildSMSLoginParam(this.mMobileNum, null, this.isVoice);
        this.mMobileLoginPresenter.getLoginParam().smsSid = this.mSessionId;
        this.mMobileLoginPresenter.getLoginParam().ext.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
        this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, getPageName());
        this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        userMobileLoginPresenter.sendSMS(this.mAttachedActivity, userMobileLoginPresenter.getLoginParam(), getUICallback());
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(LoginParam loginParam, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca12e0c5", new Object[]{this, loginParam, new Long(j), new Boolean(z)});
        }
    }

    public void openHelp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652b6bb2", new Object[]{this});
            return;
        }
        addControl("Button-Help");
        BaseActivity baseActivity = this.mAttachedActivity;
        if (baseActivity instanceof AliUserRegisterActivity) {
            ((AliUserRegisterActivity) baseActivity).goHelp();
        }
    }

    public void sendCodeAction() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538b8b32", new Object[]{this});
            return;
        }
        AliUserSmsCodeViewNew aliUserSmsCodeViewNew = this.mSmsCodeView;
        if (aliUserSmsCodeViewNew != null) {
            aliUserSmsCodeViewNew.clearText();
        }
        String pageName = getPageName();
        if (TextUtils.isEmpty(this.mMobileNum)) {
            str = "";
        } else {
            str = this.mMobileNum;
        }
        UserTrackAdapter.sendControlUT(pageName, "Button-SendSms", str);
        try {
            onSendSMSAction();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void setSecondTV(TextView textView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe60a25", new Object[]{this, textView});
        } else if (!TextUtils.isEmpty(this.mAreaCode) && !TextUtils.isEmpty(this.mMobileNum)) {
            String str2 = this.mMobileNum;
            if (!TextUtils.equals(this.mAreaCode, "+86") || TextUtils.isEmpty(this.mMobileNum) || this.mMobileNum.length() != 11) {
                str = getString(R.string.aliuser_sms_code_secondary_title, " " + this.mAreaCode + " " + str2);
            } else {
                int i = R.string.aliuser_sms_code_secondary_title;
                str = getString(i, " " + (this.mMobileNum.substring(0, 3) + ' ' + this.mMobileNum.substring(3, 7) + ' ' + this.mMobileNum.substring(7, 11)));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (isChineseLanguage()) {
                try {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#111111")), 7, str.length() - 10, 33);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    public void submitRegisterForm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76722346", new Object[]{this});
            return;
        }
        Properties properties = LoginComponent.getProperties();
        properties.setProperty("type", UTConstant.Args.UT_MOBILE_REG);
        UserTrackAdapter.sendUT(getPageName(), "single_register_commit", "", getRegType(), properties);
        this.mMobileLoginPresenter.buildSMSLoginParam(this.mMobileNum, this.mSmsCodeView.getText(), this.isVoice);
        this.mMobileLoginPresenter.getLoginParam().ext.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
        this.mMobileLoginPresenter.getLoginParam().smsSid = this.mSessionId;
        this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        userMobileLoginPresenter.login(this.mAttachedActivity, userMobileLoginPresenter.getLoginParam(), getUICallback());
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else if (getActivity() != null) {
            Toast.makeText(getActivity(), str, i).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initParams() {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "PARAM_LOGIN_PARAM"
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.mobile.login.newui.NewRegSMSVerification.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0014
            java.lang.String r1 = "5290783d"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r7
            r2.ipc$dispatch(r1, r3)
            return
        L_0x0014:
            r2 = 0
            r7.loginParam = r2
            android.os.Bundle r2 = r7.getArguments()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x008f
            java.lang.String r4 = "mobile_num"
            java.lang.String r4 = r2.getString(r4)     // Catch: all -> 0x008b
            r7.mMobileNum = r4     // Catch: all -> 0x008b
            java.lang.String r4 = "session_id"
            java.lang.String r4 = r2.getString(r4)     // Catch: all -> 0x008b
            java.lang.String r5 = "codeLength"
            java.lang.String r5 = r2.getString(r5)     // Catch: all -> 0x0053
            r7.codeLength = r5     // Catch: all -> 0x0053
            java.lang.String r5 = "region"
            java.lang.String r5 = r2.getString(r5)     // Catch: all -> 0x0053
            r7.regionInfoStr = r5     // Catch: all -> 0x0053
            java.lang.Class<com.ali.user.mobile.model.RegionInfo> r6 = com.ali.user.mobile.model.RegionInfo.class
            java.lang.Object r5 = com.alibaba.fastjson.JSON.parseObject(r5, r6)     // Catch: all -> 0x0053
            com.ali.user.mobile.model.RegionInfo r5 = (com.ali.user.mobile.model.RegionInfo) r5     // Catch: all -> 0x0053
            if (r5 == 0) goto L_0x0056
            java.lang.String r6 = r5.code     // Catch: all -> 0x0053
            r7.mAreaCode = r6     // Catch: all -> 0x0053
            java.lang.String r5 = r5.domain     // Catch: all -> 0x0053
            r7.mCountryCode = r5     // Catch: all -> 0x0053
            goto L_0x0056
        L_0x0053:
            r0 = move-exception
            r3 = r4
            goto L_0x008c
        L_0x0056:
            java.lang.String r5 = "trace_param"
            java.lang.String r5 = r2.getString(r5)     // Catch: all -> 0x0053
            java.lang.Class<com.ali.user.mobile.model.OceanRegisterParam> r6 = com.ali.user.mobile.model.OceanRegisterParam.class
            java.lang.Object r5 = com.alibaba.fastjson.JSON.parseObject(r5, r6)     // Catch: all -> 0x0053
            com.ali.user.mobile.model.OceanRegisterParam r5 = (com.ali.user.mobile.model.OceanRegisterParam) r5     // Catch: all -> 0x0053
            r7.mTraceParam = r5     // Catch: all -> 0x0053
            java.lang.String r5 = "fromOversea"
            boolean r0 = r2.getBoolean(r5, r0)     // Catch: all -> 0x0053
            r7.fromOversea = r0     // Catch: all -> 0x0053
            java.lang.Object r0 = r2.get(r1)     // Catch: all -> 0x0053
            java.lang.String r0 = (java.lang.String) r0     // Catch: all -> 0x0053
            r2.putString(r1, r3)     // Catch: all -> 0x0053
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0053
            if (r1 != 0) goto L_0x0089
            java.lang.Class<com.ali.user.mobile.model.LoginParam> r1 = com.ali.user.mobile.model.LoginParam.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r1)     // Catch: all -> 0x0053
            com.ali.user.mobile.model.LoginParam r0 = (com.ali.user.mobile.model.LoginParam) r0     // Catch: all -> 0x0053
            r7.loginParam = r0     // Catch: all -> 0x0053
        L_0x0089:
            r3 = r4
            goto L_0x008f
        L_0x008b:
            r0 = move-exception
        L_0x008c:
            r0.printStackTrace()
        L_0x008f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0097
            r7.mSessionId = r3
        L_0x0097:
            com.ali.user.mobile.login.presenter.UserMobileLoginPresenter r0 = new com.ali.user.mobile.login.presenter.UserMobileLoginPresenter
            com.ali.user.mobile.model.LoginParam r1 = r7.loginParam
            r0.<init>(r7, r1)
            r7.mMobileLoginPresenter = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.newui.NewRegSMSVerification.initParams():void");
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (UTConstant.Args.UT_MOBILE_REG.equals(getRegType())) {
            i = R.string.aliuser_exit_smscode_hint;
        } else {
            i = R.string.aliuser_exit_emailcode_hint;
        }
        alert("", getString(i), getString(R.string.aliuser_wait_a_moment), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRegSMSVerification.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                } else {
                    NewRegSMSVerification.access$000(NewRegSMSVerification.this, UTConstans.Controls.UT_REG_BACK_BUTTON_CANCEL);
                }
            }
        }, getString(R.string.aliuser_title_back), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.newui.NewRegSMSVerification.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                } else {
                    NewRegSMSVerification.this.backClickedYes();
                }
            }
        });
        return true;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(LoginParam loginParam, RpcResponse rpcResponse) {
        AliUserSmsCodeViewNew aliUserSmsCodeViewNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389eeea9", new Object[]{this, loginParam, rpcResponse});
        } else if (isActive() && (aliUserSmsCodeViewNew = this.mSmsCodeView) != null) {
            aliUserSmsCodeViewNew.clearText();
            if (rpcResponse != null && !TextUtils.isEmpty(rpcResponse.message)) {
                toast(rpcResponse.message, 0);
            }
            Properties properties = LoginComponent.getProperties();
            String pageName = getPageName();
            String str = "";
            if (rpcResponse != null) {
                str = rpcResponse.code + str;
            }
            UserTrackAdapter.sendUT(pageName, UTConstans.CustomEvent.UT_SMS_SEND_FAIL, str, getRegType(), properties);
        }
    }

    public void onSendSMSSuccess(long j, SmsApplyResult smsApplyResult) {
        CountDownButton countDownButton;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e23b80", new Object[]{this, new Long(j), smsApplyResult});
        } else if (isActive() && (countDownButton = this.mSendSMSCodeBtn) != null) {
            countDownButton.startCountDown(j, 1000L);
        }
    }
}
