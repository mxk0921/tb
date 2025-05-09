package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import tb.fo4;
import tb.jx0;
import tb.tp4;
import tb.xx0;
import tb.y9m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PolystarShape implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f1849a;
    public final Type b;
    public final jx0 c;
    public final xx0<PointF, PointF> d;
    public final jx0 e;
    public final jx0 f;
    public final jx0 g;
    public final jx0 h;
    public final jx0 i;
    public final boolean j;
    public final boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, jx0 jx0Var, xx0<PointF, PointF> xx0Var, jx0 jx0Var2, jx0 jx0Var3, jx0 jx0Var4, jx0 jx0Var5, jx0 jx0Var6, boolean z, boolean z2) {
        this.f1849a = str;
        this.b = type;
        this.c = jx0Var;
        this.d = xx0Var;
        this.e = jx0Var2;
        this.f = jx0Var3;
        this.g = jx0Var4;
        this.h = jx0Var5;
        this.i = jx0Var6;
        this.j = z;
        this.k = z2;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new y9m(lottieDrawable, aVar, this);
    }

    public jx0 b() {
        return this.f;
    }

    public jx0 c() {
        return this.h;
    }

    public String d() {
        return this.f1849a;
    }

    public jx0 e() {
        return this.g;
    }

    public jx0 f() {
        return this.i;
    }

    public jx0 g() {
        return this.c;
    }

    public xx0<PointF, PointF> h() {
        return this.d;
    }

    public jx0 i() {
        return this.e;
    }

    public Type j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }
}
