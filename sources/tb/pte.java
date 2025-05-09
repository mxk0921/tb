package tb;

import android.content.Context;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pte {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public static int f26283a = -1;

    static {
        t2o.a(962592880);
    }

    public static synchronized int a() {
        synchronized (pte.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("41b4bef8", new Object[0])).intValue();
            }
            int i = f26283a;
            if (i >= 0) {
                return i;
            }
            f26283a = 0;
            try {
                f26283a = c();
            } catch (Exception unused) {
            }
            return f26283a;
        }
    }

    public static boolean b(InetAddress inetAddress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b203a35", new Object[]{inetAddress})).booleanValue();
        }
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress()) {
            return true;
        }
        return false;
    }

    public static int c() throws SocketException {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa22f865", new Object[0])).intValue();
        }
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (it.hasNext()) {
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                int i2 = 0;
                for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                    InetAddress address = interfaceAddress.getAddress();
                    if (address instanceof Inet6Address) {
                        if (!b((Inet6Address) address)) {
                            i2 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!b(inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
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
        Context g = o2w.k().g();
        if (NetworkUtil.l(g)) {
            str = "wlan";
        } else {
            str = NetworkUtil.k(g) ? "rmnet" : null;
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
        if (i != 2 || !treeMap.containsKey("v4-wlan0")) {
            return i;
        }
        return 3;
    }
}
