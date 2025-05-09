package com.etao.feimagesearch.mnn.autodetect;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.AutoDetectExtraInfoCache;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.HashMap;
import java.util.List;
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
import tb.pk1;
import tb.ri7;
import tb.rk1;
import tb.t2o;
import tb.tk1;
import tb.utm;
import tb.wsq;
import tb.wuc;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SmartAutoDetectObjectUnit extends BaseMnnRunUnit<pk1, rk1> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartAutoDetectObjectUnit";
    public static final String TASK_NAME = "plt_smart_camera";
    public final tk1 p;
    public final NetConfig q;
    public String r;
    public String s;
    public static final a Companion = new a(null);
    public static final njg<SmartAutoDetectObjectUnit> t = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, SmartAutoDetectObjectUnit$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297033);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final SmartAutoDetectObjectUnit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SmartAutoDetectObjectUnit) ipChange.ipc$dispatch("32abd231", new Object[]{this});
            }
            return (SmartAutoDetectObjectUnit) SmartAutoDetectObjectUnit.L().getValue();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements utm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f4775a;
        public final /* synthetic */ utm b;
        public final /* synthetic */ SmartAutoDetectObjectUnit c;

        public b(long j, utm utmVar, SmartAutoDetectObjectUnit smartAutoDetectObjectUnit) {
            this.f4775a = j;
            this.b = utmVar;
            this.c = smartAutoDetectObjectUnit;
        }

        @Override // tb.utm
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3030f401", new Object[]{this, new Integer(i), str});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f4775a;
            this.b.a(i, str);
            com.etao.feimagesearch.mnn.utils.a.e(SmartAutoDetectObjectUnit.M(this.c), currentTimeMillis, String.valueOf(i), str);
        }

        @Override // tb.utm
        public void onPrepareSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625fbbc2", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f4775a;
            this.b.onPrepareSuccess();
            com.etao.feimagesearch.mnn.utils.a.f(SmartAutoDetectObjectUnit.M(this.c), currentTimeMillis);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wuc<rk1> f4776a;
        public final /* synthetic */ long b;
        public final /* synthetic */ SmartAutoDetectObjectUnit c;
        public final /* synthetic */ Bitmap d;

        public c(wuc<rk1> wucVar, long j, SmartAutoDetectObjectUnit smartAutoDetectObjectUnit, Bitmap bitmap) {
            this.f4776a = wucVar;
            this.b = j;
            this.c = smartAutoDetectObjectUnit;
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
                    SmartAutoDetectObjectUnit smartAutoDetectObjectUnit = this.c;
                    Bitmap bitmap = this.d;
                    wuc<rk1> wucVar = this.f4776a;
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    String jSONString = JSON.toJSONString(map);
                    SmartAutoDetectObjectUnit.N(smartAutoDetectObjectUnit).g(currentTimeMillis);
                    SmartAutoDetectObjectUnit.N(smartAutoDetectObjectUnit).h(jSONString);
                    agh.h(SmartAutoDetectObjectUnit.TAG, "result = " + ((Object) jSONString) + ", costTime = " + currentTimeMillis + ", width: " + bitmap.getWidth() + 'x' + bitmap.getHeight() + ' ');
                    SmartAutoDetectObjectUnit.O(smartAutoDetectObjectUnit, bitmap, map, currentTimeMillis, wucVar);
                    xhvVar = xhv.INSTANCE;
                }
                if (xhvVar == null) {
                    this.f4776a.onError(new RuntimeException("result and exception are all null"));
                }
            } else {
                wuc<rk1> wucVar2 = this.f4776a;
                agh.c(SmartAutoDetectObjectUnit.TAG, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()));
                wucVar2.onError(mRTRuntimeException);
            }
        }
    }

    static {
        t2o.a(481297032);
    }

    public /* synthetic */ SmartAutoDetectObjectUnit(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return t;
    }

    public static final /* synthetic */ NetConfig M(SmartAutoDetectObjectUnit smartAutoDetectObjectUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetConfig) ipChange.ipc$dispatch("a8412b25", new Object[]{smartAutoDetectObjectUnit});
        }
        return smartAutoDetectObjectUnit.q;
    }

    public static final /* synthetic */ tk1 N(SmartAutoDetectObjectUnit smartAutoDetectObjectUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tk1) ipChange.ipc$dispatch("7b54a008", new Object[]{smartAutoDetectObjectUnit});
        }
        return smartAutoDetectObjectUnit.p;
    }

    public static final /* synthetic */ void O(SmartAutoDetectObjectUnit smartAutoDetectObjectUnit, Bitmap bitmap, Map map, long j, wuc wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41315345", new Object[]{smartAutoDetectObjectUnit, bitmap, map, new Long(j), wucVar});
        } else {
            smartAutoDetectObjectUnit.Q(bitmap, map, j, wucVar);
        }
    }

    public static /* synthetic */ Object ipc$super(SmartAutoDetectObjectUnit smartAutoDetectObjectUnit, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1182901354) {
            super.c((utm) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == -972209397) {
            super.a((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/mnn/autodetect/SmartAutoDetectObjectUnit");
        }
    }

    public final void P(Bitmap bitmap, boolean z, boolean z2, wuc<rk1> wucVar) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7397194", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2), wucVar});
            return;
        }
        HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(bitmap);
        if (g == null) {
            xhvVar = null;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            this.p.d();
            g.put(com.etao.feimagesearch.mnn.utils.a.KEY_DEVICE_LEVEL, String.valueOf(ri7.b()));
            g.put(com.etao.feimagesearch.mnn.utils.a.KEY_USER_ZOOM, String.valueOf(z2));
            E(g, z, new c(wucVar, currentTimeMillis, this, bitmap));
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            Q(bitmap, null, 0L, wucVar);
        }
    }

    /* renamed from: S */
    public void b(pk1 pk1Var, Object obj, wuc<rk1> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fec03f3", new Object[]{this, pk1Var, obj, wucVar});
            return;
        }
        ckf.g(pk1Var, "input");
        ckf.g(wucVar, "callback");
        agh.a(TAG, "call run ----");
        bs6.c a2 = bs6.a(pk1Var.i(), pk1Var.h(), pk1Var.d(), pk1Var.a(), pk1Var.b());
        if (a2 != null) {
            Bitmap a3 = ((bs6.b) a2).b(pk1Var.g(), pk1Var.f()).a();
            ckf.f(a3, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
            P(a3, pk1Var.e(), pk1Var.c(), wucVar);
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
        if (!TextUtils.isEmpty(this.s)) {
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.KEY_CLIENT_EXP_CONFIG_STRING, this.s);
        }
    }

    public SmartAutoDetectObjectUnit() {
        super("plt_smart_camera");
        this.p = new tk1();
        this.q = new NetConfig("plt_smart_camera", "plt_smart_camera", "", "");
        this.r = "";
        this.s = "";
    }

    public final void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc34b5c", new Object[]{this, new Boolean(z)});
        } else if (this.p.a() < 1000) {
            this.p.i(z);
            this.p.j(true);
            com.etao.feimagesearch.mnn.utils.a.d("mnnAdvanceDetectionResult", this.p);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, tb.xuc
    public void c(utm utmVar, String str) {
        String str2;
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
        String B3 = lg4.B3();
        ckf.f(B3, "getSmartLensBackTipConfig()");
        List z0 = wsq.z0(B3, new String[]{":"}, false, 0, 6, null);
        if (z0.size() > 1) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(z0.get(1));
            str2 = jSONArray.toString();
            ckf.f(str2, "{\n      JSONArray().appl…\n      }.toString()\n    }");
        } else {
            str2 = "";
        }
        this.s = str2;
        String A3 = lg4.A3();
        ckf.f(A3, "getSmartDetectAlgoConfig()");
        this.r = A3;
        AutoDetectExtraInfoCache.Companion.a().b();
        super.c(new b(System.currentTimeMillis(), utmVar, this), str);
    }

    public final void Q(Bitmap bitmap, Map<String, Object> map, long j, wuc<rk1> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a568d28e", new Object[]{this, bitmap, map, new Long(j), wucVar});
            return;
        }
        rk1.a aVar = rk1.Companion;
        rk1 b2 = aVar.b("plt_smart_camera", v(), bitmap, Long.valueOf(j), map);
        if (b2 == null) {
            R(false);
            wucVar.onResult(aVar.a(bitmap, Long.valueOf(j)));
            return;
        }
        AutoDetectExtraInfoCache a2 = AutoDetectExtraInfoCache.Companion.a();
        String f = b2.f();
        if (f == null) {
            f = "";
        }
        a2.d(f);
        R(true);
        wucVar.onResult(b2);
        mzu.n(p73.f25916a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
        agh.r("AutoDetect", "objectDetected", "taskName: plt_smart_camera");
    }
}
