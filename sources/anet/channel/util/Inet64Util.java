package anet.channel.util;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.netutil.UdpConnectType;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Inet64Util {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IPV4ONLY_HOST = "ipv4only.arpa";
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;
    public static final String TAG = "awcn.Inet64Util";
    public static Nat64Prefix defaultNatPrefix;
    public static volatile int mLocalIpv4MTU;
    public static volatile int mLocalIpv6MTU;
    public static volatile String networkId;
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener;
    public static final byte[][] IPV4ONLY_IP = {new byte[]{-64, 0, 0, -86}, new byte[]{-64, 0, 0, -85}};
    public static volatile String mLocalIpv4 = null;
    public static volatile String mLocalIpv6 = null;
    public static ConcurrentHashMap<String, Nat64Prefix> nat64PrefixMap = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Integer> ipStackMap = new ConcurrentHashMap<>();
    private static AtomicBoolean isInit = new AtomicBoolean(false);

    static {
        t2o.a(607125947);
        networkId = null;
        defaultNatPrefix = null;
        try {
            defaultNatPrefix = new Nat64Prefix((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            networkId = generateNetworkId(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
        networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.util.Inet64Util.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    return;
                }
                ALog.e(Inet64Util.TAG, "onNetworkStatusChanged: startIpStackDetect", null, new Object[0]);
                Inet64Util.forceStartIpStackDetect();
            }
        };
    }

    public static /* synthetic */ String access$000(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff7683e2", new Object[]{networkStatus});
        }
        return generateNetworkId(networkStatus);
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return detectIpStack();
    }

    public static /* synthetic */ Nat64Prefix access$200() throws UnknownHostException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nat64Prefix) ipChange.ipc$dispatch("19b48547", new Object[0]);
        }
        return detectNat64Prefix();
    }

    public static String convertToIPv6(Inet4Address inet4Address) throws Exception {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9517da0e", new Object[]{inet4Address});
        }
        if (inet4Address != null) {
            Nat64Prefix nat64Prefix = getNat64Prefix();
            if (nat64Prefix != null) {
                byte[] address = inet4Address.getAddress();
                byte[] address2 = nat64Prefix.mPrefix.getAddress();
                int i2 = nat64Prefix.mPrefixLength / 8;
                int i3 = 0;
                while (true) {
                    int i4 = i + i2;
                    if (i4 > 15 || i3 >= 4) {
                        break;
                    }
                    if (i4 != 8) {
                        i3++;
                        address2[i4] = (byte) (address[i3] | address2[i4]);
                    }
                    i++;
                }
                return InetAddress.getByAddress(address2).getHostAddress();
            }
            throw new Exception("cannot get nat64 prefix");
        }
        throw new InvalidParameterException("address in null");
    }

    public static String convertToIPv6ThrowsException(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b45fc42", new Object[]{str});
        }
        return convertToIPv6((Inet4Address) InetAddress.getByName(str));
    }

    private static Nat64Prefix detectNat64Prefix() throws UnknownHostException {
        InetAddress inetAddress;
        byte b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nat64Prefix) ipChange.ipc$dispatch("d391a843", new Object[0]);
        }
        try {
            inetAddress = InetAddress.getByName(IPV4ONLY_HOST);
        } catch (Exception unused) {
            inetAddress = null;
        }
        if (inetAddress instanceof Inet6Address) {
            ALog.i(TAG, "Resolved AAAA: " + inetAddress.toString(), null, new Object[0]);
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                return null;
            }
            for (int i = 12; i >= 0; i--) {
                byte b2 = address[i];
                byte[][] bArr = IPV4ONLY_IP;
                byte[] bArr2 = bArr[0];
                if ((b2 & bArr2[0]) != 0 && address[i + 1] == 0 && address[i + 2] == 0 && ((b = address[i + 3]) == bArr2[3] || b == bArr[1][3])) {
                    address[i + 3] = 0;
                    address[i + 2] = 0;
                    address[i + 1] = 0;
                    address[i] = 0;
                    return new Nat64Prefix(Inet6Address.getByAddress(IPV4ONLY_HOST, address, 0), i * 8);
                }
            }
        } else if (inetAddress instanceof Inet4Address) {
            ALog.i(TAG, "Resolved A: " + inetAddress.toString(), null, new Object[0]);
        }
        return null;
    }

    private static boolean filterAddress(InetAddress inetAddress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b203a35", new Object[]{inetAddress})).booleanValue();
        }
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress()) {
            return true;
        }
        return false;
    }

    public static void forceStartIpStackDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc77eb4", new Object[0]);
        } else if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.e(TAG, "startIpStackDetect, no network，not forceStartIpStackDetect", null, new Object[0]);
        } else {
            networkId = generateNetworkId(NetworkStatusHelper.getStatus());
            final int detectIpStack = detectIpStack();
            ipStackMap.put(networkId, Integer.valueOf(detectIpStack));
            ALog.e(TAG, "startIpStackDetect, forceStartIpStackDetect", null, DispatchConstants.NETWORK_ID, networkId, "status", Integer.valueOf(detectIpStack));
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.Inet64Util.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.util.Inet64Util.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    String access$000 = Inet64Util.access$000(NetworkStatusHelper.getStatus());
                                    ALog.e(Inet64Util.TAG, "startIpStackDetect double check, forceStartIpStackDetect", null, "tmpNetworkId", access$000, "status", Integer.valueOf(detectIpStack));
                                    Inet64Util.ipStackMap.put(access$000, Integer.valueOf(Inet64Util.access$100()));
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                }
            }, 1500L, TimeUnit.MILLISECONDS);
        }
    }

    private static String generateNetworkId(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e40270e6", new Object[]{networkStatus});
        }
        if (networkStatus.isWifi()) {
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (TextUtils.isEmpty(wifiBSSID)) {
                wifiBSSID = "";
            }
            return "WIFI$" + wifiBSSID;
        } else if (!networkStatus.isMobile()) {
            return "UnknownNetwork";
        } else {
            return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
        }
    }

    public static void getIpAddressByInterfaces() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c65fa4f", new Object[0]);
            return;
        }
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                    String displayName = networkInterface.getDisplayName();
                    ALog.i(TAG, "find NetworkInterface:" + displayName, null, new Object[0]);
                    if (displayName.toLowerCase().startsWith("wlan0") && NetworkStatusHelper.getStatus().isWifi()) {
                        for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                            InetAddress address = interfaceAddress.getAddress();
                            if (address instanceof Inet6Address) {
                                mLocalIpv6 = address.getHostAddress();
                                mLocalIpv6MTU = networkInterface.getMTU();
                            } else if (address instanceof Inet4Address) {
                                mLocalIpv4 = address.getHostAddress();
                                mLocalIpv4MTU = networkInterface.getMTU();
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static int getIpStackByInterfaces() throws SocketException {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec6c2596", new Object[0])).intValue();
        }
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.i(TAG, "find NetworkInterface:" + displayName, null, new Object[0]);
                int i2 = 0;
                for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                    InetAddress address = interfaceAddress.getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!filterAddress(inet6Address)) {
                            ALog.e(TAG, "Found IPv6 address:" + inet6Address.toString(), null, new Object[0]);
                            i2 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!filterAddress(inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.e(TAG, "Found IPv4 address:" + inet4Address.toString(), null, new Object[0]);
                            i2 |= 1;
                        }
                    }
                }
                if (i2 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i2));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        if (NetworkStatusHelper.getStatus().isWifi()) {
            str = "wlan";
        } else if (NetworkStatusHelper.getStatus().isMobile()) {
            str = "rmnet";
        }
        if (str != null) {
            Iterator it2 = treeMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    i = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        return (i != 2 || !treeMap.containsKey("v4-wlan0")) ? i : i | ((Integer) treeMap.remove("v4-wlan0")).intValue();
    }

    private static int getIpStackByUdpConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("beb44da5", new Object[0])).intValue();
        }
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        boolean testUdpConnectIpv4 = UdpConnectType.testUdpConnectIpv4();
        if (UdpConnectType.testUdpConnectIpv6()) {
            return (testUdpConnectIpv4 ? 1 : 0) | 2;
        }
        return testUdpConnectIpv4 ? 1 : 0;
    }

    public static Nat64Prefix getNat64Prefix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nat64Prefix) ipChange.ipc$dispatch("ad7b4670", new Object[0]);
        }
        Nat64Prefix nat64Prefix = nat64PrefixMap.get(networkId);
        if (nat64Prefix == null) {
            return defaultNatPrefix;
        }
        return nat64Prefix;
    }

    public static int getStackType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15dbc1a6", new Object[0])).intValue();
        }
        Integer num = ipStackMap.get(networkId);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean isHttp(IConnStrategy iConnStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3527bd41", new Object[]{iConnStrategy})).booleanValue();
        }
        return "http".equalsIgnoreCase(iConnStrategy.getProtocol().protocol);
    }

    public static boolean isHttp3(IConnStrategy iConnStrategy) {
        ConnType valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9472e152", new Object[]{iConnStrategy})).booleanValue();
        }
        if (iConnStrategy == null || (valueOf = ConnType.valueOf(iConnStrategy.getProtocol())) == null) {
            return false;
        }
        return valueOf.isHTTP3();
    }

    public static boolean isIPv4OnlyNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4576025e", new Object[0])).booleanValue();
        }
        Integer num = ipStackMap.get(networkId);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static boolean isIPv6OnlyNetwork() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899be1c", new Object[0])).booleanValue();
        }
        if (AwcnConfig.isIpv6OnlyEnable() && (num = ipStackMap.get(networkId)) != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
        } else if (isInit.compareAndSet(false, true)) {
            NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
        }
    }

    public static void startIpStackDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524919e9", new Object[0]);
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        networkId = generateNetworkId(NetworkStatusHelper.getStatus());
        if (ipStackMap.putIfAbsent(networkId, 0) == null) {
            final NetTypeStat netTypeStat = new NetTypeStat();
            int detectIpStack = detectIpStack();
            ipStackMap.put(networkId, Integer.valueOf(detectIpStack));
            netTypeStat.ipStackType = detectIpStack;
            final String str = networkId;
            if (detectIpStack == 2 || detectIpStack == 3) {
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.Inet64Util.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.util.Inet64Util.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Nat64Prefix access$200;
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        String access$000 = Inet64Util.access$000(NetworkStatusHelper.getStatus());
                                        ALog.e(Inet64Util.TAG, "startIpStackDetect run", null, "finalNetworkId", str, "tmpNetworkId", access$000);
                                        if (str.equals(access$000)) {
                                            ALog.e(Inet64Util.TAG, "startIpStackDetect double check", null, new Object[0]);
                                            int access$100 = Inet64Util.access$100();
                                            AnonymousClass3 r4 = AnonymousClass3.this;
                                            if (netTypeStat.ipStackType != access$100) {
                                                Inet64Util.ipStackMap.put(str, Integer.valueOf(access$100));
                                                NetTypeStat netTypeStat2 = netTypeStat;
                                                netTypeStat2.lastIpStackType = netTypeStat2.ipStackType;
                                                netTypeStat2.ipStackType = access$100;
                                            }
                                            if ((access$100 == 2 || access$100 == 3) && (access$200 = Inet64Util.access$200()) != null) {
                                                Inet64Util.nat64PrefixMap.put(str, access$200);
                                                netTypeStat.nat64Prefix = access$200.toString();
                                            }
                                            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                                                NetTypeStat netTypeStat3 = netTypeStat;
                                                netTypeStat3.isCheck = 1;
                                                netTypeStat3.sumCostTime = System.currentTimeMillis() - currentTimeMillis;
                                                AppMonitor.getInstance().commitStat(netTypeStat);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                        }
                    }
                }, 1500L, TimeUnit.MILLISECONDS);
            } else if (GlobalAppRuntimeInfo.isTargetProcess()) {
                netTypeStat.isCheck = 0;
                netTypeStat.sumCostTime = System.currentTimeMillis() - currentTimeMillis;
                AppMonitor.getInstance().commitStat(netTypeStat);
            }
        }
    }

    public static void updateIpStackNetwork(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50302a6", new Object[]{new Integer(i)});
        } else {
            ipStackMap.put(networkId, Integer.valueOf(i));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:24:0x0073
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private static int detectIpStack() {
        /*
            r0 = 2
            r1 = 4
            r2 = 1
            r3 = 3
            java.lang.String r4 = "ip stack"
            java.lang.String r5 = "startIpStackDetect"
            java.lang.String r6 = "awcn.Inet64Util"
            com.android.alibaba.ip.runtime.IpChange r7 = anet.channel.util.Inet64Util.$ipChange
            boolean r8 = r7 instanceof com.android.alibaba.ip.runtime.IpChange
            r9 = 0
            if (r8 == 0) goto L_0x0022
            java.lang.String r0 = "41b4bef8"
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r7.ipc$dispatch(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0022:
            r7 = 0
            java.lang.String r8 = "udp_connect"
            int r10 = getIpStackByUdpConnect()     // Catch: all -> 0x0070
            boolean r11 = anet.channel.AwcnConfig.isIpv6RectificationEnable()     // Catch: all -> 0x0052
            if (r11 == 0) goto L_0x0054
            if (r10 != r3) goto L_0x0054
            int r11 = getIpStackByInterfaces()     // Catch: all -> 0x0052
            if (r11 != r2) goto L_0x0054
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch: all -> 0x0052
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch: all -> 0x0052
            java.lang.Object[] r14 = new java.lang.Object[r1]     // Catch: all -> 0x0052
            r14[r9] = r4     // Catch: all -> 0x0052
            r14[r2] = r12     // Catch: all -> 0x0052
            java.lang.String r12 = "new stack"
            r14[r0] = r12     // Catch: all -> 0x0052
            r14[r3] = r13     // Catch: all -> 0x0052
            anet.channel.util.ALog.e(r6, r5, r7, r14)     // Catch: all -> 0x0052
            r10 = r11
            goto L_0x0054
        L_0x0052:
            r11 = move-exception
            goto L_0x0076
        L_0x0054:
            if (r10 != r2) goto L_0x007d
            int r11 = anet.channel.detect.Ipv6Detector.detectIpv6Status()     // Catch: all -> 0x0052
            if (r11 != r2) goto L_0x0065
            java.lang.String r11 = "[IpStackOpt] dueToIpStackDetectFix ipv4->6"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: all -> 0x0052
            anet.channel.util.ALog.e(r6, r11, r7, r12)     // Catch: all -> 0x0052
            r10 = 3
            goto L_0x007d
        L_0x0065:
            anet.channel.detect.Ipv6Detector.startIpv6Detect()     // Catch: all -> 0x0052
            java.lang.String r11 = "[IpStackOpt] dueToIpStackDetectFix startIpv6Detect"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: all -> 0x0052
            anet.channel.util.ALog.e(r6, r11, r7, r12)     // Catch: all -> 0x0052
            goto L_0x007d
        L_0x0070:
            r11 = move-exception
        L_0x0071:
            r10 = 0
            goto L_0x0076
        L_0x0073:
            r11 = move-exception
            r8 = r7
            goto L_0x0071
        L_0x0076:
            java.lang.String r12 = "[detectIpStack]error."
            java.lang.Object[] r13 = new java.lang.Object[r9]
            anet.channel.util.ALog.e(r6, r12, r7, r11, r13)
        L_0x007d:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r9] = r4
            r1[r2] = r11
            java.lang.String r2 = "detectType"
            r1[r0] = r2
            r1[r3] = r8
            anet.channel.util.ALog.e(r6, r5, r7, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Inet64Util.detectIpStack():int");
    }

    public static String convertToIPv6(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6356a1a", new Object[]{str});
        }
        try {
            return convertToIPv6((Inet4Address) InetAddress.getByName(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
