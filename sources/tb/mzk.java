package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.kmp.OpenArchSingleEntityAdapter;
import java.util.HashMap;
import java.util.List;
import tb.jzk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jzk LifeCycleIntent_SingleComponentInit;
    public static final dp7<jzk> graph;

    /* renamed from: a  reason: collision with root package name */
    public final String f24411a = "OpenArchLifeCycleCompensator";
    public jzk b = LifeCycleIntent_SingleComponentInit;
    public int c = 0;
    public int d = 0;
    public int e = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(779093038);
        dp7<jzk> dp7Var = new dp7<>();
        graph = dp7Var;
        jzk jzkVar = new jzk("LifeCycleIntent_SingleComponentInit");
        LifeCycleIntent_SingleComponentInit = jzkVar;
        jzk.a aVar = jzk.Companion;
        dp7Var.a(jzkVar, aVar.k());
        dp7Var.a(aVar.k(), aVar.r());
        dp7Var.a(aVar.r(), aVar.m());
        dp7Var.a(aVar.m(), aVar.s());
        dp7Var.a(aVar.s(), aVar.n());
        dp7Var.a(aVar.n(), aVar.l());
        dp7Var.a(aVar.s(), aVar.m());
        dp7Var.a(aVar.r(), aVar.n());
        dp7Var.a(aVar.n(), aVar.r());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d00519e", new Object[]{this});
            return;
        }
        this.b = LifeCycleIntent_SingleComponentInit;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public boolean b(jzk jzkVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdf24872", new Object[]{this, jzkVar, aVar})).booleanValue();
        }
        this.c++;
        dp7<jzk> dp7Var = graph;
        if (!dp7Var.e(this.b, jzkVar)) {
            jzk jzkVar2 = this.b;
            if (jzkVar == jzkVar2) {
                x5t.d(this.f24411a, "OpenArch Lifecycle👉🏻 OpenArchLifeCycleCompensator The Same LastLifeCycleIdentifier= " + this.b.b());
                this.e = this.e + 1;
                return false;
            }
            List<jzk> d = dp7Var.d(jzkVar2);
            List<jzk> c = dp7Var.c(jzkVar);
            if (d != null) {
                for (jzk jzkVar3 : d) {
                    if (c.contains(jzkVar3)) {
                        x5t.d(this.f24411a, "OpenArch Lifecycle👉🏻 OpenArchLifeCycleCompensator SUCCESS| LifeCycleIdentifier= " + jzkVar3.b());
                        ((OpenArchSingleEntityAdapter.d) aVar).a(jzkVar3);
                        this.b = jzkVar;
                        this.d++;
                        return true;
                    }
                }
            }
            x5t.d(this.f24411a, "OpenArch Lifecycle👉🏻 OpenArchLifeCycleCompensator Failed| LastLifeCycleIdentifier= " + this.b.b() + " TargetLifeCycleIdentifier= " + jzkVar.b());
            this.e = this.e + 1;
            return false;
        }
        this.b = jzkVar;
        return true;
    }

    public void c(boolean z, cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7c6dca", new Object[]{this, new Boolean(z), cbaVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_watch", String.valueOf(z));
        if (cbaVar != null && (cbaVar.r() instanceof ATaoLiveOpenEntity)) {
            hashMap.put("biz_code", ((ATaoLiveOpenEntity) cbaVar.r()).bizCode);
        }
        hashMap.put(iiz.PERF_STAG_TOTAL, String.valueOf(this.c));
        hashMap.put("compensate", String.valueOf(this.d));
        hashMap.put("fail", String.valueOf(this.e));
        if (v2s.o().s() != null) {
            v2s.o().s().a("lifecycle_report", "lpm_TaoLiveLifeCycle", hashMap);
        }
        a();
    }
}
