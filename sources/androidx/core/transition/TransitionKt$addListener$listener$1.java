package androidx.core.transition;

import android.transition.Transition;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.ArtcParams;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Ltb/xhv;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = ArtcParams.SD180pVideoParams.HEIGHT)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<Transition, xhv> $onCancel;
    public final /* synthetic */ g1a<Transition, xhv> $onEnd;
    public final /* synthetic */ g1a<Transition, xhv> $onPause;
    public final /* synthetic */ g1a<Transition, xhv> $onResume;
    public final /* synthetic */ g1a<Transition, xhv> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(g1a<? super Transition, xhv> g1aVar, g1a<? super Transition, xhv> g1aVar2, g1a<? super Transition, xhv> g1aVar3, g1a<? super Transition, xhv> g1aVar4, g1a<? super Transition, xhv> g1aVar5) {
        this.$onEnd = g1aVar;
        this.$onResume = g1aVar2;
        this.$onPause = g1aVar3;
        this.$onCancel = g1aVar4;
        this.$onStart = g1aVar5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
        } else {
            this.$onCancel.invoke(transition);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f39e64", new Object[]{this, transition});
        } else {
            this.$onEnd.invoke(transition);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df73669", new Object[]{this, transition});
        } else {
            this.$onPause.invoke(transition);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d325edea", new Object[]{this, transition});
        } else {
            this.$onResume.invoke(transition);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffba07d", new Object[]{this, transition});
        } else {
            this.$onStart.invoke(transition);
        }
    }
}
