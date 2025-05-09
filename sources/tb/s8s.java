package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.appinfo.AppInfoPrefetchJob;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Pair;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s8s extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean k = false;
    public volatile boolean l = false;
    public volatile boolean m = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r51 appInfoSync = AppInfoPrefetchJob.getAppInfoSync(s8s.this.b.L());
            if (appInfoSync == null) {
                TMSLogger.b("TMSAppInfoStep", "AppInfo onError：null");
                s8s.k(s8s.this, eas.f);
            } else if (appInfoSync.f()) {
                AppModel a2 = appInfoSync.a();
                if (a2 != null) {
                    TMSLogger.b("TMSAppInfoStep", "命中极简链路预请求 appInfo 非缓存:" + a2.getAppId());
                    TMSLogger.b("TMSAppInfoStep", "AppInfo success:[" + a2 + "]");
                    s8s.this.b.s0(new TMSMetaInfoWrapper(a2));
                }
                s8s.l(s8s.this, a2, appInfoSync.e());
                s8s.m(s8s.this);
            } else {
                TMSLogger.b("TMSAppInfoStep", "AppInfo onError, errorCode: " + appInfoSync.b() + " ,errorMsg: " + appInfoSync.d() + " ,errorInfo: " + appInfoSync.c());
                s8s s8sVar = s8s.this;
                s8s.o(s8sVar, s8s.n(s8sVar, appInfoSync.b(), appInfoSync.d()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements h51 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h51
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad55cbb9", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            if (appModel != null) {
                TMSLogger.b("TMSAppInfoStep", "AppInfo success:[" + appModel + "]");
            }
            s8s.l(s8s.this, appModel, appInfoStrategy);
        }

        @Override // tb.h51
        public void b(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4804eec", new Object[]{this, str, str2, jSONObject});
                return;
            }
            TMSLogger.b("TMSAppInfoStep", "AppInfo onError：" + str + "_" + str2);
            s8s s8sVar = s8s.this;
            s8s.p(s8sVar, s8s.n(s8sVar, str, str2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements h51 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.h51
        public void a(AppModel appModel, AppInfoStrategy appInfoStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad55cbb9", new Object[]{this, appModel, appInfoStrategy});
                return;
            }
            TMSLogger.b("TMSAppInfoStep", "Framework AppInfo success");
            s8s.this.b.r0(new TMSMetaInfoWrapper(appModel));
            s8s.q(s8s.this);
        }

        @Override // tb.h51
        public void b(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4804eec", new Object[]{this, str, str2, jSONObject});
                return;
            }
            TMSLogger.b("TMSAppInfoStep", "Framework AppInfo onError：" + str + "_" + str2);
            s8s s8sVar = s8s.this;
            s8s.r(s8sVar, s8s.n(s8sVar, str, str2));
        }
    }

    static {
        t2o.a(843055261);
    }

    public s8s(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
    }

    public static /* synthetic */ Object ipc$super(s8s s8sVar, String str, Object... objArr) {
        if (str.hashCode() == -790391893) {
            super.i();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/launch_step/TMSAppInfoStep");
    }

    public static /* synthetic */ void k(s8s s8sVar, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4060e4d4", new Object[]{s8sVar, easVar});
        } else {
            s8sVar.g(easVar);
        }
    }

    public static /* synthetic */ void l(s8s s8sVar, AppModel appModel, AppInfoStrategy appInfoStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da67082", new Object[]{s8sVar, appModel, appInfoStrategy});
        } else {
            s8sVar.w(appModel, appInfoStrategy);
        }
    }

    public static /* synthetic */ void m(s8s s8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83032ae1", new Object[]{s8sVar});
        } else {
            s8sVar.u();
        }
    }

    public static /* synthetic */ eas n(s8s s8sVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eas) ipChange.ipc$dispatch("792e911b", new Object[]{s8sVar, str, str2});
        }
        return s8sVar.t(str, str2);
    }

    public static /* synthetic */ void o(s8s s8sVar, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70e56d8", new Object[]{s8sVar, easVar});
        } else {
            s8sVar.g(easVar);
        }
    }

    public static /* synthetic */ void p(s8s s8sVar, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb9b359", new Object[]{s8sVar, easVar});
        } else {
            s8sVar.g(easVar);
        }
    }

    public static /* synthetic */ void q(s8s s8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b7875d", new Object[]{s8sVar});
        } else {
            s8sVar.v();
        }
    }

    public static /* synthetic */ void r(s8s s8sVar, eas easVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88106c5b", new Object[]{s8sVar, easVar});
        } else {
            s8sVar.g(easVar);
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "AppInfo";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        if (bbsVar != null && !bbsVar.g0()) {
            x();
            y();
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
        } else if (!this.m) {
            this.m = true;
            this.b.S().b("appInfoStepFinish");
            gld m = CommonExtKt.m(this.b);
            if (m != null) {
                m.C("appInfoStepFinish");
            }
            lwd lwdVar = this.j;
            if (lwdVar != null) {
                lwdVar.c();
            }
            super.i();
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f144fc70", new Object[]{this});
        } else if (this.k && this.l) {
            i();
        }
    }

    public final eas t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eas) ipChange.ipc$dispatch("61f52a7e", new Object[]{this, str, str2});
        }
        if (TextUtils.equals(str, ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT)) {
            return new eas("TMS_ERR_AI_TIMEOUT", "appInfo请求超时", "");
        }
        return new eas(eas.TMS_ERR_APPINFO_PREFIX + str, "appInfo mtop请求错误", "");
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34851064", new Object[]{this});
            return;
        }
        this.k = true;
        s();
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41494e7", new Object[]{this});
            return;
        }
        this.l = true;
        s();
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4d5c0c", new Object[]{this});
            return;
        }
        i8c i8cVar = (i8c) this.b.getExtension(i8c.class);
        if (i8cVar == null) {
            TMSLogger.b("TMSAppInfoStep", "Don't need framework");
            v();
            return;
        }
        String F = i8cVar.F();
        if (TextUtils.isEmpty(F)) {
            TMSLogger.b("TMSAppInfoStep", "Don't need framework");
            v();
            return;
        }
        mcs.e("Themis/Launch/" + c(), mcs.EVENT_REQUEST, this.c, this.c + "_framework", new JSONObject());
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = F;
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b(basicRequestParam);
        bVar.e = null;
        bVar.f13591a = AppInfoScene.ONLINE;
        bVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.ASYNCLOAD;
        n51.i().j(bVar, true, new c());
    }

    public final void x() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9020fef", new Object[]{this});
            return;
        }
        this.b.S().b("appInfoStepStart");
        gld m = CommonExtKt.m(this.b);
        if (m != null) {
            m.C("appInfoStepStart");
        }
        if (TextUtils.isEmpty(this.b.L())) {
            TMSLogger.b("TMSAppInfoStep", "Don't need instance appInfo");
            u();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", (Object) "app|bundle");
        String str = this.c;
        mcs.e(mcs.MODULE_LAUNCH_APPINFO, mcs.EVENT_REQUEST, str, this.c + "_app", jSONObject);
        if (AppInfoPrefetchJob.hasPrefetchAppInfo(this.b.L())) {
            TMSLogger.b("TMSAppInfoStep", "hasPrefetchAppInfo:" + this.b.L());
            r51 appInfoSync = AppInfoPrefetchJob.getAppInfoSync(this.b.L());
            if (appInfoSync != null && appInfoSync.f()) {
                AppModel a2 = appInfoSync.a();
                if (a2 != null) {
                    TMSLogger.b("TMSAppInfoStep", "命中极简链路预请求 appInfo 缓存:" + a2.getAppId());
                    TMSLogger.b("TMSAppInfoStep", "AppInfo success:[" + a2 + "]");
                    this.b.s0(new TMSMetaInfoWrapper(a2));
                }
                w(a2, appInfoSync.e());
                u();
                return;
            }
        }
        if (AppInfoPrefetchJob.isNeedPrefetch(this.b.L())) {
            TMSLogger.b("TMSAppInfoStep", "isNeedPrefetch:" + this.b.L());
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.URGENT).execute(new a());
            return;
        }
        AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam = new AbsAppInfoRequestConfig.BasicRequestParam();
        basicRequestParam.appId = this.b.L();
        if (!TextUtils.isEmpty(this.b.c0().getNBSVersion())) {
            basicRequestParam.version = this.b.c0().getNBSVersion();
        } else {
            basicRequestParam.version = "*";
        }
        basicRequestParam.url = this.b.e0();
        com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b bVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.b(basicRequestParam);
        bVar.e = this.b.c0();
        AppInfoScene nBScene = this.b.c0().getNBScene();
        bVar.f13591a = nBScene;
        if (!(nBScene == AppInfoScene.DEBUG || nBScene == AppInfoScene.TRIAL)) {
            z = true;
        }
        bVar.b = z;
        n51.i().j(bVar, z, new b());
    }

    public final void w(AppModel appModel, AppInfoStrategy appInfoStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b4c3e5", new Object[]{this, appModel, appInfoStrategy});
            return;
        }
        if (q9s.k2()) {
            yht yhtVar = yht.INSTANCE;
            if (yhtVar.b(appModel) && yhtVar.a()) {
                yhtVar.c(this.b);
            }
        }
        this.b.s0(new TMSMetaInfoWrapper(appModel));
        this.b.S().a("appInfoStrategy", appInfoStrategy.getName());
        String str = this.c;
        mcs.e(mcs.MODULE_LAUNCH_APPINFO, mcs.EVENT_RESPONSE, str, this.c + "_app", arf.b(new Pair("expiredType", appInfoStrategy.getName()), new Pair("mainApp", new TMSMetaInfoWrapper(appModel).x())));
        u();
        gld m = CommonExtKt.m(this.b);
        if (m != null) {
            if (appInfoStrategy == AppInfoStrategy.SYNC_LOAD || appInfoStrategy == AppInfoStrategy.FORCE_SYNC_LOAD) {
                m.D("isAppInfoLocal", "false");
            } else {
                m.D("isAppInfoLocal", "true");
            }
            m.D("appInfoStrategy", appInfoStrategy.getName());
        }
    }
}
