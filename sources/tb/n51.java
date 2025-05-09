package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoRequestModel;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig$CacheTime;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.AppInfoCacheConfig$ExpireConfig;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class n51 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AppInfoManager";
    public static volatile n51 b;

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f24513a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b f24514a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ h51 c;

        public a(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar, boolean z, h51 h51Var) {
            this.f24514a = bVar;
            this.b = z;
            this.c = h51Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
            if (r5 != 4) goto L_0x00ac;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.n51.a.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b f24515a;
        public final /* synthetic */ h51 b;

        public b(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar, h51 h51Var) {
            this.f24515a = bVar;
            this.b = h51Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r51 o = n51.this.o(this.f24515a);
            if (this.b != null) {
                if (!o.f() || o.a() == null) {
                    this.b.b(o.b(), o.d(), o.c());
                } else {
                    this.b.a(o.a(), AppInfoStrategy.ASYNC_LOAD);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a f24516a;
        public final /* synthetic */ p51 b;

        public c(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar, p51 p51Var) {
            this.f24516a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                n51.this.q(this.f24516a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$themis$kernel$metaInfo$appinfo$core$AppInfoStrategy;

        static {
            int[] iArr = new int[AppInfoStrategy.values().length];
            $SwitchMap$com$taobao$themis$kernel$metaInfo$appinfo$core$AppInfoStrategy = iArr;
            try {
                iArr[AppInfoStrategy.LOCAL_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$themis$kernel$metaInfo$appinfo$core$AppInfoStrategy[AppInfoStrategy.ASYNC_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$themis$kernel$metaInfo$appinfo$core$AppInfoStrategy[AppInfoStrategy.SYNC_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$themis$kernel$metaInfo$appinfo$core$AppInfoStrategy[AppInfoStrategy.FORCE_SYNC_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void a(AppModel appModel);
    }

    static {
        t2o.a(839909766);
    }

    public static synchronized n51 i() {
        synchronized (n51.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n51) ipChange.ipc$dispatch("7d4b5bd5", new Object[0]);
            }
            if (b == null) {
                b = new n51();
            }
            return b;
        }
    }

    public void a(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b091b152", new Object[]{this, appModel});
        } else if (appModel != null) {
            l(appModel);
            f51.f().j(appModel.getAppId());
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28aacea9", new Object[]{this, str, str2});
            return;
        }
        try {
            AppModel appModel = (AppModel) JSON.parseObject(str2, AppModel.class);
            if (appModel != null && TextUtils.equals(str, appModel.getAppId())) {
                i().a(appModel);
            }
        } catch (Throwable th) {
            TMSLogger.d(TAG, th);
        }
    }

    public void c(List<AppModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2717e9d", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AppModel appModel : list) {
            if (appModel != null) {
                l(appModel);
                arrayList.add(appModel.getAppId());
            }
        }
        f51.f().k(arrayList);
    }

    public AppInfoStrategy d(AppInfoScene appInfoScene, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("15035045", new Object[]{this, appInfoScene, str});
        }
        return e(appInfoScene, str, "*", "");
    }

    public AppInfoStrategy e(AppInfoScene appInfoScene, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("2ad9d7b1", new Object[]{this, appInfoScene, str, str2, str3});
        }
        AppInfoDao f = s51.c().f(str, str2, str3);
        if (f == null || (!TextUtils.isEmpty(f.type) && !TextUtils.equals(f.type, appInfoScene.name()))) {
            return AppInfoStrategy.SYNC_LOAD;
        }
        return f(f);
    }

    public AppInfoStrategy f(AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("88e2738d", new Object[]{this, appInfoDao});
        }
        if (appInfoDao == null) {
            return AppInfoStrategy.SYNC_LOAD;
        }
        if (l51.a(appInfoDao)) {
            return AppInfoStrategy.FORCE_SYNC_LOAD;
        }
        String str = appInfoDao.appId;
        AppInfoCacheConfig$CacheTime a2 = f51.f().a(str, v51.b(appInfoDao.appInfo), v51.c(appInfoDao.appInfo));
        AppInfoCacheConfig$ExpireConfig d2 = f51.f().d(str);
        if (d2 != null && d2.expired) {
            String str2 = d2.strategy;
            AppInfoStrategy appInfoStrategy = AppInfoStrategy.SYNC_LOAD;
            if (TextUtils.equals(str2, appInfoStrategy.getName())) {
                TMSLogger.a(TAG, str + " important app local cache expired, strategy syncLoad!");
                return appInfoStrategy;
            }
            TMSLogger.a(TAG, str + " important app local cache expired, strategy asyncLoad.");
            return AppInfoStrategy.ASYNC_LOAD;
        } else if (appInfoDao.lastRequestTimeStamp <= System.currentTimeMillis() - (a2.maxSyncTime * 1000)) {
            TMSLogger.a(TAG, str + " local cache over maxSyncTime, syncLoad strategy.");
            return AppInfoStrategy.SYNC_LOAD;
        } else if (appInfoDao.lastRequestTimeStamp > System.currentTimeMillis() - (a2.maxAsyncTime * 1000)) {
            TMSLogger.a(TAG, str + " local cache can be used.");
            return AppInfoStrategy.LOCAL_LOAD;
        } else {
            TMSLogger.a(TAG, str + " local cache over maxASyncTime, asyncLoad strategy!");
            return AppInfoStrategy.ASYNC_LOAD;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977d96c2", new Object[]{this});
        } else {
            s51.c().b(null);
        }
    }

    public final JSONObject h(AppInfoRequestModel appInfoRequestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c0af0a3", new Object[]{this, appInfoRequestModel});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorInfo", (Object) appInfoRequestModel.errorInfo);
        jSONObject.put("buttonText", (Object) appInfoRequestModel.buttonText);
        jSONObject.put("buttonUrl", (Object) appInfoRequestModel.buttonUrl);
        jSONObject.put("errorLogo", (Object) appInfoRequestModel.errorLogo);
        jSONObject.put("errorSubInfo", (Object) appInfoRequestModel.errorSubInfo);
        String str = appInfoRequestModel.downgradeUrl;
        if (appInfoRequestModel.getExtendInfos() != null && !TextUtils.isEmpty(appInfoRequestModel.getExtendInfos().getString("downgradeUrl"))) {
            str = appInfoRequestModel.getExtendInfos().getString("downgradeUrl");
        }
        jSONObject.put("downgradeUrl", (Object) str);
        jSONObject.put("guideTip", (Object) appInfoRequestModel.guideTip);
        jSONObject.put("guideTipUrl", (Object) appInfoRequestModel.guideTipUrl);
        jSONObject.put("buttonType", (Object) appInfoRequestModel.buttonType);
        return jSONObject;
    }

    public void j(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar, boolean z, h51 h51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c033bb29", new Object[]{this, bVar, new Boolean(z), h51Var});
            return;
        }
        TMSLogger.a(TAG, "enter prepareAppInfoAsync id[" + bVar.b() + "]");
        ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.URGENT).execute(new a(bVar, z, h51Var));
    }

    public void k(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c992c439", new Object[]{this, eVar});
        } else {
            ((CopyOnWriteArrayList) this.f24513a).add(eVar);
        }
    }

    public final void l(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13bd672", new Object[]{this, appModel});
            return;
        }
        AppInfoDao appInfoDao = new AppInfoDao();
        appInfoDao.appId = appModel.getAppId();
        appInfoDao.appInfo = appModel;
        long currentTimeMillis = System.currentTimeMillis();
        appInfoDao.lastRequestTimeStamp = currentTimeMillis;
        appInfoDao.lastUsedTimeStamp = currentTimeMillis;
        appInfoDao.version = appModel.getAppVersion();
        if (appModel.getAppInfoModel() != null) {
            appInfoDao.version = appModel.getAppInfoModel().getDeveloperVersion();
            if (!(appModel.getAppInfoModel().getTemplateConfig() == null || appModel.getAppInfoModel().getTemplateConfig().getTemplateId() == null)) {
                appInfoDao.templateId = appModel.getAppInfoModel().getTemplateConfig().getTemplateId();
            }
        }
        s51.c().d(appInfoDao);
    }

    public void m(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c312c6a0", new Object[]{this, eVar});
        } else {
            ((CopyOnWriteArrayList) this.f24513a).remove(eVar);
        }
    }

    public void n(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar, h51 h51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510af213", new Object[]{this, bVar, h51Var});
        } else {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.NETWORK).execute(new b(bVar, h51Var));
        }
    }

    public r51 o(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("3c6c6dd0", new Object[]{this, bVar});
        }
        IAppInfoRequestClient iAppInfoRequestClient = (IAppInfoRequestClient) p8s.b(IAppInfoRequestClient.class);
        if (iAppInfoRequestClient == null) {
            return new r51(false).h("APPINFO_EMPTY_CLIENT").j("empty IAppInfoRequestClient");
        }
        r64<List<AppInfoRequestModel>, JSONObject> requestAppInfo = iAppInfoRequestClient.requestAppInfo(bVar);
        if (!requestAppInfo.f27135a || requestAppInfo.d.isEmpty()) {
            return new r51(false).h(requestAppInfo.b).j(requestAppInfo.c).i(requestAppInfo.e);
        }
        AppInfoRequestModel appInfoRequestModel = requestAppInfo.d.get(0);
        if (!TextUtils.isEmpty(appInfoRequestModel.errorCode)) {
            return new r51(false).h(appInfoRequestModel.errorCode).j(appInfoRequestModel.errorMsg).i(h(appInfoRequestModel));
        }
        if (bVar.b) {
            a(requestAppInfo.d.get(0));
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24513a).iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(appInfoRequestModel);
        }
        return new r51(true).g(requestAppInfo.d.get(0)).k(AppInfoStrategy.SYNC_LOAD);
    }

    public void p(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar, p51 p51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5a5340", new Object[]{this, aVar, p51Var});
        } else {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.NETWORK).execute(new c(aVar, p51Var));
        }
    }

    public q51 q(com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q51) ipChange.ipc$dispatch("449e4385", new Object[]{this, aVar});
        }
        IAppInfoRequestClient iAppInfoRequestClient = (IAppInfoRequestClient) p8s.b(IAppInfoRequestClient.class);
        if (iAppInfoRequestClient == null) {
            return new q51(false).b("AI_CLIENT_EMPTY").d("AppInfoRequest client is empty!");
        }
        r64<List<AppInfoRequestModel>, JSONObject> requestAppInfo = iAppInfoRequestClient.requestAppInfo(aVar);
        if (!requestAppInfo.f27135a || requestAppInfo.d.isEmpty()) {
            return new q51(false).b(requestAppInfo.b).d(requestAppInfo.c).c(requestAppInfo.e);
        }
        ArrayList arrayList = new ArrayList();
        for (AppInfoRequestModel appInfoRequestModel : requestAppInfo.d) {
            if (TextUtils.isEmpty(appInfoRequestModel.errorCode)) {
                arrayList.add(appInfoRequestModel);
            }
        }
        if (aVar.b) {
            c(arrayList);
        }
        return new q51(true).a(arrayList);
    }
}
