package anet.channel.status;

import android.content.Context;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ProxySetting;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkStatusHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.NetworkStatusHelper";
    private static boolean started = false;
    public static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<IVpnProxyStatusChangeListener> statusChangeListeners = new CopyOnWriteArraySet<>();
    public static AtomicInteger curVpnChangeCount = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IVpnProxyStatusChangeListener {
        void onVpnProxyStatusChanged(boolean z, boolean z2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI,
        G5;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AtomicBoolean isLastNone = new AtomicBoolean(false);

        NetworkStatus() {
        }

        public static /* synthetic */ Object ipc$super(NetworkStatus networkStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/status/NetworkStatusHelper$NetworkStatus");
        }

        public static NetworkStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkStatus) ipChange.ipc$dispatch("3b64f27e", new Object[]{str});
            }
            return (NetworkStatus) Enum.valueOf(NetworkStatus.class, str);
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            if (this == G2) {
                return "2G";
            }
            if (this == G3) {
                return "3G";
            }
            if (this == G4) {
                return "4G";
            }
            if (this == G5) {
                return "5G";
            }
            return toString();
        }

        public boolean isMobile() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2edf0f7", new Object[]{this})).booleanValue();
            }
            if (this == G2 || this == G3 || this == G4 || this == G5) {
                return true;
            }
            return false;
        }

        public boolean isWifi() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("80bd486a", new Object[]{this})).booleanValue();
            }
            if (this == WIFI) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(607125816);
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869f1e1e", new Object[]{iNetworkStatusChangeListener});
        } else {
            listeners.add(iNetworkStatusChangeListener);
        }
    }

    public static String getApn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7181fb0", new Object[0]);
        }
        return NetworkStatusMonitor.apn;
    }

    public static String getCarrier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15bec177", new Object[0]);
        }
        return NetworkStatusMonitor.carrier;
    }

    public static Network getCellularNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Network) ipChange.ipc$dispatch("948448ea", new Object[0]);
        }
        return NetworkStatusMonitor.getCellularNetwork();
    }

    public static String getDnsServerAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("424659bb", new Object[0]);
        }
        if (!NetworkStatusMonitor.dnsServers.isEmpty()) {
            return NetworkStatusMonitor.dnsServers.get(0).getHostAddress();
        }
        return NetworkStatusMonitor.getDnsServerFromSystemProperties();
    }

    public static String getFormatNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2af5718", new Object[0]);
        }
        return NetworkStatusMonitor.formatNetwork();
    }

    public static String getLowPowerMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79ad576f", new Object[0]);
        }
        return NetworkStatusMonitor.getLowPowerMode();
    }

    public static String getMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eae70502", new Object[0]);
        }
        String mcc = NetworkStatusMonitor.getMcc();
        if ("".equalsIgnoreCase(mcc)) {
            return "def.";
        }
        return mcc + ".";
    }

    public static NetworkStatus getNetworkStatus(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatus) ipChange.ipc$dispatch("ced3f159", new Object[]{network});
        }
        return NetworkStatusMonitor.getNetworkStatus(network);
    }

    public static String getNetworkSubType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b76cf7b7", new Object[0]);
        }
        return NetworkStatusMonitor.subType;
    }

    public static String getProxyType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("568af627", new Object[0]);
        }
        NetworkStatus networkStatus = NetworkStatusMonitor.status;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return pg1.ATOM_proxy;
        }
        if (networkStatus.isMobile() && NetworkStatusMonitor.apn.contains("wap")) {
            return "wap";
        }
        if (!networkStatus.isMobile() || ProxySetting.get() == null) {
            return "";
        }
        return "auth";
    }

    public static String getRealMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84d5dc0", new Object[0]);
        }
        return NetworkStatusMonitor.getRealMcc();
    }

    public static int getRestrictBackgroundStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d63a8c", new Object[0])).intValue();
        }
        return NetworkStatusMonitor.getRestrictBackgroundStatus();
    }

    public static String getSimOp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f62ecd7", new Object[0]);
        }
        return NetworkStatusMonitor.simOp;
    }

    public static NetworkStatus getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatus) ipChange.ipc$dispatch("9f1f21b4", new Object[0]);
        }
        return NetworkStatusMonitor.status;
    }

    public static String getUniqueId(NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75163034", new Object[]{networkStatus});
        }
        if (AwcnConfig.isVpnChangeDetectOpened()) {
            return StrategyCenter.getInstance().getUniqueId(networkStatus);
        }
        String str = "";
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(getWifiBSSID());
            if (!TextUtils.isEmpty(md5ToHex)) {
                str = md5ToHex;
            }
            return "WIFI$" + str;
        } else if (!networkStatus.isMobile()) {
            return str;
        } else {
            return networkStatus.getType() + "$" + getApn();
        }
    }

    public static String getWifiBSSID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d739c27", new Object[0]);
        }
        return NetworkStatusMonitor.bssid;
    }

    public static Pair<String, Integer> getWifiProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("90ff9874", new Object[0]);
        }
        if (NetworkStatusMonitor.status != NetworkStatus.WIFI) {
            return null;
        }
        return NetworkStatusMonitor.proxy;
    }

    public static String getWifiSSID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecf0a933", new Object[0]);
        }
        return NetworkStatusMonitor.ssid;
    }

    public static boolean isAccessPointChange(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("241ad1fb", new Object[]{str, str2, str3})).booleanValue();
        }
        return NetworkStatusMonitor.isAccessPointChange(str, str2, str3);
    }

    public static int isAirplaneMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea428359", new Object[0])).intValue();
        }
        return NetworkStatusMonitor.isAirplaneMode() ? 1 : 0;
    }

    public static int isCellularRestricted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8303e929", new Object[0])).intValue();
        }
        return NetworkStatusMonitor.isNetworkRestricted(0) ? 1 : 0;
    }

    public static boolean isConnected() {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[0])).booleanValue();
        }
        boolean z3 = true;
        if (Build.VERSION.SDK_INT < 24 ? NetworkStatusMonitor.status == NetworkStatus.NO || NetworkStatusMonitor.status == NetworkStatus.NONE : !NetworkStatusMonitor.isNetworkAvailable) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                NetworkInfo networkInfo = NetworkStatusMonitor.getNetworkInfo();
                if (networkInfo != null) {
                    if (networkInfo.isConnected()) {
                        z2 = true;
                    }
                }
                z3 = z2;
            } catch (Exception unused) {
            }
        } else {
            z3 = z;
        }
        if (z3 && NetworkStatusMonitor.status == NetworkStatus.NO) {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (NetworkStatusMonitor.status == NetworkStatus.NO) {
                        NetworkStatusMonitor.checkNetworkStatus();
                    }
                }
            });
        }
        return z3;
    }

    public static boolean isInternalAddr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c649b23", new Object[0])).booleanValue();
        }
        return NetworkStatusMonitor.isInternalAddr();
    }

    public static boolean isProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29cba9ef", new Object[0])).booleanValue();
        }
        NetworkStatus networkStatus = NetworkStatusMonitor.status;
        String str = NetworkStatusMonitor.apn;
        if (networkStatus != NetworkStatus.WIFI || getWifiProxy() == null) {
            return networkStatus.isMobile() && (str.contains("wap") || ProxySetting.get() != null);
        }
        return true;
    }

    public static boolean isRoaming() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c256c89a", new Object[0])).booleanValue();
        }
        return NetworkStatusMonitor.isRoaming;
    }

    public static boolean isSavePower() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c8f1509", new Object[0])).booleanValue();
        }
        return NetworkStatusMonitor.isSavePower();
    }

    public static boolean isVpn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2faf5", new Object[0])).booleanValue();
        }
        return NetworkStatusMonitor.isVPN();
    }

    public static int isWifiRestricted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d18f6c94", new Object[0])).intValue();
        }
        return NetworkStatusMonitor.isNetworkRestricted(1) ? 1 : 0;
    }

    public static void notifyStatusChanged(final NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d28c35", new Object[]{networkStatus});
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Iterator<INetworkStatusChangeListener> it = NetworkStatusHelper.listeners.iterator();
                        while (it.hasNext()) {
                            INetworkStatusChangeListener next = it.next();
                            long currentTimeMillis = System.currentTimeMillis();
                            next.onNetworkStatusChanged(NetworkStatus.this);
                            if (System.currentTimeMillis() - currentTimeMillis > 500) {
                                ALog.e(NetworkStatusHelper.TAG, "call back cost too much time", null, DataReceiveMonitor.CB_LISTENER, next);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void printNetworkDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da07df9", new Object[0]);
            return;
        }
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb = new StringBuilder(128);
            sb.append("\nNetwork detail*******************************\nStatus: ");
            sb.append(status.getType());
            sb.append("\nSubtype: ");
            sb.append(getNetworkSubType());
            sb.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb.append("Apn: ");
                    sb.append(getApn());
                    sb.append("\nCarrier: ");
                    sb.append(getCarrier());
                    sb.append('\n');
                } else {
                    sb.append("BSSID: ");
                    sb.append(getWifiBSSID());
                    sb.append("\nSSID: ");
                    sb.append(getWifiSSID());
                    sb.append('\n');
                }
            }
            if (isProxy()) {
                sb.append("Proxy: ");
                sb.append(getProxyType());
                sb.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb.append("ProxyHost: ");
                    sb.append((String) wifiProxy.first);
                    sb.append("\nProxyPort: ");
                    sb.append(wifiProxy.second);
                    sb.append('\n');
                }
            }
            sb.append("*********************************************");
            ALog.i(TAG, sb.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void registerVpnProxyStatusListener(IVpnProxyStatusChangeListener iVpnProxyStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24029d2", new Object[]{iVpnProxyStatusChangeListener});
        } else if (iVpnProxyStatusChangeListener != null) {
            statusChangeListeners.add(iVpnProxyStatusChangeListener);
        }
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315356c1", new Object[]{iNetworkStatusChangeListener});
        } else {
            listeners.remove(iNetworkStatusChangeListener);
        }
    }

    public static void unregisterVpnProxyStatusListener(IVpnProxyStatusChangeListener iVpnProxyStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a94e359", new Object[]{iVpnProxyStatusChangeListener});
        } else if (iVpnProxyStatusChangeListener != null) {
            statusChangeListeners.remove(iVpnProxyStatusChangeListener);
        }
    }

    public static synchronized void stopListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dedc860b", new Object[]{context});
            } else if (started) {
                NetworkStatusMonitor.unregisterNetworkReceiver();
                started = false;
            }
        }
    }

    public static synchronized void startListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270805ab", new Object[]{context});
            } else if (context == null) {
                throw new NullPointerException("context is null");
            } else if (!started) {
                NetworkStatusMonitor.context = context;
                NetworkStatusMonitor.registerNetworkReceiver();
                NetworkStatusMonitor.registerNetworkCallback();
                started = true;
            }
        }
    }
}
