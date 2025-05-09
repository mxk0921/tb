package com.ali.user.mobile.login.newui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NewMobileHistoryFragment extends NewBaseHistoryFragment implements UserMobileLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipayLoginTV;
    public String mCurrentAccount;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public Button mSendSMSCodeBtn;
    public String mSource;
    public LoginParam loginParam = null;
    public boolean hasSendSms = false;
    public boolean isAutoSendSms = false;
    private boolean isClicked = false;

    static {
        t2o.a(70254626);
        t2o.a(70254806);
    }

    public static /* synthetic */ boolean access$002(NewMobileHistoryFragment newMobileHistoryFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2136f9b", new Object[]{newMobileHistoryFragment, new Boolean(z)})).booleanValue();
        }
        newMobileHistoryFragment.isClicked = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(NewMobileHistoryFragment newMobileHistoryFragment, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/newui/NewMobileHistoryFragment");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        return this.mCurrentSelectedAccount;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        return o78.CHINA_MAINLAND;
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
        return UTConstant.PageName.UT_PAGE_SMS_LOGIN3;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        UserLoginActivity userLoginActivity = this.mUserLoginActivity;
        if (!userLoginActivity.hadReadHistory || (historyAccount = userLoginActivity.mHistoryAccount) == null) {
            return "86";
        }
        String str = historyAccount.mobile;
        if (TextUtils.isEmpty(str) || !str.contains("-")) {
            return "86";
        }
        String[] split = str.split("-");
        if (split.length > 0) {
            return split[0];
        }
        return "86";
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this});
        }
        return new CommonUICallback() { // from class: com.ali.user.mobile.login.newui.NewMobileHistoryFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i == 5008 && map != null) {
                    try {
                        NewMobileHistoryFragment.this.onSendSMSSuccess(((Long) map.get("millSecond")).longValue(), Boolean.parseBoolean("needToast"), ((Integer) map.get("errorCode")).intValue());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        };
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
                        this.hasSendSms = true ^ TextUtils.isEmpty(loginParam.smsSid);
                        this.mSource = this.loginParam.source;
                    }
                }
                this.isAutoSendSms = arguments.getBoolean("autoSendSms");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment, com.ali.user.mobile.login.newui.NewBaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.CommonLoginRegFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.isHistoryMode = true;
        super.initViews(view);
        this.mSendSMSCodeBtn = (Button) view.findViewById(R.id.aliuser_login_btn);
        if (CommonUtil.autoCheckbox()) {
            this.mSendSMSCodeBtn.setText(getResources().getString(R.string.aliuser_signup_verification_getCode2_auto));
        } else {
            this.mSendSMSCodeBtn.setText(getResources().getString(R.string.aliuser_signup_verification_getCode2));
        }
        showBottomAlipay(view);
        showQrLogin(view);
        if (this.hasSendSms) {
            onSendSMSSuccess(59000L, true, 0);
        } else if (this.isAutoSendSms) {
            onSendSMSAction(false);
        }
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mSendSMSCodeBtn);
        }
        setOnClickListener(this.mSendSMSCodeBtn);
        hideInputMethod(this.mSendSMSCodeBtn);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return CommonUtil.isInABTestRegion("resumeToOnekey" + getPageName(), 10000);
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
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
            addControl("inputcode_again");
            if (!this.isClicked || LoginSwitch.getSwitch("ignoreLoginClickCheck", "false")) {
                this.isClicked = true;
                new Handler().postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.newui.NewMobileHistoryFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NewMobileHistoryFragment.access$002(NewMobileHistoryFragment.this, false);
                        }
                    }
                }, 200L);
                addCheckAction(LoginClickAction.ACTION_SEND_SMS);
                return;
            }
            UserTrackAdapter.sendUT("duplicateLoginClick");
            return;
        }
        super.onClick(view);
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
    public void onSMSSendFail(LoginParam loginParam, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("389eeea9", new Object[]{this, loginParam, rpcResponse});
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(LoginParam loginParam, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca12e0c5", new Object[]{this, loginParam, new Long(j), new Boolean(z)});
        } else {
            onSendSMSSuccess(j, z, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.ali.user.mobile.login.newui.NewBaseHistoryFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void switchToHistoryMode(com.ali.user.mobile.rpc.HistoryAccount r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.mobile.login.newui.NewMobileHistoryFragment.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "db829b3"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            super.switchToHistoryMode(r6)
            java.lang.String r2 = r6.mobile
            r5.mCurrentSelectedAccount = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = "-"
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r6.mobile
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x003c
            java.lang.String r6 = r6.mobile
            java.lang.String[] r6 = r6.split(r3)
            int r2 = r6.length
            if (r2 <= r0) goto L_0x003c
            r0 = r6[r0]
            r5.mCurrentSelectedAccount = r0
            r6 = r6[r1]
            goto L_0x003e
        L_0x003c:
            java.lang.String r6 = ""
        L_0x003e:
            java.lang.String r0 = "hiddenOversea"
            r1 = 10000(0x2710, float:1.4013E-41)
            boolean r0 = com.ali.user.mobile.utils.CommonUtil.isInABTestRegion(r0, r1)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r5.mCurrentSelectedAccount     // Catch: all -> 0x0065
            java.lang.String r0 = com.ali.user.mobile.utils.StringUtil.showSensitiveFieldForMobileLocal(r6, r0)     // Catch: all -> 0x0065
            android.widget.TextView r1 = r5.mTitleView     // Catch: all -> 0x0065
            if (r1 == 0) goto L_0x0082
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0065
            if (r1 != 0) goto L_0x0082
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0065
            if (r1 == 0) goto L_0x0067
            android.widget.TextView r6 = r5.mTitleView     // Catch: all -> 0x0065
            r6.setText(r0)     // Catch: all -> 0x0065
            goto L_0x0082
        L_0x0065:
            r6 = move-exception
            goto L_0x007f
        L_0x0067:
            android.widget.TextView r1 = r5.mTitleView     // Catch: all -> 0x0065
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0065
            r2.<init>()     // Catch: all -> 0x0065
            r2.append(r6)     // Catch: all -> 0x0065
            r2.append(r3)     // Catch: all -> 0x0065
            r2.append(r0)     // Catch: all -> 0x0065
            java.lang.String r6 = r2.toString()     // Catch: all -> 0x0065
            r1.setText(r6)     // Catch: all -> 0x0065
            goto L_0x0082
        L_0x007f:
            r6.printStackTrace()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.newui.NewMobileHistoryFragment.switchToHistoryMode(com.ali.user.mobile.rpc.HistoryAccount):void");
    }

    public void onSendSMSSuccess(long j, boolean z, int i) {
        UserMobileLoginPresenter userMobileLoginPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65bab9b", new Object[]{this, new Long(j), new Boolean(z), new Integer(i)});
        } else if (this.mUserLoginActivity != null && (userMobileLoginPresenter = this.mMobileLoginPresenter) != null && userMobileLoginPresenter.mLoginParam != null) {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mMobileLoginPresenter.mLoginParam));
            intent.putExtra("havanaId", this.mMobileLoginPresenter.mLoginParam.hid);
            if (i > 0) {
                intent.putExtra("errorCode", i);
            }
            this.mUserLoginActivity.goToSMSVerificationPage(intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onSendSMSAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f9fd85", new Object[]{this, new Boolean(z)});
            return;
        }
        this.interact = true;
        this.mCurrentAccount = getAccountName();
        Properties properties = new Properties();
        properties.setProperty("result", "CheckPass");
        UserTrackAdapter.sendUT(getPageName(), "CheckPhoneResult", null, null, properties);
        this.mMobileLoginPresenter.buildSMSLoginParam(this.mCurrentAccount, null, false);
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
        this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, getPageName());
        this.mMobileLoginPresenter.getLoginParam().resendAlert = this.mUserLoginActivity.isNeedSMSCheck();
        this.mMobileLoginPresenter.getLoginParam().hid = this.historyHid;
        if (this.mUserLoginActivity != null) {
            this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
        }
        this.mMobileLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
        this.mMobileLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.SMS_LOGIN, hashMap);
        AppMonitorAdapter.commitSuccess("Page_Member_Login", "loginMonitorPoint", "action=smsAction;biz=smsLogin;page=" + getPageName());
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        userMobileLoginPresenter.sendSMS(this.mAttachedActivity, userMobileLoginPresenter.getLoginParam(), getUICallback());
    }
}
