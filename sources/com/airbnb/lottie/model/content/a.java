package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;
import tb.fo4;
import tb.jx0;
import tb.kx0;
import tb.lx0;
import tb.ox0;
import tb.tp4;
import tb.uia;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f1853a;
    public final GradientType b;
    public final kx0 c;
    public final lx0 d;
    public final ox0 e;
    public final ox0 f;
    public final jx0 g;
    public final ShapeStroke.LineCapType h;
    public final ShapeStroke.LineJoinType i;
    public final float j;
    public final List<jx0> k;
    public final jx0 l;
    public final boolean m;

    public a(String str, GradientType gradientType, kx0 kx0Var, lx0 lx0Var, ox0 ox0Var, ox0 ox0Var2, jx0 jx0Var, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<jx0> list, jx0 jx0Var2, boolean z) {
        this.f1853a = str;
        this.b = gradientType;
        this.c = kx0Var;
        this.d = lx0Var;
        this.e = ox0Var;
        this.f = ox0Var2;
        this.g = jx0Var;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f;
        this.k = list;
        this.l = jx0Var2;
        this.m = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new uia(lottieDrawable, aVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.h;
    }

    public jx0 c() {
        return this.l;
    }

    public ox0 d() {
        return this.f;
    }

    public kx0 e() {
        return this.c;
    }

    public GradientType f() {
        return this.b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.i;
    }

    public List<jx0> h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.f1853a;
    }

    public lx0 k() {
        return this.d;
    }

    public ox0 l() {
        return this.e;
    }

    public jx0 m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}
