package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.model.DataReceiveMonitor;
import com.taobao.tao.messagekit.core.model.IProtocol;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ikl<M extends IProtocol> implements Comparable<ikl<M>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public M f21366a;
    public int b;
    public String c;
    public int d;
    public String e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public boolean m;
    public Object n;
    public DataReceiveMonitor o;
    public StreamFullLinkMonitor p;
    public int q;

    static {
        t2o.a(628097163);
    }

    public ikl(M m) {
        this.k = 0;
        this.l = 60;
        this.m = false;
        this.o = null;
        this.f21366a = m;
        this.b = m.sysCode();
    }

    /* renamed from: a */
    public int compareTo(ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("580ab6f9", new Object[]{this, iklVar})).intValue();
        }
        if (iklVar == null || iklVar.f21366a == null || !this.f21366a.getID().equals(iklVar.f21366a.getID())) {
            return 1;
        }
        return 0;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6bd217e", new Object[]{this})).booleanValue();
        }
        if (this.q == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "dataId =" + this.c + " dataSourceType=" + this.d + " connectionType=" + this.k + " sysCode" + this.b;
    }

    public ikl(ikl<M> iklVar) {
        this(iklVar.f21366a);
        this.c = iklVar.c;
        this.d = iklVar.d;
        this.e = iklVar.e;
        this.n = iklVar.n;
        this.q = iklVar.q;
    }
}
