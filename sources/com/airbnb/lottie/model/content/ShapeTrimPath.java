package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.a;
import tb.fo4;
import tb.jx0;
import tb.pgu;
import tb.tp4;
import tb.zhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ShapeTrimPath implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f1852a;
    public final Type b;
    public final jx0 c;
    public final jx0 d;
    public final jx0 e;
    public final boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            zhh.b("Unknown trim path type " + i);
            return null;
        }
    }

    public ShapeTrimPath(String str, Type type, jx0 jx0Var, jx0 jx0Var2, jx0 jx0Var3, boolean z) {
        this.f1852a = str;
        this.b = type;
        this.c = jx0Var;
        this.d = jx0Var2;
        this.e = jx0Var3;
        this.f = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, a aVar) {
        return new pgu(aVar, this);
    }

    public jx0 b() {
        return this.d;
    }

    public String c() {
        return this.f1852a;
    }

    public jx0 d() {
        return this.e;
    }

    public jx0 e() {
        return this.c;
    }

    public Type f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
