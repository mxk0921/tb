package anet.channel.util;

import anet.channel.AwcnConfig;
import anet.channel.Session;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ComplexUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IP_COMPLEX = 2;
    public static final int IP_DEGRADE = 1;
    private static final String TAG = "awcn.ComplexUtils";

    static {
        t2o.a(607125935);
    }

    public static long getComplexConnectDelayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2196a3b", new Object[0])).longValue();
        }
        return AwcnConfig.getComplexConnectDelayTime();
    }

    public static List<ConnInfo> getComplexIpList(Session session, List<ConnInfo> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af2eb0f3", new Object[]{session, list, new Integer(i)});
        }
        if (i == 1) {
            return getIpDegradeList(session, list);
        }
        return null;
    }

    public static boolean isAllowComplexConnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b711d58", new Object[]{str, str2})).booleanValue();
        }
        if (AwcnConfig.isComplexConnectEnable() && AwcnConfig.isAllowComplexConnect(str) && Utils.isIPV6Address(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (anet.channel.strategy.utils.Utils.isIPV4Address(r5.getIp()) == false) goto L_0x005d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<anet.channel.entity.ConnInfo> getVpnRacingList(anet.channel.Session r10, java.util.List<anet.channel.entity.ConnInfo> r11, java.lang.String r12) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = anet.channel.util.ComplexUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "7014d443"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r10
            r5[r1] = r11
            r5[r0] = r12
            java.lang.Object r10 = r3.ipc$dispatch(r4, r5)
            java.util.List r10 = (java.util.List) r10
            return r10
        L_0x001b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "awcn.ComplexUtils"
            if (r10 != 0) goto L_0x0030
            java.lang.String r10 = "[vpn complex] not need vpnRacing! connecting session is null"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: Exception -> 0x002c
            anet.channel.util.ALog.e(r4, r10, r12, r11)     // Catch: Exception -> 0x002c
            return r3
        L_0x002c:
            r10 = move-exception
            r11 = 0
            goto L_0x00b5
        L_0x0030:
            anet.channel.entity.ConnType r10 = r10.getConnType()     // Catch: Exception -> 0x002c
            boolean r10 = r10.isHTTP3()     // Catch: Exception -> 0x002c
            if (r10 != 0) goto L_0x0042
            java.lang.String r10 = "[vpn complex] not need vpnRacing! connecting session not h3"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: Exception -> 0x002c
            anet.channel.util.ALog.e(r4, r10, r12, r11)     // Catch: Exception -> 0x002c
            return r3
        L_0x0042:
            int r10 = anet.channel.util.Inet64Util.getStackType()     // Catch: Exception -> 0x002c
            if (r10 != r0) goto L_0x0050
            int r10 = anet.channel.detect.Ipv6Detector.detectIpv6Status()     // Catch: Exception -> 0x002c
            if (r10 != r1) goto L_0x0050
            r10 = 1
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            if (r11 == 0) goto L_0x00be
            int r5 = r11.size()     // Catch: Exception -> 0x0080
            if (r5 <= 0) goto L_0x00be
            java.util.ListIterator r11 = r11.listIterator()     // Catch: Exception -> 0x0080
        L_0x005d:
            boolean r5 = r11.hasNext()     // Catch: Exception -> 0x0080
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r11.next()     // Catch: Exception -> 0x0080
            anet.channel.entity.ConnInfo r5 = (anet.channel.entity.ConnInfo) r5     // Catch: Exception -> 0x0080
            anet.channel.entity.ConnType r6 = r5.getConnType()     // Catch: Exception -> 0x0080
            boolean r6 = r6.isH2()     // Catch: Exception -> 0x0080
            if (r6 == 0) goto L_0x005d
            if (r10 == 0) goto L_0x0085
            java.lang.String r6 = r5.getIp()     // Catch: Exception -> 0x0080
            boolean r6 = anet.channel.strategy.utils.Utils.isIPV6Address(r6)     // Catch: Exception -> 0x0080
            if (r6 != 0) goto L_0x0091
            goto L_0x0085
        L_0x0080:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L_0x00b5
        L_0x0085:
            if (r10 != 0) goto L_0x005d
            java.lang.String r6 = r5.getIp()     // Catch: Exception -> 0x0080
            boolean r6 = anet.channel.strategy.utils.Utils.isIPV4Address(r6)     // Catch: Exception -> 0x0080
            if (r6 == 0) goto L_0x005d
        L_0x0091:
            anet.channel.entity.ConnInfo r11 = new anet.channel.entity.ConnInfo     // Catch: Exception -> 0x0080
            java.lang.String r6 = r5.getHost()     // Catch: Exception -> 0x0080
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: Exception -> 0x0080
            r7.<init>()     // Catch: Exception -> 0x0080
            java.lang.String r8 = "VPN-COMPLEX-"
            r7.append(r8)     // Catch: Exception -> 0x0080
            java.lang.String r8 = r5.getSeq()     // Catch: Exception -> 0x0080
            r7.append(r8)     // Catch: Exception -> 0x0080
            java.lang.String r7 = r7.toString()     // Catch: Exception -> 0x0080
            anet.channel.strategy.IConnStrategy r5 = r5.strategy     // Catch: Exception -> 0x0080
            r11.<init>(r6, r7, r5)     // Catch: Exception -> 0x0080
            r3.add(r11)     // Catch: Exception -> 0x0080
            return r3
        L_0x00b5:
            java.lang.String r5 = "getVpnRacingList failed"
            java.lang.Object[] r6 = new java.lang.Object[r2]
            anet.channel.util.ALog.e(r4, r5, r12, r10, r6)
            r10 = r11
        L_0x00be:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r5 = "[vpn complex] getVpnRacingList"
            r11.<init>(r5)
            java.lang.String r5 = r3.toString()
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = "isOnlyIpv6"
            r0[r2] = r5
            r0[r1] = r10
            anet.channel.util.ALog.e(r4, r11, r12, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.ComplexUtils.getVpnRacingList(anet.channel.Session, java.util.List, java.lang.String):java.util.List");
    }

    private static List<ConnInfo> getIpDegradeList(Session session, List<ConnInfo> list) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7115080", new Object[]{session, list});
        }
        ArrayList arrayList = new ArrayList();
        if (session == null) {
            return arrayList;
        }
        try {
            boolean isHttpType = session.getConnType().isHttpType();
            if (!(list == null || list.size() == 0)) {
                ListIterator<ConnInfo> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    ConnInfo next = listIterator.next();
                    if (Utils.isIPV4Address(next.getIp()) && !(next.getConnType().isHttpType() ^ isHttpType)) {
                        String host = next.getHost();
                        arrayList.add(new ConnInfo(host, "COMPLEX-" + next.getSeq(), next.strategy));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                List<IConnStrategy> ipv4ConnStrategyListByHost = StrategyCenter.getInstance().getIpv4ConnStrategyListByHost(session.getRealHost(), session.getHost().startsWith("https"), session.getConnType().getType());
                if (ipv4ConnStrategyListByHost.isEmpty()) {
                    return arrayList;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < ipv4ConnStrategyListByHost.size(); i3++) {
                    IConnStrategy iConnStrategy = ipv4ConnStrategyListByHost.get(i3);
                    if (!(ConnType.valueOf(iConnStrategy.getProtocol()).isHttpType() ^ isHttpType)) {
                        int retryTimes = iConnStrategy.getRetryTimes();
                        for (int i4 = 0; i4 <= retryTimes; i4++) {
                            i2++;
                            String host2 = session.getHost();
                            ConnInfo connInfo = new ConnInfo(host2, "COMPLEX-" + session.mSeq + "_" + i2, iConnStrategy);
                            connInfo.retryTime = i4;
                            connInfo.maxRetryTime = retryTimes;
                            arrayList.add(connInfo);
                        }
                    }
                }
            }
            i = 0;
            str = null;
        } catch (Exception e) {
            i = 0;
            str = null;
            ALog.e(TAG, "getIpDegradeList failed", null, e, new Object[0]);
        }
        ALog.d(TAG, "getIpDegradeList" + arrayList.toString(), str, new Object[i]);
        return arrayList;
    }
}
