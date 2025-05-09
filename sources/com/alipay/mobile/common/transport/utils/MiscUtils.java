package com.alipay.mobile.common.transport.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.utils.config.fmk.ConfigureItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import tb.ulu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MiscUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_CHINA = 1;
    public static final int FLAG_TAIWAN = 2;
    public static final int FLAG_US = 4;
    public static final String KEY_RUNNING = "running";
    public static final String KEY_TOP = "top";
    public static final String TAG = "MiscUtils";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f4144a = null;
    public static Boolean b = null;
    public static String c = "";
    public static final String testGwUrlBase64 = "aHR0cHM6Ly9tb2JpbGVndy50ZXN0LmFsaXBheS5uZXQvbWd3Lmh0bQ==";
    public static final String test_1_64_gwHostBase64 = "bW9iaWxlZ3ctMS02NC50ZXN0LmFsaXBheS5uZXQ=";
    public static final String[] BACKGROUND_RPC_APIS = {"alipay.security.vkeyDFP.staticData.report", "alipay.discovery.movie.getPreloadList", "alipay.mobileappcommon.repairinfo"};
    public static final String[] RPC_LOG_BACKLIST = {"alipay.mobilerelation.friend.getMobileContact"};
    public static final String[] LOGIN_APIS = {"alipay.user.login", "ali.user.gw.unifyLogin"};
    public static String RELEASE_TYPE = null;
    public static String CHANNEL_ID = null;
    public static int LANGUAGE_FLAG = 1;
    public static String d = "";
    public static String e = "";
    public static boolean f = false;
    public static Boolean g = null;
    public static final String[] h = {"com.eg.android.AlipayGphone", MspGlobalDefine.PACKAGE_AFWEALTH, "com.alipay.m.portal", "com.taobao.mobile.dipei"};
    public static Boolean i = null;
    public static Boolean j = null;
    public static long k = 0;
    public static Boolean l = null;
    public static Boolean m = null;
    public static String[] n = null;
    public static long o = 0;

    public static String generateRandomStr(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e16ec7d", new Object[]{new Integer(i2)});
        }
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    public static String getAmnetServerAddressFromMetaData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61264f6a", new Object[0]);
        }
        try {
            Context context = TransportEnvUtil.getContext();
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("sandbox.amnet.server");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, th);
            return null;
        }
    }

    public static final boolean getBooleanFromMetaData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8620f24", new Object[]{context, str})).booleanValue();
        }
        return TransportStrategy.getBooleanFromMetaData(context, str, Boolean.FALSE).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getCpuModel() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.transport.utils.MiscUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "c419bb82"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: all -> 0x004d, Exception -> 0x0052
            java.io.FileReader r2 = new java.io.FileReader     // Catch: all -> 0x004d, Exception -> 0x0052
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch: all -> 0x004d, Exception -> 0x0052
            r1.<init>(r2)     // Catch: all -> 0x004d, Exception -> 0x0052
        L_0x001f:
            java.lang.String r0 = r1.readLine()     // Catch: all -> 0x0045, Exception -> 0x0047
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r0.trim()     // Catch: all -> 0x0045, Exception -> 0x0047
            java.lang.String r3 = "Hardware"
            boolean r2 = r2.startsWith(r3)     // Catch: all -> 0x0045, Exception -> 0x0047
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = ":"
            int r2 = r0.indexOf(r2)     // Catch: all -> 0x0045, Exception -> 0x0047
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r2)     // Catch: all -> 0x0045, Exception -> 0x0047
            java.lang.String r0 = r0.trim()     // Catch: all -> 0x0045, Exception -> 0x0047
            r1.close()     // Catch: Exception -> 0x0044
        L_0x0044:
            return r0
        L_0x0045:
            r0 = move-exception
            goto L_0x0076
        L_0x0047:
            r0 = move-exception
            goto L_0x0056
        L_0x0049:
            r1.close()     // Catch: Exception -> 0x0073
            goto L_0x0073
        L_0x004d:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0076
        L_0x0052:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0056:
            java.lang.String r2 = "MiscUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0045
            r3.<init>()     // Catch: all -> 0x0045
            java.lang.String r4 = "getCpuModel Exception: "
            r3.append(r4)     // Catch: all -> 0x0045
            java.lang.String r0 = r0.getMessage()     // Catch: all -> 0x0045
            r3.append(r0)     // Catch: all -> 0x0045
            java.lang.String r0 = r3.toString()     // Catch: all -> 0x0045
            com.alipay.mobile.common.transport.utils.LogCatUtil.debug(r2, r0)     // Catch: all -> 0x0045
            if (r1 == 0) goto L_0x0073
            goto L_0x0049
        L_0x0073:
            java.lang.String r0 = ""
            return r0
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            r1.close()     // Catch: Exception -> 0x007b
        L_0x007b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.utils.MiscUtils.getCpuModel():java.lang.String");
    }

    public static final String getCurProcessName(Context context) {
        String processName;
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                c = processName;
                LogCatUtil.info(TAG, "curProcessName from Application= " + c);
            }
            if (!TextUtils.isEmpty(c)) {
                return c;
            }
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "getCurProcessName from Application. ex=" + th.toString());
        }
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]);
            declaredMethod2.setAccessible(true);
            c = (String) declaredMethod2.invoke(invoke, new Object[0]);
            LogCatUtil.info(TAG, "curProcessName from ActivityThread= " + c);
        } catch (Throwable th2) {
            LogCatUtil.warn(TAG, "class load fail for ActivityThread. ex=" + th2.toString());
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        try {
            Class<?> cls2 = Class.forName("android.ddm.DdmHandleAppName");
            c = (String) cls2.getDeclaredMethod("getAppName", new Class[0]).invoke(cls2, new Object[0]);
            LogCatUtil.info(TAG, "curProcessName from DdmHandleAppName= " + c);
        } catch (Throwable th3) {
            LogCatUtil.warn(TAG, "class load fail for DdmHandleAppName. ex=" + th3.toString());
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            LogCatUtil.warn(TAG, "runningAppProcesses is null");
            return c;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                c = next.processName;
                LogCatUtil.info(TAG, "curProcessName from RunningAppProcessInfo= " + c);
                break;
            }
        }
        return c;
    }

    public static int getDefaultPort(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf2bf2b0", new Object[]{str})).intValue();
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        return "https".equalsIgnoreCase(str) ? 443 : -1;
    }

    public static final int getEffectivePort(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bec7ef33", new Object[]{str, new Integer(i2)})).intValue();
        }
        if (i2 != -1) {
            return i2;
        }
        return getDefaultPort(str);
    }

    public static final String getInvokeStartTimeKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48bdb587", new Object[]{str, str2});
        }
        return "rpc#" + str + "#" + str2;
    }

    public static final String getMetaData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3049a41a", new Object[]{context, str});
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, " getMetaData exception. ", th);
            return "";
        }
    }

    public static final Object getMetaDataVO(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2d866c25", new Object[]{context, str});
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, " getMetaData exception. ", th);
            return null;
        }
    }

    public static String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[0]);
        }
        try {
            return TransportEnvUtil.getContext().getPackageName();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getPackageName ex= " + th.toString());
            return "";
        }
    }

    public static final int getPortByUrlObj(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("283428f", new Object[]{url})).intValue();
        }
        if (url == null) {
            return -1;
        }
        int port = url.getPort();
        if (port > 0) {
            return port;
        }
        return getDefaultPort(url.getProtocol());
    }

    public static String getReleaseChannelId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d623ff8c", new Object[]{context});
        }
        if (!TextUtils.isEmpty(CHANNEL_ID)) {
            return CHANNEL_ID;
        }
        synchronized (MiscUtils.class) {
            if (!TextUtils.isEmpty(CHANNEL_ID)) {
                return CHANNEL_ID;
            }
            try {
                Properties properties = new Properties();
                properties.load(context.getAssets().open("channel.config"));
                for (Map.Entry entry : properties.entrySet()) {
                    if (TextUtils.equals(String.valueOf(entry.getKey()), NotificationCompat.TvExtender.EXTRA_CHANNEL_ID)) {
                        Object value = entry.getValue();
                        if (value == null) {
                            CHANNEL_ID = "unkown";
                            return "unkown";
                        }
                        String valueOf = String.valueOf(value);
                        CHANNEL_ID = valueOf;
                        return valueOf;
                    }
                }
            } catch (Exception e2) {
                LogCatUtil.warn(TAG, "getReleaseChannelId error " + e2.toString());
            }
            CHANNEL_ID = "unkown";
            return "unkown";
        }
    }

    public static String getReleaseType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce6c810a", new Object[]{context});
        }
        if (!TextUtils.isEmpty(RELEASE_TYPE)) {
            return RELEASE_TYPE;
        }
        synchronized (MiscUtils.class) {
            if (!TextUtils.isEmpty(RELEASE_TYPE)) {
                return RELEASE_TYPE;
            }
            try {
                Properties properties = new Properties();
                properties.load(context.getAssets().open("channel.config"));
                for (Map.Entry entry : properties.entrySet()) {
                    if (TextUtils.equals(String.valueOf(entry.getKey()), "release_type")) {
                        Object value = entry.getValue();
                        if (value == null) {
                            RELEASE_TYPE = "unkown";
                            return "unkown";
                        }
                        String valueOf = String.valueOf(value);
                        RELEASE_TYPE = valueOf;
                        return valueOf;
                    }
                }
            } catch (Exception e2) {
                LogCatUtil.warn(TAG, "getReleaseType error occurr " + e2.toString());
            }
            RELEASE_TYPE = "unkown";
            return "unkown";
        }
    }

    public static final Throwable getRootCause(Throwable th) {
        Throwable th2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("773a7d62", new Object[]{th});
        }
        try {
            th2 = null;
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                th2 = cause;
            }
        } catch (Exception unused) {
            LogCatUtil.warn(TAG, "getRootCause exception : " + th.toString());
        }
        return th2 != null ? th2 : th;
    }

    public static final String getSharedPrefsDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30438fd7", new Object[]{context});
        }
        try {
            return context.getFilesDir().getParent() + ulu.FILE_STATIC_CONFIG_DIR;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "getSharedPrefsDir exception" + th.toString());
            return "";
        }
    }

    public static final String getStringFromMetaData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("107fc515", new Object[]{context, str});
        }
        try {
            Object metaDataVO = getMetaDataVO(context, str);
            if (metaDataVO == null) {
                return "";
            }
            if (metaDataVO instanceof String) {
                return (String) metaDataVO;
            }
            LogCatUtil.info(TAG, "[getStringFromMetaData] Value type is = ".concat(metaDataVO.getClass().getName()));
            return metaDataVO.toString();
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[getStringFromMetaData] Exception: " + th.toString());
            return "";
        }
    }

    public static String getTestGwUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a62a6522", new Object[0]);
        }
        try {
            if (TextUtils.isEmpty(d)) {
                d = new String(Base64.decode(testGwUrlBase64, 0), "UTF-8");
            }
            LogCatUtil.debug(TAG, "testGwUrl= " + d);
            return d;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return "";
        }
    }

    public static String getTest_1_64_gwHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74994f65", new Object[0]);
        }
        try {
            if (TextUtils.isEmpty(e)) {
                e = new String(Base64.decode(test_1_64_gwHostBase64, 0), "UTF-8");
            }
            LogCatUtil.debug(TAG, "test_1_64_gwHost= " + e);
            return e;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return "";
        }
    }

    public static String getTopDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f97c90c", new Object[]{str});
        }
        try {
            URI uri = new URI(str);
            return uri.getHost().substring(uri.getHost().indexOf("."));
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getTopDomain ex:" + th.toString());
            return str;
        }
    }

    public static final String[] getUrlconnectionHostList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("4b32b633", new Object[0]);
        }
        if (n != null && SystemClock.elapsedRealtime() < o) {
            return n;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.URLCONNECTION_HOST_LIST);
        if (TextUtils.isEmpty(stringValue)) {
            return null;
        }
        try {
            n = stringValue.split(",");
            o = SystemClock.elapsedRealtime() + 300000;
            return n;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Map<String, String> getWalletProcState(Context context) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8f1d16a", new Object[]{context});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("top", "false");
        hashMap.put(KEY_RUNNING, "false");
        try {
            if (isAtFrontDesk(context)) {
                hashMap.put("top", "true");
                hashMap.put(KEY_RUNNING, "true");
            } else {
                hashMap.put("top", "false");
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(100);
                if (runningTasks != null && !runningTasks.isEmpty()) {
                    for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                        componentName = runningTaskInfo.baseActivity;
                        String packageName = context.getPackageName();
                        if (componentName != null && packageName.equalsIgnoreCase(componentName.getPackageName())) {
                            hashMap.put(KEY_RUNNING, "true");
                            break;
                        }
                    }
                }
                return hashMap;
            }
        } catch (Exception e2) {
            LogCatUtil.error(TAG, e2);
        }
        return hashMap;
    }

    public static final boolean grayscale(String str) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a76e01c", new Object[]{str})).booleanValue();
        }
        String[] split = str.split("-");
        if (split.length == 2 && (parseInt = Integer.parseInt(split[0])) > 0) {
            return grayscale(Integer.parseInt(split[1]), parseInt);
        }
        return false;
    }

    public static final boolean grayscaleUtdid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73978218", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.equals(str2, "0") && !TextUtils.equals(str2, "-1")) {
            try {
                String[] split = str2.split(",");
                int length = split.length;
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = Integer.parseInt(split[i2]);
                }
                return grayscaleUtdid(str, iArr);
            } catch (Throwable th) {
                LogCatUtil.error(TAG, "grayscaleUtdid exception", th);
            }
        }
        return false;
    }

    public static final boolean grayscaleUtdidForABTest(ConfigureItem configureItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bff1e6ae", new Object[]{configureItem})).booleanValue();
        }
        return true;
    }

    public static Object invokeMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
        return obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
    }

    public static boolean isAlipayGW(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d36d4f99", new Object[]{str})).booleanValue();
        }
        try {
            return TransportStrategy.isAlipayUrl(str);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return false;
        }
    }

    public static final boolean isBgRpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c532766b", new Object[]{str})).booleanValue();
        }
        int i2 = 0;
        while (true) {
            String[] strArr = BACKGROUND_RPC_APIS;
            if (i2 >= strArr.length) {
                return false;
            }
            if (TextUtils.equals(strArr[i2], str)) {
                return true;
            }
            i2++;
        }
    }

    public static final boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.trim().length() <= 0) {
            return true;
        }
        return false;
    }

    public static final boolean isEnableExtTransport(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4271fb50", new Object[]{context})).booleanValue();
        }
        if (isInAlipayClient(context) || TransportStrategy.isEnabledEnhanceNetworkModule()) {
            return true;
        }
        return false;
    }

    public static boolean isExistMultiMainProcess(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbfc1bdb", new Object[]{context})).booleanValue();
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            String packageName = context.getPackageName();
            i2 = 0;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (packageName.equals(runningAppProcessInfo.processName)) {
                    i2++;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }

    public static boolean isGreatEqualAndroid5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fa54142", new Object[0])).booleanValue();
        }
        return true;
    }

    public static final boolean isInAlipayClient(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c322f61", new Object[]{context})).booleanValue();
        }
        Boolean bool = g;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        String[] strArr = h;
        for (int i2 = 0; i2 < 4; i2++) {
            if (packageName.startsWith(strArr[i2])) {
                Boolean bool2 = Boolean.TRUE;
                g = bool2;
                return bool2.booleanValue();
            }
        }
        Boolean bool3 = Boolean.FALSE;
        g = bool3;
        return bool3.booleanValue();
    }

    public static final boolean isInLogBackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2ee52f", new Object[]{str})).booleanValue();
        }
        for (String str2 : RPC_LOG_BACKLIST) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInUrlconnectionHostList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcfca1f9", new Object[]{str})).booleanValue();
        }
        String[] urlconnectionHostList = getUrlconnectionHostList();
        if (urlconnectionHostList != null && urlconnectionHostList.length > 0) {
            for (String str2 : urlconnectionHostList) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isLoginRpc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af2f671b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : LOGIN_APIS) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isOtherProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d5b7e3c", new Object[]{context})).booleanValue();
        }
        return isPushProcess(context);
    }

    public static boolean isOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[0])).booleanValue();
        }
        return f;
    }

    @Deprecated
    public static final boolean isPushProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14e4069a", new Object[]{context})).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        String curProcessName = getCurProcessName(context);
        LogCatUtil.info(TAG, "curProcessName:" + curProcessName);
        if (!TextUtils.equals(context.getPackageName(), curProcessName)) {
            LogCatUtil.verbose(TAG, "Other Process");
            b = Boolean.TRUE;
        } else {
            LogCatUtil.verbose(TAG, "Main Process");
            b = Boolean.FALSE;
        }
        return b.booleanValue();
    }

    public static boolean isRCVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c83e6c8", new Object[]{context})).booleanValue();
        }
        return AppInfoUtil.isReleaseTypeRC();
    }

    public static boolean isSandboxChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a21191", new Object[0])).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isSandboxChannel ex:" + th.toString());
        }
        if (!isInAlipayClient(TransportEnvUtil.getContext())) {
            LogCatUtil.printInfo(TAG, "not alipay, isSandboxChannel return false.");
            return false;
        }
        String releaseChannelId = getReleaseChannelId(TransportEnvUtil.getContext());
        if (TextUtils.isEmpty(releaseChannelId)) {
            return false;
        }
        return releaseChannelId.contains("sandbox") || releaseChannelId.contains("special_channel");
    }

    public static final boolean isScreenOn(Context context) {
        try {
            boolean booleanValue = ((Boolean) PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager) context.getSystemService("power"), new Object[0])).booleanValue();
            LogCatUtil.info(TAG, "isScreenOn=" + booleanValue);
            return booleanValue;
        } catch (Throwable th) {
            LogCatUtil.info(TAG, "API < 7," + th);
            return false;
        }
    }

    public static final boolean isServiceAvailable(Context context, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3051489e", new Object[]{context, cls})).booleanValue();
        }
        try {
            return !context.getPackageManager().queryIntentServices(new Intent(context, cls), 65536).isEmpty();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "[isServiceAvailable] Exception: " + th.toString(), th);
            return false;
        }
    }

    public static final boolean isTFSHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dcb4654", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "tfsimg.alipay.com");
    }

    public static boolean isTestUrl(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382605fd", new Object[]{url})).booleanValue();
        }
        try {
            return TextUtils.equals(url.getHost(), getTest_1_64_gwHost());
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return false;
        }
    }

    public static final String replaceTFS2CDN(URI uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("827a090f", new Object[]{uri});
        }
        return "http://tfs.alipayobjects.com" + uri.getPath();
    }

    public static void setOversea(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273e1294", new Object[]{new Boolean(z)});
        } else {
            f = z;
        }
    }

    public static final String getConfigFromSdcard(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b7ff4c", new Object[]{str});
        }
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (!TextUtils.equals("mounted", externalStorageState) && !TextUtils.equals("mounted_ro", externalStorageState)) {
                return null;
            }
            File filesDir = TransportEnvUtil.getContext().getFilesDir();
            if (filesDir.exists() && filesDir.isDirectory() && filesDir.canRead()) {
                File file = new File(filesDir, str);
                if (file.exists() && file.isFile() && file.canRead()) {
                    StringBuilder sb = new StringBuilder();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (-1 != read) {
                            sb.append(new String(bArr, 0, read));
                        } else {
                            String sb2 = sb.toString();
                            LogCatUtil.debug(TAG, "MiscUtils#getConfigFromSdcard(). 加载本地配置：" + sb2);
                            fileInputStream.close();
                            return sb2;
                        }
                    }
                }
                LogCatUtil.warn(TAG, "file=" + file.getAbsolutePath() + ",canRead=" + file.canRead() + ",exists=" + file.exists());
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getConfigFromSdcard ex", th);
            return null;
        }
    }

    public static final String getCurShortProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0f01647", new Object[]{context});
        }
        try {
            String curProcessName = getCurProcessName(context);
            if (isEmpty(curProcessName)) {
                return "main";
            }
            String[] split = curProcessName.split(":");
            if (split.length >= 2) {
                return split[1];
            }
            return "main";
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getCurShortProcessName fail", th);
            return "main";
        }
    }

    public static boolean isAlipayLocalPackage(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81033af6", new Object[]{context})).booleanValue();
        }
        Boolean bool = m;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String releaseType = AppInfoUtil.getReleaseType();
            LogCatUtil.info(TAG, " getReleaseType:" + releaseType);
            if (AppInfoUtil.isReleaseTypeDev()) {
                m = Boolean.TRUE;
            } else {
                m = Boolean.FALSE;
            }
            return m.booleanValue();
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "getReleaseType exception : " + th.toString());
            return true;
        }
    }

    public static final boolean isAtFrontDesk(Context context) {
        Boolean bool;
        Boolean bool2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41893560", new Object[]{context})).booleanValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (k > elapsedRealtime && (bool2 = l) != null) {
                return bool2.booleanValue();
            }
            synchronized (MiscUtils.class) {
                if (k > elapsedRealtime && (bool = l) != null) {
                    return bool.booleanValue();
                }
                boolean a2 = a(context);
                k = SystemClock.elapsedRealtime() + 1000;
                return a2;
            }
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, "isAtFrontDesk Exception: " + e2.toString());
            return false;
        }
    }

    public static boolean isOnlineUrl(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c16415c", new Object[]{url})).booleanValue();
        }
        try {
            return TextUtils.equals(url.getHost(), DnsValue.DOMAIN_MOBILE_GW);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return false;
        }
    }

    public static boolean isPreUrl(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd19f9e0", new Object[]{url})).booleanValue();
        }
        try {
            return TextUtils.equals(url.getHost(), "mobilegwpre.alipay.com");
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return false;
        }
    }

    public static final boolean isRealPushProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c241958", new Object[]{context})).booleanValue();
        }
        Boolean bool = j;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean equals = (context.getPackageName() + ":push").equals(getCurProcessName(context));
            j = Boolean.valueOf(equals);
            return equals;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "isRealPushProcess exception " + th.toString());
            return false;
        }
    }

    public static boolean isSandboxUrl(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e2af73c", new Object[]{url})).booleanValue();
        }
        try {
            return TextUtils.equals(url.getHost(), "mobilegw.alipaydev.com");
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return false;
        }
    }

    public static final boolean isToolProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84aada18", new Object[]{context})).booleanValue();
        }
        Boolean bool = i;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean equals = (context.getPackageName() + ":tools").equals(getCurProcessName(context));
            i = Boolean.valueOf(equals);
            return equals;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "isToolProcess exception " + th.toString());
            return false;
        }
    }

    public static boolean a(Context context) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        componentName = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1).get(0).topActivity;
        if (componentName == null) {
            l = Boolean.FALSE;
            return false;
        } else if (!context.getPackageName().equalsIgnoreCase(componentName.getPackageName()) || componentName.getShortClassName().contains("FlyBirdWindowActivity")) {
            LogCatUtil.info(TAG, "topActivity return false. topActivity ShortClassName=[" + componentName.getShortClassName() + "]");
            l = Boolean.FALSE;
            return false;
        } else {
            LogCatUtil.info(TAG, "topActivity return true. topActivity ShortClassName=[" + componentName.getShortClassName() + "]");
            l = Boolean.TRUE;
            return true;
        }
    }

    public static final boolean isDebugger(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4275d9a", new Object[]{context})).booleanValue();
        }
        Boolean bool = f4144a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f4144a = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isDebugger error, default return false.", th);
            return false;
        }
    }

    public static boolean isMainProcessRuning(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3f1c82", new Object[]{context})).booleanValue();
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (packageName.equals(runningAppProcessInfo.processName)) {
                    LogCatUtil.info(TAG, "isMainProcessRuning is true");
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
        return false;
    }

    public static boolean isMdapApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaab2bf", new Object[]{str})).booleanValue();
        }
        try {
            if (!isInAlipayClient(TransportEnvUtil.getContext())) {
                return false;
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MDAP_APIS);
            if (!TextUtils.isEmpty(stringValue) && !TextUtils.isEmpty(str)) {
                for (String str2 : stringValue.split(",")) {
                    if (TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isMdapApi ex:" + th.toString());
            return false;
        }
    }

    public static boolean isNeedShowUserTip(Context context) {
        Throwable th;
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("550747f2", new Object[]{context})).booleanValue();
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open("channel.config")));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (TextUtils.isEmpty(readLine)) {
                            bufferedReader2.close();
                            break;
                        }
                        String trim = readLine.trim();
                        if (trim.startsWith("isShowUserTip") && trim.endsWith("true")) {
                            bufferedReader2.close();
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        bufferedReader = bufferedReader2;
                        LogCatUtil.warn(TAG, "isNeedShowUserTip exception : " + e2.toString());
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean isPushProcessRuning(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1de87ca3", new Object[]{context})).booleanValue();
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            String str = context.getPackageName() + ":push";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    LogCatUtil.info(TAG, "isPushProcessRuning is true");
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
        return false;
    }

    public static boolean isShowUserTip(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50e55e3c", new Object[]{context})).booleanValue();
        }
        try {
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, "isShowUserTip exception : " + e2.toString());
        }
        if (isInAlipayClient(context)) {
            return isNeedShowUserTip(context) && context.getSharedPreferences("usertip", 0).getBoolean("showTip", true);
        }
        LogCatUtil.printInfo(TAG, "not alipay, isShowUserTip return false");
        return false;
    }

    public static final boolean grayscale(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a6272b2", new Object[]{new Integer(i2), new Integer(i3)})).booleanValue();
        }
        try {
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, e2);
        }
        return new Random().nextInt(i2 / i3) == 0;
    }

    public static final boolean isServiceAvailable(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf2f6411", new Object[]{context, str})).booleanValue();
        }
        try {
            return isServiceAvailable(context, Class.forName(str));
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "[isServiceAvailable] Exception: " + th.toString(), th);
            return false;
        }
    }

    public static final boolean grayscaleUtdid(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da6bb5c", new Object[]{str, iArr})).booleanValue();
        }
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                if (i2 == 64) {
                }
            }
            return true;
        }
        if (str == null || str.length() < 2) {
            if (iArr == null || iArr.length < 1) {
                return false;
            }
            for (int i3 : iArr) {
                if (i3 < 64) {
                    return false;
                }
            }
            return true;
        } else if (iArr == null || iArr.length == 0 || iArr[iArr.length - 1] == 0) {
            return false;
        } else {
            int length = iArr.length;
            if (iArr.length > str.length()) {
                length = str.length();
            }
            int i4 = 0;
            int i5 = 1;
            while (i4 < length) {
                if ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(str.charAt(str.length() - i5)) > iArr[length - i5]) {
                    return false;
                }
                i4++;
                i5++;
            }
            return true;
        }
    }
}
