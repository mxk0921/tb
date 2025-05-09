package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zko extends yko {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public yko r;
    public h9m s;
    public final CountDownLatch t = new CountDownLatch(1);
    public final ReentrantLock u = new ReentrantLock();

    static {
        t2o.a(993001567);
    }

    public static /* synthetic */ Object ipc$super(zko zkoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1569530894:
                return super.f();
            case -1349044809:
                return super.o();
            case 979432168:
                return super.j();
            case 1775722973:
                return super.g();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/SCoreProxy");
        }
    }

    @Override // tb.yko
    public rg3<BaseCellBean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg3) ipChange.ipc$dispatch("744941fb", new Object[]{this});
        }
        return this.r.a();
    }

    @Override // tb.yko
    public vg3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vg3) ipChange.ipc$dispatch("bd9a8a90", new Object[]{this});
        }
        return this.r.b();
    }

    @Override // tb.yko
    public i3p f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i3p) ipChange.ipc$dispatch("a272dbf2", new Object[]{this});
        }
        yko ykoVar = this.r;
        if (ykoVar != null) {
            return ykoVar.f();
        }
        return super.f();
    }

    @Override // tb.yko
    public fj4 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fj4) ipChange.ipc$dispatch("69d761dd", new Object[]{this});
        }
        yko ykoVar = this.r;
        if (ykoVar != null) {
            return ykoVar.g();
        }
        return super.g();
    }

    @Override // tb.yko
    public it4 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (it4) ipChange.ipc$dispatch("613a3146", new Object[]{this});
        }
        return this.r.h();
    }

    @Override // tb.yko
    public tb4 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tb4) ipChange.ipc$dispatch("3a60f2e8", new Object[]{this});
        }
        yko ykoVar = this.r;
        if (ykoVar != null) {
            return ykoVar.j();
        }
        return super.j();
    }

    @Override // tb.yko
    public boolean k() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        try {
            this.u.lock();
            if (this.r != null) {
                z = true;
            }
            return z;
        } finally {
            this.u.unlock();
        }
    }

    @Override // tb.yko
    public jxi<x02, BaseTypedBean> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jxi) ipChange.ipc$dispatch("4e98921d", new Object[]{this});
        }
        return this.r.m();
    }

    @Override // tb.yko
    public kxi n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxi) ipChange.ipc$dispatch("33b2fdea", new Object[]{this});
        }
        return this.r.n();
    }

    @Override // tb.yko
    public orj o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (orj) ipChange.ipc$dispatch("af9735b7", new Object[]{this});
        }
        yko ykoVar = this.r;
        if (ykoVar != null) {
            return ykoVar.o();
        }
        return super.o();
    }

    @Override // tb.yko
    public void p(h9m h9mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b23bec7", new Object[]{this, h9mVar});
            return;
        }
        yko ykoVar = this.r;
        if (ykoVar != null) {
            ykoVar.p(h9mVar);
        } else {
            this.s = h9mVar;
        }
    }

    @Override // tb.yko
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e704cb", new Object[]{this});
            return;
        }
        try {
            this.t.await();
        } catch (Throwable unused) {
        }
    }

    public void u(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43717c33", new Object[]{this, ykoVar});
            return;
        }
        try {
            this.u.lock();
            this.r = ykoVar;
            h9m h9mVar = this.s;
            if (h9mVar != null) {
                ykoVar.p(h9mVar);
                this.s = null;
            }
            this.t.countDown();
            this.u.unlock();
        } catch (Throwable th) {
            this.u.unlock();
            throw th;
        }
    }
}
