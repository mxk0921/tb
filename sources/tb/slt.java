package tb;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureMode;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.core.p;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class slt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int A;
    public static Constructor y;
    public static final TextDirectionHeuristic z = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    public Canvas b;
    public Picture c;
    public TextComponent d;
    public boolean f;
    public float g;
    public boolean i;
    public boolean j;
    public Layout k;
    public CharSequence l;
    public float n;
    public TextUtils.TruncateAt o;
    public int p;
    public int q;
    public YogaMeasureMode r;
    public float s;
    public float t;
    public float u;
    public float v;
    public int w;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f28136a = true;
    public float h = 2.14748365E9f;
    public int m = Integer.MAX_VALUE;
    public boolean x = true;
    public TextPaint e = new TextPaint(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.slt$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1055a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1055a() {
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (slt.a(slt.this) == null) {
                } else {
                    if (slt.a(slt.this).getView() != 0) {
                        slt.a(slt.this).getView().invalidate();
                    } else if (slt.a(slt.this).getDrawable() != null) {
                        slt.a(slt.this).getDrawable()[1].invalidateSelf();
                    }
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Layout c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (slt.a(slt.this) != null && slt.b(slt.this) && (c = slt.c(slt.this)) != null) {
                if (slt.d(slt.this) == null) {
                    slt.e(slt.this, new Picture());
                }
                slt sltVar = slt.this;
                slt.g(sltVar, slt.d(sltVar).beginRecording(c.getWidth(), c.getHeight()));
                c.draw(slt.f(slt.this));
                slt.d(slt.this).endRecording();
                slt.h(slt.this, true);
                if (slt.a(slt.this).getView() != 0 || slt.a(slt.this).getDrawable() != null) {
                    nwv.y0(new RunnableC1055a());
                }
            }
        }
    }

    static {
        int i;
        t2o.a(503317226);
        if (Build.VERSION.SDK_INT < 23) {
            i = 0;
        } else {
            i = 1;
        }
        A = i;
    }

    public slt() {
    }

    public static /* synthetic */ TextComponent a(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextComponent) ipChange.ipc$dispatch("785be297", new Object[]{sltVar});
        }
        return sltVar.d;
    }

    public static /* synthetic */ boolean b(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22bc68be", new Object[]{sltVar})).booleanValue();
        }
        return sltVar.f28136a;
    }

    public static /* synthetic */ Layout c(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("e520e860", new Object[]{sltVar});
        }
        return sltVar.k;
    }

    public static /* synthetic */ Picture d(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Picture) ipChange.ipc$dispatch("d3c9f38f", new Object[]{sltVar});
        }
        return sltVar.c;
    }

    public static /* synthetic */ Picture e(slt sltVar, Picture picture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Picture) ipChange.ipc$dispatch("f0e37138", new Object[]{sltVar, picture});
        }
        sltVar.c = picture;
        return picture;
    }

    public static /* synthetic */ Canvas f(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Canvas) ipChange.ipc$dispatch("1fca6b52", new Object[]{sltVar});
        }
        return sltVar.b;
    }

    public static /* synthetic */ Canvas g(slt sltVar, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Canvas) ipChange.ipc$dispatch("1714529b", new Object[]{sltVar, canvas});
        }
        sltVar.b = canvas;
        return canvas;
    }

    public static /* synthetic */ boolean h(slt sltVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afbcf618", new Object[]{sltVar, new Boolean(z2)})).booleanValue();
        }
        sltVar.j = z2;
        return z2;
    }

    public static StaticLayout k(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z2, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        try {
            if (y == null) {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                y = constructor;
                constructor.setAccessible(true);
            }
            return (StaticLayout) y.newInstance(charSequence, 0, Integer.valueOf(charSequence.length()), textPaint, Integer.valueOf(i), alignment, z, Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z2), truncateAt, Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        }
    }

    public static int n(String str, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e207fc", new Object[]{str, new Character(c)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        TextPaint textPaint = this.e;
        if (textPaint != null) {
            return textPaint.getColor();
        }
        return 1;
    }

    public Layout B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("b8322a99", new Object[]{this});
        }
        return this.k;
    }

    public float C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return this.e.getTextSize();
    }

    public TextUtils.TruncateAt D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("5037f42c", new Object[]{this});
        }
        return this.o;
    }

    public Typeface E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        return this.e.getTypeface();
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.k.getWidth();
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbe7076", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (this.e.getAlpha() != i) {
            this.e.setAlpha(i);
        }
    }

    public void J(TextUtils.TruncateAt truncateAt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a27974", new Object[]{this, truncateAt});
        } else {
            this.o = truncateAt;
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8932e2", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void L(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3b5db1", new Object[]{this, new Boolean(z2)});
        } else {
            this.x = z2;
        }
    }

    public void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f47f8f", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public void O(YogaMeasureMode yogaMeasureMode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790837ca", new Object[]{this, yogaMeasureMode, new Float(f)});
            return;
        }
        this.r = yogaMeasureMode;
        this.s = f;
    }

    public void P(float f, float f2, float f3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7174ff99", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Integer(i)});
            return;
        }
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.e.setShadowLayer(f, f2, f3, i);
    }

    public void Q(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.l = charSequence;
        if (this.f) {
            float f = this.g;
            while (true) {
                if (f > this.h) {
                    break;
                }
                float textSize = this.e.getTextSize();
                this.e.setTextSize(f);
                Layout layout = this.k;
                H();
                if (this.m == Integer.MAX_VALUE || this.k.getLineCount() <= this.m) {
                    if (this.k.getHeight() <= this.q) {
                        Layout layout2 = this.k;
                        if (layout2.getEllipsisCount(layout2.getLineCount() - 1) <= 0) {
                            f += 1.0f;
                        } else if (layout != null) {
                            this.k = layout;
                            this.e.setTextSize(textSize);
                        }
                    } else if (layout != null) {
                        this.k = layout;
                        this.e.setTextSize(textSize);
                    }
                } else if (layout != null) {
                    this.k = layout;
                    this.e.setTextSize(textSize);
                }
            }
        } else {
            H();
        }
        i();
    }

    public void R(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71780586", new Object[]{this, new Integer(i)});
        } else if (this.w != i) {
            this.w = i;
        }
    }

    public void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else if (this.e.getColor() != i) {
            this.e.setColor(i);
        }
    }

    public void U(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
        } else {
            this.e.setTextSize(f);
        }
    }

    public void V(boolean z2, float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ffade0", new Object[]{this, new Boolean(z2), new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        this.f = z2;
        if (z2 && (i <= 0 || i2 <= 0)) {
            this.f = false;
        }
        this.g = f;
        this.h = f2;
        this.p = i;
        this.q = i2;
        if (!z2) {
            U(f2);
        }
    }

    public void W(Typeface typeface, int i) {
        int i2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
            return;
        }
        if (typeface == null) {
            typeface = Typeface.defaultFromStyle(i);
        }
        if (this.e.getTypeface() != typeface) {
            this.e.setTypeface(typeface);
        }
        float f = 0.0f;
        if (i > 0) {
            if (typeface != null) {
                i2 = typeface.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (~i2) & i;
            TextPaint textPaint = this.e;
            if ((i3 & 1) != 0) {
                z2 = true;
            }
            textPaint.setFakeBoldText(z2);
            TextPaint textPaint2 = this.e;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.e.setFakeBoldText(false);
        this.e.setTextSkewX(0.0f);
    }

    public final void i() {
        TextComponent textComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b8e086", new Object[]{this});
        } else if (akt.c2() && this.k != null && (textComponent = this.d) != null && Build.VERSION.SDK_INT >= 23 && ((ymt) textComponent.getViewParams()).R0) {
            this.i = true;
            this.j = false;
            p.f().g().f(new a());
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f28136a = false;
        this.k = null;
        this.c = null;
        this.e = null;
        this.d = null;
    }

    public final Layout.Alignment l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("1273647e", new Object[]{this});
        }
        int i = this.w;
        if (i == 17) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i == 8388611) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i != 8388613) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public void m(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Picture picture = this.c;
        if (picture == null || !this.j) {
            Layout layout = this.k;
            if (layout != null) {
                layout.draw(canvas);
                return;
            }
            return;
        }
        picture.draw(canvas);
    }

    public ReplacementSpan o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplacementSpan) ipChange.ipc$dispatch("a4ce9fe0", new Object[]{this});
        }
        CharSequence charSequence = this.l;
        if (charSequence instanceof db8) {
            return ((db8) charSequence).b();
        }
        return null;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.k.getHeight();
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7b394bf", new Object[]{this})).intValue();
        }
        Layout layout = this.k;
        if (layout != null) {
            return Math.min(this.m, layout.getLineCount());
        }
        return 1;
    }

    public float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87b96af5", new Object[]{this})).floatValue();
        }
        return this.s;
    }

    public YogaMeasureMode s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureMode) ipChange.ipc$dispatch("7245a92c", new Object[]{this});
        }
        return this.r;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        if (this.e.getAlpha() < 255) {
            return -3;
        }
        return -1;
    }

    public Picture u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Picture) ipChange.ipc$dispatch("4ce8b4dc", new Object[]{this});
        }
        if (this.j) {
            return this.c;
        }
        return null;
    }

    public float v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5517a9c6", new Object[]{this})).floatValue();
        }
        return this.u;
    }

    public float w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5525c147", new Object[]{this})).floatValue();
        }
        return this.v;
    }

    public float x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30140544", new Object[]{this})).floatValue();
        }
        return this.t;
    }

    public CharSequence y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        return this.l;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10ed7ffa", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fa4c10", new Object[]{this, str});
        } else if (str == null) {
            this.e.setUnderlineText(false);
            this.e.setStrikeThruText(false);
        } else if (str.equals(pg1.ATOM_EXT_UDL_line_through)) {
            this.e.setStrikeThruText(true);
        } else if (str.equals(pg1.ATOM_EXT_underline)) {
            this.e.setUnderlineText(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.slt.H():void");
    }

    public slt(TextComponent textComponent) {
        this.d = textComponent;
    }
}
