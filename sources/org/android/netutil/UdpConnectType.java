package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;
import org.android.spdy.SpdyAgent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UdpConnectType {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native int nativeTestUdpConnectIpv4();

    private static native int nativeTestUdpConnectIpv6();

    public static boolean testUdpConnectIpv4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d68f652b", new Object[0])).booleanValue();
        }
        return SpdyAgent.checkLoadSucc() && nativeTestUdpConnectIpv4() != 0;
    }

    public static boolean testUdpConnectIpv6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ab942d", new Object[0])).booleanValue();
        }
        return SpdyAgent.checkLoadSucc() && nativeTestUdpConnectIpv6() != 0;
    }
}
