package com.taobao.login4android.constants;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.FileUtils;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CURRENT_PROCESS = "currentProcess";
    private static final String IS_LOGIGING = "isLogining";
    private static final String IS_USER_LOGINING = "isUserLogining";
    private static final String NOTIFY_LOGIN_STATUS_CHANGE = "NOTIFY_LOGIN_STATUS_CHANGE";
    public static final String TAG = "login.LoginStatus";
    public static String browserRefUrl;
    public static int degradeHegui;
    public static String dumpTrace;
    public static boolean forceOversea;
    public static boolean isLoginActResume;
    public static String jsbridgeRefUrl;
    public static long lastCloseTimeStamp;
    public static long launchTimestamp;
    public static String loginTrackInfo;
    private static Context mContext;
    private static BroadcastReceiver mStatusReceiver;
    public static String mockLoginType;
    public static String mtopApiReferer;
    public static String readOther;
    public static String savedOppo;
    public static String sdkSessionTraceID;
    public static String source;
    public static boolean useNewPage;
    public static String mockNew = "true";
    public static boolean mockCoupon = false;
    public static boolean retry600009 = true;
    public static int openFrequentCount = 0;
    public static int forceMockStrategy = -1;
    public static boolean saveSalt = true;
    public static boolean enableOnekeyLoginV2 = false;
    public static boolean firstLogin = true;
    private static AtomicBoolean isLogining = new AtomicBoolean(false);
    private static AtomicBoolean userLogin = new AtomicBoolean(false);
    private static AtomicBoolean isFromAccountChange = new AtomicBoolean(false);
    private static AtomicBoolean isNewFingerPrintEnrolled = new AtomicBoolean(false);
    private static AtomicLong lastLoginTime = new AtomicLong(0);
    public static final AtomicLong lastRefreshCookieTime = new AtomicLong(0);
    public static String loginEntrance = "";
    public static boolean WAIT_TB_PASSWORD_NOTIFY = true;
    public static boolean concurrentShowUI = false;

    public static /* synthetic */ AtomicBoolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return isLogining;
    }

    public static /* synthetic */ AtomicBoolean access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba88d1f8", new Object[0]);
        }
        return userLogin;
    }

    public static synchronized boolean compareAndSetFromChangeAccount(boolean z, boolean z2) {
        synchronized (LoginStatus.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ae4016e", new Object[]{new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            return isFromAccountChange.compareAndSet(z, z2);
        }
    }

    public static synchronized boolean compareAndSetLogining(boolean z, boolean z2) {
        synchronized (LoginStatus.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f9a8e6d4", new Object[]{new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            LoginTLogAdapter.e("login.LoginStatus", "compareAndSetLogining  expect=" + z + ",update=" + z2);
            boolean compareAndSet = isLogining.compareAndSet(z, z2);
            if (!compareAndSet || !z || !z2) {
                nofityStatusChange();
            }
            if (compareAndSet) {
                lastLoginTime.set(System.currentTimeMillis());
            }
            LoginTLogAdapter.e("login.LoginStatus", Log.getStackTraceString(new Throwable()));
            return compareAndSet;
        }
    }

    public static synchronized boolean compareAndSetNewFingerPrintEntrolled(boolean z, boolean z2) {
        synchronized (LoginStatus.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c195047e", new Object[]{new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            return isNewFingerPrintEnrolled.compareAndSet(z, z2);
        }
    }

    public static long getLastLoginTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a10ba5", new Object[0])).longValue();
        }
        return lastLoginTime.get();
    }

    public static long getLastRefreshCookieTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d4c2b5b", new Object[0])).longValue();
        }
        AtomicLong atomicLong = lastRefreshCookieTime;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        LoginTLogAdapter.e("login.LoginStatus", "init Login Status");
        mContext = context;
        mStatusReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.constants.LoginStatus.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/constants/LoginStatus$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent != null) {
                    try {
                        if (!TextUtils.equals(LoginThreadHelper.getCurProcessName(context2), intent.getStringExtra(LoginStatus.CURRENT_PROCESS))) {
                            LoginTLogAdapter.e("login.LoginStatus", "NOTIFY_LOGIN_STATUS_CHANGE onReceive");
                            LoginStatus.access$000().set(intent.getBooleanExtra(LoginStatus.IS_LOGIGING, false));
                            LoginStatus.access$100().set(intent.getBooleanExtra(LoginStatus.IS_USER_LOGINING, false));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        mContext.registerReceiver(mStatusReceiver, new IntentFilter(NOTIFY_LOGIN_STATUS_CHANGE));
    }

    public static boolean isFromChangeAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c339c8d4", new Object[0])).booleanValue();
        }
        return isFromAccountChange.get();
    }

    public static boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[0])).booleanValue();
        }
        Context context = mContext;
        if (context != null) {
            try {
                if (!TextUtils.equals(context.getPackageName(), LoginThreadHelper.getCurProcessName(mContext))) {
                    LoginTLogAdapter.e("login.LoginStatus", LoginThreadHelper.getCurProcessName(mContext));
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isLogining.get() || userLogin.get();
    }

    public static boolean isUserLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc336df", new Object[0])).booleanValue();
        }
        return userLogin.get();
    }

    private static void nofityStatusChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc43f3b2", new Object[0]);
        } else if (mContext != null && mStatusReceiver != null) {
            Intent intent = new Intent(NOTIFY_LOGIN_STATUS_CHANGE);
            intent.putExtra(CURRENT_PROCESS, LoginThreadHelper.getCurProcessName(mContext));
            intent.putExtra(IS_LOGIGING, isLogining.get());
            intent.putExtra(IS_USER_LOGINING, userLogin.get());
            intent.setPackage(mContext.getPackageName());
            mContext.sendBroadcast(intent);
        }
    }

    public static synchronized void resetFingerPrintEntrolled() {
        synchronized (LoginStatus.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c123d199", new Object[0]);
            } else {
                compareAndSetNewFingerPrintEntrolled(true, false);
            }
        }
    }

    public static void resetLoginFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d504336d", new Object[0]);
        } else {
            resetLoginFlag(true);
        }
    }

    public static void resetLoginFlagNoStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec044888", new Object[0]);
        } else {
            resetLoginFlag(true, false);
        }
    }

    public static void setLastRefreshCookieTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf86e49", new Object[]{new Long(j)});
        } else {
            lastRefreshCookieTime.set(j);
        }
    }

    public static void resetLoginFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb82ed07", new Object[]{new Boolean(z)});
        } else {
            resetLoginFlag(z, true);
        }
    }

    public static void setUserLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78870491", new Object[]{new Boolean(z)});
            return;
        }
        LoginTLogAdapter.e("login.LoginStatus", "set userLogin=" + z);
        if (userLogin.compareAndSet(true ^ z, z)) {
            nofityStatusChange();
        }
    }

    public static void resetLoginFlag(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4db66ad", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2) {
            try {
                LoginTLogAdapter.e("login.LoginStatus", "reset login status " + FileUtils.readThreadStack());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        concurrentShowUI = false;
        boolean compareAndSet = isLogining.compareAndSet(true, false);
        boolean compareAndSet2 = userLogin.compareAndSet(true, false);
        if (compareAndSet || compareAndSet2) {
            nofityStatusChange();
        }
        if (z && LoginSwitch.getSwitch("notClearFromAccount", "true")) {
            isFromAccountChange.compareAndSet(true, false);
        }
    }

    static {
        t2o.a(516947978);
    }
}
