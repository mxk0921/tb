package com.etao.feimagesearch.mnn;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.agh;
import tb.bs6;
import tb.ckf;
import tb.e0;
import tb.lg4;
import tb.mzu;
import tb.njg;
import tb.p73;
import tb.q7l;
import tb.r7l;
import tb.sk1;
import tb.t2o;
import tb.tk1;
import tb.utm;
import tb.wuc;
import tb.xhv;
import tb.xwi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AdvanceAutoDetectObjectUnit extends BaseMnnRunUnit<q7l, r7l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AdvanceObjectUnit";
    public static final String TASK_NAME = "plt_autodetect";
    public final tk1 p;
    public final NetConfig q;
    public String r;
    public static final a Companion = new a(null);
    public static final njg<AdvanceAutoDetectObjectUnit> s = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, AdvanceAutoDetectObjectUnit$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(482344965);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final AdvanceAutoDetectObjectUnit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AdvanceAutoDetectObjectUnit) ipChange.ipc$dispatch("85aaf6ed", new Object[]{this});
            }
            return (AdvanceAutoDetectObjectUnit) AdvanceAutoDetectObjectUnit.L().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f4758a;
        public final /* synthetic */ utm b;
        public final /* synthetic */ AdvanceAutoDetectObjectUnit c;

        public b(long j, utm utmVar, AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit) {
            this.f4758a = j;
            this.b = utmVar;
            this.c = advanceAutoDetectObjectUnit;
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f4758a;
            this.b.a(i, str);
            com.etao.feimagesearch.mnn.utils.a.e(AdvanceAutoDetectObjectUnit.M(this.c), currentTimeMillis, String.valueOf(i), str);
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f4758a;
            this.b.onPrepareSuccess();
            com.etao.feimagesearch.mnn.utils.a.f(AdvanceAutoDetectObjectUnit.M(this.c), currentTimeMillis);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wuc<r7l> f4759a;
        public final /* synthetic */ long b;
        public final /* synthetic */ AdvanceAutoDetectObjectUnit c;
        public final /* synthetic */ Bitmap d;

        public c(wuc<r7l> wucVar, long j, AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit, Bitmap bitmap) {
            this.f4759a = wucVar;
            this.b = j;
            this.c = advanceAutoDetectObjectUnit;
            this.d = bitmap;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            xhv xhvVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else if (mRTRuntimeException == null) {
                if (map == null) {
                    xhvVar = null;
                } else {
                    long j = this.b;
                    AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit = this.c;
                    Bitmap bitmap = this.d;
                    wuc<r7l> wucVar = this.f4759a;
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    String jSONString = JSON.toJSONString(map);
                    AdvanceAutoDetectObjectUnit.N(advanceAutoDetectObjectUnit).g(currentTimeMillis);
                    AdvanceAutoDetectObjectUnit.N(advanceAutoDetectObjectUnit).h(jSONString);
                    agh.h(AdvanceAutoDetectObjectUnit.TAG, "result = " + ((Object) jSONString) + ", costTime = " + currentTimeMillis + ", width: " + bitmap.getWidth() + 'x' + bitmap.getHeight() + ' ');
                    AdvanceAutoDetectObjectUnit.O(advanceAutoDetectObjectUnit, bitmap, map, currentTimeMillis, wucVar);
                    xhvVar = xhv.INSTANCE;
                }
                if (xhvVar == null) {
                    this.f4759a.onError(new RuntimeException("result and exception are all null"));
                }
            } else {
                wuc<r7l> wucVar2 = this.f4759a;
                agh.c(AdvanceAutoDetectObjectUnit.TAG, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()));
                wucVar2.onError(mRTRuntimeException);
            }
        }
    }

    static {
        t2o.a(482344964);
    }

    public /* synthetic */ AdvanceAutoDetectObjectUnit(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return s;
    }

    public static final /* synthetic */ NetConfig M(AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetConfig) ipChange.ipc$dispatch("e942ba17", new Object[]{advanceAutoDetectObjectUnit});
        }
        return advanceAutoDetectObjectUnit.q;
    }

    public static final /* synthetic */ tk1 N(AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tk1) ipChange.ipc$dispatch("d9e27c2", new Object[]{advanceAutoDetectObjectUnit});
        }
        return advanceAutoDetectObjectUnit.p;
    }

    public static final /* synthetic */ void O(AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit, Bitmap bitmap, Map map, long j, wuc wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ff5a85", new Object[]{advanceAutoDetectObjectUnit, bitmap, map, new Long(j), wucVar});
        } else {
            advanceAutoDetectObjectUnit.S(bitmap, map, j, wucVar);
        }
    }

    public static /* synthetic */ Object ipc$super(AdvanceAutoDetectObjectUnit advanceAutoDetectObjectUnit, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1182901354) {
            super.c((utm) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == -972209397) {
            super.a((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/mnn/AdvanceAutoDetectObjectUnit");
        }
    }

    public final void P(Bitmap bitmap, boolean z, wuc<r7l> wucVar) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b685e8", new Object[]{this, bitmap, new Boolean(z), wucVar});
            return;
        }
        HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(bitmap);
        if (g == null) {
            xhvVar = null;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            this.p.d();
            E(g, z, new c(wucVar, currentTimeMillis, this, bitmap));
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            R(bitmap, null, 0L, wucVar);
        }
    }

    public final void R(Bitmap bitmap, xwi xwiVar, long j, wuc<r7l> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd4ae99", new Object[]{this, bitmap, xwiVar, new Long(j), wucVar});
        } else {
            Q(bitmap, xwiVar, j, null, wucVar);
        }
    }

    /* renamed from: U */
    public void b(q7l q7lVar, Object obj, wuc<r7l> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d7c16", new Object[]{this, q7lVar, obj, wucVar});
            return;
        }
        ckf.g(q7lVar, "optimizeInput");
        ckf.g(wucVar, "callback");
        agh.a(TAG, "call run ----");
        byte[] bArr = q7lVar.f26562a;
        ckf.f(bArr, "optimizeInput.yuv");
        bs6.c a2 = bs6.a(bArr, q7lVar.c, q7lVar.d, q7lVar.g, q7lVar.b);
        if (a2 != null) {
            Bitmap a3 = ((bs6.b) a2).b(q7lVar.e, q7lVar.f).a();
            ckf.f(a3, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
            P(a3, q7lVar.i, wucVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput");
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, tb.xuc
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "activityHashCode");
        super.a(str);
        AutoDetectExtraInfoCache.Companion.a().b();
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, tb.xuc
    public void c(utm utmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97e5b96", new Object[]{this, utmVar, str});
            return;
        }
        ckf.g(utmVar, "callback");
        ckf.g(str, "activityHashCode");
        String c2 = e0.c(lg4.ADVANCE_AUTODETECT_EXPERIMENT);
        if (c2 == null) {
            c2 = "asDefaultBucketId";
        }
        I(c2);
        String I1 = lg4.I1();
        ckf.f(I1, "getAutoDetectAlgoConfig()");
        this.r = I1;
        AutoDetectExtraInfoCache.Companion.a().b();
        super.c(new b(System.currentTimeMillis(), utmVar, this), str);
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit
    public void w(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d6461", new Object[]{this, hashMap});
            return;
        }
        ckf.g(hashMap, "args");
        if (!TextUtils.isEmpty(this.r)) {
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_CONFIG_STRING, this.r);
        }
    }

    public AdvanceAutoDetectObjectUnit() {
        super("plt_autodetect");
        this.p = new tk1();
        this.q = new NetConfig("plt_autodetect", "plt_autodetect", "", "");
        this.r = "";
    }

    public final void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc34b5c", new Object[]{this, new Boolean(z)});
        } else if (this.p.a() < 1000) {
            this.p.i(z);
            this.p.j(true);
            com.etao.feimagesearch.mnn.utils.a.d("mnnAdvanceDetectionResult", this.p);
        }
    }

    public final void S(Bitmap bitmap, Map<String, Object> map, long j, wuc<r7l> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a568d28e", new Object[]{this, bitmap, map, new Long(j), wucVar});
            return;
        }
        sk1 e = sk1.e(map);
        String a2 = com.etao.feimagesearch.mnn.utils.a.a(map);
        String str = (String) map.get("perf_record");
        AutoDetectExtraInfoCache a3 = AutoDetectExtraInfoCache.Companion.a();
        ckf.f(a2, "extraInfo");
        a3.d(a2);
        if (e == null || e.a() == null || !e.d()) {
            Q(bitmap, null, j, str, wucVar);
            return;
        }
        xwi xwiVar = new xwi(e.a(), e.b(), a2, str);
        xwiVar.f31646a = false;
        R(bitmap, xwiVar, j, wucVar);
    }

    public final void Q(Bitmap bitmap, xwi xwiVar, long j, String str, wuc<r7l> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad961a23", new Object[]{this, bitmap, xwiVar, new Long(j), str, wucVar});
            return;
        }
        if (xwiVar != null && xwiVar.f31646a) {
            T(true);
            r7l b2 = r7l.b(xwiVar.a(), xwiVar.c, bitmap, "plt_autodetect", v(), xwiVar.d, j, xwiVar.e);
            ckf.f(b2, "optimizeOutput");
            wucVar.onResult(b2);
            mzu.n(p73.f25916a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
            agh.r("AutoDetect", "objectDetected", "taskName: plt_autodetect");
        } else if (xwiVar == null || xwiVar.f31646a) {
            T(false);
            r7l a2 = r7l.a(null, null, null, j, str);
            ckf.f(a2, "optimizeOutput");
            wucVar.onResult(a2);
        } else {
            T(true);
            r7l b3 = r7l.b(xwiVar.a(), xwiVar.c, bitmap, "plt_autodetect", v(), xwiVar.d, j, xwiVar.e);
            ckf.f(b3, "optimizeOutput");
            wucVar.onResult(b3);
            mzu.n(p73.f25916a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
            agh.r("AutoDetect", "objectDetected", "taskName: plt_autodetect");
        }
    }
}
