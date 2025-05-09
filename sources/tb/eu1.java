package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class eu1 extends e22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Animator c;

    static {
        t2o.a(481297391);
    }

    public eu1(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(eu1 eu1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/BaseDragTouch");
    }

    @Override // tb.e22, tb.s1e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        Animator animator = this.c;
        if (animator == null) {
            return false;
        }
        ckf.d(animator);
        if (animator.isRunning()) {
            return true;
        }
        return false;
    }

    public final void t(List<Animator> list, float f, float f2, float f3, boolean z, eid eidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4661ad7e", new Object[]{this, list, new Float(f), new Float(f2), new Float(f3), new Boolean(z), eidVar});
            return;
        }
        ckf.g(list, "animArray");
        ckf.g(eidVar, "view");
        float f4 = (f2 - f) / 2.0f;
        s(list, f3, f3 + f, hfn.b(f4, 0.0f), hfn.e(f4 + f, f2), z, eidVar);
    }

    public float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
        }
        eid p = p();
        if (p == null) {
            return 0.0f;
        }
        return p.getWidth();
    }

    public final void v(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190912e9", new Object[]{this, animator});
        } else {
            this.c = animator;
        }
    }

    public final void s(List<Animator> list, float f, float f2, float f3, float f4, boolean z, eid eidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9088e1", new Object[]{this, list, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Boolean(z), eidVar});
            return;
        }
        ckf.g(list, "animArray");
        ckf.g(eidVar, "view");
        if (f > f3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f3 - f);
            ofFloat.addUpdateListener(new q1j(z, eidVar));
            list.add(ofFloat);
        } else if (f2 < f4) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, f4 - f2);
            ofFloat2.addUpdateListener(new q1j(z, eidVar));
            list.add(ofFloat2);
        }
    }
}
