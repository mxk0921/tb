package tb;

import android.content.Context;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class teu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int SHARE_TRANSITION_STATE_COMPLETED = 2;
    public static final int SHARE_TRANSITION_STATE_EXECUTING = 1;
    public static final int SHARE_TRANSITION_STATE_INIT = 0;

    /* renamed from: a  reason: collision with root package name */
    public Transition f28668a;
    public Transition b;
    public List<Pair<View, String>> c;
    public pol d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601394);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601393);
    }

    public abstract ViewGroup a();

    public abstract Context b();

    public final List<Pair<View, String>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3696f15a", new Object[]{this});
        }
        return this.c;
    }

    public abstract View d();

    public final Transition e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("75737160", new Object[]{this});
        }
        return null;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8837a51", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final Transition g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("fb4a82d2", new Object[]{this});
        }
        return null;
    }

    public final pol h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pol) ipChange.ipc$dispatch("c0b68ea", new Object[]{this});
        }
        return this.d;
    }

    public final Transition i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("fcd720f5", new Object[]{this});
        }
        return this.f28668a;
    }

    public final Transition j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("f00cf16f", new Object[]{this});
        }
        return this.b;
    }

    public void k(pol polVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472680bf", new Object[]{this, polVar, new Boolean(z)});
        }
    }

    public abstract void l();

    public final void m(List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83544a", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d5e533", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5624a584", new Object[]{this});
        }
    }

    public final void p(pol polVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2845dec2", new Object[]{this, polVar});
        } else {
            this.d = polVar;
        }
    }

    public final void q(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803e8473", new Object[]{this, transition});
            return;
        }
        ckf.g(transition, "transition");
        Transition transition2 = this.f28668a;
        if (transition2 == null) {
            this.f28668a = transition;
        } else if (!(transition2 instanceof TransitionSet)) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(this.f28668a);
            transitionSet.addTransition(transition);
            this.f28668a = transitionSet;
        } else if (transition2 != null) {
            ((TransitionSet) transition2).addTransition(transition);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.transition.TransitionSet");
        }
    }

    public final void r(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469a2ed1", new Object[]{this, transition});
            return;
        }
        ckf.g(transition, "transition");
        Transition transition2 = this.b;
        if (transition2 == null) {
            this.b = transition;
        } else if (!(transition2 instanceof TransitionSet)) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(this.b);
            transitionSet.addTransition(transition);
            this.b = transitionSet;
        } else if (transition2 != null) {
            ((TransitionSet) transition2).addTransition(transition);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.transition.TransitionSet");
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d7f3b", new Object[]{this});
        }
    }
}
