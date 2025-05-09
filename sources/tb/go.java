package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceFlowModel;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.android.ultron.event.AsyncRefreshSubscriber;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.performance.monitor.ut")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class go implements gcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, AURAPerformanceFlowModel> f20121a;
    public Map<String, AURAPerformanceFlowModel> b;
    public Map<String, Map<String, AURAPerformanceStageModel>> c;
    public lo d;
    public AURAFlowData e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20122a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.f20122a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            go.r(go.this, this.f20122a);
            go.x(go.this, this.f20122a);
            rbb g = ck.g();
            ck.b g2 = ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", this.f20122a);
            g.f("上报性能埋点#真实上报", g2.g(cc5.DELAY_MILLIS, this.b + "").a());
            go.B(go.this, this.f20122a);
        }
    }

    static {
        t2o.a(81789187);
        t2o.a(81789185);
    }

    public static /* synthetic */ void B(go goVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24610459", new Object[]{goVar, str});
        } else {
            goVar.e1(str);
        }
    }

    public static /* synthetic */ void r(go goVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203a4657", new Object[]{goVar, str});
        } else {
            goVar.Y0(str);
        }
    }

    public static /* synthetic */ void x(go goVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224da558", new Object[]{goVar, str});
        } else {
            goVar.Z0(str);
        }
    }

    public final void J0(AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb3ab13", new Object[]{this, aURAFlowData});
            return;
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = (Map) aURAFlowData.get("AURAUmbrellaPerformanceMonitorFlowAllStageMap", Map.class);
        if (map != null) {
            this.c = map;
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        aURAFlowData.update("AURAUmbrellaPerformanceMonitorFlowAllStageMap", concurrentHashMap);
    }

    public final void K0(AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2c63", new Object[]{this, aURAFlowData});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = (Map) aURAFlowData.get("AURAUmbrellaPerformanceMonitorFlowModeMap", Map.class);
        if (map != null) {
            this.f20121a = map;
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f20121a = concurrentHashMap;
        aURAFlowData.update("AURAUmbrellaPerformanceMonitorFlowModeMap", concurrentHashMap);
    }

    public final void L(AURAPerformanceStageModel aURAPerformanceStageModel, boolean z) {
        AURAPerformanceFlowModel aURAPerformanceFlowModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ae6386", new Object[]{this, aURAPerformanceStageModel, new Boolean(z)});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = this.f20121a;
        if (map != null && (aURAPerformanceFlowModel = map.get(P0())) != null) {
            aURAPerformanceFlowModel.addChildStage(aURAPerformanceStageModel);
            W0(aURAPerformanceStageModel);
            V0(aURAPerformanceStageModel, z, 0L);
        }
    }

    public final void L0(AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af08110", new Object[]{this, aURAFlowData});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = (Map) aURAFlowData.get("AURAUmbrellaPerformanceMonitorPendingForUploadModeMap", Map.class);
        if (map != null) {
            this.b = map;
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.b = concurrentHashMap;
        aURAFlowData.update("AURAUmbrellaPerformanceMonitorPendingForUploadModeMap", concurrentHashMap);
    }

    public final Map<String, AURAPerformanceStageModel> M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3b0330f", new Object[]{this});
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map == null) {
            return null;
        }
        return map.get(P0());
    }

    public final String N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        lo loVar = this.d;
        if (loVar == null) {
            return "";
        }
        return loVar.d();
    }

    public final String O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        lo loVar = this.d;
        if (loVar == null) {
            return "";
        }
        return loVar.e();
    }

    @Override // tb.gcb
    public void P(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a283cdb6", new Object[]{this, map});
            return;
        }
        AURAPerformanceFlowModel Q0 = Q0(P0());
        if (Q0 != null) {
            Q0.addCommonArgs(map);
        }
    }

    public final String P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9670bde8", new Object[]{this});
        }
        AURAFlowData aURAFlowData = this.e;
        if (aURAFlowData == null) {
            return "";
        }
        return aURAFlowData.getFlowCode();
    }

    public final AURAPerformanceFlowModel Q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceFlowModel) ipChange.ipc$dispatch("bab1de16", new Object[]{this, str});
        }
        Map<String, AURAPerformanceFlowModel> map = this.f20121a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final long R0(AURAPerformanceFlowModel aURAPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e7b31e7", new Object[]{this, aURAPerformanceFlowModel})).longValue();
        }
        long startMills = aURAPerformanceFlowModel.getStartMills();
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map == null) {
            return startMills;
        }
        Map<String, AURAPerformanceStageModel> map2 = map.get(aURAPerformanceFlowModel.getFlowCode());
        if (map2 == null) {
            return startMills;
        }
        for (AURAPerformanceStageModel aURAPerformanceStageModel : map2.values()) {
            long startMills2 = aURAPerformanceStageModel.getStartMills();
            if (startMills2 < startMills) {
                startMills = startMills2;
            }
        }
        return startMills;
    }

    public final void T0(AURAPerformanceFlowModel aURAPerformanceFlowModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b6e9c9", new Object[]{this, aURAPerformanceFlowModel, new Boolean(z)});
            return;
        }
        String flowCode = aURAPerformanceFlowModel.getFlowCode();
        ck.g().e("结束流程埋点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(flowCode).h(AsyncRefreshSubscriber.KEY_IS_ERROR, z).a());
        if (z) {
            Y0(flowCode);
            Z0(flowCode);
        } else if (c1(aURAPerformanceFlowModel, 0L)) {
            d1(flowCode, 0L);
        }
    }

    @Override // tb.gcb
    public void U(String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef874ff6", new Object[]{this, str, str2, new Boolean(z), map});
        } else if (this.c != null) {
            if (TextUtils.isEmpty(str2)) {
                i0(str, z, map);
                return;
            }
            String P0 = P0();
            Map<String, AURAPerformanceStageModel> map2 = this.c.get(P0);
            if (map2 == null) {
                ck.g().e("没有流程节点，无法设置结束点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", P0).g("stageCode", str).g("parentCode", str2).a());
                return;
            }
            AURAPerformanceStageModel aURAPerformanceStageModel = map2.get(str);
            if (aURAPerformanceStageModel == null) {
                ck.g().f("阶段没有起始点，无法设置结束点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", str).g("parentCode", str2).a());
                return;
            }
            String str3 = map.get(cc5.DELAY_MILLIS);
            if (!aURAPerformanceStageModel.isRecordFinished() || str3 != null) {
                aURAPerformanceStageModel.setEndMills(System.currentTimeMillis());
                aURAPerformanceStageModel.setArgs(map);
                ck.g().e("结束阶段埋点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", str).g("parentCode", str2).a());
                V0(aURAPerformanceStageModel, z, X0(str3));
                return;
            }
            ck.g().f("阶段已经结束，无法重复结束点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", str).g("parentCode", str2).a());
        }
    }

    public final void U0(AURAPerformanceFlowModel aURAPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd6af72", new Object[]{this, aURAPerformanceFlowModel});
        } else if (this.c != null) {
            String flowCode = aURAPerformanceFlowModel.getFlowCode();
            if (!this.c.containsKey(flowCode)) {
                this.c.put(flowCode, new ConcurrentHashMap());
            }
        }
    }

    public final void V0(AURAPerformanceStageModel aURAPerformanceStageModel, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23be8121", new Object[]{this, aURAPerformanceStageModel, new Boolean(z), new Long(j)});
            return;
        }
        ck.g().e("结束阶段埋点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", aURAPerformanceStageModel.getStageCode()).h(AsyncRefreshSubscriber.KEY_IS_ERROR, z).a());
        if (z) {
            a1(aURAPerformanceStageModel);
            return;
        }
        String P0 = P0();
        AURAPerformanceFlowModel Q0 = Q0(P0);
        if (Q0 != null && c1(Q0, j)) {
            d1(P0, j);
        }
    }

    public final void W0(AURAPerformanceStageModel aURAPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985b5e4a", new Object[]{this, aURAPerformanceStageModel});
            return;
        }
        String P0 = P0();
        String stageCode = aURAPerformanceStageModel.getStageCode();
        ck.g().e("开始阶段埋点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(P0).g("stageCode", aURAPerformanceStageModel.getStageCode()).a());
        if (Q0(P0) != null) {
            Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
            if (map == null) {
                ck.g().f("请确保上报了流程的开始点，否则无法记录、上报子阶段的性能耗时", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", P0).g("stageCode", stageCode).a());
                return;
            }
            Map<String, AURAPerformanceStageModel> map2 = map.get(P0);
            if (map2 == null) {
                ck.g().f("请确保上报了流程的开始点，否则无法记录、上报子阶段的性能耗时", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", P0).g("stageCode", stageCode).a());
            } else if (!map2.containsKey(stageCode)) {
                map2.put(stageCode, aURAPerformanceStageModel);
            }
        }
    }

    public final long X0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddf8344e", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final void Y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36969ee2", new Object[]{this, str});
            return;
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // tb.gcb
    public void Z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400f3def", new Object[]{this, str, str2});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = this.f20121a;
        if (map != null && !map.containsKey(str)) {
            ck.g().e("开始流程埋点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", str).g("flowName", str2).a());
            AURAPerformanceFlowModel aURAPerformanceFlowModel = new AURAPerformanceFlowModel(N0(), O0(), null, null, str);
            aURAPerformanceFlowModel.setStartMills(System.currentTimeMillis());
            this.f20121a.put(str, aURAPerformanceFlowModel);
            U0(aURAPerformanceFlowModel);
        }
    }

    public final void Z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babf9b2", new Object[]{this, str});
            return;
        }
        Map<String, AURAPerformanceFlowModel> map = this.f20121a;
        if (map != null) {
            map.remove(str);
        }
    }

    public final void a1(AURAPerformanceStageModel aURAPerformanceStageModel) {
        Map<String, AURAPerformanceStageModel> M0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6481ace", new Object[]{this, aURAPerformanceStageModel});
            return;
        }
        aURAPerformanceStageModel.removeFromParentStage();
        if (this.c != null && (M0 = M0()) != null) {
            M0.remove(aURAPerformanceStageModel.getStageCode());
        }
    }

    public final void b1(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508fb7db", new Object[]{this, exc});
            return;
        }
        rbb g = ck.g();
        g.f("上报性能埋点异常:" + exc.getMessage(), ck.b.b().l("AURAUmbrellaPerformanceMonitor").i("AURA/Performance").j(P0()).a());
    }

    public final void d1(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ab766", new Object[]{this, str, new Long(j)});
        } else {
            dn.c().postDelayed(new a(str, j), j);
        }
    }

    public final void e1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a64dbb", new Object[]{this, str});
            return;
        }
        try {
            AURAPerformanceFlowModel m0 = m0(str);
            if (m0 == null) {
                ck.g().f("上报性能埋点#没有需要上报的流程性能数据", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", str).a());
            } else if (!m0.isRecordFinished()) {
                ck.g().f("上报性能埋点#流程没有开始或者结束时间点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", str).a());
            } else {
                HashMap hashMap = new HashMap();
                String jSONString = JSON.toJSONString(m0);
                hashMap.put(ncv.UMBRELLA_ARGS_PARAM_KEY, jSONString);
                if (th.c()) {
                    Log.e("PERFORMANCE", "cost：  " + jSONString);
                }
                ck.g().e(jSONString, ck.b.b().i("AURA/performance").g("flowCode", str).a());
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("EndToEnd_Performance_Detection", 19997, N0(), "", "", hashMap).build());
            }
        } catch (Exception e) {
            b1(e);
        }
    }

    @Override // tb.gcb
    public void f0(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c4a356", new Object[]{this, str, str2, str3});
        } else if (this.f20121a != null && this.c != null) {
            if (TextUtils.isEmpty(str3)) {
                q(str, str2);
                return;
            }
            Map<String, AURAPerformanceStageModel> M0 = M0();
            if (M0 == null) {
                ck.g().f("没有流程节点，无法设置开始点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", str).g("parentCode", str3).a());
            } else if (M0.get(str) != null) {
                ck.g().f("开始阶段埋点#该阶段已经在父阶段中了，无法添加阶段", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", str).g("stageName", str2).g("parentCode", str3).a());
            } else {
                AURAPerformanceStageModel aURAPerformanceStageModel = M0.get(str3);
                if (aURAPerformanceStageModel == null) {
                    ck.g().f("开始阶段埋点#父阶段不存在，无法添加阶段", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("stageCode", str).g("stageName", str2).g("parentCode", str3).a());
                    return;
                }
                AURAPerformanceStageModel aURAPerformanceStageModel2 = new AURAPerformanceStageModel(str);
                aURAPerformanceStageModel2.setStartMills(System.currentTimeMillis());
                aURAPerformanceStageModel.addChildStage(aURAPerformanceStageModel2);
                W0(aURAPerformanceStageModel2);
            }
        }
    }

    @Override // tb.gcb
    public void i0(String str, boolean z, Map<String, String> map) {
        AURAPerformanceStageModel childStage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebebd428", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        AURAPerformanceFlowModel Q0 = Q0(P0());
        if (Q0 != null && (childStage = Q0.getChildStage(str)) != null) {
            childStage.setEndMills(System.currentTimeMillis());
            childStage.setArgs(map);
            V0(childStage, z, 0L);
        }
    }

    public final AURAPerformanceFlowModel m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceFlowModel) ipChange.ipc$dispatch("78dd3d6d", new Object[]{this, str});
        }
        Map<String, AURAPerformanceFlowModel> map = this.b;
        if (map != null) {
            return map.remove(str);
        }
        ck.g().f("producePendingModel#没有调用ensurePendingForUploadModelMap，不消费性能上报数据", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(str).a());
        return null;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.d = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.e = aURAFlowData;
        K0(aURAFlowData);
        L0(aURAFlowData);
        J0(aURAFlowData);
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            e1(P0());
            Map<String, AURAPerformanceFlowModel> map = this.f20121a;
            if (map != null) {
                map.clear();
            }
            Map<String, Map<String, AURAPerformanceStageModel>> map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Exception unused) {
            ck.g().f("销毁Handler异常", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(P0()).a());
        }
    }

    @Override // tb.gcb
    public void q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae347c8", new Object[]{this, str, str2});
            return;
        }
        AURAPerformanceFlowModel Q0 = Q0(P0());
        if (Q0 != null && Q0.getChildStage(str) == null) {
            AURAPerformanceStageModel aURAPerformanceStageModel = new AURAPerformanceStageModel(str);
            aURAPerformanceStageModel.setStartMills(System.currentTimeMillis());
            Q0.addChildStage(aURAPerformanceStageModel);
            W0(aURAPerformanceStageModel);
        }
    }

    @Override // tb.gcb
    public void s0(AURAPerformanceStageModel aURAPerformanceStageModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649370a", new Object[]{this, aURAPerformanceStageModel, str, new Boolean(z)});
        } else if (this.c != null) {
            if (str == null) {
                L(aURAPerformanceStageModel, z);
                return;
            }
            Map<String, AURAPerformanceStageModel> M0 = M0();
            if (!bh.b(M0) && M0.get(aURAPerformanceStageModel.getStageCode()) == null) {
                AURAPerformanceStageModel aURAPerformanceStageModel2 = M0.get(str);
                if (aURAPerformanceStageModel2 != null) {
                    aURAPerformanceStageModel2.addChildStage(aURAPerformanceStageModel);
                }
                W0(aURAPerformanceStageModel);
                V0(aURAPerformanceStageModel, z, 0L);
            }
        }
    }

    @Override // tb.gcb
    public void v0(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85ef5cf", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        AURAPerformanceFlowModel Q0 = Q0(str);
        if (Q0 == null) {
            ck.g().f("流程结束#没有流程起始点", ck.b.b().l("AURAUmbrellaPerformanceMonitor").g("flowCode", str).a());
        } else if (!Q0.isRecordFinished()) {
            Q0.setEndMills(System.currentTimeMillis());
            Q0.addCommonArgs(map);
            T0(Q0, z);
        }
    }

    public final boolean S0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b90b17ff", new Object[]{this, str})).booleanValue();
        }
        Map<String, Map<String, AURAPerformanceStageModel>> map = this.c;
        if (map == null) {
            return true;
        }
        Map<String, AURAPerformanceStageModel> map2 = map.get(str);
        if (map2 == null) {
            ck.g().f("isAllStageRecordFinished#流程节点不存在", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(str).a());
            return true;
        }
        for (AURAPerformanceStageModel aURAPerformanceStageModel : map2.values()) {
            if (!aURAPerformanceStageModel.isRecordFinished()) {
                ck.g().e("isAllStageRecordFinished#阶段尚未完成", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(str).g("stageCode", aURAPerformanceStageModel.getStageCode()).a());
                return false;
            }
        }
        return true;
    }

    public final boolean c1(AURAPerformanceFlowModel aURAPerformanceFlowModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f15fff4", new Object[]{this, aURAPerformanceFlowModel, new Long(j)})).booleanValue();
        }
        String flowCode = aURAPerformanceFlowModel.getFlowCode();
        if (!aURAPerformanceFlowModel.isRecordFinished()) {
            ck.g().e("producePendingModel#流程尚未结束，不追加性能上报数据", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(aURAPerformanceFlowModel.getFlowCode()).a());
            return false;
        } else if (!S0(flowCode)) {
            ck.g().e("producePendingModel#流程下还有阶段尚未完成上报，不追加性能上报数据", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(aURAPerformanceFlowModel.getFlowCode()).a());
            return false;
        } else if (this.b == null) {
            ck.g().f("producePendingModel#没有调用ensurePendingForUploadModelMap，不追加性能上报数据", ck.b.b().l("AURAUmbrellaPerformanceMonitor").j(aURAPerformanceFlowModel.getFlowCode()).a());
            return false;
        } else {
            aURAPerformanceFlowModel.setStartMills(R0(aURAPerformanceFlowModel));
            aURAPerformanceFlowModel.setEndMills(System.currentTimeMillis());
            this.b.put(flowCode, aURAPerformanceFlowModel);
            if (j == 0) {
                Y0(flowCode);
                Z0(flowCode);
            }
            return true;
        }
    }
}
