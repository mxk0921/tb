package com.taobao.themis.kernel.metaInfo.manifest;

import android.app.Application;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.Result;
import tb.ckf;
import tb.cvm;
import tb.ges;
import tb.hfn;
import tb.p8s;
import tb.q9s;
import tb.s2i;
import tb.t2i;
import tb.t2o;
import tb.u2i;
import tb.v3i;
import tb.wcs;
import tb.wsq;
import tb.xhv;
import tb.yz3;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppManifestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final AppManifestManager INSTANCE = new AppManifestManager();
    public static final String TAG = "AppManifestManager";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class RequestMode extends Enum<RequestMode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final RequestMode LAUNCH = new RequestMode("LAUNCH", 0);
        public static final RequestMode UPDATE = new RequestMode("UPDATE", 1);
        public static final RequestMode NOCACHE = new RequestMode("NOCACHE", 2);
        private static final /* synthetic */ RequestMode[] $VALUES = $values();

        private static final /* synthetic */ RequestMode[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RequestMode[]) ipChange.ipc$dispatch("eef1312a", new Object[0]) : new RequestMode[]{LAUNCH, UPDATE, NOCACHE};
        }

        private RequestMode(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(RequestMode requestMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/manifest/AppManifestManager$RequestMode");
        }

        public static RequestMode valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("c91773df", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(RequestMode.class, str);
            }
            return (RequestMode) valueOf;
        }

        public static RequestMode[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("2443d2ce", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (RequestMode[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(t2i.c cVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13592a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ RequestMode c;
        public final /* synthetic */ a d;

        public b(String str, JSONObject jSONObject, RequestMode requestMode, a aVar) {
            this.f13592a = str;
            this.b = jSONObject;
            this.c = requestMode;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.d.a(AppManifestManager.INSTANCE.n(this.f13592a, this.b, this.c));
            }
        }
    }

    static {
        t2o.a(839909815);
    }

    public final boolean a(AppManifestDao appManifestDao) {
        AppManifest appManifest;
        Date i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6476057", new Object[]{this, appManifestDao})).booleanValue();
        }
        if (appManifestDao == null) {
            appManifest = null;
        } else {
            appManifest = appManifestDao.getAppManifest();
        }
        if (appManifest == null) {
            return false;
        }
        AppManifest appManifest2 = appManifestDao.getAppManifest();
        ckf.d(appManifest2);
        Cache cache = appManifest2.getCache();
        if (cache == null) {
            return true;
        }
        String expires = cache.getExpires();
        if ((expires != null && (i = INSTANCE.i(expires)) != null && new Date().after(i)) || System.currentTimeMillis() - appManifestDao.getLastRequestTimeStamp() >= cache.getMaxAge() * 1000) {
            return false;
        }
        return true;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31de656a", new Object[]{this});
        } else {
            u2i.INSTANCE.a(yz3.i());
        }
    }

    public final AppManifestDao d(String str, RequestMode requestMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifestDao) ipChange.ipc$dispatch("73b12bbf", new Object[]{this, str, requestMode});
        }
        ckf.g(str, "id");
        ckf.g(requestMode, "requestMode");
        AppManifestDao e = u2i.INSTANCE.e(str);
        e = null;
        if (e == null || !INSTANCE.a(e)) {
        }
        if (e != null && requestMode == RequestMode.LAUNCH) {
            e.setLastUsedTimeStamp(System.currentTimeMillis());
            INSTANCE.p(e);
        }
        return e;
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("486af329", new Object[]{this, str});
        }
        return ckf.p("deprecated_ver_", str);
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc1cfe4b", new Object[]{this, str});
        }
        ckf.g(str, "appId");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        String c = wcs.c(iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext(), e(str), "");
        ckf.f(c, "readString(context, getD…catedCacheKey(appId), \"\")");
        return c;
    }

    public final Map<String, AppManifestDao> g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dda634e2", new Object[]{this, new Integer(i)});
        }
        try {
            List<AppManifestDao> b2 = u2i.INSTANCE.b(System.currentTimeMillis() - (i * 1000));
            if (b2 == null) {
                return null;
            }
            List<AppManifestDao> list = b2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(hfn.c(v3i.e(zz3.q(list, 10)), 16));
            for (Object obj : list) {
                String appId = ((AppManifestDao) obj).getAppId();
                ckf.d(appId);
                linkedHashMap.put(appId, obj);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(kotlin.b.a(th)));
            if (th2 != null) {
                TMSLogger.d("tag", th2);
            }
            return null;
        }
    }

    public final Date i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("92c03a9", new Object[]{this, str});
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return simpleDateFormat.parse(str);
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(kotlin.b.a(th)));
            if (th2 == null) {
                return null;
            }
            TMSLogger.d(TAG, th2);
            return null;
        }
    }

    public final void j(AppManifestDao appManifestDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c340e4c4", new Object[]{this, appManifestDao});
            return;
        }
        ckf.g(appManifestDao, "manifest");
        appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
        p(appManifestDao);
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c3d124", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        u2i.INSTANCE.c(str);
    }

    public final t2i.a l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2i.a) ipChange.ipc$dispatch("f08eab99", new Object[]{this, str});
        }
        ckf.g(str, "url");
        ArrayList arrayList = new ArrayList();
        TMSLogger.a(TAG, ckf.p("request manifest with url: ", str));
        t2i.a a2 = new t2i().a(str);
        if (a2.c() && a2.d() != null) {
            List<AppManifest> d = a2.d();
            ckf.d(d);
            for (AppManifest appManifest : d) {
                AppManifestManager appManifestManager = INSTANCE;
                if (appManifestManager.b(appManifest)) {
                    AppManifest.AppInfo appInfo = appManifest.getAppInfo();
                    ckf.d(appInfo);
                    String appId = appInfo.getAppId();
                    ckf.d(appId);
                    arrayList.add(appId);
                    AppManifestDao appManifestDao = new AppManifestDao();
                    AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
                    ckf.d(appInfo2);
                    appManifestDao.setAppId(appInfo2.getAppId());
                    AppManifest.AppInfo appInfo3 = appManifest.getAppInfo();
                    ckf.d(appInfo3);
                    appManifestDao.setVersion(appInfo3.getVersion());
                    appManifestDao.setAppManifest(appManifest);
                    appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
                    appManifestManager.p(appManifestDao);
                }
            }
        }
        a2.f(arrayList);
        return a2;
    }

    public final void m(String str, JSONObject jSONObject, RequestMode requestMode, a aVar) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22f4ff", new Object[]{this, str, jSONObject, requestMode, aVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(requestMode, "requestMode");
        ckf.g(aVar, "callback");
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) != null) {
            executor.execute(new b(str, jSONObject, requestMode, aVar));
        }
    }

    public final t2i.c n(String str, JSONObject jSONObject, RequestMode requestMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2i.c) ipChange.ipc$dispatch("7917a92b", new Object[]{this, str, jSONObject, requestMode});
        }
        ckf.g(str, "url");
        ckf.g(requestMode, "requestMode");
        TMSLogger.a(TAG, ckf.p("request manifest with url: ", str));
        t2i.c d = new t2i().d(str, jSONObject);
        if (!(!d.e() || d.f() == null || requestMode == RequestMode.NOCACHE)) {
            AppManifest f = d.f();
            AppManifestDao appManifestDao = new AppManifestDao();
            ckf.d(f);
            AppManifest.AppInfo appInfo = f.getAppInfo();
            ckf.d(appInfo);
            appManifestDao.setAppId(appInfo.getAppId());
            AppManifest.AppInfo appInfo2 = f.getAppInfo();
            ckf.d(appInfo2);
            appManifestDao.setVersion(appInfo2.getVersion());
            appManifestDao.setAppManifest(f);
            appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
            if (requestMode == RequestMode.LAUNCH) {
                appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
            }
            p(appManifestDao);
        }
        return d;
    }

    public final t2i.c o(String str, JSONObject jSONObject, RequestMode requestMode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2i.c) ipChange.ipc$dispatch("34744b9e", new Object[]{this, str, jSONObject, requestMode, new Boolean(z)});
        }
        ckf.g(str, "id");
        ckf.g(requestMode, "requestMode");
        TMSLogger.a(TAG, ckf.p("request manifest with id: ", str));
        t2i.c c = new t2i().c(str, jSONObject, z);
        if (c.e() && c.f() != null) {
            AppManifest f = c.f();
            AppManifestDao appManifestDao = new AppManifestDao();
            ckf.d(f);
            AppManifest.AppInfo appInfo = f.getAppInfo();
            ckf.d(appInfo);
            appManifestDao.setAppId(appInfo.getAppId());
            AppManifest.AppInfo appInfo2 = f.getAppInfo();
            ckf.d(appInfo2);
            appManifestDao.setVersion(appInfo2.getVersion());
            appManifestDao.setAppManifest(f);
            appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
            if (requestMode == RequestMode.LAUNCH) {
                appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
            }
            p(appManifestDao);
        }
        return c;
    }

    public final void p(AppManifestDao appManifestDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b49d78", new Object[]{this, appManifestDao});
            return;
        }
        ckf.g(appManifestDao, "manifest");
        u2i.INSTANCE.d(appManifestDao);
    }

    public final void q(String str, String str2) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24e181", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "appId");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService == null) {
            application = null;
        } else {
            application = iEnvironmentService.getApplicationContext();
        }
        if (str2 != null && !wsq.a0(str2)) {
            wcs.i(application, e(str), str2);
        } else if (!wsq.a0(f(str))) {
            wcs.e(application, e(str));
        }
    }

    public final boolean b(AppManifest appManifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd728f2f", new Object[]{this, appManifest})).booleanValue();
        }
        ckf.g(appManifest, "manifest");
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        String str = null;
        String appId = appInfo == null ? null : appInfo.getAppId();
        if (appId != null && !wsq.a0(appId)) {
            AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
            String version = appInfo2 == null ? null : appInfo2.getVersion();
            if (version != null && !wsq.a0(version)) {
                AppManifest.AppInfo appInfo3 = appManifest.getAppInfo();
                if (appInfo3 != null) {
                    str = appInfo3.getName();
                }
                return (str == null || wsq.a0(str) || appManifest.getContainer() == null) ? false : true;
            }
        }
        return false;
    }

    public final AppManifestDao h(ges.a aVar) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifestDao) ipChange.ipc$dispatch("ccdff591", new Object[]{this, aVar});
        }
        if (aVar == null || aVar.l() || !ges.INSTANCE.a(aVar)) {
            return null;
        }
        if (q9s.W0() && (d = aVar.d()) != null && wsq.O(d, "manifest_preset", false, 2, null)) {
            try {
                String queryParameter = Uri.parse(d).getQueryParameter("manifest_preset");
                if (queryParameter != null) {
                    s2i s2iVar = s2i.INSTANCE;
                    String j = aVar.j();
                    ckf.d(j);
                    String d2 = aVar.d();
                    ckf.d(d2);
                    AppManifest a2 = s2iVar.a(new cvm(queryParameter, j, d2));
                    if (a2 != null) {
                        TMSMetaInfoWrapper tMSMetaInfoWrapper = new TMSMetaInfoWrapper(a2, aVar);
                        AppManifestDao appManifestDao = new AppManifestDao();
                        appManifestDao.setAppId(tMSMetaInfoWrapper.b());
                        appManifestDao.setVersion(tMSMetaInfoWrapper.l());
                        appManifestDao.setAppManifest(a2);
                        appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
                        appManifestDao.setLastUsedTimeStamp(System.currentTimeMillis());
                        TMSLogger.f(TAG, ckf.p("loadLocalManifest success, preset: ", queryParameter));
                        return appManifestDao;
                    }
                    Result.m1108constructorimpl(xhv.INSTANCE);
                }
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
        String j2 = aVar.j();
        if (j2 == null) {
            return null;
        }
        return INSTANCE.d(j2, RequestMode.LAUNCH);
    }
}
