package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.performance.UmbrellaProcessTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final UMLinkLogInterface f = hdv.a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f32286a = new HashMap();
    public long b = 0;
    public final Map<String, Long> c = new ConcurrentHashMap();
    public Long d = 0L;
    public Long e = 0L;

    static {
        t2o.a(764412004);
    }

    public static void j(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d82946", new Object[]{str, str2, str3, th, objArr});
        } else {
            a("", "", str3, str, str2, th, null, objArr);
        }
    }

    public static void k(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f3cc7", new Object[]{str, str2, str3, objArr});
        } else {
            a("", "", str3, str, str2, null, null, objArr);
        }
    }

    public static Map<String, Object> q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72fc7512", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (!(map == null || map.keySet() == null)) {
            for (String str : map.keySet()) {
                hashMap.put(str, map.get(str));
            }
        }
        return hashMap;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba59fcda", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            UmbrellaProcessTracker.register("Shop");
        }
    }

    public void d(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e980d33", new Object[]{this, str, str2, str3, th, objArr});
        } else {
            a("", "", str3, str, str2, th, this.f32286a, objArr);
        }
    }

    public void e(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d361eba", new Object[]{this, str, str2, str3, objArr});
        } else {
            a("", "", str3, str, str2, null, this.f32286a, objArr);
        }
    }

    public void f(String str, String str2, String str3, String str4, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b75eea5", new Object[]{this, str, str2, str3, str4, objArr});
        } else {
            a(str, str2, str3, "1.0", str4, null, this.f32286a, objArr);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6b8b", new Object[]{this, str, str2});
        } else {
            f.logInfo("page_shop", "", fdv.F_PAGE_RENDER, null, null, cyu.a(str, str2));
        }
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b4274a", new Object[]{this, str, str2});
        } else {
            i(str, "1.0", str2);
        }
    }

    public void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9dd294", new Object[]{this, str, str2, str3});
        } else {
            f.commitSuccess(str3, str, str2, "page_shop", "", this.f32286a);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            UmbrellaProcessTracker.addArgs("Shop", "mBundleUrl", str);
            ((HashMap) this.f32286a).put("mBundleUrl", str);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0548f7", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            UmbrellaProcessTracker.addArgs("Shop", "mParamForLog", str);
            ((HashMap) this.f32286a).put("mParamForLog", str);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c240b2", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            UmbrellaProcessTracker.addArgs("Shop", "mParamUUIDForLog", str);
            ((HashMap) this.f32286a).put("mParamUUIDForLog", str);
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            UmbrellaProcessTracker.addArgs("Shop", "shopId", str);
            ((HashMap) this.f32286a).put("shopId", str);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4536a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            UmbrellaProcessTracker.addArgs("Shop", "mShopNaviForLog", str);
            ((HashMap) this.f32286a).put("mShopNaviForLog", str);
        }
    }

    public void r(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00a58a8", new Object[]{this, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ("router".equals(str)) {
            gdv gdvVar = gdv.INIT;
            UmbrellaProcessTracker.addProcess("Shop", gdvVar, j);
            UmbrellaProcessTracker.addSubProcess("Shop", gdvVar, "router", j);
        } else if ("activityOnCreate".equals(str)) {
            gdv gdvVar2 = gdv.LIFECYCLE;
            UmbrellaProcessTracker.addProcess("Shop", gdvVar2, j);
            UmbrellaProcessTracker.addSubProcess("Shop", gdvVar2, "onCreate", j);
        } else if ("activityOnResume".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", gdv.LIFECYCLE, "onResume", j);
        } else if ("dataPrefetch".equals(str)) {
            gdv gdvVar3 = gdv.DATAPARSE;
            UmbrellaProcessTracker.addProcess("Shop", gdvVar3, j);
            UmbrellaProcessTracker.addSubProcess("Shop", gdvVar3, "dataPrefetch", j);
        } else if ("frameJSLoad".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", gdv.NETWORK, "frameJSLoad", j);
        } else if ("innerJSLoad".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", gdv.NETWORK, "innerJSLoad", j);
        } else if ("render".equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", gdv.DRAWVIEW, j);
        } else if ("frameJSRender".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", gdv.SUB_CREATE_VIEW, "frameJSRender", j);
        } else if ("innerJSRender".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", gdv.SUB_CREATE_VIEW, "innerJSRender", j);
        } else if ("preVistCdn-downgrade".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preVistCdn-downgrade", j);
        } else if ("preVistCdn-pagedata".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preVistCdn-pagedata", j);
        } else if ("preloadFetchImage".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preloadFetchImage", j);
        } else if ("preloadPagedataImage".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preloadPagedataImage", j);
        } else if ("pageLoad".equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", gdv.PAGELOAD, j);
            UmbrellaProcessTracker.commit("Shop");
        }
        this.b += System.currentTimeMillis() - currentTimeMillis;
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184c2928", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        ((ConcurrentHashMap) this.c).put(str, Long.valueOf(currentTimeMillis2));
        if (("frameJSRender".equals(str) || "innerJSRender".equals(str)) && 0 == this.d.longValue()) {
            this.d = Long.valueOf(currentTimeMillis2);
        }
        this.b += System.currentTimeMillis() - currentTimeMillis;
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1fc621", new Object[]{this, str});
        } else if (((ConcurrentHashMap) this.c).get(str) == null) {
            new StringBuilder("main-cost not pair metric finded. ").append(str);
            e("-67001", "not pair metric finded.", fdv.F_PAGE_RENDER, str);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            r(str, currentTimeMillis2 - ((Long) ((ConcurrentHashMap) this.c).get(str)).longValue());
            if ("frameJSRender".equals(str) || "innerJSRender".equals(str)) {
                if (0 == this.e.longValue() || 0 == this.d.longValue()) {
                    this.e = Long.valueOf(currentTimeMillis2);
                } else {
                    r("render", currentTimeMillis2 - this.d.longValue());
                }
            }
            this.b += System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Throwable th, Map<String, String> map, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b52872b", new Object[]{str, str2, str3, str4, str5, th, map, objArr});
            return;
        }
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            StringBuilder sb = new StringBuilder();
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb.append(obj);
                    sb.append(" | ");
                    if (WXEnvironment.isApkDebugable()) {
                        sb.append("\n");
                    }
                }
            }
            hashMap.put("extra", sb.toString());
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (th != null) {
            hashMap.put("throwable", opp.h(th));
        }
        f.commitFailure(str5, str3, str4, "page_shop", "", hashMap, str, str2);
    }
}
