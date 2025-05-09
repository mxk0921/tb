package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentAnim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private FragmentAnim() {
    }

    private static int getNextAnim(Fragment fragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b2375cc", new Object[]{fragment, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    public static AnimationOrAnimator loadAnimation(Context context, Fragment fragment, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationOrAnimator) ipChange.ipc$dispatch("9e855b38", new Object[]{context, fragment, new Boolean(z), new Boolean(z2)});
        }
        int nextTransition = fragment.getNextTransition();
        int nextAnim = getNextAnim(fragment, z, z2);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (onCreateAnimation != null) {
            return new AnimationOrAnimator(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (onCreateAnimator != null) {
            return new AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = transitToAnimResourceId(context, nextTransition, z);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new AnimationOrAnimator(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                if (loadAnimator != null) {
                    return new AnimationOrAnimator(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation2 != null) {
                        return new AnimationOrAnimator(loadAnimation2);
                    }
                } else {
                    throw e2;
                }
            }
        }
        return null;
    }

    private static int toActivityTransitResId(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e792ee07", new Object[]{context, new Integer(i)})).intValue();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int transitToAnimResourceId(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68365dfd", new Object[]{context, new Integer(i), new Boolean(z)})).intValue();
        }
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return toActivityTransitResId(context, 16842936);
                        }
                        return toActivityTransitResId(context, 16842937);
                    } else if (z) {
                        return R.animator.fragment_fade_enter;
                    } else {
                        return R.animator.fragment_fade_exit;
                    }
                } else if (z) {
                    return toActivityTransitResId(context, 16842938);
                } else {
                    return toActivityTransitResId(context, 16842939);
                }
            } else if (z) {
                return R.animator.fragment_close_enter;
            } else {
                return R.animator.fragment_close_exit;
            }
        } else if (z) {
            return R.animator.fragment_open_enter;
        } else {
            return R.animator.fragment_open_exit;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AnimationOrAnimator {
        public final Animation animation;
        public final AnimatorSet animator;

        public AnimationOrAnimator(Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public AnimationOrAnimator(Animator animator) {
            this.animation = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.animator = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mAnimating = true;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        public EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public static /* synthetic */ Object ipc$super(EndViewTransitionAnimation endViewTransitionAnimation, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 863615487) {
                return new Boolean(super.getTransformation(((Number) objArr[0]).longValue(), (Transformation) objArr[1], ((Number) objArr[2]).floatValue()));
            }
            if (hashCode == 1967520361) {
                return new Boolean(super.getTransformation(((Number) objArr[0]).longValue(), (Transformation) objArr[1]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/fragment/app/FragmentAnim$EndViewTransitionAnimation");
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7545fa69", new Object[]{this, new Long(j), transformation})).booleanValue();
            }
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.mEnded || !this.mAnimating) {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            } else {
                this.mAnimating = false;
                this.mParent.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3379b9ff", new Object[]{this, new Long(j), transformation, new Float(f)})).booleanValue();
            }
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }
    }
}
