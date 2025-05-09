package anet.channel;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import anet.channel.Config;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.SceneInfo;
import anet.channel.statist.CountryChangedMonitor;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.Utils;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.LocalProcessMonitor;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fxp;
import tb.hhg;
import tb.t2o;
import tb.t5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GlobalAppRuntimeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COUNTRY_CODE = "COUNTRY_CODE";
    private static final String DEFAULT_TOAST_TEXT = "使用移动数据改善浏览体验，可在设置-通用里关闭";
    private static final String SP_KEY_TOAST_TIRE_TIME = "network_toast_tire_time";
    private static final String TAG = "awcn.GlobalAppRuntimeInfo";
    private static final String USER_ID = "UserId";
    private static String appVersion;
    private static String appkey;
    private static Context context;
    private static volatile long initTime;
    private static volatile String launchTime;
    private static String ttid;
    private static String userId;
    private static String utdid;
    private static final long DEF_SIMPLE_INDEX = -2147483648L;
    private static long simpleIndex = DEF_SIMPLE_INDEX;
    private static ENV env = ENV.ONLINE;
    private static String targetProcess = "";
    private static String currentProcess = "";
    private static volatile boolean isBackground = true;
    private static volatile int globalNetworkQuality = 2;
    private static SharedPreferences sp = null;
    private static volatile CopyOnWriteArrayList<String> bucketInfos = null;
    private static long networkStatusChangedTime = 0;
    private static long statusChangedTime = -1;
    private static Map<String, Integer> requestIndexMap = null;
    public static Map<String, Integer> sessionIndexMap = null;
    public static AtomicBoolean isThreadCountInited = new AtomicBoolean();
    private static HashMap<String, Object> launcherParam = null;
    private static AtomicBoolean toastStatus = new AtomicBoolean(false);
    private static Handler uiHandler = new Handler(Looper.getMainLooper());
    private static volatile int notPhoneFlag = -1;
    private static String amdcInfo = "";
    private static String countryCode = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum NetworkChangeRequestStatus {
        NONE,
        YES_SUCCESS,
        YES_FAIL,
        NO;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NetworkChangeRequestStatus networkChangeRequestStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/GlobalAppRuntimeInfo$NetworkChangeRequestStatus");
        }

        public static NetworkChangeRequestStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkChangeRequestStatus) ipChange.ipc$dispatch("59c29f0c", new Object[]{str});
            }
            return (NetworkChangeRequestStatus) Enum.valueOf(NetworkChangeRequestStatus.class, str);
        }
    }

    static {
        t2o.a(607125515);
    }

    public static void addBucketInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a13b254", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.length() <= 32 && str2.length() <= 32) {
            synchronized (GlobalAppRuntimeInfo.class) {
                try {
                    if (bucketInfos == null) {
                        bucketInfos = new CopyOnWriteArrayList<>();
                    }
                    bucketInfos.add(str);
                    bucketInfos.add(str2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static synchronized String getAmdcInfo() {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ff8d3ea", new Object[0]);
            }
            return amdcInfo;
        }
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        return appVersion;
    }

    public static String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[0]);
        }
        return appkey;
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        try {
            return LauncherRuntime.h;
        } catch (Throwable th) {
            ALog.e(TAG, "[Launcher] getApplication fail, error=" + th.toString(), null, new Object[0]);
            return null;
        }
    }

    public static HashMap<String, Object> getBasicParams() {
        HashMap<String, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e14961c8", new Object[0]);
        }
        try {
            hashMap = launcherParam;
        } catch (Throwable th) {
            ALog.e(TAG, "[Launcher] getBasicParams fail, error=" + th.toString(), null, new Object[0]);
        }
        if (hashMap != null) {
            if (hashMap.isEmpty()) {
            }
            return launcherParam;
        }
        launcherParam = hhg.b();
        ALog.e(TAG, "[Launcher] TaobaoNetworkAdapter getBasicParams!!!", null, new Object[0]);
        return launcherParam;
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("62ba422", new Object[0]);
        }
        return bucketInfos;
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return context;
    }

    public static String getCurrentProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbba16cd", new Object[0]);
        }
        return currentProcess;
    }

    public static ENV getEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ENV) ipChange.ipc$dispatch("491cc26f", new Object[0]);
        }
        return env;
    }

    public static int getGlobalNetworkQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a24164", new Object[0])).intValue();
        }
        return globalNetworkQuality;
    }

    @Deprecated
    public static long getInitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c2bf46e", new Object[0])).longValue();
        }
        return initTime;
    }

    public static String getLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdeb47a3", new Object[0]);
        }
        return launchTime;
    }

    public static long getNetworkStatusChangedTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("212ce632", new Object[0])).longValue();
        }
        return networkStatusChangedTime;
    }

    public static int getRequestIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("878a3bd", new Object[]{str})).intValue();
        }
        Map<String, Integer> map = requestIndexMap;
        if (map == null || map.isEmpty() || (str != null && !requestIndexMap.containsKey(str))) {
            return 0;
        }
        return requestIndexMap.get(str).intValue();
    }

    public static SessionCenter getSessionCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCenter) ipChange.ipc$dispatch("8c52c77d", new Object[0]);
        }
        String appkey2 = getAppkey();
        if (TextUtils.isEmpty(appkey2)) {
            return SessionCenter.getInstance();
        }
        ENV env2 = getEnv();
        Config config = Config.getConfig(appkey2, env2);
        if (config == null) {
            config = new Config.Builder().setAppkey(appkey2).setEnv(env2).build();
        }
        return SessionCenter.getInstance(config);
    }

    @Deprecated
    public static int getStartType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c914980", new Object[0])).intValue();
        }
        SceneInfo sceneInfo = AnalysisFactory.getInstance().getSceneInfo();
        if (sceneInfo != null) {
            return sceneInfo.startType;
        }
        return -1;
    }

    public static String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[0]);
        }
        return ttid;
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        return userId;
    }

    public static String getUtdid() {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        if (utdid == null && (context2 = context) != null) {
            utdid = Utils.getDeviceId(context2);
        }
        return utdid;
    }

    public static boolean isAppBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca5f730", new Object[0])).booleanValue();
        }
        if (context == null) {
            return true;
        }
        return isBackground;
    }

    public static boolean isChannelProcess(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d915192f", new Object[]{context2})).booleanValue();
        }
        if (TextUtils.isEmpty(currentProcess)) {
            currentProcess = Utils.getProcessNameNormal(context2);
        }
        return "com.taobao.taobao:channel".equalsIgnoreCase(currentProcess);
    }

    public static boolean isLightMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ced455", new Object[0])).booleanValue();
        }
        try {
            if (simpleIndex <= DEF_SIMPLE_INDEX) {
                simpleIndex = fxp.g(fxp.j());
                ALog.e(TAG, "[Launcher] simpleIndex =" + simpleIndex, null, new Object[0]);
            }
            if (simpleIndex != -2) {
                return false;
            }
            if (!LocalProcessMonitor.s0()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ALog.e(TAG, "[Launcher] get isLightMainProcess fail, error=" + th.toString(), null, new Object[0]);
            return false;
        }
    }

    public static synchronized boolean isStatusChangedRequest(String str) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("66f7c96c", new Object[]{str})).booleanValue();
            }
            if (statusChangedTime > 0) {
                long currentTimeMillis = System.currentTimeMillis() - statusChangedTime;
                if (currentTimeMillis <= AwcnConfig.getVpnFastDegradTime()) {
                    ALog.e(TAG, "[ap] isStatusChangedRequest, time=" + currentTimeMillis, str, new Object[0]);
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isTargetProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81f8011f", new Object[0])).booleanValue();
        }
        if (TextUtils.isEmpty(targetProcess) || TextUtils.isEmpty(currentProcess)) {
            return true;
        }
        return targetProcess.equalsIgnoreCase(currentProcess);
    }

    public static void setBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{new Boolean(z)});
        } else {
            isBackground = z;
        }
    }

    public static void setCurrentProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c54e449", new Object[]{str});
        } else {
            currentProcess = str;
        }
    }

    public static void setEnv(ENV env2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdd84f", new Object[]{env2});
        } else {
            env = env2;
        }
    }

    public static int setGlobalNetworkQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c72b819", new Object[]{new Integer(i)})).intValue();
        }
        globalNetworkQuality = i;
        return i;
    }

    @Deprecated
    public static void setInitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2977fe", new Object[]{new Long(j)});
        } else {
            initTime = j;
        }
    }

    public static void setLaunchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6402a9", new Object[0]);
        } else {
            launchTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        }
    }

    public static void setNetworkStatusChangedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b356ba", new Object[]{new Long(j)});
        } else {
            networkStatusChangedTime = j;
        }
    }

    public static synchronized void setStatusChangedTime(long j) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dcc7330", new Object[]{new Long(j)});
            } else {
                statusChangedTime = j;
            }
        }
    }

    public static void setTargetProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd37fed", new Object[]{str});
        } else {
            targetProcess = str;
        }
    }

    public static void setTtid(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{str});
            return;
        }
        ttid = str;
        try {
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("@");
                String str3 = null;
                if (indexOf != -1) {
                    str2 = str.substring(0, indexOf);
                } else {
                    str2 = null;
                }
                String substring = str.substring(indexOf + 1);
                int lastIndexOf = substring.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring2 = substring.substring(0, lastIndexOf);
                    str3 = substring.substring(lastIndexOf + 1);
                    substring = substring2;
                }
                appVersion = str3;
                AmdcRuntimeInfo.setAppInfo(substring, str3, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{str});
            return;
        }
        String str2 = userId;
        if (str2 == null || !str2.equals(str)) {
            userId = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = sp;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(USER_ID, str).apply();
            }
        }
    }

    public static void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{str});
            return;
        }
        String str2 = utdid;
        if (str2 == null || !str2.equals(str)) {
            utdid = str;
        }
    }

    public static void showUserToast() {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8812cfa6", new Object[0]);
        } else if (toastStatus.compareAndSet(false, true) && (context2 = getContext()) != null) {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            if (System.currentTimeMillis() - defaultSharedPreferences.getLong(SP_KEY_TOAST_TIRE_TIME, 0L) > AwcnConfig.getMultiPathToastTireTime() * 3600000) {
                uiHandler.post(new Runnable() { // from class: anet.channel.GlobalAppRuntimeInfo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String multiPathUserToastText = AwcnConfig.getMultiPathUserToastText();
                        Context context3 = GlobalAppRuntimeInfo.getContext();
                        if (TextUtils.isEmpty(multiPathUserToastText)) {
                            multiPathUserToastText = GlobalAppRuntimeInfo.DEFAULT_TOAST_TEXT;
                        }
                        Toast.makeText(context3, multiPathUserToastText, 0).show();
                        defaultSharedPreferences.edit().putLong(GlobalAppRuntimeInfo.SP_KEY_TOAST_TIRE_TIME, System.currentTimeMillis()).apply();
                    }
                });
            }
        }
    }

    public static int getSessionIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4b44756", new Object[]{str})).intValue();
        }
        Map<String, Integer> map = sessionIndexMap;
        if (map == null || map.isEmpty() || (str != null && !sessionIndexMap.containsKey(str))) {
            return 0;
        }
        return sessionIndexMap.get(str).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (com.taobao.android.autosize.TBDeviceUtils.p(getContext()) != false) goto L_0x0053;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isNotPhone() {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = anet.channel.GlobalAppRuntimeInfo.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "9b6f3fb0"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.ipc$dispatch(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0017:
            int r1 = anet.channel.GlobalAppRuntimeInfo.notPhoneFlag
            r2 = -1
            r4 = 0
            java.lang.String r5 = "awcn.GlobalAppRuntimeInfo"
            if (r1 == r2) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isNotPhone, notPhoneFlag="
            r1.<init>(r2)
            int r2 = anet.channel.GlobalAppRuntimeInfo.notPhoneFlag
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            anet.channel.util.ALog.e(r5, r1, r4, r2)
            int r1 = anet.channel.GlobalAppRuntimeInfo.notPhoneFlag
            if (r1 != r0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            return r0
        L_0x003c:
            android.content.Context r1 = getContext()     // Catch: all -> 0x0051
            boolean r1 = com.taobao.android.autosize.TBDeviceUtils.P(r1)     // Catch: all -> 0x0051
            if (r1 != 0) goto L_0x0053
            android.content.Context r1 = getContext()     // Catch: all -> 0x0051
            boolean r1 = com.taobao.android.autosize.TBDeviceUtils.p(r1)     // Catch: all -> 0x0051
            if (r1 == 0) goto L_0x006d
            goto L_0x0053
        L_0x0051:
            r1 = move-exception
            goto L_0x0055
        L_0x0053:
            r1 = 1
            goto L_0x006e
        L_0x0055:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "isNotPhone error "
            r2.<init>(r6)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            anet.channel.util.ALog.e(r5, r1, r4, r2)
        L_0x006d:
            r1 = 0
        L_0x006e:
            anet.channel.GlobalAppRuntimeInfo.notPhoneFlag = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "isNotPhone, notPhone="
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r6 = anet.channel.GlobalAppRuntimeInfo.notPhoneFlag
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "notPhoneFlag"
            r7[r3] = r8
            r7[r0] = r6
            anet.channel.util.ALog.e(r5, r2, r4, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.GlobalAppRuntimeInfo.isNotPhone():boolean");
    }

    public static void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{str, obj});
            return;
        }
        try {
            t5r.b(str, obj);
        } catch (Throwable th) {
            ALog.e(TAG, "onProperty error " + th.toString(), null, new Object[0]);
        }
    }

    public static void setAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9dfe31", new Object[]{str});
            return;
        }
        ALog.e(TAG, "[isAllowLightAmdcRequest] key = " + str, null, new Object[0]);
        appkey = str;
    }

    public static boolean is32Bit() {
        Object invoke;
        boolean is64Bit;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                is64Bit = Process.is64Bit();
                return !is64Bit;
            }
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = cls.getDeclaredMethod("is64Bit", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getRuntime", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(null, new Object[0]);
            if (invoke2 == null || (invoke = declaredMethod.invoke(invoke2, new Object[0])) == null) {
                return false;
            }
            return !((Boolean) invoke).booleanValue();
        } catch (Exception e) {
            ALog.e(TAG, "[is32Bit] bitRet=false, error=" + e.toString(), null, new Object[0]);
            return false;
        }
    }

    public static boolean isTargetProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2173a29", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(targetProcess) || TextUtils.isEmpty(str)) {
            return true;
        }
        return targetProcess.equalsIgnoreCase(str);
    }

    public static void setContext(Context context2) {
        HashMap<String, Object> basicParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context2});
            return;
        }
        context = context2;
        if (context2 != null) {
            if (TextUtils.isEmpty(currentProcess) && (basicParams = getBasicParams()) != null && !basicParams.isEmpty()) {
                String str = (String) basicParams.get("process");
                if (!TextUtils.isEmpty(str)) {
                    ALog.e(TAG, "[Launcher] setContext, currentProcess=" + str, null, new Object[0]);
                    currentProcess = str;
                }
            }
            if (TextUtils.isEmpty(currentProcess)) {
                currentProcess = Utils.getProcessNameNormal(context2);
                ALog.e(TAG, "[Launcher] setContext, getProcessName=" + currentProcess, null, new Object[0]);
            }
            if (TextUtils.isEmpty(targetProcess)) {
                targetProcess = Utils.getMainProcessName(context2);
            }
            if (sp == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                sp = defaultSharedPreferences;
                userId = defaultSharedPreferences.getString(USER_ID, null);
            }
            ALog.e(TAG, "", null, "CurrentProcess", currentProcess, "TargetProcess", targetProcess);
        }
    }

    public static synchronized void setRequestIndex(String str) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4568dd6", new Object[]{str});
                return;
            }
            if (AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(str)) {
                if (requestIndexMap == null) {
                    requestIndexMap = new HashMap();
                }
                if (requestIndexMap.containsKey(str)) {
                    Map<String, Integer> map = requestIndexMap;
                    map.put(str, Integer.valueOf(1 ^ map.get(str).intValue()));
                } else {
                    requestIndexMap.put(str, 0);
                }
            }
        }
    }

    public static boolean isChannelProcess() {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86016141", new Object[0])).booleanValue();
        }
        if (TextUtils.isEmpty(currentProcess) && (context2 = context) != null) {
            currentProcess = Utils.getProcessNameNormal(context2);
        }
        return "com.taobao.taobao:channel".equalsIgnoreCase(currentProcess);
    }

    public static synchronized void setAmdcInfo(String str, String str2, String str3) {
        Context context2;
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("981942e0", new Object[]{str, str2, str3});
                return;
            }
            if (countryCode == null) {
                if (sp == null && (context2 = context) != null) {
                    sp = PreferenceManager.getDefaultSharedPreferences(context2);
                }
                SharedPreferences sharedPreferences = sp;
                if (sharedPreferences != null) {
                    countryCode = sharedPreferences.getString(COUNTRY_CODE, null);
                }
            }
            String str4 = countryCode;
            if (!(str4 == null || str == null || str4.equalsIgnoreCase(str))) {
                AppMonitor.getInstance().commitStat(new CountryChangedMonitor(countryCode, str));
                ALog.e(TAG, "[countryCode] change! preCountryCode=" + countryCode, SwitchMonitorLogUtil.SRC_AMDC, "new countryCode", str);
            }
            if (sp != null && str != null && !NetworkStatusHelper.isVpn() && !str.equalsIgnoreCase(countryCode)) {
                sp.edit().putString(COUNTRY_CODE, str).apply();
            }
            countryCode = str;
            amdcInfo = str + "," + str2 + "," + str3;
        }
    }

    public static synchronized void updateSessionIndex(String str, String str2) {
        synchronized (GlobalAppRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88036460", new Object[]{str, str2});
                return;
            }
            if (sessionIndexMap == null) {
                sessionIndexMap = new HashMap();
            }
            if (sessionIndexMap.containsKey(str2)) {
                Map<String, Integer> map = sessionIndexMap;
                map.put(str2, Integer.valueOf(map.get(str2).intValue() + 1));
            } else {
                sessionIndexMap.put(str2, 0);
            }
            ALog.e(TAG, "[multiConnect] updateConnectIndex", str, HttpConstant.HOST, str2, "sessionIndexMap", sessionIndexMap.get(str2));
        }
    }
}
