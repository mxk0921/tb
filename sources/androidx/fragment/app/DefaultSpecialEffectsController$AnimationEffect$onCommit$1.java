package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1;
import androidx.fragment.app.SpecialEffectsController;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect$onCommit$1", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Ltb/xhv;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DefaultSpecialEffectsController$AnimationEffect$onCommit$1 implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ SpecialEffectsController.Operation $operation;
    public final /* synthetic */ View $viewToAnimate;
    public final /* synthetic */ DefaultSpecialEffectsController.AnimationEffect this$0;

    public DefaultSpecialEffectsController$AnimationEffect$onCommit$1(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, DefaultSpecialEffectsController.AnimationEffect animationEffect) {
        this.$operation = operation;
        this.$container = viewGroup;
        this.$viewToAnimate = view;
        this.this$0 = animationEffect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimationEnd$lambda$0(ViewGroup viewGroup, View view, DefaultSpecialEffectsController.AnimationEffect animationEffect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24f6346", new Object[]{viewGroup, view, animationEffect});
            return;
        }
        ckf.g(viewGroup, "$container");
        ckf.g(animationEffect, "this$0");
        viewGroup.endViewTransition(view);
        animationEffect.getAnimationInfo().getOperation().completeEffect(animationEffect);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            return;
        }
        ckf.g(animation, "animation");
        final ViewGroup viewGroup = this.$container;
        final View view = this.$viewToAnimate;
        final DefaultSpecialEffectsController.AnimationEffect animationEffect = this.this$0;
        viewGroup.post(new Runnable() { // from class: tb.k67
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0(viewGroup, view, animationEffect);
            }
        });
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.$operation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        } else {
            ckf.g(animation, "animation");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            return;
        }
        ckf.g(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder("Animation from operation ");
            sb.append(this.$operation);
            sb.append(" has reached onAnimationStart.");
        }
    }
}
