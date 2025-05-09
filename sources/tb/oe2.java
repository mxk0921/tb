package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.FlowCenter;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oe2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f25326a = null;
    public static long b = 0;
    public static boolean c = false;
    public static Class d = null;
    public static final String e = String.valueOf((char) 1);
    public static GZIPOutputStream f = null;
    public static ByteArrayOutputStream g = null;
    public static GZIPOutputStream h = null;
    public static ByteArrayOutputStream i = null;
    public static boolean j = true;

    static {
        t2o.a(962592938);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f52ae00", new Object[0]);
            return;
        }
        b(f);
        b(g);
        b(h);
        b(i);
        erx.e().a();
    }

    public static void b(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b72bf2", new Object[]{outputStream});
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdecb8eb", new Object[0]);
        } else {
            j = false;
        }
    }

    public static byte[] f(Map<String, String> map, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("10d00027", new Object[]{map, new Boolean(z)});
        }
        return e(map, 1, z, true);
    }

    public static byte[] g(Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("53921b81", new Object[]{map});
        }
        return e(map, 2, false, true);
    }

    public static byte[] h(Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("71c27e51", new Object[]{map});
        }
        return e(map, 1, false, false);
    }

    public static byte[] i(Map<String, String> map, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ca431acf", new Object[]{map, new Boolean(z)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String d2 = d(z);
        if (d2 == null || d2.length() <= 0) {
            byteArrayOutputStream.write(kp2.d(0));
        } else {
            byteArrayOutputStream.write(kp2.d(d2.getBytes().length));
            byteArrayOutputStream.write(d2.getBytes());
        }
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                try {
                    try {
                        byteArrayOutputStream.write(kp2.f(Integer.valueOf(str).intValue()));
                        String str2 = map.get(str);
                        if (str2 != null) {
                            byteArrayOutputStream.write(kp2.f(str2.getBytes().length));
                            byteArrayOutputStream.write(str2.getBytes());
                        } else {
                            byteArrayOutputStream.write(kp2.f(0));
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Exception unused2) {
                    nhh.m("BizRequest", "EventId NumberFormatException. eventId", str, ",eventLogs", map.get(str));
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return byteArray;
    }

    public static byte[] j(Map<String, String> map, boolean z) throws Exception {
        String[] split;
        String[] k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e4adfdeb", new Object[]{map, new Boolean(z)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(kqx.e(d(z)));
        if (map != null && map.size() > 0) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (String str : map.keySet()) {
                try {
                    try {
                        byteArrayOutputStream.write(kqx.f(Integer.valueOf(str).intValue()));
                        String str2 = map.get(str);
                        if (str2 != null) {
                            for (String str3 : str2.split(e)) {
                                if (!TextUtils.isEmpty(str3) && (k = k(str3)) != null && 34 == k.length) {
                                    for (String str4 : k) {
                                        byteArrayOutputStream2.write(kqx.c(str4));
                                    }
                                    byteArrayOutputStream2.write(0);
                                }
                            }
                            byteArrayOutputStream.write(kqx.f(byteArrayOutputStream2.size()));
                            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
                            byteArrayOutputStream2.reset();
                        } else {
                            byteArrayOutputStream.write(0);
                        }
                    } catch (Exception unused) {
                        nhh.m("BizRequest", "EventId NumberFormatException. eventId", str, ",eventLogs", map.get(str));
                    }
                } catch (Throwable unused2) {
                }
            }
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return byteArray;
    }

    public static String l(byte[] bArr, int i2) {
        HashMap<String, String> c2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0cf2b9", new Object[]{bArr, new Integer(i2)});
        }
        if (i2 == 2 || !vnx.b() || (c2 = rhv.b().c()) == null || c2.isEmpty()) {
            return null;
        }
        StringBuilder c3 = iqq.a().c();
        for (Map.Entry<String, String> entry : c2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null || value.isEmpty()) {
                value = "";
            }
            if (z) {
                c3.append(key);
                c3.append("=");
                c3.append(value);
                z = false;
            } else {
                c3.append("&");
                c3.append(key);
                c3.append("=");
                c3.append(value);
            }
        }
        String sb = c3.toString();
        iqq.a().b(c3);
        return sb;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17dd0518", new Object[0]);
            return;
        }
        a();
        g = new ByteArrayOutputStream();
        try {
            f = new GZIPOutputStream((OutputStream) g, true);
        } catch (Exception unused) {
        }
        i = new ByteArrayOutputStream();
        try {
            h = new GZIPOutputStream((OutputStream) i, true);
        } catch (Exception unused2) {
        }
        erx.e().f();
    }

    public static String[] k(String str) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("599ed1c1", new Object[]{str});
        }
        String[] strArr = new String[34];
        int i3 = 0;
        while (true) {
            if (i2 >= 33) {
                break;
            }
            int indexOf = str.indexOf("||", i3);
            if (indexOf == -1) {
                strArr[i2] = str.substring(i3);
                break;
            }
            strArr[i2] = str.substring(i3, indexOf);
            i3 = indexOf + 2;
            i2++;
        }
        strArr[33] = str.substring(i3);
        return strArr;
    }

    public static int n(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28336c31", new Object[]{bArr})).intValue();
        }
        int i2 = -1;
        if (bArr == null || bArr.length < 12) {
            nhh.i("", "recv errCode UNKNOWN_ERROR");
        } else {
            b = bArr.length;
            if (kp2.b(bArr, 1, 3) + 8 != bArr.length) {
                nhh.i("", "recv len error");
            } else {
                boolean z = 1 == (bArr[5] & 1);
                int b2 = kp2.b(bArr, 8, 4);
                int length = bArr.length - 12 >= 0 ? bArr.length - 12 : 0;
                if (length <= 0) {
                    f25326a = null;
                } else if (z) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 12, bArr2, 0, length);
                    byte[] b3 = foa.b(bArr2);
                    f25326a = new String(b3, 0, b3.length);
                } else {
                    f25326a = new String(bArr, 12, length);
                }
                i2 = b2;
            }
        }
        if (107 == i2) {
            o2w.k().U(true);
        }
        if (109 == i2) {
            o2w.k().T(true);
        }
        if (115 == i2) {
            o2w.k().W(true);
        }
        if (116 == i2) {
            o2w.k().N(true);
        }
        if (105 == i2 || 120 == i2) {
            erx.e().d();
        }
        nhh.f("", "errCode", Integer.valueOf(i2));
        return i2;
    }

    public static String d(boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93d606e9", new Object[]{new Boolean(z)});
        }
        String a2 = u51.a();
        Context g2 = o2w.k().g();
        String c2 = o2w.k().c();
        String str3 = "";
        if (c2 == null) {
            c2 = str3;
        }
        Map<String, String> b2 = o1v.b(g2);
        if (b2 == null || (str = b2.get(oeh.APPVERSION)) == null) {
            str = str3;
        }
        String b3 = u51.b();
        if (b3 == null) {
            b3 = str3;
        }
        if (b2 != null) {
            str3 = b2.get(oeh.UTDID);
        }
        String a3 = g0v.b().a();
        if (szt.d().f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        StringBuilder c3 = iqq.a().c();
        if (!o2w.k().K() || mp7.b()) {
            c3.append("ak=");
            c3.append(a2);
            c3.append("&av=");
            c3.append(c2);
            c3.append("&avsys=");
            c3.append(str);
            c3.append("&c=");
            c3.append(b3);
            c3.append("&d=");
            c3.append(str3);
            c3.append("&sv=");
            c3.append(a3);
            c3.append("&ipv6=");
            c3.append(str2);
            c3.append("&ao=a");
        } else {
            c3.append("ak=");
            c3.append(a2);
            c3.append("&av=");
            c3.append(c2);
            c3.append("&avsys=");
            c3.append(str);
            c3.append("&c=");
            c3.append(b3);
            c3.append("&d=");
            c3.append(str3);
            c3.append("&sv=");
            c3.append(a3);
            c3.append("&ipv6=");
            c3.append(str2);
            c3.append("&dk=");
            c3.append(o2w.k().i());
            c3.append("&ao=a");
        }
        if (z) {
            c3.append("&_ut_sample=");
            c3.append(zg4.b().a("ut_sample"));
            c3.append("&_utap_system=");
            c3.append(zg4.b().a("utap_system"));
            c3.append("&_ap_stat=");
            c3.append(zg4.b().a("ap_stat"));
            c3.append("&_ap_alarm=");
            c3.append(zg4.b().a("ap_alarm"));
            c3.append("&_ap_counter=");
            c3.append(zg4.b().a("ap_counter"));
            c3.append("&_ut_bussiness=");
            c3.append(zg4.b().a("ut_bussiness"));
            c3.append("&_ut_realtime=");
            c3.append(zg4.b().a("ut_realtime"));
            if (!o2w.k().H()) {
                c3.append("&_sip=");
                c3.append(qzt.b().d());
                c3.append("&_sipnw=");
                c3.append(qzt.b().c());
                c3.append("&_fo=");
                c3.append(qzt.b().a());
            }
        }
        String sb = c3.toString();
        iqq.a().b(c3);
        nhh.m("PostData", "send url :" + sb);
        return sb;
    }

    public static byte[] e(Map<String, String> map, int i2, boolean z, boolean z2) throws Exception {
        int i3;
        byte b2;
        byte b3;
        byte[] bArr;
        GZIPOutputStream gZIPOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27fe898", new Object[]{map, new Integer(i2), new Boolean(z), new Boolean(z2)});
        }
        if (o2w.k().G() || o2w.k().H()) {
            bArr = foa.a(i(map, z2));
            b3 = 1;
            b2 = 1;
            i3 = 0;
        } else {
            vzt.s();
            byte[] j2 = j(map, z2);
            i3 = j2.length;
            boolean g2 = erx.e().g();
            nhh.f("BizRequest", "isEnableZstd", Boolean.valueOf(g2));
            if (g2) {
                try {
                    erx.e().d.write(j2);
                    erx.e().d.flush();
                    bArr = erx.e().c.toByteArray();
                    erx.e().c.reset();
                    if (z && erx.e().h() && i2 == 1 && (gZIPOutputStream = h) != null) {
                        gZIPOutputStream.write(j2);
                        h.flush();
                        byte[] byteArray = i.toByteArray();
                        i.reset();
                        erx.e().i(i3, byteArray.length, bArr.length);
                    }
                    b3 = 4;
                } catch (Exception unused) {
                    erx.e().c();
                    return null;
                }
            } else {
                GZIPOutputStream gZIPOutputStream2 = f;
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.write(j2);
                    f.flush();
                    bArr = g.toByteArray();
                    g.reset();
                    b3 = 2;
                } else {
                    bArr = foa.a(j2);
                    b3 = 1;
                }
            }
            b2 = 2;
        }
        nhh.f("BizRequest", "compress flags", Byte.valueOf(b3), "version", Byte.valueOf(b2));
        if (bArr == null || bArr.length >= 16777216) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b2);
        byteArrayOutputStream.write(kp2.e(bArr.length));
        byteArrayOutputStream.write(i2);
        byte b4 = (byte) (b3 | 8);
        if (o2w.k().K()) {
            b4 = (byte) (b4 | 16);
        }
        byte b5 = (byte) (b4 | 32);
        byteArrayOutputStream.write(b5);
        byteArrayOutputStream.write(0);
        nhh.f("BizRequest", "request flags", Byte.valueOf(b5));
        if (o2w.k().H()) {
            byteArrayOutputStream.write(0);
        } else {
            String l = l(bArr, i2);
            if (brx.c().d() && i3 > 0 && i3 < 16777216) {
                if (l == null || l.isEmpty()) {
                    l = "_ut_len=" + i3;
                } else {
                    l = l + "&_ut_len=" + i3;
                }
            }
            nhh.f("BizRequest", "options", l);
            if (l == null || l.isEmpty()) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(kqx.f(l.getBytes().length));
                byteArrayOutputStream.write(l.getBytes());
            }
        }
        byteArrayOutputStream.write(bArr);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e2) {
            nhh.h(null, e2, new Object[0]);
        }
        return byteArray2;
    }

    public static void o(long j2) {
        Object c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8664e631", new Object[]{new Long(j2)});
        } else if (j) {
            try {
                Context g2 = o2w.k().g();
                if (g2 != null) {
                    if (!c && d != null) {
                        IpChange ipChange2 = FlowCenter.$ipChange;
                        d = FlowCenter.class;
                        c = true;
                    }
                    Class cls = d;
                    if (!(cls == null || (c2 = ztn.c(cls, "getInstance")) == null)) {
                        nhh.f("", "sendBytes", Long.valueOf(j2), "mReceivedDataLen", Long.valueOf(b));
                        Object[] objArr = {g2, BHRTaskConfigBase.TYPE_CONFIG_UT, Boolean.TRUE, BHRTaskConfigBase.TYPE_CONFIG_UT, Long.valueOf(j2), Long.valueOf(b)};
                        Class cls2 = Long.TYPE;
                        ztn.b(c2, "commitFlow", objArr, Context.class, String.class, Boolean.TYPE, String.class, cls2, cls2);
                    }
                }
            } catch (Throwable unused) {
            }
            b = 0L;
        }
    }
}
