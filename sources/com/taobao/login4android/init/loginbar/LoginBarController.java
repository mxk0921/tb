package com.taobao.login4android.init.loginbar;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.BottomFloatingBarInfo;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.AppLaunchDataPresenter;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.iy4;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginBarController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ALIPAY = 6;
    private static final int AUTOLOGIN = 8;
    private static final int DEFAULT = 4;
    private static final String HOME_BENEFIT_FROM = "homepage_benefit_bar";
    private static final String HOME_FROM = "homepage_login_bar";
    private static final int LOGIN = 1;
    private static final String ORANGE_KEY = "login_bar_profile";
    private static final int REGISTER = 2;
    private static final int SIM_LOGIN = 3;
    private static final int SIM_VERIFY = 7;
    public static final String TAG = "login.LoginBar";
    private static final int UMID_LOGIN = 5;
    public static String cacheMaskMobile;
    private static WeakReference<View> loginBarCache;
    private static volatile HistoryAccount mLastHistoryAccount;
    private static BroadcastReceiver mLoginReceiver;
    public static SessionList mSessionList;
    private static WeakReference<Activity> mainActivityCache;
    public static WeakReference<Activity> sWeakReference;
    private static boolean isRegisterLoginResultBroadcast = false;
    public static boolean isGray = false;
    public static boolean loginBarNeedPreFetch = true;
    public static boolean updateOnce = true;
    public static final NumberAuthService.PrefetchResultObserver observer = new NumberAuthService.PrefetchResultObserver() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ali.user.mobile.service.NumberAuthService.PrefetchResultObserver
        public void onResult(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14d0b3c2", new Object[]{this, map});
                return;
            }
            try {
                NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
                if (numberAuthService != null) {
                    numberAuthService.removePrefetchResultObserver(this);
                    if (map != null && !map.isEmpty()) {
                        String str = map.get("number");
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.equals(LoginBarController.cacheMaskMobile, str)) {
                                UserTrackAdapter.sendUserTrack(LoginBarController.access$300(), "login_bar_already_sim", null);
                                return;
                            }
                            UserTrackAdapter.sendUserTrack(LoginBarController.access$300(), "login_bar_refresh_when_mask", null);
                            if (LoginBarController.updateOnce || LoginSwitch.getSwitch("updateAlways", "false")) {
                                LoginBarController.updateLoginBar();
                                LoginBarController.updateOnce = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.init.loginbar.LoginBarController$7  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        t2o.a(517996592);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return getMaskMobile();
    }

    public static /* synthetic */ HistoryAccount access$102(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("7fcfcf9c", new Object[]{historyAccount});
        }
        mLastHistoryAccount = historyAccount;
        return historyAccount;
    }

    public static /* synthetic */ boolean access$200(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d093127e", new Object[]{appLaunchInfo})).booleanValue();
        }
        return enableSearchBar(appLaunchInfo);
    }

    public static /* synthetic */ String access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return getPageName();
    }

    public static /* synthetic */ void access$400(Activity activity, int i, int i2, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de912346", new Object[]{activity, new Integer(i), new Integer(i2), appLaunchInfo});
        } else {
            goLogin(activity, i, i2, appLaunchInfo);
        }
    }

    public static /* synthetic */ float access$500(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8874f1fe", new Object[]{activity})).floatValue();
        }
        return density(activity);
    }

    public static /* synthetic */ WeakReference access$602(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("3f8d054d", new Object[]{weakReference});
        }
        loginBarCache = weakReference;
        return weakReference;
    }

    public static /* synthetic */ Map access$700(int i, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ff9fc23", new Object[]{new Integer(i), appLaunchInfo});
        }
        return getArgsByID(i, appLaunchInfo);
    }

    public static /* synthetic */ void access$800(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9e7012", new Object[]{str, str2, map});
        } else {
            userTrace(str, str2, map);
        }
    }

    public static /* synthetic */ void access$900(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae3e412", new Object[]{view});
        } else {
            deleteBar(view);
        }
    }

    public static void addLoginBar(int i, Activity activity, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e25a768", new Object[]{new Integer(i), activity, fragmentManager});
        } else if (!Login.checkSessionValid() && TextUtils.isEmpty(Login.getLoginToken())) {
            try {
                handleLoginBar(i, activity, fragmentManager, getLoginBarProfileStr(activity));
                registerLoginResult(i, activity);
            } catch (Throwable th) {
                th.printStackTrace();
                LoginTLogAdapter.e(TAG, th);
            }
        }
    }

    private static void addMaskObserver() {
        NumberAuthService.PrefetchResultObserver prefetchResultObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c5302a", new Object[0]);
            return;
        }
        NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService != null && (prefetchResultObserver = observer) != null) {
            numberAuthService.addPrefetchResultObserver(prefetchResultObserver);
        }
    }

    private static void buildSimLoginBundle(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a348a43f", new Object[]{bundle, str, str2});
            return;
        }
        bundle.putString("source", "Page_Login5-simLogin");
        bundle.putString("login_type", "sim");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(LoginConstant.UMID_TOKEN, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("showLoginId", str2);
        }
    }

    private static void buildSimVerifyBundle(Bundle bundle, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd655105", new Object[]{bundle, new Long(j), str});
            return;
        }
        bundle.putString("source", "Page_Login5-simVerify");
        bundle.putString("login_type", "sim_verify");
        bundle.putLong("hid", j);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(LoginConstant.LOGIN_ID, str);
        }
    }

    public static void cacheMainActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb038a3", new Object[]{activity});
            return;
        }
        try {
            mainActivityCache = new WeakReference<>(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean canFastLogin() {
        SessionList sessionList;
        List<SessionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1be56888", new Object[0])).booleanValue();
        }
        if (!(mLastHistoryAccount == null || mLastHistoryAccount.userId <= 0 || (sessionList = mSessionList) == null || (list = sessionList.sessionModels) == null || list.isEmpty())) {
            String autoLoginTokenFromList = SecurityGuardManagerWraper.getAutoLoginTokenFromList(mSessionList, String.valueOf(mLastHistoryAccount.userId));
            if (!TextUtils.isEmpty(autoLoginTokenFromList) && TextUtils.equals(autoLoginTokenFromList, mLastHistoryAccount.autologinToken)) {
                return true;
            }
        }
        return false;
    }

    private static void deleteBar(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5317183", new Object[]{view});
        } else if (view != null) {
            try {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static float density(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3858f71", new Object[]{activity})).floatValue();
        }
        return activity.getResources().getDisplayMetrics().density;
    }

    public static void doRemove(final int i, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac18f55", new Object[]{new Integer(i), activity, new Boolean(z)});
            return;
        }
        final FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
        if (frameLayout != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FrameLayout frameLayout2 = frameLayout;
                        if (frameLayout2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) frameLayout2.findViewById(i);
                            LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,decorView != null，id=" + i);
                            if (frameLayout3 != null) {
                                LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,contentView != null,id=" + i);
                                View findViewWithTag = frameLayout3.findViewWithTag("login_bar");
                                if (findViewWithTag != null) {
                                    LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,loginBar != null,id=" + i);
                                    LoginBarController.access$900(findViewWithTag);
                                } else {
                                    LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,loginBar is null");
                                }
                            } else {
                                LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,contentView is null");
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    private static boolean enableSearchBar(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2dae28", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return false;
        }
        return bottomFloatingBarInfo.enableSearchBottomBar;
    }

    private static Map<String, String> getArgsByID(int i, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a433b11", new Object[]{new Integer(i), appLaunchInfo});
        }
        HashMap hashMap = new HashMap();
        if (i == 16908290) {
            hashMap.put("from", "search");
        } else {
            hashMap.put("from", "homepage");
        }
        hashMap.put("thinMode", String.valueOf(isThinMode(appLaunchInfo)));
        return hashMap;
    }

    private static String getAvatar(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37ada8c3", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo != null && (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) != null && !TextUtils.isEmpty(bottomFloatingBarInfo.userAvatar)) {
            return appLaunchInfo.bottomFloatingBarInfo.userAvatar;
        }
        if (mLastHistoryAccount != null) {
            return mLastHistoryAccount.headImg;
        }
        return "";
    }

    private static boolean getBenifitFirst(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8142507d", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return false;
        }
        return bottomFloatingBarInfo.benefitFirst;
    }

    private static String getBenifitIcon(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b16a1cea", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return "";
        }
        return bottomFloatingBarInfo.benefitIcon;
    }

    private static String getBenifitSubText(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d24cee4", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return "";
        }
        return bottomFloatingBarInfo.benefitSubTitle;
    }

    private static String getBenifitText(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8c40b9e", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return "";
        }
        return bottomFloatingBarInfo.benefitText;
    }

    public static String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[0]);
        }
        Locale currentLanguage = getCurrentLanguage();
        if (currentLanguage == null) {
            return o78.CHINA_MAINLAND;
        }
        return currentLanguage.getCountry();
    }

    public static Locale getCurrentLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("4578c909", new Object[0]);
        }
        try {
            Language h = Localization.h();
            if (h != null) {
                return new Locale(h.getLanguage(), h.getCountry());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "getLanguageException");
        }
        return Locale.SIMPLIFIED_CHINESE;
    }

    private static String getDefaultLoginBtnText(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd525e1f", new Object[]{appLaunchInfo});
        }
        return Localization.q(R.string.aliuser_bar_btn);
    }

    public static Drawable getGradientDrawable(Activity activity, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c780af0f", new Object[]{activity, iArr});
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
        gradientDrawable.setCornerRadius((int) (getRadius() * density(activity)));
        return gradientDrawable;
    }

    public static void getGray() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823e62e0", new Object[0]);
            return;
        }
        int i = LoginSwitch.getSwitch("loginBarGrayStyleStartTime", Integer.MAX_VALUE);
        int i2 = LoginSwitch.getSwitch("loginBarGrayStyleEndTime", -1);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis > i && currentTimeMillis < i2) {
            z = true;
        }
        isGray = z;
    }

    private static int getIconWidth(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1cbdea8", new Object[]{appLaunchInfo})).intValue();
        }
        if (isThinMode(appLaunchInfo)) {
            return 24;
        }
        return 31;
    }

    public static String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[0]);
        }
        Locale currentLanguage = getCurrentLanguage();
        if (currentLanguage == null) {
            return "zh";
        }
        return currentLanguage.getLanguage();
    }

    private static boolean getLocatedUmidAccount(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd15a532", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (appLaunchInfo != null) {
            return appLaunchInfo.locatedUmidAccount;
        }
        return false;
    }

    private static String getLoginBarProfileStr(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6758edf", new Object[]{activity});
        }
        String q = Localization.q(R.string.aliuser_default_bar);
        String language = getLanguage();
        String country = getCountry();
        OrangeConfig instance = OrangeConfig.getInstance();
        String config = instance.getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, "login_bar_profile_" + country + "_" + language, "");
        if (!TextUtils.isEmpty(config)) {
            return config;
        }
        OrangeConfig instance2 = OrangeConfig.getInstance();
        return instance2.getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, "login_bar_profile_" + language, q);
    }

    public static Activity getMainActivity() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("51a25fe3", new Object[0]);
        }
        try {
            WeakReference<Activity> weakReference = mainActivityCache;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return null;
            }
            if (!activity.isFinishing()) {
                return activity;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getMaskMobile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce2da2d5", new Object[0]);
        }
        String maskMobile = NetworkUtil.getMaskMobile(LoginSwitch.getSwitch("login_bar_num", "true"));
        cacheMaskMobile = maskMobile;
        return maskMobile;
    }

    private static String getOrangeSubText(Activity activity, LoginBarProfile loginBarProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef7b440a", new Object[]{activity, loginBarProfile});
        }
        if (loginBarProfile == null || TextUtils.isEmpty(loginBarProfile.loginSubText)) {
            return Localization.q(R.string.aliuser_bar_more_suprise);
        }
        return loginBarProfile.loginSubText;
    }

    private static String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[0]);
        }
        return UTConstant.PageName.UT_PAGE_LOGIN_BAR;
    }

    public static int getRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9581002", new Object[0])).intValue();
        }
        if (isChineseLanguage()) {
            return 6;
        }
        return 14;
    }

    private static String getServerButtonText(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5f6228c", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return "";
        }
        return bottomFloatingBarInfo.buttonText;
    }

    private static String getShowLoginId(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("854c32e5", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo != null && (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) != null && !TextUtils.isEmpty(bottomFloatingBarInfo.showLoginId)) {
            return appLaunchInfo.bottomFloatingBarInfo.showLoginId;
        }
        if (mLastHistoryAccount != null) {
            return StringUtil.dataMasking(mLastHistoryAccount.userInputName, true);
        }
        return "";
    }

    private static String getSubText(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ef653cb", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return "";
        }
        return bottomFloatingBarInfo.subTitle;
    }

    private static String getUmidLoginToken(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3a54e8d", new Object[]{appLaunchInfo});
        }
        if (appLaunchInfo == null || !appLaunchInfo.openFloatingBarPersonalize || appLaunchInfo.bottomFloatingBarInfo == null) {
            return "";
        }
        return appLaunchInfo.umidLoginToken;
    }

    private static void handleLoginBar(int i, Activity activity, FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c0439", new Object[]{new Integer(i), activity, fragmentManager, str});
            return;
        }
        getGray();
        LoginBarProfile loginBarProfile = new LoginBarProfile();
        try {
            loginBarProfile = (LoginBarProfile) JSON.parseObject(str, LoginBarProfile.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        addLoginBarInMainActivity2(i, activity, fragmentManager, loginBarProfile);
    }

    public static void hideLoginBar() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6184dd3", new Object[0]);
            return;
        }
        try {
            WeakReference<View> weakReference = loginBarCache;
            if (weakReference != null && (view = weakReference.get()) != null) {
                view.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean iSupportAlipay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("141c5615", new Object[]{context})).booleanValue();
        }
        OauthService oauthService = (OauthService) AliMemberSDK.getService(OauthService.class);
        if (oauthService == null || !oauthService.isAppAuthSurpport(context, "alipay")) {
            return false;
        }
        return true;
    }

    public static boolean isChineseLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a92e3e6", new Object[0])).booleanValue();
        }
        Locale currentLanguage = getCurrentLanguage();
        if (currentLanguage == null) {
            return true;
        }
        return "zh".equals(currentLanguage.getLanguage());
    }

    private static boolean isThinMode(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3797f14a", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (!isChineseLanguage()) {
            return true;
        }
        if (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null) {
            return false;
        }
        return bottomFloatingBarInfo.thinMode;
    }

    private static void removeMaskObserver() {
        NumberAuthService.PrefetchResultObserver prefetchResultObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d08a0d", new Object[0]);
            return;
        }
        NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService != null && (prefetchResultObserver = observer) != null) {
            numberAuthService.removePrefetchResultObserver(prefetchResultObserver);
        }
    }

    private static void setButtonText(LoginBarProfile loginBarProfile, String str, Button button, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d38f08", new Object[]{loginBarProfile, str, button, str2});
        } else {
            setTipText(str, button, str2);
        }
    }

    private static void setCircleUrl(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1348e274", new Object[]{tUrlImageView, str});
        } else if (TextUtils.isEmpty(str)) {
            tUrlImageView.setVisibility(8);
        } else {
            try {
                tUrlImageView.setVisibility(0);
                tUrlImageView.setImageUrl(str, new PhenixOptions().bitmapProcessors(new iy4()));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void setTipText(String str, TextView textView, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1475e2f7", new Object[]{str, textView, str2});
        } else if (textView != null) {
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
            } else {
                textView.setText(str2);
            }
        }
    }

    private static void setView(int i, Activity activity, int i2, LoginBarProfile loginBarProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df80f0", new Object[]{new Integer(i), activity, new Integer(i2), loginBarProfile});
        } else {
            setView(i, activity, i2, loginBarProfile, null);
        }
    }

    public static void setViewByServer(int i, Activity activity, LoginBarProfile loginBarProfile, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f716f2", new Object[]{new Integer(i), activity, loginBarProfile, appLaunchInfo});
        } else if (appLaunchInfo == null || !appLaunchInfo.openFloatingBarPersonalize || appLaunchInfo.bottomFloatingBarInfo == null) {
            defaultSetView(i, activity, loginBarProfile);
        } else if (!openRecommendPage(i, activity, loginBarProfile, appLaunchInfo)) {
            setView(i, activity, 4, loginBarProfile, appLaunchInfo);
        }
    }

    public static void showLoginBar() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873f8b0e", new Object[0]);
            return;
        }
        try {
            if (loginBarCache != null && !Login.checkSessionValid() && (view = loginBarCache.get()) != null) {
                view.setVisibility(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateLoginBar() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcf96da", new Object[0]);
            return;
        }
        try {
            WeakReference<Activity> weakReference = sWeakReference;
            if (weakReference != null && (activity = weakReference.get()) != null && !activity.isFinishing()) {
                int i = R.id.tbTabFragment;
                removeLoginBar(i, activity, false);
                addLoginBar(i, activity, null);
            }
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, "refresh login bar fail", e);
        }
    }

    private static void userTrace(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920b4a90", new Object[]{str, str2, map});
            return;
        }
        try {
            UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_LOGIN_BAR, str, str2, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addLoginBarInMainActivity(int i, Activity activity, LoginBarProfile loginBarProfile, AppLaunchInfo appLaunchInfo) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbc69a9", new Object[]{new Integer(i), activity, loginBarProfile, appLaunchInfo});
        } else if (activity != null && !activity.isFinishing()) {
            if ((loginBarProfile == null || !TextUtils.equals(loginBarProfile.isOpenLoginButton, "false")) && (frameLayout = (FrameLayout) activity.getWindow().getDecorView()) != null) {
                FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(16908290);
                if (frameLayout2 == null || frameLayout2.findViewWithTag("login_bar") != null) {
                    LoginTLogAdapter.e(TAG, "has login_bar,don't need add again");
                } else if (appLaunchInfo == null || !appLaunchInfo.openFloatingBarPersonalize || appLaunchInfo.bottomFloatingBarInfo == null) {
                    LoginTLogAdapter.e(TAG, "miss server recommend");
                    defaultSetView(i, activity, loginBarProfile);
                } else {
                    LoginTLogAdapter.e(TAG, "hit server recommend: serverData= " + JSON.toJSONString(appLaunchInfo));
                    appendSim(appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes);
                    List<String> list = appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes;
                    if (list == null || list.size() <= 0) {
                        setView(i, activity, 4, loginBarProfile, appLaunchInfo);
                    } else {
                        setViewByServer(i, activity, loginBarProfile, appLaunchInfo);
                    }
                }
            }
        }
    }

    private static void addLoginBarInMainActivity2(final int i, final Activity activity, FragmentManager fragmentManager, final LoginBarProfile loginBarProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c1b82b", new Object[]{new Integer(i), activity, fragmentManager, loginBarProfile});
            return;
        }
        final boolean z = LoginSwitch.getSwitch("login_bar_check_server", "true");
        CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, AppLaunchInfoResponseData>() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.onPostExecute((AnonymousClass1) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/init/loginbar/LoginBarController$1");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.AsyncTask
            public AppLaunchInfoResponseData doInBackground(Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (AppLaunchInfoResponseData) ipChange2.ipc$dispatch("6e64cfa4", new Object[]{this, objArr});
                }
                String access$000 = LoginBarController.access$000();
                if (LoginBarController.loginBarNeedPreFetch && TextUtils.isEmpty(access$000)) {
                    LoginBarController.loginBarNeedPreFetch = false;
                    NetworkUtil.preFecth("loginBarPre");
                }
                LoginBarController.access$102(SecurityGuardManagerWraper.getLastHistoryAccount());
                LoginBarController.mSessionList = SecurityGuardManagerWraper.getSessionListFromFile();
                return AppLaunchDataPresenter.getAppLaunchData(activity, z);
            }

            public void onPostExecute(AppLaunchInfoResponseData appLaunchInfoResponseData) {
                T t;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a2b69a8b", new Object[]{this, appLaunchInfoResponseData});
                    return;
                }
                super.onPostExecute((AnonymousClass1) appLaunchInfoResponseData);
                AppLaunchInfo appLaunchInfo = (appLaunchInfoResponseData == null || (t = appLaunchInfoResponseData.returnValue) == 0) ? null : (AppLaunchInfo) t;
                boolean access$200 = LoginBarController.access$200(appLaunchInfo);
                LoginTLogAdapter.e(LoginBarController.TAG, "enableSearchBar = " + access$200);
                int i2 = i;
                if (i2 != 16908290 || access$200) {
                    LoginBarController.addLoginBarInMainActivity(i2, activity, loginBarProfile, appLaunchInfo);
                } else {
                    LoginTLogAdapter.e(LoginBarController.TAG, "enalbeSearchBar = flase,return");
                }
            }
        }, new Object[0]);
    }

    private static void appendSim(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a769ba55", new Object[]{list});
        } else if (list != null && list.size() != 0 && !TokenType.AUTOLOGIN_TOKEN.equals(list.get(0)) && !list.contains("sim") && LoginSwitch.getSwitch("appendSim", "true")) {
            list.add(0, "sim");
        }
    }

    public static void buttonStyle(Activity activity, Button button) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1c5f8c", new Object[]{activity, button});
            return;
        }
        LoginTLogAdapter.e(TAG, "isGray = " + isGray);
        button.setAllCaps(false);
        if (isGray) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) (getRadius() * density(activity)));
            gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
            button.setBackground(gradientDrawable);
            button.setTextColor(Color.parseColor("#111111"));
            return;
        }
        button.setBackgroundDrawable(getGradientDrawable(activity, new int[]{b0.DEFAULT_COLOR, b0.DEFAULT_COLOR, b0.DEFAULT_COLOR}));
        button.setTextColor(-1);
    }

    public static void registerLoginResult(final int i, final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c0418b", new Object[]{new Integer(i), activity});
            return;
        }
        LoginTLogAdapter.e(TAG, "in registerLoginResult： isRegisterLoginResultBroadcast = " + isRegisterLoginResultBroadcast);
        if (!isRegisterLoginResultBroadcast) {
            LoginTLogAdapter.e(TAG, "registerLoginReceiver");
            mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/init/loginbar/LoginBarController$6");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null && activity != null) {
                        String action = intent.getAction();
                        LoginTLogAdapter.e(LoginBarController.TAG, "received action=" + action);
                        LoginAction valueOf = LoginAction.valueOf(action);
                        if (valueOf != null && AnonymousClass7.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()] == 1) {
                            LoginTLogAdapter.e(LoginBarController.TAG, "received NOTIFY_LOGIN_SUCCESS");
                            Activity activity2 = activity;
                            if (activity2 == null || activity2.isFinishing()) {
                                LoginTLogAdapter.e(LoginBarController.TAG, "received NOTIFY_LOGIN_SUCCESS,activity is null or isFinishing");
                            } else {
                                LoginBarController.removeLoginBar(i, activity, true);
                            }
                        }
                    }
                }
            };
            LoginBroadcastHelper.registerLoginReceiver(activity.getApplicationContext(), mLoginReceiver);
            isRegisterLoginResultBroadcast = true;
        }
    }

    public static void removeLoginBar(int i, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38afe674", new Object[]{new Integer(i), activity, new Boolean(z)});
            return;
        }
        LoginTLogAdapter.e(TAG, "removeLoginBar,id" + i);
        try {
            LoginTLogAdapter.e(TAG, "reset isRegisterLoginResultBroadcast,id = " + i);
            isRegisterLoginResultBroadcast = false;
            LoginTLogAdapter.e(TAG, "unregisterReceiver,id=" + i);
            if (mLoginReceiver != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(activity.getApplicationContext(), mLoginReceiver);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        doRemove(i, activity, z);
        removeMaskObserver();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0521  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void setView(final int r31, final android.app.Activity r32, final int r33, com.taobao.login4android.init.loginbar.LoginBarProfile r34, final com.ali.user.mobile.login.model.AppLaunchInfo r35) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.init.loginbar.LoginBarController.setView(int, android.app.Activity, int, com.taobao.login4android.init.loginbar.LoginBarProfile, com.ali.user.mobile.login.model.AppLaunchInfo):void");
    }

    private static boolean containsSim(AppLaunchInfo appLaunchInfo) {
        BottomFloatingBarInfo bottomFloatingBarInfo;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8116f4f8", new Object[]{appLaunchInfo})).booleanValue();
        }
        return (appLaunchInfo == null || (bottomFloatingBarInfo = appLaunchInfo.bottomFloatingBarInfo) == null || (list = bottomFloatingBarInfo.recommendLoginTypes) == null || !list.contains("sim")) ? false : true;
    }

    public static boolean openRecommendPage(int i, Activity activity, LoginBarProfile loginBarProfile, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bddf076", new Object[]{new Integer(i), activity, loginBarProfile, appLaunchInfo})).booleanValue();
        }
        for (String str : appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes) {
            if (goFragmentByType(i, activity, loginBarProfile, str, appLaunchInfo)) {
                LoginTLogAdapter.e(TAG, "openRecommendType : type=" + str);
                return true;
            }
        }
        return false;
    }

    private static void defaultSetView(int i, Activity activity, LoginBarProfile loginBarProfile) {
        int i2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4217157c", new Object[]{new Integer(i), activity, loginBarProfile});
            return;
        }
        String maskMobile = getMaskMobile();
        if (LoginSwitch.getSwitch("defaultAddSim", "true") && !TextUtils.isEmpty(maskMobile)) {
            String mobileFromHistory = UserLoginActivity.getMobileFromHistory(mLastHistoryAccount);
            if (canFastLogin()) {
                setView(i, activity, 8, loginBarProfile);
            } else if (mLastHistoryAccount == null || UserLoginActivity.isCompareSuccess(mobileFromHistory, maskMobile)) {
                UserTrackAdapter.sendUT("defaultAddSim");
                if (mLastHistoryAccount != null) {
                    i2 = 7;
                }
                setView(i, activity, i2, loginBarProfile);
            } else {
                UserTrackAdapter.sendUT("notAddSim");
                setView(i, activity, 1, loginBarProfile);
            }
        } else if (!TextUtils.isEmpty(Login.getOldUserId())) {
            setView(i, activity, 1, loginBarProfile);
        } else {
            setView(i, activity, 2, loginBarProfile);
        }
    }

    private static void goLogin(Activity activity, int i, int i2, AppLaunchInfo appLaunchInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0929bb9", new Object[]{activity, new Integer(i), new Integer(i2), appLaunchInfo});
            return;
        }
        String umidLoginToken = getUmidLoginToken(appLaunchInfo);
        String showLoginId = getShowLoginId(appLaunchInfo);
        Bundle bundle = new Bundle();
        String maskMobile = getMaskMobile();
        if (TextUtils.isEmpty(maskMobile)) {
            NetworkUtil.preFecth("loginBar");
        }
        String str2 = null;
        if (i2 == 2) {
            str = "Regist";
        } else {
            if (i2 == 3) {
                buildSimLoginBundle(bundle, umidLoginToken, showLoginId);
            } else if (i2 == 7 && mLastHistoryAccount != null) {
                buildSimVerifyBundle(bundle, mLastHistoryAccount.userId, mLastHistoryAccount.mobile);
            } else if (i2 == 5) {
                str2 = "umidIvbar";
                if (TextUtils.isEmpty(maskMobile) || !containsSim(appLaunchInfo)) {
                    if (!TextUtils.isEmpty(umidLoginToken)) {
                        str = "umidIv";
                        bundle.putString("login_type", str);
                        bundle.putString(LoginConstant.UMID_TOKEN, umidLoginToken);
                    }
                    str = "";
                } else {
                    buildSimLoginBundle(bundle, umidLoginToken, showLoginId);
                    str = "sim";
                }
            } else if (i2 == 8) {
                str2 = "autologinBar";
                if (mLastHistoryAccount != null && !TextUtils.isEmpty(mLastHistoryAccount.autologinToken)) {
                    str = LoginType.LocalLoginType.AUTO_LOGIN;
                    bundle.putString("login_type", str);
                    bundle.putLong("hid", mLastHistoryAccount.userId);
                    bundle.putString(LoginConstant.AUTOLOGIN_TOKEN, mLastHistoryAccount.autologinToken);
                }
                str = "";
            } else if (i2 == 4) {
                str = "defaultLogin";
            } else {
                str = TokenType.LOGIN;
            }
            str2 = "simbar";
            str = "sim";
        }
        if (!TextUtils.isEmpty(getBenifitText(appLaunchInfo))) {
            LoginStatus.source = HOME_BENEFIT_FROM;
        } else {
            LoginStatus.source = HOME_FROM;
        }
        bundle.putString("source", LoginStatus.source);
        userTrace(str, str2, getArgsByID(i, appLaunchInfo));
        if ("true".equals(OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, "reset_before_loginbar", "false"))) {
            LoginStatus.resetLoginFlag();
        }
        boolean iSupportAlipay = iSupportAlipay(activity);
        if (i2 != 6 || !iSupportAlipay) {
            Login.login(true, bundle);
        } else if (LoginSwitch.getSwitch("degradeLoginBarAlipay", "true")) {
            Login.alipayAuth(LoginStatus.source);
        } else {
            bundle.putString("login_type", "sns_alipay");
            Login.login(true, bundle);
        }
    }

    public static boolean goFragmentByType(int i, Activity activity, LoginBarProfile loginBarProfile, String str, AppLaunchInfo appLaunchInfo) {
        int i2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13cf0a14", new Object[]{new Integer(i), activity, loginBarProfile, str, appLaunchInfo})).booleanValue();
        }
        String maskMobile = getMaskMobile();
        LoginTLogAdapter.e(TAG, "maskMobile in getType = " + maskMobile);
        boolean iSupportAlipay = iSupportAlipay(activity);
        if (!appLaunchInfo.locatedUmidAccount) {
            if ("alipay".equals(str) && iSupportAlipay) {
                setView(i, activity, 6, loginBarProfile, appLaunchInfo);
                return true;
            } else if (!"sim".equals(str) || TextUtils.isEmpty(maskMobile)) {
                return false;
            } else {
                setView(i, activity, 3, loginBarProfile, appLaunchInfo);
                return true;
            }
        } else if (TokenType.AUTOLOGIN_TOKEN.equals(str) && canFastLogin()) {
            setView(i, activity, 8, loginBarProfile, appLaunchInfo);
            return true;
        } else if ("alipay".equals(str) && iSupportAlipay) {
            setView(i, activity, 6, loginBarProfile, appLaunchInfo);
            return true;
        } else if ("umidIv".equals(str)) {
            setView(i, activity, 5, loginBarProfile, appLaunchInfo);
            return true;
        } else if (!"sim".equals(str) || TextUtils.isEmpty(maskMobile)) {
            return false;
        } else {
            String mobileFromHistory = UserLoginActivity.getMobileFromHistory(mLastHistoryAccount);
            if (mLastHistoryAccount == null || UserLoginActivity.isCompareSuccess(mobileFromHistory, maskMobile)) {
                if (mLastHistoryAccount != null) {
                    i2 = 7;
                }
                setView(i, activity, i2, loginBarProfile, appLaunchInfo);
            } else {
                UserTrackAdapter.sendUT("notAddSim2");
                setView(i, activity, 4, loginBarProfile, appLaunchInfo);
            }
            return true;
        }
    }
}
