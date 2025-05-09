package com.taobao.login4android.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.login4android.session.cookies.LoginCookie;
import com.taobao.login4android.session.cookies.LoginCookieUtils;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.BackgroundExecutor;
import com.taobao.login4android.utils.FileUtils;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ThreadHelper;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.f7l;
import tb.g1v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionManager implements ISession {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLEAR_SESSION_ACTION = "NOTIFY_CLEAR_SESSION";
    private static final String CLEAR_SESSION_COOKIES_ACTION = "NOTIFY_CLEAR_SESSION_COOKIES";
    public static final String CURRENT_PROCESS = "PROCESS_NAME";
    public static final String DOMAIN_TAOBAO = ".taobao.com";
    public static final String GET_TAG = "logingetsdk.LoginSessionManager";
    public static final String INIT_TAG = "init.login-tag";
    private static final String NEW_SESSION_TAG = "newSession";
    public static final String NOTIFY_SESSION_VALID = "NOTIFY_SESSION_VALID";
    private static final String TAG = "login_optimize";
    public static final String USERINFO = "userinfo";
    public static InjectHandler injectHandler;
    private static BroadcastReceiver receiver;
    private static SecurityGuardManager securityGuardManager;
    private String extJson;
    private String mAutoLoginToken;
    private String mBiometricId;
    private Context mContext;
    private String mCookieStr;
    private String mDomainListStr;
    private String mEcode;
    private String mEmail;
    private long mHavanaSsoTokenExpiredTime;
    private String mHeadPicLink;
    private int mInjectCookieCount;
    private boolean mIsCommentUsed;
    public String mLoginPhone;
    private int mLoginSite;
    private long mLoginTime;
    private String mNick;
    private String mOldEncryptedUserId;
    private String mOldNick;
    private String mOldSid;
    private String mOldUserId;
    private String mSessionDisastergrd;
    private long mSessionExpiredTime;
    private String mShowNick;
    private String mSid;
    private String mSubSid;
    private String mUidDigest;
    private String mUserId;
    private String mUserName;
    private SharedPreferences storage;
    private static boolean DEBUG = false;
    private static SessionManager instance = null;
    public static boolean isNeedCleanSessionCookie = true;
    private static final Object checkLock = new Object();
    public String CHANNEL_PROCESS = ":channel";
    private List<LoginCookie> mCookie = new CopyOnWriteArrayList();
    private boolean mNewSessionTag = false;
    private boolean uninstallReloginOnce = false;
    public boolean canWriteUT = true;

    static {
        t2o.a(516947985);
        t2o.a(516947983);
    }

    public SessionManager() {
    }

    public static /* synthetic */ Context access$000(SessionManager sessionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("79589174", new Object[]{sessionManager});
        }
        return sessionManager.mContext;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        DEBUG = z;
        return z;
    }

    public static /* synthetic */ BroadcastReceiver access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("982bb3b0", new Object[0]);
        }
        return receiver;
    }

    public static /* synthetic */ BroadcastReceiver access$202(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("28858763", new Object[]{broadcastReceiver});
        }
        receiver = broadcastReceiver;
        return broadcastReceiver;
    }

    public static /* synthetic */ void access$300(SessionManager sessionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85bdf19", new Object[]{sessionManager});
        } else {
            sessionManager.clearMemoryData();
        }
    }

    public static /* synthetic */ void access$400(SessionManager sessionManager, SessionParams sessionParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c35d562", new Object[]{sessionManager, sessionParams});
        } else {
            sessionManager.initChildProcessMemoryData(sessionParams);
        }
    }

    public static /* synthetic */ void access$500(SessionManager sessionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac884d7", new Object[]{sessionManager});
        } else {
            sessionManager.clearChildProcessCookies();
        }
    }

    public static /* synthetic */ void access$600(SessionManager sessionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfed7b6", new Object[]{sessionManager});
        } else {
            sessionManager.initMemoryData();
        }
    }

    public static /* synthetic */ List access$700(SessionManager sessionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eafd8b12", new Object[]{sessionManager});
        }
        return sessionManager.mCookie;
    }

    public static /* synthetic */ void access$800(SessionManager sessionManager, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f25cb2b", new Object[]{sessionManager, strArr});
        } else {
            sessionManager.clearWebviewCookie(strArr);
        }
    }

    private void clearChildProcessCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed2e2d6", new Object[]{this});
        } else {
            new Thread("clear-cookie-data") { // from class: com.taobao.login4android.session.SessionManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/session/SessionManager$2");
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String readFileData = FileUtils.readFileData(SessionManager.access$000(SessionManager.this), SessionConstants.INJECT_COOKIE_OLD);
                        if (!TextUtils.isEmpty(readFileData)) {
                            SessionManager.access$700(SessionManager.this).addAll(JSON.parseArray(SessionManager.this.decrypt(readFileData), LoginCookie.class));
                            SessionManager sessionManager = SessionManager.this;
                            SessionManager.access$800(sessionManager, sessionManager.getSsoDomainList());
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }.start();
        }
    }

    private void clearWebviewCookie(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b1cc8", new Object[]{this, strArr});
        } else {
            clearWebviewCookie(strArr, false);
        }
    }

    private void doSidCheck(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ef1756", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.contains(f7l.MOD)) {
                clearMemoryData();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void flushCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2328df0f", new Object[]{this});
            return;
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        SessionManager sessionManager = instance;
        if (sessionManager != null) {
            return sessionManager.mContext;
        }
        return null;
    }

    public static synchronized SessionManager getInstance(Context context) {
        synchronized (SessionManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SessionManager) ipChange.ipc$dispatch("d97ef9", new Object[]{context});
            }
            if (instance == null && context != null) {
                instance = new SessionManager(context);
            }
            return instance;
        }
    }

    private void initAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6be55d3", new Object[]{this});
        } else {
            new AnonymousClass1("login-session-init").start();
        }
    }

    private void initChildProcessMemoryData(SessionParams sessionParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e54627f", new Object[]{this, sessionParams});
        } else if (sessionParams != null) {
            this.mUserId = sessionParams.mUserId;
            this.mAutoLoginToken = sessionParams.mAutoLoginToken;
            this.mNick = sessionParams.mNick;
            this.mSid = sessionParams.mSid;
            LoginTLogAdapter.e("login_optimize", "initChildProcessMemoryData sid:" + this.mSid);
            this.mEcode = sessionParams.mEcode;
            this.mEmail = sessionParams.mEmail;
            this.mHavanaSsoTokenExpiredTime = sessionParams.mHavanaSsoTokenExpiredTime;
            this.mHeadPicLink = sessionParams.mHeadPicLink;
            this.mLoginPhone = sessionParams.mLoginPhone;
            this.mLoginSite = sessionParams.mLoginSite;
            this.mLoginTime = sessionParams.mLoginTime;
            this.mOldNick = sessionParams.mOldNick;
            this.mOldEncryptedUserId = sessionParams.mOldEncryptedUserId;
            this.mOldSid = sessionParams.mOldSid;
            this.mOldUserId = sessionParams.mOldUserId;
            this.mSessionDisastergrd = sessionParams.mSessionDisastergrd;
            this.mSessionExpiredTime = sessionParams.mSessionExpiredTime;
            this.mShowNick = sessionParams.mShowNick;
            this.mSubSid = sessionParams.mSubSid;
            this.mUidDigest = sessionParams.mUidDigest;
            this.mUserName = sessionParams.mUserName;
            this.mDomainListStr = sessionParams.domainList;
        }
    }

    private void initMemoryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbf3482", new Object[]{this});
            return;
        }
        String sid = getSid();
        getSubSid();
        getEcode();
        getLoginToken();
        getNick();
        getSessionExpiredTime();
        getSsoToken();
        getUserId();
        getOldUserId();
        getUserName();
        isCommentTokenUsed();
        isNewSessionTag();
        getExtJson();
        getLoginSite();
        getUidDigest();
        getOneTimeToken();
        getHavanaSsoTokenExpiredTime();
        doSidCheck(sid);
    }

    private void initSecurityGuardManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d2ea5f", new Object[]{this});
        } else if (securityGuardManager == null && this.mContext != null) {
            synchronized (checkLock) {
                try {
                    if (securityGuardManager == null) {
                        securityGuardManager = SecurityGuardManager.getInstance(this.mContext.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void initStorage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8b8a52", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context != null && this.storage == null) {
            this.storage = context.getSharedPreferences("userinfo", 4);
        }
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return DEBUG;
    }

    private void removeSingleCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cfdd8b", new Object[]{this, str, str2});
            return;
        }
        LoginCookie loginCookie = new LoginCookie();
        loginCookie.name = str;
        loginCookie.domain = str2;
        loginCookie.path = "/";
        loginCookie.value = "";
        LoginCookieUtils.expiresCookies(loginCookie);
        try {
            CookieManager.getInstance().setCookie(LoginCookieUtils.getHttpDomin(loginCookie), loginCookie.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void removeTargetCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb7be00", new Object[]{this});
            return;
        }
        removeUTCookie();
        removeWeitaoCookie();
    }

    private void removeUTCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c07b6e", new Object[]{this});
        } else {
            removeSingleCookie("unb", ".taobao.com");
        }
    }

    private void removeWeitaoCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80782b56", new Object[]{this});
        } else {
            removeSingleCookie("cookiej007", ".jaeapp.com");
        }
    }

    public static void sendCustomTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb5d0c3", new Object[]{str});
        } else {
            sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, "", "", null, false);
        }
    }

    private void setCookie(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
            return;
        }
        try {
            CookieManager.getInstance().setCookie(str, str2);
            if (!TextUtils.isEmpty(str2) && str2.contains("cookie2=") && str != null && str.contains("taobao")) {
                LoginTLogAdapter.e("login_optimize", "setCookie time:" + System.currentTimeMillis() + " cookie2:" + str2);
            }
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("cookie", str2);
            hashMap.put("msg", th.getMessage());
            sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "setCookieException", hashMap);
            if (str2 != null) {
                LoginTLogAdapter.e("login_optimize", str2 + ",setCookieException:" + th.getMessage());
                return;
            }
            LoginTLogAdapter.e("login_optimize", "cookie=null,setCookieException:" + th.getMessage());
        }
    }

    private void setOldNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7a13f9", new Object[]{this, str});
            return;
        }
        this.mOldNick = str;
        saveStorage(SessionConstants.OLDNICK, str);
    }

    private void setOldSid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a305adfa", new Object[]{this, str});
            return;
        }
        this.mOldSid = str;
        saveStorage(SessionConstants.OLDSID, encode(str));
    }

    public boolean checkHavanaExpired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2539da71", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() / 1000 > getHavanaSsoTokenExpiredTime()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.login4android.session.ISession
    public void clearAutoLoginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bdb5082", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", (Object) "clearAutoLoginInfo");
            appendEventTrace(JSON.toJSONString(jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
        sendCustomTrack("autologin_clear");
        LoginTLogAdapter.e("login_optimize", "Clear AutoLoginInfo");
        this.mAutoLoginToken = null;
        setLoginToken(null);
    }

    public void clearCookie(String[] strArr, final boolean z) {
        final LoginCookie loginCookie;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2128ad", new Object[]{this, strArr, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LoginTLogAdapter.e("login_optimize", "before getCookies");
        if (LoginSwitch.getSwitch("useCacheCookieFirst", "true")) {
            List<LoginCookie> list = this.mCookie;
            if (list == null || list.isEmpty()) {
                this.mCookie = getCookies();
            }
        } else {
            this.mCookie = getCookies();
            LoginTLogAdapter.e("login_optimize", "after getCookies");
        }
        List<LoginCookie> list2 = this.mCookie;
        if (list2 != null && !list2.isEmpty()) {
            LoginTLogAdapter.e("login_optimize", "get cookie not null");
            Iterator<LoginCookie> it = this.mCookie.iterator();
            while (true) {
                if (!it.hasNext()) {
                    loginCookie = null;
                    break;
                }
                loginCookie = it.next();
                if (LoginSwitch.SGCOOKIE.equals(loginCookie.name)) {
                    break;
                }
            }
            if (!z || loginCookie == null) {
                clearWebviewCookie(strArr);
            } else {
                new CopyOnWriteArrayList().add(loginCookie);
                clearWebviewCookie(strArr, z);
            }
            BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.session.SessionManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LoginTLogAdapter.e("login_optimize", "before write file");
                    FileUtils.writeFileData(SessionManager.access$000(SessionManager.this), SessionConstants.INJECT_COOKIE_OLD, FileUtils.readFileData(SessionManager.access$000(SessionManager.this), SessionConstants.INJECT_COOKIE_NEW));
                    if (!z || loginCookie == null) {
                        FileUtils.writeFileData(SessionManager.access$000(SessionManager.this), SessionConstants.INJECT_COOKIE_NEW, "");
                    } else {
                        Context access$000 = SessionManager.access$000(SessionManager.this);
                        SessionManager sessionManager = SessionManager.this;
                        FileUtils.writeFileData(access$000, SessionConstants.INJECT_COOKIE_NEW, sessionManager.encode(JSON.toJSONString(SessionManager.access$700(sessionManager))));
                    }
                    FileUtils.writeFileData(SessionManager.access$000(SessionManager.this), SessionConstants.INJECT_External_H5_COOKIE, "");
                }
            });
        }
        LoginTLogAdapter.e("login_optimize", "before remove cookie");
        try {
            if (isNeedCleanSessionCookie) {
                CookieManager.getInstance().removeSessionCookie();
            }
            CookieManager.getInstance().removeExpiredCookie();
            flushCookie();
            long currentTimeMillis2 = System.currentTimeMillis();
            LoginTLogAdapter.e("login_optimize", "after remove cookie,cost = " + (currentTimeMillis2 - currentTimeMillis));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void clearCookie2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755df48", new Object[]{this});
        } else {
            clearWebviewCookie(getSsoDomainList(), true, true);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void clearCookieManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baab39e3", new Object[]{this});
        } else {
            clearCookieManager(false);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void clearSessionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8214d0de", new Object[]{this});
        } else {
            clearSessionInfo(LoginSwitch.getSwitch(LoginSwitch.SGCOOKIE, "true"));
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void clearSessionOnlyCookie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d739da0", new Object[]{this});
            return;
        }
        try {
            CookieManager.getInstance().removeSessionCookie();
            CookieManager.getInstance().removeExpiredCookie();
            flushCookie();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String decrypt(String str) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c54002", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        sendCustomTrack("decode_commit");
        try {
            initSecurityGuardManager();
            SecurityGuardManager securityGuardManager2 = securityGuardManager;
            if (securityGuardManager2 == null || (dynamicDataEncryptComp = securityGuardManager2.getDynamicDataEncryptComp()) == null) {
                return "";
            }
            if (str.length() <= 4 || str.charAt(3) != '&') {
                str2 = dynamicDataEncryptComp.dynamicDecrypt(str);
            } else {
                str2 = dynamicDataEncryptComp.dynamicDecryptDDp(str);
            }
            sendCustomTrack("decode_success");
            return str2;
        } catch (Exception e) {
            sendCustomTrack("decode_failure");
            e.printStackTrace();
            return "";
        }
    }

    public String encode(String str) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        sendCustomTrack("encode_commit");
        try {
            initSecurityGuardManager();
            SecurityGuardManager securityGuardManager2 = securityGuardManager;
            if (!(securityGuardManager2 == null || (dynamicDataEncryptComp = securityGuardManager2.getDynamicDataEncryptComp()) == null)) {
                String dynamicEncryptDDp = dynamicDataEncryptComp.dynamicEncryptDDp(str);
                sendCustomTrack("encode_success");
                return TextUtils.isEmpty(dynamicEncryptDDp) ? str : dynamicEncryptDDp;
            }
        } catch (Exception e) {
            sendCustomTrack("encode_failure");
            e.printStackTrace();
        }
        return str;
    }

    public String getBiometricId() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc5d285c", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mBiometricId)) {
            return this.mBiometricId;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mBiometricId) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.BIOMETRIC, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mBiometricId = decrypt(string);
        }
        return this.mBiometricId;
    }

    public List<LoginCookie> getCookies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f9c17e7", new Object[]{this});
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        String readFileData = FileUtils.readFileData(this.mContext, SessionConstants.INJECT_COOKIE_NEW);
        if (readFileData != null && !readFileData.isEmpty()) {
            try {
                copyOnWriteArrayList.addAll(JSON.parseArray(decrypt(readFileData), LoginCookie.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return copyOnWriteArrayList;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getDisplayNick() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aa7244a", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mShowNick)) {
            return this.mShowNick;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mShowNick) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.SHOW_NICK, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mShowNick = string;
        }
        return this.mShowNick;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getEcode() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b43e5d", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mEcode)) {
            return this.mEcode;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mEcode) && (sharedPreferences = this.storage) != null) {
            try {
                String string = sharedPreferences.getString(SessionConstants.ECODE, "");
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                this.mEcode = decrypt(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.mEcode;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getEmail() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c52188d3", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mEmail)) {
            return this.mEmail;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mEmail) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString("email", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mEmail = decrypt(string);
        }
        return this.mEmail;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getEventTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15cdcad8", new Object[]{this});
        }
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        String string = sharedPreferences != null ? sharedPreferences.getString(SessionConstants.EVENT_TRACE, "") : null;
        return string != null ? string : "";
    }

    @Override // com.taobao.login4android.session.ISession
    public String getExtJson() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1db89666", new Object[]{this});
        }
        initStorage();
        if (TextUtils.isEmpty(this.extJson) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.EXT_JSON, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.extJson = decrypt(string);
        }
        return this.extJson;
    }

    @Override // com.taobao.login4android.session.ISession
    public long getHavanaSsoTokenExpiredTime() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("632590b6", new Object[]{this})).longValue();
        }
        long j = this.mHavanaSsoTokenExpiredTime;
        if (j > 0) {
            return j;
        }
        initStorage();
        if (this.mHavanaSsoTokenExpiredTime <= 0 && (sharedPreferences = this.storage) != null) {
            this.mHavanaSsoTokenExpiredTime = sharedPreferences.getLong(SessionConstants.HAVANA_SSO_TOKEN_EXPIRE, 0L);
        }
        return this.mHavanaSsoTokenExpiredTime;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getHeadPicLink() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mHeadPicLink)) {
            return this.mHeadPicLink;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mHeadPicLink) && (sharedPreferences = this.storage) != null) {
            this.mHeadPicLink = sharedPreferences.getString(SessionConstants.HEAD_PIC_LINK, "");
        }
        return this.mHeadPicLink;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getLoginPhone() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b105ea5e", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mLoginPhone)) {
            return this.mLoginPhone;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mLoginPhone) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.LOGIN_PHONE, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mLoginPhone = decrypt(string);
        }
        return this.mLoginPhone;
    }

    @Override // com.taobao.login4android.session.ISession
    public long getLoginTime() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2e3f9b", new Object[]{this})).longValue();
        }
        long j = this.mLoginTime;
        if (j > 0) {
            return j;
        }
        initStorage();
        if (this.mLoginTime == 0 && (sharedPreferences = this.storage) != null) {
            this.mLoginTime = sharedPreferences.getLong(SessionConstants.LOGIN_TIME, 0L);
        }
        return this.mLoginTime;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getLoginToken() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ac42b3", new Object[]{this});
        }
        LoginTLogAdapter.e("login_optimize", "getLoginToken");
        if (!TextUtils.isEmpty(this.mAutoLoginToken)) {
            LoginTLogAdapter.e("login_optimize", "after_getLoginToken_cache");
            return this.mAutoLoginToken;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mAutoLoginToken) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.AUTO_LOGIN_STR, "");
            if (TextUtils.isEmpty(string)) {
                LoginTLogAdapter.e("login_optimize", "after_getLoginToken_empty");
                return null;
            }
            this.mAutoLoginToken = decrypt(string);
        }
        LoginTLogAdapter.e("login_optimize", "after_getLoginToken");
        return this.mAutoLoginToken;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getNick() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mNick)) {
            return this.mNick;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mNick) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString("nick", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mNick = string;
        }
        return this.mNick;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getOldEncryptedUserId() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bebdeaa0", new Object[]{this});
        }
        LoginTLogAdapter.e(GET_TAG, "getOldEncryptedUserId");
        initStorage();
        if (TextUtils.isEmpty(this.mOldEncryptedUserId) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.OLD_ENCRYPTED_USERID, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mOldEncryptedUserId = decrypt(string);
        }
        LoginTLogAdapter.e(GET_TAG, "after_getOldEncryptedUserId");
        return this.mOldEncryptedUserId;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getOldNick() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e34e2585", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mOldNick)) {
            return this.mOldNick;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mOldNick) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.OLDNICK, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mOldNick = string;
        }
        return this.mOldNick;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getOldSid() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a81efc", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mOldSid)) {
            return this.mOldSid;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mOldSid) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.OLDSID, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mOldSid = decrypt(string);
        }
        return this.mOldSid;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getOldUserId() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ec82c2", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mOldUserId)) {
            return this.mOldUserId;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mOldUserId) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.OLDUSERID, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mOldUserId = decrypt(string);
        }
        return this.mOldUserId;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getOneTimeToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("120aa9d", new Object[]{this});
        }
        initStorage();
        if (checkHavanaExpired() || this.storage == null) {
            return null;
        }
        try {
            initStorage();
            String string = this.storage.getString(SessionConstants.OneTimeTOKEN, "");
            if (!TextUtils.isEmpty(string)) {
                return decrypt(string);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public String getSessionDisastergrd() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74ced221", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mSessionDisastergrd)) {
            return this.mSessionDisastergrd;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mSessionDisastergrd) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.SESSION_DISASTERGRD, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mSessionDisastergrd = string;
        }
        return this.mSessionDisastergrd;
    }

    @Override // com.taobao.login4android.session.ISession
    public long getSessionExpiredTime() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("826e2c8d", new Object[]{this})).longValue();
        }
        long j = this.mSessionExpiredTime;
        if (j > 0) {
            return j;
        }
        initStorage();
        if (this.mSessionExpiredTime <= 0 && (sharedPreferences = this.storage) != null) {
            this.mSessionExpiredTime = sharedPreferences.getLong(SessionConstants.SESSION_EXPIRED_TIME, 0L);
        }
        return this.mSessionExpiredTime;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getSid() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("169fb061", new Object[]{this});
        }
        LoginTLogAdapter.e(GET_TAG, "getSid");
        if (!TextUtils.isEmpty(this.mSid)) {
            LoginTLogAdapter.e(GET_TAG, "after_getSid_cache");
            return this.mSid;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mSid) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString("sid", "");
            if (TextUtils.isEmpty(string)) {
                LoginTLogAdapter.e(GET_TAG, "after_getSid_empty");
                return null;
            }
            this.mSid = decrypt(string);
        }
        LoginTLogAdapter.e(GET_TAG, "after_getSid");
        return this.mSid;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getSsoToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ac5859", new Object[]{this});
        }
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("ssoToken", "");
            if (!TextUtils.isEmpty(string)) {
                return decrypt(string);
            }
        }
        return null;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getSubSid() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f2fb415", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mSubSid)) {
            return this.mSubSid;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mSubSid) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.SUBSID, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mSubSid = decrypt(string);
        }
        return this.mSubSid;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getUidDigest() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf4a63b", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mUidDigest)) {
            return this.mUidDigest;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mUidDigest) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString(SessionConstants.SESSION_KEY, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mUidDigest = string;
        }
        return this.mUidDigest;
    }

    @Override // com.taobao.login4android.session.ISession
    public String getUserId() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        LoginTLogAdapter.e(GET_TAG, "getUserId");
        if (!TextUtils.isEmpty(this.mUserId)) {
            LoginTLogAdapter.e(GET_TAG, "after_getUserId_cache");
            return this.mUserId;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mUserId) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString("userId", "");
            if (TextUtils.isEmpty(string)) {
                LoginTLogAdapter.e(GET_TAG, "after_getUserId_empty");
                return null;
            }
            this.mUserId = decrypt(string);
        }
        try {
            Long.parseLong(this.mUserId);
            LoginTLogAdapter.e(GET_TAG, "after_getUserId");
            return this.mUserId;
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("invalidUserId", String.valueOf(this.mUserId));
            sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "userIdInvalid", hashMap);
            th.printStackTrace();
            LoginTLogAdapter.e(GET_TAG, "UserIdParseError");
            clearAutoLoginInfo();
            clearSessionInfo();
            return null;
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public String getUserName() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mUserName)) {
            return this.mUserName;
        }
        initStorage();
        if (TextUtils.isEmpty(this.mUserName) && (sharedPreferences = this.storage) != null) {
            String string = sharedPreferences.getString("username", "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            this.mUserName = string;
        }
        return this.mUserName;
    }

    @Override // com.taobao.login4android.session.ISession
    public synchronized void injectCookie(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2b31fc", new Object[]{this, strArr, strArr2});
        } else {
            injectCookie(strArr, strArr2, false);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public synchronized void injectExternalCookies(String[] strArr, final boolean z, boolean z2) {
        LoginCookie parseCookie;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adc70aa5", new Object[]{this, strArr, new Boolean(z), new Boolean(z2)});
                return;
            }
            if (!(this.mContext == null || strArr == null)) {
                List<LoginCookie> list = this.mCookie;
                if (list != null && list.size() == 0 && !z) {
                    this.mCookie = getCookies();
                } else if (this.mCookie == null) {
                    this.mCookie = new CopyOnWriteArrayList();
                }
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str) && (parseCookie = LoginCookieUtils.parseCookie(str)) != null) {
                        setCookie(LoginCookieUtils.getHttpDomin(parseCookie), parseCookie.toString());
                        List<LoginCookie> list2 = this.mCookie;
                        if (list2 != null) {
                            Iterator<LoginCookie> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    this.mCookie.add(parseCookie);
                                    break;
                                }
                                LoginCookie next = it.next();
                                if (next != null && TextUtils.equals(next.domain, parseCookie.domain) && TextUtils.equals(next.name, parseCookie.name)) {
                                    next.value = parseCookie.value;
                                    next.expiresString = parseCookie.expiresString;
                                    break;
                                }
                            }
                        }
                    }
                }
                BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.session.SessionManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (SessionManager.access$700(SessionManager.this) != null && !SessionManager.access$700(SessionManager.this).isEmpty() && !z) {
                            try {
                                Context access$000 = SessionManager.access$000(SessionManager.this);
                                SessionManager sessionManager = SessionManager.this;
                                FileUtils.writeFileData(access$000, SessionConstants.INJECT_COOKIE_NEW, sessionManager.encode(JSON.toJSONString(SessionManager.access$700(sessionManager))));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a8, code lost:
        if (android.text.TextUtils.equals(getOldNick(), r20) == false) goto L_0x00ad;
     */
    @Override // com.taobao.login4android.session.ISession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLoginSuccess(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, java.lang.String[] r28, java.lang.String[] r29, java.lang.String[] r30, long r31, long r33, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.session.SessionManager.onLoginSuccess(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String[], java.lang.String[], java.lang.String[], long, long, java.lang.String):void");
    }

    public void removeStorage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2694a8", new Object[]{this, str});
            return;
        }
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            edit.apply();
        }
    }

    public void saveStorage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c228e59", new Object[]{this, str, str2});
            return;
        }
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            if (str2 == null) {
                removeStorage(str);
            } else {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str, str2);
                edit.apply();
            }
            if (!this.mNewSessionTag) {
                setNewSessionTag(true);
            }
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setCommentTokenUsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6d5c94", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsCommentUsed = z;
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(SessionConstants.COMMENT_TOKEN_USED, z);
            edit.apply();
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setDisplayNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f493d4", new Object[]{this, str});
            return;
        }
        this.mShowNick = str;
        saveStorage(SessionConstants.SHOW_NICK, str);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setEcode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ac2321", new Object[]{this, str});
            return;
        }
        this.mEcode = str;
        saveStorage(SessionConstants.ECODE, encode(str));
    }

    @Override // com.taobao.login4android.session.ISession
    public void setEmail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be8276b", new Object[]{this, str});
            return;
        }
        this.mEmail = str;
        saveStorage("email", encode(str));
    }

    @Override // com.taobao.login4android.session.ISession
    public void setExtJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05dbf38", new Object[]{this, str});
            return;
        }
        this.extJson = str;
        saveStorage(SessionConstants.EXT_JSON, encode(str));
    }

    @Override // com.taobao.login4android.session.ISession
    public void setHavanaSsoTokenExpiredTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a9ce4e", new Object[]{this, new Long(j)});
            return;
        }
        this.mHavanaSsoTokenExpiredTime = j;
        saveStorage(SessionConstants.HAVANA_SSO_TOKEN_EXPIRE, j);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setHeadPicLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4eadf3", new Object[]{this, str});
            return;
        }
        this.mHeadPicLink = str;
        saveStorage(SessionConstants.HEAD_PIC_LINK, str);
    }

    public void setLoginPhone(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a0e8d8", new Object[]{this, str});
            return;
        }
        this.mLoginPhone = str;
        saveStorage(SessionConstants.LOGIN_PHONE, str);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setLoginSite(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e197c00e", new Object[]{this, new Integer(i)});
            return;
        }
        this.mLoginSite = i;
        saveStorage(SessionConstants.LOGIN_SITE, i);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setLoginToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c59b23", new Object[]{this, str});
        } else {
            saveStorage(SessionConstants.AUTO_LOGIN_STR, encode(str));
        }
    }

    public void setNewSessionTag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de21ecb", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mNewSessionTag = z;
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(NEW_SESSION_TAG, z);
            edit.apply();
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
            return;
        }
        this.mNick = str;
        saveStorage("nick", str);
        if (!TextUtils.isEmpty(str)) {
            setOldNick(str);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setOldEncryptedUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd124d6", new Object[]{this, str});
            return;
        }
        this.mOldEncryptedUserId = str;
        saveStorage(SessionConstants.OLD_ENCRYPTED_USERID, encode(str));
    }

    public void setOldUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace1915c", new Object[]{this, str});
            return;
        }
        this.mOldUserId = str;
        saveStorage(SessionConstants.OLDUSERID, encode(str));
    }

    @Override // com.taobao.login4android.session.ISession
    public void setOneTimeToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3931d79", new Object[]{this, str});
        } else {
            saveStorage(SessionConstants.OneTimeTOKEN, encode(str));
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setSDKHandler(InjectHandler injectHandler2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5c7ac6", new Object[]{this, injectHandler2});
        } else {
            injectHandler = injectHandler2;
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setSessionDisastergrd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88dd2d75", new Object[]{this, str});
            return;
        }
        this.mSessionDisastergrd = str;
        saveStorage(SessionConstants.SESSION_DISASTERGRD, str);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setSessionExpiredTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e187c2bf", new Object[]{this, new Long(j)});
            return;
        }
        this.mSessionExpiredTime = j;
        saveStorage(SessionConstants.SESSION_EXPIRED_TIME, j);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setSid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe33e9d", new Object[]{this, str});
            return;
        }
        this.mSid = str;
        saveStorage("sid", encode(str));
        setOldSid(str);
    }

    public void setSsoDomainList(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc6aaa9", new Object[]{this, strArr});
            return;
        }
        if (strArr != null) {
            str = JSON.toJSONString(strArr);
        } else {
            str = "";
        }
        saveStorage(SessionConstants.SSO_DOMAIN_LIST, str);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setSsoToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebc0d3d", new Object[]{this, str});
        } else {
            saveStorage("ssoToken", encode(str));
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setSubSid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6670bc01", new Object[]{this, str});
            return;
        }
        this.mSubSid = str;
        saveStorage(SessionConstants.SUBSID, encode(str));
    }

    @Override // com.taobao.login4android.session.ISession
    public void setUidDigest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35dddd03", new Object[]{this, str});
            return;
        }
        this.mUidDigest = str;
        saveStorage(SessionConstants.SESSION_KEY, str);
    }

    public void setUninstallReloginOnce(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0c1796", new Object[]{this, new Boolean(z)});
            return;
        }
        this.uninstallReloginOnce = z;
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(SessionConstants.UNINSTALL_RELOGIN_FLAG, z);
            edit.apply();
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        this.mUserId = str;
        saveStorage("userId", encode(str));
        if (!TextUtils.isEmpty(str)) {
            setOldUserId(str);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void setUserName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd26c09", new Object[]{this, str});
            return;
        }
        this.mUserName = str;
        saveStorage("username", str);
    }

    @Override // com.taobao.login4android.session.ISession
    public void setWriteUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f803ecb1", new Object[]{this, new Boolean(z)});
        } else {
            this.canWriteUT = z;
        }
    }

    public void setbiometricId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f69222", new Object[]{this, str});
            return;
        }
        this.mBiometricId = str;
        saveStorage(SessionConstants.BIOMETRIC, encode(str));
    }

    public void updateUserAccount(boolean z, String str, String str2, String str3, String str4, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b14eb8", new Object[]{this, new Boolean(z), str, str2, str3, str4, new Boolean(z2)});
            return;
        }
        if (z || LoginSwitch.getSwitch("forceUpdateUT", "false")) {
            try {
                UTAnalytics.getInstance().updateUserAccount(str, str2, str3);
            } catch (Throwable unused) {
                UTAnalytics.getInstance().updateUserAccount(str, str2);
            }
        } else {
            try {
                UTAnalytics.getInstance().updateUserAccount("-", "0", "");
            } catch (Throwable unused2) {
                UTAnalytics.getInstance().updateUserAccount("-", "0");
            }
        }
        if (z2) {
            if (TextUtils.isEmpty(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("arg2", str2);
                hashMap.put(g1v.FIELD_ARG2, str2);
                hashMap.put("serverLoginType", str4);
                sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "after_logout_update_ut", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("arg2", str2);
            hashMap2.put(g1v.FIELD_ARG2, str2);
            hashMap2.put("serverLoginType", str4);
            sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "after_login_update_ut", hashMap2);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.login4android.session.SessionManager$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AnonymousClass1 extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/session/SessionManager$1");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LoginTLogAdapter.e("init.login-tag", "SessionManager init: start");
            try {
                if ((SessionManager.access$000(SessionManager.this).getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                SessionManager.access$102(z);
            } catch (Exception unused) {
            }
            SessionManager.access$202(new BroadcastReceiver() { // from class: com.taobao.login4android.session.SessionManager.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(C05841 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/session/SessionManager$1$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    final String curProcessName = LoginThreadHelper.getCurProcessName(SessionManager.access$000(SessionManager.this));
                    if (intent != null) {
                        try {
                            if (TextUtils.equals(intent.getAction(), SessionManager.CLEAR_SESSION_ACTION)) {
                                LoginTLogAdapter.e("login_optimize", "receive CLEAR_SESSION_ACTION in" + curProcessName);
                                if (!TextUtils.equals(curProcessName, intent.getStringExtra(SessionManager.CURRENT_PROCESS))) {
                                    String stringExtra = intent.getStringExtra(MspGlobalDefine.SESSION);
                                    SessionManager.access$300(SessionManager.this);
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        SessionManager.access$400(SessionManager.this, (SessionParams) JSON.parseObject(stringExtra, SessionParams.class));
                                    }
                                    new Thread("init-session-data") { // from class: com.taobao.login4android.session.SessionManager.1.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(C05851 r2, String str, Object... objArr) {
                                            str.hashCode();
                                            int hashCode = str.hashCode();
                                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/session/SessionManager$1$1$1");
                                        }

                                        @Override // java.lang.Thread, java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else if (!TextUtils.isEmpty(curProcessName) && !curProcessName.contains(SessionManager.this.CHANNEL_PROCESS)) {
                                                LoginTLogAdapter.e("login_optimize", "recoverCookie");
                                                SessionManager.this.recoverCookie();
                                            }
                                        }
                                    }.start();
                                    LoginStatus.resetLoginFlag();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return;
                        }
                    }
                    if (intent != null && TextUtils.equals(intent.getAction(), SessionManager.CLEAR_SESSION_COOKIES_ACTION)) {
                        LoginTLogAdapter.e("login_optimize", "receive CLEAR_SESSION_COOKIES_ACTION in" + curProcessName);
                        if (!TextUtils.equals(curProcessName, intent.getStringExtra(SessionManager.CURRENT_PROCESS))) {
                            LoginTLogAdapter.e("login_optimize", "CLEAR_SESSION_COOKIES_ACTION");
                            SessionManager.access$300(SessionManager.this);
                            SessionManager.this.getSsoDomainList();
                            if (!TextUtils.isEmpty(curProcessName) && !curProcessName.contains(SessionManager.this.CHANNEL_PROCESS)) {
                                SessionManager.access$500(SessionManager.this);
                                return;
                            }
                            if (!LoginSwitch.getSwitch("ingoreChannelProcess", "true")) {
                                SessionManager.access$500(SessionManager.this);
                            }
                        }
                    }
                }
            });
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(SessionManager.CLEAR_SESSION_ACTION);
            intentFilter.addAction(SessionManager.NOTIFY_SESSION_VALID);
            intentFilter.addAction(SessionManager.CLEAR_SESSION_COOKIES_ACTION);
            try {
                SessionManager.access$000(SessionManager.this).registerReceiver(SessionManager.access$200(), intentFilter);
            } catch (Exception unused2) {
            }
            SessionManager.access$600(SessionManager.this);
            if (SessionManager.this.checkSessionValid()) {
                try {
                    Intent intent = new Intent(SessionManager.NOTIFY_SESSION_VALID);
                    intent.putExtra(SessionManager.CURRENT_PROCESS, LoginThreadHelper.getCurProcessName(SessionManager.access$000(SessionManager.this)));
                    intent.setPackage(SessionManager.access$000(SessionManager.this).getPackageName());
                    SessionManager.access$000(SessionManager.this).sendBroadcast(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            SessionManager.this.trackLoginValid("loginValid", MspGlobalDefine.SESSION);
            LoginTLogAdapter.e("init.login-tag", "SessionManager init: finished");
        }
    }

    private void clearMemoryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a16ff", new Object[]{this});
            return;
        }
        this.mSid = null;
        this.mSessionExpiredTime = 0L;
        this.mEcode = null;
        this.mNick = null;
        this.mUserName = null;
        this.mUserId = null;
        this.mLoginTime = 0L;
        this.mHeadPicLink = null;
        this.mOldSid = null;
        this.mOldNick = null;
        this.mOldUserId = null;
        this.mOldEncryptedUserId = null;
        this.mBiometricId = null;
        this.extJson = null;
        this.mEmail = null;
        this.mLoginSite = 0;
        this.mUidDigest = null;
        this.mLoginPhone = null;
        this.mDomainListStr = null;
        this.storage = null;
    }

    private void clearWebviewCookie(String[] strArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d92f0c", new Object[]{this, strArr, new Boolean(z)});
        } else {
            clearWebviewCookie(strArr, z, false);
        }
    }

    public static void sendCustomTrack(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da053818", new Object[]{str, str2, map});
        } else {
            sendCustomTrack(str, str2, "", "", map, false);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void clearCookieManager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abcb551", new Object[]{this, new Boolean(z)});
            return;
        }
        List<LoginCookie> list = this.mCookie;
        if (list == null || list.size() == 0) {
            this.mCookie = getCookies();
        }
        clearWebviewCookie(getSsoDomainList(), z);
    }

    @Override // com.taobao.login4android.session.ISession
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        initStorage();
        int i = this.storage.getInt(SessionConstants.LOGIN_SITE, 0);
        this.mLoginSite = i;
        return i;
    }

    public String[] getSsoDomainList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("cb713d91", new Object[]{this});
        }
        try {
            if (!TextUtils.isEmpty(this.mDomainListStr)) {
                return (String[]) JSON.parseArray(this.mDomainListStr).toArray(new String[0]);
            }
            initStorage();
            SharedPreferences sharedPreferences = this.storage;
            if (sharedPreferences == null) {
                return null;
            }
            String string = sharedPreferences.getString(SessionConstants.SSO_DOMAIN_LIST, "");
            this.mDomainListStr = string;
            if (!TextUtils.isEmpty(string)) {
                return (String[]) JSON.parseArray(this.mDomainListStr).toArray(new String[0]);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public boolean isCommentTokenUsed() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dad3b0c", new Object[]{this})).booleanValue();
        }
        initStorage();
        if (!this.mIsCommentUsed && (sharedPreferences = this.storage) != null) {
            this.mIsCommentUsed = sharedPreferences.getBoolean(SessionConstants.COMMENT_TOKEN_USED, false);
        }
        return this.mIsCommentUsed;
    }

    public boolean isNewSessionTag() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13a1165", new Object[]{this})).booleanValue();
        }
        boolean z = this.mNewSessionTag;
        if (z) {
            return z;
        }
        initStorage();
        if (!this.mNewSessionTag && (sharedPreferences = this.storage) != null) {
            this.mNewSessionTag = sharedPreferences.getBoolean(NEW_SESSION_TAG, false);
        }
        return this.mNewSessionTag;
    }

    public boolean uninstallReloginOnce() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b19aa080", new Object[]{this})).booleanValue();
        }
        boolean z = this.uninstallReloginOnce;
        if (z) {
            return z;
        }
        initStorage();
        if (!this.uninstallReloginOnce && (sharedPreferences = this.storage) != null) {
            this.uninstallReloginOnce = sharedPreferences.getBoolean(SessionConstants.UNINSTALL_RELOGIN_FLAG, false);
        }
        return this.uninstallReloginOnce;
    }

    private void clearWebviewCookie(String[] strArr, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494d6548", new Object[]{this, strArr, new Boolean(z), new Boolean(z2)});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<LoginCookie> list = this.mCookie;
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < this.mCookie.size(); i++) {
                LoginCookie loginCookie = this.mCookie.get(i);
                if (loginCookie != null && !TextUtils.isEmpty(loginCookie.domain) && ((!z2 || hitCookieKey(loginCookie.name)) && (!z || !LoginSwitch.SGCOOKIE.equals(loginCookie.name)))) {
                    String httpDomin = LoginCookieUtils.getHttpDomin(loginCookie);
                    LoginCookieUtils.expiresCookies(loginCookie);
                    setCookie(httpDomin, loginCookie.toString());
                    if (TextUtils.equals(loginCookie.domain, ".taobao.com")) {
                        arrayList.add(loginCookie);
                    }
                }
            }
            if (strArr == null) {
                strArr = getSsoDomainList();
            }
            if (strArr != null && strArr.length > 0 && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LoginCookie loginCookie2 = (LoginCookie) it.next();
                    if (loginCookie2 != null) {
                        String str = loginCookie2.domain;
                        for (String str2 : strArr) {
                            loginCookie2.domain = str2;
                            String httpDomin2 = LoginCookieUtils.getHttpDomin(loginCookie2);
                            LoginCookieUtils.expiresCookies(loginCookie2);
                            setCookie(httpDomin2, loginCookie2.toString());
                        }
                        loginCookie2.domain = str;
                    }
                }
            }
            removeTargetCookie();
            List<LoginCookie> list2 = this.mCookie;
            if (list2 != null) {
                list2.clear();
            }
        }
    }

    private static boolean hitCookieKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c91bf79d", new Object[]{str})).booleanValue();
        }
        return "cookie2".equals(str) || "unb".equals(str) || "munb".equals(str);
    }

    public static void sendCustomTrack(String str, String str2, String str3, String str4, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896ee850", new Object[]{str, str2, str3, str4, map, new Boolean(z)});
        } else {
            sendCustomTrack(str, str2, str3, str4, map, z, true);
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[]{this})).booleanValue();
        }
        return !TextUtils.isEmpty(getSid()) && System.currentTimeMillis() / 1000 < getSessionExpiredTime() && !TextUtils.isEmpty(getUserId());
    }

    public void clearSessionInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c085fdb6", new Object[]{this, new Boolean(z)});
            return;
        }
        LoginTLogAdapter.e("login_optimize", "Clear sessionInfo");
        sendCustomTrack("session_clear");
        setSid(null);
        setSubSid(null);
        removeStorage(SessionConstants.SESSION_EXPIRED_TIME);
        setEcode(null);
        setNick(null);
        setUserId(null);
        setUserName(null);
        setHeadPicLink(null);
        setExtJson(null);
        setEmail(null);
        setOneTimeToken(null);
        setLoginPhone(null);
        removeStorage(SessionConstants.LOGIN_SITE);
        try {
            injectCookie(null, null, false, z);
            LoginTLogAdapter.e("login_optimize", "send CLEAR_SESSION_COOKIES_ACTION");
            Intent intent = new Intent(CLEAR_SESSION_COOKIES_ACTION);
            intent.putExtra(CURRENT_PROCESS, LoginThreadHelper.getCurProcessName(this.mContext));
            intent.setPackage(this.mContext.getPackageName());
            this.mContext.sendBroadcast(intent);
        } catch (Exception unused) {
            removeTargetCookie();
            List<LoginCookie> list = this.mCookie;
            if (list != null) {
                list.clear();
            }
            FileUtils.writeFileData(this.mContext, SessionConstants.INJECT_COOKIE_NEW, "");
        }
        updateUserAccount(this.canWriteUT, "", "", "", "", true);
    }

    @Override // com.taobao.login4android.session.ISession
    public synchronized void injectCookie(String[] strArr, String[] strArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783bc058", new Object[]{this, strArr, strArr2, new Boolean(z)});
        } else {
            injectCookie(strArr, strArr2, z, false);
        }
    }

    public boolean oneTimeTokenExpired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9fc49ea", new Object[]{this})).booleanValue();
        }
        return System.currentTimeMillis() - this.mLoginTime <= 900;
    }

    @Override // com.taobao.login4android.session.ISession
    public boolean recoverCookie() {
        List<LoginCookie> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91c5973", new Object[]{this})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.mCookieStr)) {
            list = null;
            try {
                list = JSON.parseArray(this.mCookieStr, LoginCookie.class);
                try {
                    this.mCookieStr = null;
                } catch (Throwable unused) {
                    list = list;
                    if (list != null) {
                    }
                    return false;
                }
            } catch (Throwable unused2) {
            }
        } else {
            list = getCookies();
        }
        if (list != null || list.size() <= 0) {
            return false;
        }
        LoginTLogAdapter.e("login_optimize", "recoverCookie size:" + list.size());
        if (SessionConstants.IS_CHECK_COOKIE_VALID && LoginSwitch.getSwitch("new_validate_cookie", "true")) {
            LoginTLogAdapter.e("login_optimize", "new_validate_cookie");
            if (checkSessionValid()) {
                for (LoginCookie loginCookie : list) {
                    if (loginCookie != null && !TextUtils.isEmpty(loginCookie.domain) && TextUtils.equals(loginCookie.domain.trim(), ".taobao.com") && !TextUtils.isEmpty(loginCookie.name) && (TextUtils.equals(loginCookie.name.trim(), "unb") || TextUtils.equals(loginCookie.name.trim(), "munb"))) {
                        if (!TextUtils.isEmpty(loginCookie.value) && !TextUtils.equals(loginCookie.value, getUserId())) {
                        }
                    }
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sid", this.mSid + "");
            sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "CookieInvalid", hashMap);
            return false;
        }
        for (LoginCookie loginCookie2 : list) {
            if (loginCookie2 != null) {
                setCookie(loginCookie2.domain, loginCookie2.toString());
                if (TextUtils.equals(loginCookie2.domain, ".taobao.com")) {
                    arrayList.add(loginCookie2);
                }
            }
        }
        String[] ssoDomainList = getSsoDomainList();
        if (ssoDomainList != null && ssoDomainList.length > 0 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LoginCookie loginCookie3 = (LoginCookie) it.next();
                if (loginCookie3 != null) {
                    String str = loginCookie3.domain;
                    for (String str2 : ssoDomainList) {
                        loginCookie3.domain = str2;
                        setCookie(LoginCookieUtils.getHttpDomin(loginCookie3), loginCookie3.toString());
                    }
                    loginCookie3.domain = str;
                }
            }
        }
        flushCookie();
        return true;
    }

    @Override // com.taobao.login4android.session.ISession
    public void trackLoginValid(String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6d01d9", new Object[]{this, str, str2});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            boolean checkSessionValid = checkSessionValid();
            if (!TextUtils.isEmpty(getLoginToken()) && !TextUtils.isEmpty(getUserId())) {
                z = true;
            }
            hashMap.put("isValidLogin", String.valueOf(checkSessionValid));
            hashMap.put("canAutoLogin", String.valueOf(z));
            hashMap.put("onceLogined", String.valueOf(true ^ TextUtils.isEmpty(getOldUserId())));
            hashMap.put("from", str2);
            sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, str, "", "", hashMap, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void sendCustomTrack(final String str, final String str2, final String str3, final String str4, final Map<String, String> map, final boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46ed484", new Object[]{str, str2, str3, str4, map, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            try {
                InjectHandler injectHandler2 = injectHandler;
                if (injectHandler2 != null) {
                    injectHandler2.addExtra(map, false);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (UTAnalytics.getInstance().isInit()) {
            LoginTLogAdapter.e("login.ut", "sendCustomTrack: ut is ready?: yes , arg1=" + str2);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19997, str2, str3, str4, map).build());
        } else if (z2) {
            LoginTLogAdapter.e("login.ut", "sendCustomTrack: ut is not ready,arg1=" + str2);
            final long currentTimeMillis = System.currentTimeMillis();
            ThreadHelper.getInstance().executeDelayedInBg(3000L, new Runnable() { // from class: com.taobao.login4android.session.SessionManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    Map map2 = map;
                    if (map2 != null) {
                        hashMap.putAll(map2);
                        hashMap.put("time1", String.valueOf(currentTimeMillis));
                    }
                    SessionManager.sendCustomTrack(str, str2, str3, str4, hashMap, z, false);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(g1v.FIELD_ARG2, str2);
                    hashMap2.put(g1v.FIELD_ARG3, String.valueOf(currentTimeMillis));
                    SessionManager.sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "session_ut_re_send", "", "", hashMap2, false, false);
                }
            });
        }
    }

    @Override // com.taobao.login4android.session.ISession
    public void appendEventTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ff4a56", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            String str2 = getEventTrace() + str;
            int length = str2.length();
            if (length > 512) {
                try {
                    if (str2.contains("{") && str2.contains("}")) {
                        int indexOf = str2.indexOf("{");
                        int indexOf2 = str2.indexOf("}");
                        if (indexOf < indexOf2) {
                            saveStorage(SessionConstants.EVENT_TRACE, str2.substring(indexOf2 + 1));
                            return;
                        } else {
                            saveStorage(SessionConstants.EVENT_TRACE, str2.substring(indexOf));
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                str2 = str2.substring(length - 512, length);
            }
            saveStorage(SessionConstants.EVENT_TRACE, str2);
        }
    }

    public synchronized void injectCookie(String[] strArr, final String[] strArr2, final boolean z, boolean z2) {
        LoginCookie parseCookie;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3cfd7c", new Object[]{this, strArr, strArr2, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (this.mContext != null) {
            if (strArr != null) {
                long currentTimeMillis = System.currentTimeMillis();
                sendCustomTrack("session_load_cookie");
                LoginTLogAdapter.e("login_optimize", "injectCookie cookies  size=" + strArr.length);
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str) && (parseCookie = LoginCookieUtils.parseCookie(str)) != null) {
                        setCookie(LoginCookieUtils.getHttpDomin(parseCookie), parseCookie.toString());
                        if (TextUtils.equals(parseCookie.domain, ".taobao.com")) {
                            arrayList.add(parseCookie);
                        }
                        List<LoginCookie> list = this.mCookie;
                        if (list != null) {
                            list.add(parseCookie);
                        }
                    }
                }
                if (strArr2 == null) {
                    strArr2 = getSsoDomainList();
                }
                if (strArr2 != null && strArr2.length > 0 && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        LoginCookie loginCookie = (LoginCookie) it.next();
                        if (loginCookie != null) {
                            String str2 = loginCookie.domain;
                            for (String str3 : strArr2) {
                                loginCookie.domain = str3;
                                setCookie(LoginCookieUtils.getHttpDomin(loginCookie), loginCookie.toString());
                            }
                            loginCookie.domain = str2;
                        }
                    }
                }
                LoginTLogAdapter.e("login_optimize", "get taobao cookie before sync:");
                flushCookie();
                long currentTimeMillis2 = System.currentTimeMillis();
                LoginTLogAdapter.e("login_optimize", "write cookie,get taobao cookie after sync: cost = " + (currentTimeMillis2 - currentTimeMillis));
                BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.session.SessionManager.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LoginTLogAdapter.e("login_optimize", "before setSsoDomainList");
                        SessionManager.this.setSsoDomainList(strArr2);
                        if (SessionManager.access$700(SessionManager.this) != null && !SessionManager.access$700(SessionManager.this).isEmpty()) {
                            if (z) {
                                Context access$000 = SessionManager.access$000(SessionManager.this);
                                SessionManager sessionManager = SessionManager.this;
                                FileUtils.writeFileData(access$000, SessionConstants.INJECT_External_H5_COOKIE, sessionManager.encode(JSON.toJSONString(SessionManager.access$700(sessionManager))));
                                return;
                            }
                            Context access$0002 = SessionManager.access$000(SessionManager.this);
                            SessionManager sessionManager2 = SessionManager.this;
                            FileUtils.writeFileData(access$0002, SessionConstants.INJECT_COOKIE_NEW, sessionManager2.encode(JSON.toJSONString(SessionManager.access$700(sessionManager2))));
                            FileUtils.writeFileData(SessionManager.access$000(SessionManager.this), SessionConstants.INJECT_COOKIE_OLD, "");
                        }
                    }
                });
            } else {
                clearCookie(strArr2, z2);
            }
        }
    }

    private SessionManager(Context context) {
        LoginStatus.launchTimestamp = System.currentTimeMillis();
        if (context != null) {
            this.mContext = context;
            initAsync();
        }
    }

    public void saveStorage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef40655", new Object[]{this, str, new Long(j)});
            return;
        }
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, j);
            edit.apply();
            if (!this.mNewSessionTag) {
                setNewSessionTag(true);
            }
        }
    }

    public void saveStorage(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef40294", new Object[]{this, str, new Integer(i)});
            return;
        }
        initStorage();
        SharedPreferences sharedPreferences = this.storage;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
            if (!this.mNewSessionTag) {
                setNewSessionTag(true);
            }
        }
    }
}
