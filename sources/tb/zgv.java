package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.DataPrefetch;
import com.taobao.themis.uniapp.solution.extension.instance.MTOPPrefetchExtension;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cqc;
import tb.ges;
import tb.xgv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zgv INSTANCE = new zgv();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, ygv> f32764a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, pzh> b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, MTOPPrefetchExtension> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, r2i> d = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements xgv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32765a;

        public a(String str) {
            this.f32765a = str;
        }

        @Override // tb.xgv.a
        public void a(ygv ygvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65eed106", new Object[]{this, ygvVar});
                return;
            }
            ckf.g(ygvVar, "loadInfo");
            zgv.a().put(this.f32765a, ygvVar);
        }

        @Override // tb.xgv.a
        public void b(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ccf1979", new Object[]{this, new Integer(i), map});
            }
        }

        @Override // tb.xgv.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba473049", new Object[]{this});
            } else {
                xgv.a.C1100a.a(this);
            }
        }

        @Override // tb.xgv.a
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // tb.xgv.a
        public void onResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
            } else {
                xgv.a.C1100a.b(this, i, map);
            }
        }
    }

    static {
        t2o.a(848298037);
    }

    public static final /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("c24a64b8", new Object[0]);
        }
        return f32764a;
    }

    public final MTOPPrefetchExtension b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTOPPrefetchExtension) ipChange.ipc$dispatch("8790af13", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return c.remove(str);
    }

    public final ygv c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ygv) ipChange.ipc$dispatch("a603e027", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return f32764a.remove(str);
    }

    public final pzh d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzh) ipChange.ipc$dispatch("e36feb68", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return b.remove(str);
    }

    public final r2i e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2i) ipChange.ipc$dispatch("8f6b3d29", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return d.remove(str);
    }

    public final void i(ges.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0ecf3", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "baseInfo");
        if (!q9s.T0() || !h8s.l(yaa.n, "enableUniAppNavPrefetchABV3", "[0,99],[-1,-1]").d()) {
            return;
        }
        if (((!aVar.l() && !aVar.m()) || aVar.b()) && !aVar.g()) {
            r2i r2iVar = new r2i();
            r2iVar.e(aVar);
            String d2 = mcs.d(mcs.GLOBAL_EVENT_ROOT_ID);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "navUrl", aVar.d());
            jSONObject.put((JSONObject) "manifestUrl", aVar.c());
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_GLOBAL_PRELOAD, "START_MANIFEST_PREFETCH", mcs.GLOBAL_EVENT_ROOT_ID, d2, jSONObject);
            ConcurrentHashMap<String, r2i> concurrentHashMap = d;
            String d3 = aVar.d();
            ckf.d(d3);
            concurrentHashMap.put(d3, r2iVar);
        }
    }

    public final void f(ges.a aVar, TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        AppManifest r;
        AppManifest.Container container;
        AppManifest.Performance performance;
        List<DataPrefetch> dataPrefetch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb643ef7", new Object[]{this, aVar, tMSMetaInfoWrapper});
            return;
        }
        ckf.g(aVar, "baseInfo");
        ckf.g(tMSMetaInfoWrapper, "metaInfo");
        if (q9s.T0() && h8s.l(yaa.n, "enableUniAppNavPrefetchABV3", "[0,99],[-1,-1]").d() && (r = tMSMetaInfoWrapper.r()) != null && (container = r.getContainer()) != null && (performance = container.getPerformance()) != null && (dataPrefetch = performance.getDataPrefetch()) != null && (!dataPrefetch.isEmpty()) && aVar.e() != null && aVar.d() != null) {
            MTOPPrefetchExtension mTOPPrefetchExtension = new MTOPPrefetchExtension();
            ConcurrentHashMap<String, MTOPPrefetchExtension> concurrentHashMap = c;
            String d2 = aVar.d();
            ckf.d(d2);
            concurrentHashMap.put(d2, mTOPPrefetchExtension);
            String d3 = mcs.d(mcs.GLOBAL_EVENT_ROOT_ID);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "navUrl", aVar.d());
            jSONObject.put((JSONObject) pl4.KEY_PAGE_ID, aVar.e());
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_GLOBAL_PRELOAD, "START_DATA_PREFETCH", mcs.GLOBAL_EVENT_ROOT_ID, d3, jSONObject);
            String e = aVar.e();
            ckf.d(e);
            String d4 = aVar.d();
            ckf.d(d4);
            mTOPPrefetchExtension.W(tMSMetaInfoWrapper, e, d4);
        }
    }

    public final void g(ges.a aVar, TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158bc641", new Object[]{this, aVar, tMSMetaInfoWrapper});
            return;
        }
        ckf.g(aVar, "baseInfo");
        ckf.g(tMSMetaInfoWrapper, "metaInfo");
        if (q9s.v2() && h8s.l(yaa.n, "enableUniAppNavPrefetchABV2", "[0,99],[-1,-1]").d() && aVar.j() != null && aVar.d() != null) {
            String d2 = aVar.d();
            ckf.d(d2);
            ges gesVar = ges.INSTANCE;
            AppManifest.Page h = gesVar.h(aVar, tMSMetaInfoWrapper);
            if (h != null) {
                if (ckf.b(h.getRenderer(), "web") || q9s.z1()) {
                    Uri parse = Uri.parse(d2);
                    ckf.f(parse, "parse(navUrl)");
                    Uri parse2 = Uri.parse(h.getUrl());
                    ckf.f(parse2, "parse(pageInfo.url)");
                    if (gesVar.e(parse, parse2) && (c2 = ges.c(h.getUrl(), aVar.f(), null, null, 12, null)) != null) {
                        String version = h.getVersion();
                        String renderer = h.getRenderer();
                        String d3 = mcs.d(mcs.GLOBAL_EVENT_ROOT_ID);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "navUrl", aVar.d());
                        jSONObject.put((JSONObject) "prefetchMode", "doMainDocumentPrefetchV1");
                        xhv xhvVar = xhv.INSTANCE;
                        mcs.e(mcs.MODULE_GLOBAL_PRELOAD, "START_MAIN_DOCUMENT_PREFETCH", mcs.GLOBAL_EVENT_ROOT_ID, d3, jSONObject);
                        xgv xgvVar = new xgv();
                        AppManifest r = tMSMetaInfoWrapper.r();
                        xgv.m(xgvVar, c2, version, null, renderer, true, r == null ? false : r.getPreset(), null, new a(d2), 68, null);
                    }
                }
            }
        }
    }

    public final void h(ges.a aVar, TMSMetaInfoWrapper tMSMetaInfoWrapper, boolean z) {
        String str;
        String str2;
        String str3;
        AppManifest r;
        String c2;
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92342717", new Object[]{this, aVar, tMSMetaInfoWrapper, new Boolean(z)});
            return;
        }
        ckf.g(aVar, "baseInfo");
        if (h8s.l(yaa.n, "enableUniAppNavPrefetchABV3", "[0,99],[-1,-1]").d() && aVar.j() != null && aVar.d() != null) {
            String d2 = aVar.d();
            ckf.d(d2);
            String h = aVar.h();
            if (tMSMetaInfoWrapper != null) {
                ges gesVar = ges.INSTANCE;
                AppManifest.Page h2 = gesVar.h(aVar, tMSMetaInfoWrapper);
                if (h2 != null) {
                    Uri parse = Uri.parse(d2);
                    ckf.f(parse, "parse(navUrl)");
                    Uri parse2 = Uri.parse(h2.getUrl());
                    ckf.f(parse2, "parse(pageInfo.url)");
                    if (gesVar.e(parse, parse2) && (c2 = ges.c(h2.getUrl(), aVar.f(), null, null, 12, null)) != null) {
                        str = h2.getVersion();
                        str2 = c2;
                        str3 = h2.getRenderer();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                str = null;
                str2 = d2;
                str3 = h;
            }
            String d3 = mcs.d(mcs.GLOBAL_EVENT_ROOT_ID);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "prefetchMode", "doMainDocumentPrefetchV2");
            jSONObject.put((JSONObject) "navUrl", aVar.d());
            if (tMSMetaInfoWrapper == null) {
                z2 = false;
            }
            jSONObject.put((JSONObject) "hasManifest", (String) Boolean.valueOf(z2));
            jSONObject.put((JSONObject) "documentUrl", str2);
            jSONObject.put((JSONObject) "documentVersion", str);
            jSONObject.put((JSONObject) "renderer", str3);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_GLOBAL_PRELOAD, "START_MAIN_DOCUMENT_PREFETCH", mcs.GLOBAL_EVENT_ROOT_ID, d3, jSONObject);
            pzh pzhVar = new pzh();
            if (!(tMSMetaInfoWrapper == null || (r = tMSMetaInfoWrapper.r()) == null)) {
                z3 = r.getPreset();
            }
            cqc.a.b(pzhVar, str2, str, str3, Boolean.valueOf(z3), null, Boolean.valueOf(z), 16, null);
            b.put(d2, pzhVar);
        }
    }
}
