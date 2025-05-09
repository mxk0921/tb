package com.alibaba.analytics.core.logbuilder;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.AnalyticsImp;
import com.alibaba.analytics.core.logbuilder.GoogleAdvertisingIdClient;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import tb.b1v;
import tb.c1v;
import tb.d79;
import tb.g0v;
import tb.gi7;
import tb.hsq;
import tb.iqq;
import tb.lut;
import tb.nhh;
import tb.o1v;
import tb.o2w;
import tb.oeh;
import tb.p9n;
import tb.pg1;
import tb.q1v;
import tb.t2o;
import tb.th7;
import tb.u51;
import tb.v6o;
import tb.vep;
import tb.ydh;
import tb.zj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f2123a = Pattern.compile("^[\\d]{1,}$");

    static {
        t2o.a(962592892);
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcd914", new Object[]{map});
        }
        return b(map, false);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a26ef51d", new Object[]{str});
        }
        if (hsq.f(str)) {
            return "-";
        }
        return str;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ac9876", new Object[]{str})).booleanValue();
        }
        try {
            return f2123a.matcher(str).find(0);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void f(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398656d8", new Object[]{str, map, map2});
        } else if (!map.containsKey(str) && map2.get(str) != null) {
            map.put(str, map2.get(str));
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5516caaf", new Object[]{str});
        }
        long j = 0;
        if (str != null && !str.isEmpty()) {
            for (char c : str.toCharArray()) {
                j = (j * 31) + c;
            }
        }
        return String.valueOf(Math.abs(j));
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e61751b", new Object[]{str})).booleanValue();
        }
        return "19998".equalsIgnoreCase(str);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b75718", new Object[]{str})).booleanValue();
        }
        if ("65501".equalsIgnoreCase(str) || "65502".equalsIgnoreCase(str) || "65503".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static void j(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c25f58", new Object[]{map, map2});
            return;
        }
        map.put(oeh.BRAND, map2.get(oeh.BRAND));
        map.put(oeh.DEVICE_MODEL, map2.get(oeh.DEVICE_MODEL));
        map.put(oeh.RESOLUTION, map2.get(oeh.RESOLUTION));
        map.put(oeh.OS, map2.get(oeh.OS));
        map.put(oeh.OSVERSION, map2.get(oeh.OSVERSION));
        map.put(oeh.UTDID, map2.get(oeh.UTDID));
        f("IMEI", map, map2);
        f("IMSI", map, map2);
        f(oeh.APPVERSION, map, map2);
        f(oeh.DEVICE_ID, map, map2);
        f(oeh.LANGUAGE, map, map2);
        f(oeh.ACCESS, map, map2);
        f(oeh.ACCESS_SUBTYPE, map, map2);
        f(oeh.CARRIER, map, map2);
    }

    public static void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1029e94", new Object[]{map});
            return;
        }
        try {
            List<String> d = c1v.e().d(map.get(oeh.EVENTID));
            if (d != null) {
                for (String str : d) {
                    map.remove(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean l(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58665374", new Object[]{map, str})).booleanValue();
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2) || str2.length() <= 40960) {
            return false;
        }
        nhh.i("LogAssemble truncLog", "field", str, pg1.ATOM_length, Integer.valueOf(str2.length()));
        map.put(str, str2.substring(0, 40960));
        return true;
    }

    public static String c(Map<String, String> map, boolean z, String str) {
        boolean z2;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4b18fe0", new Object[]{map, new Boolean(z), str});
        }
        Map<String, String> b = d79.b(map);
        boolean l = l(b, oeh.ARG1);
        if (l(b, oeh.ARG2) || l) {
        }
        l(b, oeh.ARG3);
        StringBuilder c = iqq.a().c();
        String[] strArr = oeh.LogField;
        int length = strArr.length;
        int i = 0;
        while (true) {
            String str4 = null;
            if (i >= length) {
                break;
            }
            String str5 = strArr[i];
            if (str5.equalsIgnoreCase(oeh.ARGS)) {
                break;
            }
            if (b.containsKey(str5)) {
                str4 = hsq.c(b.get(str5));
                b.remove(str5);
            }
            c.append(d(str4));
            c.append("||");
            i++;
        }
        StringBuilder c2 = iqq.a().c();
        if (hsq.h(str)) {
            c2.append(str);
            z2 = false;
        } else {
            z2 = true;
        }
        if (b.containsKey(zj4.UT_GLOBAL_ARGS)) {
            if (!z2) {
                c2.append(",");
            }
            c2.append(b.remove(zj4.UT_GLOBAL_ARGS));
            z2 = false;
        }
        String remove = b.remove(zj4.UT_TMP_ARGS);
        try {
            List<String> importantProperties = UTTracker.getImportantProperties();
            if (importantProperties != null && importantProperties.size() > 1) {
                for (String str6 : importantProperties) {
                    String c3 = hsq.c(b.get(str6));
                    if (hsq.h(c3)) {
                        if (!z2) {
                            c2.append(",");
                        }
                        c2.append(d(str6));
                        c2.append("=");
                        c2.append(d(c3));
                        z2 = false;
                    }
                    b.remove(str6);
                }
            }
        } catch (Throwable unused) {
        }
        if (b.containsKey(oeh.ARGS)) {
            String c4 = hsq.c(b.get(oeh.ARGS));
            if (z2) {
                c2.append(d(c4));
            } else {
                c2.append(",");
                c2.append(d(c4));
            }
            b.remove(oeh.ARGS);
            z2 = false;
        }
        for (String str7 : b.keySet()) {
            String c5 = b.containsKey(str7) ? hsq.c(b.get(str7)) : null;
            if (z2) {
                if ("StackTrace".equals(str7)) {
                    c2.append("StackTrace=====>");
                    c2.append(c5);
                } else {
                    c2.append(d(str7));
                    c2.append("=");
                    c2.append(c5);
                }
                z2 = false;
            } else if ("StackTrace".equals(str7)) {
                c2.append(",");
                c2.append("StackTrace=====>");
                c2.append(c5);
            } else {
                c2.append(",");
                c2.append(d(str7));
                c2.append("=");
                c2.append(c5);
            }
        }
        if (!hsq.f(remove)) {
            if (z2) {
                c2.append(zj4.UT_TMP_ARGS_SPLIT);
                c2.append(",");
                c2.append(remove);
            } else {
                c2.append(",");
                c2.append(zj4.UT_TMP_ARGS_SPLIT);
                c2.append(",");
                c2.append(remove);
            }
        }
        int length2 = c2.length();
        if (length2 < 1) {
            str2 = "-";
        } else if (length2 > 40960) {
            String str8 = map.get(oeh.EVENTID);
            if (i(str8)) {
                if (length2 > 409600) {
                    nhh.i("LogAssemble", "truncLog field", oeh.ARGS, pg1.ATOM_length, Integer.valueOf(length2));
                    str2 = c2.substring(0, 409600);
                } else {
                    str2 = c2.toString();
                }
            } else if (!h(str8)) {
                int d = q1v.c().d();
                if (length2 > d) {
                    nhh.i("LogAssemble", "truncLog maxLen", Integer.valueOf(d), "field", oeh.ARGS, pg1.ATOM_length, Integer.valueOf(length2));
                    str2 = c2.substring(0, d);
                } else {
                    str2 = c2.toString();
                }
            } else if (length2 > 245760) {
                nhh.i("LogAssemble", "truncLog field", oeh.ARGS, pg1.ATOM_length, Integer.valueOf(length2));
                str2 = c2.substring(0, 245760);
            } else {
                str2 = c2.toString();
            }
        } else {
            str2 = c2.toString();
        }
        iqq.a().b(c2);
        c.append(str2);
        if (z) {
            p9n.d(c);
            str3 = c.toString();
        } else {
            str3 = c.toString();
        }
        iqq.a().b(c);
        return str3;
    }

    public static String b(Map<String, String> map, boolean z) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3708c18", new Object[]{map, new Boolean(z)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null && map.size() > 0) {
            Context g = o2w.k().g();
            if (g == null && AnalyticsImp.getApplication() != null) {
                g = AnalyticsImp.getApplication().getApplicationContext();
            }
            if (g == null) {
                return null;
            }
            gi7 c = th7.c(g);
            if (c != null) {
                str = c.b();
                str2 = c.c();
            } else {
                str2 = null;
                str = null;
            }
            if (str != null && str2 != null && map.get("IMEI") == null && map.get("IMSI") == null) {
                map.put("IMEI", str);
                map.put("IMSI", str2);
            }
            if (!hsq.f(o2w.k().x())) {
                map.put(oeh.USERNICK, o2w.k().x());
            }
            if (!hsq.f(o2w.k().l())) {
                map.put(oeh.LL_USERNICK, o2w.k().l());
            }
            if (b1v.bUserIdIsCharacters) {
                StringBuilder c2 = iqq.a().c();
                String w = o2w.k().w();
                if (!hsq.f(w)) {
                    if (e(w)) {
                        map.put("USERID", w);
                    } else {
                        map.put("USERID", g(w));
                        c2.append("_original_uid=");
                        c2.append(w);
                    }
                }
                String n = o2w.k().n();
                if (!hsq.f(n)) {
                    if (e(n)) {
                        map.put(oeh.LL_USERID, n);
                    } else {
                        map.put(oeh.LL_USERID, g(n));
                        if (c2.length() > 1) {
                            c2.append(",");
                        }
                        c2.append("_original_luid=");
                        c2.append(n);
                    }
                }
                str3 = c2.toString();
                iqq.a().b(c2);
            } else {
                if (!hsq.f(o2w.k().w())) {
                    map.put("USERID", o2w.k().w());
                }
                if (!hsq.f(o2w.k().n())) {
                    map.put(oeh.LL_USERID, o2w.k().n());
                }
                str3 = "";
            }
            if (!map.containsKey(oeh.SDKVERSION)) {
                map.put(oeh.SDKVERSION, g0v.b().a());
            }
            if (!map.containsKey("APPKEY")) {
                map.put("APPKEY", o2w.k().d());
            }
            if (!hsq.f(o2w.k().e())) {
                map.put(oeh.CHANNEL, o2w.k().e());
            }
            if (!hsq.f(o2w.k().c())) {
                map.put(oeh.APPVERSION, o2w.k().c());
            }
            if (map.containsKey(oeh.RECORD_TIMESTAMP)) {
                map.put(oeh.RECORD_TIMESTAMP, lut.m().l(map.get(oeh.RECORD_TIMESTAMP)));
            } else {
                map.put(oeh.RECORD_TIMESTAMP, lut.m().k());
            }
            if (!map.containsKey(oeh.START_SESSION_TIMESTAMP)) {
                map.put(oeh.START_SESSION_TIMESTAMP, vep.a().c());
            }
            if (!map.containsKey(oeh.SDKTYPE)) {
                map.put(oeh.SDKTYPE, zj4.a());
            }
            map.put(oeh.RESERVE5, v6o.c(g));
            Map<String, String> b = o1v.b(g);
            if (b != null) {
                j(map, b);
                if (map.containsKey(oeh.ALIYUN_PLATFORM_FLAG)) {
                    map.put(oeh.OS, "y");
                }
                String str4 = map.get(oeh.RESERVES);
                StringBuilder c3 = iqq.a().c();
                if (!hsq.f(str4)) {
                    c3.append(str4);
                }
                if (NetworkUtil.j(g)) {
                    if (c3.length() > 0) {
                        c3.append(",_spt5g=1");
                    } else {
                        c3.append("_spt5g=1");
                    }
                } else if (c3.length() > 0) {
                    c3.append(",_spt5g=0");
                } else {
                    c3.append("_spt5g=0");
                }
                GoogleAdvertisingIdClient.b a2 = GoogleAdvertisingIdClient.a();
                if (a2 != null) {
                    if (!a2.b()) {
                        if (c3.length() > 0) {
                            c3.append(",_glat=0");
                        } else {
                            c3.append("_glat=0");
                        }
                        String a3 = a2.a();
                        if (!TextUtils.isEmpty(a3)) {
                            if (c3.length() > 0) {
                                c3.append(",gps_adid=");
                                c3.append(a3);
                            } else {
                                c3.append("gps_adid=");
                                c3.append(a3);
                            }
                        }
                    } else if (c3.length() > 0) {
                        c3.append(",_glat=1");
                    } else {
                        c3.append("_glat=1");
                    }
                }
                String str5 = map.get(oeh.DEVICE_ID);
                if (str5 != null) {
                    if (c3.length() > 0) {
                        c3.append(",_did=");
                        c3.append(str5);
                    } else {
                        c3.append("_did=");
                        c3.append(str5);
                    }
                    map.remove(oeh.DEVICE_ID);
                }
                String d = ydh.d(g);
                if (d != null) {
                    if (map.containsKey(oeh.UTDID) && d.equals(map.get(oeh.UTDID))) {
                        d = "utdid";
                    }
                    if (c3.length() > 0) {
                        c3.append(",_umid=");
                        c3.append(d);
                    } else {
                        c3.append("_umid=");
                        c3.append(d);
                    }
                }
                if (o2w.k().F()) {
                    String p = o2w.k().p();
                    if (!TextUtils.isEmpty(p)) {
                        if (c3.length() > 0) {
                            c3.append(",_buildid=");
                            c3.append(p);
                        } else {
                            c3.append("_buildid=");
                            c3.append(p);
                        }
                    }
                }
                String str6 = "0";
                if (c3.length() > 0) {
                    c3.append(",_timeAdjust=");
                    c3.append(lut.m().h() ? "1" : str6);
                } else {
                    c3.append("_timeAdjust=");
                    c3.append(lut.m().h() ? "1" : str6);
                }
                String str7 = map.get("APPKEY");
                String d2 = o2w.k().d();
                if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(d2) && !d2.equalsIgnoreCase(str7)) {
                    if (c3.length() > 0) {
                        c3.append(",_mak=");
                        c3.append(d2);
                    } else {
                        c3.append("_mak=");
                        c3.append(d2);
                    }
                }
                if (b1v.bGetPhoneType) {
                    if (o1v.e(o2w.k().g())) {
                        str6 = "1";
                    }
                    if (c3.length() > 0) {
                        c3.append(",_pad=");
                        c3.append(str6);
                    } else {
                        c3.append("_pad=");
                        c3.append(str6);
                    }
                }
                String c4 = u51.c(g);
                if (!TextUtils.isEmpty(c4)) {
                    if (c3.length() > 0) {
                        c3.append(",_channel2=");
                        c3.append(c4);
                    } else {
                        c3.append("_channel2=");
                        c3.append(c4);
                    }
                }
                String o = o2w.k().o();
                if (!hsq.f(o)) {
                    if (c3.length() > 0) {
                        c3.append(",_openid=");
                        c3.append(o);
                    } else {
                        c3.append("_openid=");
                        c3.append(o);
                    }
                }
                String str8 = map.get(oeh.UTPVID_T);
                if (!TextUtils.isEmpty(str8)) {
                    if (c3.length() > 0) {
                        c3.append(",_t=");
                        c3.append(str8);
                    } else {
                        c3.append("_t=");
                        c3.append(str8);
                    }
                    map.remove(oeh.UTPVID_T);
                }
                String v = o2w.k().v();
                if (!TextUtils.isEmpty(v)) {
                    if (c3.length() > 0) {
                        c3.append(",_ut_site=");
                        c3.append(v);
                    } else {
                        c3.append("_ut_site=");
                        c3.append(v);
                    }
                }
                String m = o2w.k().m();
                if (!TextUtils.isEmpty(m)) {
                    if (c3.length() > 0) {
                        c3.append(",_ut_lsite=");
                        c3.append(m);
                    } else {
                        c3.append("_ut_lsite=");
                        c3.append(m);
                    }
                }
                String s = o2w.k().s();
                if (!hsq.f(s)) {
                    if (c3.length() > 0) {
                        c3.append(",");
                        c3.append(s);
                    } else {
                        c3.append(s);
                    }
                }
                map.put(oeh.RESERVES, c3.toString());
                iqq.a().b(c3);
                k(map);
                String c5 = c(map, z, str3);
                if (nhh.n()) {
                    nhh.f("LogAssemble", "assemble cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                return c5;
            }
        }
        return null;
    }
}
