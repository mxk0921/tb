package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.IAURAFlowDispatcher;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.AURAEmptySerializable;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.alibaba.android.umf.constants.UMFConstants$ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ap implements IAURAFlowDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wi f15908a = null;
    public vk b;
    public ek c;
    public gg d;
    public AURAGlobalData e;
    public AURAFlowData f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements hbb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ap apVar) {
        }

        @Override // tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            }
        }
    }

    static {
        t2o.a(79691817);
        t2o.a(79691820);
    }

    public static /* synthetic */ void b(ap apVar, AURAFlowNodeModel aURAFlowNodeModel, String str, AURAFlowData aURAFlowData, yk ykVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6ee5db", new Object[]{apVar, aURAFlowNodeModel, str, aURAFlowData, ykVar, new Boolean(z)});
        } else {
            apVar.f(aURAFlowNodeModel, str, aURAFlowData, ykVar, z);
        }
    }

    public static /* synthetic */ AURAGlobalData c(ap apVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("c33a692b", new Object[]{apVar});
        }
        return apVar.e;
    }

    public static /* synthetic */ void d(ap apVar, AURAFlowNodeModel aURAFlowNodeModel, List list, int i, Serializable serializable, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00febb7", new Object[]{apVar, aURAFlowNodeModel, list, new Integer(i), serializable, aURAFlowData, aURAGlobalData, ptVar});
        } else {
            apVar.k(aURAFlowNodeModel, list, i, serializable, aURAFlowData, aURAGlobalData, ptVar);
        }
    }

    public static /* synthetic */ void e(ap apVar, mi miVar, AURAFlowNodeModel aURAFlowNodeModel, String str, AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae85dc51", new Object[]{apVar, miVar, aURAFlowNodeModel, str, aURAFlowData});
        } else {
            apVar.a(miVar, aURAFlowNodeModel, str, aURAFlowData);
        }
    }

    public final void a(mi miVar, AURAFlowNodeModel aURAFlowNodeModel, String str, AURAFlowData aURAFlowData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da412083", new Object[]{this, miVar, aURAFlowNodeModel, str, aURAFlowData});
        } else if (miVar.f() == 0) {
            String str2 = aURAFlowNodeModel.code;
            f(aURAFlowNodeModel, str, aURAFlowData, h(str2), true);
            m(aURAFlowNodeModel, aURAFlowData, h(str2), true);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public <DATA extends Serializable> void executeFlow(AURAFlowNodeModel aURAFlowNodeModel, DATA data, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55123fc2", new Object[]{this, aURAFlowNodeModel, data, ptVar});
            return;
        }
        this.f = new AURAFlowData(aURAFlowNodeModel.code);
        if (i()) {
            this.e = this.c.j().b();
        } else {
            this.e = this.c.j().b().copyOnWrite(null);
        }
        this.d.c(aURAFlowNodeModel, AURAAspectServiceInput.beforeFlowExecute(aURAFlowNodeModel.code, new AURAInputData(data, this.f, this.e)), this.f, this.e, this.f15908a);
        k(aURAFlowNodeModel, this.c.m().c(aURAFlowNodeModel), 0, data, this.f, this.e, ptVar);
    }

    public final void f(AURAFlowNodeModel aURAFlowNodeModel, String str, AURAFlowData aURAFlowData, yk ykVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e6866d", new Object[]{this, aURAFlowNodeModel, str, aURAFlowData, ykVar, new Boolean(z)});
        } else {
            this.d.c(aURAFlowNodeModel, AURAAspectServiceInput.afterServiceExecute(aURAFlowNodeModel.code, str, ykVar, z), aURAFlowData, this.e, this.f15908a);
        }
    }

    public final pt g(AURAFlowNodeModel aURAFlowNodeModel, String str, List<AURAExecuteNodeModel> list, int i, AURAFlowData aURAFlowData, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt) ipChange.ipc$dispatch("c00fbde5", new Object[]{this, aURAFlowNodeModel, str, list, new Integer(i), aURAFlowData, ptVar});
        }
        return new b(ptVar, aURAFlowNodeModel, str, aURAFlowData, list, i);
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public String getIdentifier(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ade24426", new Object[]{this, str, str2});
        }
        return str2;
    }

    public final yk<AURAEmptySerializable> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yk) ipChange.ipc$dispatch("61588d95", new Object[]{this, str});
        }
        AURAEmptySerializable aURAEmptySerializable = new AURAEmptySerializable();
        return yk.a(aURAEmptySerializable, new AURAInputData(aURAEmptySerializable, new AURAFlowData(str), this.e));
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9671b361", new Object[]{this})).booleanValue();
        }
        return this.c.i().a(new AURANodeBranchModel("aura.branch.disableGlobalDataCopyOnWrite", false, "default"));
    }

    public final <DATA extends Serializable> void j(AURAFlowNodeModel aURAFlowNodeModel, DATA data, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885eb135", new Object[]{this, aURAFlowNodeModel, data, aURAFlowData, aURAGlobalData, ptVar});
            return;
        }
        ij j = this.c.j();
        if (!i()) {
            j.a(aURAGlobalData.getMap());
        }
        yk<DATA> a2 = yk.a(data, new AURAInputData(new AURAEmptySerializable(), aURAFlowData, aURAGlobalData));
        ptVar.c(a2);
        ptVar.a();
        m(aURAFlowNodeModel, aURAFlowData, a2, false);
    }

    public final void m(AURAFlowNodeModel aURAFlowNodeModel, AURAFlowData aURAFlowData, yk ykVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90422775", new Object[]{this, aURAFlowNodeModel, aURAFlowData, ykVar, new Boolean(z)});
        } else {
            this.d.c(aURAFlowNodeModel, AURAAspectServiceInput.afterFlowExecute(aURAFlowNodeModel.code, ykVar, z), aURAFlowData, this.e, this.f15908a);
        }
    }

    public final void n(AURAExecuteNodeModel aURAExecuteNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48be6562", new Object[]{this, aURAExecuteNodeModel});
        } else {
            this.b.i(aURAExecuteNodeModel, this.f15908a, new a(this));
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onCreate(lo loVar, ek ekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8cb1f6", new Object[]{this, loVar, ekVar});
            return;
        }
        this.c = ekVar;
        this.f15908a = ekVar.l();
        this.d = ekVar.h();
        vk vkVar = new vk(loVar, ekVar.k());
        this.b = vkVar;
        vkVar.l(ekVar.i());
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.b.d();
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void preload(AURAFlowNodeModel aURAFlowNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea82ba58", new Object[]{this, aURAFlowNodeModel});
            return;
        }
        AURAExecuteNodeModel aURAExecuteNodeModel = new AURAExecuteNodeModel();
        aURAExecuteNodeModel.code = hg.SERVICE_CODE;
        aURAExecuteNodeModel.type = "service";
        aURAExecuteNodeModel.extensions = aURAFlowNodeModel.aspectExtensions;
        this.d.e(aURAExecuteNodeModel, this.f15908a);
        List<AURAExecuteNodeModel> c = this.c.m().c(aURAFlowNodeModel);
        if (!(c == null || c.isEmpty())) {
            for (AURAExecuteNodeModel aURAExecuteNodeModel2 : c) {
                n(aURAExecuteNodeModel2);
            }
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void registerPluginCenter(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e345529", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.b.k(iAURAPluginCenterArr);
        }
    }

    @Override // com.alibaba.android.aura.IAURAFlowDispatcher
    public void setCallback(pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb110e6", new Object[]{this, ptVar});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pt f15909a;
        public final /* synthetic */ AURAFlowNodeModel b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AURAFlowData d;
        public final /* synthetic */ List e;
        public final /* synthetic */ int f;

        public b(pt ptVar, AURAFlowNodeModel aURAFlowNodeModel, String str, AURAFlowData aURAFlowData, List list, int i) {
            this.f15909a = ptVar;
            this.b = aURAFlowNodeModel;
            this.c = str;
            this.d = aURAFlowData;
            this.e = list;
            this.f = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAWorkFlowDispatcher$2");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            miVar.h(new ni(this.b.code, this.c, this.d, ap.c(ap.this)));
            ap.e(ap.this, miVar, this.b, this.c, this.d);
            this.f15909a.b(miVar);
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            if (ykVar.c() != null) {
                this.f15909a.b(new mi(1, "AURACoreDomain", "-2005", "工作流不要设置flowPayload"));
            }
            if (ykVar.d() != null) {
                this.f15909a.b(new mi(1, "AURACoreDomain", "-2006", "工作流不要设置globalPayload"));
            }
            ap.b(ap.this, this.b, this.c, this.d, ykVar, false);
            ap.d(ap.this, this.b, this.e, this.f + 1, ykVar.b(), this.d, ap.c(ap.this), this.f15909a);
        }
    }

    public final <DATA extends Serializable> void k(AURAFlowNodeModel aURAFlowNodeModel, List<AURAExecuteNodeModel> list, int i, DATA data, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f39f97", new Object[]{this, aURAFlowNodeModel, list, new Integer(i), data, aURAFlowData, aURAGlobalData, ptVar});
        } else if (list == null || list.isEmpty() || list.size() <= i) {
            j(aURAFlowNodeModel, data, aURAFlowData, aURAGlobalData, ptVar);
        } else {
            AURAExecuteNodeModel aURAExecuteNodeModel = list.get(i);
            if ("service".equals(aURAExecuteNodeModel.type)) {
                String str = aURAExecuteNodeModel.code;
                if (str == null) {
                    str = "";
                }
                l(aURAFlowNodeModel, aURAExecuteNodeModel, data, aURAGlobalData, aURAFlowData, g(aURAFlowNodeModel, str, list, i, aURAFlowData, ptVar));
                return;
            }
            ptVar.b(new mi(0, "AURACoreDomain", "-3000", "流程下的节点的type不是service"));
            m(aURAFlowNodeModel, aURAFlowData, h(aURAFlowNodeModel.code), true);
        }
    }

    public final <DATA extends Serializable> void l(AURAFlowNodeModel aURAFlowNodeModel, AURAExecuteNodeModel aURAExecuteNodeModel, DATA data, AURAGlobalData aURAGlobalData, AURAFlowData aURAFlowData, pt ptVar) {
        gn gnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62463143", new Object[]{this, aURAFlowNodeModel, aURAExecuteNodeModel, data, aURAGlobalData, aURAFlowData, ptVar});
        } else if (!this.c.i().a(aURAExecuteNodeModel.branch)) {
            ptVar.c(yk.a(data, new AURAInputData(data, aURAFlowData, aURAGlobalData)));
        } else {
            try {
                gnVar = this.b.i(aURAExecuteNodeModel, this.f15908a, ptVar);
            } catch (Throwable th) {
                ptVar.b(new mi(0, "AURACoreDomain", UMFConstants$ErrorCode.SERVICE_NOT_FOUND, th.getMessage()));
                th.d(th);
                gnVar = null;
            }
            String str = aURAExecuteNodeModel.code;
            if (!(gnVar instanceof bp)) {
                ptVar.b(new mi(0, "AURACoreDomain", UMFConstants$ErrorCode.CREATE_SERVICE_EXCEPTION, "serviceCode为【" + str + "】的服务【" + gnVar + "]不是工作流服务（AURAWorkService）"));
                return;
            }
            AURAInputData aURAInputData = new AURAInputData(data, aURAFlowData, aURAGlobalData);
            xi.a(this.b, aURAExecuteNodeModel, aURAFlowData, aURAGlobalData, this.f15908a, ptVar);
            this.d.c(aURAFlowNodeModel, AURAAspectServiceInput.beforeServiceExecute(aURAFlowNodeModel.code, str, aURAInputData), aURAFlowData, aURAGlobalData, this.f15908a);
            ((bp) gnVar).B(aURAInputData, ptVar);
        }
    }
}
