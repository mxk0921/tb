package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import tb.eas;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t2i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String ERR_CONNECT_FAILED = "TMS_ERR_MT_CONNECT_FAILED";
    public static final String TAG = "ManifestRequestClient";
    public static final String TMS_MT_ERR = "TMS_ERR_MT";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        static {
            t2o.a(839909834);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(839909832);
    }

    public final c c(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("86435e05", new Object[]{this, str, jSONObject, new Boolean(z)});
        }
        ckf.g(str, "uniAppId");
        return b(ges.g(ges.INSTANCE, str, z, false, 4, null), jSONObject);
    }

    public final c d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4ee651e5", new Object[]{this, str, jSONObject});
        }
        ckf.g(str, "manifestUrl");
        return b(str, jSONObject);
    }

    public final a a(String str) {
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f7d03095", new Object[]{this, str});
        }
        ckf.g(str, "manifestUrl");
        ITransportAdapter iTransportAdapter = (ITransportAdapter) p8s.b(ITransportAdapter.class);
        if (iTransportAdapter == null) {
            TMSLogger.b(TAG, "sendRequest, httpService is null");
            return new a(TMS_MT_ERR, "httpService is null");
        }
        gcn a2 = gcn.m().f(str).b(new LinkedHashMap()).c("GET").d(null).a();
        ckf.f(a2, "newBuilder()\n           …ull)\n            .build()");
        try {
            hcn a3 = ITransportAdapter.a.a(iTransportAdapter, a2, null, 2, null);
            if (a3 == null) {
                return new a(TMS_MT_ERR, "response is null");
            }
            if (a3.c() == -205) {
                lcs.Companion.a().add(Integer.valueOf(a3.c()));
            }
            int c2 = a3.c();
            if (c2 == -1) {
                return new a(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, Integer.valueOf(a3.c())), ERR_CONNECT_FAILED);
            }
            if (200 > c2 || c2 >= 300) {
                return new a(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, Integer.valueOf(a3.c())), ckf.p("errorCode is ", Integer.valueOf(a3.c())));
            }
            i8b i8bVar = i8b.INSTANCE;
            Map<String, String> b2 = i8bVar.b(a3);
            InputStream b3 = a3.b();
            ckf.f(b3, "response.resStream");
            String f = i8bVar.f(b3, b2.get("Content-Type"));
            long currentTimeMillis = System.currentTimeMillis();
            List parseArray = JSON.parseArray(f, AppManifest.class);
            if (parseArray == null) {
                return new a("TMS_ERR_MT_FORMAT", "Manifest返回数据格式错误，无法正常解析");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("manifestParseStart", String.valueOf(currentTimeMillis));
            linkedHashMap.put("manifestParseEnd", String.valueOf(currentTimeMillis2));
            return new a(parseArray, b2, linkedHashMap);
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(kotlin.b.a(th)));
            if (th2 == null) {
                return new a(TMS_MT_ERR, "unknown error");
            }
            TMSLogger.c(TAG, "request with exception", th2);
            String message = th2.getMessage();
            if (message != null) {
                str2 = message;
            }
            return new a(TMS_MT_ERR, str2);
        }
    }

    public final c b(String str, JSONObject jSONObject) {
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("377df246", new Object[]{this, str, jSONObject});
        }
        ITransportAdapter iTransportAdapter = (ITransportAdapter) p8s.b(ITransportAdapter.class);
        if (iTransportAdapter == null) {
            TMSLogger.b(TAG, "sendRequest, httpService is null");
            return new c(TMS_MT_ERR, "httpService is null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("accept", "application/tms-manifest+json");
        String str3 = null;
        gcn a2 = gcn.m().f(str).b(linkedHashMap).c("GET").d(null).a();
        ckf.f(a2, "newBuilder()\n           …ull)\n            .build()");
        try {
            hcn a3 = ITransportAdapter.a.a(iTransportAdapter, a2, null, 2, null);
            if (a3 == null) {
                return new c(TMS_MT_ERR, "response is null");
            }
            if (a3.c() == -205) {
                lcs.Companion.a().add(Integer.valueOf(a3.c()));
            }
            int c2 = a3.c();
            if (c2 == -1) {
                return new c(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, Integer.valueOf(a3.c())), ERR_CONNECT_FAILED);
            }
            if (200 > c2 || c2 >= 300) {
                return new c(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, Integer.valueOf(a3.c())), ckf.p("errorCode is ", Integer.valueOf(a3.c())));
            }
            i8b i8bVar = i8b.INSTANCE;
            Map<String, String> b2 = i8bVar.b(a3);
            InputStream b3 = a3.b();
            ckf.f(b3, "response.resStream");
            String f = i8bVar.f(b3, b2.get("Content-Type"));
            long currentTimeMillis = System.currentTimeMillis();
            AppManifest appManifest = (AppManifest) JSON.parseObject(f, AppManifest.class);
            if (appManifest == null) {
                return new c("TMS_ERR_MT_FORMAT", "Manifest返回数据格式错误，无法正常解析");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("manifestParseStart", String.valueOf(currentTimeMillis));
            linkedHashMap2.put("manifestParseEnd", String.valueOf(currentTimeMillis2));
            AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
            if (!appManifestManager.b(appManifest)) {
                return new c(ckf.p(eas.a.TMS_ERR_MANIFEST_PREFIX, Integer.valueOf(a3.c())), ckf.p("manifest result is invalid! originData is ", f));
            }
            String str4 = b2.get("x-deprecated-versions");
            AppManifest.AppInfo appInfo = appManifest.getAppInfo();
            if (appInfo != null) {
                str3 = appInfo.getAppId();
            }
            if (str3 != null && q9s.INSTANCE.Q1()) {
                AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
                ckf.d(appInfo2);
                String appId = appInfo2.getAppId();
                ckf.d(appId);
                appManifestManager.q(appId, str4);
            }
            return new c(appManifest, b2, linkedHashMap2);
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(kotlin.b.a(th)));
            if (th2 == null) {
                return new c(str2, str2);
            }
            TMSLogger.c(TAG, "request with exception", th2);
            String message = th2.getMessage();
            if (message != null) {
                str2 = message;
            }
            return new c(TMS_MT_ERR, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28429a = false;
        public final List<AppManifest> b;
        public List<String> c;
        public final Map<String, String> d;
        public final Map<String, String> e;
        public final String f;
        public final String g;

        static {
            t2o.a(839909833);
        }

        public a(List<AppManifest> list, Map<String, String> map, Map<String, String> map2) {
            ckf.g(list, "successData");
            ckf.g(map, "headers");
            ckf.g(map2, "extraParam");
            this.b = list;
            this.e = map;
            this.d = map2;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
            }
            return this.g;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
            }
            return this.f;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8e2b51d8", new Object[]{this})).booleanValue();
            }
            return this.f28429a;
        }

        public final List<AppManifest> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("51c04069", new Object[]{this});
            }
            return this.b;
        }

        public final List<String> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1d0f4e41", new Object[]{this});
            }
            return this.c;
        }

        public final void f(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d11c1ab", new Object[]{this, list});
            } else {
                this.c = list;
            }
        }

        public a(String str, String str2) {
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            this.f = str2;
            this.g = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28430a = true;
        public final AppManifest b;
        public final Map<String, String> c;
        public final Map<String, String> d;
        public final String e;
        public final String f;

        static {
            t2o.a(839909835);
        }

        public c(AppManifest appManifest, Map<String, String> map, Map<String, String> map2) {
            ckf.g(appManifest, "successData");
            ckf.g(map, "headers");
            ckf.g(map2, "extraParam");
            this.b = appManifest;
            this.d = map;
            this.c = map2;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
            }
            return this.f;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
            }
            return this.e;
        }

        public final Map<String, String> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2992260f", new Object[]{this});
            }
            return this.c;
        }

        public final Map<String, String> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
            }
            return this.d;
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8e2b51d8", new Object[]{this})).booleanValue();
            }
            return this.f28430a;
        }

        public final AppManifest f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppManifest) ipChange.ipc$dispatch("ed54d037", new Object[]{this});
            }
            return this.b;
        }

        public c(String str, String str2) {
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            this.e = str2;
            this.f = str;
        }
    }
}
