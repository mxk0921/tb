package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zx4 extends du implements rib.a.AbstractC1047a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100407);
        t2o.a(736100436);
    }

    public zx4(qh2 qh2Var, lh2 lh2Var, a29 a29Var, xiq xiqVar, rib.a aVar) {
        super(qh2Var, lh2Var, a29Var, xiqVar, aVar);
    }

    public static /* synthetic */ Object ipc$super(zx4 zx4Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 799761778) {
            super.c(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1875251023) {
            super.e(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/bootimage/arch/flow/state/lifestate/CreateViewState");
        }
    }

    @Override // tb.du, tb.lsd
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fab6572", new Object[]{this, new Integer(i)});
            return;
        }
        super.c(i);
        int i2 = i == 2001 ? 102 : 104;
        tm1.a("2ARCH_CreateViewState", "notifyViewCreate nextState: " + i2);
        this.d.c(i2, this.e);
    }

    @Override // tb.du
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc60f4f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.e(i, i2);
        tm1.a("2ARCH_CreateViewState", "handle --> 2ARCH_CreateViewState");
        Activity b = this.d.b();
        if (b == null) {
            tm1.a("2ARCH_CreateViewState", "handle: activity null");
        } else if (this.c.j() == null) {
            tm1.a("2ARCH_CreateViewState", "handle: mBizData null");
        } else {
            ei2 K = ((kh2) this.f18066a).K(b, this.c.j(), i2, this);
            if (K == null || K.e()) {
                tm1.a("2ARCH_CreateViewState", "handle: notifyCreateView fail");
                this.d.c(104, this.e);
                return;
            }
            this.b.d(this.c.j(), K, i2);
        }
    }

    @Override // tb.du
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47459e9", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_CreateViewState", "onTimeOut: ");
        this.d.c(104, this.e);
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            return;
        }
        tm1.a("2ARCH_CreateViewState", "notifyViewCreate onError: " + str);
        this.d.c(104, this.e);
    }

    @Override // tb.jsd
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 101;
    }
}
