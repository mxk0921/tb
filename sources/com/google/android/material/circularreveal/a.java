package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a {

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.circularreveal.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0249a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f5060a;

        public C0249a(b bVar) {
            this.f5060a = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5060a.destroyCircularRevealCache();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5060a.buildCircularRevealCache();
        }
    }

    public static Animator a(b bVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(bVar, (Property<b, V>) b.c.CIRCULAR_REVEAL, (TypeEvaluator) b.C0250b.CIRCULAR_REVEAL, (Object[]) new b.e[]{new b.e(f, f2, f3)});
        b.e revealInfo = bVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) bVar, (int) f, (int) f2, revealInfo.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener b(b bVar) {
        return new C0249a(bVar);
    }
}
