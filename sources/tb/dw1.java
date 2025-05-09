package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dw1 extends AnimatorListenerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jw1 f18105a;

    public dw1(jw1 jw1Var) {
        this.f18105a = jw1Var;
    }

    public static /* synthetic */ Object ipc$super(dw1 dw1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2145066406) {
            super.onAnimationEnd((Animator) objArr[0]);
            return null;
        } else if (hashCode == 977295137) {
            super.onAnimationStart((Animator) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/BaseItemPopView$1");
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        super.onAnimationEnd(animator);
        jw1.d(this.f18105a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        super.onAnimationStart(animator);
        jw1 jw1Var = this.f18105a;
        jw1.b(jw1Var, jw1.a(jw1Var), 0L);
        jw1 jw1Var2 = this.f18105a;
        jw1.b(jw1Var2, jw1.c(jw1Var2), 40L);
    }
}
