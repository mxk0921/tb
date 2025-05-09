package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.model.DAIModelTriggerType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ie4 implements DAIComputeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Map<String, String>> f21270a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, h45> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<DAIModelTriggerType, Set<zxi>> c = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21271a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ DAICallback d;
        public final /* synthetic */ hph e;
        public final /* synthetic */ String f;
        public final /* synthetic */ MRTTaskDescription g;

        public a(String str, String str2, Map map, DAICallback dAICallback, hph hphVar, String str3, MRTTaskDescription mRTTaskDescription) {
            this.f21271a = str;
            this.b = str2;
            this.c = map;
            this.d = dAICallback;
            this.e = hphVar;
            this.f = str3;
            this.g = mRTTaskDescription;
        }

        @Override // tb.qqh
        public void a(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                return;
            }
            RunnableC0944a aVar = new RunnableC0944a(i, obj, mRTRuntimeException);
            if (this.g.async) {
                aVar.run();
            } else {
                xdt.d(aVar);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.ie4$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0944a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21272a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ MRTRuntimeException c;

            public RunnableC0944a(int i, Object obj, MRTRuntimeException mRTRuntimeException) {
                this.f21272a = i;
                this.b = obj;
                this.c = mRTRuntimeException;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.ie4.a.RunnableC0944a.run():void");
            }
        }
    }

    static {
        t2o.a(1034944613);
        t2o.a(1034944599);
    }

    public static /* synthetic */ ConcurrentHashMap i(ie4 ie4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("4907470c", new Object[]{ie4Var});
        }
        return ie4Var.f21270a;
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public Collection<h45> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a44f35de", new Object[]{this});
        }
        return this.b.values();
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public void b(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2845f2d5", new Object[]{this, h45Var});
            return;
        }
        this.b.put(h45Var.h(), h45Var);
        if (h45Var.l() != null && h45Var.l().size() > 0) {
            j(h45Var);
        }
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public Set<zxi> c(DAIModelTriggerType dAIModelTriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ecd167c6", new Object[]{this, dAIModelTriggerType});
        }
        return this.c.get(dAIModelTriggerType);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public Map<String, String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a92f1f5", new Object[]{this, str});
        }
        return this.f21270a.get(str);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public String e(Map<String, Object> map, String str, String str2, String str3, Map<String, String> map2, Map<String, Map<String, Object>> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7ecce79", new Object[]{this, map, str, str2, str3, map2, map3});
        }
        String uuid = UUID.randomUUID().toString();
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("triId", str);
        map2.put(r4p.KEY_MODEL_NAME, str2);
        map2.put("runId", uuid);
        map2.put("page", currentPageName);
        if (str3 != null) {
            map2.put(ru1.FEATURE_NAME, str3);
        }
        map.put("walle_inner_context", JSON.toJSONString(map2));
        this.f21270a.put(uuid, map2);
        if (map3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dim1", currentPageName);
            hashMap.put("dim2", str);
            hashMap.put("dim3", uuid);
            hashMap.put("dim4", map2.get("subModelName"));
            hashMap.put("dim5", str3);
            map3.put("dims", hashMap);
        }
        return uuid;
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cd0f1e", new Object[]{this, str});
            return;
        }
        kgh.a("DAIComputeService", "Unregister Model, modelName=" + str);
        this.b.remove(str);
        oqh.d().n(str);
        k(str);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public h45 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h45) ipChange.ipc$dispatch("83dea6c8", new Object[]{this, str});
        }
        return this.b.get(str);
    }

    public final void j(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ad0f6d", new Object[]{this, h45Var});
            return;
        }
        ttf.b().a(h45Var);
        synchronized (this.c) {
            try {
                for (j45 j45Var : h45Var.l()) {
                    Set<zxi> set = this.c.get(j45Var.c());
                    if (set == null) {
                        set = new CopyOnWriteArraySet<>(new HashSet());
                        this.c.put(j45Var.c(), set);
                    }
                    set.add(new zxi(h45Var.h(), j45Var.a(), j45Var.b()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23493c6", new Object[]{this, str});
            return;
        }
        ttf.b().c(str);
        if (!str.isEmpty()) {
            synchronized (this.c) {
                try {
                    for (Set<zxi> set : this.c.values()) {
                        for (zxi zxiVar : set) {
                            if (zxiVar.f33074a.equalsIgnoreCase(str)) {
                                set.remove(zxiVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public void h(String str, Map<String, Object> map, DAIComputeService.TaskPriority taskPriority, DAICallback dAICallback, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c4cec7", new Object[]{this, str, map, taskPriority, dAICallback, str2});
            return;
        }
        kgh.a("DAIComputeService", "addComputeTaskWithTriId modelName: " + str + "\ttriId: " + str2 + "\tinputData:" + JSON.toJSONString(map));
        MRTTaskDescription e = oqh.d().e(str);
        h45 g = g(str);
        if (e != null && g != null) {
            HashMap hashMap = map == null ? new HashMap() : map;
            HashMap hashMap2 = new HashMap();
            String e2 = e(hashMap, str2, str, g.e(), null, hashMap2);
            qow.f(str, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(BHRTaskConfigBase.TYPE_CONFIG_UT);
            arrayList.add(hashMap);
            if (hashMap.remove(DAI.WALLE_DOWNLOAD_ONLY) == null) {
                z = false;
            }
            hph hphVar = new hph();
            oqh.d().k(str, "__all__", arrayList, z, "ODCP", hphVar, new a(str, str2, hashMap, dAICallback, hphVar, e2, e), hashMap2);
        } else if (dAICallback != null) {
            dAICallback.onError(new DAIError(209, "task not register"));
        }
    }
}
