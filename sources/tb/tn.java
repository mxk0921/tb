package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.IAURAFlowDispatcher;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.mvq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tn implements IAURAFlowDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hk f28813a;
    public ij b;
    public mvq c;
    public pt d;
    public gg e;
    public wi f;
    public List<un> g;
    public Map<String, un> h;
    public Map<un, String> i;
    public List<mvq.a> j;
    public boolean k;
    public ek l;
    public vk m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements hbb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(tn tnVar) {
        }

        @Override // tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements mvq.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(tn tnVar, String str, AURAFlowNodeModel aURAFlowNodeModel, Map.Entry entry) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f28814a;
        public final AURAFlowNodeModel b;
        public final un c;
        public final un d;

        static {
            t2o.a(79691815);
        }

        public c(String str, AURAFlowNodeModel aURAFlowNodeModel, un unVar, un unVar2) {
            this.f28814a = str;
            this.b = aURAFlowNodeModel;
            this.c = unVar;
            this.d = unVar2;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURASubscribeFlowDispatcher$NextAURACallback");
        }

        @Override // tb.pt
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
            }
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            AURAFlowData aURAFlowData;
            AURAGlobalData aURAGlobalData;
            AURAFlowData aURAFlowData2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            if (ykVar.f()) {
                String f = AURATraceUtil.f();
                HashMap hashMap = new HashMap();
                hashMap.put("__traceId", f);
                aURAFlowData = new AURAFlowData(this.f28814a).copyOnWrite(hashMap);
            } else {
                aURAFlowData = ykVar.e();
            }
            if (ykVar.c() != null) {
                aURAFlowData = aURAFlowData.copyOnWrite(ykVar.c());
            }
            Map<String, Object> d = ykVar.d();
            ij j = tn.a(tn.this).j();
            if (d != null) {
                aURAGlobalData = j.a(d);
            } else {
                aURAGlobalData = j.b();
            }
            if (aURAFlowData == null) {
                aURAFlowData2 = new AURAFlowData(this.f28814a);
            } else {
                aURAFlowData2 = aURAFlowData;
            }
            String str = (String) tn.b(tn.this).get(this.c);
            gg d2 = tn.d(tn.this);
            AURAFlowNodeModel aURAFlowNodeModel = this.b;
            d2.c(aURAFlowNodeModel, AURAAspectServiceInput.afterServiceExecute(aURAFlowNodeModel.code, str, ykVar, false), aURAFlowData2, aURAGlobalData, tn.c(tn.this));
            AURAInputData aURAInputData = new AURAInputData(ykVar.b(), aURAFlowData, aURAGlobalData);
            gg d3 = tn.d(tn.this);
            AURAFlowNodeModel aURAFlowNodeModel2 = this.b;
            d3.c(aURAFlowNodeModel2, AURAAspectServiceInput.beforeServiceExecute(aURAFlowNodeModel2.code, str, aURAInputData), aURAFlowData2, aURAInputData.getGlobalData(), tn.c(tn.this));
            this.d.B(aURAInputData);
        }
    }

    static {
        t2o.a(79691812);
        t2o.a(79691820);
    }

    public static /* synthetic */ ek a(tn tnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ek) ipChange.ipc$dispatch("5f48ce3b", new Object[]{tnVar});
        }
        return tnVar.l;
    }

    public static /* synthetic */ Map b(tn tnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b50b9e6c", new Object[]{tnVar});
        }
        return tnVar.i;
    }

    public static /* synthetic */ wi c(tn tnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wi) ipChange.ipc$dispatch("1d3e2116", new Object[]{tnVar});
        }
        return tnVar.f;
    }

    public static /* synthetic */ gg d(tn tnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gg) ipChange.ipc$dispatch("8a310565", new Object[]{tnVar});
        }
        return tnVar.e;
    }

    public final void e(AURAFlowNodeModel aURAFlowNodeModel) {
        gn gnVar;
        un unVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44bd1a7c", new Object[]{this, aURAFlowNodeModel});
            return;
        }
        List<AURAExecuteNodeModel> g = g(this.f28813a.c(aURAFlowNodeModel));
        ArrayList arrayList = new ArrayList(g.size());
        this.h = new HashMap();
        this.i = new HashMap();
        for (AURAExecuteNodeModel aURAExecuteNodeModel : g) {
            if (!TextUtils.isEmpty(aURAExecuteNodeModel.code)) {
                try {
                    gnVar = this.m.i(aURAExecuteNodeModel, this.l.l(), new a(this));
                } catch (Throwable th) {
                    th.printStackTrace();
                    gnVar = null;
                }
                if (gnVar != null) {
                    if ((gnVar instanceof p4n) && aURAExecuteNodeModel == g.get(g.size() - 1)) {
                        ((p4n) gnVar).a(this.c);
                    }
                    if (gnVar instanceof un) {
                        unVar = (un) gnVar;
                    } else if (gnVar instanceof bp) {
                        unVar = new zo((bp) gnVar);
                    } else {
                        throw new RuntimeException("NotSupportService|".concat(gnVar.getClass().getName()));
                    }
                    arrayList.add(unVar);
                    ((HashMap) this.h).put(aURAExecuteNodeModel.code, unVar);
                    ((HashMap) this.i).put(unVar, aURAExecuteNodeModel.code);
                } else {
                    throw new RuntimeException("getOrCreateService|ERROR|" + JSON.toJSONString(aURAExecuteNodeModel));
                }
            }
        }
        this.g = arrayList;
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public <DATA extends Serializable> void executeFlow(AURAFlowNodeModel aURAFlowNodeModel, DATA data, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55123fc2", new Object[]{this, aURAFlowNodeModel, data, ptVar});
            return;
        }
        synchronized (this) {
            try {
                String str = aURAFlowNodeModel.code;
                if (this.k) {
                    List<un> list = this.g;
                    if (list != null && !((ArrayList) list).isEmpty()) {
                        f(str, aURAFlowNodeModel, (un) ((ArrayList) this.g).get(0), data, false);
                    }
                    return;
                }
                e(aURAFlowNodeModel);
                h(str, aURAFlowNodeModel);
                this.k = true;
                List<un> list2 = this.g;
                if (list2 != null && !((ArrayList) list2).isEmpty()) {
                    f(str, aURAFlowNodeModel, (un) ((ArrayList) this.g).get(0), data, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, AURAFlowNodeModel aURAFlowNodeModel, un unVar, Serializable serializable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af44166", new Object[]{this, str, aURAFlowNodeModel, unVar, serializable, new Boolean(z)});
            return;
        }
        AURAFlowData aURAFlowData = new AURAFlowData(str);
        String f = AURATraceUtil.f();
        HashMap hashMap = new HashMap();
        hashMap.put("__traceId", f);
        AURAInputData aURAInputData = new AURAInputData(serializable, aURAFlowData.copyOnWrite(hashMap), this.b.b());
        String str2 = (String) ((HashMap) this.i).get(unVar);
        if (z) {
            this.e.c(aURAFlowNodeModel, AURAAspectServiceInput.beforeFlowExecute(aURAFlowNodeModel.code, aURAInputData), aURAInputData.getFlowData(), aURAInputData.getGlobalData(), this.f);
        }
        this.e.c(aURAFlowNodeModel, AURAAspectServiceInput.beforeServiceExecute(aURAFlowNodeModel.code, str2, aURAInputData), aURAFlowData, aURAInputData.getGlobalData(), this.f);
        unVar.B(aURAInputData);
    }

    public final List<AURAExecuteNodeModel> g(List<AURAExecuteNodeModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("391a150", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AURAExecuteNodeModel aURAExecuteNodeModel : list) {
            String str = aURAExecuteNodeModel.type;
            if ("service".equals(str)) {
                arrayList.add(aURAExecuteNodeModel);
            } else {
                throw new RuntimeException("NotSupport|" + str + "|" + aURAExecuteNodeModel.code);
            }
        }
        return arrayList;
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public String getIdentifier(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ade24426", new Object[]{this, str, str2});
        }
        return str2;
    }

    public final void h(String str, AURAFlowNodeModel aURAFlowNodeModel) {
        un unVar;
        Object obj;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14af3ead", new Object[]{this, str, aURAFlowNodeModel});
            return;
        }
        List<un> list = this.g;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                break;
            }
            un unVar2 = (un) arrayList.get(i);
            i++;
            if (i < arrayList.size()) {
                unVar = (un) arrayList.get(i);
            } else {
                unVar = null;
            }
            if (unVar != null) {
                obj = new c(str, aURAFlowNodeModel, unVar2, unVar);
            } else {
                obj = this.d;
            }
            unVar2.L(obj);
        }
        this.j = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.h).entrySet()) {
            this.c.b(mvq.ACTION_TYPE_FORWARD, (String) entry.getKey(), new b(this, str, aURAFlowNodeModel, entry));
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onCreate(lo loVar, ek ekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8cb1f6", new Object[]{this, loVar, ekVar});
            return;
        }
        this.l = ekVar;
        this.e = ekVar.h();
        this.f = ekVar.l();
        vk vkVar = new vk(loVar, ekVar.k());
        this.m = vkVar;
        vkVar.l(ekVar.i());
        this.b = ekVar.j();
        this.f28813a = ekVar.m();
        this.c = ekVar.n();
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            this.c.c((mvq.a) it.next());
        }
        this.m.d();
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void preload(AURAFlowNodeModel aURAFlowNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea82ba58", new Object[]{this, aURAFlowNodeModel});
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void registerPluginCenter(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e345529", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.m.k(iAURAPluginCenterArr);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void setCallback(pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb110e6", new Object[]{this, ptVar});
        } else {
            this.d = ptVar;
        }
    }
}
