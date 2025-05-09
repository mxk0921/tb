package tb;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.twh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mox {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> c;
    public static final mox d = new mox();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f24195a = new HashMap();
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24196a;
        public final /* synthetic */ yko b;
        public final /* synthetic */ b c;

        public a(String str, yko ykoVar, b bVar) {
            this.f24196a = str;
            this.b = ykoVar;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c cVar = (c) mox.a(mox.this).remove(this.f24196a);
            c4p l = this.b.l();
            l.A("XslPreloadManager", "Error prepare timeout: " + this.f24196a);
            b bVar = this.c;
            if (bVar != null) {
                ((twh.a) bVar).c();
            }
            if (cVar != null) {
                if (this.b.g().isDebug()) {
                    c4p l2 = this.b.l();
                    l2.z("XSL请求提前: 超时, pageName: " + cVar.f24197a.getTrackingPageName());
                }
                nox.f(this.f24196a, cVar.f24197a.getTrackingPageName());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public final XslDatasource f24197a;
        public b b;
        public final String c;
        public final String d;
        public final Map<String, String> e;
        public final Map<String, String> f;
        public Runnable g;

        static {
            t2o.a(993002023);
        }

        public c(mox moxVar, XslDatasource xslDatasource, String str, String str2, Map<String, String> map, Map<String, String> map2) {
            this.f24197a = xslDatasource;
            this.c = str;
            this.d = str2;
            this.e = new HashMap(map);
            this.f = new HashMap(map2);
        }
    }

    public static /* synthetic */ Map a(mox moxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18ba2af2", new Object[]{moxVar});
        }
        return moxVar.f24195a;
    }

    public static mox e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mox) ipChange.ipc$dispatch("684e64ca", new Object[0]);
        }
        return d;
    }

    public final void b(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a01ac7", new Object[]{this, map, map2, map3});
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (!((HashSet) c).contains(key)) {
                String str = map.get(key);
                if (!TextUtils.isEmpty(entry.getValue())) {
                    if (TextUtils.isEmpty(str)) {
                        map3.put(entry.getKey(), "miss");
                    } else if (!TextUtils.equals(str, entry.getValue())) {
                        map3.put(entry.getKey(), "diff");
                    }
                }
            }
        }
    }

    public XslDatasource c(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("eb3ae078", new Object[]{this, str, str2, str3, map, map2});
        }
        yko d2 = d();
        if (d2 == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                String f = f(str);
                c cVar = (c) ((HashMap) this.f24195a).get(f);
                if (cVar == null) {
                    c4p l = d2.l();
                    l.b("XslPreloadManager", "Error extract not exist: " + f);
                    if (d2.g().isDebug()) {
                        c4p l2 = d2.l();
                        l2.z("XSL请求提前: 没有触发提前请求: " + f);
                    }
                    nox.b(f, "");
                    return null;
                }
                ((HashMap) this.f24195a).remove(f);
                this.b.removeCallbacks(cVar.g);
                nox.e(f, cVar.f24197a.getTrackingPageName());
                Map<String, String> g = g(cVar, str2, str3, map, map2);
                if (!g.isEmpty()) {
                    c4p l3 = d2.l();
                    l3.A("XslPreloadManager", "Error extract param diff: " + g);
                    if (d2.g().isDebug()) {
                        c4p l4 = d2.l();
                        l4.z("XSL请求提前: 参数错误\n" + g);
                    }
                    b bVar = cVar.b;
                    if (bVar != null) {
                        ((twh.a) bVar).b();
                    }
                    nox.a(f, cVar.f24197a.getTrackingPageName(), JSON.toJSONString(g));
                    c4p.C("[XS.xsl]", "Preload failed, params not matched, preload params: %s\n\tjs params: %s", cVar.f, map2);
                    return null;
                }
                c4p.D("[XS.xsl]", "Preload success, preload params: %s\n\tjs params: %s", cVar.f, map2);
                c4p l5 = d2.l();
                l5.b("XslPreloadManager", "Extract Succ: " + f);
                b bVar2 = cVar.b;
                if (bVar2 != null) {
                    ((twh.a) bVar2).a();
                }
                nox.c(f, cVar.f24197a.getTrackingPageName());
                if (d2.g().isDebug()) {
                    d2.l().z("XSL请求提前: 成功");
                }
                return cVar.f24197a;
            }
            d2.l().g("XslPreloadManager", "Error extract args: %s, %s, %s", str, str2, str3);
            return null;
        } catch (Exception e) {
            d2.l().e("XslPreloadManager", "extract err", e);
            return null;
        }
    }

    public final yko d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        return XslModule.H();
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59b5d4b3", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public Map<String, String> g(c cVar, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("418eaf3c", new Object[]{this, cVar, str, str2, map, map2});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.equals(str, cVar.c)) {
            hashMap.put("mtopApi", "diff");
        }
        if (!TextUtils.equals(str2, cVar.d)) {
            hashMap.put("mtopVersion", "diff");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        b(cVar.e, map, hashMap);
        b(cVar.f, map2, hashMap);
        return hashMap;
    }

    static {
        t2o.a(993002020);
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("page");
        hashSet.add("sversion");
        hashSet.add("utd_id");
        hashSet.add("ttid");
    }

    public boolean h(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb10b363", new Object[]{this, str, str2, str3, map, map2, bVar, new Boolean(z)})).booleanValue();
        }
        yko d2 = d();
        if (d2 == null) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if (!(map == null || map2 == null)) {
                    String f = f(str);
                    if (((HashMap) this.f24195a).containsKey(f)) {
                        nox.d(f, "");
                        d2.l().A("XslPreloadManager", "Error prepare duplicate");
                        return false;
                    }
                    if (c4p.i().j()) {
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(map);
                        hashMap.put("params", map2);
                        c4p.D("[XS.xsl]", "Preload started, url: %s\n\tparams: %s", str, hashMap);
                    }
                    XslDatasource f2 = XslModule.f(null, true);
                    f2.setFlatParams(z);
                    f2.setApi(str2, str3);
                    f2.setParams(map);
                    f2.addBizParam(map2);
                    f2.doNewSearch();
                    f2.setTrackingName("mus_xsearchlist");
                    f2.setBundleUrl(str);
                    c cVar = new c(this, f2, str2, str3, map, map2);
                    a aVar = new a(f, d2, bVar);
                    cVar.g = aVar;
                    cVar.b = bVar;
                    ((HashMap) this.f24195a).put(f, cVar);
                    this.b.postDelayed(aVar, 30000L);
                    c4p l = d2.l();
                    l.b("XslPreloadManager", "Prepare Succ: " + f);
                    return true;
                }
                d2.l().d("XslPreloadManager", "Error prepare args, mtopParams == null");
                return false;
            }
            d2.l().g("XslPreloadManager", "Error prepare args: %s, %s, %s", str, str2, str3);
            return false;
        } catch (Exception e) {
            d2.l().e("XslPreloadManager", "prepare err", e);
            return false;
        }
    }
}
