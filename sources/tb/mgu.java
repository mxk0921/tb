package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mgu extends k32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private j q;

    public mgu(cll cllVar) {
        super(cllVar);
        zzb<?> a2 = ic.a(ic.PAGE_RENDER_DISPATCHER);
        if (a2 instanceof j) {
            this.q = (j) a2;
        }
    }

    public static /* synthetic */ Object ipc$super(mgu mguVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/data/visible/TriggeredVisibleCalculator");
    }

    @Override // tb.k32
    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c10c866", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.k32
    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0e4e56", new Object[]{this, new Long(j)});
            return;
        }
        j jVar = this.q;
        if (jVar != null) {
            jVar.k(this.d, j);
        }
    }

    @Override // tb.k32
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3408ca5", new Object[]{this});
        }
    }

    @Override // tb.k32
    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d74309", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.k32
    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141aacd2", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.k32
    public void n(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1ddcd", new Object[]{this, new Float(f), new Long(j)});
        }
    }
}
