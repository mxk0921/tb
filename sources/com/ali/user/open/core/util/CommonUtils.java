package com.ali.user.open.core.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.broadcast.LoginAction;
import com.ali.user.open.core.callback.FailureCallback;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.ResultCode;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.channels.FileLock;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BAICHUAN_TAG = "baichuan_mp";
    public static final String TAG = "ucc.CommonUtils";
    public static String mAppVersion;
    private static String sProcessName;

    static {
        t2o.a(71303234);
    }

    public static void addExt(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374c365e", new Object[]{map});
        } else if (ConfigManager.getInstance().isMiniProgram() && map != null) {
            map.put("sdkPlatform", BAICHUAN_TAG);
        }
    }

    private static void createFile(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4713e", new Object[]{file, new Boolean(z)});
        } else if (z) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String getAndroidAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28488a69", new Object[0]);
        }
        return "android_" + getAppVersion();
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        if (mAppVersion == null) {
            try {
                PackageInfo packageInfo = KernelContext.getApplicationContext().getPackageManager().getPackageInfo(KernelContext.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    mAppVersion = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return mAppVersion;
    }

    public static boolean getDarkModeStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89bf2c44", new Object[]{context})).booleanValue();
        }
        if (ConfigManager.getInstance().getThemeDataProvider() != null) {
            return ConfigManager.getInstance().getThemeDataProvider().isDark();
        }
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static String getHashString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80ae507d", new Object[]{bArr});
        }
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static String getLocalIPAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5be1b41", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getProcessName(android.content.Context r7) {
        /*
            java.lang.String r0 = "/proc/"
            com.android.alibaba.ip.runtime.IpChange r1 = com.ali.user.open.core.util.CommonUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "7512d303"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            java.lang.Object r7 = r1.ipc$dispatch(r0, r2)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0017:
            java.lang.String r1 = com.ali.user.open.core.util.CommonUtils.sProcessName
            if (r1 == 0) goto L_0x001c
            return r1
        L_0x001c:
            java.lang.Class<com.ali.user.open.core.util.CommonUtils> r1 = com.ali.user.open.core.util.CommonUtils.class
            monitor-enter(r1)
            java.lang.String r2 = com.ali.user.open.core.util.CommonUtils.sProcessName     // Catch: all -> 0x0025
            if (r2 == 0) goto L_0x0028
            monitor-exit(r1)     // Catch: all -> 0x0025
            return r2
        L_0x0025:
            r7 = move-exception
            goto L_0x00b1
        L_0x0028:
            int r2 = android.os.Process.myPid()     // Catch: all -> 0x0025
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: all -> 0x006d, Exception -> 0x006f
            java.io.FileReader r5 = new java.io.FileReader     // Catch: all -> 0x006d, Exception -> 0x006f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x006d, Exception -> 0x006f
            r6.<init>(r0)     // Catch: all -> 0x006d, Exception -> 0x006f
            r6.append(r2)     // Catch: all -> 0x006d, Exception -> 0x006f
            java.lang.String r0 = "/cmdline"
            r6.append(r0)     // Catch: all -> 0x006d, Exception -> 0x006f
            java.lang.String r0 = r6.toString()     // Catch: all -> 0x006d, Exception -> 0x006f
            r5.<init>(r0)     // Catch: all -> 0x006d, Exception -> 0x006f
            r4.<init>(r5)     // Catch: all -> 0x006d, Exception -> 0x006f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0058, Exception -> 0x005b
            r0.<init>()     // Catch: all -> 0x0058, Exception -> 0x005b
        L_0x004d:
            int r5 = r4.read()     // Catch: all -> 0x0058, Exception -> 0x005b
            if (r5 <= 0) goto L_0x005d
            char r5 = (char) r5     // Catch: all -> 0x0058, Exception -> 0x005b
            r0.append(r5)     // Catch: all -> 0x0058, Exception -> 0x005b
            goto L_0x004d
        L_0x0058:
            r7 = move-exception
            r3 = r4
            goto L_0x00a6
        L_0x005b:
            r0 = move-exception
            goto L_0x0071
        L_0x005d:
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x0058, Exception -> 0x005b
            com.ali.user.open.core.util.CommonUtils.sProcessName = r0     // Catch: all -> 0x0058, Exception -> 0x005b
            r4.close()     // Catch: all -> 0x0025, Exception -> 0x0067
            goto L_0x006b
        L_0x0067:
            r7 = move-exception
            r7.printStackTrace()     // Catch: all -> 0x0025
        L_0x006b:
            monitor-exit(r1)     // Catch: all -> 0x0025
            return r0
        L_0x006d:
            r7 = move-exception
            goto L_0x00a6
        L_0x006f:
            r0 = move-exception
            r4 = r3
        L_0x0071:
            r0.printStackTrace()     // Catch: all -> 0x0058
            if (r4 == 0) goto L_0x007e
            r4.close()     // Catch: all -> 0x0025, Exception -> 0x007a
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            r0.printStackTrace()     // Catch: all -> 0x0025
        L_0x007e:
            java.lang.String r0 = "activity"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: all -> 0x0025
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch: all -> 0x0025
            java.util.List r7 = r7.getRunningAppProcesses()     // Catch: all -> 0x0025
            java.util.Iterator r7 = r7.iterator()     // Catch: all -> 0x0025
        L_0x008e:
            boolean r0 = r7.hasNext()     // Catch: all -> 0x0025
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r7.next()     // Catch: all -> 0x0025
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: all -> 0x0025
            int r4 = r0.pid     // Catch: all -> 0x0025
            if (r4 != r2) goto L_0x008e
            java.lang.String r7 = r0.processName     // Catch: all -> 0x0025
            com.ali.user.open.core.util.CommonUtils.sProcessName = r7     // Catch: all -> 0x0025
            monitor-exit(r1)     // Catch: all -> 0x0025
            return r7
        L_0x00a4:
            monitor-exit(r1)     // Catch: all -> 0x0025
            return r3
        L_0x00a6:
            if (r3 == 0) goto L_0x00b0
            r3.close()     // Catch: all -> 0x0025, Exception -> 0x00ac
            goto L_0x00b0
        L_0x00ac:
            r0 = move-exception
            r0.printStackTrace()     // Catch: all -> 0x0025
        L_0x00b0:
            throw r7     // Catch: all -> 0x0025
        L_0x00b1:
            monitor-exit(r1)     // Catch: all -> 0x0025
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.util.CommonUtils.getProcessName(android.content.Context):java.lang.String");
    }

    public static void handleWebviewDir(Context context) {
        File dataDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad18885", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 29) {
            try {
                HashSet hashSet = new HashSet();
                dataDir = context.getDataDir();
                String absolutePath = dataDir.getAbsolutePath();
                String processName = getProcessName(context);
                if (!TextUtils.equals(context.getPackageName(), processName)) {
                    if (TextUtils.isEmpty(processName)) {
                        processName = context.getPackageName();
                    }
                    WebView.setDataDirectorySuffix(processName);
                    String str = "_" + processName;
                    hashSet.add(absolutePath + "/app_webview" + str + "/webview_data.lock");
                    if (isHuaweiRom()) {
                        hashSet.add(absolutePath + "/app_hws_webview" + str + "/webview_data.lock");
                    }
                } else {
                    String str2 = "_" + processName;
                    hashSet.add(absolutePath + "/app_webview/webview_data.lock");
                    hashSet.add(absolutePath + "/app_webview" + str2 + "/webview_data.lock");
                    if (isHuaweiRom()) {
                        hashSet.add(absolutePath + "/app_hws_webview/webview_data.lock");
                        hashSet.add(absolutePath + "/app_hws_webview" + str2 + "/webview_data.lock");
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    File file = new File((String) it.next());
                    if (file.exists()) {
                        tryLockOrRecreateFile(file);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isHuaweiRom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b30f816a", new Object[0])).booleanValue();
        }
        try {
            return Build.MANUFACTURER.toUpperCase().contains(SystemUtils.PRODUCT_HUAWEI);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f701db90", new Object[0])).booleanValue();
        }
        if (KernelContext.getApplicationContext() == null) {
            return true;
        }
        return isNetworkAvailable(KernelContext.getApplicationContext());
    }

    public static void onFailure(final FailureCallback failureCallback, final ResultCode resultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c299f967", new Object[]{failureCallback, resultCode});
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.util.CommonUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FailureCallback failureCallback2 = FailureCallback.this;
                    if (failureCallback2 != null) {
                        ResultCode resultCode2 = resultCode;
                        failureCallback2.onFailure(resultCode2.code, resultCode2.message);
                    }
                }
            });
        }
    }

    public static void sendBroadcast(LoginAction loginAction, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33453437", new Object[]{loginAction, map});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(loginAction.name());
        intent.setPackage(KernelContext.getApplicationContext().getPackageName());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(key == null || value == null)) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        KernelContext.getApplicationContext().sendBroadcast(intent);
    }

    public static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
        } else {
            sendUT(str, null);
        }
    }

    public static String toString(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79e33bfe", new Object[]{th});
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void toast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{str});
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.util.CommonUtils.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(KernelContext.getApplicationContext(), ResourceUtils.getString(str), 0).show();
                    }
                }
            });
        }
    }

    public static void toastSystemException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7bb1c0", new Object[0]);
        } else {
            toast("member_sdk_system_exception");
        }
    }

    public static void onFailure(final FailureCallback failureCallback, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515f30d3", new Object[]{failureCallback, new Integer(i), str});
        } else {
            KernelContext.executorService.postUITask(new Runnable() { // from class: com.ali.user.open.core.util.CommonUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FailureCallback failureCallback2 = FailureCallback.this;
                    if (failureCallback2 != null) {
                        failureCallback2.onFailure(i, str);
                    }
                }
            });
        }
    }

    public static void sendUT(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483ed10d", new Object[]{str, map});
        } else if (!TextUtils.isEmpty(str) && AliMemberSDK.getService(UserTrackerService.class) != null) {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send(str, map);
        }
    }

    private static void tryLockOrRecreateFile(File file) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4237dc72", new Object[]{file});
            return;
        }
        try {
            FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
            if (tryLock != null) {
                tryLock.close();
            } else {
                createFile(file, file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (file.exists()) {
                z = file.delete();
            }
            createFile(file, z);
        }
    }

    public static void addExt(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eda45d7", new Object[]{jSONObject});
        } else if (ConfigManager.getInstance().isMiniProgram() && jSONObject != null) {
            try {
                jSONObject.put("sdkPlatform", BAICHUAN_TAG);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String getNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context});
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connectivityManager == null) {
            SDKLogger.w(TAG, "can not get Context.CONNECTIVITY_SERVICE");
            return "none";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null) {
            SDKLogger.w(TAG, "can not get ConnectivityManager.TYPE_WIFI");
        } else if (NetworkInfo.State.CONNECTED == networkInfo.getState()) {
            return "wifi";
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 == null) {
            SDKLogger.w(TAG, "can not get ConnectivityManager.TYPE_MOBILE");
        } else if (NetworkInfo.State.CONNECTED == networkInfo2.getState()) {
            return "gprs";
        }
        return "none";
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo[] allNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING)) {
                return true;
            }
        }
        return false;
    }
}
