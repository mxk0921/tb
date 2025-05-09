package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.AbstractC1154db;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.core.WukongNativeManager;
import com.alibaba.security.client.smart.core.model.EvalResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.config.RiskSceneInfo;
import com.alibaba.security.wukong.config.WukongConfigData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.plugin.BaseWukongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ba implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2543a = "WuKongManager";
    public static final int b = 1;
    public static final String c = "statics";
    public static final String d = "tracesV2";
    public static final String e = "data";
    public static final String f = "clientInfo";
    public static final String g = "pId";
    public static final String h = "ccrcCode";
    public static final String i = "ccrc_service";
    public static final String j = "engine_error";
    public static InferContext k = null;
    public static String l = null;
    public final String m;
    public final sb o;
    public final C1159fa p;
    public final Handler r;
    public final Ja s;
    public final String u;
    public WukongConfigData v;
    public CcrcService.Config w;
    public AbstractC1157eb x;
    public A y;
    public final CopyOnWriteArrayList<String> q = new CopyOnWriteArrayList<>();
    public final vb n = vb.c();
    public final C1200xa t = new C1200xa(this);
    public final WukongNativeManager z = WukongNativeManager.c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(boolean z, String str);
    }

    static {
        p();
    }

    public Ba(String str, String str2) {
        this.m = str;
        this.u = str2;
        this.p = new C1159fa(str);
        this.s = new Ja(str);
        this.o = sb.a(str);
        HandlerThread handlerThread = new HandlerThread("statistic_data_process");
        handlerThread.start();
        this.r = new Handler(handlerThread.getLooper(), this);
    }

    private Map<String, Object> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        WukongConfigData wukongConfigData = this.v;
        if (wukongConfigData != null) {
            return wukongConfigData.getAlgoConfig(str);
        }
        return null;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]);
        }
        return "{\"appKey\":\"1212123\",\"appName\":\"xxxxx\",\"bizFeatures\":{},\"ccrcCode\":\"xcsdsdsdsf\",\"ccrcResults\":{\"_errorMsg\":\"algo config list is empty\",\"dataId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"extras\":{}},\"deviceModel\":\"Pixel 7\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"osName\":\"Android\",\"osVersion\":\"14\",\"pid\":\"CT_83784883-884c-4fc9-a740-befa334e87a6\",\"prepareID\":\"PREPARE_CCRC_ZHENGFENG_TEST2_508BFC00-66A0-4DD6-98AE-6ABE6EC2D4E0\",\"raw\":{\"behavior\":{\"asdasf\":1232323,\"test\":1212,\"ytyhg\":\"asda://baidu.com\",\"pageName\":\"scan\",\"jumpUrl\":\"sdsdsfg://ggfgf.com\"}},\"sdkVersion\":\"1.9.20121\",\"utdid\":\"Ytyasdsaiwussdsd\",\"wukong_uuid\":\"0c7cd97a-7575-4a05-a35f-a68f0aea9ee5_ANDROID_WUKONG_1721737747016_9590\"}";
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[0]);
        } else if (k == null) {
            InferContext inferContext = (InferContext) JsonUtils.parseObject("{\"appKey\":\"1212123\",\"appName\":\"xxxxx\",\"bizFeatures\":{},\"ccrcCode\":\"xcsdsdsdsf\",\"ccrcResults\":{\"_errorMsg\":\"algo config list is empty\",\"dataId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"extras\":{}},\"deviceModel\":\"Pixel 7\",\"metaId\":\"6061bf5a-4441-4a88-93a0-2417df0612d2\",\"osName\":\"Android\",\"osVersion\":\"14\",\"pid\":\"CT_83784883-884c-4fc9-a740-befa334e87a6\",\"prepareID\":\"PREPARE_CCRC_ZHENGFENG_TEST2_508BFC00-66A0-4DD6-98AE-6ABE6EC2D4E0\",\"raw\":{\"behavior\":{\"asdasf\":1232323,\"test\":1212,\"ytyhg\":\"asda://baidu.com\",\"pageName\":\"scan\",\"jumpUrl\":\"sdsdsfg://ggfgf.com\"}},\"sdkVersion\":\"1.9.20121\",\"utdid\":\"Ytyasdsaiwussdsd\",\"wukong_uuid\":\"0c7cd97a-7575-4a05-a35f-a68f0aea9ee5_ANDROID_WUKONG_1721737747016_9590\"}", (Class<Object>) InferContext.class);
            k = inferContext;
            l = JsonUtils.toJSONString(inferContext);
        }
    }

    private Context q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a925b70", new Object[]{this});
        }
        return CcrcContextImpl.getContext();
    }

    private String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        CcrcService.Config config = this.w;
        if (config != null) {
            return config.getPid();
        }
        return this.u;
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.r.sendEmptyMessageDelayed(1, this.n.g());
        }
    }

    public void a(CcrcService.Config config, AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e714991", new Object[]{this, config, dbVar});
            return;
        }
        this.w = config;
        this.p.a(config.getPid());
        this.s.a(f(), config.getPid(), new Aa(this, dbVar));
    }

    public String b(String str) {
        String str2;
        List<RiskSceneInfo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        WukongConfigData wukongConfigData = this.v;
        if (!(wukongConfigData == null || (list = wukongConfigData.sceneList) == null)) {
            for (RiskSceneInfo riskSceneInfo : list) {
                if (riskSceneInfo.contains(str)) {
                    str2 = riskSceneInfo.sceneName;
                    break;
                }
            }
        }
        str2 = null;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        WukongConfigData wukongConfigData = this.v;
        if (wukongConfigData != null) {
            return wukongConfigData.eventCodes;
        }
        return null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        return this.u;
    }

    public List<Algo> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        WukongConfigData wukongConfigData = this.v;
        if (wukongConfigData == null) {
            return null;
        }
        return wukongConfigData.getPythonList();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return this.x.a();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        WukongConfigData wukongConfigData = this.v;
        if (wukongConfigData == null || !wukongConfigData.isAlgoListIsEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            c(false);
        }
        return true;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return this.t.c();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return this.s.b();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return this.n.e(this.m);
    }

    public Map<String, Integer> m() {
        List<RiskSceneInfo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        WukongConfigData wukongConfigData = this.v;
        if (!(wukongConfigData == null || (list = wukongConfigData.sceneList) == null)) {
            for (RiskSceneInfo riskSceneInfo : list) {
                hashMap.put(riskSceneInfo.sceneName, Integer.valueOf(riskSceneInfo.needInferSize()));
            }
        }
        return hashMap;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.z != null && this.n.n() && this.n.b(this.m)) {
            this.z.a(this.m, r(), d());
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        c(true);
        this.r.removeMessages(1);
        this.z.c(d());
        this.s.c();
        this.t.d();
        this.p.a();
        this.z.b(d());
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        String e2 = this.z.e();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.q;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            this.q.clear();
        }
        a(e2, "");
        if (!z) {
            this.r.sendEmptyMessageDelayed(1, this.n.g());
        }
    }

    public void a(final String str, final C c2, final boolean z, final AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150f843", new Object[]{this, str, c2, new Boolean(z), dbVar});
        } else {
            a(new a() { // from class: tb.myy
                @Override // com.alibaba.security.ccrc.service.build.Ba.a
                public final void a(boolean z2, String str2) {
                    Ba.this.a(dbVar, str, c2, z, z2, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AbstractC1154db dbVar, final String str, final C c2, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6ff57b", new Object[]{this, dbVar, str, c2, new Boolean(z), new Boolean(z2), str2});
        } else if (!z2) {
            dbVar.a(false, "wukong engine init fail: " + str2, null);
        } else {
            this.t.a(str, c2, z, new AbstractC1145ab() { // from class: tb.ryy
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1145ab
                public final void a(boolean z3, String str3, WukongConfigData wukongConfigData) {
                    Ba.this.a(dbVar, c2, str, z3, str3, wukongConfigData);
                }
            });
        }
    }

    private synchronized boolean b(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6c3b6b1", new Object[]{this, str, str2, str3, new Boolean(z)})).booleanValue();
        }
        boolean a2 = this.z.a(CcrcContextImpl.getContext(), d(), str, str2, str3, this.m);
        a(this.m, a2, str3, z);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AbstractC1154db dbVar, C c2, String str, boolean z, String str2, WukongConfigData wukongConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023da", new Object[]{this, dbVar, c2, str, new Boolean(z), str2, wukongConfigData});
        } else if (!z) {
            dbVar.a(false, str2, null);
        } else {
            String a2 = a(wukongConfigData, c2, str);
            if (!TextUtils.isEmpty(a2)) {
                dbVar.a(false, a2, null);
            } else {
                this.s.a(f(), new AbstractC1154db() { // from class: tb.oyy
                    @Override // com.alibaba.security.ccrc.service.build.AbstractC1154db
                    public final void a(boolean z2, String str3, Map map) {
                        Ba.a(AbstractC1154db.this, z2, str3, map);
                    }
                });
            }
        }
    }

    private void b(EvalResult evalResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b01afa5", new Object[]{this, evalResult});
        } else if (TextUtils.isEmpty(evalResult.traceInfo)) {
            Logging.w(f2543a, "restoreInfo is empty");
        } else {
            b(evalResult.traceInfo, evalResult.errorMsg);
            this.q.add(evalResult.traceInfo);
        }
    }

    public WukongConfigData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WukongConfigData) ipChange.ipc$dispatch("e61d474d", new Object[]{this}) : this.v;
    }

    public static /* synthetic */ void a(AbstractC1154db dbVar, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410a8335", new Object[]{dbVar, new Boolean(z), str, map});
        } else {
            dbVar.a(z, str, map);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.n.a(this.m);
    }

    private RiskSceneInfo a(BaseWukongContentRiskPlugin baseWukongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RiskSceneInfo) ipChange.ipc$dispatch("cd5ee7a3", new Object[]{this, baseWukongContentRiskPlugin});
        }
        List<RiskSceneInfo> list = this.v.sceneList;
        if (list == null) {
            return null;
        }
        for (RiskSceneInfo riskSceneInfo : list) {
            if (riskSceneInfo.isPlugin && TextUtils.equals(riskSceneInfo.sceneName, baseWukongContentRiskPlugin.name())) {
                return riskSceneInfo;
            }
        }
        String name = baseWukongContentRiskPlugin.name();
        Logging.w(f2543a, "plugin " + name + " is not inConfig");
        return null;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.o.a(Boolean.valueOf(z));
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(str, str2, d);
        }
    }

    private String a(WukongConfigData wukongConfigData, C c2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffb9c1b8", new Object[]{this, wukongConfigData, c2, str});
        }
        this.v = wukongConfigData;
        if (wukongConfigData == null) {
            return "dispatch config fail by config is null";
        }
        if (!a(wukongConfigData.featureSet, wukongConfigData.event, str, false)) {
            StringBuilder a2 = Kb.a("event register fail ");
            a2.append(this.v.event);
            return a2.toString();
        }
        n();
        return a(c2);
    }

    private String a(C c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9171209f", new Object[]{this, c2});
        }
        if (!this.v.isHaveCppAlgo()) {
            return null;
        }
        this.x.a(CcrcContextImpl.getContext());
        Iterator<BaseWukongContentRiskPlugin> it = c2.a().iterator();
        while (it.hasNext()) {
            BaseWukongContentRiskPlugin next = it.next();
            RiskSceneInfo a2 = a(next);
            if (a2 == null) {
                it.remove();
            } else {
                List<Algo> list = a2.algoList;
                if (list != null && !list.isEmpty()) {
                    for (Algo algo : list) {
                        if (!TextUtils.isEmpty(algo.code) && !next.inputConfig(this.m, c(algo.code))) {
                            StringBuilder a3 = Kb.a("dispatchConf fail by input conf fail, ");
                            a3.append(next.name());
                            return a3.toString();
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public boolean a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0bfeb52", new Object[]{this, str, str2, str3, new Boolean(z)})).booleanValue() : b(str, str2, str3, z);
    }

    public void a(String str, String str2, Map<String, Object> map, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73d4e3c", new Object[]{this, str, str2, map, sampleData});
            return;
        }
        String str3 = this.m;
        String str4 = this.u;
        WukongConfigData wukongConfigData = this.v;
        a(d(), new InferContext(str3, str, str4, str2, map, sampleData, wukongConfigData.riskInfoVersion, wukongConfigData.env));
    }

    private void a(List<String> list, InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c5c0d", new Object[]{this, list, inferContext});
        } else if (list == null || list.isEmpty()) {
            Logging.e(f2543a, "doProcessData fail because eventCodeList is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            this.y.a(this.w, inferContext);
            final EvalResult a2 = this.z.a(list, inferContext);
            a(inferContext, a2, System.currentTimeMillis() - currentTimeMillis, r());
            C1184p.b(new Runnable() { // from class: tb.nyy
                @Override // java.lang.Runnable
                public final void run() {
                    Ba.this.a(a2);
                }
            });
            if (!this.r.hasMessages(1)) {
                s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(EvalResult evalResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c34006", new Object[]{this, evalResult});
        } else {
            b(evalResult);
        }
    }

    private synchronized void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cbdff0", new Object[]{this, aVar});
        } else {
            this.z.a(aVar);
        }
    }

    public static /* synthetic */ void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init").setOperation(C1174ka.a.d).setStatus(-1).addParam("forceUpdate", Boolean.valueOf(z)).build());
        }
    }

    private void a(final String str, boolean z, final String str2, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25c9628", new Object[]{this, str, new Boolean(z), str2, new Boolean(z2)});
        } else if (!z) {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.pyy
                @Override // java.lang.Runnable
                public final void run() {
                    Ba.a(str2, str, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, InferContext inferContext, EvalResult evalResult, long j2) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45e19aa", new Object[]{this, str, inferContext, evalResult, new Long(j2)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(this.m).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setPhase("detect").setOperation(C1174ka.a.e);
        if (!evalResult.success()) {
            i2 = -1;
        }
        TrackManager.track(operation.setStatus(i2).addParam("errorMsg", evalResult.errorMsg).addParam("isHit", Boolean.valueOf(evalResult.hit)).addParam("costTime", Long.valueOf(j2)).build());
    }

    private void a(final InferContext inferContext, final EvalResult evalResult, final long j2, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4deea3fe", new Object[]{this, inferContext, evalResult, new Long(j2), str});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.qyy
                @Override // java.lang.Runnable
                public final void run() {
                    Ba.this.a(str, inferContext, evalResult, j2);
                }
            });
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        WukongConfigData wukongConfigData = this.v;
        if (wukongConfigData != null) {
            return wukongConfigData.versionInfo.configMd5;
        }
        return null;
    }

    public void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f6a750", new Object[]{this, cCRCRiskSample, config, new Boolean(z)});
        } else {
            this.s.a(cCRCRiskSample, config, z);
        }
    }

    public void a(C1193u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4228f4af", new Object[]{this, uVar});
        } else {
            this.s.a(uVar);
        }
    }

    public void a(AbstractC1157eb ebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226220f", new Object[]{this, ebVar});
            return;
        }
        this.x = ebVar;
        this.s.a(ebVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.p.b(str);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p.a(z);
        }
    }

    public void a(C1195v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4229690e", new Object[]{this, vVar});
        } else {
            this.s.a(vVar);
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.p.a(map);
        }
    }

    public void a(A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42115163", new Object[]{this, a2});
        } else {
            this.y = a2;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str, str2, c);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("data", C1178m.a(str.getBytes()));
            hashMap.put("clientInfo", C1178m.a(JsonUtils.toJSONString(C1171ja.a(CcrcContextImpl.getContext())).getBytes()));
            hashMap.put(g, r());
            hashMap.put("ccrcCode", this.m);
            hashMap.put(j, str2);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(i, 19997, str3, "", "", hashMap).build());
        }
    }
}
