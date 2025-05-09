package com.taobao.login4android.api;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.presenter.NeedLoginPresenter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.service.LoginService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.data.DefaultDataProvider;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcStats;
import com.taobao.login4android.api.aidl.ICheckResultCallback;
import com.taobao.login4android.api.aidl.ILogin;
import com.taobao.login4android.api.aidl.ITokenCallback;
import com.taobao.login4android.api.aidl.IUccCallback;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.constants.LoginUrlConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.SDKUtil;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import mtopsdk.mtop.intf.Mtop;
import tb.g1v;
import tb.m3i;
import tb.t2o;
import tb.t5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Login {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long COOKIES_REFRESH_INTERVAL = 1800000;
    private static final long COOKIES_REFRESH_SHRINK = 1680000;
    private static final int LOGIN_TIMEOUT = 20000;
    @Deprecated
    public static final int NOTIFY_BINDALIPAYFAILED = 911110;
    @Deprecated
    public static final int NOTIFY_BINDALIPAYSUCCESS = 911109;
    @Deprecated
    public static final int NOTIFY_LOGINBYSECURITY = 911104;
    @Deprecated
    public static final int NOTIFY_LOGINCANCEL = 911103;
    @Deprecated
    public static final int NOTIFY_LOGINFAILED = 911102;
    @Deprecated
    public static final int NOTIFY_LOGINSUCCESS = 911101;
    @Deprecated
    public static final int NOTIFY_SSOLOGIN = 911107;
    @Deprecated
    public static final int NOTIFY_SSOLOGOUT = 911108;
    @Deprecated
    public static final int NOTIFY_USER_LOGIN = 911105;
    @Deprecated
    public static final int NOTIFY_WEEDOUT = 911106;
    private static final int OPEN_MULTI_ACCOUNT_PAGE = 102;
    private static final String REFRESH_RESULT = "refreshResult";
    private static final int SHOW_LOGOUT_PANEL = 101;
    public static final String TAG = "api.Login";
    private static final int UCC_BIND = 2;
    private static final int UCC_TRUST_LOGIN = 1;
    private static final int UCC_UNBIND = 3;
    @Deprecated
    private static Handler currentHandler;
    public static Bundle launchBundle;
    private static LoginServiceTask loginTask;
    public static Context mContext;
    private static transient Pattern[] mLoginPatterns;
    private static transient Pattern[] mLogoutPatterns;
    private static BroadcastReceiver mReceiver;
    @Deprecated
    private static Handler oAuthHandler;
    private static ISession session;
    private static Object mLock = new Object();
    public static long sessionValidTrack = 0;
    private static String sProcessName = "";
    @Deprecated
    private static ConcurrentHashMap<String, WeakReference<Handler>> handlerPool = new ConcurrentHashMap<>();

    static {
        t2o.a(512753673);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            checkReceiver();
        }
    }

    public static /* synthetic */ LoginServiceTask access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginServiceTask) ipChange.ipc$dispatch("7c04cc45", new Object[0]);
        }
        return loginTask;
    }

    public static /* synthetic */ void access$200(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adadf3fb", new Object[]{new Boolean(z)});
        } else {
            notifyRefreshResult(z);
        }
    }

    @Deprecated
    public static void addLoadedListener(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30319711", new Object[]{handler});
        } else if (handler != null) {
            handlerPool.put(handler.toString(), new WeakReference<>(handler));
            currentHandler = handler;
        }
    }

    public static void alipayAuth(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abf4823", new Object[]{str});
            return;
        }
        sendUT("LoginAPI_alipayAuth");
        LoginStatus.sdkSessionTraceID = ApiReferer.generateSdkSessionTraceId();
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$11");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.alipayAuth(str);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void applyToken(final ITokenCallback iTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a08c0e0", new Object[]{iTokenCallback});
            return;
        }
        sendUT("LoginAPI_ApplyToken");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass17 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$17");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.applyToken(ITokenCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void bindAlipay(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7383a802", new Object[]{str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("scene", str);
        sendUT("LoginAPI_BindAlipay", properties, true);
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str3, Object... objArr) {
                str3.hashCode();
                int hashCode = str3.hashCode();
                throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$7");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.bindAlipay(str, str2);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static synchronized boolean checkInit() {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[0])).booleanValue();
            }
            if (LoginApiContext.isLoginSDKInited && isMainProcess()) {
                z = true;
            }
            return z;
        }
    }

    public static boolean checkLoginCookieValid() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6206b02", new Object[0])).booleanValue();
        }
        try {
            if (checkSessionValid()) {
                CookieManager instance = CookieManager.getInstance();
                instance.setAcceptCookie(true);
                boolean z = false;
                boolean z2 = false;
                for (String str : instance.getCookie("https://.taobao.com").split(";")) {
                    if (!TextUtils.isEmpty(str) && str.trim().startsWith("unb") && !str.trim().endsWith("=")) {
                        z2 = true;
                    } else if (!TextUtils.isEmpty(str) && str.trim().startsWith("cookie2") && !str.trim().endsWith("=")) {
                        z = true;
                    }
                }
                if (z && z2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void checkLogoutPanelEnable(final ICheckResultCallback iCheckResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f431a5fe", new Object[]{iCheckResultCallback});
            return;
        }
        sendUT("LoginAPI_checkLogoutPanelEnable");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass23 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$23");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.checkLogoutPanelEnable(ICheckResultCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void checkMultiAccountPageEnable(final ICheckResultCallback iCheckResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434123d7", new Object[]{iCheckResultCallback});
            return;
        }
        sendUT("LoginAPI_checkMultiAccountPageEnable");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass21 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$21");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.checkMultiAccountPageEnable(ICheckResultCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void checkNickModifiable(final ICheckResultCallback iCheckResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0e2658", new Object[]{iCheckResultCallback});
            return;
        }
        sendUT("LoginAPI_checkNickModifiable");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass19 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$19");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.checkNickModifiable(ICheckResultCallback.this);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    private static void checkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec4cc1e", new Object[0]);
        } else if (mReceiver == null) {
            LoginBroadcastReceiver loginBroadcastReceiver = new LoginBroadcastReceiver();
            mReceiver = loginBroadcastReceiver;
            LoginBroadcastHelper.registerLoginReceiver(mContext, loginBroadcastReceiver);
        }
    }

    private static void checkSessionInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c726f425", new Object[0]);
            return;
        }
        try {
            if (CommonUtil.isInABTestRegion("checkSessionInit3", 1) && session == null) {
                sendUT("sessionNull3", false);
                session = SessionManager.getInstance(Globals.getApplication());
            }
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "checkSessionInit excetion", th);
            sendUT("checkSessionInitException");
        }
    }

    public static boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[0])).booleanValue();
        }
        checkSessionInit();
        ISession iSession = session;
        if (iSession == null) {
            return false;
        }
        boolean checkSessionValid = iSession.checkSessionValid();
        LoginTLogAdapter.e(TAG, " checkSessionValid sessionValid=:" + checkSessionValid + ",sProcessName=" + sProcessName);
        if (!checkSessionValid || !isMainProcess()) {
            LoginTLogAdapter.e(TAG, "checkSessionValid false: sid=" + getSid() + "  ;userid is empty?=" + TextUtils.isEmpty(getUserId()));
        } else {
            try {
                if (mContext == null) {
                    mContext = Globals.getApplication();
                }
                Context context = mContext;
                if (context != null) {
                    Mtop.instance(Mtop.Id.INNER, context).registerSessionInfo(getSid(), getUserId());
                    LoginTLogAdapter.e(TAG, "registerSessionInfo:" + getSid());
                }
                int i = 2;
                int i2 = LoginSwitch.getSwitch("sessionValidReport", 2);
                if (i2 > 0) {
                    i = i2;
                }
                if (System.currentTimeMillis() - sessionValidTrack > i * 60000) {
                    session.trackLoginValid("sessionValid", "checkSessionValid");
                    sessionValidTrack = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return checkSessionValid;
    }

    @Deprecated
    public static void clearHistoryNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5225a08", new Object[0]);
        } else {
            sendUT("LoginAPI_clearHistoryNames");
        }
    }

    @Deprecated
    public static void deleteLoadedListener(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536e8c9b", new Object[]{handler});
        } else if (handler != null) {
            handlerPool.remove(handler.toString());
            if (currentHandler == handler) {
                currentHandler = null;
            } else if (oAuthHandler == handler) {
                oAuthHandler = null;
            }
        }
    }

    public static boolean getCommentUsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbf9f11", new Object[0])).booleanValue();
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.isCommentTokenUsed();
        }
        return true;
    }

    public static String getCurrentActivityName(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("727099ea", new Object[]{activity});
        }
        if (activity != null) {
            return activity.getClass().getName();
        }
        return "";
    }

    public static String getEcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b43e5d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getEcode();
        }
        return "";
    }

    public static String getExtJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1db89666", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getExtJson();
        }
        return "";
    }

    public static String getHavanaSsoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd720e02", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOneTimeToken();
        }
        return "";
    }

    public static String getHeadPicLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getHeadPicLink();
        }
        return "";
    }

    public static String getLoginToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ac42b3", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getLoginToken();
        }
        return "";
    }

    public static String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getNick();
        }
        return "";
    }

    public static String getOldEncryptedUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bebdeaa0", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOldEncryptedUserId();
        }
        return "";
    }

    public static String getOldNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e34e2585", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOldNick();
        }
        return "";
    }

    public static String getOldSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a81efc", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOldSid();
        }
        return "";
    }

    public static String getOldUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ec82c2", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOldUserId();
        }
        return "";
    }

    public static String getSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("169fb061", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getSid();
        }
        return "";
    }

    public static String getSsoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ac5859", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getSsoToken();
        }
        return "";
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getUserId();
        }
        return "";
    }

    @Deprecated
    public static String getUserName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getUserName();
        }
        return "";
    }

    public static synchronized void init(Context context) {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
                return;
            }
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (session == null) {
                session = SessionManager.getInstance(applicationContext);
            }
            sendUT("LoginAPI_init", false);
        }
    }

    @Deprecated
    public static void initInjectVst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c1885d", new Object[0]);
        } else {
            sendUT("LoginAPI_initInjectVst");
        }
    }

    public static boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{str})).booleanValue();
        }
        try {
            return isLoginUrlInner(LoginUrlConstants.getLoginUrls(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isLoginUrlInner(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca65fbc5", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (mLoginPatterns == null && !TextUtils.isEmpty(str)) {
            String[] split = str.split("[;]");
            Pattern[] patternArr = new Pattern[split.length];
            mLoginPatterns = patternArr;
            int length = patternArr.length;
            for (int i = 0; i < length; i++) {
                mLoginPatterns[i] = Pattern.compile(split[i]);
            }
        }
        for (Pattern pattern : mLoginPatterns) {
            if (pattern.matcher(str2).matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLogoutUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df331d0", new Object[]{str})).booleanValue();
        }
        try {
            return isLogoutUrlInner(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isLogoutUrlInner(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec7c1f0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (mLogoutPatterns == null && !TextUtils.isEmpty(LoginUrlConstants.getLogoutUrls())) {
            String[] split = LoginUrlConstants.getLogoutUrls().split("[;]");
            Pattern[] patternArr = new Pattern[split.length];
            mLogoutPatterns = patternArr;
            int length = patternArr.length;
            for (int i = 0; i < length; i++) {
                mLogoutPatterns[i] = Pattern.compile(split[i]);
            }
        }
        for (Pattern pattern : mLogoutPatterns) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        if (TextUtils.isEmpty(sProcessName)) {
            sProcessName = LoginThreadHelper.getCurProcessName(mContext);
        }
        return TextUtils.equals(sProcessName, "com.taobao.taobao");
    }

    public static void login(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95000964", new Object[]{new Boolean(z)});
        } else {
            login(z, (Bundle) null);
        }
    }

    @Deprecated
    public static void loginByKey(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f5c713", new Object[]{str, new Integer(i)});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("type", i + "");
        sendUT("LoginAPI_LoginByKey", properties, true);
    }

    public static void logout(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64458fe3", new Object[]{new Boolean(z)});
            return;
        }
        sendUT("LoginAPI_Logout");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$9");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.logout(z);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void navByScene(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ddb1e99", new Object[]{context, str});
            return;
        }
        Properties properties = new Properties();
        if (!TextUtils.isEmpty(str)) {
            properties.setProperty("scene", str);
        }
        sendUT("LoginAPI_NavByScene");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$13");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                Login.access$000();
                iLogin.navByScene(str);
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    public static void notifyLoginFailed(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7107c6", new Object[]{str, new Boolean(z)});
        } else if (mContext != null) {
            LoginAction loginAction = LoginAction.NOTIFY_LOGIN_FAILED;
            Intent intent = new Intent(loginAction.name());
            intent.putExtra("errorCode", SecExceptionCode.SEC_ERROR_STA_KEY_ENC_UNKNOWN_ERROR);
            intent.putExtra("resetFlag", String.valueOf(z));
            BroadCastHelper.doSendBroadcast(intent);
            LoginTLogAdapter.e(TAG, str + "  sendBroadcast:" + loginAction.name() + ",errorCode=799");
        } else {
            LoginTLogAdapter.e(TAG, "mContext is null ,Login.init 未调用！！！");
        }
    }

    public static void notifyLoginFailedOnServiceTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e664a14f", new Object[0]);
        } else {
            notifyLoginFailed("notifyLoginFailedOnServiceTimeout", false);
        }
    }

    private static void notifyRefreshResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6331427e", new Object[]{new Boolean(z)});
            return;
        }
        try {
            sendUT("notifyRefreshResult");
            LoginAction loginAction = LoginAction.NOTIFY_REFRESH_COOKIES;
            Intent intent = new Intent(loginAction.name());
            intent.putExtra(REFRESH_RESULT, z);
            BroadCastHelper.doSendBroadcast(intent);
            LoginTLogAdapter.e(TAG, "sendBroadcast:" + loginAction.name());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openMultiAccountPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70673d4", new Object[0]);
            return;
        }
        sendUT("LoginAPI_openMultiAccountPage");
        remoteMethodCall(102);
    }

    public static void preInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8aa55a", new Object[0]);
        } else if (!checkInit()) {
            LoginTLogAdapter.e(TAG, "preInitWithCallback: start init");
            triggerLoginBundle();
            t5r.b("login_sdk_init_by_splash", "true");
        }
    }

    public static void refreshCookies() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0535bb", new Object[0]);
            return;
        }
        sendUT("LoginAPI_RefreshCookies");
        if (!checkSessionValid()) {
            notifyRefreshResult(false);
            return;
        }
        synchronized (mLock) {
            try {
                if (System.currentTimeMillis() - LoginStatus.getLastRefreshCookieTime() > 1800000) {
                    LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis());
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            final LoginServiceTask<Void, Void, Boolean> loginServiceTask = new LoginServiceTask<Void, Void, Boolean>() { // from class: com.taobao.login4android.api.Login.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$15");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.taobao.login4android.api.LoginServiceTask
                public Boolean excuteTask(ILogin iLogin) throws RemoteException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Boolean) ipChange2.ipc$dispatch("8a2e7042", new Object[]{this, iLogin});
                    }
                    Login.access$000();
                    return Boolean.valueOf(iLogin.refreshCookies());
                }

                public void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                        return;
                    }
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis() - Login.COOKIES_REFRESH_SHRINK);
                    }
                    Login.access$200(bool.booleanValue());
                }
            };
            Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LoginServiceTask.this.run();
                    }
                }
            });
            return;
        }
        notifyRefreshResult(false);
    }

    private static void remoteMethodCall(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06ef6b7", new Object[]{new Integer(i)});
            return;
        }
        sendUT("LoginAPI_remoteMethodCall");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass25 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$25");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                int i2 = i;
                if (i2 == 101) {
                    iLogin.showLogoutPanel();
                    return null;
                } else if (i2 != 102) {
                    return null;
                } else {
                    iLogin.openMultiAccountPage();
                    return null;
                }
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    @Deprecated
    private static void sendMessage(Handler handler, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe13e45", new Object[]{handler, bundle, new Integer(i)});
        } else if (bundle != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = bundle;
            obtainMessage.sendToTarget();
        } else {
            handler.sendEmptyMessage(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r0.add(r2.getKey());
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void sendToHander(int r5, android.os.Bundle r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.api.Login.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r5)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r1
            r1 = 1
            r5[r1] = r6
            java.lang.String r6 = "f755ae57"
            r0.ipc$dispatch(r6, r5)
            return
        L_0x001b:
            android.os.Handler r0 = com.taobao.login4android.api.Login.currentHandler
            if (r0 == 0) goto L_0x0022
            sendMessage(r0, r6, r5)
        L_0x0022:
            android.os.Handler r0 = com.taobao.login4android.api.Login.oAuthHandler
            if (r0 == 0) goto L_0x002d
            android.os.Handler r1 = com.taobao.login4android.api.Login.currentHandler
            if (r1 == r0) goto L_0x002d
            sendMessage(r0, r6, r5)
        L_0x002d:
            if (r5 <= 0) goto L_0x008e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.os.Handler>> r0 = com.taobao.login4android.api.Login.handlerPool
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008e
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.os.Handler>> r1 = com.taobao.login4android.api.Login.handlerPool
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0048:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.os.Handler r3 = (android.os.Handler) r3
            if (r3 == 0) goto L_0x006e
            android.os.Handler r4 = com.taobao.login4android.api.Login.currentHandler
            if (r3 == r4) goto L_0x006e
            android.os.Handler r4 = com.taobao.login4android.api.Login.oAuthHandler
            if (r3 == r4) goto L_0x006e
            sendMessage(r3, r6, r5)
            goto L_0x0048
        L_0x006e:
            if (r3 != 0) goto L_0x0048
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L_0x0048
        L_0x0078:
            java.util.Iterator r5 = r0.iterator()
        L_0x007c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008e
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.os.Handler>> r0 = com.taobao.login4android.api.Login.handlerPool
            r0.remove(r6)
            goto L_0x007c
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.api.Login.sendToHander(int, android.os.Bundle):void");
    }

    public static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
        } else {
            sendUT(str, null, true);
        }
    }

    public static synchronized void sessionInitCheck(Context context) {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e1fe07f", new Object[]{context});
                return;
            }
            if (session == null) {
                init(context);
                sendUT("LoginAPI_sessionInitCheck", false);
            } else {
                sendUT("LoginAPI_sessionInitCheckNoNeed", false);
            }
        }
    }

    public static void setCommentUsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c318a73", new Object[]{new Boolean(z)});
            return;
        }
        ISession iSession = session;
        if (iSession != null) {
            iSession.setCommentTokenUsed(z);
        }
    }

    public static void setLaunchBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b825776", new Object[]{bundle});
            return;
        }
        launchBundle = bundle;
        sendUT("LoginAPI_setLaunchBundle");
    }

    public static void showLogoutPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91f7564", new Object[0]);
            return;
        }
        sendUT("LoginAPI_checkNickModifiable");
        remoteMethodCall(101);
    }

    public static void triggerLoginBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4d3b7a", new Object[0]);
            return;
        }
        sendUT("LoginAPI_triggerLoginBundle");
        final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$5");
            }

            @Override // com.taobao.login4android.api.LoginServiceTask
            public Void excuteTask(ILogin iLogin) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                }
                iLogin.triggerLoginBundle();
                return null;
            }
        };
        Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LoginServiceTask.this.run();
                }
            }
        });
    }

    private static void uccMethod(final int i, final String str, final Map<String, String> map, final IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf347c07", new Object[]{new Integer(i), str, map, iUccCallback});
            return;
        }
        sendUT("LoginAPI_uccMethod");
        if (LoginSwitch.getSwitch("newUccInterface", "true")) {
            try {
                if (mContext == null) {
                    mContext = Globals.getApplication();
                }
                AliMemberSDK.init(mContext, new InitResultCallback() { // from class: com.taobao.login4android.api.Login.27
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.core.callback.FailureCallback
                    public void onFailure(int i2, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i2), str2});
                        }
                    }

                    @Override // com.ali.user.open.core.callback.InitResultCallback
                    public void onSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            return;
                        }
                        if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).setUccDataProvider(new DefaultDataProvider());
                        }
                        UccCallback uccCallback = new UccCallback() { // from class: com.taobao.login4android.api.Login.27.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.open.ucc.UccCallback
                            public void onFail(String str2, int i2, String str3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i2), str3});
                                    return;
                                }
                                IUccCallback iUccCallback2 = IUccCallback.this;
                                if (iUccCallback2 != null) {
                                    try {
                                        iUccCallback2.onFail(str2, i2, str3);
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            }

                            @Override // com.ali.user.open.ucc.UccCallback
                            public void onSuccess(String str2, Map map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b5e17230", new Object[]{this, str2, map2});
                                    return;
                                }
                                IUccCallback iUccCallback2 = IUccCallback.this;
                                if (iUccCallback2 != null) {
                                    try {
                                        iUccCallback2.onSuccess(str2, map2);
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            }
                        };
                        int i2 = i;
                        if (i2 == 1) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).trustLogin(str, map, uccCallback);
                        } else if (i2 == 2) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).bind(str, map, uccCallback);
                        } else if (i2 == 3) {
                            ((UccService) AliMemberSDK.getService(UccService.class)).unbind(str, uccCallback);
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            final LoginServiceTask<Void, Void, Void> loginServiceTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.28
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass28 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$28");
                }

                @Override // com.taobao.login4android.api.LoginServiceTask
                public Void excuteTask(ILogin iLogin) throws RemoteException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                    }
                    int i2 = i;
                    if (i2 == 1) {
                        iLogin.uccTrustLogin(str, map, iUccCallback);
                        return null;
                    } else if (i2 == 2) {
                        iLogin.uccBind(str, map, iUccCallback);
                        return null;
                    } else if (i2 != 3) {
                        return null;
                    } else {
                        iLogin.uccUnbind(str, iUccCallback);
                        return null;
                    }
                }
            };
            Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.29
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LoginServiceTask.this.run();
                    }
                }
            });
        }
    }

    public static void uccUnbind(String str, IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca3cfae", new Object[]{str, iUccCallback});
        } else {
            uccMethod(3, str, null, iUccCallback);
        }
    }

    public static String getEncryptLoginToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9968efe", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        return context.getSharedPreferences("userinfo", 0).getString(SessionConstants.AUTO_LOGIN_STR, "");
    }

    public static boolean isLoginUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c07d2af", new Object[]{str, str2})).booleanValue();
        }
        try {
            return isLoginUrlInner(str, str2);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void login(final boolean z, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e478f0", new Object[]{new Boolean(z), bundle});
            return;
        }
        if (mContext == null) {
            mContext = Globals.getApplication();
            LoginTLogAdapter.e(TAG, "更新mContext值");
            sendUT("contextNullWhenLogin", true);
        }
        if (session == null) {
            sendUT("sessionNullWhenLogin", true);
            try {
                session = SessionManager.getInstance(Globals.getApplication());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        try {
            LoginStatus.dumpTrace = Log.getStackTraceString(new Throwable());
            LoginTLogAdapter.e(TAG, "start login: showUI:" + z);
            if (TextUtils.isEmpty(sProcessName)) {
                sProcessName = LoginThreadHelper.getCurProcessName(mContext);
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Properties properties = new Properties();
            properties.put("showLoginUI", Boolean.valueOf(z));
            properties.put("processName", sProcessName);
            if (!bundle.isEmpty()) {
                for (String str : bundle.keySet()) {
                    properties.put(str, bundle.get(str));
                }
            }
            sendUT("LoginAPI_Login", properties, true);
            bundle.putString("process_name", sProcessName);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        String string = bundle == null ? "" : bundle.getString("source");
        if (!checkInit()) {
            LoginStatus.resetLoginFlag();
            notifyLoginFailed("checkInitFailed", LoginSwitch.getSwitch("resetFlagWhenFail", "false"));
            triggerLoginBundle();
        } else if (!LoginStatus.compareAndSetLogining(false, true)) {
            LoginTLogAdapter.e(TAG, "login: return because is logining right now. isLogining=true, userLogin=" + LoginStatus.isUserLogin() + ", lastLoginTime=" + LoginStatus.getLastLoginTime());
            long currentTimeMillis = System.currentTimeMillis() - LoginStatus.getLastLoginTime();
            int i = LoginSwitch.getSwitch("api_time_out", 20000);
            if (z && (currentTimeMillis >= i || LoginStatus.isUserLogin())) {
                LoginServiceTask loginServiceTask = loginTask;
                if (!(loginServiceTask == null || loginServiceTask.isCancelled() || loginTask.getStatus() == AsyncTask.Status.FINISHED)) {
                    try {
                        loginTask.cancel(true);
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                loginTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$1");
                    }

                    @Override // com.taobao.login4android.api.LoginServiceTask
                    public Void excuteTask(ILogin iLogin) throws RemoteException {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                        }
                        Login.access$000();
                        if (LoginSwitch.getSwitch("openWhenIsLogin", "false") || LoginStatus.isUserLogin()) {
                            LoginStatus.sdkSessionTraceID = ApiReferer.generateSdkSessionTraceId();
                            iLogin.userLogin();
                            LoginTLogAdapter.e(LoginServiceTask.TAG, "loginWithBundle finish");
                            UserTrackAdapter.sendExtendUT("OPEN_LOGIN_PAGE_WHEN_TIMEOUT", "api");
                            return null;
                        }
                        LoginStatus.resetLoginFlag();
                        Login.sendUT("resetLoginFlag");
                        return null;
                    }
                };
                Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Login.access$100().run();
                        }
                    }
                });
            } else if (z && LoginSwitch.getSwitch("supportConcurrent", "true")) {
                if (TextUtils.isEmpty(string)) {
                    LoginTLogAdapter.e(TAG, "showLoginUI=true,but source is null");
                    return;
                }
                String config = LoginSwitch.getConfig("concurrentShowUI", "tb_minor");
                if (!TextUtils.isEmpty(config)) {
                    boolean inList = SDKUtil.inList(string, config);
                    LoginTLogAdapter.e(TAG, "inList = " + inList);
                    if (inList) {
                        LoginStatus.concurrentShowUI = true;
                    }
                }
            }
        } else {
            if (bundle != null) {
                LoginTLogAdapter.e(TAG, "start login: extraData=" + bundle + ",apiReferer=" + bundle.getString(LoginConstants.MTOP_API_REFERENCE));
                LoginStatus.browserRefUrl = bundle.getString(LoginConstants.BROWSER_REF_URL);
                LoginStatus.mtopApiReferer = bundle.getString(LoginConstants.MTOP_API_REFERENCE);
            } else {
                LoginTLogAdapter.e(TAG, "start login: extraData=null");
                LoginStatus.browserRefUrl = "";
                LoginStatus.mtopApiReferer = "";
            }
            LoginStatus.sdkSessionTraceID = ApiReferer.generateSdkSessionTraceId();
            loginTask = new LoginServiceTask<Void, Void, Void>() { // from class: com.taobao.login4android.api.Login.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/api/Login$3");
                }

                @Override // com.taobao.login4android.api.LoginServiceTask
                public Void excuteTask(ILogin iLogin) throws RemoteException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("2b4e7058", new Object[]{this, iLogin});
                    }
                    LoginTLogAdapter.e(LoginServiceTask.TAG, "run: LoginServiceTask 2 loginWithBundle");
                    Login.access$000();
                    iLogin.loginWithBundle(z, bundle);
                    LoginTLogAdapter.e(LoginServiceTask.TAG, "loginWithBundle finish");
                    return null;
                }
            };
            Coordinator.execute(new Runnable() { // from class: com.taobao.login4android.api.Login.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Login.access$100().run();
                    }
                }
            });
        }
    }

    public static void pwdLogin(String str, String str2, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d3b478", new Object[]{str, str2, commonCallback});
            return;
        }
        sendUT("LoginAPI_LoginByKey", true);
        if (commonCallback != null) {
            if (!checkInit()) {
                triggerLoginBundle();
                commonCallback.onFail(-1, "not inited");
                return;
            }
            LoginParam loginParam = new LoginParam();
            loginParam.site = DataProviderFactory.getDataProvider().getSite();
            loginParam.loginId = str;
            loginParam.password = str2;
            if (ServiceFactory.getService(LoginService.class) != null) {
                ((LoginService) ServiceFactory.getService(LoginService.class)).pwdLogin(loginParam, commonCallback);
            } else {
                commonCallback.onFail(-1, "not initd");
            }
        }
    }

    public static boolean recordAndCheckNeedLogin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cedad986", new Object[]{str})).booleanValue();
        }
        if (!LoginSwitch.getSwitch("check_need_login", "true")) {
            return false;
        }
        SessionManager.sendCustomTrack("recordAndCheckNeedLogin", str, null);
        if (!checkInit()) {
            triggerLoginBundle();
            return false;
        } else if (!checkSessionValid() && TextUtils.isEmpty(getLoginToken())) {
            return NeedLoginPresenter.checkNeedShowUI(str);
        } else {
            return false;
        }
    }

    public static void sendUT(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842e765c", new Object[]{str, new Boolean(z)});
        } else {
            sendUT(str, null, z);
        }
    }

    public static void uccBind(String str, Map<String, String> map, IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd383b4", new Object[]{str, map, iUccCallback});
        } else {
            uccMethod(2, str, map, iUccCallback);
        }
    }

    public static void uccTrustLogin(String str, Map<String, String> map, IUccCallback iUccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a30c40", new Object[]{str, map, iUccCallback});
        } else {
            uccMethod(1, str, map, iUccCallback);
        }
    }

    public static boolean isLoginPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("781b82ab", new Object[]{activity})).booleanValue();
        }
        String currentActivityName = getCurrentActivityName(activity);
        if (TextUtils.isEmpty(currentActivityName)) {
            return false;
        }
        if ("com.taobao.android.sns4android.alipay2.AlipaySSOResultActivity".equals(currentActivityName) || "com.ali.user.mobile.login.ui.UserLoginActivity".equals(currentActivityName) || "com.ali.user.mobile.webview.WebViewActivity".equals(currentActivityName) || "com.ali.user.mobile.register.ui.AliUserRegisterActivity".equals(currentActivityName) || "com.ali.user.mobile.register.ui.AliUserRegisterSMSCodeActivity".equals(currentActivityName) || "com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity".equals(currentActivityName) || "com.ali.user.mobile.login.ui.HalfTransparentUserLoginActivity".equals(currentActivityName) || "com.ali.user.mobile.login.ui.AliUserCodeActivity".equals(currentActivityName)) {
            return true;
        }
        String config = LoginSwitch.getConfig("loginPages", "");
        if (!TextUtils.isEmpty(config)) {
            return SDKUtil.inList(currentActivityName, config);
        }
        return false;
    }

    public static void sendUT(String str, Properties properties, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83f14e0", new Object[]{str, properties, new Boolean(z)});
        } else {
            sendUT(str, properties, 0, z);
        }
    }

    @Deprecated
    public static void loginByKey(String str, int i, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e768eec3", new Object[]{str, new Integer(i), handler});
            return;
        }
        addLoadedListener(handler);
        loginByKey(str, i);
    }

    @Deprecated
    public static void logout(boolean z, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54c2f93", new Object[]{new Boolean(z), handler});
            return;
        }
        addLoadedListener(handler);
        logout(true);
    }

    public static void sendUT(String str, Properties properties, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9c7fa5", new Object[]{str, properties, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            boolean isMainProcess = isMainProcess();
            if (properties == null) {
                properties = new Properties();
            }
            if (i == 0) {
                properties.put(ArtcStats.STAT_RETRYCOUNT, Integer.valueOf(i));
                properties.put("processName", sProcessName);
                properties.put("time1", Long.valueOf(System.currentTimeMillis()));
                properties.setProperty(g1v.FIELD_ARG2, isMainProcess ? "1" : "0");
                if (!isMainProcess || LoginSwitch.getSwitch("reportTrace", "true")) {
                    properties.setProperty(g1v.FIELD_ARG3, Log.getStackTraceString(new Throwable()));
                }
            }
            boolean isInit = UTAnalytics.getInstance().isInit();
            if (z) {
                LoginTLogAdapter.e(TAG, "sendUT lable:" + str + " mainProcess:" + isMainProcess + " processName:" + sProcessName + " retryCount:" + i + " utInit：" + isInit + "  dump:" + Log.getStackTraceString(new Throwable()));
            } else {
                LoginTLogAdapter.e(TAG, "sendUT label:" + str + " mainProcess:" + isMainProcess + " processName:" + sProcessName + " retryCount:" + i + " utInit：" + isInit);
            }
            SessionManager.sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, "", "", m3i.b(properties), false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public static void bindAlipay(String str, String str2, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97140232", new Object[]{str, str2, handler});
            return;
        }
        addLoadedListener(handler);
        bindAlipay(str, str2);
    }

    @Deprecated
    public static void login(Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e9834", new Object[]{handler, new Boolean(z)});
        } else {
            login(handler, z, null);
        }
    }

    @Deprecated
    public static void login(Handler handler, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25fd5820", new Object[]{handler, new Boolean(z), bundle});
            return;
        }
        addLoadedListener(handler);
        login(z, bundle);
    }
}
