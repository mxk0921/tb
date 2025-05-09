package tb;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.falco.m;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "olFirstScreen";

    /* renamed from: a  reason: collision with root package name */
    public final String f29959a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Context f;
    public boolean j;
    public final Map<String, Long> e = new HashMap();
    public int g = 0;
    public long h = -1;
    public long i = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vel.a(vel.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29961a;

        public b(boolean z) {
            this.f29961a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vel.b(vel.this, this.f29961a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Long f29962a;

        public c(Long l) {
            this.f29962a = l;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar == null) {
                hav.d(vel.TAG, "olReportToRUM, span is null");
            } else {
                try {
                    hav.d(vel.TAG, "report to RUM");
                    mVar.u0(this.f29962a);
                    mVar.h(Long.valueOf(vel.c(vel.this)));
                } catch (Throwable th) {
                    hav.g(vel.TAG, "falco exception:", th.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(614465733);
    }

    public vel(String str, Context context) {
        this.f29959a = str;
        this.f = context;
    }

    public static /* synthetic */ void a(vel velVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cb902f", new Object[]{velVar});
        } else {
            velVar.d();
        }
    }

    public static /* synthetic */ void b(vel velVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45555346", new Object[]{velVar, new Boolean(z)});
        } else {
            velVar.o(z);
        }
    }

    public static /* synthetic */ long c(vel velVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cad8261", new Object[]{velVar})).longValue();
        }
        return velVar.h;
    }

    public Map<String, Long> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8be1df5c", new Object[]{this});
        }
        return this.e;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d20247c", new Object[]{this});
        } else if (!this.j) {
            this.j = true;
            pav.l(new a(), 150L);
        }
    }

    public final void j(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac3fef8", new Object[]{this, l});
        } else if (OrderBizCode.orderList.equals(this.f29959a) || "olFragmentBuild".equals(this.f29959a)) {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (tz8Var != null) {
                tz8Var.j(new c(l));
            }
        } else {
            hav.d(TAG, "RUM: is not orderList");
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34952a5b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d914158f", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        }
    }

    public void e(boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246bbe21", new Object[]{this, new Boolean(z), new Boolean(z2), str});
        } else if (!this.b) {
            this.b = true;
            Context context = this.f;
            if (context instanceof h4d) {
                ((h4d) context).V2("isOLFirstScreen", Boolean.FALSE);
            }
            hav.d(TAG, "load end: " + this.h + ", msg: " + str);
            if (z) {
                z9v.u(this.f).t(this.f29959a, true, null);
            } else if (pav.b()) {
                pav.k(new b(z2));
            } else {
                o(z2);
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109b45db", new Object[]{this});
        } else if (this.g != 3) {
            e(false, true, "延时触发：图片已上屏，小于3张");
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ebfeb0", new Object[]{this});
        } else if (!this.b) {
            this.g++;
            this.h = System.currentTimeMillis();
            this.i = SystemClock.uptimeMillis();
            int i = this.g;
            if (i == 1) {
                ((HashMap) this.e).put("first_img_load_end_time", Long.valueOf(this.h));
            } else if (i == 3) {
                e(false, true, "图片上屏，3张");
            }
            g();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e18ce9", new Object[]{this});
            return;
        }
        this.h = System.currentTimeMillis();
        this.i = SystemClock.currentThreadTimeMillis();
        e(false, true, "地图上屏");
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5fbf45", new Object[]{this});
        } else if (!this.b) {
            if (this.h > 0) {
                e(false, true, "二刷：图片已上屏," + this.g + "张");
                return;
            }
            e(true, false, "二刷图片未上屏");
        }
    }

    public final void o(boolean z) {
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb474e95", new Object[]{this, new Boolean(z)});
            return;
        }
        z9v u = z9v.u(this.f);
        Long l = (Long) ((HashMap) this.e).get(jn0.STAGE_KEY_CLICK_START);
        Long l2 = (Long) ((HashMap) this.e).get("on_create_time");
        Long l3 = (Long) ((HashMap) this.e).get("on_Resume_end_time");
        Long l4 = (Long) ((HashMap) this.e).get("response_render_start_time");
        Long l5 = (Long) ((HashMap) this.e).get("response_render_end_time");
        Long l6 = (Long) ((HashMap) this.e).get("cache_img_load_end_time");
        Long l7 = (Long) ((HashMap) this.e).get("first_img_load_end_time");
        Long l8 = (Long) ((HashMap) this.e).get("delay_finish_time");
        Long l9 = (Long) ((HashMap) this.e).get("up_nav_start_time");
        Long l10 = (Long) ((HashMap) this.e).get("on_create_finish");
        Long l11 = (Long) ((HashMap) this.e).get("cache_load_start");
        Long l12 = (Long) ((HashMap) this.e).get("cache_load_end");
        Long l13 = (Long) ((HashMap) this.e).get("native_header_init_start");
        Long l14 = (Long) ((HashMap) this.e).get("native_header_init_end");
        Long l15 = (Long) ((HashMap) this.e).get("ol_async_task_start");
        Long l16 = (Long) ((HashMap) this.e).get("ol_async_task_end");
        Long l17 = (Long) ((HashMap) this.e).get("on_resume_start");
        Long l18 = (Long) ((HashMap) this.e).get("order_core_engine_init_start");
        Long l19 = (Long) ((HashMap) this.e).get("order_core_engine_init_end");
        if (l == null || l.longValue() <= 0 || l2 == null) {
            u.t(this.f29959a, true, null);
            return;
        }
        long longValue = l2.longValue() - l.longValue();
        float longValue2 = ((float) longValue) / ((float) (this.h - l.longValue()));
        if (longValue >= 10000 || longValue <= 0 || longValue2 > uel.e("navTimeProportion", 0.5f)) {
            u.t(this.f29959a, true, null);
            return;
        }
        if (!(l15 == null || l16 == null || l16.longValue() - l15.longValue() < 0)) {
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("asyncTaskHandleStage");
            ultronPerformanceStageModel.setStartMills(l15.longValue());
            ultronPerformanceStageModel.setEndMills(l16.longValue());
            u.h(ultronPerformanceStageModel, null, false);
        }
        if (!(l18 == null || l19 == null || l19.longValue() - l18.longValue() < 0)) {
            UltronPerformanceStageModel ultronPerformanceStageModel2 = new UltronPerformanceStageModel("orderCoreEngineInitStage");
            ultronPerformanceStageModel2.setStartMills(l18.longValue());
            ultronPerformanceStageModel2.setEndMills(l19.longValue());
            u.h(ultronPerformanceStageModel2, null, false);
        }
        if (l10 != null && l10.longValue() - l2.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel3 = new UltronPerformanceStageModel("onActivityCreateStage");
            ultronPerformanceStageModel3.setStartMills(l2.longValue());
            ultronPerformanceStageModel3.setEndMills(l10.longValue());
            u.h(ultronPerformanceStageModel3, null, false);
        }
        if (l3 != null && l3.longValue() - l.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel4 = new UltronPerformanceStageModel("transitionStage");
            ultronPerformanceStageModel4.setStartMills(l.longValue());
            ultronPerformanceStageModel4.setEndMills(l3.longValue());
            u.h(ultronPerformanceStageModel4, null, false);
        }
        if (!(l17 == null || l3 == null || l3.longValue() - l17.longValue() < 0)) {
            UltronPerformanceStageModel ultronPerformanceStageModel5 = new UltronPerformanceStageModel("onResumeStage");
            ultronPerformanceStageModel5.setStartMills(l17.longValue());
            ultronPerformanceStageModel5.setEndMills(l3.longValue());
            u.h(ultronPerformanceStageModel5, null, false);
        }
        if (!(l11 == null || l12 == null || l12.longValue() - l11.longValue() < 0)) {
            UltronPerformanceStageModel ultronPerformanceStageModel6 = new UltronPerformanceStageModel("loadCacheDataStage");
            ultronPerformanceStageModel6.setStartMills(l11.longValue());
            ultronPerformanceStageModel6.setEndMills(l12.longValue());
            u.h(ultronPerformanceStageModel6, null, false);
        }
        if (!(l13 == null || l14 == null || l14.longValue() - l13.longValue() < 0)) {
            UltronPerformanceStageModel ultronPerformanceStageModel7 = new UltronPerformanceStageModel("nativeHeaderInitStage");
            ultronPerformanceStageModel7.setStartMills(l13.longValue());
            ultronPerformanceStageModel7.setEndMills(l14.longValue());
            u.h(ultronPerformanceStageModel7, null, false);
        }
        if (!(l4 == null || l5 == null || l5.longValue() - l4.longValue() < 0)) {
            UltronPerformanceStageModel ultronPerformanceStageModel8 = new UltronPerformanceStageModel("responseRenderStage");
            ultronPerformanceStageModel8.setStartMills(l4.longValue());
            ultronPerformanceStageModel8.setEndMills(l5.longValue());
            u.h(ultronPerformanceStageModel8, null, false);
        }
        if (l7 != null && l7.longValue() - l.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel9 = new UltronPerformanceStageModel("firstImageLoadStage");
            ultronPerformanceStageModel9.setStartMills(l.longValue());
            ultronPerformanceStageModel9.setEndMills(l7.longValue());
            u.h(ultronPerformanceStageModel9, null, false);
        }
        if (l8 != null && l8.longValue() - l.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel10 = new UltronPerformanceStageModel("delayFinishStage");
            ultronPerformanceStageModel10.setStartMills(l.longValue());
            ultronPerformanceStageModel10.setEndMills(l8.longValue());
            u.h(ultronPerformanceStageModel10, null, false);
        }
        if (l9 != null && this.i - l9.longValue() >= 0) {
            UltronPerformanceStageModel ultronPerformanceStageModel11 = new UltronPerformanceStageModel("upTimeFullStage");
            ultronPerformanceStageModel11.setStartMills(l9.longValue());
            ultronPerformanceStageModel11.setEndMills(this.i);
            u.h(ultronPerformanceStageModel11, null, false);
        }
        if (l6 == null || l6.longValue() - l.longValue() < 0) {
            z2 = false;
        } else {
            UltronPerformanceStageModel ultronPerformanceStageModel12 = new UltronPerformanceStageModel("cacheImageLoadStage");
            ultronPerformanceStageModel12.setStartMills(l.longValue());
            ultronPerformanceStageModel12.setEndMills(l6.longValue());
            z2 = false;
            u.h(ultronPerformanceStageModel12, null, false);
        }
        UltronPerformanceStageModel ultronPerformanceStageModel13 = new UltronPerformanceStageModel("onCreateToRenderEnd");
        ultronPerformanceStageModel13.setStartMills(l2.longValue());
        ultronPerformanceStageModel13.setEndMills(this.h);
        u.h(ultronPerformanceStageModel13, null, z2);
        if (cdl.c()) {
            str = "dxButter: true";
        } else {
            str = "dxButter: false";
        }
        u.q("d3", str);
        u.a("d6", "isImageHitCache", String.valueOf(this.c));
        u.a("d7", "isCodeStart", String.valueOf(this.d));
        long c2 = dng.c();
        UltronPerformanceStageModel ultronPerformanceStageModel14 = new UltronPerformanceStageModel("outterLoadLibUltronStage");
        ultronPerformanceStageModel14.setStartMills(dng.e());
        ultronPerformanceStageModel14.setEndMills(dng.f());
        u.h(ultronPerformanceStageModel14, null, false);
        UltronPerformanceStageModel ultronPerformanceStageModel15 = new UltronPerformanceStageModel("innerLoadLibUltronStage");
        ultronPerformanceStageModel15.setStartMills(dng.b());
        ultronPerformanceStageModel15.setEndMills(dng.d());
        u.h(ultronPerformanceStageModel15, null, false);
        if (c2 > 0) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        u.a("d5", "isInnerLoadLibUltronX", str2);
        Variation variation = UTABTest.activate("AB_", "202503181145_68").getVariation("ngSoPreLoad");
        boolean z3 = false;
        if (variation != null) {
            z3 = variation.getValueAsBoolean(false);
        }
        boolean a2 = ycv.a(OrderBizCode.orderList);
        StringBuilder sb = new StringBuilder();
        if (z3) {
            str3 = "preload";
        } else {
            str3 = "noPreload";
        }
        sb.append(str3);
        sb.append("_");
        if (a2) {
            str4 = "ultronX";
        } else {
            str4 = "noUltronX";
        }
        sb.append(str4);
        u.a("d9", "isUltronX", sb.toString());
        if (this.c) {
            str5 = "图片命中缓存";
        } else {
            str5 = "图片未命中缓存";
        }
        hav.d(TAG, str5);
        u.e(upx.UPLOAD_TIME, String.valueOf(System.currentTimeMillis()));
        u.l("apmClientContainerRender", this.h, false, null);
        u.l("apmClientFullStageProcess", this.h, false, null);
        u.i(this.f29959a, false, uel.l("forceFinishOrderPerformance", true), null);
        j(l);
    }
}
