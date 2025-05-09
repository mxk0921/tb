package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ft6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final at6 f19518a;
    public final xs6 b;
    public final lyb c;

    static {
        t2o.a(487587944);
    }

    public ft6(String str, iyb iybVar, dyb dybVar) {
        this(str, iybVar, dybVar, false);
    }

    public AwesomeGetContainerData a(xn4 xn4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("6c889dea", new Object[]{this, xn4Var});
        }
        if (xn4Var == null) {
            return null;
        }
        return this.f19518a.l(xn4Var.f31484a);
    }

    public b6d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6d) ipChange.ipc$dispatch("64f2a92e", new Object[]{this});
        }
        return this.f19518a;
    }

    public boolean c(xn4 xn4Var, vqb vqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665a1be6", new Object[]{this, xn4Var, vqbVar})).booleanValue();
        }
        return this.b.n(xn4Var, vqbVar);
    }

    public void d(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9c0d9", new Object[]{this, xn4Var, iPrefetchCallback});
        } else {
            this.b.o(xn4Var, iPrefetchCallback);
        }
    }

    public boolean e(xn4 xn4Var, eee eeeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ce8f848", new Object[]{this, xn4Var, eeeVar})).booleanValue();
        }
        if (xn4Var == null) {
            return false;
        }
        return this.b.q(xn4Var, eeeVar);
    }

    public boolean f(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362fbf08", new Object[]{this, str, strArr, jSONObject})).booleanValue();
        }
        return ((mu6) this.c).d(str, strArr, jSONObject);
    }

    public void g(xn4 xn4Var, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5786f0d2", new Object[]{this, xn4Var, iPrefetchCallback});
        } else {
            this.b.s(xn4Var, iPrefetchCallback);
        }
    }

    public ft6(String str, iyb iybVar, dyb dybVar, boolean z) {
        ry8.c("homepage_switch");
        at6 at6Var = new at6(iybVar.a().getApplication(), str, !z);
        this.f19518a = at6Var;
        ot6 ot6Var = new ot6();
        xs6 xs6Var = new xs6(iybVar, at6Var, new ozj(), ot6Var);
        this.b = xs6Var;
        ot6Var.e(xs6Var);
        mu6 mu6Var = new mu6(xs6Var, dybVar, z);
        this.c = mu6Var;
        xs6Var.r(mu6Var);
    }
}
