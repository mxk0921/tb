package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class epj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f18740a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public a(boolean z, View view, int i) {
            this.f18740a = z;
            this.b = view;
            this.c = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f18740a) {
                this.b.setTranslationY(this.c * floatValue);
            } else {
                this.b.setTranslationY(this.c * (1.0f - floatValue));
            }
            if (((int) floatValue) == 1) {
                epj.a(this.b);
            }
        }
    }

    public static /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3ff7fb", new Object[]{view});
        } else {
            b(view);
        }
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd0ee9d", new Object[]{view});
        } else {
            view.setTranslationY(0.0f);
        }
    }

    public static void c(View view, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0080fa9", new Object[]{view, animator});
            return;
        }
        b(view);
        animator.cancel();
    }

    public static Animator d(View view, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("d4de34d8", new Object[]{view, new Boolean(z), animatorListenerAdapter});
        }
        int height = view.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(z, view, height));
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }
}
