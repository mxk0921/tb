package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.lb0;
import tb.rdd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ghg implements lb0.a, rdd.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jhg f20002a = null;
    public int b = 0;
    public int c = 0;
    public final khg d = new khg();

    @Override // tb.lb0.a
    public void D(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cd9fc2", new Object[]{this, activity, new Long(j)});
            return;
        }
        jhg jhgVar = this.f20002a;
        if (jhgVar != null) {
            jhgVar.D(activity, j);
        }
        if ("com.taobao.tao.welcome.Welcome".equals(xol.a(activity))) {
            nca.c = true;
        }
    }

    public final jhg a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhg) ipChange.ipc$dispatch("b91f8231", new Object[]{this, new Boolean(z), new Long(j)});
        }
        if (z) {
            return this.d.a(null, j);
        }
        return this.d.b(j);
    }

    public void b(rdd rddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6215df3", new Object[]{this, rddVar});
        } else {
            this.f20002a = null;
        }
    }

    public void c(rdd rddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64dca9fa", new Object[]{this, rddVar});
        }
    }

    @Override // tb.lb0.a
    public void d(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d13ac0", new Object[]{this, activity, new Long(j)});
            return;
        }
        jhg jhgVar = this.f20002a;
        if (jhgVar != null) {
            jhgVar.d(activity, j);
        }
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            x51 x51Var = new x51();
            jhg.W = "WARM";
            x51Var.e("WARM");
            jhg.X = "activityKilled";
        }
    }

    @Override // tb.lb0.a
    public void h(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84a820c", new Object[]{this, activity, new Long(j)});
            return;
        }
        this.c--;
        jhg jhgVar = this.f20002a;
        if (jhgVar != null) {
            jhgVar.h(activity, j);
        }
    }

    @Override // tb.lb0.a
    public void j(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84c3aef", new Object[]{this, activity, new Long(j)});
            return;
        }
        jhg jhgVar = this.f20002a;
        if (jhgVar != null) {
            jhgVar.j(activity, j);
        }
    }

    @Override // tb.lb0.a
    public void k(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622b42d8", new Object[]{this, activity, new Long(j)});
            return;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 1 && this.f20002a == null) {
            jhg a2 = this.d.a("HOT", j);
            this.f20002a = a2;
            if (a2 != null) {
                a2.P(this);
            }
        }
        jhg jhgVar = this.f20002a;
        if (jhgVar != null) {
            jhgVar.k(activity, j);
        }
    }

    @Override // tb.lb0.a
    public void B(Activity activity, Map<String, Object> map, long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7c62f2", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        Object obj = map.get("outLink");
        if (this.b == 0) {
            if (obj != null) {
                z = true;
            }
            jhg a2 = a(z, j);
            this.f20002a = a2;
            if (a2 != null) {
                a2.P(this);
            }
        }
        jhg jhgVar = this.f20002a;
        if (jhgVar != null) {
            jhgVar.B(activity, map, j);
        }
        this.b++;
    }
}
