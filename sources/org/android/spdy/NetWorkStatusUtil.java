package org.android.spdy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.android.netutil.UtilTool;
import tb.d61;
import tb.l0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetWorkStatusUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_STATUS_DUAL = 3;
    public static final int NETWORK_STATUS_MOBILE = 2;
    public static final int NETWORK_STATUS_NONE = 0;
    public static final int NETWORK_STATUS_WIFI = 1;
    public static final String TAG = "tnetsdk.NetWorkStatusUtil";
    public static volatile Network cellularNetwork = null;
    private static ConnectivityManager connectivityManager = null;
    public static int initErrCode = -1;
    public static String initExceptionMsg;
    public static boolean init_succ;
    private static StringBuilder multiNetEnvTrace;
    public static volatile Network wifiNetwork;
    public static volatile InterfaceStatus currentInterfaceStatus = InterfaceStatus.ACTIVE_INTERFACE_NONE;
    public static CopyOnWriteArraySet<a> interfaceListeners = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum InterfaceStatus {
        ACTIVE_INTERFACE_NONE(0),
        ACTIVE_INTERFACE_CELLULAR(1),
        ACTIVE_INTERFACE_WIFI(2),
        ACTIVE_INTERFACE_MULTI(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int interfaceStatus;

        InterfaceStatus(int i) {
            this.interfaceStatus = i;
        }

        public static /* synthetic */ Object ipc$super(InterfaceStatus interfaceStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/NetWorkStatusUtil$InterfaceStatus");
        }

        public static InterfaceStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InterfaceStatus) ipChange.ipc$dispatch("e3fd5255", new Object[]{str});
            }
            return (InterfaceStatus) Enum.valueOf(InterfaceStatus.class, str);
        }

        public int getInterfaceStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5474be4f", new Object[]{this})).intValue();
            }
            return this.interfaceStatus;
        }

        public void setInterfaceStatus(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b476af33", new Object[]{this, new Integer(i)});
            } else {
                this.interfaceStatus = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        void onNetworkStatusChanged(InterfaceStatus interfaceStatus, boolean z);
    }

    public static void addInterfaceStatusChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ac7074", new Object[]{aVar});
            return;
        }
        try {
            interfaceListeners.add(aVar);
        } catch (Throwable unused) {
        }
    }

    public static int getCurrentNetworkStats() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("627926e", new Object[0])).intValue();
        }
        boolean z = init_succ;
        if (wifiNetwork != null) {
            z = (z ? 1 : 0) | true;
        }
        if (cellularNetwork != null) {
            return (z ? 1 : 0) | 4;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        return i;
    }

    public static String getMultiNetEnvTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6b22ca7", new Object[0]);
        }
        try {
            if (multiNetEnvTrace == null) {
                StringBuilder sb = new StringBuilder(32);
                multiNetEnvTrace = sb;
                sb.append("err=");
                sb.append(initErrCode);
                sb.append(",level=");
                sb.append(Build.VERSION.SDK_INT);
                sb.append(",hmOs=");
                sb.append(UtilTool.isHarmonyOS());
                sb.append(",hmVersin=");
                sb.append(UtilTool.getHarmonyVersion());
                sb.append(",hmWhite=");
                sb.append(l0r.y(UtilTool.getHarmonyVersion()));
                if (initExceptionMsg != null) {
                    StringBuilder sb2 = multiNetEnvTrace;
                    sb2.append(",exMsg=");
                    sb2.append(initExceptionMsg);
                }
            }
        } catch (Exception unused) {
        }
        StringBuilder sb3 = multiNetEnvTrace;
        if (sb3 != null) {
            return sb3.toString();
        }
        return "null";
    }

    public static boolean isInMultiNetworkBrandWhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee014c8f", new Object[0])).booleanValue();
        }
        return !UtilTool.isHarmonyOS() || l0r.y(UtilTool.getHarmonyVersion());
    }

    public static boolean isMobile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2edf0f7", new Object[0])).booleanValue();
        }
        try {
            return NetworkStatusHelper.getStatus().isMobile();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isMultiNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d19c15", new Object[0])).booleanValue();
        }
        return currentInterfaceStatus == InterfaceStatus.ACTIVE_INTERFACE_MULTI;
    }

    public static boolean isSupportMultiNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70de7e25", new Object[0])).booleanValue();
        }
        if (!l0r.K() || !isInMultiNetworkBrandWhiteList()) {
            return false;
        }
        return true;
    }

    public static boolean isWifi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80bd486a", new Object[0])).booleanValue();
        }
        try {
            return NetworkStatusHelper.getStatus().isWifi();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void removeInterfaceStatusChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3750f1", new Object[]{aVar});
            return;
        }
        try {
            interfaceListeners.remove(aVar);
        } catch (Throwable unused) {
        }
    }

    public static void registerCellularNetworkListen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9014b9", new Object[]{context});
            return;
        }
        if (connectivityManager == null) {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(0).addCapability(12);
        connectivityManager.requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: org.android.spdy.NetWorkStatusUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r4, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 838841652) {
                    super.onAvailable((Network) objArr[0]);
                    return null;
                } else if (hashCode == 2071672155) {
                    super.onLost((Network) objArr[0]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in org/android/spdy/NetWorkStatusUtil$1");
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
                NetWorkStatusUtil.cellularNetwork = network;
                NetWorkStatusUtil.updataInterfaceStatus(InterfaceStatus.ACTIVE_INTERFACE_CELLULAR, true);
                spduLog.Tloge(NetWorkStatusUtil.TAG, "", "TRANSPORT_CELLULAR onAvailable", "cellularNetwork", network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                    return;
                }
                super.onLost(network);
                NetWorkStatusUtil.cellularNetwork = null;
                NetWorkStatusUtil.updataInterfaceStatus(InterfaceStatus.ACTIVE_INTERFACE_CELLULAR, false);
                spduLog.Tloge(NetWorkStatusUtil.TAG, "", "TRANSPORT_CELLULAR onLost", "cellularNetwork", network);
            }
        });
        spduLog.Tloge(TAG, "", "registerCellularNetwork success", new Object[0]);
    }

    public static void registerWifiNetworkListen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9011e24", new Object[]{context});
            return;
        }
        if (connectivityManager == null) {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1).addCapability(12);
        connectivityManager.requestNetwork(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: org.android.spdy.NetWorkStatusUtil.2
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
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in org/android/spdy/NetWorkStatusUtil$2");
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
                NetWorkStatusUtil.wifiNetwork = network;
                NetWorkStatusUtil.updataInterfaceStatus(InterfaceStatus.ACTIVE_INTERFACE_WIFI, true);
                spduLog.Tloge(NetWorkStatusUtil.TAG, "", "TRANSPORT_WIFI onAvailable", "wifiNetwork", network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                    return;
                }
                super.onLost(network);
                NetWorkStatusUtil.wifiNetwork = null;
                NetWorkStatusUtil.updataInterfaceStatus(InterfaceStatus.ACTIVE_INTERFACE_WIFI, false);
                spduLog.Tloge(NetWorkStatusUtil.TAG, "", "TRANSPORT_WIFI onLost", "wifiNetwork", network);
            }
        });
        spduLog.Tloge(TAG, "", "registerWifiNetwork success", new Object[0]);
    }

    public static void updataInterfaceStatus(InterfaceStatus interfaceStatus, boolean z) {
        int interfaceStatus2;
        int interfaceStatus3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b538e64f", new Object[]{interfaceStatus, new Boolean(z)});
            return;
        }
        int interfaceStatus4 = currentInterfaceStatus.getInterfaceStatus();
        InterfaceStatus interfaceStatus5 = InterfaceStatus.ACTIVE_INTERFACE_WIFI;
        if (interfaceStatus != interfaceStatus5) {
            InterfaceStatus interfaceStatus6 = InterfaceStatus.ACTIVE_INTERFACE_CELLULAR;
            if (interfaceStatus == interfaceStatus6) {
                if (z) {
                    interfaceStatus3 = interfaceStatus6.getInterfaceStatus();
                    interfaceStatus4 |= interfaceStatus3;
                } else {
                    interfaceStatus2 = interfaceStatus6.getInterfaceStatus();
                    interfaceStatus4 &= ~interfaceStatus2;
                }
            }
        } else if (z) {
            interfaceStatus3 = interfaceStatus5.getInterfaceStatus();
            interfaceStatus4 |= interfaceStatus3;
        } else {
            interfaceStatus2 = interfaceStatus5.getInterfaceStatus();
            interfaceStatus4 &= ~interfaceStatus2;
        }
        if (currentInterfaceStatus.getInterfaceStatus() != interfaceStatus4) {
            currentInterfaceStatus.setInterfaceStatus(interfaceStatus4);
        }
        Iterator<a> it = interfaceListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkStatusChanged(interfaceStatus, z);
            spduLog.Tloge(TAG, "", "onNetworkChanged", "updataType", interfaceStatus, "isAvaiable", Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void registerNetwork(android.content.Context r8) {
        /*
            r0 = 4
            r1 = 2
            r2 = 0
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = org.android.spdy.NetWorkStatusUtil.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0014
            java.lang.String r0 = "769de6f6"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r8
            r4.ipc$dispatch(r0, r1)
            return
        L_0x0014:
            java.lang.String r4 = ""
            java.lang.String r5 = "tnetsdk.NetWorkStatusUtil"
            if (r8 == 0) goto L_0x002e
            boolean r6 = isSupportMultiNetwork()     // Catch: Exception -> 0x002c
            if (r6 == 0) goto L_0x002e
            registerCellularNetworkListen(r8)     // Catch: Exception -> 0x002c
            registerWifiNetworkListen(r8)     // Catch: Exception -> 0x002c
            org.android.spdy.NetWorkStatusUtil.init_succ = r3     // Catch: Exception -> 0x002c
            org.android.spdy.NetWorkStatusUtil.initErrCode = r2     // Catch: Exception -> 0x002c
            goto L_0x005b
        L_0x002c:
            r8 = move-exception
            goto L_0x0045
        L_0x002e:
            if (r8 != 0) goto L_0x0033
            org.android.spdy.NetWorkStatusUtil.initErrCode = r3     // Catch: Exception -> 0x002c
            goto L_0x005b
        L_0x0033:
            boolean r8 = tb.l0r.K()     // Catch: Exception -> 0x002c
            if (r8 != 0) goto L_0x003c
            org.android.spdy.NetWorkStatusUtil.initErrCode = r1     // Catch: Exception -> 0x002c
            goto L_0x005b
        L_0x003c:
            boolean r8 = isInMultiNetworkBrandWhiteList()     // Catch: Exception -> 0x002c
            if (r8 != 0) goto L_0x005b
            org.android.spdy.NetWorkStatusUtil.initErrCode = r0     // Catch: Exception -> 0x002c
            goto L_0x005b
        L_0x0045:
            r8.printStackTrace()
            java.lang.String r6 = "registerNetwork error"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r8
            org.android.spdy.spduLog.Tloge(r5, r4, r6, r7)
            java.lang.String r8 = r8.getMessage()
            org.android.spdy.NetWorkStatusUtil.initExceptionMsg = r8
            r8 = 5
            org.android.spdy.NetWorkStatusUtil.initErrCode = r8
        L_0x005b:
            int r8 = org.android.spdy.NetWorkStatusUtil.initErrCode
            if (r8 != 0) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            int r6 = org.android.spdy.NetWorkStatusUtil.initErrCode
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r7 = "succ"
            r0[r2] = r7
            r0[r3] = r8
            java.lang.String r8 = "errCode"
            r0[r1] = r8
            r8 = 3
            r0[r8] = r6
            java.lang.String r8 = "[registerNetwork]"
            org.android.spdy.spduLog.Tloge(r5, r4, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.NetWorkStatusUtil.registerNetwork(android.content.Context):void");
    }

    public static int bindSocketFdUnderCellularNetwork(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af3a2015", new Object[]{new Integer(i)})).intValue();
        }
        try {
            if (cellularNetwork != null && Build.VERSION.SDK_INT >= 23 && (!d61.e() || !l0r.u())) {
                cellularNetwork.bindSocket(ParcelFileDescriptor.fromFd(i).getFileDescriptor());
                spduLog.Tloge(TAG, "", "bind cellular succ", "fd", Integer.valueOf(i), "cellularNetwork", cellularNetwork);
                return 0;
            }
            spduLog.Tloge(TAG, "", "bind Cellular Fail", "cellular", cellularNetwork, "isEnterBgLong", Boolean.valueOf(d61.e()), "isBrandBlock", Boolean.valueOf(l0r.u()));
            return -1;
        } catch (Throwable th) {
            spduLog.Tloge(TAG, "", "bind cellular fail", "e", th);
            return -1;
        }
    }

    public static int bindSocketFdUnderWifiNetwork(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16b03240", new Object[]{new Integer(i)})).intValue();
        }
        if (wifiNetwork == null || Build.VERSION.SDK_INT < 23 || i <= 0) {
            spduLog.Tloge(TAG, "", "bind Wifi Fail", "wifi", wifiNetwork, "fd", Integer.valueOf(i));
            return -1;
        }
        try {
            wifiNetwork.bindSocket(ParcelFileDescriptor.fromFd(i).getFileDescriptor());
            spduLog.Tloge(TAG, "", "bind Wifi succ", "fd", Integer.valueOf(i), "wifiNetwork", wifiNetwork);
            return 0;
        } catch (Throwable th) {
            spduLog.Tloge(TAG, "", "bind Wifi fail", "e", th);
            return -1;
        }
    }
}
