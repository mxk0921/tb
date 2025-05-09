package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.fzf;
import tb.msn;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CommentBottomAnimateView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View currentView;
    private boolean mAnimating;
    private int mMaxWidth;
    private View previousView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/CommentBottomAnimateView$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            CommentBottomAnimateView.access$002(CommentBottomAnimateView.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8436a;
        public final /* synthetic */ msn b;
        public final /* synthetic */ fzf c;

        public b(int i, msn msnVar, fzf fzfVar) {
            this.f8436a = i;
            this.b = msnVar;
            this.c = fzfVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/CommentBottomAnimateView$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            CommentBottomAnimateView commentBottomAnimateView = CommentBottomAnimateView.this;
            commentBottomAnimateView.removeView(CommentBottomAnimateView.access$100(commentBottomAnimateView));
            if (CommentBottomAnimateView.access$100(CommentBottomAnimateView.this).getTag(this.f8436a) instanceof BaseItemViewHolder) {
                this.b.b((BaseItemViewHolder) CommentBottomAnimateView.access$100(CommentBottomAnimateView.this).getTag(this.f8436a), this.c);
            }
            CommentBottomAnimateView.access$002(CommentBottomAnimateView.this, false);
        }
    }

    static {
        t2o.a(295698689);
    }

    public CommentBottomAnimateView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$002(CommentBottomAnimateView commentBottomAnimateView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3dc11ae", new Object[]{commentBottomAnimateView, new Boolean(z)})).booleanValue();
        }
        commentBottomAnimateView.mAnimating = z;
        return z;
    }

    public static /* synthetic */ View access$100(CommentBottomAnimateView commentBottomAnimateView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("83f5e6ab", new Object[]{commentBottomAnimateView});
        }
        return commentBottomAnimateView.previousView;
    }

    private AnimatorSet getAnimatorSet(int i, msn msnVar, fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("cfb4794f", new Object[]{this, new Integer(i), msnVar, fzfVar});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new b(i, msnVar, fzfVar));
        return animatorSet;
    }

    public static /* synthetic */ Object ipc$super(CommentBottomAnimateView commentBottomAnimateView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/view/CommentBottomAnimateView");
    }

    public void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxWidth = i;
        }
    }

    public CommentBottomAnimateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommentBottomAnimateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CommentBottomAnimateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void doAnimation(int i, msn msnVar, fzf fzfVar, ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463dfa7b", new Object[]{this, new Integer(i), msnVar, fzfVar, ux9Var, tBLiveDataModel});
        } else if (!this.mAnimating) {
            this.mAnimating = true;
            BaseItemViewHolder a2 = msnVar.a(fzfVar, this, ux9Var);
            if (a2 == null || a2.itemView == null) {
                this.mAnimating = false;
                return;
            }
            if (a2 instanceof EveryBodySayLeftContentViewHolder) {
                ((EveryBodySayLeftContentViewHolder) a2).i0(this.mMaxWidth);
            }
            a2.b0(fzfVar, tBLiveDataModel);
            this.previousView = this.currentView;
            View view = a2.itemView;
            this.currentView = view;
            view.setTag(i, a2);
            this.currentView.setAlpha(1.0f);
            removeView(this.currentView);
            addView(this.currentView);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.currentView, "translationY", getMeasuredHeight(), 0.0f).setDuration(300L);
            View view2 = this.previousView;
            if (view2 != null) {
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f).setDuration(200L);
                AnimatorSet animatorSet = getAnimatorSet(i, msnVar, fzfVar);
                animatorSet.playTogether(duration, duration2);
                animatorSet.start();
                return;
            }
            duration.addListener(new a());
            duration.start();
        }
    }
}
