package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import tb.akt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CornerRadiusTransition extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROPERTY_CORNER_RADIUS = "cornerRadius";
    private static final String[] TRANSITION_PROPERTIES = {"cornerRadius"};
    private float startCornerRadius = 100.0f;
    private float endCornerRadius = 0.0f;

    static {
        t2o.a(503316675);
    }

    public CornerRadiusTransition(float f, float f2) {
        setStartCornerRadius(f);
        setEndCornerRadius(f2);
    }

    public static /* synthetic */ Object ipc$super(CornerRadiusTransition cornerRadiusTransition, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/animation/shareelement/CornerRadiusTransition");
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b12f552", new Object[]{this, transitionValues});
            return;
        }
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("cornerRadius", Float.valueOf(this.endCornerRadius));
        }
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed1d56b", new Object[]{this, transitionValues});
            return;
        }
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("cornerRadius", Float.valueOf(this.startCornerRadius));
        }
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("50067a4a", new Object[]{this, viewGroup, transitionValues, transitionValues2});
        }
        ObjectAnimator objectAnimator = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        float floatValue = ((Float) transitionValues.values.get("cornerRadius")).floatValue();
        float floatValue2 = ((Float) transitionValues2.values.get("cornerRadius")).floatValue();
        View view = transitionValues2.view;
        if (view instanceof AbsPinchImageView) {
            AbsPinchImageView absPinchImageView = (AbsPinchImageView) view;
            objectAnimator = ObjectAnimator.ofFloat(absPinchImageView, "cornerRadius", floatValue, floatValue2);
            absPinchImageView.setCornerRadius(floatValue, floatValue2);
        } else if (view instanceof BaseTNodePhotoView) {
            ((BaseTNodePhotoView) view).setCornerRadius(floatValue, floatValue2);
        } else if ((view instanceof TNodeImageView) && akt.y()) {
            objectAnimator = ObjectAnimator.ofFloat((TNodeImageView) transitionValues2.view, "cornerRadius", floatValue, floatValue2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (objectAnimator != null) {
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e2d176f4", new Object[]{this});
        }
        return TRANSITION_PROPERTIES;
    }

    public void setEndCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ec0519", new Object[]{this, new Float(f)});
        } else {
            this.endCornerRadius = f;
        }
    }

    public void setStartCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69818ff2", new Object[]{this, new Float(f)});
        } else {
            this.startCornerRadius = f;
        }
    }
}
