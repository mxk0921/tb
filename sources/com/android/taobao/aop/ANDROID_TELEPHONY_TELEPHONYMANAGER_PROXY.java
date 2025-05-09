package com.android.taobao.aop;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String sDeviceID;
    public static String sImei;
    public static String sMeid;
    public static String sSimSerialNumber;
    public static String sSubscriberId;
    public static boolean sGetDeviceChecked = false;
    public static boolean sGetImeiChecked = false;
    public static boolean sGetSimSerialNumberChecked = false;
    public static boolean sGetMeidChecked = false;
    public static boolean sGetsSubscriberIdChecked = false;

    static {
        t2o.a(497025030);
    }

    private static boolean limitedOS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee13689", new Object[0])).booleanValue();
        }
        if (Globals.getApplication().getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static String proxy_getDeviceId(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c346000", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetDeviceChecked) {
            return sDeviceID;
        }
        if (telephonyManager != null) {
            try {
                sDeviceID = telephonyManager.getDeviceId();
            } catch (SecurityException unused) {
            }
        }
        sGetDeviceChecked = true;
        return sDeviceID;
    }

    public static String proxy_getImei(TelephonyManager telephonyManager) {
        String imei;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5248a6a9", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetImeiChecked) {
            return sImei;
        }
        if (telephonyManager != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    imei = telephonyManager.getImei();
                    sImei = imei;
                }
            } catch (SecurityException unused) {
            }
        }
        sGetImeiChecked = true;
        return sImei;
    }

    public static String proxy_getMeid(TelephonyManager telephonyManager) {
        String meid;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e368d1e", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetMeidChecked) {
            return sMeid;
        }
        if (telephonyManager != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    meid = telephonyManager.getMeid();
                    sMeid = meid;
                }
            } catch (SecurityException unused) {
            }
        }
        sGetMeidChecked = true;
        return sMeid;
    }

    public static int proxy_getNetworkType(TelephonyManager telephonyManager) {
        int dataNetworkType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81dc93a0", new Object[]{telephonyManager})).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (telephonyManager != null) {
                    dataNetworkType = telephonyManager.getDataNetworkType();
                    return dataNetworkType;
                }
            } else if (telephonyManager != null) {
                return telephonyManager.getNetworkType();
            }
        } catch (SecurityException unused) {
        }
        return 0;
    }

    public static String proxy_getSimSerialNumber(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6a26547", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetSimSerialNumberChecked) {
            return sSimSerialNumber;
        }
        if (telephonyManager != null) {
            try {
                sSimSerialNumber = telephonyManager.getSimSerialNumber();
            } catch (SecurityException unused) {
            }
        }
        sGetSimSerialNumberChecked = true;
        return sSimSerialNumber;
    }

    public static String proxy_getSubscriberId(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d485892e", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetsSubscriberIdChecked) {
            return sSubscriberId;
        }
        if (telephonyManager != null) {
            try {
                sSubscriberId = telephonyManager.getSubscriberId();
            } catch (SecurityException unused) {
            }
        }
        sGetsSubscriberIdChecked = true;
        return sSubscriberId;
    }

    public static String proxy_getDeviceId(TelephonyManager telephonyManager, int i) {
        String deviceId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abd6889d", new Object[]{telephonyManager, new Integer(i)});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetDeviceChecked) {
            return sDeviceID;
        }
        if (telephonyManager != null) {
            try {
                deviceId = telephonyManager.getDeviceId(i);
                sDeviceID = deviceId;
            } catch (SecurityException unused) {
            }
        }
        sGetDeviceChecked = true;
        return sDeviceID;
    }
}
