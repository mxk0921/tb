package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewPropertyAnimatorCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<View> mView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static ViewPropertyAnimator translationZ(ViewPropertyAnimator viewPropertyAnimator, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPropertyAnimator) ipChange.ipc$dispatch("6d55e40", new Object[]{viewPropertyAnimator, new Float(f)});
            }
            return viewPropertyAnimator.translationZ(f);
        }

        public static ViewPropertyAnimator translationZBy(ViewPropertyAnimator viewPropertyAnimator, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPropertyAnimator) ipChange.ipc$dispatch("5fe647b7", new Object[]{viewPropertyAnimator, new Float(f)});
            }
            return viewPropertyAnimator.translationZBy(f);
        }

        public static ViewPropertyAnimator z(ViewPropertyAnimator viewPropertyAnimator, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPropertyAnimator) ipChange.ipc$dispatch("c39989b1", new Object[]{viewPropertyAnimator, new Float(f)});
            }
            return viewPropertyAnimator.z(f);
        }

        public static ViewPropertyAnimator zBy(ViewPropertyAnimator viewPropertyAnimator, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPropertyAnimator) ipChange.ipc$dispatch("fc4d5ae8", new Object[]{viewPropertyAnimator, new Float(f)});
            }
            return viewPropertyAnimator.zBy(f);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference<>(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUpdateListener$0(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95008050", new Object[]{viewPropertyAnimatorUpdateListener, view, valueAnimator});
        } else {
            viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
        }
    }

    private void setListenerInternal(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6ba6f4", new Object[]{this, view, viewPropertyAnimatorListener});
        } else if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/ViewPropertyAnimatorCompat$1");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        viewPropertyAnimatorListener.onAnimationCancel(view);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        viewPropertyAnimatorListener.onAnimationEnd(view);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    } else {
                        viewPropertyAnimatorListener.onAnimationStart(view);
                    }
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public ViewPropertyAnimatorCompat alpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("409bab09", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat alphaBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("bbbe74b2", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator getInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("bf078b59", new Object[]{this});
        }
        View view = this.mView.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd70bb32", new Object[]{this})).longValue();
        }
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public ViewPropertyAnimatorCompat rotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("97eed8e9", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("8afdaa92", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("79584a4d", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationXBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("b7d052f6", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("a730e4ac", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat rotationYBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("d1ebd195", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("b12d3619", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleXBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("4e197bc2", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("df05d078", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat scaleYBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("6834fa61", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("79fd8d55", new Object[]{this, new Long(j)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("b70b24e3", new Object[]{this, interpolator});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("e6827edd", new Object[]{this, viewPropertyAnimatorListener});
        }
        View view = this.mView.get();
        if (view != null) {
            setListenerInternal(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setStartDelay(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("5676a408", new Object[]{this, new Long(j)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat setUpdateListener(final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("5c38fd8b", new Object[]{this, viewPropertyAnimatorUpdateListener});
        }
        final View view = this.mView.get();
        if (view != null) {
            if (viewPropertyAnimatorUpdateListener != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: tb.ofw
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewPropertyAnimatorCompat.lambda$setUpdateListener$0(ViewPropertyAnimatorUpdateListener.this, view, valueAnimator);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat translationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("441f0a00", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationXBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("ebe5f1e9", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("71f7a45f", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationYBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("6017088", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("9fd03ebe", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZ(view.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat translationZBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("201cef27", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.translationZBy(view.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withEndAction(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("8e80d61e", new Object[]{this, runnable});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("f0db8c80", new Object[]{this});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public ViewPropertyAnimatorCompat withStartAction(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("212b18a5", new Object[]{this, runnable});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat x(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("ae08a9af", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat xBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("81e661d8", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat y(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("dbe1440e", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat yBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("9c01e077", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("9b9de6d", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.z(view.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat zBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPropertyAnimatorCompat) ipChange.ipc$dispatch("b61d5f16", new Object[]{this, new Float(f)});
        }
        View view = this.mView.get();
        if (view != null) {
            Api21Impl.zBy(view.animate(), f);
        }
        return this;
    }
}
