package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.BackEventCompat;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.fragment.app.SpecialEffectsController;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.d04;
import tb.d1a;
import tb.i04;
import tb.pg1;
import tb.xhv;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\b%&'()*+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006-"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "Ltb/xhv;", "syncAnimations", "(Ljava/util/List;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfos", "collectAnimEffects", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "createTransitionEffect", "(Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "", "names", "retainMatchingViews", "(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V", "", "namedViews", "view", "findNamedViews", "(Ljava/util/Map;Landroid/view/View;)V", "collectEffects", "(Ljava/util/List;Z)V", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "container", "Ltb/xhv;", "onCommit", "(Landroid/view/ViewGroup;)V", "onCancel", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getAnimationInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnimationEffect extends SpecialEffectsController.Effect {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            ckf.g(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        public static /* synthetic */ Object ipc$super(AnimationEffect animationEffect, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect");
        }

        public final AnimationInfo getAnimationInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AnimationInfo) ipChange.ipc$dispatch("72e69227", new Object[]{this});
            }
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8602317f", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Animation from operation ");
                sb.append(operation);
                sb.append(" has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fde7debc", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = viewGroup.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            ckf.f(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                Animation animation2 = animation.animation;
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view.startAnimation(animation2);
                    this.animationInfo.getOperation().completeEffect(this);
                } else {
                    viewGroup.startViewTransition(view);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, viewGroup, view);
                    endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, viewGroup, view, this));
                    view.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder("Animation from operation ");
                        sb.append(operation);
                        sb.append(" has started.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnimationInfo extends SpecialEffectsInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            ckf.g(operation, "operation");
            this.isPop = z;
        }

        public static /* synthetic */ Object ipc$super(AnimationInfo animationInfo, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo");
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentAnim.AnimationOrAnimator) ipChange.ipc$dispatch("50dd1680", new Object[]{this, context});
            }
            ckf.g(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            Fragment fragment = getOperation().getFragment();
            if (getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                z = true;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, fragment, z, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animatorInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "container", "Ltb/xhv;", "onStart", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "onCancel", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getAnimatorInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroid/animation/AnimatorSet;", "animator", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "", "isSeekingSupported", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AnimatorSet animator;
        private final AnimationInfo animatorInfo;

        public AnimatorEffect(AnimationInfo animationInfo) {
            ckf.g(animationInfo, "animatorInfo");
            this.animatorInfo = animationInfo;
        }

        public static /* synthetic */ Object ipc$super(AnimatorEffect animatorEffect, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect");
        }

        public final AnimatorSet getAnimator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AnimatorSet) ipChange.ipc$dispatch("9c9d60e5", new Object[]{this});
            }
            return this.animator;
        }

        public final AnimationInfo getAnimatorInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AnimationInfo) ipChange.ipc$dispatch("8e529736", new Object[]{this});
            }
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c373039", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup viewGroup) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8602317f", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.isSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                if (operation.isSeeking()) {
                    str = " with seeking.";
                } else {
                    str = ".";
                }
                sb.append(str);
                sb.append(' ');
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fde7debc", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("538f3eb2", new Object[]{this, backEventCompat, viewGroup});
                return;
            }
            ckf.g(backEventCompat, "backEvent");
            ckf.g(viewGroup, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
            } else if (Build.VERSION.SDK_INT >= 34 && operation.getFragment().mTransitioning) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    new StringBuilder("Adding BackProgressCallbacks for Animators to operation ").append(operation);
                }
                long j = Api24Impl.INSTANCE.totalDuration(animatorSet);
                long progress = backEventCompat.getProgress() * ((float) j);
                if (progress == 0) {
                    progress = 1;
                }
                if (progress == j) {
                    progress = j - 1;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder("Setting currentPlayTime to ");
                    sb.append(progress);
                    sb.append(" for Animator ");
                    sb.append(animatorSet);
                    sb.append(" on operation ");
                    sb.append(operation);
                }
                Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup viewGroup) {
            AnimatorSet animatorSet;
            final boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("428ef309", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            if (!this.animatorInfo.isVisibilityUnchanged()) {
                Context context = viewGroup.getContext();
                AnimationInfo animationInfo = this.animatorInfo;
                ckf.f(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation != null) {
                    animatorSet = animation.animator;
                } else {
                    animatorSet = null;
                }
                this.animator = animatorSet;
                final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
                Fragment fragment = operation.getFragment();
                if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                    z = true;
                } else {
                    z = false;
                }
                final View view = fragment.mView;
                viewGroup.startViewTransition(view);
                AnimatorSet animatorSet2 = this.animator;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(DefaultSpecialEffectsController$AnimatorEffect$onStart$1 defaultSpecialEffectsController$AnimatorEffect$onStart$1, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect$onStart$1");
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            ckf.g(animator, "anim");
                            viewGroup.endViewTransition(view);
                            if (z) {
                                SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                View view2 = view;
                                ckf.f(view2, "viewToAnimate");
                                finalState.applyState(view2, viewGroup);
                            }
                            this.getAnimatorInfo().getOperation().completeEffect(this);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb = new StringBuilder("Animator from operation ");
                                sb.append(operation);
                                sb.append(" has ended.");
                            }
                        }
                    });
                }
                AnimatorSet animatorSet3 = this.animator;
                if (animatorSet3 != null) {
                    animatorSet3.setTarget(view);
                }
            }
        }

        public final void setAnimator(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("198dd261", new Object[]{this, animatorSet});
            } else {
                this.animator = animatorSet;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "()V", "totalDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public final long totalDuration(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1c32b066", new Object[]{this, animatorSet})).longValue();
            }
            ckf.g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "Ltb/xhv;", pg1.ATOM_EXT_reverse, "(Landroid/animation/AnimatorSet;)V", "", "time", "setCurrentPlayTime", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Api26Impl INSTANCE = new Api26Impl();

        private Api26Impl() {
        }

        public final void reverse(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2994e48", new Object[]{this, animatorSet});
                return;
            }
            ckf.g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void setCurrentPlayTime(AnimatorSet animatorSet, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cc3e792", new Object[]{this, animatorSet, new Long(j)});
                return;
            }
            ckf.g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SpecialEffectsInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            ckf.g(operation, "operation");
            this.operation = operation;
        }

        public final SpecialEffectsController.Operation getOperation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpecialEffectsController.Operation) ipChange.ipc$dispatch("83ad13fe", new Object[]{this});
            }
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State state2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae48ea8a", new Object[]{this})).booleanValue();
            }
            View view = this.operation.getFragment().mView;
            if (view != null) {
                state = SpecialEffectsController.Operation.State.Companion.asOperationState(view);
            } else {
                state = null;
            }
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (state == finalState || (state != (state2 = SpecialEffectsController.Operation.State.VISIBLE) && finalState != state2)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bC\u0010BR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bG\u0010BR'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bH\u0010BR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bI\u0010FR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\b\u0019\u0010LR\u001d\u0010N\u001a\u00020M8\u0006¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010QR$\u0010T\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?\"\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010LR\u0011\u0010Z\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bY\u0010L¨\u0006["}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "firstOut", "lastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Landroidx/collection/ArrayMap;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "createMergedTransition", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "Ltb/xhv;", "executeTransition", "runTransition", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Ltb/d1a;)V", "transitioningViews", "view", "captureTransitioningViews", "(Ljava/util/ArrayList;Landroid/view/View;)V", "onStart", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "onCancel", "Ljava/util/List;", "getTransitionInfos", "()Ljava/util/List;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getFirstOut", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getLastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "getTransitionImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "getSharedElementLastInViews", "Landroidx/collection/ArrayMap;", "getSharedElementNameMapping", "()Landroidx/collection/ArrayMap;", "getEnteringNames", "getExitingNames", "getFirstOutViews", "getLastInViews", "Z", "()Z", "Landroidx/core/os/CancellationSignal;", "transitionSignal", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "controller", "getController", "setController", "(Ljava/lang/Object;)V", "isSeekingSupported", "getTransitioning", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class TransitionEffect extends SpecialEffectsController.Effect {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object controller;
        private final ArrayList<String> enteringNames;
        private final ArrayList<String> exitingNames;
        private final SpecialEffectsController.Operation firstOut;
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;
        private final SpecialEffectsController.Operation lastIn;
        private final ArrayMap<String, View> lastInViews;
        private final ArrayList<View> sharedElementFirstOutViews;
        private final ArrayList<View> sharedElementLastInViews;
        private final ArrayMap<String, String> sharedElementNameMapping;
        private final Object sharedElementTransition;
        private final FragmentTransitionImpl transitionImpl;
        private final List<TransitionInfo> transitionInfos;
        private final CancellationSignal transitionSignal = new CancellationSignal();

        public TransitionEffect(List<TransitionInfo> list, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl fragmentTransitionImpl, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayMap<String, String> arrayMap, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayMap<String, View> arrayMap2, ArrayMap<String, View> arrayMap3, boolean z) {
            ckf.g(list, "transitionInfos");
            ckf.g(fragmentTransitionImpl, "transitionImpl");
            ckf.g(arrayList, "sharedElementFirstOutViews");
            ckf.g(arrayList2, "sharedElementLastInViews");
            ckf.g(arrayMap, "sharedElementNameMapping");
            ckf.g(arrayList3, "enteringNames");
            ckf.g(arrayList4, "exitingNames");
            ckf.g(arrayMap2, "firstOutViews");
            ckf.g(arrayMap3, "lastInViews");
            this.transitionInfos = list;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = fragmentTransitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = arrayList;
            this.sharedElementLastInViews = arrayList2;
            this.sharedElementNameMapping = arrayMap;
            this.enteringNames = arrayList3;
            this.exitingNames = arrayList4;
            this.firstOutViews = arrayMap2;
            this.lastInViews = arrayMap3;
            this.isPop = z;
        }

        private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bced03d6", new Object[]{this, arrayList, view});
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!ViewGroupCompat.isTransitionGroup(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getVisibility() == 0) {
                            captureTransitioningViews(arrayList, childAt);
                        }
                    }
                } else if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$13(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("882f6be9", new Object[]{fragmentTransitionImpl, view, rect});
                return;
            }
            ckf.g(fragmentTransitionImpl, "$impl");
            ckf.g(rect, "$lastInEpicenterRect");
            fragmentTransitionImpl.getBoundsOnScreen(view, rect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$14(ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d756aa", new Object[]{arrayList});
                return;
            }
            ckf.g(arrayList, "$transitioningViews");
            FragmentTransition.setViewVisibility(arrayList, 4);
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e9216da", new Object[0]);
            }
        }

        public static /* synthetic */ Object ipc$super(TransitionEffect transitionEffect, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$4(Ref$ObjectRef ref$ObjectRef) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3a1e4cc", new Object[]{ref$ObjectRef});
                return;
            }
            ckf.g(ref$ObjectRef, "$seekCancelLambda");
            d1a d1aVar = (d1a) ref$ObjectRef.element;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
        }

        public final Object getController() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f09c8539", new Object[]{this});
            }
            return this.controller;
        }

        public final ArrayList<String> getEnteringNames() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("809cbe89", new Object[]{this});
            }
            return this.enteringNames;
        }

        public final ArrayList<String> getExitingNames() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("dafceafb", new Object[]{this});
            }
            return this.exitingNames;
        }

        public final SpecialEffectsController.Operation getFirstOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpecialEffectsController.Operation) ipChange.ipc$dispatch("5fe4d9b", new Object[]{this});
            }
            return this.firstOut;
        }

        public final ArrayMap<String, View> getFirstOutViews() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayMap) ipChange.ipc$dispatch("89ba176", new Object[]{this});
            }
            return this.firstOutViews;
        }

        public final SpecialEffectsController.Operation getLastIn() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpecialEffectsController.Operation) ipChange.ipc$dispatch("91fbed5e", new Object[]{this});
            }
            return this.lastIn;
        }

        public final ArrayMap<String, View> getLastInViews() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayMap) ipChange.ipc$dispatch("1d5fc113", new Object[]{this});
            }
            return this.lastInViews;
        }

        public final ArrayList<View> getSharedElementFirstOutViews() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("a92c36d0", new Object[]{this});
            }
            return this.sharedElementFirstOutViews;
        }

        public final ArrayList<View> getSharedElementLastInViews() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("6c7a63d3", new Object[]{this});
            }
            return this.sharedElementLastInViews;
        }

        public final ArrayMap<String, String> getSharedElementNameMapping() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayMap) ipChange.ipc$dispatch("c755cf6e", new Object[]{this});
            }
            return this.sharedElementNameMapping;
        }

        public final Object getSharedElementTransition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("595d3f5", new Object[]{this});
            }
            return this.sharedElementTransition;
        }

        public final FragmentTransitionImpl getTransitionImpl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentTransitionImpl) ipChange.ipc$dispatch("2fa6e67", new Object[]{this});
            }
            return this.transitionImpl;
        }

        public final List<TransitionInfo> getTransitionInfos() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1f735a6", new Object[]{this});
            }
            return this.transitionInfos;
        }

        public final CancellationSignal getTransitionSignal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CancellationSignal) ipChange.ipc$dispatch("ed8d455f", new Object[]{this});
            }
            return this.transitionSignal;
        }

        public final boolean getTransitioning() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c35cbbc2", new Object[]{this})).booleanValue();
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (!transitionInfo.getOperation().getFragment().mTransitioning) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean isPop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c5d4edd2", new Object[]{this})).booleanValue();
            }
            return this.isPop;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isSeekingSupported() {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0019
                java.lang.String r3 = "6c373039"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x0019:
                androidx.fragment.app.FragmentTransitionImpl r2 = r6.transitionImpl
                boolean r2 = r2.isSeekingSupported()
                if (r2 == 0) goto L_0x0069
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r2 = r6.transitionInfos
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r3 = r2 instanceof java.util.Collection
                if (r3 == 0) goto L_0x0033
                r3 = r2
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0033
                goto L_0x005c
            L_0x0033:
                java.util.Iterator r2 = r2.iterator()
            L_0x0037:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x005c
                java.lang.Object r3 = r2.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r3 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r3
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 34
                if (r4 < r5) goto L_0x0069
                java.lang.Object r4 = r3.getTransition()
                if (r4 == 0) goto L_0x0069
                androidx.fragment.app.FragmentTransitionImpl r4 = r6.transitionImpl
                java.lang.Object r3 = r3.getTransition()
                boolean r3 = r4.isSeekingSupported(r3)
                if (r3 == 0) goto L_0x0069
                goto L_0x0037
            L_0x005c:
                java.lang.Object r2 = r6.sharedElementTransition
                if (r2 == 0) goto L_0x0068
                androidx.fragment.app.FragmentTransitionImpl r3 = r6.transitionImpl
                boolean r2 = r3.isSeekingSupported(r2)
                if (r2 == 0) goto L_0x0069
            L_0x0068:
                r0 = 1
            L_0x0069:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.isSeekingSupported():boolean");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8602317f", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fde7debc", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        viewGroup.toString();
                        Objects.toString(operation);
                    }
                    transitionInfo.getOperation().completeEffect(this);
                }
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.animateToEnd(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(this.firstOut);
                    Objects.toString(this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> createMergedTransition = createMergedTransition(viewGroup, this.lastIn, this.firstOut);
            ArrayList<View> component1 = createMergedTransition.component1();
            Object component2 = createMergedTransition.component2();
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            for (TransitionInfo transitionInfo2 : list) {
                arrayList.add(transitionInfo2.getOperation());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) it.next();
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), component2, this.transitionSignal, new Runnable() { // from class: tb.q67
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation.this, this);
                    }
                });
            }
            runTransition(component1, viewGroup, new DefaultSpecialEffectsController$TransitionEffect$onCommit$4(this, viewGroup, component2));
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("538f3eb2", new Object[]{this, backEventCompat, viewGroup});
                return;
            }
            ckf.g(backEventCompat, "backEvent");
            ckf.g(viewGroup, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEventCompat.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("428ef309", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        viewGroup.toString();
                        Objects.toString(operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !isSeekingSupported()) {
                Objects.toString(this.sharedElementTransition);
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
            if (isSeekingSupported() && getTransitioning()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Pair<ArrayList<View>, Object> createMergedTransition = createMergedTransition(viewGroup, this.lastIn, this.firstOut);
                ArrayList<View> component1 = createMergedTransition.component1();
                Object component2 = createMergedTransition.component2();
                List<TransitionInfo> list = this.transitionInfos;
                ArrayList arrayList = new ArrayList(zz3.q(list, 10));
                for (TransitionInfo transitionInfo2 : list) {
                    arrayList.add(transitionInfo2.getOperation());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    final SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) it.next();
                    this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), component2, this.transitionSignal, new Runnable() { // from class: tb.o67
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4(Ref$ObjectRef.this);
                        }
                    }, new Runnable() { // from class: tb.p67
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(SpecialEffectsController.Operation.this, this);
                        }
                    });
                }
                runTransition(component1, viewGroup, new DefaultSpecialEffectsController$TransitionEffect$onStart$4(this, viewGroup, component2, ref$ObjectRef));
            }
        }

        public final void setController(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1f53fc1", new Object[]{this, obj});
            } else {
                this.controller = obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect transitionEffect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ed35822", new Object[]{operation, operation2, transitionEffect});
                return;
            }
            ckf.g(transitionEffect, "this$0");
            FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), transitionEffect.isPop, transitionEffect.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect transitionEffect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("464292f2", new Object[]{operation, transitionEffect});
                return;
            }
            ckf.g(operation, "$operation");
            ckf.g(transitionEffect, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Transition for operation ");
                sb.append(operation);
                sb.append(" has completed");
            }
            operation.completeEffect(transitionEffect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect transitionEffect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95e3b7ad", new Object[]{operation, transitionEffect});
                return;
            }
            ckf.g(operation, "$operation");
            ckf.g(transitionEffect, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Transition for operation ");
                sb.append(operation);
                sb.append(" has completed");
            }
            operation.completeEffect(transitionEffect);
        }

        private final void runTransition(ArrayList<View> arrayList, ViewGroup viewGroup, d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38f119e9", new Object[]{this, arrayList, viewGroup, d1aVar});
                return;
            }
            FragmentTransition.setViewVisibility(arrayList, 4);
            ArrayList<String> prepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                Iterator<View> it = this.sharedElementFirstOutViews.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    ckf.f(next, "sharedElementFirstOutViews");
                    View view = next;
                    StringBuilder sb = new StringBuilder("View: ");
                    sb.append(view);
                    sb.append(" Name: ");
                    sb.append(ViewCompat.getTransitionName(view));
                }
                Iterator<View> it2 = this.sharedElementLastInViews.iterator();
                while (it2.hasNext()) {
                    View next2 = it2.next();
                    ckf.f(next2, "sharedElementLastInViews");
                    View view2 = next2;
                    StringBuilder sb2 = new StringBuilder("View: ");
                    sb2.append(view2);
                    sb2.append(" Name: ");
                    sb2.append(ViewCompat.getTransitionName(view2));
                }
            }
            d1aVar.invoke();
            this.transitionImpl.setNameOverridesReordered(viewGroup, this.sharedElementFirstOutViews, this.sharedElementLastInViews, prepareSetNameOverridesReordered, this.sharedElementNameMapping);
            FragmentTransition.setViewVisibility(arrayList, 0);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        private final Pair<ArrayList<View>, Object> createMergedTransition(ViewGroup viewGroup, SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
            final SpecialEffectsController.Operation operation3 = operation;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("150376ac", new Object[]{this, viewGroup, operation3, operation2});
            }
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            View view2 = null;
            boolean z = false;
            for (TransitionInfo transitionInfo : this.transitionInfos) {
                if (!(!transitionInfo.hasSharedElementTransition() || operation2 == null || operation3 == null || this.sharedElementNameMapping.isEmpty() || this.sharedElementTransition == null)) {
                    FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: tb.l67
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12(SpecialEffectsController.Operation.this, operation2, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        ckf.f(str, "exitingNames[0]");
                        View view3 = this.firstOutViews.get(str);
                        this.transitionImpl.setEpicenter(this.sharedElementTransition, view3);
                        view2 = view3;
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        ckf.f(str2, "enteringNames[0]");
                        final View view4 = this.lastInViews.get(str2);
                        if (view4 != null) {
                            final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: tb.m67
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13(FragmentTransitionImpl.this, view4, rect);
                                }
                            });
                            z = true;
                        }
                    }
                    this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransitionInfo> it = this.transitionInfos.iterator();
            Object obj2 = null;
            Object obj3 = null;
            while (it.hasNext()) {
                TransitionInfo next = it.next();
                SpecialEffectsController.Operation operation4 = next.getOperation();
                Object cloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                if (cloneTransition != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    it = it;
                    View view5 = operation4.getFragment().mView;
                    ckf.f(view5, "operation.fragment.mView");
                    captureTransitioningViews(arrayList2, view5);
                    if (this.sharedElementTransition != null && (operation4 == operation2 || operation4 == operation3)) {
                        if (operation4 == operation2) {
                            arrayList2.removeAll(i04.G0(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(i04.G0(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.addTarget(cloneTransition, view);
                    } else {
                        this.transitionImpl.addTargets(cloneTransition, arrayList2);
                        this.transitionImpl.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList2, null, null, null, null);
                        if (operation4.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation4.setAwaitingContainerChanges(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation4.getFragment().mView);
                            this.transitionImpl.scheduleHideFragmentView(cloneTransition, operation4.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: tb.n67
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z) {
                            this.transitionImpl.setEpicenter(cloneTransition, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            cloneTransition.toString();
                            Iterator<View> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                View next2 = it2.next();
                                ckf.f(next2, "transitioningViews");
                                next2.toString();
                            }
                        }
                    } else {
                        this.transitionImpl.setEpicenter(cloneTransition, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            cloneTransition.toString();
                            Iterator<View> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                View next3 = it3.next();
                                ckf.f(next3, "transitioningViews");
                                next3.toString();
                            }
                        }
                    }
                    if (next.isOverlapAllowed()) {
                        obj2 = this.transitionImpl.mergeTransitionsTogether(obj2, cloneTransition, null);
                        operation3 = operation;
                        it = it;
                        obj3 = obj3;
                    } else {
                        obj3 = this.transitionImpl.mergeTransitionsTogether(obj3, cloneTransition, null);
                    }
                } else {
                    it = it;
                }
                operation3 = operation;
            }
            Object mergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(obj2, obj3, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(mergeTransitionsInSequence);
            }
            return new Pair<>(arrayList, mergeTransitionsInSequence);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
        ckf.g(viewGroup, "container");
    }

    private final void collectAnimEffects(List<AnimationInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf925c1f", new Object[]{this, list});
            return;
        }
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AnimationInfo animationInfo : list) {
            d04.v(arrayList2, animationInfo.getOperation().getEffects$fragment_release());
        }
        boolean isEmpty = arrayList2.isEmpty();
        boolean z = false;
        for (AnimationInfo animationInfo2 : list) {
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation = animationInfo2.getOperation();
            ckf.f(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo2.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo2);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.getEffects$fragment_release().isEmpty()) {
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                        }
                        operation.addEffect(new AnimatorEffect(animationInfo2));
                        z = true;
                    } else if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder("Ignoring Animator set on ");
                        sb.append(fragment);
                        sb.append(" as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (AnimationInfo animationInfo3 : arrayList) {
            SpecialEffectsController.Operation operation2 = animationInfo3.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (!isEmpty) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder("Ignoring Animation set on ");
                    sb2.append(fragment2);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                }
            } else if (!z) {
                operation2.addEffect(new AnimationEffect(animationInfo3));
            } else if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb3 = new StringBuilder("Ignoring Animation set on ");
                sb3.append(fragment2);
                sb3.append(" as Animations cannot run alongside Animators.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController defaultSpecialEffectsController, SpecialEffectsController.Operation operation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd2c03a", new Object[]{defaultSpecialEffectsController, operation});
            return;
        }
        ckf.g(defaultSpecialEffectsController, "this$0");
        ckf.g(operation, "$operation");
        defaultSpecialEffectsController.applyContainerChangesToOperation$fragment_release(operation);
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390542c2", new Object[]{this, map, view});
            return;
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(DefaultSpecialEffectsController defaultSpecialEffectsController, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController");
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a70585", new Object[]{this, arrayMap, collection});
            return;
        }
        Set<Map.Entry<String, View>> entrySet = arrayMap.entrySet();
        ckf.f(entrySet, pg1.ATOM_EXT_entries);
        d04.E(entrySet, new DefaultSpecialEffectsController$retainMatchingViews$1(collection));
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d06d0e2", new Object[]{this, list});
            return;
        }
        Fragment fragment = ((SpecialEffectsController.Operation) i04.l0(list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void collectEffects(List<? extends SpecialEffectsController.Operation> list, boolean z) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512c0ce4", new Object[]{this, list, new Boolean(z)});
            return;
        }
        ckf.g(list, "operations");
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj2;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = operation.getFragment().mView;
            ckf.f(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState == state && operation.getFinalState() != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj2;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation3.getFragment().mView;
            ckf.f(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 != state2 && operation3.getFinalState() == state2) {
                obj = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj;
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(operation2);
            Objects.toString(operation4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        syncAnimations(list);
        for (final SpecialEffectsController.Operation operation5 : list) {
            arrayList.add(new AnimationInfo(operation5, z));
            arrayList2.add(new TransitionInfo(operation5, z, !z ? operation5 == operation4 : operation5 == operation2));
            operation5.addCompletionListener(new Runnable() { // from class: tb.j67
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation5);
                }
            });
        }
        createTransitionEffect(arrayList2, z, operation2, operation4);
        collectAnimEffects(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03c9 A[LOOP:11: B:115:0x03c3->B:117:0x03c9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void createTransitionEffect(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r26, boolean r27, androidx.fragment.app.SpecialEffectsController.Operation r28, androidx.fragment.app.SpecialEffectsController.Operation r29) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.createTransitionEffect(java.util.List, boolean, androidx.fragment.app.SpecialEffectsController$Operation, androidx.fragment.app.SpecialEffectsController$Operation):void");
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class TransitionInfo extends SpecialEffectsInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            super(operation);
            Object obj;
            boolean z3;
            Object obj2;
            ckf.g(operation, "operation");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                if (z) {
                    obj = fragment.getReenterTransition();
                } else {
                    obj = fragment.getEnterTransition();
                }
            } else {
                Fragment fragment2 = operation.getFragment();
                if (z) {
                    obj = fragment2.getReturnTransition();
                } else {
                    obj = fragment2.getExitTransition();
                }
            }
            this.transition = obj;
            if (operation.getFinalState() != state) {
                z3 = true;
            } else if (z) {
                z3 = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                z3 = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = z3;
            if (!z2) {
                obj2 = null;
            } else if (z) {
                obj2 = operation.getFragment().getSharedElementReturnTransition();
            } else {
                obj2 = operation.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = obj2;
        }

        public static /* synthetic */ Object ipc$super(TransitionInfo transitionInfo, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo");
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentTransitionImpl) ipChange.ipc$dispatch("e2d63f57", new Object[]{this});
            }
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        public final Object getSharedElementTransition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("595d3f5", new Object[]{this});
            }
            return this.sharedElementTransition;
        }

        public final Object getTransition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("bfb2f920", new Object[]{this});
            }
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("496c8b1d", new Object[]{this})).booleanValue();
            }
            if (this.sharedElementTransition != null) {
                return true;
            }
            return false;
        }

        public final boolean isOverlapAllowed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2f0c636", new Object[]{this})).booleanValue();
            }
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentTransitionImpl) ipChange.ipc$dispatch("8d81997b", new Object[]{this, obj});
            }
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
