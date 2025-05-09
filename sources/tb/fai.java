package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import java.util.ArrayList;
import tb.ajw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class fai<P extends ajw> extends Visibility {

    /* renamed from: a  reason: collision with root package name */
    public final P f19140a;
    public final ajw b;

    public fai(P p, ajw ajwVar) {
        this.f19140a = p;
        this.b = ajwVar;
        setInterpolator(pz0.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    public final Animator a(ViewGroup viewGroup, View view, boolean z) {
        Animator animator;
        Animator animator2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        P p = this.f19140a;
        if (z) {
            animator = p.b(viewGroup, view);
        } else {
            animator = p.a(viewGroup, view);
        }
        if (animator != null) {
            arrayList.add(animator);
        }
        ajw ajwVar = this.b;
        if (ajwVar != null) {
            if (z) {
                animator2 = ajwVar.b(viewGroup, view);
            } else {
                animator2 = ajwVar.a(viewGroup, view);
            }
            if (animator2 != null) {
                arrayList.add(animator2);
            }
        }
        tz0.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(viewGroup, view, false);
    }
}
