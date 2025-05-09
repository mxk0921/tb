package com.taobao.themis.pub.extension;

import android.app.Activity;
import android.graphics.Bitmap;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.themis.kernel.adapter.IDeviceInfoAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.pub_kit.guide.model.PubNavBarModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.teenager_protect.PubTeenagerProtectionManager;
import com.taobao.themis.pub_kit.utils.PubKitCommonUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.fbs;
import tb.fnd;
import tb.n4d;
import tb.ner;
import tb.p8s;
import tb.q9s;
import tb.rdc;
import tb.t2o;
import tb.v0e;
import tb.x2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TinyAppExtension implements v0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13684a;
    public volatile boolean b;
    public boolean c;
    public PubTeenagerProtectionManager d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(844103688);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements fnd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ JSONObject f;

        public b(long j, boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
            this.b = j;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = jSONObject;
        }

        @Override // tb.fnd.b
        public void a(Bitmap bitmap) {
            String str;
            JSONObject jSONObject;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9676a4e2", new Object[]{this, bitmap});
                return;
            }
            if (bitmap != null) {
                TinyAppExtension.t(TinyAppExtension.this, true);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            StringBuilder sb = new StringBuilder("backHome with bitmap: ");
            if (bitmap == null) {
                z = false;
            }
            sb.append(z);
            sb.append(", screenShotCostTime: ");
            sb.append(currentTimeMillis);
            TMSLogger.f("TinyAppExtension", sb.toString());
            int t3 = q9s.t3();
            Activity I = TinyAppExtension.b(TinyAppExtension.this).I();
            ckf.f(I, "instance.activity");
            String L = TinyAppExtension.b(TinyAppExtension.this).L();
            ckf.f(L, "instance.appId");
            boolean z2 = this.c;
            boolean z3 = this.d;
            if (!this.e || (jSONObject = this.f) == null) {
                str = null;
            } else {
                str = jSONObject.getString(rdc.a.BACK_HOME_LOCATION);
            }
            ner.p(I, L, z2, z3, bitmap, str, Integer.valueOf(t3));
            if (q9s.R()) {
                TinyAppExtension.b(TinyAppExtension.this).W().e();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ ITMSPage f;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<Bitmap> f13687a;
            public final /* synthetic */ ITMSPage b;
            public final /* synthetic */ CountDownLatch c;

            public a(Ref$ObjectRef<Bitmap> ref$ObjectRef, ITMSPage iTMSPage, CountDownLatch countDownLatch) {
                this.f13687a = ref$ObjectRef;
                this.b = iTMSPage;
                this.c = countDownLatch;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [T, android.graphics.Bitmap] */
            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f13687a.element = this.b.l();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        public c(boolean z, boolean z2, boolean z3, JSONObject jSONObject, ITMSPage iTMSPage) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = jSONObject;
            this.f = iTMSPage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            JSONObject jSONObject;
            Executor executor;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.IO)) == null)) {
                executor.execute(new a(ref$ObjectRef, this.f, countDownLatch));
            }
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                TMSLogger.b("TinyAppExtension", "get current page snapshot timeout");
            }
            if (ref$ObjectRef.element != 0) {
                TinyAppExtension.t(TinyAppExtension.this, true);
            }
            if (ref$ObjectRef.element != 0) {
                z = true;
            }
            TMSLogger.f("TinyAppExtension", ckf.p("backHome with bitmap: ", Boolean.valueOf(z)));
            int t3 = q9s.t3();
            Activity I = TinyAppExtension.b(TinyAppExtension.this).I();
            ckf.f(I, "instance.activity");
            String L = TinyAppExtension.b(TinyAppExtension.this).L();
            ckf.f(L, "instance.appId");
            boolean z2 = this.b;
            boolean z3 = this.c;
            Bitmap bitmap = (Bitmap) ref$ObjectRef.element;
            if (!this.d || (jSONObject = this.e) == null) {
                str = null;
            } else {
                str = jSONObject.getString(rdc.a.BACK_HOME_LOCATION);
            }
            ner.p(I, L, z2, z3, bitmap, str, Integer.valueOf(t3));
            if (q9s.R()) {
                TinyAppExtension.b(TinyAppExtension.this).W().e();
            }
        }
    }

    static {
        t2o.a(844103687);
        t2o.a(844103682);
    }

    public TinyAppExtension(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f13684a = bbsVar;
    }

    public static final /* synthetic */ bbs b(TinyAppExtension tinyAppExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("a694afdb", new Object[]{tinyAppExtension});
        }
        return tinyAppExtension.f13684a;
    }

    public static final /* synthetic */ void t(TinyAppExtension tinyAppExtension, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d8b44c", new Object[]{tinyAppExtension, new Boolean(z)});
        } else {
            tinyAppExtension.b = z;
        }
    }

    public static final /* synthetic */ void y(TinyAppExtension tinyAppExtension, PubTeenagerProtectionManager pubTeenagerProtectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22e8b6e", new Object[]{tinyAppExtension, pubTeenagerProtectionManager});
        } else {
            tinyAppExtension.d = pubTeenagerProtectionManager;
        }
    }

    @Override // tb.t4c
    public void N(final bbs bbsVar) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        v0e.a.a(this, bbsVar);
        if (q9s.G1()) {
            AppModel appModel = null;
            if (bbsVar.a0() == TMSSolutionType.UNIAPP) {
                PubKitCommonUtils pubKitCommonUtils = PubKitCommonUtils.INSTANCE;
                TMSMetaInfoWrapper U = bbsVar.U();
                if (pubKitCommonUtils.b(U == null ? null : U.r())) {
                    TMSLogger.b("TinyAppExtension", "当前轻应用走开放平台侧未保");
                    return;
                }
            }
            PubKitCommonUtils pubKitCommonUtils2 = PubKitCommonUtils.INSTANCE;
            TMSMetaInfoWrapper U2 = bbsVar.U();
            if (U2 != null) {
                appModel = U2.c();
            }
            if (pubKitCommonUtils2.a(appModel)) {
                TMSLogger.b("TinyAppExtension", "当前轻应用走开放平台侧未保");
                return;
            }
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) != null) {
                executor.execute(new Runnable() { // from class: com.taobao.themis.pub.extension.TinyAppExtension$onRegister$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                    public static final class a implements bbs.f {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ PubTeenagerProtectionManager f13689a;

                        public a(PubTeenagerProtectionManager pubTeenagerProtectionManager) {
                            this.f13689a = pubTeenagerProtectionManager;
                        }

                        @Override // tb.bbs.f
                        public void onPause() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                            } else {
                                this.f13689a.g();
                            }
                        }

                        @Override // tb.bbs.f
                        public void onResume() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                            } else {
                                this.f13689a.f();
                            }
                        }

                        @Override // tb.bbs.f
                        public void onStart() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                            }
                        }

                        @Override // tb.bbs.f
                        public void onStop() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Activity I = bbs.this.I();
                        ckf.f(I, "instance.activity");
                        PubTeenagerProtectionManager pubTeenagerProtectionManager = new PubTeenagerProtectionManager(I, new TinyAppExtension$onRegister$1$teenagerProtectionManager$1(bbs.this));
                        pubTeenagerProtectionManager.d();
                        bbs.this.F(new a(pubTeenagerProtectionManager));
                        TinyAppExtension.y(this, pubTeenagerProtectionManager);
                    }
                });
            }
        }
    }

    @Override // tb.v0e
    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1504a29b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        v0e.a.b(this);
        PubTeenagerProtectionManager pubTeenagerProtectionManager = this.d;
        if (pubTeenagerProtectionManager != null) {
            pubTeenagerProtectionManager.h();
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9b44cf", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.v0e
    public void p(ITMSPage iTMSPage) {
        Executor executor;
        MtopConfig mtopConfig;
        PubNavBarModel navbar;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6730098", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.c = true;
        if (this.f13684a.getExtension(n4d.class) == null || !ner.INSTANCE.d(fbs.d(this.f13684a))) {
            z = false;
        }
        ner nerVar = ner.INSTANCE;
        boolean d = nerVar.d(fbs.d(this.f13684a));
        TMSLogger.f("TinyAppExtension", "isOutLinkBackGuideAnime: " + z + ", isLightingIconAnime: " + d);
        if (q9s.i(this.f13684a.L())) {
            TMSLogger.b("TinyAppExtension", "disableBackHome");
            this.f13684a.W().e();
        } else if (q9s.c0() || !iTMSPage.getInstance().c0().isFragmentContainer()) {
            PubUserGuideModule b2 = fbs.b(this.f13684a);
            EnvModeEnum envModeEnum = null;
            if (ckf.b((b2 == null || (navbar = b2.getNavbar()) == null) ? null : navbar.getCloseButtonEvent(), "toUpperPage")) {
                TMSLogger.f("TinyAppExtension", "toUpperPage");
                this.f13684a.W().e();
            } else if (!q9s.O0()) {
                TMSLogger.b("TinyAppExtension", "orange开关管控");
                Activity I = this.f13684a.I();
                ckf.f(I, "instance.activity");
                String L = this.f13684a.L();
                ckf.f(L, "instance.appId");
                ner.q(I, L, z, d, null, null, null, 96, null);
                if (q9s.INSTANCE.S()) {
                    this.f13684a.W().e();
                }
            } else if (TBDeviceUtils.P(this.f13684a.I()) || TBDeviceUtils.p(this.f13684a.I())) {
                TMSLogger.b("TinyAppExtension", "当前设备为平板|折叠屏，不展示收缩动效");
                Activity I2 = this.f13684a.I();
                ckf.f(I2, "instance.activity");
                String L2 = this.f13684a.L();
                ckf.f(L2, "instance.appId");
                ner.q(I2, L2, z, d, null, null, null, 96, null);
                if (q9s.INSTANCE.S()) {
                    this.f13684a.W().e();
                }
            } else {
                int deviceScore = ((IDeviceInfoAdapter) p8s.g(IDeviceInfoAdapter.class)).getDeviceScore();
                if (deviceScore < q9s.s3()) {
                    Mtop instance = Mtop.getInstance(Mtop.Id.INNER);
                    if (!(instance == null || (mtopConfig = instance.getMtopConfig()) == null)) {
                        envModeEnum = mtopConfig.envMode;
                    }
                    if (envModeEnum != EnvModeEnum.PREPARE) {
                        Activity I3 = this.f13684a.I();
                        ckf.f(I3, "instance.activity");
                        String L3 = this.f13684a.L();
                        ckf.f(L3, "instance.appId");
                        ner.q(I3, L3, z, d, null, null, null, 96, null);
                        if (q9s.INSTANCE.S()) {
                            this.f13684a.W().e();
                        }
                        TMSLogger.b("TinyAppExtension", ckf.p("机型分数不满足条件, score: ", Integer.valueOf(deviceScore)));
                        return;
                    }
                }
                if (!fbs.a(this.f13684a)) {
                    Activity I4 = this.f13684a.I();
                    ckf.f(I4, "instance.activity");
                    String L4 = this.f13684a.L();
                    ckf.f(L4, "instance.appId");
                    ner.q(I4, L4, z, d, null, null, null, 96, null);
                    if (q9s.INSTANCE.S()) {
                        this.f13684a.W().e();
                    }
                    TMSLogger.b("TinyAppExtension", "首页没有回缩位置（不在当前那一屏）");
                    return;
                }
                boolean e = nerVar.e(fbs.d(this.f13684a));
                JSONObject a2 = nerVar.a(fbs.d(this.f13684a));
                if (e) {
                    if (a2 != null) {
                        z2 = ckf.b(a2.getBoolean("enableBackHomeAnim"), Boolean.TRUE);
                    }
                    if (!z2) {
                        Activity I5 = this.f13684a.I();
                        ckf.f(I5, "instance.activity");
                        String L5 = this.f13684a.L();
                        ckf.f(L5, "instance.appId");
                        ner.q(I5, L5, z, d, null, null, null, 96, null);
                        if (q9s.INSTANCE.S()) {
                            this.f13684a.W().e();
                        }
                        TMSLogger.b("TinyAppExtension", "enableBackHomeAnim is false，服务端控制不满足条件");
                        return;
                    }
                } else {
                    JSONArray e2 = fbs.e(this.f13684a);
                    if (!ner.n(e2) && !ner.o(e2)) {
                        TMSLogger.b("TinyAppExtension", "首屏无可收缩位置，不展示动画");
                        Activity I6 = this.f13684a.I();
                        ckf.f(I6, "instance.activity");
                        String L6 = this.f13684a.L();
                        ckf.f(L6, "instance.appId");
                        ner.q(I6, L6, z, d, null, x2n.b(this.f13684a), null, 64, null);
                        if (q9s.INSTANCE.S()) {
                            this.f13684a.W().e();
                            return;
                        }
                        return;
                    }
                }
                TMSLogger.f("TinyAppExtension", "start backHome with bitmap");
                if (q9s.m0()) {
                    fnd fndVar = (fnd) iTMSPage.getExtension(fnd.class);
                    if (fndVar == null) {
                        TMSLogger.b("TinyAppExtension", "screenShotPageExtension is null");
                        Activity I7 = this.f13684a.I();
                        ckf.f(I7, "instance.activity");
                        String L7 = this.f13684a.L();
                        ckf.f(L7, "instance.appId");
                        ner.q(I7, L7, z, d, null, x2n.b(this.f13684a), null, 64, null);
                        if (q9s.INSTANCE.S()) {
                            this.f13684a.W().e();
                            return;
                        }
                        return;
                    }
                    fndVar.E(new b(System.currentTimeMillis(), z, d, e, a2));
                    return;
                }
                IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
                if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IO)) != null) {
                    executor.execute(new c(z, d, e, a2, iTMSPage));
                }
            }
        } else {
            TMSLogger.f("TinyAppExtension", "Fragment拉起，暂不展示收缩动画");
            this.f13684a.W().e();
        }
    }
}
