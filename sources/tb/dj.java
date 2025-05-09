package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.IAURAFlowDispatcher;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.alibaba.android.umf.constants.UMFConstants$ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ck;
import tb.ek;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean n = true;
    public final lo b;
    public mvq d;
    public hk f;
    public final gg g;
    public ug h;
    public final Map<String, Class<? extends IAURAFlowDispatcher>> k;
    public final jj m;

    /* renamed from: a  reason: collision with root package name */
    public final String f17855a = dj.class.getSimpleName();
    public final List<IAURAPluginCenter> l = new ArrayList();
    public final Map<String, IAURAFlowDispatcher> j = new HashMap();
    public wi e = new wi();
    public final ij c = new ij();
    public final Map<String, IAURAFlowDispatcher> i = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Serializable f17856a;

        public a(Serializable serializable) {
            this.f17856a = serializable;
        }

        public void a(String str, String str2, String str3, pt ptVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58395f81", new Object[]{this, str, str2, str3, ptVar});
            } else {
                dj.b(dj.this, str, str2, str3, ptVar);
            }
        }

        public void b(IAURAFlowDispatcher iAURAFlowDispatcher, AURAFlowNodeModel aURAFlowNodeModel, pt ptVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2bd90ff", new Object[]{this, iAURAFlowDispatcher, aURAFlowNodeModel, ptVar});
                return;
            }
            if (dj.a(dj.this) != null && !dj.a(dj.this).isEmpty()) {
                Iterator it = dj.a(dj.this).iterator();
                while (it.hasNext()) {
                    iAURAFlowDispatcher.registerPluginCenter((IAURAPluginCenter) it.next());
                }
            }
            iAURAFlowDispatcher.setCallback(ptVar);
            iAURAFlowDispatcher.executeFlow(aURAFlowNodeModel, this.f17856a, ptVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/AURAFlowDispatcherManager$2");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                ck.g().b(dj.c(dj.this), "onError", miVar.toString());
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
    }

    static {
        t2o.a(79691792);
    }

    public dj(lo loVar) {
        jj jjVar = new jj();
        this.m = jjVar;
        HashMap hashMap = new HashMap();
        this.k = hashMap;
        m(hashMap);
        this.b = loVar;
        this.g = new gg(loVar, jjVar);
    }

    public static /* synthetic */ List a(dj djVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7c92900b", new Object[]{djVar});
        }
        return djVar.l;
    }

    public static /* synthetic */ void b(dj djVar, String str, String str2, String str3, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2edd5bb9", new Object[]{djVar, str, str2, str3, ptVar});
        } else {
            djVar.j(str, str2, str3, ptVar);
        }
    }

    public static /* synthetic */ String c(dj djVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("393cac22", new Object[]{djVar});
        }
        return djVar.f17855a;
    }

    public static dj f(lo loVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dj) ipChange.ipc$dispatch("cd0e38bf", new Object[]{loVar});
        }
        return new dj(loVar);
    }

    public boolean d(AURANodeBranchModel aURANodeBranchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce7b5a7", new Object[]{this, aURANodeBranchModel})).booleanValue();
        }
        return this.h.a(aURANodeBranchModel);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (IAURAFlowDispatcher iAURAFlowDispatcher : ((HashMap) this.j).values()) {
            iAURAFlowDispatcher.onDestroy();
        }
        this.g.b();
        ((HashMap) this.j).clear();
        ((HashMap) this.k).clear();
        this.e = null;
        ug ugVar = this.h;
        if (ugVar != null) {
            ugVar.c();
        }
        this.m.a();
        ((HashMap) this.i).clear();
    }

    public <DATA extends Serializable> void h(String str, DATA data, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7195c75", new Object[]{this, str, data, ptVar});
        } else {
            e(str, data, i(ptVar), new a(data));
        }
    }

    public final pt i(pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt) ipChange.ipc$dispatch("2a648bae", new Object[]{this, ptVar});
        }
        if (ptVar == null) {
            return new b();
        }
        return ptVar;
    }

    public final void j(String str, String str2, String str3, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2649ade2", new Object[]{this, str, str2, str3, ptVar});
        } else if (ptVar != null) {
            mi miVar = new mi(0, "AURACoreDomain", str, str2);
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", this.b.d());
            hashMap.put("flowCode", str3);
            miVar.i(hashMap);
            ptVar.b(miVar);
        }
    }

    public final IAURAFlowDispatcher k(String str, String str2) {
        HashMap hashMap = (HashMap) this.j;
        IAURAFlowDispatcher iAURAFlowDispatcher = (IAURAFlowDispatcher) hashMap.get(str2);
        if (iAURAFlowDispatcher != null) {
            return iAURAFlowDispatcher;
        }
        IAURAFlowDispatcher iAURAFlowDispatcher2 = (IAURAFlowDispatcher) hashMap.get(str);
        if (iAURAFlowDispatcher2 != null) {
            return iAURAFlowDispatcher2;
        }
        Class cls = (Class) ((HashMap) this.k).get(str);
        if (cls == null) {
            return null;
        }
        try {
            IAURAFlowDispatcher iAURAFlowDispatcher3 = (IAURAFlowDispatcher) cls.newInstance();
            iAURAFlowDispatcher3.onCreate(this.b, new ek.b().a(this.g).d(this.c).g(this.f).h(this.d).f(this.e).b(this.h).e(this.m).c());
            hashMap.put(iAURAFlowDispatcher3.getIdentifier(str, str2), iAURAFlowDispatcher3);
            return iAURAFlowDispatcher3;
        } catch (Throwable th) {
            rbb g = ck.g();
            g.b(this.f17855a, "getFlowDispatcher", "创建Dispatcher失败|" + th.getMessage());
            return null;
        }
    }

    public jj l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj) ipChange.ipc$dispatch("75480c0", new Object[]{this});
        }
        return this.m;
    }

    public final void m(Map<String, Class<? extends IAURAFlowDispatcher>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f213d7e", new Object[]{this, map});
            return;
        }
        map.put("serial", ap.class);
        map.put("subscribe", tn.class);
    }

    public void n(hk hkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88dfdffa", new Object[]{this, hkVar});
            return;
        }
        this.f = hkVar;
        ug ugVar = new ug(this.b, this.m, hkVar);
        this.h = ugVar;
        this.g.g(ugVar);
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8016ad79", new Object[]{this, str});
            return;
        }
        IAURAFlowDispatcher k = k("serial", str);
        if (k == null) {
            ck.g().e("preloadFlowDispatcher is null!", ck.b.b().i("AURA/performance").a());
            return;
        }
        ((HashMap) this.i).put(str, k);
        AURAFlowNodeModel d = this.f.d(str);
        if (d == null) {
            ck.g().e("flowNode is null!", ck.b.b().i("AURA/performance").a());
        } else {
            k.preload(d);
        }
    }

    public <DATA> void p(IAURAInputField<DATA> iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cbf2d1", new Object[]{this, iAURAInputField});
        } else {
            this.e.b(iAURAInputField);
        }
    }

    public void q(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e345529", new Object[]{this, iAURAPluginCenterArr});
            return;
        }
        ((ArrayList) this.l).addAll(Arrays.asList(iAURAPluginCenterArr));
        this.g.f(iAURAPluginCenterArr);
    }

    public void r(mvq mvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1576a81", new Object[]{this, mvqVar});
        } else {
            this.d = mvqVar;
        }
    }

    public final <DATA> void e(String str, DATA data, pt ptVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58525000", new Object[]{this, str, data, ptVar, cVar});
        } else if (this.f == null) {
            ((a) cVar).a("-1000", "配置文件初始化错误", str, ptVar);
        } else if (TextUtils.isEmpty(str)) {
            ((a) cVar).a(UMFConstants$ErrorCode.WORKFLOW_NOT_FOUND, "FlowCode为空", str, ptVar);
        } else if (data == null) {
            ((a) cVar).a("-6000", "input不能为空", str, ptVar);
        } else {
            AURAFlowNodeModel d = this.f.d(str);
            if (d == null) {
                ((a) cVar).a(UMFConstants$ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "FlowCode[" + str + "]不为空，但是在配置里面找不到", str, ptVar);
                return;
            }
            ej ejVar = new ej(d, ptVar, this.c, this.g, this.e, this.b.f());
            String str2 = d.type;
            if (TextUtils.isEmpty(str2)) {
                ((a) cVar).a("-2002", "FlowCode不为空，但是配置中flowType为空", str, ejVar);
                return;
            }
            List<AURAExecuteNodeModel> list = d.nodes;
            if (list == null || list.isEmpty()) {
                ((a) cVar).a("-2003", "FlowCode不为空，但是对应的配置没有Service节点", str, ejVar);
                return;
            }
            IAURAFlowDispatcher iAURAFlowDispatcher = (IAURAFlowDispatcher) ((HashMap) this.i).get(str);
            if (iAURAFlowDispatcher == null) {
                iAURAFlowDispatcher = k(str2, str);
            }
            if (iAURAFlowDispatcher == null) {
                ((a) cVar).a("-2004", "FlowCode不为空，但是Dispatcher找不到", str, ejVar);
                return;
            }
            if (th.c() && d.aspectExtensions == null) {
                Context f = this.b.f();
                bo.c(f, d.getCode() + " 流程必须包含切面配置", 0);
            }
            ((a) cVar).b(iAURAFlowDispatcher, d, ejVar);
        }
    }
}
