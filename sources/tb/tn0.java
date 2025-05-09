package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.falco.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.render.performance.jsTracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tn0 implements ucb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean h = true;

    /* renamed from: a  reason: collision with root package name */
    public lo f28815a;
    public AURAFlowData b;
    public volatile boolean c;
    public volatile boolean d;
    public AURAGlobalData e;
    public String f;
    public JSONObject g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28816a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.f28816a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                tn0.r(tn0.this, this.f28816a, this.b);
            } catch (Throwable th) {
                vm0.e("uploadPerformance_Exception", th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28817a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ tz8 e;
        public final /* synthetic */ String f;

        public b(tn0 tn0Var, String str, String str2, long j, long j2, tz8 tz8Var, String str3) {
            this.f28817a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
            this.e = tz8Var;
            this.f = str3;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar == null) {
                ck.g().e("reportToRUM", "reportToRUM, span is null");
            } else {
                try {
                    mVar.p0("184621", this.f28817a);
                    mVar.y("TBBuyActivity");
                    mVar.h0(this.b);
                    mVar.u0(Long.valueOf(this.c));
                    mVar.h(Long.valueOf(this.d));
                    uy8 d = this.e.d("purchase", "tap").f(mVar).d();
                    d.X(xti.AREA_OVERSEA, this.f);
                    d.t("succeed");
                } catch (Throwable th) {
                    ck.g().b("reportToRUM", "falco exception:", th.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (tn0.x(tn0.this) != null && (tn0.x(tn0.this).f() instanceof Activity)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("context", (Object) tn0.x(tn0.this).f());
                    qbv.j().a(UltronTradeHybridStage.ON_RENDER_END, "purchase", jSONObject);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(301989996);
        t2o.a(80740554);
    }

    public static /* synthetic */ void r(tn0 tn0Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbb9d74", new Object[]{tn0Var, str, new Long(j)});
        } else {
            tn0Var.a1(str, j);
        }
    }

    public static /* synthetic */ lo x(tn0 tn0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("77e040c8", new Object[]{tn0Var});
        }
        return tn0Var.f28815a;
    }

    @Override // tb.ucb
    public void A0(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc63fa5", new Object[]{this, aURAInputData});
        }
    }

    public void B(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7b1f32", new Object[]{this, map});
            return;
        }
        try {
            Map map2 = (Map) this.b.get("downloadTemplateAndRefresh", Map.class);
            if (map2 != null) {
                Long l = (Long) map2.get("downloadTemplateCostTime");
                l.longValue();
                map.put("downloadTemplateCostTime", l);
            }
        } catch (Throwable th) {
            vm0.e("DOWNLOAD_TEMPLATE_MONITOR_EXCEPTION", th.getMessage());
        }
    }

    @Override // tb.ucb
    public void J(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400d63ee", new Object[]{this, aURARenderComponent});
        }
    }

    public final kk J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk) ipChange.ipc$dispatch("b5a1d894", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData == null) {
            return null;
        }
        return (kk) aURAGlobalData.get("aura_data_response", kk.class);
    }

    public final void L(kk kkVar, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b550e840", new Object[]{this, kkVar, map});
        } else if (kkVar != null) {
            ok g = kkVar.g();
            if (!(g == null || g.c() == 0)) {
                map.put("mtop解析耗时", Long.valueOf(g.c() - g.d()));
            }
            if (!(g == null || g.h() == 0)) {
                map.put("mtop切换线程耗时", Long.valueOf(g.h() - g.i()));
            }
            if (g != null && g.f() != 0) {
                map.put("预请求节约时间", Long.valueOf(g.f()));
            }
        }
    }

    public final long L0() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ff6e006", new Object[]{this})).longValue();
        }
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData == null || (l = (Long) aURAGlobalData.get("globalDataPerformanceFlowStartStage", Long.class)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final String M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b07923b3", new Object[]{this});
        }
        JSONObject U0 = U0();
        if (U0 != null) {
            this.f = U0.getString("itemCount");
        }
        if (this.f == null) {
            this.f = (String) this.f28815a.g("itemCount", String.class);
        }
        return this.f;
    }

    public final MtopStatistics N0(kk kkVar) {
        MtopResponse e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopStatistics) ipChange.ipc$dispatch("9c4a5714", new Object[]{this, kkVar});
        }
        if (kkVar == null || (e = kkVar.e()) == null) {
            return null;
        }
        return e.getMtopStat();
    }

    public final Map<String, Long> O0(MtopStatistics mtopStatistics) {
        NetworkStats networkStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("989c84ca", new Object[]{this, mtopStatistics});
        }
        HashMap hashMap = new HashMap();
        if (mtopStatistics == null || (networkStats = mtopStatistics.getNetworkStats()) == null) {
            return hashMap;
        }
        hashMap.put("serverRT", Long.valueOf(networkStats.serverRT));
        hashMap.put("networkTotalTime", Long.valueOf(mtopStatistics.totalTime));
        hashMap.put("networkTime", Long.valueOf(mtopStatistics.totalTime - networkStats.serverRT));
        return hashMap;
    }

    public final String P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c05e47c8", new Object[]{this});
        }
        JSONObject U0 = U0();
        String string = U0 != null ? U0.getString(xti.AREA_OVERSEA) : null;
        return TextUtils.isEmpty(string) ? "未定义" : string;
    }

    public final String Q0(kk kkVar) {
        JSONObject b2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acd3252e", new Object[]{this, kkVar});
        }
        if (kkVar == null || (b2 = kkVar.b()) == null || (jSONObject = b2.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) == null) {
            return null;
        }
        return jSONObject2.getString("page");
    }

    public final String R0(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5af9bc7c", new Object[]{this, map});
        }
        if (map.get("serverRT").longValue() > 367) {
            return "服务端RT长尾";
        }
        if (map.get("mtop切换线程耗时").longValue() > 150) {
            return "切线程长尾";
        }
        if (map.get("aura.service.render.stable").longValue() > 255) {
            return "渲染长尾";
        }
        if (map.get("导航总耗时").longValue() > 200) {
            return "导航长尾";
        }
        if (map.get("networkTotalTime").longValue() > 450) {
            return "网络请求长尾";
        }
        if (map.get("requestTotalTime").longValue() > 450) {
            return "下单端请求长尾";
        }
        return "其他";
    }

    public final long S0() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("538de1e", new Object[]{this})).longValue();
        }
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData == null || (l = (Long) aURAGlobalData.get("globalDataPerformanceRenderStartStage", Long.class)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // tb.ucb
    public void T(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45c337b", new Object[]{this, list});
        }
    }

    public final Map<String, Long> T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a993f88d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        AURAGlobalData aURAGlobalData = this.e;
        if (aURAGlobalData == null) {
            return hashMap;
        }
        Map<String, Long> map = (Map) aURAGlobalData.get("globalDataPerformanceStage", Map.class);
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public final JSONObject U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e085b32", new Object[]{this});
        }
        if (this.g == null) {
            this.g = (JSONObject) this.e.get("submitExposureItemArgs", JSONObject.class);
        }
        return this.g;
    }

    public final boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e00d6374", new Object[]{this})).booleanValue();
        }
        int c2 = pn.c(M0(), 0);
        if (c2 == 1 || c2 == 5 || c2 == 10) {
            return true;
        }
        return false;
    }

    @Override // tb.ucb
    public void W(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a1e19", new Object[]{this, view});
        }
    }

    public final void X0(long j, long j2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26d30a0", new Object[]{this, new Long(j), new Long(j2), str, str2, str3});
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            tz8Var.j(new b(this, str3, str, j, j2, tz8Var, str2));
        }
    }

    public final void Z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fa231e", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.c && V0()) {
            this.c = true;
            dn.b().postDelayed(new a(str, currentTimeMillis), 500L);
        }
        Y0();
    }

    public final boolean a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e90e6194", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)})).booleanValue();
        }
        if (j <= 0 || j3 <= 0) {
            if (j2 <= 0 || j3 <= 0 || j3 - j2 <= j4) {
                return false;
            }
            return true;
        } else if (j3 - j > j4) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tb.ucb
    public void e0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfd1a66", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ncb
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("6abd24f8", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.ncb
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f28815a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.b = aURAFlowData;
        this.e = aURAGlobalData;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ucb
    public void z(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5665e601", new Object[]{this, view, state});
        } else {
            Z0(this.b.getFlowCode());
        }
    }

    public final String K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[]{this});
        }
        int b2 = qp0.b();
        if (b2 == 1) {
            return "中端机";
        }
        if (b2 != 2) {
            return "高端机";
        }
        return "低端机";
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e123a380", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            if (!i0r.e("preRenderPaySuccessInCashDesk", true)) {
                dn.f(new c(), 500L);
            }
        }
    }

    public final void m0(String str, List<String> list, long j, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f954f893", new Object[]{this, str, list, new Long(j), str2, new Float(f)});
        } else if (AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW.equals(str)) {
            try {
                Map map = (Map) this.b.get("AURAFirstScreenRender", Map.class);
                if (map != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap.put("首屏渲染模版个数", Long.valueOf(map.size()));
                    for (String str3 : map.keySet()) {
                        String[] split = str3.split("@");
                        Long valueOf = Long.valueOf((String) map.get(str3));
                        valueOf.longValue();
                        hashMap.put(split[0], valueOf);
                        hashMap2.put(split[1], valueOf);
                    }
                    hashMap.put("渲染耗时", Long.valueOf(j));
                    vm0.h("firstScreenComponentRenderPerfMonitor", hashMap, list, str2, f);
                    vm0.h("firstScreenDxRenderPerfMonitor", hashMap2, list, str2, f);
                    rbb g = ck.g();
                    g.f("首屏渲染模版：" + map.size(), ck.b.b().i("AURA/performance").f("templateRenderTime", hashMap).f("dxPerformanceMonitor", hashMap2).a());
                    map.clear();
                }
            } catch (Throwable th) {
                vm0.e("FIRST_SCREEN_MONITOR_EXCEPTION", th.getMessage());
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:9|(1:13)|14|(1:16)|17|(1:20)|(1:24)|(1:28)|29|(1:33)|34|(1:(1:41)(1:40))(1:37)|(1:45)|46|(2:50|(1:52))|53|(2:59|(1:63))(1:57)|58|64|(2:68|(1:70)(2:71|(1:73)))|74|(5:77|(1:79)|80|(1:82)|83)|(1:85)|86|(1:91)(1:90)|92|(1:94)(2:96|(13:98|(1:100)(1:101)|102|103|(1:108)(1:113)|114|(1:116)(1:117)|118|131|119|(1:127)|128|129))|95|103|(1:106)|108|114|(0)(0)|118|131|119|(4:121|123|125|127)|128|129) */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(java.lang.String r26, long r27) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tn0.a1(java.lang.String, long):void");
    }
}
