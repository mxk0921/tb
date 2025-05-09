package com.taobao.android.weex_uikit.widget.text;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.collection.LruCache;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TextLayoutBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;
    public static final int MEASURE_MODE_AT_MOST = 2;
    public static final int MEASURE_MODE_EXACTLY = 1;
    public static final int MEASURE_MODE_UNSPECIFIED = 0;
    public static final LruCache<Integer, Layout> sCache = new LruCache<>(100);

    /* renamed from: a  reason: collision with root package name */
    public int f10028a = 0;
    public int b = 2;
    public int c = Integer.MAX_VALUE;
    public int d = 2;
    public final a e = new a();
    public Layout f = null;
    public boolean g = true;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface MeasureMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float b;
        public float c;
        public float d;
        public int e;
        public int f;
        public int g;
        public CharSequence h;

        /* renamed from: a  reason: collision with root package name */
        public TextPaint f10029a = new TextPaint(1);
        public float i = 1.0f;
        public float j = 0.0f;
        public final float k = Float.MAX_VALUE;
        public boolean l = true;
        public TextUtils.TruncateAt m = null;
        public boolean n = false;
        public int o = Integer.MAX_VALUE;
        public Layout.Alignment p = Layout.Alignment.ALIGN_NORMAL;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public TextDirectionHeuristicCompat q = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;

        static {
            t2o.a(986710267);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95218b93", new Object[]{this});
            } else if (this.u) {
                TextPaint textPaint = new TextPaint(this.f10029a);
                textPaint.set(this.f10029a);
                this.f10029a = textPaint;
                this.u = false;
            }
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e80b222b", new Object[]{this})).intValue();
            }
            return Math.round((this.f10029a.getFontMetricsInt(null) * this.i) + this.j);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int color = (((this.f10029a.getColor() + 31) * 31) + Float.floatToIntBits(this.f10029a.getTextSize())) * 31;
            if (this.f10029a.getTypeface() != null) {
                i = this.f10029a.getTypeface().hashCode();
            } else {
                i = 0;
            }
            TextPaint textPaint = this.f10029a;
            int floatToIntBits = (((((((((((((((((((((((((((color + i) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e) * 31) + textPaint.linkColor) * 31) + Float.floatToIntBits(textPaint.density)) * 31) + Arrays.hashCode(this.f10029a.drawableState)) * 31) + this.f) * 31) + this.g) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + (this.l ? 1 : 0)) * 31;
            TextUtils.TruncateAt truncateAt = this.m;
            if (truncateAt != null) {
                i2 = truncateAt.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((((floatToIntBits + i2) * 31) + (this.n ? 1 : 0)) * 31) + this.o) * 31;
            Layout.Alignment alignment = this.p;
            if (alignment != null) {
                i3 = alignment.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = this.q;
            if (textDirectionHeuristicCompat != null) {
                i4 = textDirectionHeuristicCompat.hashCode();
            } else {
                i4 = 0;
            }
            int hashCode = (((((((((i7 + i4) * 31) + this.r) * 31) + this.s) * 31) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
            CharSequence charSequence = this.h;
            if (charSequence != null) {
                i5 = charSequence.hashCode();
            }
            return hashCode + i5;
        }
    }

    static {
        t2o.a(986710265);
    }

    public TextLayoutBuilder A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("4acd3b96", new Object[]{this, new Integer(i)});
        }
        return B(Typeface.defaultFromStyle(i));
    }

    public TextLayoutBuilder B(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("a987aca2", new Object[]{this, typeface});
        }
        if (this.e.f10029a.getTypeface() != typeface) {
            this.e.a();
            this.e.f10029a.setTypeface(typeface);
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder C(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("d75c1467", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        a aVar = this.e;
        if (!(aVar.f == i && aVar.g == i2)) {
            aVar.f = i;
            aVar.g = i2;
            this.f = null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128 A[EXC_TOP_SPLITTER, LOOP:0: B:77:0x0128->B:75:0x0188, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.Layout a() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.text.TextLayoutBuilder.a():android.text.Layout");
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e451a67e", new Object[]{this})).floatValue();
        }
        return this.e.f10029a.getLetterSpacing();
    }

    public TextLayoutBuilder c(Layout.Alignment alignment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("db6e06ca", new Object[]{this, alignment});
        }
        a aVar = this.e;
        if (aVar.p != alignment) {
            aVar.p = alignment;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("2e2a748", new Object[]{this, new Integer(i)});
        }
        a aVar = this.e;
        if (aVar.r != i) {
            aVar.r = i;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("e23afb6f", new Object[]{this, new Float(f)});
        }
        a aVar = this.e;
        if (aVar.f10029a.density != f) {
            aVar.a();
            this.e.f10029a.density = f;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder f(TextUtils.TruncateAt truncateAt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("161db7b0", new Object[]{this, truncateAt});
        }
        a aVar = this.e;
        if (aVar.m != truncateAt) {
            aVar.m = truncateAt;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("8a69f9dd", new Object[]{this, new Integer(i)});
        }
        a aVar = this.e;
        if (aVar.s != i) {
            aVar.s = i;
            if (Build.VERSION.SDK_INT >= 23) {
                this.f = null;
            }
        }
        return this;
    }

    public TextLayoutBuilder h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("c6afda6d", new Object[]{this, new Boolean(z)});
        }
        a aVar = this.e;
        if (aVar.l != z) {
            aVar.l = z;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("416f3485", new Object[]{this, new Integer(i)});
        }
        a aVar = this.e;
        if (aVar.t != i) {
            aVar.t = i;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f = null;
            }
        }
        return this;
    }

    public TextLayoutBuilder j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("ad20583a", new Object[]{this, new Float(f)});
        }
        if (b() != f) {
            this.e.a();
            this.e.f10029a.setLetterSpacing(f);
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("417b6531", new Object[]{this, new Integer(i)});
        }
        a aVar = this.e;
        if (aVar.f10029a.linkColor != i) {
            aVar.a();
            this.e.f10029a.linkColor = i;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("c4645aef", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        this.d = 1;
        return this;
    }

    public TextLayoutBuilder m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("2805d2bb", new Object[]{this, new Integer(i)});
        }
        a aVar = this.e;
        if (aVar.o != i) {
            aVar.o = i;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("cda984d4", new Object[]{this, new Integer(i)});
        }
        this.c = i;
        this.d = 2;
        return this;
    }

    public TextLayoutBuilder o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("1e37c4dd", new Object[]{this, new Integer(i)});
        }
        this.f10028a = i;
        this.b = 1;
        return this;
    }

    public TextLayoutBuilder p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("4a2b42", new Object[]{this, new Integer(i)});
        }
        this.f10028a = i;
        this.b = 2;
        return this;
    }

    public TextLayoutBuilder q(float f, float f2, float f3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("9df37055", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Integer(i)});
        }
        this.e.a();
        a aVar = this.e;
        aVar.d = f;
        aVar.b = f2;
        aVar.c = f3;
        aVar.e = i;
        aVar.f10029a.setShadowLayer(f, f2, f3, i);
        this.f = null;
        return this;
    }

    public TextLayoutBuilder r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("7d704772", new Object[]{this, new Boolean(z)});
        }
        this.g = z;
        return this;
    }

    public TextLayoutBuilder s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("83916b4b", new Object[]{this, new Boolean(z)});
        }
        a aVar = this.e;
        if (aVar.n != z) {
            aVar.n = z;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder t(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("78c41d96", new Object[]{this, charSequence});
        }
        if (charSequence == this.e.h) {
            return this;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            try {
                charSequence.hashCode();
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e);
            }
        }
        if (charSequence != null && charSequence.equals(this.e.h)) {
            return this;
        }
        this.e.h = charSequence;
        this.f = null;
        return this;
    }

    public TextLayoutBuilder u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("c47f024", new Object[]{this, new Integer(i)});
        }
        this.e.a();
        a aVar = this.e;
        aVar.getClass();
        aVar.f10029a.setColor(i);
        this.f = null;
        return this;
    }

    public TextLayoutBuilder v(ColorStateList colorStateList) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("9ec6f835", new Object[]{this, colorStateList});
        }
        this.e.a();
        a aVar = this.e;
        aVar.getClass();
        TextPaint textPaint = aVar.f10029a;
        if (colorStateList != null) {
            i = colorStateList.getDefaultColor();
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        this.f = null;
        return this;
    }

    public TextLayoutBuilder w(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("189cd154", new Object[]{this, textDirectionHeuristicCompat});
        }
        a aVar = this.e;
        if (aVar.q != textDirectionHeuristicCompat) {
            aVar.q = textDirectionHeuristicCompat;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("f2b08248", new Object[]{this, new Integer(i)});
        }
        float f = i;
        if (this.e.f10029a.getTextSize() != f) {
            this.e.a();
            this.e.f10029a.setTextSize(f);
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder y(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("f5445479", new Object[]{this, new Float(f)});
        }
        a aVar = this.e;
        if (aVar.k == Float.MAX_VALUE && aVar.j != f) {
            aVar.j = f;
            this.f = null;
        }
        return this;
    }

    public TextLayoutBuilder z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextLayoutBuilder) ipChange.ipc$dispatch("b7861600", new Object[]{this, new Float(f)});
        }
        a aVar = this.e;
        if (aVar.k == Float.MAX_VALUE && aVar.i != f) {
            aVar.i = f;
            this.f = null;
        }
        return this;
    }
}
