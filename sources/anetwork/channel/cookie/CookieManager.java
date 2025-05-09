package anetwork.channel.cookie;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PublicErrorStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.CookieHandler;
import java.net.CookieStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "anet.CookieManager";
    private static android.webkit.CookieManager webkitCookMgr;
    private static volatile boolean isSetup = false;
    public static boolean isCookieValid = true;
    public static AtomicInteger cookieRetryTime = new AtomicInteger(0);
    public static volatile boolean isSuccess = false;

    static {
        t2o.a(607126033);
    }

    public static /* synthetic */ void access$000(Context context, PublicErrorStatistic publicErrorStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0cf27", new Object[]{context, publicErrorStatistic});
        } else {
            doSetupTask(context, publicErrorStatistic);
        }
    }

    public static boolean checkSetup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca799c60", new Object[0])).booleanValue() : checkSetup("");
    }

    private static String getStackTrace() {
        StackTraceElement[] stackTrace;
        StackTraceElement stackTraceElement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("371aed46", new Object[0]);
        }
        String str = "";
        try {
            stackTrace = new Throwable().getStackTrace();
        } catch (Throwable th) {
            ALog.e(TAG, "Cookie Manager  getStackTrace fail! t=" + th.toString(), null, new Object[0]);
        }
        if (stackTrace == null) {
            return str;
        }
        for (int i = 0; i < stackTrace.length; i++) {
            if (stackTrace[i] != null && i < 25) {
                str = str + " [" + i + "] " + stackTraceElement.getClassName() + " " + stackTraceElement.getMethodName() + " " + stackTraceElement.getLineNumber();
            }
        }
        return str;
    }

    public static void printLog(String str, String str2, String str3, String str4) {
        CookieStore cookieStore;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d812086", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            ALog.e(TAG, "[cookie] get " + str, str2, "url", str4, "cookies", str3);
            java.net.CookieManager cookieManager = (java.net.CookieManager) CookieHandler.getDefault();
            if (cookieManager != null && (cookieStore = cookieManager.getCookieStore()) != null) {
                ALog.e(TAG, "[cookie] get " + str, str2, "url", str4, "cookieClass", cookieStore.getClass().toString());
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[cookie] get error " + str, str2, "url", str4, "cookies", str3, "error", th);
        }
    }

    public static synchronized void setCookie(String str, String str2) {
        synchronized (CookieManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d42fc581", new Object[]{str, str2});
            } else if (checkSetup() && isCookieValid) {
                webkitCookMgr.setCookie(str, str2);
                webkitCookMgr.flush();
            }
        }
    }

    @Deprecated
    public static void setTargetMonitorCookieName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb095c7", new Object[]{str});
        }
    }

    public static boolean checkSetup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdcae72a", new Object[]{str})).booleanValue();
        }
        boolean isAllowCookieOpened = AwcnConfig.isAllowCookieOpened();
        Context context = NetworkSdkSetting.getContext();
        ALog.e(TAG, "Cookie Manager checkSetup! isAllowCookieOpened = " + isAllowCookieOpened, null, "isSetup", Boolean.valueOf(isSetup), "isSuccess", Boolean.valueOf(isSuccess), "isContextNotNull", Boolean.valueOf(context != null));
        if (((!isAllowCookieOpened && !isSetup) || (isAllowCookieOpened && !isSuccess)) && context != null) {
            ALog.e(TAG, "Cookie Manager checkSetup!", null, new Object[0]);
            PublicErrorStatistic publicErrorStatistic = new PublicErrorStatistic("cookie_checkSetup");
            publicErrorStatistic.url = str;
            doSetupTask(NetworkSdkSetting.getContext(), publicErrorStatistic);
        }
        return isSetup;
    }

    public static synchronized String getCookie(String str) {
        synchronized (CookieManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
            } else if (!checkSetup() || !isCookieValid) {
                return null;
            } else {
                return webkitCookMgr.getCookie(str);
            }
        }
    }

    public static void setup(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2fc4", new Object[]{context});
            return;
        }
        final PublicErrorStatistic publicErrorStatistic = new PublicErrorStatistic("cookie_setup");
        publicErrorStatistic.startStackTrace = getStackTrace();
        if (AwcnConfig.isLaunchOptV2Opened()) {
            ALog.e(TAG, "Cookie Manager setup async!", null, new Object[0]);
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.cookie.CookieManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        CookieManager.access$000(context, publicErrorStatistic);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
            return;
        }
        ALog.e(TAG, "Cookie Manager setup sync!", null, new Object[0]);
        doSetupTask(context, publicErrorStatistic);
    }

    public static void setCookie(String str, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5430b32e", new Object[]{str, map});
        } else {
            setCookie("", str, map);
        }
    }

    private static synchronized void doSetupTask(Context context, PublicErrorStatistic publicErrorStatistic) {
        String str;
        synchronized (CookieManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b51a28e", new Object[]{context, publicErrorStatistic});
                return;
            }
            boolean isAllowCookieOpened = AwcnConfig.isAllowCookieOpened();
            ALog.e(TAG, "Cookie Manager doSetupTask! isAllowCookieOpened = " + isAllowCookieOpened, null, "isSetup", Boolean.valueOf(isSetup), "isSuccess", Boolean.valueOf(isSuccess), "cookieRetryTime", Integer.valueOf(cookieRetryTime.get()));
            if ((!isAllowCookieOpened && isSetup) || (isAllowCookieOpened && !isSuccess && cookieRetryTime.get() > AwcnConfig.getCookieRetryTime())) {
                return;
            }
            if (NetworkConfigCenter.isCookieDisable()) {
                ALog.e(TAG, "cookie manager disable.", null, new Object[0]);
                isSetup = true;
                isCookieValid = false;
                isSuccess = true;
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            android.webkit.CookieManager instance = android.webkit.CookieManager.getInstance();
            webkitCookMgr = instance;
            instance.setAcceptCookie(true);
            if (AwcnConfig.isCookieOptEnable()) {
                CookieHandler.setDefault(new NetworkCookieHandler(webkitCookMgr));
            }
            isSuccess = true;
            isCookieValid = true;
            ALog.e(TAG, "Cookie Manager doSetupTask.", null, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "isCookieOptEnable", Boolean.valueOf(AwcnConfig.isCookieOptEnable()));
            if (publicErrorStatistic == null) {
                str = "";
            } else {
                str = publicErrorStatistic.url;
            }
            GlobalAppRuntimeInfo.onProperty("network_cookie_init", str);
            if (isAllowCookieOpened) {
                cookieRetryTime.incrementAndGet();
            }
            isSetup = true;
        }
    }

    public static void setCookie(String str, String str2, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8043e4", new Object[]{str, str2, map});
        } else if (str2 != null && map != null) {
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        if (!key.equalsIgnoreCase("Set-Cookie") && !key.equalsIgnoreCase(HttpConstant.SET_COOKIE2)) {
                        }
                        for (String str3 : entry.getValue()) {
                            setCookie(str2, str3);
                            if (AwcnConfig.isHostInCookiePrintLogWhiteList(str)) {
                                ALog.e(TAG, "[cookie] " + key, null, "url", str2, "cookies", str3);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "set cookie failed", null, e, "url", str2, "\nheaders", map);
            }
        }
    }

    public static void commitStat(String str, String str2, String str3, String str4, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d41f5a", new Object[]{str, str2, str3, str4, new Long(j), new Long(j2)});
            return;
        }
        try {
            AppMonitor.getInstance().commitStat(new PublicErrorStatistic("custom_cookie", str, str4, str3, j, j2));
        } catch (Throwable th) {
            ALog.e(TAG, "[cookie] get error ", str2, "url", str, "cookies", str3, "error", th);
        }
    }
}
