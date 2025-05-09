package com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.middletier.IUnifiedSecurityComponent;
import com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import tb.cpr;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UserTrackUFWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DYNAMIC_KEY = "ut-uf-factors";
    private static final String KEY_API = "api";
    private static final String KEY_APPKEY = "appkey";
    private static final String KEY_AUTH_CODE = "authCode";
    private static final String KEY_BIZ_ID = "bizId";
    private static final String KEY_DATA = "data";
    private static final String KEY_ENV = "env";
    private static final String KEY_FLAG = "flag";
    private static final String KEY_USE_WUA = "useWua";
    private static final String KEY_X_MINI_WUA = "x-mini-wua";
    private static final String KEY_X_SGEXT = "x-sgext";
    private static final String KEY_X_SIGN = "x-sign";
    private static final String KEY_X_UMT = "x-umt";
    private static final String KEY_X_US = "x-us";
    private static final int UF_BIZ_UT = 1;
    private static final int UF_FLAG_UT = 3;
    private static final String UT_API_INPUT = "usertrack.uf.wrapper";
    private static Handler mHandler;
    private static IUnifiedSecurityComponent mUnifiedSecurityComp = null;
    private static IDynamicDataStoreComponent mDynamicDataStoreComp = null;
    private static String mCurProcessName = null;
    private static String mAppkey = null;
    private static boolean initedManager = false;
    private static Context mContext = null;
    private static int mUpdatePeriod = 0;
    private static Timer mTimer = null;
    private static TimerTask mTimerTask = null;
    private static boolean DEBUG = false;
    private static int ERROR_INVALID_PARA = SecExceptionCode.SEC_ERROR_UT_ANDROID_INVALID_PARA;
    private static int ERROR_INVALID_STORE_MSG = 2902;
    private static int ERROR_INVALID_INIT_ERROR = 2903;
    private static int ERROR_INIT_UNKNOWN = cpr.MSG_TYPE_GIFT_WISH;
    private static int ERROR_GET_UNKNOWN = cpr.MSG_TYPE_GIFT_WISH;
    private static int DEFAULT_UPDATE_PERIODS = 30;
    private static int ORANGE_UT_ANDROID = 25;
    private static volatile IRouterComponent gGlobalRounterComponent = null;

    static {
        t2o.a(658505744);
    }

    private static void Logd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1451a451", new Object[]{str});
        }
    }

    public static /* synthetic */ void access$000(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb5a6c", new Object[]{new Integer(i)});
        } else {
            runPeriodTaskImpl(i);
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            getUFFactorsAndUpdateStore();
        }
    }

    public static String getCurProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{context});
        }
        String str = mCurProcessName;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                String str2 = runningAppProcessInfo.processName;
                mCurProcessName = str2;
                return str2;
            }
        }
        return "";
    }

    private static IRouterComponent getRouterComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRouterComponent) ipChange.ipc$dispatch("695ef05", new Object[0]);
        }
        if (gGlobalRounterComponent == null) {
            synchronized (obk.class) {
                if (gGlobalRounterComponent == null) {
                    try {
                        gGlobalRounterComponent = SecurityGuardManager.getInstance(OrangeAdapter.gContext).getSGPluginManager().getRouter();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return gGlobalRounterComponent;
    }

    private static void getUFFactorsAndUpdateStore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c4bcc5", new Object[0]);
            return;
        }
        try {
            HashMap<String, String> uFInMainProcess = getUFInMainProcess();
            if (uFInMainProcess != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(uFInMainProcess.get("x-sign"));
                stringBuffer.append("&");
                stringBuffer.append(uFInMainProcess.get("x-mini-wua"));
                stringBuffer.append("&");
                stringBuffer.append(uFInMainProcess.get(KEY_X_SGEXT));
                stringBuffer.append("&");
                stringBuffer.append(uFInMainProcess.get("x-umt"));
                stringBuffer.append("&");
                stringBuffer.append(uFInMainProcess.get(KEY_X_US));
                String stringBuffer2 = stringBuffer.toString();
                if (!isEmpty(stringBuffer2)) {
                    mDynamicDataStoreComp.putStringDDpEx(DYNAMIC_KEY, stringBuffer2, 0);
                }
                updatePeriod();
            }
        } catch (SecException unused) {
        }
    }

    private static HashMap<String, String> getUFInChannelProcess() throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7d6e8322", new Object[0]);
        }
        String stringDDpEx = mDynamicDataStoreComp.getStringDDpEx(DYNAMIC_KEY, 0);
        if (!isEmpty(stringDDpEx)) {
            String[] split = stringDDpEx.split("&");
            if (split == null || split.length != 5) {
                throw new SecException(ERROR_INVALID_STORE_MSG);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("x-sign", split[0]);
            hashMap.put("x-mini-wua", split[1]);
            hashMap.put(KEY_X_SGEXT, split[2]);
            hashMap.put("x-umt", split[3]);
            hashMap.put(KEY_X_US, split[4]);
            return hashMap;
        }
        throw new SecException(ERROR_INVALID_PARA);
    }

    private static HashMap<String, String> getUFInMainProcess() throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b6246d94", new Object[0]);
        }
        if (mUnifiedSecurityComp != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("data", mAppkey);
            hashMap.put("env", 0);
            hashMap.put("appkey", mAppkey);
            hashMap.put("api", UT_API_INPUT);
            hashMap.put(KEY_USE_WUA, Boolean.FALSE);
            hashMap.put("bizId", 1);
            hashMap.put("flag", 3);
            return mUnifiedSecurityComp.getSecurityFactors(hashMap);
        }
        throw new SecException(ERROR_INVALID_INIT_ERROR);
    }

    public static HashMap<String, String> getUFWrapper() throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cfd1ab56", new Object[0]);
        }
        try {
            if (!initedManager) {
                return null;
            }
            if (isMainProcess(mContext, false)) {
                return getUFInMainProcess();
            }
            return getUFInChannelProcess();
        } catch (SecException e) {
            throw e;
        } catch (Exception unused) {
            throw new SecException(ERROR_GET_UNKNOWN);
        }
    }

    public static void init(Context context, String str) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
            return;
        }
        try {
            initMethod(context, str);
            if (isMainProcess(mContext, false)) {
                runPeriodTask(DEFAULT_UPDATE_PERIODS);
            }
        } catch (SecException e) {
            throw e;
        } catch (Exception unused) {
            throw new SecException(ERROR_INIT_UNKNOWN);
        }
    }

    private static boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isMainProcess(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("814c2fc3", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            return z;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
            String curProcessName = getCurProcessName(context);
            if (isEmpty(str) || isEmpty(curProcessName)) {
                return z;
            }
            return curProcessName.equalsIgnoreCase(str);
        } catch (Throwable unused) {
            return z;
        }
    }

    private static void runPeriodTask(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dccbe2b", new Object[]{new Integer(i)});
            return;
        }
        if (mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("UFW");
            handlerThread.start();
            mHandler = new Handler(handlerThread.getLooper());
        }
        if (mHandler != null) {
            mHandler.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.UserTrackUFWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UserTrackUFWrapper.access$000(i);
                    }
                }
            }, 0L);
        }
    }

    private static void runPeriodTaskImpl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cbd06b", new Object[]{new Integer(i)});
            return;
        }
        if (mTimer == null) {
            if (i > 0) {
                mTimer = new Timer("UFW-timer");
                TimerTask timerTask = new TimerTask() { // from class: com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.UserTrackUFWrapper.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/securityguardaccsadapter/usertrack/UserTrackUFWrapper$2");
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            UserTrackUFWrapper.access$100();
                        }
                    }
                };
                mTimerTask = timerTask;
                mTimer.schedule(timerTask, 0L, i * 1000);
            }
        } else if (i != mUpdatePeriod) {
            if (i > 0) {
                mTimerTask.cancel();
                TimerTask timerTask2 = new TimerTask() { // from class: com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.UserTrackUFWrapper.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/securityguardaccsadapter/usertrack/UserTrackUFWrapper$3");
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            UserTrackUFWrapper.access$100();
                        }
                    }
                };
                mTimerTask = timerTask2;
                mTimer.schedule(timerTask2, 0L, i * 1000);
            } else {
                mTimerTask.cancel();
            }
        }
        mUpdatePeriod = i;
    }

    private static void updatePeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca529f71", new Object[0]);
            return;
        }
        IRouterComponent routerComponent = getRouterComponent();
        if (routerComponent != null) {
            try {
                runPeriodTask(((Integer) routerComponent.doCommand(13001, Integer.valueOf(ORANGE_UT_ANDROID))).intValue());
            } catch (Exception unused) {
            }
        }
    }

    private static void initMethod(Context context, String str) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebecca7a", new Object[]{context, str});
        } else if (!initedManager) {
            mContext = context;
            mAppkey = str;
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (isMainProcess(mContext, false)) {
                mUnifiedSecurityComp = (IUnifiedSecurityComponent) instance.getInterface(IUnifiedSecurityComponent.class);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(KEY_AUTH_CODE, "");
                mUnifiedSecurityComp.init(hashMap);
                mDynamicDataStoreComp = (IDynamicDataStoreComponent) instance.getInterface(IDynamicDataStoreComponent.class);
                initedManager = true;
                return;
            }
            mDynamicDataStoreComp = (IDynamicDataStoreComponent) instance.getInterface(IDynamicDataStoreComponent.class);
            initedManager = true;
        }
    }
}
