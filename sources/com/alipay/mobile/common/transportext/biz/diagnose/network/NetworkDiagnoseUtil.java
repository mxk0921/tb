package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkDiagnoseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss.S";
    public static final String FORMAT_FULL_CN = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";
    public static final String FORMAT_HMS = "HH:mm:ss.S";
    public static final String FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_LONG_CN = "yyyy年MM月dd日  HH时mm分ss秒";
    public static final String FORMAT_SHORT = "yyyy-MM-dd";
    public static final String FORMAT_SHORT_CN = "yyyy年MM月dd";

    public static boolean blank(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16d8845", new Object[]{new Byte(b)})).booleanValue();
        }
        if (b == 32 || b == 9) {
            return true;
        }
        return false;
    }

    public static byte[] convert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df1a4159", new Object[]{str});
        }
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int defaultPort(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab9c11fe", new Object[]{new Boolean(z)})).intValue();
        }
        if (z) {
            return 443;
        }
        return 80;
    }

    public static boolean digital(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fb8601", new Object[]{new Byte(b)})).booleanValue();
        }
        if (b < 48 || b > 57) {
            return false;
        }
        return true;
    }

    public static String dns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a697ce6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c3efd8c", new Object[]{str});
        }
        if (str == null || str.isEmpty()) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        try {
            return new SimpleDateFormat(str).format(new Date());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean isSafety(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dd9ae31", new Object[]{str})).booleanValue();
        }
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public static long msToS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33f7309f", new Object[]{new Long(j)})).longValue();
        }
        return j / 1000;
    }

    public static double nsToMs(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("187225e5", new Object[]{new Long(j)})).doubleValue();
        }
        return j / 1000000.0d;
    }

    public static String parse(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a9201c", new Object[]{str});
        }
        if (!isSafety(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            str2 = str.trim();
        } else {
            str2 = str.substring(0, lastIndexOf).trim();
        }
        if (!isSafety(str2)) {
            return null;
        }
        return str2;
    }

    public static long sToMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e2d533c", new Object[]{new Integer(i)})).longValue();
        }
        return i * 1000;
    }

    public static String convert(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8faf7bf", new Object[]{bArr});
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:11:0x002c, B:13:0x0030, B:14:0x004c, B:15:0x0050, B:16:0x0065, B:18:0x006b, B:20:0x0073, B:22:0x007b, B:25:0x0095, B:28:0x00a4), top: B:31:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:11:0x002c, B:13:0x0030, B:14:0x004c, B:15:0x0050, B:16:0x0065, B:18:0x006b, B:20:0x0073, B:22:0x007b, B:25:0x0095, B:28:0x00a4), top: B:31:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address sysProxy(com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address r7, boolean r8) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "www.taobao.com"
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseUtil.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0020
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r8)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r8[r0] = r2
            java.lang.String r7 = "70a37516"
            java.lang.Object r7 = r3.ipc$dispatch(r7, r8)
            com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address r7 = (com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address) r7
            return r7
        L_0x0020:
            if (r8 == 0) goto L_0x0026
            java.lang.String r8 = "https://"
            goto L_0x0029
        L_0x0026:
            java.lang.String r8 = "http://"
        L_0x0029:
            r3 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.String r4 = r7.ip     // Catch: all -> 0x00a7
            if (r4 == 0) goto L_0x004c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x00a7
            r2.<init>()     // Catch: all -> 0x00a7
            r2.append(r8)     // Catch: all -> 0x00a7
            java.lang.String r8 = r7.ip     // Catch: all -> 0x00a7
            r2.append(r8)     // Catch: all -> 0x00a7
            java.lang.String r8 = ":"
            r2.append(r8)     // Catch: all -> 0x00a7
            int r7 = r7.port     // Catch: all -> 0x00a7
            r2.append(r7)     // Catch: all -> 0x00a7
            java.lang.String r7 = r2.toString()     // Catch: all -> 0x00a7
            goto L_0x0050
        L_0x004c:
            java.lang.String r7 = r8.concat(r2)     // Catch: all -> 0x00a7
        L_0x0050:
            java.net.URI r8 = new java.net.URI     // Catch: all -> 0x00a7
            r8.<init>(r7)     // Catch: all -> 0x00a7
            java.net.ProxySelector r7 = java.net.ProxySelector.getDefault()     // Catch: all -> 0x00a7
            java.util.List r7 = r7.select(r8)     // Catch: all -> 0x00a7
            java.util.Iterator r7 = r7.iterator()     // Catch: all -> 0x00a7
            r8 = 10
            com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address[] r2 = new com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration.Address[r8]     // Catch: all -> 0x00a7
        L_0x0065:
            boolean r4 = r7.hasNext()     // Catch: all -> 0x00a7
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r7.next()     // Catch: all -> 0x00a7
            java.net.Proxy r4 = (java.net.Proxy) r4     // Catch: all -> 0x00a7
            if (r4 == 0) goto L_0x0065
            java.net.SocketAddress r4 = r4.address()     // Catch: all -> 0x00a7
            java.net.InetSocketAddress r4 = (java.net.InetSocketAddress) r4     // Catch: all -> 0x00a7
            if (r4 == 0) goto L_0x0065
            com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address r5 = new com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address     // Catch: all -> 0x00a7
            r5.<init>()     // Catch: all -> 0x00a7
            r2[r1] = r5     // Catch: all -> 0x00a7
            java.lang.String r6 = r4.getHostName()     // Catch: all -> 0x00a7
            r5.ip = r6     // Catch: all -> 0x00a7
            r5 = r2[r1]     // Catch: all -> 0x00a7
            int r4 = r4.getPort()     // Catch: all -> 0x00a7
            r5.port = r4     // Catch: all -> 0x00a7
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x0065
        L_0x0093:
            if (r1 == 0) goto L_0x00a7
            long r7 = java.lang.System.nanoTime()     // Catch: all -> 0x00a7
            r0 = 32
            long r4 = r7 >>> r0
            int r0 = (int) r4     // Catch: all -> 0x00a7
            int r8 = (int) r7     // Catch: all -> 0x00a7
            r7 = r0 ^ r8
            if (r7 >= 0) goto L_0x00a4
            int r7 = -r7
        L_0x00a4:
            int r7 = r7 % r1
            r3 = r2[r7]     // Catch: all -> 0x00a7
        L_0x00a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseUtil.sysProxy(com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address, boolean):com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration$Address");
    }

    public static Configuration.Address parse(String str, boolean z) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Configuration.Address) ipChange.ipc$dispatch("1af7b83c", new Object[]{str, new Boolean(z)});
        }
        Configuration.Address address = new Configuration.Address();
        if (str == null) {
            return address;
        }
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf == -1) {
            str2 = str.trim();
            str3 = null;
        } else {
            str2 = str.substring(0, lastIndexOf).trim();
            str3 = str.substring(lastIndexOf + 1).trim();
        }
        if (str2.isEmpty()) {
            address.ip = "127.0.0.1";
        } else {
            address.ip = str2;
        }
        if (str3 == null || str3.isEmpty()) {
            address.port = defaultPort(z);
        } else {
            try {
                int parseInt = Integer.parseInt(str3);
                address.port = parseInt;
                if (parseInt < 0 || parseInt > 65535) {
                    address.port = 0;
                }
            } catch (Throwable unused) {
                if (str3.compareToIgnoreCase("http") == 0) {
                    address.port = 80;
                } else if (str3.compareToIgnoreCase("https") == 0) {
                    address.port = 443;
                } else {
                    address.port = 0;
                }
            }
        }
        return address;
    }
}
