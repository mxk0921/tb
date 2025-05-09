package tb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.enums.Mode;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.MNNManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hp0 extends qu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile int e;
    public static CcrcService g;
    public static final hp0 INSTANCE = new hp0();
    public static final ConcurrentHashMap<Integer, Pair<Long, g5c>> d = new ConcurrentHashMap<>();
    public static String f = "";
    public static final c h = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements MNNManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.etao.feimagesearch.nn.MNNManager.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be56d7bc", new Object[]{this});
                return;
            }
            agh.r(hx8.SCENE, "AliFaceDetectorV2", "prepareModel: onMNNReady");
            hp0.m(hp0.INSTANCE);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CcrcService f20796a;

        public d(CcrcService ccrcService) {
            this.f20796a = ccrcService;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f20796a.deActivate();
            hp0.n(null);
            hp0.p("");
        }
    }

    public static final /* synthetic */ OnDetectRiskListener i(hp0 hp0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnDetectRiskListener) ipChange.ipc$dispatch("468bbf99", new Object[]{hp0Var, str});
        }
        return hp0Var.q(str);
    }

    public static /* synthetic */ Object ipc$super(hp0 hp0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2048140828) {
            super.e((utm) objArr[0]);
            return null;
        } else if (hashCode == 1935998266) {
            super.f(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 2119148090) {
            super.d(((Number) objArr[0]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/face/detector/AliFaceDetectorV2");
        }
    }

    public static final /* synthetic */ ConcurrentHashMap j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("f721e5f2", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c3dc522", new Object[0])).intValue();
        }
        return e;
    }

    public static final /* synthetic */ String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d278078", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ void m(hp0 hp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af10a372", new Object[]{hp0Var});
        } else {
            hp0Var.r();
        }
    }

    public static final /* synthetic */ void n(CcrcService ccrcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ed4e12", new Object[]{ccrcService});
        } else {
            g = ccrcService;
        }
    }

    public static final /* synthetic */ void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef77e8c0", new Object[]{new Integer(i)});
        } else {
            e = i;
        }
    }

    public static final /* synthetic */ void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a12466", new Object[]{str});
        } else {
            f = str;
        }
    }

    public final OnDetectRiskListener q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnDetectRiskListener) ipChange.ipc$dispatch("e4a11a21", new Object[]{this, str});
        }
        return new a(str);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc0597a", new Object[]{this});
        } else if (e != 0 || !a()) {
            CcrcService service = CcrcService.getService("ccrc_taobao_pailitao_content_risk_control");
            if (service == null) {
                agh.r(hx8.SCENE, "AliFaceDetectorV2", "prepareModel: CcrcService Null");
                return;
            }
            g = service;
            String uuid = UUID.randomUUID().toString();
            ckf.f(uuid, "randomUUID().toString()");
            f = uuid;
            CcrcService.Config build = new CcrcService.Config.Builder().setPid(f).setExtras(null).setMode(Mode.LOCAL).build();
            agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("try to activate pid=", uuid));
            mzu.n(p73.f25916a, "prepareFaceModelV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, uuid);
            service.activate(build, new b(uuid, System.currentTimeMillis(), service));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements OnDetectRiskListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20794a;

        public a(String str) {
            this.f20794a = str;
        }

        @Override // com.alibaba.security.ccrc.interfaces.OnDetectRiskListener
        public final void onDetectResult(CcrcDetectResult ccrcDetectResult) {
            Pair pair;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ef0f7da", new Object[]{this, ccrcDetectResult});
            } else if (ccrcDetectResult != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int e = qrl.e(ccrcDetectResult.sampleID, -1);
                agh.r(hx8.SCENE, "AliFaceDetectorV2", "onDetectResult: pid=" + ((Object) this.f20794a) + ", token = " + e);
                if (e >= 0 && (pair = (Pair) hp0.j().get(Integer.valueOf(e))) != null) {
                    long longValue = elapsedRealtime - ((Number) pair.getFirst()).longValue();
                    vwi.a(ProductDataHelper.VAL_PRODUCT_FACE, Long.valueOf(longValue), Long.valueOf(longValue));
                    if (!ccrcDetectResult.success) {
                        agh.r(hx8.SCENE, "AliFaceDetectorV2", "detect not success, pid=" + ((Object) this.f20794a) + ", token = " + e + ", costTime=" + longValue);
                        g5c g5cVar = (g5c) pair.getSecond();
                        if (g5cVar != null) {
                            g5cVar.a(new ix8(-1, e, "detect failure"));
                            return;
                        }
                        return;
                    }
                    List<Label> list = ccrcDetectResult.labels;
                    if (list == null || list.isEmpty()) {
                        agh.r(hx8.SCENE, "AliFaceDetectorV2", "labels is null ");
                        g5c g5cVar2 = (g5c) pair.getSecond();
                        if (g5cVar2 != null) {
                            g5cVar2.a(new ix8(-1, e, "result empty"));
                            return;
                        }
                        return;
                    }
                    Iterator<Label> it = ccrcDetectResult.labels.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            break;
                        }
                        Label next = it.next();
                        agh.r(hx8.SCENE, "AliFaceDetectorV2", "pid=" + ((Object) this.f20794a) + ", token = " + e + ", labelName=" + ((Object) next.name) + ", labelValue=" + ((Object) next.value));
                        if (ckf.b("hasFace", next.name)) {
                            i = 1;
                            break;
                        }
                    }
                    g5c g5cVar3 = (g5c) pair.getSecond();
                    if (g5cVar3 != null) {
                        g5cVar3.a(new ix8(i, e, null, 4, null));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements OnCcrcCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20795a;
        public final /* synthetic */ long b;
        public final /* synthetic */ CcrcService c;

        public b(String str, long j, CcrcService ccrcService) {
            this.f20795a = str;
            this.b = j;
            this.c = ccrcService;
        }

        @Override // com.alibaba.security.ccrc.interfaces.OnCcrcCallback
        public final void onInit(InitState initState, InitResult initResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe7d6f63", new Object[]{this, initState, initResult});
                return;
            }
            agh.r(hx8.SCENE, "AliFaceDetectorV2", "onInit: initState=" + initState + ", result=" + initResult);
            if (initState == InitState.INIT_SUCCESS || initState == InitState.INITED) {
                long abs = Math.abs(System.currentTimeMillis() - this.b);
                mzu.n(p73.f25916a, "prepareFaceModelSuccessV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, this.f20795a, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(abs));
                agh.r(hx8.SCENE, "AliFaceDetectorV2", "初始化成功 pid=" + this.f20795a + ", costTime=" + abs);
                if (hp0.k() == 0) {
                    agh.r(hx8.SCENE, "AliFaceDetectorV2", "prepareModel: curStatus is Status.NOT_PREPARED, cancelled");
                    return;
                }
                hp0.o(2);
                hp0 hp0Var = hp0.INSTANCE;
                utm c = hp0Var.c();
                if (c != null) {
                    c.onPrepareSuccess();
                }
                hp0Var.g(null);
                this.c.setRiskCallback(hp0.i(hp0Var, hp0.l()));
                return;
            }
            agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("init failed pid=", this.f20795a));
            hp0.p("");
            hp0.o(0);
            hp0 hp0Var2 = hp0.INSTANCE;
            utm c2 = hp0Var2.c();
            if (c2 != null) {
                c2.a(-1, ckf.p("init failed pid=", this.f20795a));
            }
            hp0Var2.g(null);
        }
    }

    @Override // tb.qu1
    public void b(int i, Bitmap bitmap, g5c g5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2feac3", new Object[]{this, new Integer(i), bitmap, g5cVar});
            return;
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("call detectFace, pid=", f));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (e != 2) {
            agh.r(hx8.SCENE, "AliFaceDetectorV2", "detectFace: curStatus = " + e + ", pid=" + f);
            if (g5cVar != null) {
                g5cVar.a(new ix8(-1, i, "model prepare failure"));
                return;
            }
            return;
        }
        CcrcService ccrcService = g;
        if (ccrcService == null) {
            agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("service invalid, pid:", f));
            if (g5cVar != null) {
                g5cVar.a(new ix8(-1, i, "service invalid"));
                return;
            }
            return;
        }
        try {
            BitmapImage bitmapImage = new BitmapImage(bitmap);
            d.put(Integer.valueOf(i), new Pair<>(Long.valueOf(elapsedRealtime), g5cVar));
            agh.r(hx8.SCENE, "AliFaceDetectorV2", "do detect, pid=" + f + ", token=" + i);
            new BitmapImageSample(String.valueOf(i), bitmapImage).detect(ccrcService);
        } catch (Exception e2) {
            agh.r(hx8.SCENE, "AliFaceDetectorV2", agh.f("detectFace: pid=" + f + ", token=" + i, e2));
            if (g5cVar != null) {
                g5cVar.a(new ix8(-1, i, ckf.p("detect exception:", e2.getMessage())));
            }
        }
    }

    @Override // tb.qu1
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4fa23a", new Object[]{this, new Integer(i)});
            return;
        }
        agh.r(hx8.SCENE, "AliFaceDetectorV2", "prepareModel: activityHashCode=" + i + ", curStatus=" + e);
        super.d(i);
        if (e != 0) {
            agh.r(hx8.SCENE, "AliFaceDetectorV2", "curStatus=" + e + " return");
            return;
        }
        e = 1;
        MNNManager.Companion.a().j("", h);
    }

    @Override // tb.qu1
    public void e(utm utmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ebd9e4", new Object[]{this, utmVar});
            return;
        }
        ckf.g(utmVar, "prepareResultCallback");
        if (e == 2) {
            utmVar.onPrepareSuccess();
        } else {
            super.e(utmVar);
        }
    }

    @Override // tb.qu1
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7364fd3a", new Object[]{this, new Integer(i)});
            return;
        }
        agh.r(hx8.SCENE, "AliFaceDetectorV2", "call releaseModel: activityHashCode=" + i + ", pid=" + f);
        super.f(i);
        if (a()) {
            e = 0;
            d.clear();
            agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("do deActivate, pid=", f));
            MNNManager.Companion.a().l(h);
            CcrcService ccrcService = g;
            if (ccrcService != null) {
                if (lg4.X0()) {
                    VExecutors.defaultSharedThreadPool().submit(new d(ccrcService));
                } else {
                    ccrcService.deActivate();
                    g = null;
                    f = "";
                }
                mzu.n(p73.f25916a, "releaseFaceModelSuccessV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, f);
            }
            g(null);
            return;
        }
        agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("cannot do release, pid=", f));
    }

    static {
        t2o.a(481296930);
        agh.r(hx8.SCENE, "AliFaceDetectorV2", "create instance");
        String n = caa.n();
        if (n == null || TextUtils.isEmpty(n)) {
            agh.r(hx8.SCENE, "AliFaceDetectorV2", "ttid invalid, use temp");
            n = String.valueOf(System.currentTimeMillis());
        }
        agh.r(hx8.SCENE, "AliFaceDetectorV2", ckf.p("init ccrc context ttid=", n));
        CcrcContext.init(caa.c(), n);
    }
}
