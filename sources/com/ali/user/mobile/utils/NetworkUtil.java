package com.ali.user.mobile.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import anet.channel.status.NetworkStatusHelper;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = "login.util";

    static {
        t2o.a(68157647);
    }

    public static boolean checkEnv(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc8080", new Object[]{context})).booleanValue();
        }
        if (!hasSimCard(context) || isAirModeEnable(context) || !isMobileNetworkOpen(context)) {
            return false;
        }
        return true;
    }

    public static void doInOrange(final DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8e734b", new Object[]{dataCallback});
        } else if (dataCallback != null) {
            OrangeConfig.getInstance().registerListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, new obk() { // from class: com.ali.user.mobile.utils.NetworkUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.obk
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, this);
                    try {
                        DataCallback.this.result("");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void getCarrier(android.content.Context r5, java.util.Properties r6) {
        /*
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = com.ali.user.mobile.utils.NetworkUtil.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "dc3deb5b"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r1.ipc$dispatch(r0, r2)
            return
        L_0x0017:
            if (r6 != 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.String r1 = "phone"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: Exception -> 0x0037
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch: Exception -> 0x0037
            if (r5 == 0) goto L_0x003a
            int r1 = r5.getSimState()     // Catch: Exception -> 0x0037
            r2 = 5
            if (r1 != r2) goto L_0x003a
            java.lang.String r1 = r5.getSimOperator()     // Catch: Exception -> 0x0037
            java.lang.String r5 = r5.getSimOperatorName()     // Catch: Exception -> 0x0035
            goto L_0x0058
        L_0x0035:
            r5 = move-exception
            goto L_0x003d
        L_0x0037:
            r5 = move-exception
            r1 = r0
            goto L_0x003d
        L_0x003a:
            r5 = r0
            r1 = r5
            goto L_0x0058
        L_0x003d:
            java.lang.String r2 = com.ali.user.mobile.utils.NetworkUtil.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception: "
            r3.<init>(r4)
            java.lang.String r4 = r5.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.taobao.login4android.log.LoginTLogAdapter.e(r2, r3)
            r5.printStackTrace()
            r5 = r0
        L_0x0058:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x005f
            r1 = r0
        L_0x005f:
            java.lang.String r2 = "login_carrierCode"
            r6.put(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r0 = r5
        L_0x006d:
            java.lang.String r5 = "login_carrierName"
            r6.put(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.utils.NetworkUtil.getCarrier(android.content.Context, java.util.Properties):void");
    }

    public static String getMaskMobile() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce2da2d5", new Object[0]) : getMaskMobile(false);
    }

    public static boolean isAirModeEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbfeb1ff", new Object[]{context})).booleanValue();
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean isMobileNetworkOpen(Context context) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean isNetworkConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("614c23d0", new Object[0])).booleanValue();
        }
        try {
            return NetworkStatusHelper.isConnected();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean isSuEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b89fada", new Object[0])).booleanValue();
        }
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/sd/xbin/su"};
        for (int i = 0; i < 10; i++) {
            try {
                String str = strArr[i];
                File file = new File(str + "su");
                if (file.exists() && file.canExecute()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean isWifiConnected(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c843cafb", new Object[]{context})).booleanValue();
        }
        if (getNetworkInfoType(context) == 2) {
            return true;
        }
        return false;
    }

    public static void preFecth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e320e6", new Object[]{str});
        } else if (ServiceFactory.getService(NumberAuthService.class) != null && ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).needPrefetch()) {
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth(str);
        }
    }

    public static String getMaskMobile(boolean z) {
        Map<String, String> authInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ac4dcb7", new Object[]{new Boolean(z)});
        }
        if (ServiceFactory.getService(NumberAuthService.class) == null || (authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap(z)) == null || !authInfoMap.containsKey("number")) {
            return null;
        }
        return authInfoMap.get("number");
    }

    public static int getNetworkInfoType(Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fa9cdf4", new Object[]{context})).intValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    i = 1;
                } else if (activeNetworkInfo.getType() == 1) {
                    i = 2;
                }
            }
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "requestBy4G getNetworkInfoType error:", th);
        }
        String str = TAG;
        LoginTLogAdapter.e(str, "requestBy4G getNetworkInfoType type:" + i);
        return i;
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
            return "none";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && NetworkInfo.State.CONNECTED == networkInfo.getState()) {
            return "wifi";
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo2.getState()) {
                return "gprs";
            }
        }
        return "none";
    }

    public static boolean hasSimCard(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc8d37b8", new Object[]{context})).booleanValue();
        }
        return ((TelephonyManager) context.getSystemService("phone")).getSimState() == 5;
    }
}
