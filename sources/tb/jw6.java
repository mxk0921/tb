package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet;
import com.alibaba.ut.abtest.internal.bucketing.ExperimentRoutingType;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognation;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentCognationType;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.alibaba.ut.abtest.pipeline.Response;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jw6 implements dw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f22253a = new AtomicBoolean(false);
    public final Comparator<ExperimentV5> b = new a(this);
    public volatile long c = 0;
    public String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Comparator<ExperimentV5> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(jw6 jw6Var) {
        }

        /* renamed from: a */
        public int compare(ExperimentV5 experimentV5, ExperimentV5 experimentV52) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("202a74df", new Object[]{this, experimentV5, experimentV52})).intValue();
            }
            if (experimentV5.getId() != experimentV52.getId()) {
                return (int) (experimentV5.getId() - experimentV52.getId());
            }
            long j2 = 0;
            if (experimentV5.getGroups() == null || experimentV5.getGroups().isEmpty()) {
                j = 0;
            } else {
                j = experimentV5.getGroups().get(0).getId();
            }
            if (experimentV52.getGroups() != null && !experimentV52.getGroups().isEmpty()) {
                j2 = experimentV52.getGroups().get(0).getId();
            }
            return (int) (j - j2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22254a;
        public final /* synthetic */ String b;

        public b(boolean z, String str) {
            this.f22254a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                jw6.z(jw6.this, System.currentTimeMillis());
                if (n.j().c() != UTABMethod.Pull) {
                    n.j().m().syncExperiments(false, this.b);
                } else if (this.f22254a) {
                    ydt.h(1002);
                    jw6.A(jw6.this, this.b);
                } else if (ydt.f(1002)) {
                    ogh.f("DecisionServiceImpl", "【实验数据】更新运行中，取消本次更新。");
                } else {
                    long B = jw6.B(jw6.this);
                    if (B <= 0) {
                        jw6.A(jw6.this, this.b);
                    } else {
                        ogh.f("DecisionServiceImpl", "【实验数据】" + B + "毫秒后开始更新实验数据。");
                        jw6.C(jw6.this, B, this.b);
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22255a;

        public c(String str) {
            this.f22255a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                jw6.A(jw6.this, this.f22255a);
            } catch (Throwable th) {
                ku0.j("DecisionService.delaySyncExperiments", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ do8 f22256a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ pv6 d;

        public d(do8 do8Var, Object obj, Map map, pv6 pv6Var) {
            this.f22256a = do8Var;
            this.b = obj;
            this.c = map;
            this.d = pv6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n.j().n().c(this.f22256a, this.b);
            n.j().n().b(this.f22256a, this.c, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ do8 f22257a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ pv6 d;

        public e(do8 do8Var, Object obj, Map map, pv6 pv6Var) {
            this.f22257a = do8Var;
            this.b = obj;
            this.c = map;
            this.d = pv6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n.j().n().j(this.f22257a, this.b);
            n.j().n().b(this.f22257a, this.c, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ do8 f22258a;
        public final /* synthetic */ pv6 b;

        public f(do8 do8Var, pv6 pv6Var) {
            this.f22258a = do8Var;
            this.b = pv6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n.j().n().c(this.f22258a, null);
            n.j().n().b(this.f22258a, null, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mwa f22259a;
        public final /* synthetic */ do8 b;

        public g(mwa mwaVar, do8 do8Var) {
            this.f22259a = mwaVar;
            this.b = do8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n.j().n().k(this.f22259a);
            n.j().n().b(this.b, null, new pv6());
        }
    }

    static {
        t2o.a(961544265);
        t2o.a(961544264);
    }

    public static /* synthetic */ void A(jw6 jw6Var, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd0f947", new Object[]{jw6Var, str});
        } else {
            jw6Var.x(str);
        }
    }

    public static /* synthetic */ long B(jw6 jw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5743432", new Object[]{jw6Var})).longValue();
        }
        return jw6Var.M();
    }

    public static /* synthetic */ void C(jw6 jw6Var, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6b456f", new Object[]{jw6Var, new Long(j), str});
        } else {
            jw6Var.F(j, str);
        }
    }

    public static /* synthetic */ AtomicBoolean D(jw6 jw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("10d2b880", new Object[]{jw6Var});
        }
        return jw6Var.f22253a;
    }

    public static /* synthetic */ void O(do8 do8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d383b5de", new Object[]{do8Var});
        } else {
            n.j().n().g(do8Var);
        }
    }

    public static /* synthetic */ void Q(do8 do8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e17d4f", new Object[]{do8Var});
        } else {
            n.j().n().g(do8Var);
        }
    }

    public static /* synthetic */ void R(do8 do8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce46132c", new Object[]{do8Var});
        } else {
            n.j().n().g(do8Var);
        }
    }

    public static /* synthetic */ void S(do8 do8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53134824", new Object[]{do8Var});
        } else {
            n.j().n().g(do8Var);
        }
    }

    public static /* synthetic */ long z(jw6 jw6Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d02e01ba", new Object[]{jw6Var, new Long(j)})).longValue();
        }
        jw6Var.c = j;
        return j;
    }

    public ExperimentGroupV5 E(ExperimentV5 experimentV5, Map<String, Object> map, pv6 pv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentGroupV5) ipChange.ipc$dispatch("fea0b9bb", new Object[]{this, experimentV5, map, pv6Var});
        }
        if (experimentV5.getGroups() == null) {
            return null;
        }
        int I = I(experimentV5.getId(), experimentV5.getCognation(), pv6Var);
        for (ExperimentGroupV5 experimentGroupV5 : experimentV5.getGroups()) {
            pv6Var.a("groupId=" + experimentGroupV5.getId() + ", groupRoutingRange=" + Arrays.deepToString(experimentGroupV5.getRatioRange()));
            if (kw6.f(I, experimentGroupV5) && (experimentV5.getType() != ExperimentType.Redirect || n.j().h().b(experimentGroupV5.getConditionExpression(), map, experimentV5.getId(), experimentGroupV5.getId()))) {
                return experimentGroupV5;
            }
        }
        return null;
    }

    public final void F(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8273e2f", new Object[]{this, new Long(j), str});
        } else {
            ydt.c(1002, new c(str), j);
        }
    }

    public do8 G(String str, String str2, Map<String, Object> map, pv6 pv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (do8) ipChange.ipc$dispatch("554d4f72", new Object[]{this, str, str2, map, pv6Var});
        }
        if (TextUtils.equals(UTABTest.COMPONENT_URI, str)) {
            return N(str, str2, map, pv6Var);
        }
        return L(str, str2, map, pv6Var);
    }

    public int I(long j, ExperimentCognation experimentCognation, pv6 pv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcd1b432", new Object[]{this, new Long(j), experimentCognation, pv6Var})).intValue();
        }
        if (experimentCognation == null) {
            return -1;
        }
        if (experimentCognation.getType() == ExperimentCognationType.RootDomain) {
            pv6Var.a("rootDomain=" + experimentCognation.getCode());
            return I(j, experimentCognation.getChild(), pv6Var);
        } else if (experimentCognation.getType() == ExperimentCognationType.Domain) {
            if (experimentCognation.getParent() != null && experimentCognation.getParent().getType() == ExperimentCognationType.Layer) {
                pv6Var.a("domainId=" + experimentCognation.getId());
                if (kw6.e(H(experimentCognation.getParent(), j, pv6Var), experimentCognation.getRatioRange())) {
                    return I(j, experimentCognation.getChild(), pv6Var);
                }
            }
            return -1;
        } else if (experimentCognation.getType() == ExperimentCognationType.Layer) {
            if (experimentCognation.getChild() != null) {
                return I(j, experimentCognation.getChild(), pv6Var);
            }
            pv6Var.a("layerId=" + experimentCognation.getId());
            pv6Var.a("layerRoutingType=" + experimentCognation.getRoutingType().name());
            pv6Var.a("layerRoutingFactor=" + experimentCognation.getRoutingFactor());
            return H(experimentCognation, j, pv6Var);
        } else if (experimentCognation.getType() == ExperimentCognationType.LaunchLayer) {
            return H(experimentCognation, j, pv6Var);
        } else {
            return -1;
        }
    }

    public final long M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82f9b726", new Object[]{this})).longValue();
        }
        long O = n.j().a().O();
        if (n.j().e().n() == 0 || O == 0) {
            return 0L;
        }
        return wyv.k((int) O);
    }

    public final do8 N(String str, String str2, Map<String, Object> map, pv6 pv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (do8) ipChange.ipc$dispatch("cadf3652", new Object[]{this, str, str2, map, pv6Var});
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        Uri j = tnv.j(str2);
        if (j == null) {
            return null;
        }
        List<ExperimentV5> n = qo8.s().n(j);
        if (n == null) {
            ogh.i("DecisionServiceImpl", "【运行实验】未查找到实验。来源URL：" + str2);
            return null;
        }
        ogh.i("DecisionServiceImpl", "【运行实验】查找到" + n.size() + "个实验。来源URL：" + str2);
        hashMap.putAll(tnv.h(j));
        pv6Var.b("attributes", hashMap);
        return U(str2, j, K(str, n, hashMap, pv6Var, false));
    }

    public final /* synthetic */ void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3529a4e5", new Object[]{this, str});
            return;
        }
        this.c = System.currentTimeMillis();
        ydt.h(1002);
        try {
            try {
                x(str);
            } catch (Exception e2) {
                ku0.j("DecisionService.forcePullSyncExperiments", e2);
            }
        } finally {
            this.f22253a.set(false);
        }
    }

    public final void T(List<Long> list, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795e6e8e", new Object[]{this, list, str, str2, map, map2});
        } else if (n.j().a().P()) {
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (!(TextUtils.isEmpty(entry.getKey()) || TextUtils.isEmpty(entry.getValue()) || TextUtils.isEmpty(map.get(entry.getKey())) || entry.getValue().equals(map.get(entry.getKey())))) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sourceUrl", (Object) str);
                        jSONObject.put("targetUrl", (Object) str2);
                        ku0.f(ku0.PARAM_HANDLE_ERROR, jSONObject.toJSONString(), wyv.i(list, "."), "");
                        return;
                    }
                }
            } catch (Throwable th) {
                ku0.j("DecisionServiceImpl.paramsCheck", th);
            }
        }
    }

    public final void V(mwa mwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8514e4d", new Object[]{this, mwaVar});
            return;
        }
        final do8 do8Var = new do8(mwaVar);
        ydt.e(new g(mwaVar, do8Var));
        ydt.b(new Runnable() { // from class: tb.iw6
            @Override // java.lang.Runnable
            public final void run() {
                jw6.S(do8.this);
            }
        });
    }

    @Override // tb.dw6
    public VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("9fffdb2d", new Object[]{this, str, str2, map, new Boolean(z), obj});
        }
        pv6 pv6Var = new pv6();
        final do8 G = G(str, str2, map, pv6Var);
        if (G == null) {
            return null;
        }
        if (!G.h() && (G.g() == null || G.g().isEmpty())) {
            return null;
        }
        if (z) {
            ydt.e(new d(G, obj, map, pv6Var));
            ydt.b(new Runnable() { // from class: tb.gw6
                @Override // java.lang.Runnable
                public final void run() {
                    jw6.Q(do8.this);
                }
            });
        }
        return new DefaultVariationSet(G);
    }

    @Override // tb.dw6
    public List<EVOExperiment> c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a6e6a6e", new Object[]{this, str, map});
        }
        List<ExperimentV5> p = qo8.s().p(str);
        if (p == null || p.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentV5 experimentV5 : p) {
            if (!kw6.b(experimentV5)) {
                ogh.n("DecisionServiceImpl", "【查找实验】实验周期计算。实验ID：" + experimentV5.getId() + "，计算结果：不在实验时间周期内。");
            } else if (!n.j().h().b(experimentV5.getConditionExpression(), map, experimentV5.getId(), 0L)) {
                ogh.f("DecisionServiceImpl", "【运行实验】实验条件计算。实验ID：" + experimentV5.getId() + "，计算结果：不符合条件。");
            } else {
                EVOExperiment b2 = go8.b(experimentV5);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    @Override // tb.dw6
    public VariationSet g(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("d6ea12f5", new Object[]{this, str, str2, map, obj});
        }
        pv6 pv6Var = new pv6();
        final do8 G = G(str, str2, map, pv6Var);
        if (G == null) {
            return null;
        }
        if (!G.h() && (G.g() == null || G.g().isEmpty())) {
            return null;
        }
        ydt.e(new e(G, obj, map, pv6Var));
        ydt.b(new Runnable() { // from class: tb.fw6
            @Override // java.lang.Runnable
            public final void run() {
                jw6.R(do8.this);
            }
        });
        return new DefaultVariationSet(G);
    }

    @Override // tb.dw6
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e4e1a7a", new Object[]{this});
        }
        return qo8.s().g();
    }

    @Override // tb.dw6
    public long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170c816e", new Object[]{this})).longValue();
        }
        return this.c;
    }

    @Override // tb.dw6
    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        ogh.e("DecisionServiceImpl", "initialize");
        try {
            qo8.s().w();
        } catch (Throwable th) {
            ku0.j("DecisionService.initialize", th);
        }
    }

    @Override // tb.dw6
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1300452c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // tb.dw6
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d40e4a8", new Object[]{this});
            return;
        }
        ogh.i("DecisionServiceImpl", "【实验数据】取消更新实验数据。");
        ydt.h(1002);
    }

    @Override // tb.dw6
    public do8 m(ExperimentV5 experimentV5, Map<String, Object> map, pv6 pv6Var, boolean z) {
        HashMap hashMap;
        List<ExperimentV5> K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (do8) ipChange.ipc$dispatch("c4e2a317", new Object[]{this, experimentV5, map, pv6Var, new Boolean(z)});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(experimentV5);
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = null;
        }
        pv6Var.b("attributes", hashMap);
        String[] e2 = a1.e(experimentV5.getKey());
        if (e2 == null || (K = K(e2[0], arrayList, hashMap, pv6Var, z)) == null || K.isEmpty()) {
            return null;
        }
        do8 do8Var = new do8();
        ExperimentV5 experimentV52 = K.get(0);
        if (experimentV52.getGroups() != null && !experimentV52.getGroups().isEmpty()) {
            do8Var.a(experimentV52);
            if (!n.j().a().d() || !experimentV52.isRetain()) {
                HashMap hashMap2 = new HashMap();
                for (ExperimentCognation cognation = experimentV52.getCognation(); cognation != null; cognation = cognation.getChild()) {
                    if ((cognation.getType() == ExperimentCognationType.RootDomain || cognation.getType() == ExperimentCognationType.Domain) && cognation.getVariations() != null && !cognation.getVariations().isEmpty()) {
                        hashMap2.putAll(cognation.getVariations());
                    }
                }
                if (experimentV52.getVariations() != null) {
                    hashMap2.putAll(experimentV52.getVariations());
                }
                hashMap2.putAll(experimentV52.getGroups().get(0).getVariations());
                do8Var.j(hashMap2);
            } else {
                do8Var.i(true);
            }
        }
        return do8Var;
    }

    @Override // tb.dw6
    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3adcfed6", new Object[]{this})).longValue();
        }
        return qo8.s().k();
    }

    @Override // tb.dw6
    public void o(String str, String str2, bzu bzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec851a1", new Object[]{this, str, str2, bzuVar});
        } else {
            qo8.s().A(str, str2, bzuVar);
        }
    }

    @Override // tb.dw6
    @Deprecated
    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8842de", new Object[]{this});
        }
        return qo8.s().j();
    }

    @Override // tb.dw6
    public void q(String str, String str2, bzu bzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc284c3e", new Object[]{this, str, str2, bzuVar});
        } else {
            qo8.s().d(str, str2, bzuVar);
        }
    }

    @Override // tb.dw6
    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7064d24", new Object[]{this});
        }
        return qo8.s().h();
    }

    @Override // tb.dw6
    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cc51c1e", new Object[]{this})).intValue();
        }
        return qo8.s().i();
    }

    @Override // tb.dw6
    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d062a4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            qo8.s().G(str);
        } else {
            qo8 s = qo8.s();
            s.G(bsq.g(n.j().o()) + str);
        }
    }

    public final void x(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3e8dcd", new Object[]{this, str});
        } else {
            y(str);
        }
    }

    public final void y(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc70b98e", new Object[]{this, str});
            return;
        }
        ogh.i("DecisionServiceImpl", "【实验数据】开始更新实验数据。");
        c3o a2 = e4o.a();
        Response a3 = n.j().l().a(a2);
        if (n.j().q()) {
            ogh.i("DecisionServiceImpl", "【实验数据】请求参数：" + a2);
        }
        if (a3 == null) {
            ogh.i("DecisionServiceImpl", "【实验数据】更新失败");
        } else if (!a3.isSuccess()) {
            ogh.i("DecisionServiceImpl", "【实验数据】更新失败，错误码：" + a3.getCode() + "，错误消息：" + a3.getMessage() + "，请求响应码：" + a3.getHttpResponseCode());
        } else if (a3.getDataJsonObject() == null || a3.getData() == null) {
            ogh.i("DecisionServiceImpl", "【实验数据】更新失败，内容为空或解析错误。");
        } else {
            lo8 lo8Var = (lo8) a3.getData();
            String str2 = bsq.g(n.j().o()) + lo8Var.signature;
            if (TextUtils.equals(str2, this.d)) {
                ogh.i("DecisionServiceImpl", "【实验数据】检查更新完成，数据未发生变化。");
                return;
            }
            this.d = str2;
            ogh.i("DecisionServiceImpl", "【实验数据】检查更新完成，数据发生变化。签名：" + lo8Var.signature);
            if (n.j().q()) {
                ogh.g("DecisionServiceImpl", "【实验数据】检查更新响应结果：".concat(new String(a3.getByteData(), "UTF-8")));
            }
            if (lo8Var.experimentIndexData != null) {
                n.j().g().a(new bj8(EventType.ExperimentV5Data, lo8Var.experimentIndexData, "pull_v5_" + str));
            }
            if (lo8Var.experimentBetaIndexData != null) {
                n.j().g().a(new bj8(EventType.BetaExperimentV5Data, lo8Var.experimentBetaIndexData, "pull_v5_beta_" + str));
            }
            if (lo8Var.experimentWhitelistData == null) {
                ogh.i("DecisionServiceImpl", "【白名单数据】数据内容为空，停止处理！");
            } else {
                n.j().d().k(lo8Var.experimentWhitelistData.groupIds);
            }
        }
    }

    public final ExperimentV5 J(List<ExperimentV5> list, Map<String, Object> map, pv6 pv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("7254c244", new Object[]{this, list, map, pv6Var});
        }
        if (list != null && !list.isEmpty()) {
            ogh.f("DecisionServiceImpl", "【运行实验】全局空桶实验命中计算。全局空桶实验数量：" + list.size());
            for (ExperimentV5 experimentV5 : list) {
                if (!kw6.b(experimentV5)) {
                    ogh.i("DecisionServiceImpl", "【运行实验】全局空桶实验周期计算。实验ID：" + experimentV5.getId() + "，计算结果：当前不在实验时间周期内。");
                } else {
                    ExperimentGroupV5 E = E(experimentV5, map, pv6Var);
                    if (E != null) {
                        ExperimentV5 copyBasicInfo = experimentV5.copyBasicInfo();
                        copyBasicInfo.setGroups(new ArrayList(3));
                        copyBasicInfo.getGroups().add(E);
                        ogh.i("DecisionServiceImpl", "【运行实验】全局空桶实验已命中。实验ID：" + experimentV5.getId());
                        return copyBasicInfo;
                    }
                }
            }
        }
        return null;
    }

    public final do8 L(String str, String str2, Map<String, Object> map, pv6 pv6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (do8) ipChange.ipc$dispatch("c483a5", new Object[]{this, str, str2, map, pv6Var});
        }
        ExperimentV5 m = qo8.s().m(a1.a(str, str2));
        if (m == null) {
            ogh.i("DecisionServiceImpl", "【运行实验】未查找到实验。命名空间：" + str + "，实验标识：" + str2);
            return null;
        }
        ogh.i("DecisionServiceImpl", "【运行实验】查找到 1 个实验。命名空间：" + str + "，实验标识：" + str2);
        return m(m, map, pv6Var, false);
    }

    @Override // tb.dw6
    public void l(List<ExperimentV5> list, Set<Long> set, long j, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594989f", new Object[]{this, list, set, new Long(j), str});
            return;
        }
        StringBuilder sb = new StringBuilder("【实验数据V5】保存数据。签名：");
        sb.append(str);
        sb.append(", 版本：");
        sb.append(j);
        sb.append(", 实验数量：");
        if (list != null) {
            i = list.size();
        }
        sb.append(i);
        ogh.f("DecisionServiceImpl", sb.toString());
        try {
            qo8.s().F(list, set, j, str);
        } catch (Throwable th) {
            ku0.j("DecisionService.saveExperimentsV5", th);
        }
    }

    @Override // tb.dw6
    public void r(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77460dc", new Object[]{this, str});
            return;
        }
        if (!this.f22253a.compareAndSet(false, true)) {
            ogh.i("DecisionServiceImpl", "【实验数据】更新运行中，取消本次强制PULL更新。");
        }
        ydt.b(new Runnable() { // from class: tb.hw6
            @Override // java.lang.Runnable
            public final void run() {
                jw6.this.P(str);
            }
        });
    }

    @Override // tb.dw6
    public void syncExperiments(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2daadc", new Object[]{this, new Boolean(z), str});
            return;
        }
        if (z) {
            str2 = "立即开始更新数据";
        } else {
            str2 = "延时开始更新数据";
        }
        ogh.e("DecisionServiceImpl", "【实验数据】".concat(str2));
        if (!n.j().a().w()) {
            ogh.l("DecisionServiceImpl", "【实验数据】一休已禁止使用。");
        } else if (this.f22253a.compareAndSet(false, true)) {
            ydt.b(new b(z, str));
        } else {
            ogh.f("DecisionServiceImpl", "【实验数据】更新运行中，取消本次更新。");
        }
    }

    @Override // tb.dw6
    public VariationSet b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("5502730f", new Object[]{this, str});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Object j = n.j().d().j(str);
        if (j != null) {
            ogh.i("DecisionServiceImpl", "命中本地Mock开关：" + str + "=" + j);
            HashMap hashMap = new HashMap();
            hashMap.put(str, j.toString());
            do8 do8Var = new do8();
            do8Var.j(hashMap);
            return new DefaultVariationSet(do8Var);
        }
        mwa t = qo8.s().t(str);
        if (t != null && !t.q()) {
            ogh.i("DecisionServiceImpl", "高优先级开关: " + str + " 预分流结果: 没有命中实验分桶");
            return null;
        } else if (t != null) {
            ogh.i("DecisionServiceImpl", "命中高优先级开关：" + str + "=" + t.m(str));
            V(t);
            return new DefaultVariationSet(t);
        } else {
            List<String> o = qo8.s().o(str);
            int size = o == null ? 0 : o.size();
            ogh.g("DecisionServiceImpl", "开关 " + str + "，实验个数=" + size + "，查找索引耗时：" + (SystemClock.uptimeMillis() - uptimeMillis));
            if (size == 0) {
                ogh.f("DecisionServiceImpl", "开关 " + str + " 未查找到索引（ExperimentKey）");
                return null;
            }
            for (String str2 : o) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                pv6 pv6Var = new pv6();
                String[] e2 = a1.e(str2);
                if (e2 != null && e2.length == 2) {
                    final do8 G = G(e2[0], e2[1], null, pv6Var);
                    ogh.e("DecisionServiceImpl", "开关 " + str + " 分流耗时：" + (SystemClock.uptimeMillis() - uptimeMillis2));
                    if (G != null && (G.h() || (G.g() != null && !G.g().isEmpty()))) {
                        ydt.e(new f(G, pv6Var));
                        ydt.b(new Runnable() { // from class: tb.ew6
                            @Override // java.lang.Runnable
                            public final void run() {
                                jw6.O(do8.this);
                            }
                        });
                        return new DefaultVariationSet(G);
                    }
                }
            }
            return null;
        }
    }

    public final int H(ExperimentCognation experimentCognation, long j, pv6 pv6Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8b239b4", new Object[]{this, experimentCognation, new Long(j), pv6Var})).intValue();
        }
        ExperimentRoutingType routingType = experimentCognation.getRoutingType();
        String routingAlg = experimentCognation.getRoutingAlg();
        int bucketNum = experimentCognation.getBucketNum();
        String b2 = a1.b(routingType, experimentCognation.getRoutingFactor(), routingAlg);
        if (TextUtils.isEmpty(b2)) {
            return -1;
        }
        if ("motu_md5".equals(routingAlg)) {
            String g2 = kw6.g(b2);
            if (TextUtils.isEmpty(g2)) {
                ku0.f(ku0.SERVICE_ALARM, "DecisionService.routingMd5", g2, "");
                return -1;
            }
            i = Math.abs(g2.hashCode() % experimentCognation.getBucketNum());
        } else if ("murmur32".equals(routingAlg) || TextUtils.isEmpty(routingAlg)) {
            i = Math.abs(iua.a().hashString(b2, m.DEFAULT_CHARSET).asInt()) % experimentCognation.getBucketNum();
        } else if (TextUtils.isEmpty(routingAlg) || !routingAlg.startsWith("trade_md5")) {
            ku0.f(ku0.SERVICE_ALARM, "DecisionService.unknownRouting", "", "");
            return -1;
        } else {
            String h = kw6.h(b2);
            double a2 = kw6.a(routingAlg);
            if (TextUtils.isEmpty(h)) {
                ku0.f(ku0.SERVICE_ALARM, "DecisionService.routingMd5", h, "");
                return -1;
            } else if (a2 <= vu3.b.GEO_NOT_SUPPORT) {
                ku0.f(ku0.SERVICE_ALARM, "DecisionService.externalBucketNum", String.valueOf(a2), "");
                return -1;
            } else {
                i = (int) ((Math.abs(h.hashCode()) % a2) * (bucketNum / a2));
            }
        }
        if (pv6Var != null) {
            pv6Var.a("routingSeed=" + b2);
            pv6Var.a("routingValue=" + i);
        }
        StringBuilder sb = new StringBuilder("【运行实验】实验分组流量计算。实验ID：");
        sb.append(j);
        sb.append("，分流算法：");
        if (TextUtils.isEmpty(routingAlg)) {
            routingAlg = "默认";
        }
        sb.append(routingAlg);
        sb.append("，ratio：");
        sb.append(i);
        ogh.f("DecisionServiceImpl", sb.toString());
        return i;
    }

    public final do8 U(String str, Uri uri, List<ExperimentV5> list) {
        String str2;
        String uri2;
        String[] split;
        Uri j;
        Uri uri3 = uri;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (do8) ipChange.ipc$dispatch("a7eda5d1", new Object[]{this, str, uri3, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        do8 do8Var = new do8();
        String g2 = wyv.g(uri);
        LinkedHashMap<String, String> h = tnv.h(uri);
        Map<String, String> g3 = tnv.g(str);
        Iterator<ExperimentV5> it = list.iterator();
        boolean z = false;
        Uri uri4 = null;
        while (it.hasNext()) {
            ExperimentV5 next = it.next();
            if (next.getGroups() == null || next.getGroups().isEmpty()) {
                it = it;
            } else {
                if (n.j().a().K(next.getId())) {
                    StringBuilder sb = new StringBuilder("实验 ");
                    it = it;
                    sb.append(next.getId());
                    sb.append(" 不需要 decode url 参数");
                    ogh.i("DecisionServiceImpl", sb.toString());
                    z = true;
                } else {
                    it = it;
                }
                ExperimentGroupV5 experimentGroupV5 = next.getGroups().get(i);
                if (experimentGroupV5.getVariations() != null) {
                    String str3 = experimentGroupV5.getVariations().get("bucket");
                    if (!TextUtils.isEmpty(str3) && (j = tnv.j(str3)) != null) {
                        if (TextUtils.indexOf(str3, "UTABTEST-ANY") >= 0) {
                            if (!TextUtils.equals(wyv.g(next.getUri()), wyv.g(j))) {
                                if (uri4 != null) {
                                    ogh.n("DecisionServiceImpl", "【运行实验】URL只允许重定向一次，忽略处理实验分组：" + experimentGroupV5.getId());
                                } else {
                                    Uri e2 = wyv.e(next.getUri(), j, uri3);
                                    if (e2 != null) {
                                        uri4 = e2;
                                    }
                                }
                            }
                            LinkedHashMap<String, String> i2 = tnv.i(h, j);
                            g3.putAll(tnv.g(str3));
                            do8Var.a(next);
                            h = i2;
                        } else {
                            if (!TextUtils.equals(g2, wyv.g(j))) {
                                if (uri4 == null) {
                                    uri4 = j;
                                } else {
                                    ogh.n("DecisionServiceImpl", "【运行实验】URL只允许重定向一次，忽略处理实验分组：" + experimentGroupV5.getId());
                                }
                            }
                            LinkedHashMap<String, String> i22 = tnv.i(h, j);
                            g3.putAll(tnv.g(str3));
                            do8Var.a(next);
                            h = i22;
                        }
                    }
                }
            }
            i = 0;
        }
        Iterator<Map.Entry<String, String>> it2 = h.entrySet().iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().getValue(), "UTABTEST-DELETE")) {
                it2.remove();
            }
        }
        Iterator<Map.Entry<String, String>> it3 = g3.entrySet().iterator();
        while (it3.hasNext()) {
            if (TextUtils.equals(it3.next().getValue(), "UTABTEST-DELETE")) {
                it3.remove();
            }
        }
        if (z) {
            str2 = g3.get(m.URI_PARAMNAME_ABTEST);
        } else {
            str2 = h.get(m.URI_PARAMNAME_ABTEST);
        }
        if (!TextUtils.isEmpty(str2) && (split = TextUtils.split(str2, "\\.")) != null) {
            for (String str4 : split) {
                if (!TextUtils.isEmpty(str4)) {
                    do8Var.b(str4);
                }
            }
        }
        String i3 = do8Var.f() != null ? wyv.i(do8Var.f(), ".") : null;
        if (!TextUtils.isEmpty(i3)) {
            h.put(m.URI_PARAMNAME_ABTEST, i3);
            g3.put(m.URI_PARAMNAME_ABTEST, i3);
        }
        if (uri4 != null) {
            uri3 = uri4;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (do8Var.e() != null) {
                for (ExperimentV5 experimentV5 : do8Var.e()) {
                    if (experimentV5 != null) {
                        arrayList.add(Long.valueOf(experimentV5.getId()));
                    }
                }
            }
            if (z) {
                uri2 = tnv.c(uri3.getScheme(), uri3.getHost(), uri3.getPort(), uri3.getPath(), tnv.f(g3), uri3.getFragment());
            } else {
                uri2 = tnv.b(uri3.getScheme(), uri3.getHost(), uri3.getPort(), uri3.getPath(), tnv.e(h, "UTF-8"), uri3.getFragment()).toString();
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(uri2)) {
                hashMap.put("bucket", uri2);
            }
            do8Var.j(hashMap);
            T(arrayList, str, uri2, g3, tnv.g(uri2));
        } catch (Exception e3) {
            ku0.j("DecisionServiceImpl.processActivatedUriExp2Group", e3);
            ogh.h("DecisionServiceImpl", e3.getMessage(), e3);
        }
        return do8Var;
    }

    public List<ExperimentV5> K(String str, List<ExperimentV5> list, Map<String, Object> map, pv6 pv6Var, boolean z) {
        String str2;
        String str3;
        String str4;
        ExperimentV5 experimentV5;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("18b362c3", new Object[]{this, str, list, map, pv6Var, new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<ExperimentV5> it = list.iterator();
        while (true) {
            str2 = "，计算结果：当前不在实验时间周期内。";
            str3 = "【运行实验】实验周期计算。实验ID：";
            str4 = "DecisionServiceImpl";
            if (!it.hasNext()) {
                break;
            }
            ExperimentV5 next = it.next();
            if (next != null && !hashSet.contains(Long.valueOf(next.getId()))) {
                if (kw6.b(next)) {
                    Iterator<ExperimentGroupV5> it2 = next.getGroups().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            arrayList = arrayList;
                            break;
                        }
                        ExperimentGroupV5 next2 = it2.next();
                        if (n.j().d().l(next2.getId())) {
                            ogh.i(str4, "【运行实验】实验分组白名单计算。分组ID：" + next2.getId() + "，计算结果：白名单实验分组。");
                            pv6Var.a("whitelist=true");
                            hashSet.add(Long.valueOf(next.getId()));
                            ExperimentV5 copyBasicInfo = next.copyBasicInfo();
                            copyBasicInfo.setGroups(new ArrayList(3));
                            copyBasicInfo.getGroups().add(next2);
                            arrayList = arrayList;
                            arrayList.add(copyBasicInfo);
                            break;
                        }
                    }
                } else {
                    ogh.i(str4, str3 + next.getId() + str2);
                    arrayList = arrayList;
                }
            }
        }
        Iterator<ExperimentV5> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ExperimentV5 next3 = it3.next();
            if (next3 != null && !hashSet.contains(Long.valueOf(next3.getId()))) {
                if (!kw6.b(next3)) {
                    ogh.i(str4, str3 + next3.getId() + str2);
                } else {
                    if (z2) {
                        str4 = str4;
                        str2 = str2;
                        str3 = str3;
                        experimentV5 = next3;
                    } else if (next3.getType() == ExperimentType.AbComponent || next3.getType() == ExperimentType.AbUri) {
                        str4 = str4;
                        str2 = str2;
                        str3 = str3;
                        if (!n.j().h().b(next3.getConditionExpression(), map, next3.getId(), 0L)) {
                            ogh.i(str4, str3 + next3.getId() + "，条件匹配失败，" + next3.getCondition());
                            z2 = z;
                        } else {
                            experimentV5 = next3;
                        }
                    } else {
                        str4 = str4;
                        experimentV5 = next3;
                        str2 = str2;
                        str3 = str3;
                    }
                    ExperimentGroupV5 E = E(experimentV5, map, pv6Var);
                    if (E != null) {
                        hashSet.add(Long.valueOf(experimentV5.getId()));
                        ExperimentV5 copyBasicInfo2 = experimentV5.copyBasicInfo();
                        copyBasicInfo2.setGroups(new ArrayList(3));
                        copyBasicInfo2.getGroups().add(E);
                        arrayList.add(copyBasicInfo2);
                        break;
                    }
                    z2 = z;
                }
            }
        }
        if (!n.j().a().d() || !arrayList.isEmpty() || TextUtils.equals(UTABTest.COMPONENT_URI, str)) {
            Collections.sort(arrayList, this.b);
        } else if (list.size() > 0) {
            for (ExperimentV5 experimentV52 : list) {
                List<Long> allLayerIds = experimentV52.getAllLayerIds();
                if (allLayerIds != null) {
                    for (Long l : allLayerIds) {
                        ExperimentV5 J = J(qo8.s().q(l), map, pv6Var);
                        if (J != null) {
                            ExperimentV5 copyBasicInfo3 = experimentV52.copyBasicInfo();
                            copyBasicInfo3.setGroups(J.getGroups());
                            copyBasicInfo3.setRetain(true);
                            arrayList.add(copyBasicInfo3);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
