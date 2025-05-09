package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class iwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gwl f21615a;
    public gwl b;

    static {
        t2o.a(723517464);
    }

    public synchronized void a(gwl gwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c6771a", new Object[]{this, gwlVar});
        } else if (gwlVar != null) {
            gwl gwlVar2 = this.b;
            if (gwlVar2 != null) {
                gwlVar2.d = gwlVar;
                this.b = gwlVar;
            } else if (this.f21615a == null) {
                this.b = gwlVar;
                this.f21615a = gwlVar;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    public synchronized gwl b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwl) ipChange.ipc$dispatch("81dbdfdb", new Object[]{this});
        }
        gwl gwlVar = this.f21615a;
        if (gwlVar != null) {
            gwl gwlVar2 = gwlVar.d;
            this.f21615a = gwlVar2;
            if (gwlVar2 == null) {
                this.b = null;
            }
        }
        return gwlVar;
    }

    public synchronized gwl c(int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwl) ipChange.ipc$dispatch("a0908144", new Object[]{this, new Integer(i)});
        }
        if (this.f21615a == null) {
            wait(i);
        }
        return b();
    }
}
