package tb;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.analytics.core.config.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import tb.rsf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final j1v f21706a = new j1v();

    static {
        t2o.a(962593163);
    }

    public static j1v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j1v) ipChange.ipc$dispatch("38de9374", new Object[0]);
        }
        return f21706a;
    }

    public final String a(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8879faed", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return str + hashCode;
    }

    public final void b(Map<String, String> map, Object obj, String str, String str2, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770831a8", new Object[]{this, map, obj, str, str2, map2});
            return;
        }
        try {
            v0v eventByKey = y0v.getInstance().getEventByKey(y0v.getInstance().getKeyForObject(obj));
            eventByKey.setEventId(2001);
            eventByKey.setContext(obj);
            eventByKey.setPageName(str);
            eventByKey.setArg1(str2);
            eventByKey.updateProperties(map2);
            eventByKey.setH5Pv(true);
            y0v.getInstance().beginEvent(eventByKey);
            map.put(v0v.TAG_UTEVENT, "1");
        } catch (Exception unused) {
        }
    }

    public final boolean c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec99602", new Object[]{this, map})).booleanValue();
        }
        if (map == null || !"1".equals(map.get("_ut_update_spm"))) {
            return false;
        }
        nhh.f("UTHybridHelper", "_ut_update_spm=1");
        return true;
    }

    public final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b001ce8", new Object[]{this, str, str2});
        }
        if (str != null && !hsq.f(str)) {
            return str;
        }
        if (hsq.f(str2)) {
            return "";
        }
        int indexOf = str2.indexOf("?");
        if (indexOf == -1) {
            return str2;
        }
        return str2.substring(0, indexOf);
    }

    public final Map<String, String> e(Object obj, Map<String, String> map, String str, String str2, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ecb0aabc", new Object[]{this, obj, map, str, str2, map2});
        }
        return f(obj, map, str, str2, map2, true);
    }

    public final Map<String, String> g(Object obj, Map<String, String> map, String str, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be194346", new Object[]{this, obj, map, str, map2});
        }
        return f(obj, map, str, "", map2, false);
    }

    public final Map<String, String> j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3547e76", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("logkeyargs");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("_lka", str);
        String str3 = map.get("cna");
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("_cna", str3);
        String str4 = map.get("extendargs");
        if (str4 != null) {
            str2 = str4;
        }
        hashMap.put("_h5ea", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    public final Map<String, String> k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66df5928", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("extendargs");
        if (str == null) {
            str = "";
        }
        hashMap.put("_h5ea", str);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    public final Map<String, String> o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9648f64c", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("url");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("_h5url", str);
        String str3 = map.get("extendargs");
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("_h5ea", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    public void setH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().setH5Url(str);
        }
    }

    public final Map<String, String> n(Map<String, String> map) {
        Map<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa2093d2", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("url");
        String str2 = "";
        hashMap.put("_h5url", str == null ? str2 : str);
        if (str != null) {
            try {
                int indexOf = str.indexOf(63);
                if (indexOf > 0 && (b = rsf.a.b(str.substring(0, indexOf), Uri.parse(str))) != null) {
                    hashMap.putAll(b);
                }
            } catch (Throwable unused) {
            }
        }
        if (str != null) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("spm");
            if (queryParameter == null || hsq.f(queryParameter)) {
                hashMap.put("spm", "0.0.0.0");
            } else {
                hashMap.put("spm", queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("scm");
            if (queryParameter2 != null && !hsq.f(queryParameter2)) {
                hashMap.put("scm", queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("pg1stepk");
            if (queryParameter3 != null && !hsq.f(queryParameter3)) {
                hashMap.put("pg1stepk", queryParameter3);
            }
            if (!hsq.f(parse.getQueryParameter("point"))) {
                hashMap.put("issb", "1");
            }
        } else {
            hashMap.put("spm", "0.0.0.0");
        }
        String str3 = map.get("spmcnt");
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("_spmcnt", str3);
        String str4 = map.get("spmpre");
        if (str4 == null) {
            str4 = str2;
        }
        hashMap.put("_spmpre", str4);
        String str5 = map.get("lzsid");
        if (str5 == null) {
            str5 = str2;
        }
        hashMap.put("_lzsid", str5);
        String str6 = map.get("extendargs");
        if (str6 == null) {
            str6 = str2;
        }
        hashMap.put("_h5ea", str6);
        String str7 = map.get("cna");
        if (str7 != null) {
            str2 = str7;
        }
        hashMap.put("_cna", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    public final void h(String str, Date date, Map<String, String> map) {
        int i;
        Map<String, String> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9023efb", new Object[]{this, str, date, map});
            return;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
            i = -1;
        }
        if (i != -1 && map != null && map.size() != 0) {
            String d = d(map.get("urlpagename"), map.get("url"));
            if (d == null || hsq.f(d)) {
                nhh.m("h5Ctrl", "pageName is null,return");
                return;
            }
            String str2 = map.get("logkey");
            if (str2 == null || hsq.f(str2)) {
                nhh.m("h5Ctrl", "logkey is null,return");
                return;
            }
            String str3 = map.get("utjstype");
            map.remove("utjstype");
            if (str3 == null || str3.equals("0")) {
                j = j(map);
            } else {
                j = str3.equals("1") ? k(map) : null;
            }
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(d, i, str2, null, null, j);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(uTOriginalCustomHitBuilder.build());
            } else {
                nhh.i("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
            }
        }
    }

    public final void i(Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccbef84", new Object[]{this, map});
        } else if (map != null && map.size() != 0) {
            try {
                i = Integer.parseInt(map.remove("funcId"));
            } catch (Throwable unused) {
                i = -1;
            }
            if (i != -1) {
                String remove = map.remove("url");
                if (remove == null || hsq.f(remove)) {
                    nhh.m("h5Ctrl", "pageName is null,return");
                    return;
                }
                String remove2 = map.remove("logkey");
                if (remove2 == null || hsq.f(remove2)) {
                    nhh.m("h5Ctrl", "logkey is null,return");
                    return;
                }
                UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(remove, i, remove2, null, null, map);
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (defaultTracker != null) {
                    defaultTracker.send(uTOriginalCustomHitBuilder.build());
                } else {
                    nhh.i("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
                }
            }
        }
    }

    public void h5UT(Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80970fce", new Object[]{this, map, obj});
            return;
        }
        if (nhh.n()) {
            nhh.f("UTHybridHelper", "h5UT view", obj, "dataMap", map);
        }
        if (map == null || map.size() == 0) {
            nhh.i("UTHybridHelper", "h5UT dataMap is empty");
            return;
        }
        String str = map.get("functype");
        if (str == null) {
            nhh.i("UTHybridHelper", "h5UT funcType is null");
            return;
        }
        String str2 = map.get("utjstype");
        if (str2 == null || str2.equals("0") || str2.equals("1")) {
            map.remove("functype");
            Date date = new Date();
            if (str.equals("2001")) {
                l(date, map, obj);
                g3v.getInstance().dispatchH5JSCall(obj, map);
                return;
            }
            h(str, date, map);
            return;
        }
        nhh.i("UTHybridHelper", "h5UT utjstype should be 1 or 0 or null");
    }

    public void h5UT2(Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab906ab4", new Object[]{this, map, obj});
            return;
        }
        if (nhh.n()) {
            nhh.f("UTHybridHelper", "h5UT2 view", obj, "dataMap", map);
        }
        if (map == null || map.size() == 0) {
            nhh.i("h5UT", "dataMap is empty");
            return;
        }
        String remove = map.remove("functype");
        if (remove == null) {
            nhh.i("h5UT", "funcType is null");
        } else if (remove.equals("page")) {
            map.remove("funcId");
            m(map, obj);
            g3v.getInstance().dispatchH5JSCall(obj, map);
        } else if (remove.equals("ctrl")) {
            i(map);
        }
    }

    public final void m(Map<String, String> map, Object obj) {
        Map<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455ceb84", new Object[]{this, map, obj});
            return;
        }
        nhh.d();
        if (map == null || map.size() == 0) {
            nhh.m("h5Page2", "dataMap is null or empty,return");
            return;
        }
        String remove = map.remove("url");
        if (remove == null || hsq.f(remove)) {
            nhh.m("h5Page2", "pageName is null,return");
            return;
        }
        String refPage = u4v.getInstance().getRefPage();
        int i = c2v.getInstance().isH52001(obj) ? 2001 : 2006;
        HashMap hashMap = new HashMap(map);
        HashMap hashMap2 = new HashMap();
        if (2001 == i) {
            u4v.getInstance().setRefPage(remove);
            Map<String, String> nextPageProperties = c2v.getInstance().getNextPageProperties(obj);
            if (nextPageProperties != null && nextPageProperties.size() > 0) {
                hashMap.putAll(nextPageProperties);
            }
            Map<String, String> nextPageTmpProperties = c2v.getInstance().getNextPageTmpProperties(obj);
            if (nextPageTmpProperties != null && nextPageTmpProperties.size() > 0) {
                hashMap2.putAll(nextPageTmpProperties);
            }
            if ((obj instanceof Activity) && (e = e(obj, map, remove, map.get("_h5url"), nextPageProperties)) != null) {
                hashMap.putAll(e);
            }
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(remove, i, refPage, null, null, hashMap);
        uTOriginalCustomHitBuilder.setTmpProperties(hashMap2);
        try {
            String j = a.i().j(Uri.parse(map.get("_h5url")), null);
            if (!hsq.f(j)) {
                uTOriginalCustomHitBuilder.setProperty("_tpk", j);
            }
        } catch (Throwable th) {
            nhh.h(null, th, new Object[0]);
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null) {
            Map<String, String> build = uTOriginalCustomHitBuilder.build();
            if (i == 2001) {
                e2v.pushNode(obj, build);
                b(build, obj, remove, refPage, hashMap);
            }
            defaultTracker.send(l2v.processH5PagePvid(i, build));
        } else {
            nhh.i("h5Page event error", "Fatal Error,must call setRequestAuthentication method first.");
        }
        c2v.getInstance().setH5Called(obj);
    }

    public final void l(Date date, Map<String, String> map, Object obj) {
        Map<String, String> map2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a834673d", new Object[]{this, date, map, obj});
            return;
        }
        nhh.d();
        if (map != null && map.size() != 0) {
            String str = map.get("url");
            String d = d(map.get("urlpagename"), str);
            if (d == null || hsq.f(d)) {
                nhh.i("h5Page", "pageName is null,return");
                return;
            }
            String str2 = map.get("utjstype");
            map.remove("utjstype");
            if (str2 == null || str2.equals("0")) {
                map2 = n(map);
            } else {
                map2 = str2.equals("1") ? o(map) : null;
            }
            int i2 = c2v.getInstance().isH52001(obj) ? 2001 : 2006;
            String refPage = u4v.getInstance().getRefPage();
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(d, i2, refPage, null, null, map2);
            if (2001 == i2) {
                u4v.getInstance().setRefPage(d);
                Map<String, String> nextPageProperties = c2v.getInstance().getNextPageProperties(obj);
                if (nextPageProperties != null && nextPageProperties.size() > 0) {
                    uTOriginalCustomHitBuilder.setProperties(nextPageProperties);
                }
                Map<String, String> nextPageTmpProperties = c2v.getInstance().getNextPageTmpProperties(obj);
                if (nextPageTmpProperties != null && nextPageTmpProperties.size() > 0) {
                    uTOriginalCustomHitBuilder.setTmpProperties(nextPageTmpProperties);
                }
                if (obj instanceof Activity) {
                    uTOriginalCustomHitBuilder.setProperties(g(obj, map, str, nextPageProperties));
                }
            }
            try {
                String j = a.i().j(Uri.parse(str), null);
                if (!hsq.f(j)) {
                    uTOriginalCustomHitBuilder.setProperty("_tpk", j);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                Map<String, String> build = uTOriginalCustomHitBuilder.build();
                if (i2 == 2001) {
                    e2v.pushNode(obj, build);
                    i = i2;
                    b(build, obj, d, refPage, map2);
                } else {
                    i = i2;
                }
                defaultTracker.send(l2v.processH5PagePvid(i, build));
            } else {
                nhh.i("h5Page event error", "Fatal Error,must call setRequestAuthentication method first.");
            }
            c2v.getInstance().setH5Called(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> f(java.lang.Object r28, java.util.Map<java.lang.String, java.lang.String> r29, java.lang.String r30, java.lang.String r31, java.util.Map<java.lang.String, java.lang.String> r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j1v.f(java.lang.Object, java.util.Map, java.lang.String, java.lang.String, java.util.Map, boolean):java.util.Map");
    }
}
