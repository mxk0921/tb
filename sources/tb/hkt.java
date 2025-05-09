package tb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.core.content.res.ResourcesCompat;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class hkt {

    /* renamed from: a  reason: collision with root package name */
    public final float f20710a;
    public final ColorStateList b;
    public final int c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public boolean k = false;
    public Typeface l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ResourcesCompat.FontCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikt f20711a;

        public a(ikt iktVar) {
            this.f20711a = iktVar;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i) {
            hkt.this.k = true;
            this.f20711a.a(i);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(Typeface typeface) {
            hkt hktVar = hkt.this;
            hktVar.l = Typeface.create(typeface, hktVar.c);
            hktVar.k = true;
            this.f20711a.b(hktVar.l, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends ikt {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextPaint f20712a;
        public final /* synthetic */ ikt b;

        public b(TextPaint textPaint, ikt iktVar) {
            this.f20712a = textPaint;
            this.b = iktVar;
        }

        @Override // tb.ikt
        public void a(int i) {
            this.b.a(i);
        }

        @Override // tb.ikt
        public void b(Typeface typeface, boolean z) {
            hkt.this.j(this.f20712a, typeface);
            this.b.b(typeface, z);
        }
    }

    public hkt(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.TextAppearance);
        this.f20710a = obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.b = u9i.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
        u9i.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        u9i.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int e = u9i.e(obtainStyledAttributes, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
        this.j = obtainStyledAttributes.getResourceId(e, 0);
        this.e = obtainStyledAttributes.getString(e);
        obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f = u9i.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.g = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.h = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.i = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void d() {
        String str;
        Typeface typeface = this.l;
        int i = this.c;
        if (typeface == null && (str = this.e) != null) {
            this.l = Typeface.create(str, i);
        }
        if (this.l == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.l = Typeface.SERIF;
            } else if (i2 != 3) {
                this.l = Typeface.DEFAULT;
            } else {
                this.l = Typeface.MONOSPACE;
            }
            this.l = Typeface.create(this.l, i);
        }
    }

    public Typeface e() {
        d();
        return this.l;
    }

    public void f(Context context, TextPaint textPaint, ikt iktVar) {
        j(textPaint, e());
        g(context, new b(textPaint, iktVar));
    }

    public void g(Context context, ikt iktVar) {
        d();
        int i = this.j;
        if (i == 0) {
            this.k = true;
        }
        if (this.k) {
            iktVar.b(this.l, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i, new a(iktVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            iktVar.a(1);
        } catch (Exception unused2) {
            this.k = true;
            iktVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, ikt iktVar) {
        int i;
        int i2;
        i(context, textPaint, iktVar);
        ColorStateList colorStateList = this.b;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        ColorStateList colorStateList2 = this.f;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(this.i, this.g, this.h, i2);
    }

    public void i(Context context, TextPaint textPaint, ikt iktVar) {
        f(context, textPaint, iktVar);
    }

    public void j(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f20710a);
    }
}
