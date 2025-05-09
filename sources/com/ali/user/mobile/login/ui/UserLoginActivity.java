package com.ali.user.mobile.login.ui;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.StrategyHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.newui.NewAlipayFragment;
import com.ali.user.mobile.login.newui.NewAlipayHistoryFragment;
import com.ali.user.mobile.login.newui.NewAutoLoginFragment;
import com.ali.user.mobile.login.newui.NewFaceLoginFragment;
import com.ali.user.mobile.login.newui.NewFingerLoginFragment;
import com.ali.user.mobile.login.newui.NewMobileHistoryFragment;
import com.ali.user.mobile.login.newui.NewOneKeyFragment;
import com.ali.user.mobile.login.newui.NewOneKeyHistoryFragment;
import com.ali.user.mobile.login.newui.NewPwdLoginFragment;
import com.ali.user.mobile.login.newui.NewQrLoginFragment;
import com.ali.user.mobile.login.newui.NewRecommendLoginFragment;
import com.ali.user.mobile.login.presenter.AppLaunchDataPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.ui.oversea.OverseaLoginFragment;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.acq;
import tb.t2o;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UserLoginActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_OVERSEA_BG = "https://gw.alicdn.com/imgextra/i3/O1CN01djaIJE1fHoALU1jpR_!!6000000003982-2-tps-1125-554.png";
    private static final String MS_OVERSEA_BG = "https://gw.alicdn.com/imgextra/i3/O1CN01HI4vTS1kA5a4hKRAE_!!6000000004642-2-tps-1125-554.png";
    private static final String RU_OVERSEA_BG = "https://gw.alicdn.com/imgextra/i4/O1CN01LGYi2g1NnGHg6XaV2_!!6000000001614-2-tps-1125-554.png";
    private static final String TAG = "login.UserLoginActivity";
    private static final String TH_OVERSEA_BG = "https://gw.alicdn.com/imgextra/i3/O1CN01y0oPq51X0OBdDRogT_!!6000000002861-2-tps-2250-1108.png";
    public String cacheMaskMobile;
    public AppLaunchInfoResponseData fireAppLaunchRes;
    public boolean isPad;
    public View mBackBtn;
    public String mBiometricToken;
    public FragmentManager mFragmentManager;
    public View mHelpTV;
    public HistoryAccount mHistoryAccount;
    public LoginHistory mLoginHistory;
    public View mMainLL;
    public boolean mOpenGuide;
    public SessionList mSessionList;
    public String mSource;
    public View mTopRectangle;
    public String otherLoginType;
    public long startOpenTime;
    public long startTime;
    public boolean useNewPage;
    public String mCurrentFragmentTag = FragmentConstant.PWD_LOGIN_FRAGMENT_TAG;
    public boolean hadReadHistory = false;
    public boolean mUserOpenFaceLogin = false;
    public boolean mAlipayInstall = false;
    public boolean mShowRegTV = true;
    public boolean isFaceLoginEnvEnable = false;
    public boolean isFaceLoginActivate = false;
    public boolean isMobileAvailable = true;
    public boolean isFromAddAccount = false;
    private boolean isOpenMobileLoginPage = false;
    private boolean isOpenUserLoginPage = false;
    public boolean needSMSCheck = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class NewLoginPreCheckTask extends AsyncTask<Object, Void, LoginHistory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<UserLoginActivity> activityReference;
        private Intent mIntent;

        static {
            t2o.a(70254804);
        }

        public NewLoginPreCheckTask(UserLoginActivity userLoginActivity, Intent intent) {
            this.activityReference = new WeakReference<>(userLoginActivity);
            this.mIntent = intent;
        }

        public static /* synthetic */ Object ipc$super(NewLoginPreCheckTask newLoginPreCheckTask, String str, Object... objArr) {
            if (str.hashCode() == -2026216808) {
                super.onPreExecute();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/UserLoginActivity$NewLoginPreCheckTask");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873a6298", new Object[]{this});
                return;
            }
            super.onPreExecute();
            UserLoginActivity userLoginActivity = this.activityReference.get();
            if (userLoginActivity != null && !userLoginActivity.isFinishing()) {
                userLoginActivity.showProgress("");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        public LoginHistory doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginHistory) ipChange.ipc$dispatch("1b7d89dc", new Object[]{this, objArr});
            }
            UserLoginActivity userLoginActivity = this.activityReference.get();
            if (userLoginActivity == null || userLoginActivity.isFinishing()) {
                return null;
            }
            LoginHistory access$000 = UserLoginActivity.access$000(userLoginActivity, this.mIntent);
            userLoginActivity.mLoginHistory = access$000;
            userLoginActivity.startOpenTime = System.currentTimeMillis();
            userLoginActivity.cacheMaskMobile = NetworkUtil.getMaskMobile(LoginSwitch.getSwitch("login_bar_activity", "true"));
            try {
                userLoginActivity.mAlipayInstall = AlipayAuth.isSupportAlipay(userLoginActivity);
                userLoginActivity.getOpenPageStrategy(this.mIntent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return access$000;
        }

        public void onPostExecute(LoginHistory loginHistory) {
            boolean z;
            Throwable th;
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5e83d4f", new Object[]{this, loginHistory});
                return;
            }
            UserLoginActivity userLoginActivity = this.activityReference.get();
            if (userLoginActivity != null && !userLoginActivity.isFinishing()) {
                userLoginActivity.dismissProgressDialog();
                try {
                    z = this.mIntent.getBooleanExtra(LoginConstant.FORCE_NORMAL_MODE, false);
                    try {
                        z2 = this.mIntent.getBooleanExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, false);
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        if (userLoginActivity.supportMultiLogoutList(loginHistory)) {
                        }
                        LoginTLogAdapter.e(UserLoginActivity.TAG, "openFragmentByAppLaunch");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
                if ((userLoginActivity.supportMultiLogoutList(loginHistory) || z2) && !z && userLoginActivity.openFragmentByAppLaunch(this.mIntent)) {
                    LoginTLogAdapter.e(UserLoginActivity.TAG, "openFragmentByAppLaunch");
                } else {
                    UserLoginActivity.access$100(userLoginActivity, this.mIntent);
                }
            }
        }
    }

    static {
        t2o.a(70254801);
    }

    public static /* synthetic */ LoginHistory access$000(UserLoginActivity userLoginActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("aab58045", new Object[]{userLoginActivity, intent});
        }
        return userLoginActivity.getLoginHistory(intent);
    }

    public static /* synthetic */ void access$100(UserLoginActivity userLoginActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988db764", new Object[]{userLoginActivity, intent});
        } else {
            userLoginActivity.openFragmentByIntent(intent);
        }
    }

    public static Intent getCallingIntent(Context context, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e96d5312", new Object[]{context, str, new Boolean(z), new Boolean(z2)});
        }
        Intent intent = new Intent(context, UserLoginActivity.class);
        intent.putExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, z);
        intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, str);
        return intent;
    }

    private String getEnableOneKey(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b42cb32a", new Object[]{this, intent});
        }
        if (LoginSwitch.getSwitch("useCacheMask", "true")) {
            return this.cacheMaskMobile;
        }
        if (intent == null) {
            return "";
        }
        try {
            return intent.getStringExtra("number");
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private LoginHistory getLoginHistory(Intent intent) {
        String stringExtra;
        LoginParam loginParam;
        LoginHistory loginHistory;
        HistoryAccount historyAccount;
        List<HistoryAccount> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("af07eb83", new Object[]{this, intent});
        }
        if (this.isFromAddAccount) {
            return null;
        }
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                loginParam = (LoginParam) JSON.parseObject(stringExtra, LoginParam.class);
                loginHistory = SecurityGuardManagerWraper.getLoginHistory();
                this.mSessionList = SecurityGuardManagerWraper.getSessionListFromFile();
                this.hadReadHistory = true;
                if (loginHistory != null || (list = loginHistory.accountHistory) == null || list.size() <= 0) {
                    this.mHistoryAccount = null;
                } else {
                    if (loginParam != null) {
                        long j = loginParam.hid;
                        if (j > 0) {
                            this.mHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(j);
                        }
                    }
                    int i = loginHistory.index;
                    if (i < 0 || i >= loginHistory.accountHistory.size()) {
                        i = loginHistory.accountHistory.size() - 1;
                    }
                    this.mHistoryAccount = loginHistory.accountHistory.get(i);
                }
                historyAccount = this.mHistoryAccount;
                if (historyAccount != null && !TextUtils.isEmpty(historyAccount.biometricId)) {
                    this.mBiometricToken = SecurityGuardManagerWraper.getFingerValue(this.mHistoryAccount.biometricId);
                }
                return loginHistory;
            }
        }
        loginParam = null;
        loginHistory = SecurityGuardManagerWraper.getLoginHistory();
        this.mSessionList = SecurityGuardManagerWraper.getSessionListFromFile();
        this.hadReadHistory = true;
        if (loginHistory != null) {
        }
        this.mHistoryAccount = null;
        historyAccount = this.mHistoryAccount;
        if (historyAccount != null) {
            this.mBiometricToken = SecurityGuardManagerWraper.getFingerValue(this.mHistoryAccount.biometricId);
        }
        return loginHistory;
    }

    private String getMobileFromHistory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f37b6f67", new Object[]{this}) : getMobileFromHistory(this.mHistoryAccount);
    }

    public static String getRegBgImage(AppLaunchInfoResponseData appLaunchInfoResponseData) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d939af7", new Object[]{appLaunchInfoResponseData});
        }
        if (appLaunchInfoResponseData == null || (t = appLaunchInfoResponseData.returnValue) == 0 || ((AppLaunchInfo) t).loginPageInfo == null) {
            return null;
        }
        return ((AppLaunchInfo) t).loginPageInfo.benefitImage;
    }

    private void gotoGuideFragment(Intent intent, LoginApprearanceExtensions loginApprearanceExtensions) {
        try {
            addFragment(intent, (Fragment) loginApprearanceExtensions.getFullyCustomizeGuideFragment().newInstance(), FragmentConstant.GUIDE_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(UserLoginActivity userLoginActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -3136315:
                super.initViews();
                return null;
            case 42701466:
                return new Integer(super.getLayout());
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/UserLoginActivity");
        }
    }

    public static boolean isCompareSuccess(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6fec147", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() <= 7) {
            return false;
        }
        return str.endsWith(str2.substring(str2.lastIndexOf("*") + 1));
    }

    private void sendCancelBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330477c6", new Object[]{this});
        } else {
            BroadCastHelper.sendLocalBroadCast(new Intent(LoginConstant.RESET_LOGIN_STATUS));
        }
    }

    public static boolean supportGoogleFB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("446c742f", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.taobao.android.sns4android.SNSOverseaAuth");
            Class.forName("com.google.android.gms.auth.api.Auth");
            Class.forName("com.facebook.FacebookSdk");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void addFragment(Intent intent, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef74eb57", new Object[]{this, intent, fragment, str});
            return;
        }
        hideAllFragment();
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            this.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.mFragmentManager.beginTransaction().add(R.id.aliuser_content_frame, fragment, str).commitAllowingStateLoss();
        this.mFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss();
        this.mCurrentFragmentTag = str;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void callPageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d40c1bd", new Object[]{this});
        } else {
            UserTrackAdapter.pageDisAppear(this);
        }
    }

    public boolean displayOversea() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9240cfe4", new Object[]{this})).booleanValue() : displayOversea(this.fireAppLaunchRes);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void finishCurrentAndNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76091cc1", new Object[]{this});
            return;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && !fragmentManager.isDestroyed()) {
            LoginApprearanceExtensions appreanceExtentions = AliUserLogin.getAppreanceExtentions();
            if (appreanceExtentions == null || appreanceExtentions.getFullyCustomizeGuideFragment() == null || !this.supportTaobaoOrAlipay || TextUtils.equals(this.mCurrentFragmentTag, FragmentConstant.GUIDE_FRAGMENT_TAG) || !this.mOpenGuide) {
                Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(this.mCurrentFragmentTag);
                if ((findFragmentByTag instanceof BaseFragment) && ((BaseFragment) findFragmentByTag).onBackPressed()) {
                    return;
                }
            } else {
                gotoGuideFragment(null, AliUserLogin.getAppreanceExtentions());
                return;
            }
        }
        doFinishThing();
    }

    public void fragmentOnActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba18d6df", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(this.mCurrentFragmentTag);
        if (findFragmentByTag != null && findFragmentByTag.isVisible()) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }

    public Class<?> getAlipayFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b42d02e4", new Object[]{this});
        }
        return NewAlipayFragment.class;
    }

    public Class<?> getAlipayHistoryFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("290d46d8", new Object[]{this});
        }
        return NewAlipayHistoryFragment.class;
    }

    public Class<?> getFaceLoginFragment(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("bb73f3b1", new Object[]{this, loginApprearanceExtensions});
        }
        return NewFaceLoginFragment.class;
    }

    public Class<?> getFingerFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a8a4783", new Object[]{this});
        }
        return NewFingerLoginFragment.class;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (BaseActivity.isChinese) {
            return super.getLayout();
        }
        this.needAdjustToolbar = true;
        return R.layout.aliuser_activity_email;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_activity_frame_content;
    }

    public Fragment getMobileFragment(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("20f9ec4c", new Object[]{this, loginApprearanceExtensions});
        }
        return new NewMobileHistoryFragment();
    }

    public void getOpenPageStrategy(Intent intent) {
        LoginHistory loginHistory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf19e46", new Object[]{this, intent});
            return;
        }
        String stringExtra = intent.getStringExtra(LoginConstant.TARGET_HID);
        HistoryAccount historyAccount = this.mHistoryAccount;
        if (!TextUtils.isEmpty(stringExtra) && (loginHistory = this.mLoginHistory) != null) {
            historyAccount = SecurityGuardManagerWraper.getTargetAccount(loginHistory, stringExtra);
            this.mHistoryAccount = historyAccount;
        }
        getRecommendByID(historyAccount);
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "login";
    }

    public Properties getProperty(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("6e56c23", new Object[]{this, intent});
        }
        Properties properties = new Properties();
        if (intent == null) {
            return properties;
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("scene"))) {
            properties.put("pn_scene", intent.getStringExtra("scene"));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("source"))) {
            properties.put("source", intent.getStringExtra("source"));
        }
        return properties;
    }

    public Fragment getUserLoginFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c5f48b8f", new Object[]{this});
        }
        return new NewPwdLoginFragment();
    }

    public void goAlipayFragment(Intent intent) {
        try {
            Fragment fragment = (Fragment) getAlipayFragment().newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.ALIPAY_FRAGMENT_TAG);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void goAlipayHistory(Intent intent) {
        try {
            Fragment fragment = (Fragment) getAlipayHistoryFragment().newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.ALIPAY_HISTORY_FRAGMENT_TAG);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void goFaceFragment(Intent intent) {
        try {
            Fragment fragment = (Fragment) getFaceLoginFragment(AliUserLogin.getAppreanceExtentions()).newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.FACE_LOGIN_FRAGMENT_TAG);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void goPwdOrSMSFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db21c175", new Object[]{this, intent});
            return;
        }
        HistoryAccount historyAccount = this.mHistoryAccount;
        if (historyAccount == null) {
            switchToRecommendLogin(intent);
        } else if (this.isOpenMobileLoginPage) {
            if (TextUtils.isEmpty(historyAccount.loginPhone)) {
                intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
            }
            gotoHistorySmsLoginPage(intent);
        } else if (this.isOpenUserLoginPage) {
            if (historyAccount.hasPwd != 1) {
                intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
            }
            gotoPwdLoginFragment(intent);
        } else if (DataProviderFactory.getDataProvider().alwaysSMSLoginPriority()) {
            gotoMobileLoginFragment(intent);
        } else if (TextUtils.equals(this.mHistoryAccount.loginType, LoginType.ServerLoginType.SMSLogin.getType())) {
            gotoHistorySmsLoginPage(intent);
        } else if (TextUtils.equals(this.mHistoryAccount.loginType, LoginType.ServerLoginType.PasswordLogin.getType())) {
            if (this.mHistoryAccount.hasPwd != 1) {
                intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
            }
            gotoPwdLoginFragment(intent);
        } else if (!DataProviderFactory.getDataProvider().isSmsLoginPriority() || TextUtils.isEmpty(this.mHistoryAccount.loginPhone)) {
            int i = this.mHistoryAccount.hasPwd;
            if (i == 0) {
                gotoMobileLoginFragment(intent);
                return;
            }
            if (i != 1) {
                intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
            }
            gotoPwdLoginFragment(intent);
        } else {
            gotoHistorySmsLoginPage(intent);
        }
    }

    public void goToSMSVerificationPage(Intent intent) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
            return;
        }
        NavigatorManager instance = NavigatorManager.getInstance();
        Context applicationContext = getApplicationContext();
        if (intent == null) {
            bundle = new Bundle();
        } else {
            bundle = intent.getExtras();
        }
        instance.navToSMSCodePage(applicationContext, bundle);
    }

    public void gotoFastLoginFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914786fe", new Object[]{this, intent});
            return;
        }
        try {
            NewAutoLoginFragment newAutoLoginFragment = new NewAutoLoginFragment();
            if (intent != null) {
                newAutoLoginFragment.setArguments(intent.getExtras());
            }
            addFragment(intent, newAutoLoginFragment, FragmentConstant.FAST_FRAGMENT);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void gotoFingerPage(Intent intent) {
        try {
            Fragment fragment = (Fragment) getFingerFragment().newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.FINGER_FRAGMENT);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void gotoHistorySmsLoginPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c07f7d4", new Object[]{this, intent});
            return;
        }
        try {
            if (ServiceFactory.getService(NumberAuthService.class) != null) {
                String mobileFromHistory = getMobileFromHistory();
                if (!TextUtils.isEmpty(mobileFromHistory)) {
                    String str = this.cacheMaskMobile;
                    if (!TextUtils.isEmpty(str) && str.length() > 7 && isCompareSuccess(mobileFromHistory, str)) {
                        gotoOneKeyHistoryLoginFragment(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        gotoMobileLoginFragment(intent);
    }

    public void gotoOneKeyHistoryLoginFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d9cfe5", new Object[]{this, intent});
            return;
        }
        NewOneKeyHistoryFragment newOneKeyHistoryFragment = new NewOneKeyHistoryFragment();
        newOneKeyHistoryFragment.setArguments(intent.getExtras());
        UserTrackAdapter.sendUT("history_sim", getProperty(intent));
        addFragment(intent, newOneKeyHistoryFragment, FragmentConstant.ONE_KEY_LOGIN_HISTORY_FRAGMENT_TAG);
    }

    public void gotoOneKeyLoginFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6139bea1", new Object[]{this, intent});
            return;
        }
        try {
            NewOneKeyFragment newOneKeyFragment = new NewOneKeyFragment();
            newOneKeyFragment.setArguments(intent.getExtras());
            UserTrackAdapter.sendUT("sim", getProperty(intent));
            addFragment(intent, newOneKeyFragment, FragmentConstant.ONE_KEY_LOGIN_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean gotoQrcodeFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c94aec09", new Object[]{this, intent})).booleanValue();
        }
        try {
            NewQrLoginFragment newQrLoginFragment = new NewQrLoginFragment();
            newQrLoginFragment.setArguments(intent.getExtras());
            addFragment(intent, newQrLoginFragment, FragmentConstant.QRCODE_LOGIN_FRAGMENT_TAG);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void hideAllFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32c9176", new Object[]{this});
            return;
        }
        for (String str : FragmentConstant.getFragmentTagList()) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
            if (findFragmentByTag != null) {
                this.mFragmentManager.beginTransaction().hide(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }

    public boolean historyMatchMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caa63a28", new Object[]{this})).booleanValue();
        }
        if (this.mHistoryAccount == null) {
            return false;
        }
        return isCompareSuccess(getMobileFromHistory(), this.cacheMaskMobile);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.initViews();
        this.mMainLL = findViewById(R.id.aliuser_main_content);
        try {
            if (getSupportActionBar() != null) {
                if (AliUserLogin.getAppreanceExtentions() != null && !AliUserLogin.getAppreanceExtentions().isNeedToolbar()) {
                    getSupportActionBar().hide();
                }
                getSupportActionBar().setTitle("");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        openFragmentByConfig(getIntent());
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean isShowNavIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ad8500", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        fragmentOnActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        TBS.Page.buttonClicked("Button_back");
        finishCurrentAndNotify();
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            LoginStatus.isLoginActResume = false;
            sendCancelBroadcast();
            this.mFragmentManager = null;
            this.hadReadHistory = false;
            this.mHistoryAccount = null;
            super.onDestroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        initParam(intent);
        openFragmentByConfig(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            callPageDisAppear();
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LoginStatus.isLoginActResume = true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        try {
            super.onStart();
        } catch (Throwable th) {
            th.printStackTrace();
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        try {
            super.onStop();
            LoginStatus.isLoginActResume = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_OPEN_ACTION));
        CoordinatorWrapper.executeSafely(new NewLoginPreCheckTask(this, intent), new Object[0]);
    }

    public void openLoginPageFromQrLogin(Intent intent) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ccab4", new Object[]{this, intent});
            return;
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.fireAppLaunchRes;
        if (!(appLaunchInfoResponseData == null || (t = appLaunchInfoResponseData.returnValue) == 0 || ((AppLaunchInfo) t).sortedRecommendLoginTypes == null || ((AppLaunchInfo) t).sortedRecommendLoginTypes.size() < 2)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes.size(); i++) {
                arrayList.add(((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes.get(i));
            }
            if (arrayList.size() > 0 && openRecommendPage(intent, arrayList)) {
                LoginTLogAdapter.e(TAG, "QrLoginOpenOther by server recommendList");
                return;
            }
        }
        openFragmentByIntent(intent);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }

    public void setNeedSMSCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4af9826", new Object[]{this, new Boolean(z)});
        } else {
            this.needSMSCheck = z;
        }
    }

    public void setTranslucentStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071d070", new Object[]{this});
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    public boolean shouldShowLoginBenefit() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4f839e9", new Object[]{this})).booleanValue();
        }
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            return false;
        }
        if (LoginStatus.mockCoupon) {
            return true;
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.fireAppLaunchRes;
        if (appLaunchInfoResponseData == null || (t = appLaunchInfoResponseData.returnValue) == 0 || ((AppLaunchInfo) t).loginPageInfo == null || TextUtils.isEmpty(((AppLaunchInfo) t).loginPageInfo.benefitTitle)) {
            return false;
        }
        return true;
    }

    public boolean supportPad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31b334cf", new Object[]{this})).booleanValue();
        }
        if (!this.isPad || !DataProviderFactory.getDataProvider().supportQrLogin()) {
            return false;
        }
        return true;
    }

    public void switchToTargetAccountLogin(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265a2de0", new Object[]{this, intent});
        } else {
            CoordinatorWrapper.executeSafely(new NewLoginPreCheckTask(this, intent), new Object[0]);
        }
    }

    public static boolean displayOversea(AppLaunchInfoResponseData appLaunchInfoResponseData) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832cc1ac", new Object[]{appLaunchInfoResponseData})).booleanValue();
        }
        if (LoginStatus.forceOversea || LoginSwitch.getSwitch("forceOversea", "false")) {
            return true;
        }
        boolean isForigenLocation = DataProviderFactory.getDataProvider().isForigenLocation();
        if (!BaseActivity.isChinese) {
            return true;
        }
        return isForigenLocation && appLaunchInfoResponseData != null && (t = appLaunchInfoResponseData.returnValue) != 0 && ((AppLaunchInfo) t).displayOverseaEntrance;
    }

    public static String getMobileFromHistory(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dbc08c3", new Object[]{historyAccount});
        }
        if (historyAccount == null) {
            return "";
        }
        return DataProviderFactory.getDataProvider().historySecurityMobileCanLogin() ? historyAccount.mobile : historyAccount.loginPhone;
    }

    private void getRecommendByID(HistoryAccount historyAccount) {
        AppLaunchInfo appLaunchInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca4cc83", new Object[]{this, historyAccount});
            return;
        }
        AppLaunchInfoResponseData appLaunchInfoByFileName = AppLaunchDataPresenter.getAppLaunchInfoByFileName(this, historyAccount, true);
        this.fireAppLaunchRes = appLaunchInfoByFileName;
        if (appLaunchInfoByFileName != null && (appLaunchInfo = (AppLaunchInfo) appLaunchInfoByFileName.returnValue) != null) {
            RegionInfo currentRegion = DataProviderFactory.getDataProvider().getCurrentRegion();
            if (!TextUtils.isEmpty(appLaunchInfo.countryCode)) {
                currentRegion.domain = appLaunchInfo.countryCode;
            }
            if (!TextUtils.isEmpty(appLaunchInfo.phoneCode)) {
                currentRegion.code = appLaunchInfo.phoneCode;
            }
            if (!TextUtils.isEmpty(appLaunchInfo.checkPattern)) {
                currentRegion.checkPattern = appLaunchInfo.checkPattern;
            }
            if (LoginSwitch.getSwitch("openProtocol", "true")) {
                int i = appLaunchInfo.unionRegType;
                if (i == 0) {
                    LoginStatus.degradeHegui = CommonUtil.unionReg();
                } else {
                    LoginStatus.degradeHegui = i;
                }
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.useNewPage = true;
        LoginStatus.useNewPage = true;
        initParam(getIntent());
        UserTrackAdapter.sendUT("openLogin", getProperty(getIntent()));
        super.onCreate(bundle);
    }

    public void setBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mTopRectangle = findViewById(R.id.aliuser_top_rectangle);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.setStatusBarColor(0);
        if (z) {
            View view = this.mTopRectangle;
            if (view != null) {
                view.setVisibility(0);
                this.mTopRectangle.setBackgroundColor(getResources().getColor(R.color.aliuser_oversea_color));
            }
            setTranslucentStatus();
            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }
            View findViewById = findViewById(R.id.aliuser_custom_back);
            this.mBackBtn = findViewById;
            if (findViewById != null) {
                ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.UserLoginActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            UserLoginActivity.this.onBackPressed();
                        }
                    }
                });
            }
            View findViewById2 = findViewById(R.id.aliuser_custom_help);
            this.mHelpTV = findViewById2;
            if (findViewById2 != null) {
                ViewProxy.setOnClickListener(findViewById2, new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.UserLoginActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            AliUserRegisterActivity.goRegHelp(UserLoginActivity.this);
                        }
                    }
                });
            }
            String country = LanguageUtil.getCountry();
            String regBgImage = getRegBgImage(this.fireAppLaunchRes);
            if (TextUtils.isEmpty(regBgImage) || !LoginSwitch.getSwitch("use_server_image", "true")) {
                String defaultBg = getDefaultBg();
                ImageUtil.updateBackground(this.mTopRectangle, LoginSwitch.getConfig("oversea_bg_" + country, defaultBg));
                return;
            }
            ImageUtil.updateBackground(this.mTopRectangle, regBgImage);
            return;
        }
        View view2 = this.mTopRectangle;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().show();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r2.equals("ms") == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getDefaultBg() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.ali.user.mobile.login.ui.UserLoginActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "c0fe9949"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0015:
            java.lang.String r2 = com.ali.user.mobile.utils.LanguageUtil.getLanguage()
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case 3494: goto L_0x003e;
                case 3651: goto L_0x0032;
                case 3700: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x0048
        L_0x0026:
            java.lang.String r0 = "th"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0030
            goto L_0x0024
        L_0x0030:
            r0 = 2
            goto L_0x0048
        L_0x0032:
            java.lang.String r0 = "ru"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x0024
        L_0x003c:
            r0 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r1 = "ms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0024
        L_0x0048:
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0053;
                case 2: goto L_0x004f;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.String r0 = "https://gw.alicdn.com/imgextra/i3/O1CN01djaIJE1fHoALU1jpR_!!6000000003982-2-tps-1125-554.png"
            return r0
        L_0x004f:
            java.lang.String r0 = "https://gw.alicdn.com/imgextra/i3/O1CN01y0oPq51X0OBdDRogT_!!6000000002861-2-tps-2250-1108.png"
            return r0
        L_0x0053:
            java.lang.String r0 = "https://gw.alicdn.com/imgextra/i4/O1CN01LGYi2g1NnGHg6XaV2_!!6000000001614-2-tps-1125-554.png"
            return r0
        L_0x0057:
            java.lang.String r0 = "https://gw.alicdn.com/imgextra/i3/O1CN01HI4vTS1kA5a4hKRAE_!!6000000004642-2-tps-1125-554.png"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.getDefaultBg():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: all -> 0x0062, TryCatch #5 {all -> 0x0062, blocks: (B:15:0x0043, B:16:0x0046, B:18:0x0052, B:23:0x005e, B:27:0x0065, B:29:0x006b, B:31:0x006f, B:34:0x0082, B:59:0x00ed, B:61:0x010c, B:63:0x0116, B:69:0x0122, B:71:0x0128, B:72:0x012e, B:75:0x0138, B:77:0x013c, B:79:0x0142, B:80:0x0146, B:82:0x0156, B:84:0x015c, B:87:0x0162, B:89:0x0166, B:91:0x016a, B:93:0x0170, B:95:0x0174, B:81:0x014a, B:36:0x0088, B:38:0x008e, B:41:0x0096, B:43:0x009c, B:45:0x00a2, B:47:0x00ae, B:49:0x00b2, B:51:0x00ba, B:53:0x00c5, B:55:0x00cd, B:57:0x00d3), top: B:105:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: all -> 0x0062, TryCatch #5 {all -> 0x0062, blocks: (B:15:0x0043, B:16:0x0046, B:18:0x0052, B:23:0x005e, B:27:0x0065, B:29:0x006b, B:31:0x006f, B:34:0x0082, B:59:0x00ed, B:61:0x010c, B:63:0x0116, B:69:0x0122, B:71:0x0128, B:72:0x012e, B:75:0x0138, B:77:0x013c, B:79:0x0142, B:80:0x0146, B:82:0x0156, B:84:0x015c, B:87:0x0162, B:89:0x0166, B:91:0x016a, B:93:0x0170, B:95:0x0174, B:81:0x014a, B:36:0x0088, B:38:0x008e, B:41:0x0096, B:43:0x009c, B:45:0x00a2, B:47:0x00ae, B:49:0x00b2, B:51:0x00ba, B:53:0x00c5, B:55:0x00cd, B:57:0x00d3), top: B:105:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x0062, TryCatch #5 {all -> 0x0062, blocks: (B:15:0x0043, B:16:0x0046, B:18:0x0052, B:23:0x005e, B:27:0x0065, B:29:0x006b, B:31:0x006f, B:34:0x0082, B:59:0x00ed, B:61:0x010c, B:63:0x0116, B:69:0x0122, B:71:0x0128, B:72:0x012e, B:75:0x0138, B:77:0x013c, B:79:0x0142, B:80:0x0146, B:82:0x0156, B:84:0x015c, B:87:0x0162, B:89:0x0166, B:91:0x016a, B:93:0x0170, B:95:0x0174, B:81:0x014a, B:36:0x0088, B:38:0x008e, B:41:0x0096, B:43:0x009c, B:45:0x00a2, B:47:0x00ae, B:49:0x00b2, B:51:0x00ba, B:53:0x00c5, B:55:0x00cd, B:57:0x00d3), top: B:105:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openFragmentByIntent(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.openFragmentByIntent(android.content.Intent):void");
    }

    public boolean cacheOneKeyAndCompareSuccess(Intent intent) {
        Map<String, String> authInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c09b262", new Object[]{this, intent})).booleanValue();
        }
        if (TextUtils.isEmpty(getEnableOneKey(intent))) {
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_HISTORY_NOT_INTENT_EMPTY);
            return false;
        }
        try {
            authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "HistoryCompareFailed,t=" + th.getMessage());
            try {
                Properties properties = new Properties();
                properties.put("exception", th.getMessage());
                UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_HISTORY_EXCEPTION_FAILED, properties);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (!(authInfoMap == null || authInfoMap.size() == 0)) {
            String str = authInfoMap.get("number");
            if (!TextUtils.isEmpty(str) && str.length() > 7) {
                String substring = str.substring(str.lastIndexOf("*") + 1);
                if (!TextUtils.isEmpty(this.mHistoryAccount.loginPhone) && this.mHistoryAccount.loginPhone.endsWith(substring)) {
                    return true;
                }
                if (!TextUtils.isEmpty(this.mHistoryAccount.mobile) && this.mHistoryAccount.mobile.endsWith(substring)) {
                    return true;
                }
                Properties properties2 = new Properties();
                properties2.put("mask", str);
                HistoryAccount historyAccount = this.mHistoryAccount;
                if (historyAccount != null) {
                    String str2 = "";
                    properties2.put("historyPhone", TextUtils.isEmpty(historyAccount.loginPhone) ? str2 : this.mHistoryAccount.loginPhone);
                    if (!TextUtils.isEmpty(this.mHistoryAccount.mobile)) {
                        str2 = this.mHistoryAccount.mobile;
                    }
                    properties2.put("historyMobile", str2);
                }
                UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_HISTORY_COMPARE_FAILED, properties2);
                LoginTLogAdapter.e(TAG, "compareFailed");
            }
            return false;
        }
        UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_HISTORY_NO_CACHE);
        return false;
    }

    public boolean canFastLogin(Intent intent) {
        boolean z;
        HistoryAccount historyAccount;
        SessionList sessionList;
        List<SessionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790a445", new Object[]{this, intent})).booleanValue();
        }
        try {
            z = intent.getBooleanExtra(LoginConstant.FORCE_NOT_FAST, false);
        } catch (Throwable th) {
            th.printStackTrace();
            z = false;
        }
        if (CommonUtil.isInABTestRegion("supportFastLogin2", 10000) && !z && (historyAccount = this.mHistoryAccount) != null && historyAccount.userId > 0 && (sessionList = this.mSessionList) != null && (list = sessionList.sessionModels) != null && !list.isEmpty()) {
            String autoLoginTokenFromList = SecurityGuardManagerWraper.getAutoLoginTokenFromList(this.mSessionList, String.valueOf(this.mHistoryAccount.userId));
            if (!TextUtils.isEmpty(autoLoginTokenFromList) && TextUtils.equals(autoLoginTokenFromList, this.mHistoryAccount.autologinToken)) {
                return true;
            }
        }
        return false;
    }

    public boolean compareSuccess(Intent intent, AppLaunchInfo appLaunchInfo) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58b73fb5", new Object[]{this, intent, appLaunchInfo})).booleanValue();
        }
        if (TextUtils.isEmpty(getEnableOneKey(intent))) {
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_NOT_INTENT_EMPTY);
            return false;
        } else if (ServiceFactory.getService(NumberAuthService.class) != null) {
            Map<String, String> authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
            if (authInfoMap == null || !authInfoMap.containsKey("number")) {
                UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_NO_CACHE);
                return false;
            }
            String str = authInfoMap.get("number");
            if (appLaunchInfo == null || (list = appLaunchInfo.deviceMaskMobiles) == null || list.size() == 0 || appLaunchInfo.deviceMaskMobiles.contains(str)) {
                return true;
            }
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_NOT_IN_COMPARE_LIST);
            return false;
        } else {
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.SERVICE_EMPTY);
            return false;
        }
    }

    public void doFinishThing() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991f8f17", new Object[]{this});
            return;
        }
        if (LoginContext.uninstallResponse != null) {
            int strategy = StrategyHelper.getStrategy("reinstall_login");
            boolean z = LoginContext.uninstallType == 2;
            String utArg1 = StrategyHelper.getUtArg1(strategy, "reinstall_login_");
            if (z) {
                str = "sim";
            } else {
                str = "oppo";
            }
            UserTrackAdapter.sendExtendUT(utArg1, str);
            if (strategy == 2) {
                boolean processAutoLoginResponse = LoginController.getInstance().processAutoLoginResponse(LoginContext.uninstallResponse, false, true, null);
                LoginContext.uninstallResponse = null;
                LoginContext.uninstallType = 0;
                if (processAutoLoginResponse) {
                    if (z) {
                        Properties properties = new Properties();
                        properties.put("sFrom", "fromUserLoginActivity");
                        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "fromUserLoginActivity", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("sFrom", "fromUserLoginActivity");
                    UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_success", hashMap);
                    return;
                }
            } else {
                LoginContext.uninstallResponse = null;
                LoginContext.uninstallType = 0;
            }
        }
        BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_CANCEL_ACTION));
        try {
            if (!isFinishing()) {
                UserTrackAdapter.sendUT(getPageName(), "handle_login_close_page");
                finish();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        LoginStatus.lastCloseTimeStamp = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean goFragmentByType(java.lang.String r12, android.content.Intent r13, com.ali.user.mobile.login.model.AppLaunchInfo r14) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.goFragmentByType(java.lang.String, android.content.Intent, com.ali.user.mobile.login.model.AppLaunchInfo):boolean");
    }

    public void initParam(Intent intent) {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad69721", new Object[]{this, intent});
            return;
        }
        this.isLoginObserver = true;
        UserTrackAdapter.skipPage(this);
        this.startTime = System.currentTimeMillis();
        if (intent != null) {
            try {
                this.isOpenMobileLoginPage = TextUtils.equals(intent.getStringExtra(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE), UIBaseConstants.LoginPage.PAGE_SMS_LOGIN);
                this.isOpenUserLoginPage = TextUtils.equals(intent.getStringExtra(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE), UIBaseConstants.LoginPage.PAGE_PWD_LOGIN);
                this.isFromAddAccount = intent.getBooleanExtra(LoginConstant.FORM_ADD_ACCOUNT, false);
                String stringExtra = intent.getStringExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                if (!TextUtils.isEmpty(stringExtra) && (loginParam = (LoginParam) JSON.parseObject(stringExtra, LoginParam.class)) != null) {
                    this.mSource = loginParam.source;
                }
                String stringExtra2 = intent.getStringExtra(LoginConstant.APPLAUNCH_INFO);
                if (!TextUtils.isEmpty(stringExtra2)) {
                    this.fireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(stringExtra2, AppLaunchInfoResponseData.class);
                }
            } catch (Throwable unused) {
                UserTrackAdapter.sendUT("Page_Login", "login_params_error");
            }
        }
        this.mFragmentManager = getSupportFragmentManager();
    }

    public boolean isNeedSMSCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c29e93a", new Object[]{this})).booleanValue();
        }
        return this.needSMSCheck && LoginSwitch.getSwitch(LoginSwitch.SMS_CHECK, "true");
    }

    public boolean openFragmentByAppLaunch(Intent intent) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c75cd44b", new Object[]{this, intent})).booleanValue();
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.fireAppLaunchRes;
        if (!(appLaunchInfoResponseData == null || (t = appLaunchInfoResponseData.returnValue) == 0 || ((AppLaunchInfo) t).sortedRecommendLoginTypes == null)) {
            List<String> list = ((AppLaunchInfo) t).sortedRecommendLoginTypes;
            this.otherLoginType = ((AppLaunchInfo) t).otherLoginType;
            if (((AppLaunchInfo) t).loginValidators != null) {
                this.isFaceLoginActivate = ((AppLaunchInfo) t).loginValidators.verify;
                this.isFaceLoginEnvEnable = ((AppLaunchInfo) t).loginValidators.preCheckVerify;
            }
            this.isMobileAvailable = ((AppLaunchInfo) t).mobileAvailable;
            if (((AppLaunchInfo) t).testValue != null) {
                this.mShowRegTV = ((AppLaunchInfo) t).testValue.isRegOpen;
            }
            if (((AppLaunchInfo) t).userNotFound && this.mHistoryAccount != null) {
                UserTrackAdapter.sendUT("userNotFound");
                SecurityGuardManagerWraper.removeSessionModelFromFile(String.valueOf(this.mHistoryAccount.userId));
                SecurityGuardManagerWraper.removeHistoryAccount(SecurityGuardManagerWraper.findHistoryAccount(this.mHistoryAccount.userId));
                this.mHistoryAccount = null;
            }
            boolean z = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).pad;
            this.isPad = z;
            UserTrackAdapter.sendExtendUT("server_pad", String.valueOf(z));
            if (!((AppLaunchInfo) this.fireAppLaunchRes.returnValue).biometricOpen) {
                UserTrackAdapter.sendUT("biometricOpenFalse");
                this.mBiometricToken = "";
            }
            this.mUserOpenFaceLogin = this.isFaceLoginActivate && ServiceFactory.getService(FaceService.class) != null;
            if (displayOversea()) {
                switchToRecommendLogin(intent);
                return true;
            } else if (list.size() > 0) {
                LoginTLogAdapter.e(TAG, "recommend: " + JSON.toJSONString(list));
                try {
                    UserTrackAdapter.sendUT(getPageName(), z9u.CLICK_SHOWRECOMMEND, JSON.toJSONString(list), null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (openRecommendPage(intent, list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean openRecommendPage(Intent intent, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("992449fa", new Object[]{this, intent, list})).booleanValue();
        }
        for (String str : list) {
            if (goFragmentByType(str, intent, (AppLaunchInfo) this.fireAppLaunchRes.returnValue)) {
                Log.e(TAG, "openRecommendPage: type=" + str);
                return true;
            }
        }
        return false;
    }

    public boolean switchToRecommendLogin(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a85bf404", new Object[]{this, intent})).booleanValue();
        }
        try {
            Fragment newRecommendLoginFragment = new NewRecommendLoginFragment();
            String stringExtra = intent.getStringExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE);
            if (CountryUtil.supportOverseaSimLogin(this.fireAppLaunchRes)) {
                LoginTLogAdapter.e(TAG, "fromOversea priority pwd");
                intent.putExtra("supportOverseaSimLogin", true);
                if (TextUtils.isEmpty(stringExtra)) {
                    intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.SMS_LOGIN.name());
                }
            }
            if (DataProviderFactory.getDataProvider().isForigenLocation() && displayOversea()) {
                intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.SMS_LOGIN.name());
                newRecommendLoginFragment = new OverseaLoginFragment();
            }
            newRecommendLoginFragment.setArguments(intent.getExtras());
            addFragment(intent, newRecommendLoginFragment, FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean supportMultiLogoutList(LoginHistory loginHistory) {
        List<HistoryAccount> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25390a8f", new Object[]{this, loginHistory})).booleanValue();
        }
        return loginHistory != null && (list = loginHistory.accountHistory) != null && list.size() >= 2 && CommonUtil.isInABTestRegion("supportMultiLogoutList", 10000);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:26:0x006e, B:28:0x0079, B:32:0x0084, B:34:0x008e, B:39:0x009c, B:44:0x00ab, B:46:0x00af, B:48:0x00d3, B:49:0x00e1, B:50:0x00fa), top: B:58:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:26:0x006e, B:28:0x0079, B:32:0x0084, B:34:0x008e, B:39:0x009c, B:44:0x00ab, B:46:0x00af, B:48:0x00d3, B:49:0x00e1, B:50:0x00fa), top: B:58:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:26:0x006e, B:28:0x0079, B:32:0x0084, B:34:0x008e, B:39:0x009c, B:44:0x00ab, B:46:0x00af, B:48:0x00d3, B:49:0x00e1, B:50:0x00fa), top: B:58:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void gotoMobileLoginFragment(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.gotoMobileLoginFragment(android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: Exception -> 0x0096, TryCatch #4 {Exception -> 0x0096, blocks: (B:26:0x006e, B:28:0x0079, B:31:0x0081, B:33:0x0090, B:40:0x009c, B:42:0x00a0, B:44:0x00b5, B:45:0x00c3, B:46:0x00dc), top: B:58:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void gotoPwdLoginFragment(android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.gotoPwdLoginFragment(android.content.Intent):void");
    }
}
