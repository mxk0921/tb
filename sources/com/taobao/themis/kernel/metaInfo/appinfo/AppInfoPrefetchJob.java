package com.taobao.themis.kernel.metaInfo.appinfo;

import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.h51;
import tb.ies;
import tb.n51;
import tb.r51;
import tb.t2o;
import tb.tsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppInfoPrefetchJob implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AppInfoPrefetchJob";
    public static final AppInfoPrefetchJob INSTANCE = new AppInfoPrefetchJob();
    private static final Map<String, r51> sAppInfoMap = new ConcurrentHashMap(2);
    private static final Map<String, CountDownLatch> sAppInfoSyncLockMap = new ConcurrentHashMap(2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements h51 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13590a;

        public a(String str) {
            this.f13590a = str;
        }

        @Override // tb.h51
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad55cbb9", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            if (appInfoStrategy == null) {
                str = null;
            } else {
                str = appInfoStrategy.name();
            }
            TMSLogger.b(AppInfoPrefetchJob.TAG, ckf.p("appInfo load success, strategy: ", str));
            Map access$getSAppInfoMap$p = AppInfoPrefetchJob.access$getSAppInfoMap$p();
            String str2 = this.f13590a;
            r51 r51Var = new r51(true);
            r51Var.g(appModel);
            r51Var.k(appInfoStrategy);
            xhv xhvVar = xhv.INSTANCE;
            access$getSAppInfoMap$p.put(str2, r51Var);
            CountDownLatch countDownLatch = (CountDownLatch) AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p().get(this.f13590a);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p().remove(this.f13590a);
        }

        @Override // tb.h51
        public void b(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4804eec", new Object[]{this, str, str2, jSONObject});
                return;
            }
            Map access$getSAppInfoMap$p = AppInfoPrefetchJob.access$getSAppInfoMap$p();
            String str3 = this.f13590a;
            r51 r51Var = new r51(false);
            r51Var.h(str);
            r51Var.j(str2);
            r51Var.i(jSONObject);
            xhv xhvVar = xhv.INSTANCE;
            access$getSAppInfoMap$p.put(str3, r51Var);
            TMSLogger.b(AppInfoPrefetchJob.TAG, "appInfo on Error, timestamp: " + System.currentTimeMillis() + " \n errorCode: " + ((Object) str) + ", errorMsg: " + ((Object) str2) + ", extInfo: " + jSONObject);
            CountDownLatch countDownLatch = (CountDownLatch) AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p().get(this.f13590a);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            AppInfoPrefetchJob.access$getSAppInfoSyncLockMap$p().remove(this.f13590a);
        }
    }

    static {
        t2o.a(839909772);
    }

    private AppInfoPrefetchJob() {
    }

    public static final /* synthetic */ Map access$getSAppInfoMap$p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("12babe92", new Object[0]);
        }
        return sAppInfoMap;
    }

    public static final /* synthetic */ Map access$getSAppInfoSyncLockMap$p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62ea674c", new Object[0]);
        }
        return sAppInfoSyncLockMap;
    }

    @JvmStatic
    public static final r51 getAppInfoSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("8b66b06c", new Object[]{str});
        }
        ckf.g(str, "appId");
        TMSLogger.f(TAG, "getAppInfoSync " + str + " start");
        StringBuilder sb = new StringBuilder("getAppInfoSync ");
        sb.append(str);
        sb.append(" start");
        Map<String, r51> map = sAppInfoMap;
        if (map.get(str) != null) {
            TMSLogger.f(TAG, "getAppInfoSync " + str + " finish");
            StringBuilder sb2 = new StringBuilder("getAppInfoSync ");
            sb2.append(str);
            sb2.append(" finish");
            return map.get(str);
        }
        try {
            CountDownLatch countDownLatch = sAppInfoSyncLockMap.get(str);
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (Throwable th) {
            TMSLogger.c(TAG, ckf.p("getAppInfoSync error: ", th.getMessage()), th);
        }
        TMSLogger.f(TAG, "getAppInfoSync finish");
        return sAppInfoMap.get(str);
    }

    private final String getNBSVersion(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c13ef351", new Object[]{this, map});
        }
        return map.get("nbsv");
    }

    @JvmStatic
    public static final boolean hasPrefetchAppInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f772293", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        if (sAppInfoMap.get(str) != null) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean isNeedPrefetch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9199024c", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "appId");
        return sAppInfoSyncLockMap.containsKey(str);
    }

    public static /* synthetic */ void prefetchAppInfo$default(String str, String str2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738577fb", new Object[]{str, str2, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        prefetchAppInfo(str, str2, z);
    }

    private final b prepareAppInfoRequestConfig(String str, String str2, Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4aed2042", new Object[]{this, str, str2, map});
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = str;
        AppInfoPrefetchJob appInfoPrefetchJob = INSTANCE;
        String nBSVersion = appInfoPrefetchJob.getNBSVersion(map);
        if (nBSVersion == null) {
            nBSVersion = "*";
        }
        basicRequestParam.version = nBSVersion;
        basicRequestParam.url = str2;
        b bVar = new b(basicRequestParam);
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.SYNCLOAD;
        AppInfoScene nBScene = appInfoPrefetchJob.getNBScene(map);
        bVar.f13591a = nBScene;
        if (nBScene == AppInfoScene.DEBUG || nBScene == AppInfoScene.TRIAL) {
            z = false;
        }
        bVar.b = z;
        return bVar;
    }

    private final b prepareFrameworkRequestConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8eddb24c", new Object[]{this, str});
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = str;
        b bVar = new b(basicRequestParam);
        bVar.b = true;
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.SYNCLOAD;
        bVar.f13591a = AppInfoScene.ONLINE;
        return bVar;
    }

    @JvmStatic
    public static final void prefetchAppInfo(String str, String str2, boolean z) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94827ea1", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "url");
        Map<String, String> e = ies.e(str2);
        if (e == null) {
            TMSLogger.b(TAG, "url解析失败");
            return;
        }
        sAppInfoSyncLockMap.put(str, new CountDownLatch(1));
        sAppInfoMap.remove(str);
        if (z) {
            bVar = INSTANCE.prepareFrameworkRequestConfig(str);
        } else {
            bVar = INSTANCE.prepareAppInfoRequestConfig(str, str2, e);
        }
        n51.i().j(bVar, true, new a(str));
    }

    private final AppInfoScene getNBScene(Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoScene) ipChange.ipc$dispatch("2b1f233e", new Object[]{this, map});
        }
        String str = map.get("nbsn");
        if (str == null || str.length() == 0) {
            return AppInfoScene.ONLINE;
        }
        AppInfoScene[] values = AppInfoScene.values();
        int length = values.length;
        while (i < length) {
            AppInfoScene appInfoScene = values[i];
            i++;
            if (tsq.x(appInfoScene.name(), str, true)) {
                return appInfoScene;
            }
        }
        return AppInfoScene.DEBUG;
    }
}
