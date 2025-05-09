package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.RequestStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile long A;
    public volatile long B;
    public volatile boolean C;
    public volatile boolean D;
    public volatile boolean E;
    public volatile boolean F;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f31873a = false;
    public volatile boolean b = false;
    public volatile boolean c = false;
    public volatile boolean d = false;
    public volatile String e = "search";
    public volatile String f = "search";
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile long k;
    public volatile long l;
    public volatile long m;
    public volatile long n;
    public volatile long o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile int t;
    public volatile int u;
    public volatile int v;
    public volatile String w;
    public volatile String x;
    public volatile RequestStats y;
    public volatile long z;

    static {
        t2o.a(993001947);
    }

    public y5p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y5p) ipChange.ipc$dispatch("72892697", new Object[]{this});
        }
        y5p y5pVar = new y5p();
        y5pVar.g = this.g;
        y5pVar.h = this.h;
        y5pVar.i = this.i;
        y5pVar.j = this.j;
        y5pVar.k = this.k;
        y5pVar.s = this.s;
        y5pVar.t = this.t;
        y5pVar.u = this.u;
        y5pVar.A = this.A;
        y5pVar.B = this.B;
        y5pVar.z = this.z;
        y5pVar.D = this.D;
        y5pVar.E = this.E;
        return y5pVar;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "time_all_ui:" + (this.B - this.z) + "\ntime_all:" + this.i + "\n- time_mtop:" + this.j + "\n--  time_oneway_aserver:" + this.y.oneWayTime + "\n--  time_parse:" + this.k + "\n--  time_template:" + this.s + "\n- time_dispatch:" + (this.r - this.q) + "\n- time_setup_page:" + this.p + "\n- time_render:" + (this.B - this.A);
    }
}
