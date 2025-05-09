package tb;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.performance.CartWeexPerformance;
import com.taobao.android.icart.weex.prefetch.ColdStartPrefetch;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import com.taobao.zcache.Error;
import com.taobao.zcache.ResourceResponse;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.Pair;
import tb.c9x;
import tb.m9u;
import tb.n8v;
import tb.ne3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class gd4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gd4 INSTANCE = new gd4();

    /* renamed from: a  reason: collision with root package name */
    public static final op6 f19908a = new op6(Globals.getApplication());

    static {
        t2o.a(478150917);
    }

    public final jt2 a(CartWeexPerformance cartWeexPerformance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jt2) ipChange.ipc$dispatch("ae2c30f3", new Object[]{this, cartWeexPerformance});
        }
        ckf.g(cartWeexPerformance, "performance");
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#getCacheBean");
        jt2 jt2Var = new jt2(null, null, null, 7, null);
        jt2Var.d(d(cartWeexPerformance));
        aVar.b("Cart#getCacheBean");
        Pair<String, byte[]> g = g(cartWeexPerformance);
        jt2Var.f(g.getFirst());
        jt2Var.e(g.getSecond());
        return jt2Var;
    }

    public final void b(n8v.c<byte[]> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea35ae", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "callback");
        f19908a.c(false, cVar);
    }

    public final JSONObject c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4906e0c", new Object[]{this});
        }
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#getFirstCacheResult");
        JSONObject jSONObject = new JSONObject();
        byte[] j = f19908a.j();
        if (j != null) {
            if (j.length == 0) {
                z = true;
            }
            if (!z) {
                jSONObject.put((JSONObject) "firstCacheResult", new String(j, uj3.UTF_8));
            }
        }
        aVar.b("Cart#getFirstCacheResult");
        return jSONObject;
    }

    public final JSONObject d(CartWeexPerformance cartWeexPerformance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68685a28", new Object[]{this, cartWeexPerformance});
        }
        cartWeexPerformance.k(System.currentTimeMillis());
        JSONObject e = ColdStartPrefetch.INSTANCE.e();
        if (e.isEmpty()) {
            e = INSTANCE.c();
        }
        cartWeexPerformance.j(System.currentTimeMillis());
        cartWeexPerformance.s(e.containsKey("firstCacheResult"));
        return e;
    }

    public final byte[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("758eac88", new Object[]{this});
        }
        String a2 = c9x.Companion.a();
        if (a2 != null && a2.length() > 0) {
            return null;
        }
        try {
            if (!OrangeUtil.INSTANCE.isLoadRawFile()) {
                return null;
            }
            try {
                m9u.a aVar = m9u.Companion;
                aVar.a("Cart#getRawfile");
                Application application = Globals.getApplication();
                ckf.f(application, "Globals.getApplication()");
                InputStream proxy_open = AssetsDelegate.proxy_open(application.getAssets(), "cart.wlm");
                int available = proxy_open.available();
                if (available == 0) {
                    hav.d(c9x.TAG, "获取内置资源失败，size=0");
                    aVar.b("Cart#getRawfile");
                    return null;
                }
                byte[] bArr = new byte[available];
                proxy_open.read(bArr);
                proxy_open.close();
                aVar.b("Cart#getRawfile");
                return bArr;
            } catch (Exception e) {
                hav.a(c9x.TAG, "getRawFile error msg=" + e.getMessage());
                ne3.c.b(ne3.Companion, "GetRawFileError", e, 0.0f, 4, null);
                m9u.Companion.b("Cart#getRawfile");
                return null;
            }
        } catch (Throwable th) {
            m9u.Companion.b("Cart#getRawfile");
            throw th;
        }
    }

    public final byte[] f(String str) {
        Error error;
        Error error2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("79d4f88e", new Object[]{this, str});
        }
        c9x.a aVar = c9x.Companion;
        String a2 = aVar.a();
        if (a2 != null && a2.length() > 0) {
            return null;
        }
        if (yox.g() == null) {
            hav.d(c9x.TAG, "getZCache context is null");
            ne3.c cVar = ne3.Companion;
            ne3.c.e(cVar, "GetZCacheErrorNoContext", "instanceName=" + str + ",ZCache获取的时候，context为空", 0.0f, 4, null);
            return null;
        }
        m9u.a aVar2 = m9u.Companion;
        aVar2.a("Cart#getZCache");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HttpRequest.HEADER_ACCEPT, "application/vnd.weex.v21,application/vnd.weex.v20");
        ResourceResponse h = yox.h(new y8o(aVar.b(), linkedHashMap));
        if (h == null || h.getError() != null) {
            ne3.c cVar2 = ne3.Companion;
            StringBuilder sb = new StringBuilder("获取zcache失败，instanceName=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append((h == null || (error2 = h.getError()) == null) ? null : Integer.valueOf(error2.getCode()));
            sb.append(", errorMessage=");
            sb.append((h == null || (error = h.getError()) == null) ? null : error.getMessage());
            ne3.c.e(cVar2, "GetZCacheError", sb.toString(), 0.0f, 4, null);
            aVar2.b("Cart#getZCache");
            return null;
        }
        byte[] data = h.getData();
        aVar2.b("Cart#getZCache");
        return data;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e35ece", new Object[]{this, str});
            return;
        }
        ckf.g(str, "data");
        op6 op6Var = f19908a;
        byte[] bytes = str.getBytes(uj3.UTF_8);
        ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
        op6Var.a(bytes);
    }

    public final Pair<String, byte[]> g(CartWeexPerformance cartWeexPerformance) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("111cbd67", new Object[]{this, cartWeexPerformance});
        }
        cartWeexPerformance.O(System.currentTimeMillis());
        byte[] f = f(cartWeexPerformance.c());
        cartWeexPerformance.N(System.currentTimeMillis());
        if (f != null) {
            if (!(f.length == 0)) {
                hav.d(c9x.TAG, "获取ZCache资源成功");
                cartWeexPerformance.u(true);
                str = "zcache";
                return new Pair<>(str, f);
            }
        }
        cartWeexPerformance.C(System.currentTimeMillis());
        f = e();
        cartWeexPerformance.B(System.currentTimeMillis());
        if (f != null) {
            if (!(f.length == 0)) {
                hav.d(c9x.TAG, "未获取到ZCache，走内置资源,instanceName=" + cartWeexPerformance.c());
                str = "rawfile";
                cartWeexPerformance.u(false);
                return new Pair<>(str, f);
            }
        }
        str = "none";
        cartWeexPerformance.u(false);
        return new Pair<>(str, f);
    }
}
