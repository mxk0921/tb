package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.CircularRevealHelper;
import tb.lai;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface b extends CircularRevealHelper.a {

    /* compiled from: Taobao */
    /* renamed from: com.google.android.material.circularreveal.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class C0250b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> CIRCULAR_REVEAL = new C0250b();

        /* renamed from: a  reason: collision with root package name */
        public final e f5061a = new e();

        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            float d = lai.d(eVar.f5062a, eVar2.f5062a, f);
            float d2 = lai.d(eVar.b, eVar2.b, f);
            float d3 = lai.d(eVar.c, eVar2.c, f);
            e eVar3 = this.f5061a;
            eVar3.b(d, d2, d3);
            return eVar3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c extends Property<b, e> {
        public static final Property<b, e> CIRCULAR_REVEAL = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(b bVar) {
            return bVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(b bVar, e eVar) {
            bVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d extends Property<b, Integer> {
        public static final Property<b, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(b bVar) {
            return Integer.valueOf(bVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(b bVar, Integer num) {
            bVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class e {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public float f5062a;
        public float b;
        public float c;

        public boolean a() {
            if (this.c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        public void b(float f, float f2, float f3) {
            this.f5062a = f;
            this.b = f2;
            this.c = f3;
        }

        public void c(e eVar) {
            b(eVar.f5062a, eVar.b, eVar.c);
        }

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.f5062a = f;
            this.b = f2;
            this.c = f3;
        }

        public e(e eVar) {
            this(eVar.f5062a, eVar.b, eVar.c);
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
