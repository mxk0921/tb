package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import androidx.fragment.app.SpecialEffectsController;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class DefaultSpecialEffectsController$TransitionEffect$onStart$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ Object $mergedTransition;
    public final /* synthetic */ Ref$ObjectRef<d1a<xhv>> $seekCancelLambda;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup $container;
        public final /* synthetic */ Object $mergedTransition;
        public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
            super(0);
            this.this$0 = transitionEffect;
            this.$mergedTransition = obj;
            this.$container = viewGroup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76e16deb", new Object[]{transitionEffect, viewGroup});
                return;
            }
            ckf.g(transitionEffect, "this$0");
            ckf.g(viewGroup, "$container");
            for (DefaultSpecialEffectsController.TransitionInfo transitionInfo : transitionEffect.getTransitionInfos()) {
                SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                View view = operation.getFragment().getView();
                if (view != null) {
                    operation.getFinalState().applyState(view, viewGroup);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f902ae", new Object[]{transitionEffect});
                return;
            }
            ckf.g(transitionEffect, "this$0");
            FragmentManager.isLoggingEnabled(2);
            for (DefaultSpecialEffectsController.TransitionInfo transitionInfo : transitionEffect.getTransitionInfos()) {
                transitionInfo.getOperation().completeEffect(transitionEffect);
            }
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$2");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            List<DefaultSpecialEffectsController.TransitionInfo> transitionInfos = this.this$0.getTransitionInfos();
            if (!(transitionInfos instanceof Collection) || !transitionInfos.isEmpty()) {
                for (DefaultSpecialEffectsController.TransitionInfo transitionInfo : transitionInfos) {
                    if (!transitionInfo.getOperation().isSeeking()) {
                        FragmentManager.isLoggingEnabled(2);
                        CancellationSignal cancellationSignal = new CancellationSignal();
                        FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                        Fragment fragment = this.this$0.getTransitionInfos().get(0).getOperation().getFragment();
                        Object obj = this.$mergedTransition;
                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                        transitionImpl.setListenerForTransitionEnd(fragment, obj, cancellationSignal, new Runnable() { // from class: tb.s67
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass2.invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect.this);
                            }
                        });
                        cancellationSignal.cancel();
                        return;
                    }
                }
            }
            FragmentManager.isLoggingEnabled(2);
            FragmentTransitionImpl transitionImpl2 = this.this$0.getTransitionImpl();
            Object controller = this.this$0.getController();
            ckf.d(controller);
            final DefaultSpecialEffectsController.TransitionEffect transitionEffect2 = this.this$0;
            final ViewGroup viewGroup = this.$container;
            transitionImpl2.animateToStart(controller, new Runnable() { // from class: tb.r67
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass2.invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect.this, viewGroup);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$TransitionEffect$onStart$4(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup, Object obj, Ref$ObjectRef<d1a<xhv>> ref$ObjectRef) {
        super(0);
        this.this$0 = transitionEffect;
        this.$container = viewGroup;
        this.$mergedTransition = obj;
        this.$seekCancelLambda = ref$ObjectRef;
    }

    public static /* synthetic */ Object ipc$super(DefaultSpecialEffectsController$TransitionEffect$onStart$4 defaultSpecialEffectsController$TransitionEffect$onStart$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(this.$container, this.$mergedTransition));
        if (this.this$0.getController() != null) {
            z = true;
        }
        Object obj = this.$mergedTransition;
        ViewGroup viewGroup = this.$container;
        if (z) {
            this.$seekCancelLambda.element = new AnonymousClass2(this.this$0, obj, viewGroup);
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Started executing operations from ");
                sb.append(this.this$0.getFirstOut());
                sb.append(" to ");
                sb.append(this.this$0.getLastIn());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
    }
}
