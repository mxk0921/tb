package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.procedure.NotifyApm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ejw implements d.e, ApplicationBackgroundChangedDispatcher.b, PageLeaveDispatcher.b, NotifyApm.a, e.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<cll, Boolean> f18629a = new HashMap();
    public final Map<cll, Boolean> b = new HashMap();
    public final Map<cll, Boolean> c = new HashMap();
    public final Map<cll, k32> d = new HashMap();
    public final Map<cll, k32> e = new HashMap();

    public ejw() {
        zzb<?> b = yq7.b(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (b instanceof ApplicationBackgroundChangedDispatcher) {
            ((ApplicationBackgroundChangedDispatcher) b).addListener(this);
        }
        zzb<?> b2 = yq7.b(ic.PAGE_LEAVE_DISPATCHER);
        if (b2 instanceof PageLeaveDispatcher) {
            ((PageLeaveDispatcher) b2).addListener(this);
        }
        zzb<?> b3 = yq7.b(ic.PAGE_FIRST_FRAME_DISPATCHER);
        if (b3 instanceof e) {
            ((e) b3).addListener(this);
        }
        NotifyApm.b().a(2, this);
    }

    public static /* synthetic */ Map b(ejw ejwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de8a6669", new Object[]{ejwVar});
        }
        return ejwVar.e;
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void H(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1aff1f", new Object[]{this, cllVar, new Long(j)});
            return;
        }
        k32 k32Var = (k32) ((HashMap) this.d).get(cllVar);
        if (k32Var != null) {
            if (c(cllVar)) {
                k32Var.f(-6);
            }
            k32Var.r();
        }
        ((HashMap) this.f18629a).remove(cllVar);
        ((HashMap) this.b).remove(cllVar);
        ((HashMap) this.c).remove(cllVar);
        ((HashMap) this.d).remove(cllVar);
        ((HashMap) this.e).remove(cllVar);
    }

    @Override // com.taobao.monitor.impl.trace.e.b
    public void a(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd89a3c", new Object[]{this, cllVar, new Long(j)});
        }
    }

    public final boolean c(cll cllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a92f46d9", new Object[]{this, cllVar})).booleanValue();
        }
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(((HashMap) this.f18629a).get(cllVar)) || !bool.equals(((HashMap) this.b).get(cllVar)) || !bool.equals(((HashMap) this.c).get(cllVar))) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void p(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdaffc8", new Object[]{this, cllVar, new Long(j)});
            return;
        }
        ((HashMap) this.c).put(cllVar, Boolean.TRUE);
        k32 k32Var = (k32) ((HashMap) this.d).get(cllVar);
        if (k32Var != null) {
            k32Var.r();
        }
        k32 k32Var2 = (k32) ((HashMap) this.e).get(cllVar);
        if (k32Var2 != null) {
            k32Var2.r();
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 0) {
            ((HashMap) this.b).clear();
            ((HashMap) this.c).clear();
            ArrayList arrayList = new ArrayList(((HashMap) this.d).keySet());
            ((HashMap) this.d).clear();
            ((HashMap) this.e).clear();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                cll cllVar = (cll) arrayList.get(i2);
                if (cllVar != null) {
                    ((HashMap) this.d).put(cllVar, new nl1(cllVar));
                }
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void v(cll cllVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81656cc6", new Object[]{this, cllVar, map, new Long(j)});
            return;
        }
        ((HashMap) this.f18629a).put(cllVar, Boolean.TRUE);
        if (!((HashMap) this.d).containsKey(cllVar)) {
            ((HashMap) this.d).put(cllVar, new nl1(cllVar));
        }
    }

    @Override // com.taobao.monitor.procedure.NotifyApm.a
    public void w(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129f5d16", new Object[]{this, map});
            return;
        }
        Object obj = map.get("page");
        cll cllVar = obj instanceof cll ? (cll) obj : null;
        if (cllVar != null) {
            w9a.g().f().post(new a(cllVar));
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void x(cll cllVar, long j) {
        k32 k32Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8786d6", new Object[]{this, cllVar, new Long(j)});
            return;
        }
        ((HashMap) this.b).put(cllVar, Boolean.TRUE);
        if (!nnl.j(cllVar.o()) && (k32Var = (k32) ((HashMap) this.d).get(cllVar)) != null) {
            k32Var.q(cllVar.w(), j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.PageLeaveDispatcher.b
    public void z(cll cllVar, int i, long j) {
        k32 k32Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f3019a", new Object[]{this, cllVar, new Integer(i), new Long(j)});
        } else if (cllVar != null && (k32Var = (k32) ((HashMap) this.d).get(cllVar)) != null) {
            if (i == -5) {
                k32Var.f(-5);
            } else if (i == -4) {
                k32Var.f(-4);
            } else if (i == -3) {
                k32Var.f(-3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f18630a;

        public a(cll cllVar) {
            this.f18630a = cllVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mgu mguVar = new mgu(this.f18630a);
            try {
                mguVar.q(this.f18630a.w(), out.a());
                ejw.b(ejw.this).put(this.f18630a, mguVar);
                zq6.a("VisibleCollector", "业务触发页面可视计算", this.f18630a.getPageName());
            } catch (Exception e) {
                zq6.a("VisibleCollector", e);
            }
        }
    }
}
