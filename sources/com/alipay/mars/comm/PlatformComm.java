package com.alipay.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PlatformComm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EMobile = 2;
    public static final int ENoNet = -1;
    public static final int EOtherNet = 3;
    public static final int EWifi = 1;
    public static final int NETTYPE_2G = 3;
    public static final int NETTYPE_3G = 4;
    public static final int NETTYPE_4G = 5;
    public static final int NETTYPE_NON = -1;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_UNKNOWN = 6;
    public static final int NETTYPE_WAP = 2;
    public static final int NETTYPE_WIFI = 1;
    public static final int PROXY_TYPE_HTTP_TUNNEL = 1;
    public static final int PROXY_TYPE_NONE = 0;
    public static final int PROXY_TYPE_SOCKS5 = 2;
    public static Context context;
    public static Handler handler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class APNInfo {
        public String extraInfo;
        public int netType;
        public int subNetType;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Assert {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void assertTrue(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86058def", new Object[]{str, new Boolean(z)});
            }
        }

        public static void assertTrue(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class C2Java {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static APNInfo getAPNInfo() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (APNInfo) ipChange.ipc$dispatch("44f2d3c7", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
                APNInfo aPNInfo = new APNInfo();
                if (activeNetworkInfo == null) {
                    return null;
                }
                aPNInfo.netType = activeNetworkInfo.getType();
                aPNInfo.subNetType = activeNetworkInfo.getSubtype();
                if (1 != activeNetworkInfo.getType()) {
                    if (activeNetworkInfo.getExtraInfo() == null) {
                        str = "";
                    } else {
                        str = activeNetworkInfo.getExtraInfo();
                    }
                    aPNInfo.extraInfo = str;
                } else {
                    aPNInfo.extraInfo = getCurWifiInfo().ssid;
                }
                return aPNInfo;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static int getCurRadioAccessNetworkInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90bf6de1", new Object[0])).intValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context == null) {
                    Assert.assertTrue(false);
                    return 0;
                } else if (!MiscUtils.isAtFrontDesk(context)) {
                    return 0;
                } else {
                    return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) PlatformComm.context.getSystemService("phone"));
                }
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return 0;
            }
        }

        public static SIMInfo getCurSIMInfo() {
            int iSPCode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SIMInfo) ipChange.ipc$dispatch("179eed93", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context == null || (iSPCode = NetStatusUtil.getISPCode(context)) == 0) {
                    return null;
                }
                SIMInfo sIMInfo = new SIMInfo();
                sIMInfo.ispCode = "" + iSPCode;
                sIMInfo.ispName = NetStatusUtil.getISPName(PlatformComm.context);
                return sIMInfo;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static WifiInfo getCurWifiInfo() {
            ConnectivityManager connectivityManager;
            NetworkInfo activeNetworkInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WifiInfo) ipChange.ipc$dispatch("bc2e56e9", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || 1 != activeNetworkInfo.getType() || !MiscUtils.isAtFrontDesk(PlatformComm.context)) {
                    return null;
                }
                WifiManager wifiManager = (WifiManager) PlatformComm.context.getSystemService("wifi");
                return null;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static int getNetInfo() {
            NetworkInfo activeNetworkInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("727a49af", new Object[0])).intValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) PlatformComm.context.getSystemService("connectivity");
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return -1;
                }
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 1;
                    }
                    if (type != 2 && type != 3 && type != 4 && type != 5) {
                        return 3;
                    }
                }
                return 2;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return 3;
            }
        }

        public static int getProxyInfo(StringBuffer stringBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23e2ebea", new Object[]{stringBuffer})).intValue();
            }
            return -1;
        }

        public static long getSignal(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff1f8043", new Object[]{new Boolean(z)})).longValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return 0L;
                } else if (z) {
                    return NetworkSignalUtil.getWifiSignalStrength();
                } else {
                    return NetworkSignalUtil.getGSMSignalStrength();
                }
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return 0L;
            }
        }

        public static int getStatisticsNetType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e992cc98", new Object[0])).intValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context == null) {
                    Assert.assertTrue(false);
                    return 0;
                }
                int netType = NetStatusUtil.getNetType(context);
                if (netType == -1) {
                    return -1;
                }
                if (NetStatusUtil.is2G(PlatformComm.context)) {
                    return 3;
                }
                if (NetStatusUtil.is3G(PlatformComm.context)) {
                    return 4;
                }
                if (NetStatusUtil.is4G(PlatformComm.context)) {
                    return 5;
                }
                if (NetStatusUtil.isWifi(netType)) {
                    return 1;
                }
                if (NetStatusUtil.isWap(netType)) {
                    return 2;
                }
                return 6;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return -1;
            }
        }

        public static boolean isNetworkConnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("614c23d0", new Object[0])).booleanValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context != null) {
                    return NetStatusUtil.isNetworkConnected(context);
                }
                Assert.assertTrue(false);
                return false;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return false;
            }
        }

        public static boolean startAlarm(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("77f14afa", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context != null) {
                    return Alarm.start(i, i2, context);
                }
                Assert.assertTrue(false);
                return false;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return false;
            }
        }

        public static boolean stopAlarm(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f0e1951", new Object[]{new Integer(i)})).booleanValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context != null) {
                    return Alarm.stop(i, context);
                }
                Assert.assertTrue(false);
                return false;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return false;
            }
        }

        public static WakerLock wakeupLock_new() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WakerLock) ipChange.ipc$dispatch("cad63fba", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                Context context = PlatformComm.context;
                if (context != null) {
                    return new WakerLock(context);
                }
                Assert.assertTrue(false);
                return null;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static ProxyInfo getProxyInfo() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProxyInfo) ipChange.ipc$dispatch("4e7236e7", new Object[0]);
            }
            ProxyInfo proxyInfo = new ProxyInfo();
            try {
                proxyInfo.proxyHost = System.getProperty("bifrost.proxyHost");
                String property = System.getProperty("bifrost.proxyPort");
                proxyInfo.username = System.getProperty("bifrost.proxyUsername");
                proxyInfo.password = System.getProperty("bifrost.proxyPassword");
                String str2 = proxyInfo.proxyHost;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                    }
                    if (property != null || property.length() <= 0) {
                        proxyInfo.proxyPort = -1;
                    } else {
                        proxyInfo.proxyPort = Integer.parseInt(property);
                    }
                    str = proxyInfo.proxyHost;
                    if (str == null && str.length() > 0) {
                        proxyInfo.proxyType = 1;
                        return proxyInfo;
                    }
                }
                proxyInfo.proxyHost = System.getProperty("http.proxyHost");
                property = System.getProperty("http.proxyPort");
                proxyInfo.username = null;
                proxyInfo.password = null;
                if (property != null) {
                }
                proxyInfo.proxyPort = -1;
                str = proxyInfo.proxyHost;
                return str == null ? proxyInfo : proxyInfo;
            } catch (Exception e) {
                LogCatUtil.error("bifrost.PlatformComm", e);
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ProxyInfo {
        public String password;
        public String proxyHost;
        public int proxyPort;
        public int proxyType;
        public String username;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SIMInfo {
        public String ispCode;
        public String ispName;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class WifiInfo {
        public String bssid;
        public String ssid;
    }

    public static void init(Context context2, Handler handler2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36d8ec1", new Object[]{context2, handler2});
            return;
        }
        context = context2;
        handler = handler2;
        NetworkSignalUtil.InitNetworkSignalUtil(context2);
    }
}
