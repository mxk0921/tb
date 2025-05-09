package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.assist.ICapability;
import anet.channel.assist.IDualWifiCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import tb.c21;
import tb.eyl;
import tb.hxj;
import tb.p7o;
import tb.suj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkStatusMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_BSSID = "02:00:00:00:00:00";
    private static final String DEFAULT_SSID = "<unknown ssid>";
    private static final String TAG = "awcn.NetworkStatusMonitor";
    private static Method getSubInfoMethod;
    private static Network sCellularNetwork;
    private static String[] dftDnsNames = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
    public static volatile Context context = null;
    public static volatile boolean isNetworkAvailable = false;
    public static volatile NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.NetworkStatus.NONE;
    public static volatile String subType = "unknown";
    public static volatile String apn = "";
    public static volatile String ssid = "";
    public static volatile String bssid = "";
    public static volatile String carrier = "unknown";
    public static volatile String mcc = "";
    public static volatile String simOp = "";
    public static volatile Pair<String, Integer> proxy = null;
    public static volatile boolean isRoaming = false;
    public static volatile List<InetAddress> dnsServers = Collections.EMPTY_LIST;
    private static volatile boolean isRegistered = false;
    private static volatile boolean isNetworkCallbackRegistered = false;
    private static ConnectivityManager mConnectivityManager = null;
    private static TelephonyManager mTelephonyManager = null;
    private static WifiManager mWifiManager = null;
    private static SubscriptionManager subscriptionManager = null;
    private static ConnectivityManager.NetworkCallback networkCallback = null;
    private static int isVPN = -1;
    private static long lastStatusChangeTime = -1;
    private static long lastSavePowerTime = System.currentTimeMillis();
    private static boolean isSavePower = false;
    private static int lowPowerVal = -1;
    private static String accessPoint = "network_def";
    private static String clientIp = "network_def";
    private static NetworkInfo defNetworkInfo = null;
    private static ConcurrentHashMap<Network, NetworkInfo> networkInfoMap = new ConcurrentHashMap<>();
    private static final Object monitorLock = new Object();
    private static BroadcastReceiver receiver = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/status/NetworkStatusMonitor$3");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                return;
            }
            if (ALog.isPrintLog(1)) {
                ALog.d(NetworkStatusMonitor.TAG, "receiver:" + intent.getAction(), null, new Object[0]);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusMonitor.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkStatusMonitor.access$200(intent);
                    }
                }
            });
        }
    };

    public static /* synthetic */ void access$000(NetworkCapabilities networkCapabilities) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356c7818", new Object[]{networkCapabilities});
        } else {
            dueToCapabilitiesVpnChanged(networkCapabilities);
        }
    }

    public static /* synthetic */ Network access$102(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Network) ipChange.ipc$dispatch("25b4cf80", new Object[]{network});
        }
        sCellularNetwork = network;
        return network;
    }

    public static /* synthetic */ void access$200(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1eab6", new Object[]{intent});
        } else {
            dueToBroadcastReceiver(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x0049, TryCatch #2 {, blocks: (B:4:0x0005, B:6:0x000b, B:10:0x0019, B:12:0x002f, B:14:0x003c, B:17:0x004e, B:19:0x0052, B:23:0x0059, B:25:0x0065, B:30:0x0074), top: B:35:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void dueToBroadcastReceiver(android.content.Intent r12) {
        /*
            r0 = 0
            r1 = 1
            java.lang.Class<anet.channel.status.NetworkStatusMonitor> r2 = anet.channel.status.NetworkStatusMonitor.class
            monitor-enter(r2)
            com.android.alibaba.ip.runtime.IpChange r3 = anet.channel.status.NetworkStatusMonitor.$ipChange     // Catch: all -> 0x0016
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0016
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "aed27dc5"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0016
            r1[r0] = r12     // Catch: all -> 0x0016
            r3.ipc$dispatch(r4, r1)     // Catch: all -> 0x0016
            monitor-exit(r2)
            return
        L_0x0016:
            r12 = move-exception
            goto L_0x0097
        L_0x0019:
            int r3 = anet.channel.status.NetworkStatusMonitor.isVPN     // Catch: all -> 0x0049
            boolean r4 = anet.channel.status.NetworkStatusHelper.isProxy()     // Catch: all -> 0x0049
            long r5 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x0049
            java.lang.String r7 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r8 = r12.getAction()     // Catch: all -> 0x0049
            boolean r7 = r7.equals(r8)     // Catch: all -> 0x0049
            if (r7 == 0) goto L_0x0058
            checkNetworkStatus()     // Catch: all -> 0x0049
            android.net.ConnectivityManager r7 = anet.channel.status.NetworkStatusMonitor.mConnectivityManager     // Catch: all -> 0x0049
            android.net.Network[] r7 = r7.getAllNetworks()     // Catch: all -> 0x0049
            int r8 = r7.length     // Catch: all -> 0x0049
            r9 = 0
        L_0x003a:
            if (r9 >= r8) goto L_0x004b
            r10 = r7[r9]     // Catch: all -> 0x0049
            android.net.ConnectivityManager r11 = anet.channel.status.NetworkStatusMonitor.mConnectivityManager     // Catch: all -> 0x0049
            android.net.NetworkCapabilities r10 = r11.getNetworkCapabilities(r10)     // Catch: all -> 0x0049
            dueToVpnChange(r10, r3)     // Catch: all -> 0x0049
            int r9 = r9 + r1
            goto L_0x003a
        L_0x0049:
            r12 = move-exception
            goto L_0x0078
        L_0x004b:
            r7 = -1
            if (r3 != r7) goto L_0x0052
            int r7 = anet.channel.status.NetworkStatusMonitor.isVPN     // Catch: all -> 0x0049
            if (r7 == 0) goto L_0x0058
        L_0x0052:
            int r7 = anet.channel.status.NetworkStatusMonitor.isVPN     // Catch: all -> 0x0049
            if (r3 == r7) goto L_0x0058
            r7 = 1
            goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            java.lang.String r8 = "android.intent.action.PROXY_CHANGE"
            java.lang.String r12 = r12.getAction()     // Catch: all -> 0x0049
            boolean r12 = r8.equals(r12)     // Catch: all -> 0x0049
            if (r12 == 0) goto L_0x0074
            android.util.Pair r12 = parseWifiProxy()     // Catch: all -> 0x0049
            anet.channel.status.NetworkStatusMonitor.proxy = r12     // Catch: all -> 0x0049
            boolean r12 = anet.channel.status.NetworkStatusHelper.isProxy()     // Catch: all -> 0x0049
            if (r4 == r12) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            r7 = r1
        L_0x0074:
            dueToVpnChanged(r7, r5, r3, r4)     // Catch: all -> 0x0049
            goto L_0x0095
        L_0x0078:
            java.lang.String r1 = "awcn.NetworkStatusMonitor"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0016
            r3.<init>()     // Catch: all -> 0x0016
            java.lang.String r4 = "[ap][VPN] onReceive error="
            r3.append(r4)     // Catch: all -> 0x0016
            java.lang.String r12 = r12.toString()     // Catch: all -> 0x0016
            r3.append(r12)     // Catch: all -> 0x0016
            java.lang.String r12 = r3.toString()     // Catch: all -> 0x0016
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0016
            r3 = 0
            anet.channel.util.ALog.e(r1, r12, r3, r0)     // Catch: all -> 0x0016
        L_0x0095:
            monitor-exit(r2)
            return
        L_0x0097:
            monitor-exit(r2)     // Catch: all -> 0x0016
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.status.NetworkStatusMonitor.dueToBroadcastReceiver(android.content.Intent):void");
    }

    private static synchronized void dueToCapabilitiesVpnChanged(NetworkCapabilities networkCapabilities) {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2c37643", new Object[]{networkCapabilities});
                return;
            }
            int i = isVPN;
            dueToVpnChanged(dueToVpnChange(networkCapabilities, i), System.currentTimeMillis(), i, NetworkStatusHelper.isProxy());
        }
    }

    private static synchronized boolean dueToVpnChange(NetworkCapabilities networkCapabilities, int i) {
        boolean z = true;
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d696634", new Object[]{networkCapabilities, new Integer(i)})).booleanValue();
            }
            if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                isVPN = 0;
            } else {
                isVPN = 1;
            }
            if ((i == -1 && isVPN == 0) || i == isVPN) {
                z = false;
            }
            return z;
        }
    }

    public static String formatNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6f9a122", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(status.getType());
        sb.append("_");
        sb.append(subType);
        if (!(status == NetworkStatusHelper.NetworkStatus.NO || status == NetworkStatusHelper.NetworkStatus.NONE)) {
            if (status.isMobile()) {
                sb.append("_");
                sb.append(apn);
                sb.append("_");
                sb.append(carrier);
            } else {
                sb.append("_");
                sb.append(ssid);
                sb.append("_");
                sb.append(bssid);
            }
        }
        return sb.toString();
    }

    public static Network getCellularNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Network) ipChange.ipc$dispatch("948448ea", new Object[0]);
        }
        if (status == NetworkStatusHelper.NetworkStatus.WIFI) {
            return sCellularNetwork;
        }
        return null;
    }

    public static synchronized String getLowPowerMode() {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79ad576f", new Object[0]);
            }
            updatePowerMode();
            int i = lowPowerVal;
            if (i < 0) {
                return "";
            }
            if (i > 20) {
                return "normal";
            }
            if (i <= 10 || i > 20) {
                return "exlow";
            }
            return "low";
        }
    }

    public static int getLowPowerVal() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52010d94", new Object[0])).intValue();
        }
        try {
            eyl c = p7o.c(4, 401, 199);
            if (!(c == null || (str = c.d) == null || str.isEmpty())) {
                ALog.e(TAG, "[LowPower] getLowPower value=" + c.d, null, new Object[0]);
                return Integer.parseInt(c.d);
            }
            ALog.e(TAG, "[LowPower] getLowPower not ready or not support!!", null, new Object[0]);
            return -1;
        } catch (Throwable th) {
            ALog.e(TAG, "[LowPower] getLowPower fail, e=" + th.toString(), null, new Object[0]);
            return -1;
        }
    }

    public static String getMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eae70502", new Object[0]);
        }
        try {
            if ("".equalsIgnoreCase(mcc)) {
                mcc = parseMcc();
            }
        } catch (Exception unused) {
        }
        return mcc;
    }

    public static NetworkInfo getNetworkInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("246119f4", new Object[0]);
        }
        try {
            initConnectivityManager();
        } catch (Throwable th) {
            ALog.e(TAG, "[NetworkInfo] getNetworkInfo 1 fail!", null, "error", th);
        }
        if (!AwcnConfig.isNetworkInfoEnable()) {
            ALog.e(TAG, "[NetworkInfo] use old getNetworkInfo", null, new Object[0]);
            return mConnectivityManager.getActiveNetworkInfo();
        } else if (defNetworkInfo != null) {
            ALog.e(TAG, "[NetworkInfo][new] defNetworkInfo already exist!", null, new Object[0]);
            return defNetworkInfo;
        } else {
            synchronized (monitorLock) {
                if (defNetworkInfo == null) {
                    defNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
                    ALog.e(TAG, "[NetworkInfo][new] defNetworkInfo update finish!", null, new Object[0]);
                }
            }
            return defNetworkInfo;
        }
    }

    public static NetworkStatusHelper.NetworkStatus getNetworkStatus(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("ced3f159", new Object[]{network});
        }
        NetworkInfo networkInfo = getNetworkInfo(network);
        if (networkInfo == null) {
            return null;
        }
        String subtypeName = networkInfo.getSubtypeName();
        String str = "";
        if (!TextUtils.isEmpty(subtypeName)) {
            str = subtypeName.replace(" ", str);
        }
        return parseNetworkStatus(networkInfo.getSubtype(), str);
    }

    public static String getRealMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84d5dc0", new Object[0]);
        }
        return mcc;
    }

    public static int getRestrictBackgroundStatus() {
        int restrictBackgroundStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d63a8c", new Object[0])).intValue();
        }
        if (mConnectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        restrictBackgroundStatus = mConnectivityManager.getRestrictBackgroundStatus();
        return restrictBackgroundStatus;
    }

    public static void initConnectivityManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef8c4d", new Object[0]);
        } else if (mConnectivityManager == null) {
            synchronized (monitorLock) {
                try {
                    if (mConnectivityManager == null) {
                        mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean isInternalAddr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c649b23", new Object[0])).booleanValue();
        }
        if ("".equalsIgnoreCase(mcc)) {
            mcc = parseMcc();
        }
        return "".equalsIgnoreCase(mcc) || AdvanceSetting.CLEAR_NOTIFICATION.equalsIgnoreCase(mcc);
    }

    public static synchronized boolean isSavePower() {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c8f1509", new Object[0])).booleanValue();
            }
            return isSavePower;
        }
    }

    public static boolean isVPN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc74f6f5", new Object[0])).booleanValue();
        }
        if (isVPN == -1) {
            ALog.e(TAG, "[VPN] isVPN, not registerVPNCallback or this method not support", null, new Object[0]);
        }
        if (isVPN == 1) {
            return true;
        }
        return false;
    }

    private static void parseCarrierInfo() {
        CharSequence carrierName;
        SubscriptionManager from;
        try {
            if (mTelephonyManager == null) {
                mTelephonyManager = (TelephonyManager) context.getSystemService("phone");
            }
            simOp = mTelephonyManager.getSimOperator();
            if (Build.VERSION.SDK_INT >= 22) {
                if (subscriptionManager == null) {
                    from = SubscriptionManager.from(context);
                    subscriptionManager = from;
                    getSubInfoMethod = from.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                Method method = getSubInfoMethod;
                if (method != null) {
                    carrierName = suj.a(method.invoke(subscriptionManager, new Object[0])).getCarrierName();
                    carrier = carrierName.toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    private static String parseExtraInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f61864", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_UNIWAP)) {
                return ConnectionUtil.TYPE_UNIWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_3GWAP)) {
                return ConnectionUtil.TYPE_3GWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CTWAP)) {
                return ConnectionUtil.TYPE_CTWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CMNET)) {
                return ConnectionUtil.TYPE_CMNET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_UNINET)) {
                return ConnectionUtil.TYPE_UNINET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_3GNET)) {
                return ConnectionUtil.TYPE_3GNET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CTNET)) {
                return ConnectionUtil.TYPE_CTNET;
            }
        }
        return "unknown";
    }

    private static String parseMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e98895f", new Object[0]);
        }
        try {
            if (mTelephonyManager == null) {
                mTelephonyManager = (TelephonyManager) context.getSystemService("phone");
            }
            mcc = mTelephonyManager.getSimCountryIso();
        } catch (Exception unused) {
        }
        return mcc;
    }

    private static NetworkStatusHelper.NetworkStatus parseNetworkStatus(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("b75e8a7e", new Object[]{new Integer(i), str});
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            case 20:
                return NetworkStatusHelper.NetworkStatus.G5;
            default:
                if (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.G3;
                }
                return NetworkStatusHelper.NetworkStatus.NONE;
        }
    }

    private static Pair<String, Integer> parseWifiProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ec1ee177", new Object[0]);
        }
        try {
            String property = System.getProperty("http.proxyHost");
            if (!TextUtils.isEmpty(property)) {
                return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static void registerCellularNetworkCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6b912d", new Object[0]);
        } else if (AwcnConfig.isMultiPathMonitorEnable()) {
            if (!Utils.isHarmonyOS() || AwcnConfig.isInHarmonyWhiteList(Utils.getHarmonyVersion())) {
                ALog.e(TAG, "[registerCellularNetworkCallback]", null, new Object[0]);
                mConnectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new ConnectivityManager.NetworkCallback() { // from class: anet.channel.status.NetworkStatusMonitor.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r4, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == 838841652) {
                            super.onAvailable((Network) objArr[0]);
                            return null;
                        } else if (hashCode == 2071672155) {
                            super.onLost((Network) objArr[0]);
                            return null;
                        } else {
                            int hashCode2 = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in anet/channel/status/NetworkStatusMonitor$2");
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onAvailable(Network network) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                            return;
                        }
                        super.onAvailable(network);
                        NetworkStatusMonitor.access$102(network);
                        NetworkStatusMonitor.clearNetworkInfo(network);
                        ALog.e(NetworkStatusMonitor.TAG, "[NetworkInfo]TRANSPORT_CELLULAR onAvailable", null, "network", network.toString());
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(Network network) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                            return;
                        }
                        super.onLost(network);
                        NetworkStatusMonitor.access$102(null);
                        NetworkStatusMonitor.clearNetworkInfo(network);
                        ALog.e(NetworkStatusMonitor.TAG, "[NetworkInfo]TRANSPORT_CELLULAR onLost", null, "network", network.toString());
                    }
                });
                return;
            }
            ALog.e(TAG, "close multi path in harmonyOS system.", null, new Object[0]);
        }
    }

    public static void registerNetworkCallback() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97772bf7", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 24 && !isNetworkCallbackRegistered) {
            NetworkInfo networkInfo = getNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            isNetworkAvailable = z;
            mConnectivityManager.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback() { // from class: anet.channel.status.NetworkStatusMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r4, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -1047581786:
                            super.onLinkPropertiesChanged((Network) objArr[0], (LinkProperties) objArr[1]);
                            return null;
                        case 435028944:
                            super.onCapabilitiesChanged((Network) objArr[0], (NetworkCapabilities) objArr[1]);
                            return null;
                        case 838841652:
                            super.onAvailable((Network) objArr[0]);
                            return null;
                        case 2071672155:
                            super.onLost((Network) objArr[0]);
                            return null;
                        default:
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/status/NetworkStatusMonitor$1");
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("19ee03d0", new Object[]{this, network, networkCapabilities});
                        return;
                    }
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    NetworkStatusMonitor.access$000(networkCapabilities);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c18f2ba6", new Object[]{this, network, linkProperties});
                        return;
                    }
                    super.onLinkPropertiesChanged(network, linkProperties);
                    NetworkStatusMonitor.dnsServers = new ArrayList(linkProperties.getDnsServers());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                        return;
                    }
                    super.onAvailable(network);
                    ALog.e(NetworkStatusMonitor.TAG, "[NetworkInfo]network onAvailable", null, "network", network.toString());
                    NetworkStatusMonitor.isNetworkAvailable = true;
                    NetworkStatusMonitor.clearNetworkInfo(null);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                        return;
                    }
                    super.onLost(network);
                    ALog.e(NetworkStatusMonitor.TAG, "[NetworkInfo]network onLost", null, "network", network.toString());
                    NetworkStatusMonitor.isNetworkAvailable = false;
                    NetworkStatusMonitor.clearNetworkInfo(null);
                }
            });
            try {
                registerCellularNetworkCallback();
            } catch (Throwable unused) {
                ALog.e(TAG, "[registerCellularNetworkCallback]error.", null, new Object[0]);
            }
            isNetworkCallbackRegistered = true;
        }
    }

    public static void registerNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd610a1", new Object[0]);
        } else if (!isRegistered && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            try {
                context.registerReceiver(receiver, intentFilter);
            } catch (Exception unused) {
                ALog.e(TAG, "registerReceiver failed", null, new Object[0]);
            }
            if (AwcnConfig.isAsyncIpStackDetect()) {
                initNetworkStatus();
            } else {
                checkNetworkStatus();
            }
            isRegistered = true;
        }
    }

    private static void resetStatus(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ce9b37", new Object[]{networkStatus, str});
            return;
        }
        status = networkStatus;
        subType = str;
        apn = "";
        ssid = "";
        bssid = "";
        proxy = null;
        carrier = "";
        simOp = "";
    }

    public static void unregisterNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472aaa68", new Object[0]);
        } else if (context != null) {
            context.unregisterReceiver(receiver);
        }
    }

    public static synchronized void updatePowerMode() {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28d09286", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastSavePowerTime >= AwcnConfig.getSavePowerTimeInterval()) {
                lastSavePowerTime = currentTimeMillis;
                isSavePower = c21.g().getBoolean("saveMode", false);
                lowPowerVal = getLowPowerVal();
            }
        }
    }

    public static void checkNetworkStatus() {
        boolean z;
        NetworkInfo networkInfo;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196eec1f", new Object[0]);
            return;
        }
        ALog.d(TAG, "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = status;
        String str = apn;
        String str2 = ssid;
        String formatNetwork = formatNetwork();
        try {
            try {
                networkInfo = getNetworkInfo();
                z = false;
            } catch (Exception e) {
                ALog.e(TAG, "getNetworkInfo exception", null, e, new Object[0]);
                resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z = true;
            }
            if (!z) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    ALog.i(TAG, "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()), "info.getType", Integer.valueOf(networkInfo.getType()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", str3);
                        }
                        resetStatus(parseNetworkStatus(networkInfo.getSubtype(), str3), str3);
                        apn = parseExtraInfo(networkInfo.getExtraInfo());
                        parseCarrierInfo();
                    } else if (networkInfo.getType() == 1) {
                        resetStatus(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        bssid = DEFAULT_BSSID;
                        ssid = DEFAULT_SSID;
                        carrier = "wifi";
                        simOp = "wifi";
                        proxy = parseWifiProxy();
                        ICapability capability = NetworkAssist.getAssistManager().getCapability(2);
                        if (capability != null && capability.isEnable()) {
                            ((IDualWifiCapability) capability).request();
                        }
                    } else {
                        resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    isRoaming = networkInfo.isRoaming();
                    Inet64Util.startIpStackDetect();
                }
                resetStatus(NetworkStatusHelper.NetworkStatus.NO, "no network");
                ALog.i(TAG, "checkNetworkStatus", null, "no network");
            }
            if (status != networkStatus || !apn.equalsIgnoreCase(str) || !ssid.equalsIgnoreCase(str2)) {
                if (ALog.isPrintLog(2)) {
                    NetworkStatusHelper.printNetworkDetail();
                }
                AnalysisFactory.getV3Instance().recordAppStatus("Network_Changed", formatNetwork + " -> " + formatNetwork());
                AtomicBoolean atomicBoolean = status.isLastNone;
                NetworkStatusHelper.NetworkStatus networkStatus2 = NetworkStatusHelper.NetworkStatus.NONE;
                atomicBoolean.set(networkStatus == networkStatus2);
                StringBuilder sb = new StringBuilder("[checkNetworkStatus] isLastNone = ");
                if (networkStatus != networkStatus2) {
                    z2 = false;
                }
                sb.append(z2);
                ALog.e(TAG, sb.toString(), null, new Object[0]);
                NetworkStatusHelper.notifyStatusChanged(status);
            }
        } catch (Exception e2) {
            ALog.e(TAG, "checkNetworkStatus", null, e2, new Object[0]);
        }
    }

    private static void initNetworkStatus() {
        boolean z;
        NetworkInfo networkInfo;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207d17", new Object[0]);
            return;
        }
        ALog.d(TAG, "[initNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = status;
        String str = apn;
        String str2 = ssid;
        String formatNetwork = formatNetwork();
        try {
            try {
                networkInfo = getNetworkInfo();
                z = false;
            } catch (Exception e) {
                ALog.e(TAG, "getNetworkInfo exception", null, e, new Object[0]);
                resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z = true;
            }
            if (!z) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    ALog.i(TAG, "initNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()), "info.getType", Integer.valueOf(networkInfo.getType()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", str3);
                        }
                        resetStatus(parseNetworkStatus(networkInfo.getSubtype(), str3), str3);
                        apn = parseExtraInfo(networkInfo.getExtraInfo());
                        parseCarrierInfo();
                        parseMcc();
                    } else if (networkInfo.getType() == 1) {
                        resetStatus(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        bssid = DEFAULT_BSSID;
                        ssid = DEFAULT_SSID;
                        parseMcc();
                        carrier = "wifi";
                        simOp = "wifi";
                        proxy = parseWifiProxy();
                        ICapability capability = NetworkAssist.getAssistManager().getCapability(2);
                        if (capability != null && capability.isEnable()) {
                            ((IDualWifiCapability) capability).request();
                        }
                    } else {
                        resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    isRoaming = networkInfo.isRoaming();
                    ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusMonitor.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Inet64Util.startIpStackDetect();
                            }
                        }
                    });
                }
                resetStatus(NetworkStatusHelper.NetworkStatus.NO, "no network");
                ALog.i(TAG, "initNetworkStatus", null, "no network");
            }
            if (status != networkStatus || !apn.equalsIgnoreCase(str) || !ssid.equalsIgnoreCase(str2)) {
                if (ALog.isPrintLog(2)) {
                    NetworkStatusHelper.printNetworkDetail();
                }
                AnalysisFactory.getV3Instance().recordAppStatus("Network_Changed", formatNetwork + " -> " + formatNetwork());
                AtomicBoolean atomicBoolean = status.isLastNone;
                NetworkStatusHelper.NetworkStatus networkStatus2 = NetworkStatusHelper.NetworkStatus.NONE;
                atomicBoolean.set(networkStatus == networkStatus2);
                StringBuilder sb = new StringBuilder("[initNetworkStatus] isLastNone = ");
                if (networkStatus != networkStatus2) {
                    z2 = false;
                }
                sb.append(z2);
                ALog.e(TAG, sb.toString(), null, new Object[0]);
                NetworkStatusHelper.notifyStatusChanged(status);
            }
        } catch (Exception e2) {
            ALog.e(TAG, "initNetworkStatus", null, e2, new Object[0]);
        }
    }

    public static boolean isAirplaneMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea42836a", new Object[0])).booleanValue();
        }
        try {
            boolean z = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
            ALog.e(TAG, "[RUM] ", null, "isAirplaneMode", Boolean.valueOf(z));
            return z;
        } catch (Throwable th) {
            ALog.e(TAG, "[RUM] isAirplaneModeOn error=" + th.toString(), null, new Object[0]);
            return false;
        }
    }

    public static void clearNetworkInfo(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76f790f", new Object[]{network});
            return;
        }
        try {
            synchronized (monitorLock) {
                defNetworkInfo = null;
                ConcurrentHashMap<Network, NetworkInfo> concurrentHashMap = networkInfoMap;
                if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                    if (network != null) {
                        networkInfoMap.remove(network);
                    } else {
                        networkInfoMap.clear();
                    }
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[NetworkInfo] clearNetworkInfo fail!", null, "error", th);
        }
    }

    public static boolean isNetworkRestricted(int i) {
        Network activeNetwork;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f1891a1", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            if (mConnectivityManager == null && context != null) {
                mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            }
            if (Build.VERSION.SDK_INT >= 23) {
                activeNetwork = mConnectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    ALog.e(TAG, "[RUM] active networks null, isNetworkRestricted is false!", null, new Object[0]);
                    return false;
                }
                NetworkCapabilities networkCapabilities = mConnectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    ALog.e(TAG, "[RUM] networkCapabilities null, isNetworkRestricted is false!", null, new Object[0]);
                    return false;
                }
                int i2 = i == 0 ? 0 : 1;
                boolean hasTransport = networkCapabilities.hasTransport(i2);
                boolean hasCapability = networkCapabilities.hasCapability(17);
                boolean hasCapability2 = networkCapabilities.hasCapability(13);
                ALog.e(TAG, "[RUM] isNetworkRestricted", null, "hasCaptivePortal", Boolean.valueOf(hasCapability), "isRestricted", Boolean.valueOf(!hasCapability2), "networkType", Integer.valueOf(i2), "isNetworkType", Boolean.valueOf(hasTransport));
                if (hasTransport) {
                    return hasCapability || !hasCapability2;
                }
                return false;
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[RUM] isNetworkRestricted error=" + th.toString(), null, new Object[0]);
        }
        return false;
    }

    static {
        t2o.a(607125822);
    }

    private static synchronized void dueToVpnChanged(boolean z, long j, int i, boolean z2) {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91451cb7", new Object[]{new Boolean(z), new Long(j), new Integer(i), new Boolean(z2)});
                return;
            }
            if (z && AwcnConfig.isVpnOptOpened()) {
                ALog.e(TAG, "[ap][VPN] onReceive, isVPN=" + isVPN + " ,lastIsVPN=" + i + " ,isProxy=" + NetworkStatusHelper.isProxy() + ", lastIsProxy=" + z2 + ", new proxy " + proxy + " ,curVpnChangeCount =" + NetworkStatusHelper.curVpnChangeCount.get(), null, new Object[0]);
                long j2 = lastStatusChangeTime;
                long j3 = j - j2;
                if (j2 == -1 || j3 > AwcnConfig.getVpnListenTimeInterval()) {
                    lastStatusChangeTime = j;
                    if (NetworkStatusHelper.curVpnChangeCount.get() > AwcnConfig.getVpnFgChangeCount()) {
                        ALog.e(TAG, "[ap][VPN] onReceive curVpnChangeCount(" + NetworkStatusHelper.curVpnChangeCount.get() + ") > VpnFgChangeCount(5次)", null, new Object[0]);
                        return;
                    }
                    NetworkStatusHelper.curVpnChangeCount.incrementAndGet();
                    Iterator<NetworkStatusHelper.IVpnProxyStatusChangeListener> it = NetworkStatusHelper.statusChangeListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onVpnProxyStatusChanged(isVPN(), NetworkStatusHelper.isProxy());
                    }
                    return;
                }
                ALog.e(TAG, "[ap][VPN] onReceive curStatusChangeTimeInterval <= VpnListenTimeInterval(3s)", null, "timeInterval", Long.valueOf(j3));
            }
        }
    }

    public static String getDnsServerFromSystemProperties() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            String[] strArr = dftDnsNames;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean isAccessPointChange(String str, String str2, String str3) {
        boolean isStringEqual;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("241ad1fb", new Object[]{str, str2, str3})).booleanValue();
        }
        if (str != null || str2 == null) {
            isStringEqual = StringUtils.isStringEqual(accessPoint, str);
        } else {
            isStringEqual = StringUtils.isStringEqual(clientIp, str2);
        }
        boolean z = !isStringEqual;
        if (z) {
            ALog.e(TAG, "[DetectOpt] [amdc_file] AccessPointChange!! newAccessPoint=" + str + " ,accessPoint=" + accessPoint + " ,newClientIp=" + str2 + " ,clientIp=" + clientIp, null, AgooConstants.MESSAGE_FLAG, Boolean.valueOf(z), hxj.UNIQID, str3);
        }
        accessPoint = str;
        clientIp = str2;
        return z;
    }

    public static NetworkInfo getNetworkInfo(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("3181863f", new Object[]{network});
        }
        try {
        } catch (Throwable th) {
            ALog.e(TAG, "[NetworkInfo] getNetworkInfo 2 fail!", null, "error", th);
        }
        if (network == null) {
            return getNetworkInfo();
        }
        initConnectivityManager();
        if (!AwcnConfig.isNetworkInfoEnable()) {
            ALog.e(TAG, "[NetworkInfo] use old getNetworkInfo 2", null, "network", network.toString());
            return mConnectivityManager.getNetworkInfo(network);
        }
        if (networkInfoMap == null) {
            networkInfoMap = new ConcurrentHashMap<>();
        }
        NetworkInfo networkInfo = networkInfoMap.get(network);
        if (networkInfo != null) {
            ALog.e(TAG, "[NetworkInfo][new] 2, networkInfo already exist!", null, "network", network.toString());
            return networkInfo;
        }
        synchronized (monitorLock) {
            NetworkInfo networkInfo2 = mConnectivityManager.getNetworkInfo(network);
            if (networkInfo2 != null) {
                networkInfoMap.put(network, networkInfo2);
                ALog.e(TAG, "[NetworkInfo][new] 2, networkInfo update finish!", null, "network", network.toString());
                return networkInfo2;
            }
            ALog.e(TAG, "[NetworkInfo][new] 2, networkInfo update fail, networkInfo get null!", null, "network", network.toString());
            return null;
        }
    }
}
