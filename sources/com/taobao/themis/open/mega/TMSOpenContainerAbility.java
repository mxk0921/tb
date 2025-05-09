package com.taobao.themis.open.mega;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOpenContainerAbility;
import com.taobao.android.abilityidl.ability.OpenContainerLoadAppInfoResult;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import tb.ckf;
import tb.cpx;
import tb.h3l;
import tb.h51;
import tb.hkz;
import tb.hpx;
import tb.jkl;
import tb.kdb;
import tb.ldb;
import tb.m5d;
import tb.n51;
import tb.p3d;
import tb.p8s;
import tb.q9s;
import tb.t2o;
import tb.zas;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/open/mega/TMSOpenContainerAbility;", "Lcom/taobao/android/abilityidl/ability/AbsOpenContainerAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/h3l;", "params", "Ltb/p3d;", "callback", "Ltb/xhv;", "preLoadAppInfo", "(Ltb/kdb;Ltb/h3l;Ltb/p3d;)V", "Lcom/alibaba/ariver/resource/api/models/AppModel;", "appModel", "", "bizType", "parsePackageUrl", "(Lcom/alibaba/ariver/resource/api/models/AppModel;Ljava/lang/String;)Ljava/lang/String;", "Lcom/alibaba/fastjson/JSONObject;", "parsePackageCacheInfo", "(Lcom/alibaba/ariver/resource/api/models/AppModel;Ljava/lang/String;)Lcom/alibaba/fastjson/JSONObject;", "Ltb/jkl;", "downloadInfo", "downloadPackage$themis_open_release", "(Ltb/jkl;)V", "downloadPackage", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSOpenContainerAbility extends AbsOpenContainerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f13641a = "TMSOpenContainerAbility";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements m5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jkl b;

        public a(jkl jklVar) {
            this.b = jklVar;
        }

        @Override // tb.m5d.c
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "filePath");
            String access$getTAG$p = TMSOpenContainerAbility.access$getTAG$p(TMSOpenContainerAbility.this);
            TMSLogger.b(access$getTAG$p, "包预加载成功: " + this.b.a() + ", " + System.currentTimeMillis());
        }

        @Override // tb.m5d.c
        public void b(m5d.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79bd4dfc", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "error");
            String access$getTAG$p = TMSOpenContainerAbility.access$getTAG$p(TMSOpenContainerAbility.this);
            TMSLogger.b(access$getTAG$p, "包预加载失败:" + this.b.a() + " error: " + bVar.a() + ", msg: " + ((Object) bVar.b()));
        }

        @Override // tb.m5d.c
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }
    }

    static {
        t2o.a(843055272);
    }

    public static final /* synthetic */ String access$getTAG$p(TMSOpenContainerAbility tMSOpenContainerAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70385d55", new Object[]{tMSOpenContainerAbility});
        }
        return tMSOpenContainerAbility.f13641a;
    }

    public static /* synthetic */ Object ipc$super(TMSOpenContainerAbility tMSOpenContainerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/mega/TMSOpenContainerAbility");
    }

    public final void downloadPackage$themis_open_release(jkl jklVar) {
        m5d m5dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b55086", new Object[]{this, jklVar});
            return;
        }
        ckf.g(jklVar, "downloadInfo");
        JSONObject e = jklVar.e();
        if (e == null || e.isEmpty()) {
            String b2 = jklVar.b();
            if (b2 == null || b2.length() == 0) {
                m5dVar = null;
            } else {
                m5dVar = new cpx();
            }
        } else {
            m5dVar = new hpx();
        }
        if (m5dVar != null) {
            m5dVar.a(jklVar, new a(jklVar));
        }
    }

    public final JSONObject parsePackageCacheInfo(AppModel appModel, String str) {
        JSONObject extendInfos;
        JSONObject extendInfos2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("17fde6ed", new Object[]{this, appModel, str});
        }
        ckf.g(appModel, "appModel");
        ckf.g(str, "bizType");
        switch (str.hashCode()) {
            case -1734717884:
                if (str.equals("WIDGET") && (extendInfos = appModel.getExtendInfos()) != null) {
                    return extendInfos.getJSONObject("widgetCacheInfo");
                }
                return null;
            case -594423039:
                str.equals("TINYAPP");
                return null;
            case 2180082:
                if (str.equals("GAME") && (extendInfos2 = appModel.getExtendInfos()) != null) {
                    return extendInfos2.getJSONObject("cacheInfo");
                }
                return null;
            case 1782509130:
                if (!str.equals("MINIAPP")) {
                    return null;
                }
                JSONObject extendInfos3 = appModel.getExtendInfos();
                JSONObject jSONObject = extendInfos3 == null ? null : extendInfos3.getJSONObject("newCacheInfo");
                if (jSONObject != null) {
                    return jSONObject;
                }
                JSONObject extendInfos4 = appModel.getExtendInfos();
                if (extendInfos4 == null) {
                    return null;
                }
                return extendInfos4.getJSONObject("cacheInfo");
            default:
                return null;
        }
    }

    public final String parsePackageUrl(AppModel appModel, String str) {
        JSONObject extendInfos;
        AppInfoModel appInfoModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec5cc752", new Object[]{this, appModel, str});
        }
        ckf.g(appModel, "appModel");
        ckf.g(str, "bizType");
        switch (str.hashCode()) {
            case -1734717884:
                if (str.equals("WIDGET") && (extendInfos = appModel.getExtendInfos()) != null) {
                    return extendInfos.getString("widgetPackageUrl");
                }
                return null;
            case -594423039:
                str.equals("TINYAPP");
                return null;
            case 2180082:
                if (str.equals("GAME") && (appInfoModel = appModel.getAppInfoModel()) != null) {
                    return appInfoModel.getPackageUrl();
                }
                return null;
            case 1782509130:
                if (!str.equals("MINIAPP")) {
                    return null;
                }
                AppInfoModel appInfoModel2 = appModel.getAppInfoModel();
                String newPackageUrl = appInfoModel2 == null ? null : appInfoModel2.getNewPackageUrl();
                if (newPackageUrl != null) {
                    return newPackageUrl;
                }
                AppInfoModel appInfoModel3 = appModel.getAppInfoModel();
                if (appInfoModel3 == null) {
                    return null;
                }
                return appInfoModel3.getPackageUrl();
            default:
                return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements h51 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p3d f13643a;
        public final /* synthetic */ TMSOpenContainerAbility b;
        public final /* synthetic */ h3l c;
        public final /* synthetic */ kdb d;

        public b(p3d p3dVar, TMSOpenContainerAbility tMSOpenContainerAbility, h3l h3lVar, kdb kdbVar) {
            this.f13643a = p3dVar;
            this.b = tMSOpenContainerAbility;
            this.c = h3lVar;
            this.d = kdbVar;
        }

        @Override // tb.h51
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            List<PluginModel> plugins;
            Context context;
            IExecutorService iExecutorService;
            Executor executor;
            ldb l;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad55cbb9", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            try {
                if (appModel == null) {
                    this.f13643a.O(ErrorResult.a.g("参数错误"));
                    return;
                }
                zas.a();
                String parsePackageUrl = this.b.parsePackageUrl(appModel, this.c.b);
                JSONObject parsePackageCacheInfo = this.b.parsePackageCacheInfo(appModel, this.c.b);
                if (q9s.c1()) {
                    kdb kdbVar = this.d;
                    if (!(kdbVar == null || (l = kdbVar.l()) == null)) {
                        context = l.getContext();
                        if (!(context == null || (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null)) {
                            executor.execute(new a(this.d, this.c, this.b, appModel));
                        }
                    }
                    context = null;
                    if (context == null) {
                        executor.execute(new a(this.d, this.c, this.b, appModel));
                    }
                }
                String name = appModel.getAppInfoModel().getName();
                ckf.f(name, "appInfo.appInfoModel.name");
                String appId = appModel.getAppId();
                ckf.f(appId, "appInfo.appId");
                String appVersion = appModel.getAppVersion();
                ckf.f(appVersion, "appInfo.appVersion");
                this.b.downloadPackage$themis_open_release(new jkl(name, appId, appVersion, parsePackageUrl, parsePackageCacheInfo));
                AppInfoModel appInfoModel = appModel.getAppInfoModel();
                if (!(appInfoModel == null || (plugins = appInfoModel.getPlugins()) == null)) {
                    TMSOpenContainerAbility tMSOpenContainerAbility = this.b;
                    for (PluginModel pluginModel : plugins) {
                        if (pluginModel != null) {
                            String newPackageUrl = pluginModel.getNewPackageUrl();
                            if (newPackageUrl == null) {
                                newPackageUrl = pluginModel.getPackageUrl();
                            }
                            JSONObject extendInfo = pluginModel.getExtendInfo();
                            JSONObject jSONObject = extendInfo == null ? null : extendInfo.getJSONObject("newCacheInfo");
                            if (jSONObject == null) {
                                JSONObject extendInfo2 = pluginModel.getExtendInfo();
                                if (extendInfo2 == null) {
                                    jSONObject = null;
                                    String appId2 = pluginModel.getAppId();
                                    ckf.f(appId2, "plugin.appId");
                                    String appId3 = pluginModel.getAppId();
                                    ckf.f(appId3, "plugin.appId");
                                    String version = pluginModel.getVersion();
                                    ckf.f(version, "plugin.version");
                                    tMSOpenContainerAbility.downloadPackage$themis_open_release(new jkl(appId2, appId3, version, newPackageUrl, jSONObject));
                                } else {
                                    jSONObject = extendInfo2.getJSONObject("cacheInfo");
                                }
                            }
                            String appId22 = pluginModel.getAppId();
                            ckf.f(appId22, "plugin.appId");
                            String appId32 = pluginModel.getAppId();
                            ckf.f(appId32, "plugin.appId");
                            String version2 = pluginModel.getVersion();
                            ckf.f(version2, "plugin.version");
                            tMSOpenContainerAbility.downloadPackage$themis_open_release(new jkl(appId22, appId32, version2, newPackageUrl, jSONObject));
                        }
                    }
                }
                OpenContainerLoadAppInfoResult openContainerLoadAppInfoResult = new OpenContainerLoadAppInfoResult();
                openContainerLoadAppInfoResult.result = Boolean.TRUE;
                this.f13643a.M0(openContainerLoadAppInfoResult);
            } catch (Throwable th) {
                TMSLogger.d(TMSOpenContainerAbility.access$getTAG$p(this.b), th);
            }
        }

        @Override // tb.h51
        public void b(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4804eec", new Object[]{this, str, str2, jSONObject});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            this.f13643a.O(ErrorResult.a.e("能力禁止调用"));
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kdb f13644a;
            public final /* synthetic */ h3l b;
            public final /* synthetic */ TMSOpenContainerAbility c;
            public final /* synthetic */ AppModel d;

            public a(kdb kdbVar, h3l h3lVar, TMSOpenContainerAbility tMSOpenContainerAbility, AppModel appModel) {
                this.f13644a = kdbVar;
                this.b = h3lVar;
                this.c = tMSOpenContainerAbility;
                this.d = appModel;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (hkz.a(this.f13644a.l().getContext())) {
                        Class<?> cls = Class.forName("com.alibaba.triver.appinfo.utils.AppInfoManagerV2");
                        Object newInstance = cls.newInstance();
                        Method method = cls.getMethod("preloadPlugin", AppModel.class, String.class, String.class);
                        ckf.f(method, "clazz.getMethod(\"preload…java, String::class.java)");
                        h3l h3lVar = this.b;
                        List<String> list = h3lVar.c;
                        if (list != null) {
                            AppModel appModel = this.d;
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                method.invoke(newInstance, appModel, h3lVar.f20392a, (String) it.next());
                            }
                        }
                    }
                } catch (Throwable th) {
                    TMSLogger.b(TMSOpenContainerAbility.access$getTAG$p(this.c), ckf.p("loadPlugin error ", th.getMessage()));
                }
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenContainerAbility
    public void preLoadAppInfo(kdb kdbVar, h3l h3lVar, p3d p3dVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f352ec06", new Object[]{this, kdbVar, h3lVar, p3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(h3lVar, "params");
        ckf.g(p3dVar, "callback");
        try {
            if (!q9s.Z0()) {
                p3dVar.O(ErrorResult.a.e("能力禁止调用"));
            } else if (!q9s.a1(h3lVar.f20392a)) {
                p3dVar.O(ErrorResult.a.e("能力禁止调用"));
            } else {
                AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
                basicRequestParam.appId = h3lVar.f20392a;
                basicRequestParam.version = "*";
                basicRequestParam.url = "";
                com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b(basicRequestParam);
                AppInfoScene appInfoScene = AppInfoScene.ONLINE;
                bVar.f13591a = appInfoScene;
                if (appInfoScene == AppInfoScene.DEBUG || appInfoScene == AppInfoScene.TRIAL) {
                    z = false;
                }
                bVar.b = z;
                bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.PRELOAD;
                n51.i().n(bVar, new b(p3dVar, this, h3lVar, kdbVar));
            }
        } catch (Throwable th) {
            TMSLogger.d(this.f13641a, th);
        }
    }
}
