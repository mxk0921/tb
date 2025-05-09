package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;
import tb.i1j;
import tb.tz0;
import tb.uz0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5093a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    public final uz0 d;
    public i1j e;
    public i1j f;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, uz0 uz0Var) {
        this.b = extendedFloatingActionButton;
        this.f5093a = extendedFloatingActionButton.getContext();
        this.d = uz0Var;
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void c() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public AnimatorSet d() {
        return g(h());
    }

    public final void f(Animator.AnimatorListener animatorListener) {
        this.c.add(animatorListener);
    }

    public AnimatorSet g(i1j i1jVar) {
        ArrayList arrayList = new ArrayList();
        boolean j = i1jVar.j("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (j) {
            arrayList.add(i1jVar.f("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (i1jVar.j("scale")) {
            arrayList.add(i1jVar.f("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(i1jVar.f("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (i1jVar.j("width")) {
            arrayList.add(i1jVar.f("width", extendedFloatingActionButton, ExtendedFloatingActionButton.WIDTH));
        }
        if (i1jVar.j("height")) {
            arrayList.add(i1jVar.f("height", extendedFloatingActionButton, ExtendedFloatingActionButton.HEIGHT));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        tz0.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final i1j h() {
        i1j i1jVar = this.f;
        if (i1jVar != null) {
            return i1jVar;
        }
        if (this.e == null) {
            this.e = i1j.d(this.f5093a, b());
        }
        return (i1j) Preconditions.checkNotNull(this.e);
    }

    public final List<Animator.AnimatorListener> i() {
        return this.c;
    }

    public i1j j() {
        return this.f;
    }

    public final void k(Animator.AnimatorListener animatorListener) {
        this.c.remove(animatorListener);
    }

    public final void l(i1j i1jVar) {
        this.f = i1jVar;
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void onAnimationEnd() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void onAnimationStart(Animator animator) {
        this.d.c(animator);
    }
}
