package tb;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.preload.ManifestPushInfo;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import tb.t2i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o2u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final o2u INSTANCE = new o2u();
    public static final String TAG = "TopAppManifestListener";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public final void a(Map<String, String> map) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("943a89b4", new Object[]{this, map});
                return;
            }
            TMSLogger.a(o2u.TAG, "on uniapp_manifest_push_info update");
            try {
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (q9s.INSTANCE.U0()) {
                o2u.d(o2u.INSTANCE, map.get("configVersion"));
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    TMSLogger.d(o2u.TAG, th2);
                }
            }
        }
    }

    static {
        t2o.a(839909917);
    }

    public static final /* synthetic */ boolean a(o2u o2uVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41482315", new Object[]{o2uVar, str})).booleanValue();
        }
        return o2uVar.g(str);
    }

    public static final /* synthetic */ void b(o2u o2uVar, List list, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f77421f", new Object[]{o2uVar, list, map, str});
        } else {
            o2uVar.j(list, map, str);
        }
    }

    public static final /* synthetic */ void c(o2u o2uVar, List list, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dec692", new Object[]{o2uVar, list, map, str});
        } else {
            o2uVar.k(list, map, str);
        }
    }

    public static final /* synthetic */ void d(o2u o2uVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb61275b", new Object[]{o2uVar, str});
        } else {
            o2uVar.l(str);
        }
    }

    public static final /* synthetic */ void e(o2u o2uVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422589", new Object[]{o2uVar, str});
        } else {
            o2uVar.m(str);
        }
    }

    public final List<String> f(List<ManifestPushInfo> list, Map<String, AppManifestDao> map) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c6c4e169", new Object[]{this, list, map});
        }
        ArrayList arrayList = new ArrayList();
        int U3 = q9s.U3();
        String str2 = "https://multi-manifest.m.taobao.com/wow/z/uniapp/manifest?ids=";
        if (list != null) {
            String str3 = str2;
            int i2 = 0;
            for (ManifestPushInfo manifestPushInfo : list) {
                if (i2 >= U3) {
                    arrayList.add(str3);
                    str3 = str2;
                    i2 = 0;
                }
                if (manifestPushInfo.getAppId() == null || manifestPushInfo.getVersion() == null) {
                    vbs.f("ManifestPushError", "empty info", null, 4, null);
                } else if (INSTANCE.h(manifestPushInfo, map)) {
                    if (i2 != 0) {
                        str = ckf.p(",", manifestPushInfo.getAppId());
                    } else {
                        str = manifestPushInfo.getAppId();
                    }
                    str3 = ckf.p(str3, str);
                    i2++;
                }
            }
            i = i2;
            str2 = str3;
        }
        if (i > 0) {
            arrayList.add(str2);
        }
        return arrayList;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        TMSLogger.a(TAG, "register TopAppManifestListener");
        mcs.e(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, mcs.EVENT_ON_INIT, mcs.GLOBAL_EVENT_ROOT_ID, mcs.d(mcs.GLOBAL_EVENT_ROOT_ID), new JSONObject());
        IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
        if (iConfigAdapter != null) {
            iConfigAdapter.registerListener("uniapp_manifest_push_info", a.INSTANCE);
        }
    }

    public final void j(List<ManifestPushInfo> list, Map<String, AppManifestDao> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f008fad", new Object[]{this, list, map, str});
            return;
        }
        for (String str2 : f(list == null ? null : i04.S(list), map)) {
            String d = mcs.d(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "url", str2);
            jSONObject.put((JSONObject) "combo", (String) Boolean.TRUE);
            xhv xhvVar = xhv.INSTANCE;
            mcs.b(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, "START_REQUEST", str, d, jSONObject);
            t2i.a l = AppManifestManager.INSTANCE.l(str2);
            if (!l.c() || l.d() == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "url", str2);
                jSONObject2.put((JSONObject) "msg", l.b());
                vbs.d("ManifestPushError", "request error", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put((JSONObject) "errorCode", l.a());
                jSONObject3.put((JSONObject) "errorMsg", l.b());
                mcs.c(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, mcs.EVENT_ON_ERROR, str, d, jSONObject3);
                TMSLogger.a(TAG, "update manifest failed. url:" + str2 + ", message: " + ((Object) l.b()));
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put((JSONObject) "savedItems", (String) l.e());
                if (CommonExtKt.j()) {
                    jSONObject4.put((JSONObject) "response", JSON.toJSONString(l.d()));
                }
                mcs.b(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, "FINISH_REQUEST", str, d, jSONObject4);
                StringBuilder sb = new StringBuilder("update manifest success. url:");
                sb.append(str2);
                sb.append(", valid save ids = ");
                List<String> e = l.e();
                sb.append((Object) (e == null ? null : e.toString()));
                TMSLogger.a(TAG, sb.toString());
            }
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abae33b", new Object[]{this, str});
        } else if (str != null && !wsq.a0(str)) {
            Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
            ckf.f(applicationContext, "getNotNull(IEnvironmentS….java).applicationContext");
            wcs.i(applicationContext, "uniapp_manifest_push_info_config_version", str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25114a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f25114a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            o2u o2uVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TMSLogger.b(o2u.TAG, "start execute");
            String str = this.f25114a;
            String str2 = this.b;
            try {
                o2uVar = o2u.INSTANCE;
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (!o2u.a(o2uVar, str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "errorCode", "-102");
                jSONObject.put((JSONObject) "errorMsg", "same version");
                xhv xhvVar = xhv.INSTANCE;
                mcs.c(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, mcs.EVENT_ON_ERROR, mcs.GLOBAL_EVENT_ROOT_ID, str2, jSONObject);
                return;
            }
            IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
            String customConfig = iConfigAdapter == null ? null : iConfigAdapter.getCustomConfig("uniapp_manifest_push_info", "{}");
            List parseArray = JSON.parseArray(customConfig, ManifestPushInfo.class);
            if (parseArray == null) {
                TMSLogger.b(o2u.TAG, "parse file failed");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "errorCode", "-102");
                jSONObject2.put((JSONObject) "errorMsg", "config empty");
                xhv xhvVar2 = xhv.INSTANCE;
                mcs.c(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, mcs.EVENT_ON_ERROR, mcs.GLOBAL_EVENT_ROOT_ID, str2, jSONObject2);
                return;
            }
            String d = mcs.d(str2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "config", (String) JSON.parseArray(customConfig));
            xhv xhvVar3 = xhv.INSTANCE;
            mcs.b(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, "START_FETCH_TASK", str2, d, jSONObject3);
            TMSLogger.a(o2u.TAG, ckf.p("get push info successfully. size:", Integer.valueOf(parseArray.size())));
            Map<String, AppManifestDao> g = AppManifestManager.INSTANCE.g(q9s.S3());
            if (q9s.S0()) {
                o2u.b(o2uVar, parseArray, g, str2);
            } else {
                o2u.c(o2uVar, parseArray, g, str2);
            }
            o2u.e(o2uVar, str);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            String str3 = this.b;
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "unknownError";
                }
                vbs.f("ManifestPushError", message, null, 4, null);
                TMSLogger.d(o2u.TAG, th2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put((JSONObject) "errorCode", "-103");
                jSONObject4.put((JSONObject) "errorMsg", th2.getMessage());
                xhv xhvVar4 = xhv.INSTANCE;
                mcs.c(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, mcs.EVENT_ON_ERROR, mcs.GLOBAL_EVENT_ROOT_ID, str3, jSONObject4);
            }
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9870aa9", new Object[]{this, str});
            return;
        }
        String d = mcs.d(mcs.GLOBAL_EVENT_ROOT_ID);
        TMSLogger.a(TAG, "try updateManifest");
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        Executor executor = iExecutorService == null ? null : iExecutorService.getExecutor(ExecutorType.MANIFEST);
        int w3 = q9s.INSTANCE.w3();
        TMSLogger.b(TAG, "get shuffle time config：" + w3 + ' ');
        int nextInt = new Random().nextInt(w3 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "version", str);
        jSONObject.put((JSONObject) "schedule-time", (String) Integer.valueOf(nextInt));
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, mcs.EVENT_ON_LISTEN, mcs.GLOBAL_EVENT_ROOT_ID, d, jSONObject);
        TMSLogger.b(TAG, "get this scheduleTime：" + nextInt + " , do schedule");
        if (executor instanceof ScheduledExecutorService) {
            ((ScheduledExecutorService) executor).schedule(new b(str, d), nextInt, TimeUnit.SECONDS);
        } else {
            TMSLogger.b(TAG, "cannot find executor");
        }
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2da29cb7", new Object[]{this, str})).booleanValue();
        }
        TMSLogger.a(TAG, "try check config update");
        if (str == null || wsq.a0(str)) {
            TMSLogger.b(TAG, "newConfigVersion is null, skip update");
            return false;
        }
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        ckf.f(applicationContext, "getNotNull(IEnvironmentS….java).applicationContext");
        String c = wcs.c(applicationContext, "uniapp_manifest_push_info_config_version", "");
        TMSLogger.a(TAG, "localConfigVersion: " + ((Object) c) + ", newConfigVersion : " + ((Object) str));
        if (c != null && !wsq.a0(c) && ckf.b(str, c)) {
            return false;
        }
        TMSLogger.a(TAG, "config need update");
        return true;
    }

    public final boolean h(ManifestPushInfo manifestPushInfo, Map<String, AppManifestDao> map) {
        AppManifestDao appManifestDao;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84ed14af", new Object[]{this, manifestPushInfo, map})).booleanValue();
        }
        TMSLogger.a(TAG, "check need update. id:" + ((Object) manifestPushInfo.getAppId()) + ", version:" + ((Object) manifestPushInfo.getVersion()) + ", priority:" + manifestPushInfo.getPriority());
        if (manifestPushInfo.getPriority() == 0 || (map != null && map.containsKey(manifestPushInfo.getAppId()))) {
            AppManifestDao appManifestDao2 = null;
            if (!(map == null || (appManifestDao = map.get(manifestPushInfo.getAppId())) == null)) {
                appManifestDao2 = appManifestDao;
            }
            if (appManifestDao2 == null) {
                AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                String appId = manifestPushInfo.getAppId();
                ckf.d(appId);
                appManifestDao2 = appManifestManager.d(appId, AppManifestManager.RequestMode.UPDATE);
                if (appManifestDao2 == null) {
                    return true;
                }
            }
            if (o9s.b(manifestPushInfo.getVersion(), appManifestDao2.getVersion()) > 0) {
                TMSLogger.a(TAG, ckf.p("local manifest version : ", appManifestDao2.getVersion()));
                return true;
            }
            TMSLogger.a(TAG, ckf.p("don't need update. id:", manifestPushInfo.getAppId()));
            AppManifestManager.INSTANCE.j(appManifestDao2);
        }
        return false;
    }

    public final void k(List<ManifestPushInfo> list, Map<String, AppManifestDao> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ccbda", new Object[]{this, list, map, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String d = mcs.d(str);
        if (list != null) {
            for (ManifestPushInfo manifestPushInfo : list) {
                if (manifestPushInfo.getAppId() == null || manifestPushInfo.getVersion() == null) {
                    vbs.f("ManifestPushError", "empty info", null, 4, null);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "combo", (String) Boolean.FALSE);
                    xhv xhvVar = xhv.INSTANCE;
                    mcs.b(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, "START_REQUEST", str, d, jSONObject);
                    if (INSTANCE.h(manifestPushInfo, map)) {
                        TMSLogger.a(TAG, ckf.p("try update manifest. id:", manifestPushInfo.getAppId()));
                        boolean V0 = q9s.INSTANCE.V0();
                        TMSLogger.b(TAG, ckf.p("is usePreloadUrl ", Boolean.valueOf(V0)));
                        AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
                        String appId = manifestPushInfo.getAppId();
                        ckf.d(appId);
                        t2i.c o = appManifestManager.o(appId, null, AppManifestManager.RequestMode.UPDATE, V0);
                        if (!o.e() || o.f() == null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put((JSONObject) "id", manifestPushInfo.getAppId());
                            jSONObject2.put((JSONObject) "msg", o.b());
                            vbs.d("ManifestPushError", "update error", jSONObject2);
                            TMSLogger.a(TAG, "update manifest failed. id:" + ((Object) manifestPushInfo.getAppId()) + ", message: " + ((Object) o.b()));
                        } else {
                            String appId2 = manifestPushInfo.getAppId();
                            ckf.d(appId2);
                            arrayList2.add(appId2);
                            TMSLogger.a(TAG, ckf.p("update manifest success. id:", manifestPushInfo.getAppId()));
                        }
                    } else {
                        String appId3 = manifestPushInfo.getAppId();
                        if (appId3 != null) {
                            arrayList.add(appId3);
                        }
                    }
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "ignoreItems", (String) arrayList);
        jSONObject3.put((JSONObject) "passItems", (String) arrayList2);
        xhv xhvVar2 = xhv.INSTANCE;
        mcs.b(mcs.MODULE_GLOBAL_MANIFEST_PRELOAD, "FINISH_REQUEST", str, d, jSONObject3);
    }
}
