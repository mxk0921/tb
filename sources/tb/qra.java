package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.feeds.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qra extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322034);
    }

    public qra(dh7 dh7Var, cxj cxjVar, VerticalAbsViewHolder verticalAbsViewHolder) {
        super(dh7Var, cxjVar, verticalAbsViewHolder);
    }

    public static /* synthetic */ Object ipc$super(qra qraVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/halfscreen/HalfScreenGuideHandler");
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb8d091", new Object[]{this})).floatValue();
        }
        return rra.c(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d08ba44", new Object[]{this})).floatValue();
        }
        return rra.a(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c92b244c", new Object[]{this})).booleanValue();
        }
        return this.b.j().u0();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public boolean i(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8fbce50", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        return this.b.j().J0(i, str);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public void q(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97404b28", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (i == i2 + 1 && s(str)) {
            r();
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd21ae9", new Object[]{this});
            return;
        }
        this.b.j().d(this.c.u0());
        l(this.c.u0(), this.c.getType(), false);
    }

    public final boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bec7583", new Object[]{this, str})).booleanValue();
        }
        if (!this.f7158a.o0(str) || this.f7158a.V(this.c.w0()) == 0) {
            return false;
        }
        return true;
    }
}
