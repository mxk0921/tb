package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class StaticLayoutBuilderCompat {
    public static boolean j;
    public static Constructor<StaticLayout> k;
    public static Object l;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f5107a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean h;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public TextUtils.TruncateAt i = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f5107a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public static StaticLayoutBuilderCompat c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public StaticLayout a() throws StaticLayoutBuilderCompatException {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        TextPaint textPaint = this.b;
        if (this.f5107a == null) {
            this.f5107a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f5107a;
        if (this.f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.i);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.h) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.e);
            obtain.setIncludePad(this.g);
            if (this.h) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.i;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f);
            build = obtain.build();
            return build;
        }
        b();
        try {
            return (StaticLayout) ((Constructor) Preconditions.checkNotNull(k)).newInstance(charSequence, 0, Integer.valueOf(this.d), textPaint, Integer.valueOf(max), this.e, Preconditions.checkNotNull(l), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.g), null, Integer.valueOf(max), Integer.valueOf(this.f));
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    public final void b() throws StaticLayoutBuilderCompatException {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        if (!j) {
            try {
                if (!this.h || Build.VERSION.SDK_INT < 23) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                l = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                k = declaredConstructor;
                declaredConstructor.setAccessible(true);
                j = true;
            } catch (Exception e) {
                throw new StaticLayoutBuilderCompatException(e);
            }
        }
    }

    public StaticLayoutBuilderCompat d(Layout.Alignment alignment) {
        this.e = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat e(TextUtils.TruncateAt truncateAt) {
        this.i = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat f(boolean z) {
        this.g = z;
        return this;
    }

    public StaticLayoutBuilderCompat g(boolean z) {
        this.h = z;
        return this;
    }

    public StaticLayoutBuilderCompat h(int i) {
        this.f = i;
        return this;
    }
}
