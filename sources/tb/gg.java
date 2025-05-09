package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.alibaba.android.aura.service.aspect.AURAAspectServiceInput;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vk f19961a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements hbb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(gg ggVar) {
        }

        @Override // tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.f("preload error," + miVar.e(), ck.b.b().i("AURA/performance").a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAFlowData f19962a;
        public final /* synthetic */ AURAGlobalData b;
        public final /* synthetic */ AURAAspectServiceInput c;
        public final /* synthetic */ AURAFlowNodeModel d;
        public final /* synthetic */ wi e;

        public b(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, AURAAspectServiceInput aURAAspectServiceInput, AURAFlowNodeModel aURAFlowNodeModel, wi wiVar) {
            this.f19962a = aURAFlowData;
            this.b = aURAGlobalData;
            this.c = aURAAspectServiceInput;
            this.d = aURAFlowNodeModel;
            this.e = wiVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAAspectManager$2");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                gg.a(gg.this, miVar, this.f19962a, this.b, this.c.getType(), this.d, this.e);
            }
        }
    }

    static {
        t2o.a(79691777);
    }

    public gg() {
    }

    public static /* synthetic */ void a(gg ggVar, mi miVar, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, int i, AURAFlowNodeModel aURAFlowNodeModel, wi wiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63f720a", new Object[]{ggVar, miVar, aURAFlowData, aURAGlobalData, new Integer(i), aURAFlowNodeModel, wiVar});
        } else {
            ggVar.d(miVar, aURAFlowData, aURAGlobalData, i, aURAFlowNodeModel, wiVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f19961a.d();
        this.f19961a = null;
    }

    public final void d(mi miVar, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, int i, AURAFlowNodeModel aURAFlowNodeModel, wi wiVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a99227", new Object[]{this, miVar, aURAFlowData, aURAGlobalData, new Integer(i), aURAFlowNodeModel, wiVar});
            return;
        }
        if (4 != i) {
            z = false;
        }
        if (!z) {
            miVar.h(new ni("", hg.SERVICE_CODE, aURAFlowData, aURAGlobalData));
            c(aURAFlowNodeModel, AURAAspectServiceInput.error(miVar, z), aURAFlowData, aURAGlobalData, wiVar);
        }
    }

    public void e(AURAExecuteNodeModel aURAExecuteNodeModel, wi wiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56fb8e1", new Object[]{this, aURAExecuteNodeModel, wiVar});
        } else {
            this.f19961a.i(aURAExecuteNodeModel, wiVar, new a(this));
        }
    }

    public void f(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e345529", new Object[]{this, iAURAPluginCenterArr});
        } else {
            this.f19961a.k(iAURAPluginCenterArr);
        }
    }

    public void g(ug ugVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d566b", new Object[]{this, ugVar});
        } else {
            this.f19961a.l(ugVar);
        }
    }

    public gg(lo loVar, jj jjVar) {
        this.f19961a = new vk(loVar, jjVar);
    }

    public void c(AURAFlowNodeModel aURAFlowNodeModel, AURAAspectServiceInput aURAAspectServiceInput, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, wi wiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13756bd", new Object[]{this, aURAFlowNodeModel, aURAAspectServiceInput, aURAFlowData, aURAGlobalData, wiVar});
        } else if (this.f19961a != null) {
            try {
                AURAExecuteNodeModel aURAExecuteNodeModel = new AURAExecuteNodeModel();
                aURAExecuteNodeModel.code = hg.SERVICE_CODE;
                aURAExecuteNodeModel.type = "service";
                aURAExecuteNodeModel.extensions = aURAFlowNodeModel.aspectExtensions;
                b bVar = new b(aURAFlowData, aURAGlobalData, aURAAspectServiceInput, aURAFlowNodeModel, wiVar);
                gn i = this.f19961a.i(aURAExecuteNodeModel, wiVar, bVar);
                if (!(i instanceof bp)) {
                    rbb g = ck.g();
                    g.b("AURAAspectManager", "executeAspectService", "serviceCode为【" + aURAExecuteNodeModel.code + "】的服务不存在或者他不是继承AURAWorkService,service=" + i);
                    return;
                }
                xi.a(this.f19961a, aURAExecuteNodeModel, aURAFlowData, aURAGlobalData, wiVar, bVar);
                ((bp) i).B(new AURAInputData(aURAAspectServiceInput, aURAFlowData, aURAGlobalData), bVar);
            } catch (Throwable th) {
                d(new mi(1, "AURACoreDomain", "-5000", th.getMessage()), aURAFlowData, aURAGlobalData, aURAAspectServiceInput.getType(), aURAFlowNodeModel, wiVar);
            }
        }
    }
}
