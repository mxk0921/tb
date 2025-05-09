package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import tb.atq;
import tb.fo4;
import tb.ix0;
import tb.jx0;
import tb.lx0;
import tb.tp4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ShapeStroke implements tp4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f1850a;
    public final jx0 b;
    public final List<jx0> c;
    public final ix0 d;
    public final lx0 e;
    public final jx0 f;
    public final LineCapType g;
    public final LineJoinType h;
    public final float i;
    public final boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.f1851a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1851a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f1851a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1851a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1851a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, jx0 jx0Var, List<jx0> list, ix0 ix0Var, lx0 lx0Var, jx0 jx0Var2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f1850a = str;
        this.b = jx0Var;
        this.c = list;
        this.d = ix0Var;
        this.e = lx0Var;
        this.f = jx0Var2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // tb.tp4
    public fo4 a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new atq(lottieDrawable, aVar, this);
    }

    public LineCapType b() {
        return this.g;
    }

    public ix0 c() {
        return this.d;
    }

    public jx0 d() {
        return this.b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List<jx0> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.f1850a;
    }

    public lx0 i() {
        return this.e;
    }

    public jx0 j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
