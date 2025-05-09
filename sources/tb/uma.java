package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.guess.ActivateGuessBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class uma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ActivateGuessBean f29491a;
    public boolean b;

    static {
        t2o.a(815792984);
    }

    public uma(ActivateGuessBean activateGuessBean, boolean z) {
        ckf.g(activateGuessBean, "item");
        this.f29491a = activateGuessBean;
        this.b = z;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786da075", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final ActivateGuessBean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivateGuessBean) ipChange.ipc$dispatch("234ef7bc", new Object[]{this});
        }
        return this.f29491a;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uma)) {
            return false;
        }
        uma umaVar = (uma) obj;
        if (ckf.b(this.f29491a, umaVar.f29491a) && this.b == umaVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.f29491a.hashCode() * 31) + bbz.a(this.b);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GuessItemBeanWrapper(item=" + this.f29491a + ", exposed=" + this.b + ')';
    }

    public /* synthetic */ uma(ActivateGuessBean activateGuessBean, boolean z, int i, a07 a07Var) {
        this(activateGuessBean, (i & 2) != 0 ? false : z);
    }
}
