package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IWeexAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.ResourceResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ahv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ahv INSTANCE = new ahv();
    public static final String TAG = "UniAppZCacheListener";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements PackUpdateFinishedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.zcache.PackUpdateFinishedCallback
        public final void finish(String str, Error error) {
            Object obj;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abd8ffc9", new Object[]{this, str, error});
            } else if (error == null) {
                try {
                    ckf.f(str, "packName");
                    String G0 = wsq.G0(str, "uniapp-", "");
                    str2 = null;
                    if (wsq.a0(G0)) {
                        G0 = null;
                    }
                    if (G0 != null) {
                        String I0 = wsq.I0(G0, "weex-", null, 2, null);
                        if (!wsq.a0(I0)) {
                            str2 = I0;
                        }
                    }
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(b.a(th));
                }
                if (str2 != null) {
                    ahv.b(ahv.INSTANCE, str2);
                    obj = Result.m1108constructorimpl(xhv.INSTANCE);
                    Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                    if (th2 != null) {
                        TMSLogger.d(ahv.TAG, th2);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15752a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(String str, String str2, String str3) {
            this.f15752a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            String str;
            ResourceResponse h;
            Integer num;
            Error error;
            Error error2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str2 = this.f15752a;
            String str3 = this.b;
            String str4 = this.c;
            try {
                String N3 = q9s.INSTANCE.N3();
                str = null;
                if (wsq.a0(N3)) {
                    N3 = null;
                }
                if (N3 == null) {
                    N3 = ges.INSTANCE.p(str2);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "url", N3);
                xhv xhvVar = xhv.INSTANCE;
                mcs.e(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "START_UPDATE", str3, str4, jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                IWeexAdapter iWeexAdapter = (IWeexAdapter) p8s.b(IWeexAdapter.class);
                linkedHashMap.put(HttpRequest.HEADER_ACCEPT, ckf.p("application/json,", iWeexAdapter == null ? null : iWeexAdapter.getHttpAcceptHeader()));
                h = yox.h(new y8o(N3, linkedHashMap));
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            if (h != null && h.getError() == null) {
                byte[] data = h.getData();
                ckf.f(data, "response.data");
                AppManifest appManifest = (AppManifest) JSON.parseObject(new String(data, uj3.UTF_8), AppManifest.class);
                if (appManifest == null) {
                    IpChange ipChange2 = ahv.$ipChange;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "error", "parse manifest failed");
                    mcs.c(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "UPDATE_FAIL", str3, str4, jSONObject2);
                    return;
                }
                AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                if (!appManifestManager.b(appManifest)) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) "error", "manifest is not valid");
                    mcs.c(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "UPDATE_FAIL", str3, str4, jSONObject3);
                    return;
                }
                if (ahv.a(ahv.INSTANCE, appManifest)) {
                    AppManifestDao appManifestDao = new AppManifestDao();
                    AppManifest.AppInfo appInfo = appManifest.getAppInfo();
                    ckf.d(appInfo);
                    appManifestDao.setAppId(appInfo.getAppId());
                    AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
                    ckf.d(appInfo2);
                    appManifestDao.setVersion(appInfo2.getVersion());
                    appManifestDao.setAppManifest(appManifest);
                    appManifestDao.setLastRequestTimeStamp(System.currentTimeMillis());
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put((JSONObject) "manifest", (String) appManifest);
                    mcs.c(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "UPDATE_SUCCESS", str3, str4, jSONObject4);
                    appManifestManager.p(appManifestDao);
                } else {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put((JSONObject) "error", "the version not need save");
                    mcs.f(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "UPDATE_FAIL", str3, str4, jSONObject5);
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    TMSLogger.d(ahv.TAG, th2);
                    return;
                }
                return;
            }
            JSONObject jSONObject6 = new JSONObject();
            StringBuilder sb = new StringBuilder("ZCacheError: errorCode:[");
            if (!(h == null || (error2 = h.getError()) == null)) {
                num = Integer.valueOf(error2.getCode());
                sb.append(num);
                sb.append("],errorMsg:[");
                if (h != null && (error = h.getError()) != null) {
                    str = error.getMessage();
                }
                sb.append((Object) str);
                sb.append(']');
                jSONObject6.put((JSONObject) "error", sb.toString());
                mcs.c(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "UPDATE_FAIL", str3, str4, jSONObject6);
            }
            num = null;
            sb.append(num);
            sb.append("],errorMsg:[");
            if (h != null) {
                str = error.getMessage();
            }
            sb.append((Object) str);
            sb.append(']');
            jSONObject6.put((JSONObject) "error", sb.toString());
            mcs.c(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, "UPDATE_FAIL", str3, str4, jSONObject6);
        }
    }

    static {
        t2o.a(839909923);
    }

    public static final /* synthetic */ boolean a(ahv ahvVar, AppManifest appManifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c418f3", new Object[]{ahvVar, appManifest})).booleanValue();
        }
        return ahvVar.c(appManifest);
    }

    public static final /* synthetic */ void b(ahv ahvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46c130b", new Object[]{ahvVar, str});
        } else {
            ahvVar.e(str);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            yox.s("uniapp-*", a.INSTANCE);
        }
    }

    public final void e(String str) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471ee6bb", new Object[]{this, str});
        } else if (q9s.INSTANCE.A2()) {
            String d = mcs.d(mcs.GLOBAL_EVENT_ROOT_ID);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "appId", str);
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(mcs.MODULE_GLOBAL_MANIFEST_UPDATE, mcs.EVENT_ON_LISTEN, mcs.GLOBAL_EVENT_ROOT_ID, d, jSONObject);
            String d2 = mcs.d(d);
            TMSLogger.a(TAG, "try updateManifestFromZCache appId[" + str + ']');
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.MANIFEST)) != null) {
                executor.execute(new c(str, d, d2));
            }
        }
    }

    public final boolean c(AppManifest appManifest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7939fa5", new Object[]{this, appManifest})).booleanValue();
        }
        AppManifest.AppInfo appInfo = appManifest.getAppInfo();
        String str = null;
        String version = appInfo == null ? null : appInfo.getVersion();
        if (version == null) {
            return false;
        }
        AppManifest.AppInfo appInfo2 = appManifest.getAppInfo();
        if (appInfo2 != null) {
            str = appInfo2.getAppId();
        }
        if (str == null) {
            return false;
        }
        AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
        List z0 = wsq.z0(appManifestManager.f(str), new String[]{","}, false, 0, 6, null);
        if (z0.contains(version)) {
            TMSLogger.b(TAG, "version[" + version + "] hit deprecatedVersion[" + z0 + "], skip save");
            return false;
        }
        AppManifestDao d = appManifestManager.d(str, AppManifestManager.RequestMode.UPDATE);
        if (d == null) {
            return true;
        }
        if (o9s.b(version, d.getVersion()) == 0) {
            appManifestManager.j(d);
        }
        return o9s.b(version, d.getVersion()) > 0;
    }
}
