package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IPageListener;
import com.taobao.monitor.impl.trace.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nl1 extends k32 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String u = "ACTIVITY_FRAGMENT_VISIBLE_ACTION";
    private static final String v = "page_name";
    private static final String w = "type";
    private static final String x = "status";
    private final String q;
    private j r;
    private int s = 1;
    private final IPageListener t;

    public nl1(cll cllVar) {
        super(cllVar);
        this.r = null;
        IPageListener o = b21.s().o();
        this.t = o;
        this.q = cllVar.getPageName();
        o.onPageChanged(cllVar.getPageName(), 0, out.a());
        zzb<?> a2 = ic.a(ic.PAGE_RENDER_DISPATCHER);
        if (a2 instanceof j) {
            this.r = (j) a2;
        }
    }

    public static /* synthetic */ Object ipc$super(nl1 nl1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/data/visible/AutoVisibleCalculator");
    }

    @Override // tb.k32
    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c10c866", new Object[]{this, new Long(j)});
            return;
        }
        if (!yq7.c(this.r)) {
            this.r.f(this.d, j);
            zq6.b("PageLifeCycle", this.d.b(), this.d.o(), "Interactive", Long.valueOf(j - this.d.v()));
        }
        this.t.onPageChanged(this.q, 3, j);
    }

    @Override // tb.k32
    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0e4e56", new Object[]{this, new Long(j)});
            return;
        }
        if (!yq7.c(this.r)) {
            zq6.b("PageLifeCycle", this.d.b(), this.d.o(), "Visible", Long.valueOf(j - this.d.v()));
            this.r.j(this.d, j);
            this.r.g(this.d, 0);
            this.s = 0;
        }
        this.t.onPageChanged(this.q, 2, j);
    }

    @Override // tb.k32
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3408ca5", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // tb.k32
    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d74309", new Object[]{this, new Long(j)});
            return;
        }
        if (!yq7.c(this.r)) {
            this.r.i(this.d, j);
        }
        this.t.onPageChanged(this.q, 1, out.a());
    }

    @Override // tb.k32
    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141aacd2", new Object[]{this, new Integer(i)});
        } else if (this.s == 1 && !yq7.c(this.r)) {
            this.r.g(this.d, i);
            this.s = i;
        }
    }

    @Override // tb.k32
    public void n(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1ddcd", new Object[]{this, new Float(f), new Long(j)});
        } else if (!yq7.c(this.r)) {
            this.r.h(this.d, f, j);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4aa420d", new Object[]{this});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(w9a.g().a());
        Intent intent = new Intent(u);
        intent.putExtra("page_name", this.q);
        if (this.d.f() != null) {
            intent.putExtra("type", "activity");
        } else if (this.d.j() != null) {
            intent.putExtra("type", "fragment");
        } else {
            intent.putExtra("type", "unknown");
        }
        intent.putExtra("status", 1);
        instance.sendBroadcastSync(intent);
    }
}
