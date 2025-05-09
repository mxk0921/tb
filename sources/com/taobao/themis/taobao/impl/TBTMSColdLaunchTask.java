package com.taobao.themis.taobao.impl;

import android.app.Application;
import android.net.Uri;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.extra.jsi.WVJsi;
import android.taobao.windvane.extra.launch.WVOptimizedStartup;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.themis.graphics.TMSGraphicsLibraryInit;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.appinfo.AppInfoPrefetchJob;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.TMSPrefetchDataManager;
import com.taobao.themis.mix.utils.MixPageInfo;
import com.taobao.themis.web.utils.HTMLPrefetchJob;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.abs;
import tb.c4b;
import tb.ckf;
import tb.ecd;
import tb.ges;
import tb.h8s;
import tb.hpx;
import tb.ies;
import tb.jkl;
import tb.m5d;
import tb.p8s;
import tb.ppx;
import tb.q9s;
import tb.r51;
import tb.rds;
import tb.swe;
import tb.t2o;
import tb.ubs;
import tb.uds;
import tb.wes;
import tb.yas;
import tb.ycs;
import tb.yox;
import tb.yyj;
import tb.zgv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0003¢\u0006\u0004\b\u0011\u0010\rJ'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010$\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/taobao/themis/taobao/impl/TBTMSColdLaunchTask;", "Ljava/io/Serializable;", "<init>", "()V", "Landroid/app/Application;", "application", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "params", "Ltb/xhv;", "init", "(Landroid/app/Application;Ljava/util/HashMap;)V", "url", "addUrlSessionId", "(Ljava/lang/String;Landroid/app/Application;)Ljava/lang/String;", "initV2", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "type", "preFetchUniApp", "(Lcom/taobao/themis/kernel/solution/TMSSolutionType;Ljava/lang/String;Landroid/app/Application;)V", "preFetchWeex", "(Lcom/taobao/themis/kernel/solution/TMSSolutionType;Ljava/lang/String;Landroid/app/Application;Ljava/util/HashMap;)V", "appId", "preFetchAppInfo", "(Ljava/lang/String;Lcom/taobao/themis/kernel/solution/TMSSolutionType;Ljava/lang/String;)V", "preFetchFrameworkInfo", "(Lcom/taobao/themis/kernel/solution/TMSSolutionType;Ljava/lang/String;)V", "preloadEngine", "initHomePageGateway", "(Landroid/app/Application;)V", "Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;", "metaInfo", "", "ssrPrerender", "preloadHTMLResource", "(Lcom/taobao/themis/kernel/solution/TMSSolutionType;Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;Ljava/lang/String;Z)V", "webSinglePageSolutionPreload", "(Ljava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBTMSColdLaunchTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMS 极简链路";
    public static final TBTMSColdLaunchTask INSTANCE = new TBTMSColdLaunchTask();
    private static final AtomicBoolean isInit = new AtomicBoolean(false);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f13756a;
        public final /* synthetic */ HashMap<String, Object> b;

        public a(Application application, HashMap<String, Object> hashMap) {
            this.f13756a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBTMSColdLaunchTask.access$initV2(this.f13756a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f13757a;

        public b(Application application) {
            this.f13757a = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                yyj.e().n(this.f13757a, yyj.l(), true);
                c4b.i().k();
                TMSLogger.b(TBTMSColdLaunchTask.TAG, "TBTMSColdLaunchTask init homepage");
            } catch (Exception e) {
                TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("TBTMSColdLaunchTask init homepage error: ", e.getMessage()));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ppx.c(true);
            yox.l("hd25-spring-main-stage1.zip");
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<String> f13758a;
        public final /* synthetic */ long b;

        public d(Ref$ObjectRef<String> ref$ObjectRef, long j) {
            this.f13758a = ref$ObjectRef;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f13758a.element;
            ckf.f(str, "url");
            TBTMSColdLaunchTask.webSinglePageSolutionPreload(str);
            TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("prefetch end, cost: ", Long.valueOf(System.currentTimeMillis() - this.b)));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13759a;
        public final /* synthetic */ TMSSolutionType b;
        public final /* synthetic */ String c;
        public final /* synthetic */ hpx d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements m5d.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ jkl f13760a;

            public a(jkl jklVar) {
                this.f13760a = jklVar;
            }

            @Override // tb.m5d.c
            public void a(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                ckf.g(str, "filePath");
                TMSLogger.b(TBTMSColdLaunchTask.TAG, "主包预加载成功: " + this.f13760a.a() + ", " + System.currentTimeMillis());
                Log.e(TBTMSColdLaunchTask.TAG, "主包预加载成功: " + this.f13760a.a() + ", " + System.currentTimeMillis());
            }

            @Override // tb.m5d.c
            public void b(m5d.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79bd4dfc", new Object[]{this, bVar});
                    return;
                }
                ckf.g(bVar, "error");
                TMSLogger.b(TBTMSColdLaunchTask.TAG, "主包预加载失败:" + this.f13760a.a() + " error: " + bVar.a() + ", msg: " + ((Object) bVar.b()));
                Log.e(TBTMSColdLaunchTask.TAG, "主包预加载失败:" + this.f13760a.a() + " error: " + bVar.a() + ", msg: " + ((Object) bVar.b()));
            }

            @Override // tb.m5d.c
            public void onDownloadProgress(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                }
            }
        }

        public e(String str, TMSSolutionType tMSSolutionType, String str2, hpx hpxVar) {
            this.f13759a = str;
            this.b = tMSSolutionType;
            this.c = str2;
            this.d = hpxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r51 appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f13759a);
            if (appInfoSync != null) {
                TMSSolutionType tMSSolutionType = this.b;
                String str = this.c;
                String str2 = this.f13759a;
                hpx hpxVar = this.d;
                if (appInfoSync.f() && appInfoSync.a() != null) {
                    AppModel a2 = appInfoSync.a();
                    ckf.f(a2, RVConstants.EXTRA_APPINFO);
                    TBTMSColdLaunchTask.preloadHTMLResource$default(tMSSolutionType, new TMSMetaInfoWrapper(a2), str, false, 8, null);
                    yas.a();
                    String name = a2.getAppInfoModel().getName();
                    ckf.f(name, "appInfo.appInfoModel.name");
                    String appId = a2.getAppId();
                    ckf.f(appId, "appInfo.appId");
                    String appVersion = a2.getAppVersion();
                    ckf.f(appVersion, "appInfo.appVersion");
                    AppInfoModel appInfoModel = a2.getAppInfoModel();
                    String bytePackageUrl = appInfoModel == null ? null : appInfoModel.getBytePackageUrl();
                    JSONObject extendInfos = a2.getExtendInfos();
                    jkl jklVar = new jkl(name, appId, appVersion, bytePackageUrl, extendInfos == null ? null : extendInfos.getJSONObject("byteCacheInfo"));
                    TMSLogger.b(TBTMSColdLaunchTask.TAG, "预加载主包 " + str2 + " start: " + System.currentTimeMillis());
                    hpxVar.a(jklVar, new a(jklVar));
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13761a;
        public final /* synthetic */ hpx b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements m5d.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ jkl f13762a;

            public a(jkl jklVar) {
                this.f13762a = jklVar;
            }

            @Override // tb.m5d.c
            public void a(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a53ae29", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                ckf.g(str, "filePath");
                TMSLogger.b(TBTMSColdLaunchTask.TAG, "框架包预加载成功： " + this.f13762a.a() + ", " + System.currentTimeMillis());
            }

            @Override // tb.m5d.c
            public void b(m5d.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79bd4dfc", new Object[]{this, bVar});
                    return;
                }
                ckf.g(bVar, "error");
                TMSLogger.b(TBTMSColdLaunchTask.TAG, "框架包预加载失败: " + this.f13762a.a() + " error: " + bVar.a() + ", msg: " + ((Object) bVar.b()));
            }

            @Override // tb.m5d.c
            public void onDownloadProgress(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                }
            }
        }

        public f(String str, hpx hpxVar) {
            this.f13761a = str;
            this.b = hpxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            yas.a();
            r51 appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.f13761a);
            if (appInfoSync != null) {
                String str = this.f13761a;
                hpx hpxVar = this.b;
                if (appInfoSync.f() && appInfoSync.a() != null) {
                    AppModel a2 = appInfoSync.a();
                    String name = a2.getAppInfoModel().getName();
                    ckf.f(name, "frameworkInfo.appInfoModel.name");
                    String appId = a2.getAppId();
                    ckf.f(appId, "frameworkInfo.appId");
                    String appVersion = a2.getAppVersion();
                    ckf.f(appVersion, "frameworkInfo.appVersion");
                    AppInfoModel appInfoModel = a2.getAppInfoModel();
                    String packageUrl = appInfoModel == null ? null : appInfoModel.getPackageUrl();
                    JSONObject extendInfos = a2.getExtendInfos();
                    jkl jklVar = new jkl(name, appId, appVersion, packageUrl, extendInfos == null ? null : extendInfos.getJSONObject("cacheInfo"));
                    TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("预加载框架包 start: ", str));
                    hpxVar.a(jklVar, new a(jklVar));
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f13764a;

        public h(Application application) {
            this.f13764a = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            com.taobao.android.weex.b.d().a(WeexInstanceMode.DOM, this.f13764a);
            TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("preload weex core end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13765a;
        public final /* synthetic */ Application b;

        public i(String str, Application application) {
            this.f13765a = str;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!q9s.E1()) {
                TMSLogger.b(TBTMSColdLaunchTask.TAG, "preload weex enablePrefetchWeex is false");
            } else {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = wes.a(this.f13765a);
                    if (a2 != null) {
                        yas.a();
                        com.taobao.android.weex.b.d().d(this.b, a2);
                        TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("preload weex document end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    }
                } catch (Exception e) {
                    TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("preDownloadScript error ", e.getMessage()));
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f13766a;
        public final /* synthetic */ HashMap<String, Object> b;
        public final /* synthetic */ String c;

        public j(Application application, HashMap<String, Object> hashMap, String str) {
            this.f13766a = application;
            this.b = hashMap;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            swe.a(this.f13766a, this.b);
            new TMSPrefetchDataManager().e(this.c);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSSolutionType f13767a;
        public final /* synthetic */ Application b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(847249462);
                int[] iArr = new int[TMSSolutionType.values().length];
                iArr[TMSSolutionType.MINIGAME.ordinal()] = 1;
                iArr[TMSSolutionType.MIX.ordinal()] = 2;
                iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public k(TMSSolutionType tMSSolutionType, Application application) {
            this.f13767a = tMSSolutionType;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("start preload engine: ", this.f13767a));
            int i = a.$EnumSwitchMapping$0[this.f13767a.ordinal()];
            if (i == 1) {
                WVJsi.loadJsi(this.b);
                com.taobao.android.weex.b.d().c(this.b);
                TMSGraphicsLibraryInit.e();
            } else if (i == 2 || i == 3) {
                uds.b();
            }
        }
    }

    static {
        t2o.a(847249448);
    }

    private TBTMSColdLaunchTask() {
    }

    public static final /* synthetic */ void access$initV2(Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d30f967", new Object[]{application, hashMap});
        } else {
            initV2(application, hashMap);
        }
    }

    private final String addUrlSessionId(String str, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1701dd5", new Object[]{this, str, application});
        }
        try {
            String utdid = UTDevice.getUtdid(application.getApplicationContext());
            ckf.f(utdid, "getUtdid(application.applicationContext)");
            String c2 = ycs.c(utdid);
            if (q9s.u(str) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(c2)) {
                return ies.g(str).buildUpon().appendQueryParameter("tms_session_id", c2).build().toString();
            }
            return str;
        } catch (Exception e2) {
            TMSLogger.b(TAG, ckf.p("addUrlSessionId error: ", e2.getMessage()));
            return str;
        }
    }

    @JvmStatic
    public static final void init(Application application, HashMap<String, Object> hashMap) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        ckf.g(application, "application");
        ckf.g(hashMap, "params");
        IpChange ipChange2 = rds.$ipChange;
        long currentTimeMillis = System.currentTimeMillis();
        abs.c(application.getApplicationContext());
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(application, "enableWvPreStartup");
        long currentTimeMillis3 = System.currentTimeMillis();
        if (isFeatureOpened) {
            WVOptimizedStartup.startup(new WVOptimizedStartup.Params(application));
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        try {
            if (h8s.f(application.getApplicationContext(), "enableAsyncExecuteTask").d()) {
                IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
                if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) == null)) {
                    executor.execute(new a(application, hashMap));
                }
            } else {
                initV2(application, hashMap);
            }
        } catch (Throwable th) {
            TMSLogger.b(TAG, ckf.p("init error ", th.getMessage()));
        }
        TMSLogger.b(TAG, "TBTMSColdLaunchTask end, enableWvPreStartup=" + isFeatureOpened + " cost: " + (System.currentTimeMillis() - currentTimeMillis) + ", readSwitch: " + (currentTimeMillis3 - currentTimeMillis2) + ", startup: " + (currentTimeMillis4 - currentTimeMillis3));
    }

    @JvmStatic
    private static final void initHomePageGateway(Application application) {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78e22d2", new Object[]{application});
        } else if (q9s.Q0() && (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new b(application));
        }
    }

    @JvmStatic
    private static final void preFetchUniApp(TMSSolutionType tMSSolutionType, String str, Application application) {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e4ca96", new Object[]{tMSSolutionType, str, application});
        } else if (tMSSolutionType == TMSSolutionType.UNIAPP && q9s.z1() && (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new g(str, application));
        }
    }

    @JvmStatic
    private static final void preFetchWeex(TMSSolutionType tMSSolutionType, String str, Application application, HashMap<String, Object> hashMap) {
        Executor executor;
        Executor executor2;
        Executor executor3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cd66ad", new Object[]{tMSSolutionType, str, application, hashMap});
        } else if (tMSSolutionType == TMSSolutionType.WEEX && q9s.A1()) {
            Uri g2 = ies.g(str);
            if (!g2.isHierarchical() || ckf.b(g2.getQueryParameter("afc_tms_weex"), "true")) {
                IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
                if (!(iExecutorService == null || (executor3 = iExecutorService.getExecutor(ExecutorType.URGENT)) == null)) {
                    executor3.execute(new h(application));
                }
                IExecutorService iExecutorService2 = (IExecutorService) p8s.b(IExecutorService.class);
                if (!(iExecutorService2 == null || (executor2 = iExecutorService2.getExecutor(ExecutorType.URGENT)) == null)) {
                    executor2.execute(new i(str, application));
                }
                IExecutorService iExecutorService3 = (IExecutorService) p8s.b(IExecutorService.class);
                if (iExecutorService3 != null && (executor = iExecutorService3.getExecutor(ExecutorType.URGENT)) != null) {
                    executor.execute(new j(application, hashMap, str));
                }
            }
        }
    }

    @JvmStatic
    private static final void preloadEngine(TMSSolutionType tMSSolutionType, String str, Application application) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85838bb9", new Object[]{tMSSolutionType, str, application});
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null)) {
            executor.execute(new k(tMSSolutionType, application));
        }
        TMSLogger.b(TAG, ckf.p("finish preload engine: ", tMSSolutionType));
    }

    @JvmStatic
    public static final void preloadHTMLResource(TMSSolutionType tMSSolutionType, TMSMetaInfoWrapper tMSMetaInfoWrapper, String str, boolean z) {
        String pageUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4311b87c", new Object[]{tMSSolutionType, tMSMetaInfoWrapper, str, new Boolean(z)});
            return;
        }
        ckf.g(tMSSolutionType, "type");
        ckf.g(tMSMetaInfoWrapper, "metaInfo");
        ckf.g(str, "url");
        if (tMSSolutionType == TMSSolutionType.MIX) {
            MixPageInfo d2 = ubs.d(str, ubs.e(tMSMetaInfoWrapper));
            if (TextUtils.equals("h5", d2 == null ? null : d2.getPageType()) && d2 != null && (pageUrl = d2.getPageUrl()) != null) {
                HTMLPrefetchJob.preloadHTMLResource(pageUrl, z);
            }
        }
    }

    public static /* synthetic */ void preloadHTMLResource$default(TMSSolutionType tMSSolutionType, TMSMetaInfoWrapper tMSMetaInfoWrapper, String str, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d950ab66", new Object[]{tMSSolutionType, tMSMetaInfoWrapper, str, new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        preloadHTMLResource(tMSSolutionType, tMSMetaInfoWrapper, str, z);
    }

    @JvmStatic
    public static final void webSinglePageSolutionPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa668e36", new Object[]{str});
            return;
        }
        ckf.g(str, "url");
        TMSLogger.b(TAG, "H5 文档预请求");
        android.taobao.windvane.export.network.b.i(new Request.b().l(str).i("GET").j(l.INSTANCE).f());
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13763a;
        public final /* synthetic */ Application b;

        public g(String str, Application application) {
            this.f13763a = str;
            this.b = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ges gesVar = ges.INSTANCE;
            ges.a o = gesVar.o(this.f13763a);
            if (o != null && o.j() != null) {
                AppManifestDao h = AppManifestManager.INSTANCE.h(o);
                long currentTimeMillis = System.currentTimeMillis();
                TMSMetaInfoWrapper tMSMetaInfoWrapper = null;
                if ((h == null ? null : h.getAppManifest()) != null) {
                    AppManifest appManifest = h.getAppManifest();
                    ckf.d(appManifest);
                    tMSMetaInfoWrapper = new TMSMetaInfoWrapper(appManifest, o);
                }
                if (q9s.INSTANCE.y2() && o.g() && tMSMetaInfoWrapper == null) {
                    z = true;
                }
                boolean o1 = q9s.o1();
                if (o1) {
                    zgv.INSTANCE.h(o, tMSMetaInfoWrapper, z);
                    TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("doPrefetch document end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                }
                if (tMSMetaInfoWrapper == null && !z) {
                    zgv.INSTANCE.i(o);
                } else if (tMSMetaInfoWrapper != null) {
                    if (!o1) {
                        zgv.INSTANCE.g(o, tMSMetaInfoWrapper);
                        TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("doPrefetch document end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    }
                    zgv.INSTANCE.f(o, tMSMetaInfoWrapper);
                    TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("doPrefetch data end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                    AppManifest.Page h2 = gesVar.h(o, tMSMetaInfoWrapper);
                    if (h2 != null) {
                        if (ckf.b(h2.getRenderer(), "web")) {
                            uds.b();
                            TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("preload uc core end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                        } else if (ckf.b(h2.getRenderer(), "weex")) {
                            com.taobao.android.weex.b.d().a(WeexInstanceMode.DOM, this.b);
                            TMSLogger.b(TBTMSColdLaunchTask.TAG, ckf.p("preload weex core end, cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                        }
                    }
                }
            }
        }
    }

    @JvmStatic
    private static final void preFetchAppInfo(String str, TMSSolutionType tMSSolutionType, String str2) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c83bcf", new Object[]{str, tMSSolutionType, str2});
            return;
        }
        TMSLogger.b(TAG, "预加载 appInfo : " + str + ", timestamp: " + System.currentTimeMillis());
        AppInfoPrefetchJob.prefetchAppInfo$default(str, str2, false, 4, null);
        hpx hpxVar = new hpx();
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new e(str, tMSSolutionType, str2, hpxVar));
        }
    }

    @JvmStatic
    private static final void preFetchFrameworkInfo(TMSSolutionType tMSSolutionType, String str) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ef7f9c", new Object[]{tMSSolutionType, str});
        } else if (TMSSolutionType.MINIGAME == tMSSolutionType) {
            TMSLogger.b(TAG, "预加载 frameworkInfo frameworkId: 3000000079517433, timestamp: " + System.currentTimeMillis());
            Log.e(TAG, "预加载 frameworkInfo frameworkId: 3000000079517433, timestamp: " + System.currentTimeMillis());
            AppInfoPrefetchJob.prefetchAppInfo("3000000079517433", str, true);
            hpx hpxVar = new hpx();
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
                executor.execute(new f("3000000079517433", hpxVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class l implements ecd {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final l INSTANCE = new l();

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (tb.wsq.O(r7, r8, false, 2, null) != false) goto L_0x0040;
         */
        @Override // tb.ecd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.themis.taobao.impl.TBTMSColdLaunchTask.l.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001f
                java.lang.String r4 = "216932e4"
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r6
                r5[r1] = r7
                r5[r0] = r8
                java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                return r7
            L_0x001f:
                boolean r3 = android.text.TextUtils.isEmpty(r7)
                if (r3 != 0) goto L_0x003f
                boolean r3 = android.text.TextUtils.isEmpty(r8)
                if (r3 != 0) goto L_0x003f
                java.lang.String r3 = "requestUrl"
                tb.ckf.f(r7, r3)
                java.lang.String r3 = "prefetchUrl"
                tb.ckf.f(r8, r3)
                r3 = 0
                boolean r7 = tb.wsq.O(r7, r8, r2, r0, r3)
                if (r7 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r1 = 0
            L_0x0040:
                if (r1 == 0) goto L_0x0049
                java.lang.String r7 = "TMS 极简链路"
                java.lang.String r8 = "H5 文档预请求成功"
                com.taobao.themis.kernel.basic.TMSLogger.b(r7, r8)
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.taobao.impl.TBTMSColdLaunchTask.l.a(java.lang.String, java.lang.String):boolean");
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 2 */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void initV2(android.app.Application r9, java.util.HashMap<java.lang.String, java.lang.Object> r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.taobao.impl.TBTMSColdLaunchTask.initV2(android.app.Application, java.util.HashMap):void");
    }
}
