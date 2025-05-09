package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.richtext.node.RichText;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class meo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CharSequence DEFAULT_ELLIPSIS_TEXT = "…";
    public int A;
    public float B;
    public float C;
    public float E;
    public int I;
    public int J;
    public int K;
    public int L;
    public float N;
    public boolean O;
    public RichText V;
    public boolean W;
    public int X;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public Context f23992a;
    public RichText b;
    public Layout c;
    public float d;
    public float e;
    public CharSequence f;
    public TextPaint g;
    public Paint h;
    public TextUtils.TruncateAt i;
    public Layout.Alignment j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int r;
    public CharSequence s;
    public String x;
    public int z;
    public float q = -1.0f;
    public int t = 32;
    public int u = -16777216;
    public boolean v = false;
    public boolean w = false;
    public int y = 0;
    public int D = 0;
    public int F = Integer.MAX_VALUE;
    public int G = Integer.MAX_VALUE;
    public int H = 1;
    public float M = -1.0f;
    public CharSequence P = DEFAULT_ELLIPSIS_TEXT;
    public float Q = 0.0f;
    public boolean R = true;
    public boolean S = false;
    public boolean T = false;
    public int U = 0;
    public int Y = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TextUtils.EllipsizeCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f23993a;
        public final /* synthetic */ CharSequence b;

        public a(meo meoVar, int[] iArr, CharSequence charSequence) {
            this.f23993a = iArr;
            this.b = charSequence;
        }

        @Override // android.text.TextUtils.EllipsizeCallback
        public void ellipsized(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1637c15e", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i == i2 && i == 0) {
                this.f23993a[0] = this.b.length();
            } else {
                this.f23993a[0] = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f23994a;
        public final int b;

        static {
            t2o.a(444597212);
        }

        public b(int i, int i2) {
            this.f23994a = i;
            this.b = i2;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.f23994a;
        }
    }

    public static void d(Spanned spanned, int i, int i2, Class cls, Spannable spannable, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d65206", new Object[]{spanned, new Integer(i), new Integer(i2), cls, spannable, new Integer(i3)});
            return;
        }
        if (cls == null) {
            cls = Object.class;
        }
        Object[] spans = spanned.getSpans(i, i2, cls);
        for (int i4 = 0; i4 < spans.length; i4++) {
            int spanStart = spanned.getSpanStart(spans[i4]);
            int spanEnd = spanned.getSpanEnd(spans[i4]);
            int spanFlags = spanned.getSpanFlags(spans[i4]);
            if (spanStart < i) {
                spanStart = i;
            }
            if (spanEnd > i2) {
                spanEnd = i2;
            }
            int spanStart2 = spannable.getSpanStart(spans[i4]);
            int spanEnd2 = spannable.getSpanEnd(spans[i4]);
            int i5 = (spanStart - i) + i3;
            int i6 = (spanEnd - i) + i3;
            if (spanStart2 >= 0) {
                i5 = Math.min(spanStart2, i5);
            }
            if (spanEnd2 >= 0) {
                i6 = Math.max(spanEnd2, i6);
            }
            spannable.setSpan(spans[i4], i5, i6, spanFlags);
        }
    }

    public b A(int i, int i2) {
        int i3;
        boolean z;
        RichText richText;
        RichText richText2;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3b4cf3bb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        u();
        CharSequence charSequence = this.s;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = View.MeasureSpec.getSize(i);
            if (charSequence != null) {
                i3 = Math.min(Math.min(((int) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.g))) + m() + n() + (this.y * 2), i3), this.F);
            }
        }
        if (i3 != 0 && this.I == 4 && !TextUtils.isEmpty(charSequence)) {
            t(i3, charSequence);
        } else if (i3 != 0 && !TextUtils.isEmpty(charSequence)) {
            int m = ((i3 - m()) - n()) - (this.y * 2);
            if (this.f == null || this.b.renderText().equals(charSequence)) {
                z = false;
            } else {
                z = true;
            }
            Layout layout = this.c;
            if (layout == null) {
                this.c = z(m, charSequence, true);
            } else if (layout.getWidth() > m || z || this.S) {
                this.c = z(m, charSequence, true);
                this.S = false;
            } else if (this.c.getWidth() < m) {
                this.c.increaseWidthTo(i3);
            }
            this.Y = this.c.getLineCount();
            if (this.Z > 0) {
                charSequence = SpannableStringBuilder.valueOf(b(charSequence, Math.min(this.H, this.c.getLineCount())));
                this.c = z(m, charSequence, false);
            } else if (this.c.getLineCount() > this.H || (this.W && this.c.getLineCount() > this.X)) {
                if (this.T && (richText = this.V) != null) {
                    int length = richText.originText().length();
                    O(2);
                    if ((this.W && this.c.getLineCount() > this.X) || this.c.getLineEnd(this.H - 1) >= length) {
                        charSequence = this.s.subSequence(0, length);
                        this.c = z(m, charSequence, false);
                    }
                }
                int lineCount = this.c.getLineCount();
                int i5 = this.H;
                if (lineCount > i5) {
                    charSequence = SpannableStringBuilder.valueOf(b(charSequence, i5));
                    this.c = z(m, charSequence, false);
                }
            } else {
                CharSequence charSequence2 = this.f;
                if (charSequence2 != null) {
                    charSequence = charSequence2;
                }
                if (this.T && (richText2 = this.V) != null) {
                    if (this.c.getLineForOffset(richText2.originText().length()) != this.c.getLineForOffset(this.b.originText().length())) {
                        charSequence = this.s.subSequence(0, this.V.originText().length());
                        this.c = z(m, charSequence, false);
                        O(2);
                    } else {
                        O(1);
                    }
                }
            }
        }
        if (this.c == null || charSequence == null) {
            return new b(i3, 0);
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i4 = size;
        } else if (!TextUtils.isEmpty(charSequence)) {
            i4 = Math.min(Math.min(this.c.getHeight() + this.p + this.o + (this.y * 2), size), this.G);
        }
        this.e = c(i4, mode);
        CharSequence a2 = a(charSequence, i3);
        if (a2 != null) {
            charSequence = a2;
        }
        this.f = charSequence;
        return new b(i3, i4);
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f2fed5", new Object[]{this, new Integer(i)});
        } else {
            this.L = i;
        }
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        }
    }

    public void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        } else {
            this.y = Math.max(i, 0);
        }
    }

    public void E(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f23992a = context;
        }
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c79033", new Object[]{this, new Integer(i)});
        }
    }

    public void G(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6421eb4b", new Object[]{this, charSequence});
            return;
        }
        this.P = charSequence;
        this.S = true;
    }

    public void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faab598b", new Object[]{this, new Boolean(z)});
        } else {
            this.O = z;
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8240d2", new Object[]{this, new Boolean(z)});
        } else {
            this.W = z;
        }
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c709b4e", new Object[]{this, new Integer(i)});
        } else {
            this.J = i;
        }
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7553a2", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142811b1", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81af4bfc", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e262231", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c81db98", new Object[]{this, new Integer(i)});
        } else {
            this.U = i;
        }
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8c3089", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public void Q(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0f14fe", new Object[]{this, new Float(f)});
            return;
        }
        this.N = f;
        this.S = true;
    }

    public void R(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10ae70", new Object[]{this, new Integer(i)});
        } else {
            this.I = i;
        }
    }

    public void S(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503025fc", new Object[]{this, new Float(f)});
        } else {
            this.M = f;
        }
    }

    public void T(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4744c", new Object[]{this, new Float(f)});
        } else {
            this.q = f;
        }
    }

    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43f93", new Object[]{this, new Integer(i)});
            return;
        }
        this.G = i;
        this.S = true;
    }

    public void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        this.H = i;
        this.S = true;
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        this.F = i;
        this.S = true;
    }

    public void X(RichText richText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f171f99", new Object[]{this, richText});
        } else {
            this.V = richText;
        }
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void Z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        this.S = true;
    }

    public final CharSequence a(CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        int i2;
        Object obj;
        int i3;
        int i4;
        int i5;
        Object obj2;
        int i6 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("af15496b", new Object[]{this, charSequence, new Integer(i)});
        }
        if (this.L == 0) {
            z = true;
        } else {
            z = false;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        if (valueOf.length() >= this.s.length() || this.i != TextUtils.TruncateAt.END) {
            z2 = false;
        } else {
            z2 = true;
        }
        int length = valueOf.length();
        if (z2) {
            i2 = this.P.length();
        } else {
            i2 = 0;
        }
        int i7 = length - i2;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.b.size()) {
            int lineForOffset = this.c.getLineForOffset(i9);
            keo keoVar = this.b.get(i8);
            if ((keoVar instanceof gmt) && !z) {
                if (i9 >= i7) {
                    break;
                }
                int min = Math.min(((gmt) keoVar).getText().length() + i9, i7);
                int lineForOffset2 = this.c.getLineForOffset(min - 1);
                int i10 = lineForOffset;
                while (i10 <= lineForOffset2) {
                    if (this.L == i6) {
                        i4 = lineForOffset2;
                        i5 = i7;
                        valueOf.setSpan(new v3w(), Math.max(i9, this.c.getLineStart(i10)), Math.min(min, this.c.getLineEnd(i10)), 33);
                    } else {
                        i4 = lineForOffset2;
                        i5 = i7;
                        int lineTop = this.c.getLineTop(i10) - this.c.getLineBaseline(i10);
                        int lineBottom = this.c.getLineBottom(i10) - this.c.getLineBaseline(i10);
                        if (i10 == this.c.getLineCount() - 1) {
                            lineBottom = (int) (lineBottom + this.c.getSpacingAdd());
                        }
                        if (this.L == 1) {
                            obj2 = new u3w(lineTop, lineBottom, ((int) this.c.getSpacingAdd()) / 2);
                        } else {
                            obj2 = new b4w(lineTop, lineBottom);
                        }
                        valueOf.setSpan(obj2, Math.max(i9, this.c.getLineStart(i10)), Math.min(min, this.c.getLineEnd(i10)), 33);
                    }
                    i10++;
                    lineForOffset2 = i4;
                    i7 = i5;
                    i6 = 3;
                }
            }
            if (keoVar instanceof ane) {
                ane aneVar = (ane) keoVar;
                int lineBottom2 = this.c.getLineBottom(lineForOffset) - this.c.getLineTop(lineForOffset);
                if (this.L == 1) {
                    i3 = ((lineBottom2 - aneVar.v()) >> 1) + ((int) (this.c.getSpacingAdd() / 2.0f));
                    if (lineForOffset == this.c.getLineCount() - 1) {
                        i3 = (int) (i3 - (this.c.getSpacingAdd() / 2.0f));
                    }
                } else {
                    i3 = 0;
                }
                if (this.L == 2) {
                    i3 = lineBottom2 - aneVar.v();
                }
                int i11 = this.L;
                if (i11 == 0 || i11 == 3) {
                    i3 = (int) this.c.getSpacingAdd();
                }
                aneVar.y(-i3);
            }
            i9 += keoVar.getText().length();
            i8++;
            i7 = i7;
            i6 = 3;
        }
        if (z2 && !z) {
            if (this.L == 3) {
                valueOf.setSpan(new v3w(), Math.max(valueOf.length() - this.P.length(), 0), valueOf.length(), 33);
            } else {
                int lineCount = this.c.getLineCount() - 1;
                int lineTop2 = this.c.getLineTop(lineCount) - this.c.getLineBaseline(lineCount);
                int lineBottom3 = (this.c.getLineBottom(lineCount) - this.c.getLineBaseline(lineCount)) + ((int) this.c.getSpacingAdd());
                if (this.L == 1) {
                    obj = new u3w(lineTop2, lineBottom3, ((int) this.c.getSpacingAdd()) / 2);
                } else {
                    obj = new b4w(lineTop2, lineBottom3);
                }
                valueOf.setSpan(obj, Math.max(valueOf.length() - this.P.length(), 0), valueOf.length(), 33);
            }
        }
        if (charSequence instanceof SpannableStringBuilder) {
            return null;
        }
        this.c = z(((i - m()) - n()) - (this.y * 2), valueOf, false);
        return valueOf;
    }

    public void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
            return;
        }
        this.l = i;
        this.S = true;
    }

    public final CharSequence b(CharSequence charSequence, int i) {
        int i2;
        Exception e;
        float f;
        int i3;
        gmt gmtVar;
        int i4;
        int i5;
        int i6;
        int P;
        boolean z;
        boolean z2;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("7c259eb0", new Object[]{this, charSequence, new Integer(i)});
        }
        int i8 = i - 1;
        int lineEnd = this.c.getLineEnd(i8);
        try {
            TextUtils.TruncateAt truncateAt = this.i;
            if (truncateAt == null || truncateAt != TextUtils.TruncateAt.END || charSequence.length() == 1) {
                i2 = 0;
                try {
                    return charSequence.subSequence(0, lineEnd);
                } catch (Exception e2) {
                    e = e2;
                    CharSequence subSequence = charSequence.subSequence(i2, lineEnd);
                    e.printStackTrace();
                    return subSequence;
                }
            } else {
                float width = this.c.getWidth() - this.Z;
                CharSequence charSequence2 = this.P;
                if (charSequence2 instanceof Spannable) {
                    f = Layout.getDesiredWidth(charSequence2, 0, charSequence2.length(), this.g);
                } else {
                    f = this.g.measureText(charSequence2, 0, charSequence2.length());
                }
                float f2 = width - f;
                int lineStart = this.c.getLineStart(i8);
                Iterator<keo> descendingIterator = this.b.descendingIterator();
                int length = this.b.originText().length();
                TextPaint textPaint = new TextPaint();
                textPaint.setLetterSpacing(this.g.getLetterSpacing());
                float min = Math.min(Math.max(0.0f, this.c.getLineWidth(i8)), this.c.getWidth());
                if (this.Z > 0 && min <= f2 && this.c.getLineCount() <= this.H) {
                    return charSequence;
                }
                gmt gmtVar2 = null;
                int i9 = 0;
                while (true) {
                    if (!descendingIterator.hasNext()) {
                        i3 = lineStart;
                        gmtVar = gmtVar2;
                        break;
                    }
                    keo next = descendingIterator.next();
                    int max = Math.max(length - next.getText().length(), lineStart);
                    if (length > lineEnd) {
                        int lineForOffset = this.c.getLineForOffset(length);
                        gmtVar = gmtVar2;
                        int lineForOffset2 = this.c.getLineForOffset(length - next.getText().length());
                        if (lineForOffset > i8 && descendingIterator.hasNext() && lineForOffset2 > i8) {
                            length -= next.getText().length();
                        } else if (!(next instanceof ane)) {
                            i5 = lineEnd;
                        }
                        gmtVar2 = gmtVar;
                    } else {
                        gmtVar = gmtVar2;
                        i5 = length;
                    }
                    if (max < lineStart) {
                        i3 = lineStart;
                        break;
                    }
                    if (next instanceof gmt) {
                        gmtVar2 = (gmt) next;
                        if (gmtVar2.P() == 0) {
                            P = this.t;
                        } else {
                            P = gmtVar2.P();
                        }
                        textPaint.setTextSize(P);
                        int i10 = i5 - 1;
                        i6 = i8;
                        if (charSequence.charAt(i10) == ' ') {
                            z = true;
                        } else {
                            z = false;
                        }
                        while (true) {
                            if (i10 < max) {
                                i3 = lineStart;
                                break;
                            }
                            i3 = lineStart;
                            if (charSequence.charAt(i10) != ' ' || !z) {
                                break;
                            }
                            i10--;
                            lineStart = i3;
                        }
                        int i11 = i10 + 1;
                        if (w()) {
                            i10 = i11;
                        }
                        float f3 = min;
                        while (true) {
                            if (i10 < max) {
                                z2 = false;
                                break;
                            }
                            f3 = min - textPaint.measureText(charSequence, i10, i11);
                            if (f3 < f2) {
                                if (!x(charSequence.charAt(i10)) && i10 - 1 >= max && y(charSequence.subSequence(i7, i10 + 1).toString())) {
                                    i10--;
                                }
                                i9 = i10;
                                z2 = true;
                            } else {
                                i10--;
                            }
                        }
                        if (z2) {
                            break;
                        }
                        min = f3;
                    } else {
                        i6 = i8;
                        i3 = lineStart;
                        if (next instanceof ane) {
                            ane aneVar = (ane) next;
                            min -= aneVar.w();
                            if (min < f2) {
                                i9 = i5 - aneVar.getText().length();
                                break;
                            }
                        }
                        gmtVar2 = gmtVar;
                    }
                    length -= next.getText().length();
                    i8 = i6;
                    lineStart = i3;
                }
                gmtVar2 = gmtVar;
                if (i9 == 0) {
                    i4 = i3;
                } else {
                    i4 = i9;
                }
                CharSequence charSequence3 = this.P;
                if (!((charSequence3 instanceof Spannable) || gmtVar2 == null || gmtVar2.O() == null)) {
                    SpannableString spannableString = new SpannableString(charSequence3);
                    spannableString.setSpan(new ForegroundColorSpan(gmtVar2.O().intValue()), 0, charSequence3.length(), 33);
                    charSequence3 = spannableString;
                }
                return TextUtils.concat(charSequence.subSequence(0, i4), charSequence3);
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 0;
        }
    }

    public void b0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public final float c(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("882cf28", new Object[]{this, new Integer(i), new Integer(i2)})).floatValue();
        }
        Layout layout = this.c;
        if (layout != null) {
            i3 = layout.getHeight();
        }
        int i4 = ((i - this.o) - this.p) - (this.y * 2);
        if (i3 <= 0 || i4 <= 0 || i3 >= i4 || i2 != 1073741824) {
            return 0.0f;
        }
        return (i4 - i3) >> 1;
    }

    public void c0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee7df9b", new Object[]{this, new Integer(i)});
        } else {
            this.D = i;
        }
    }

    public void d0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d015656", new Object[]{this, new Float(f)});
        } else {
            this.B = f;
        }
    }

    public void e(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        this.d = m();
        canvas.save();
        float f = this.d;
        int i = this.y;
        canvas.translate(f + i, this.e + this.o + i);
        Layout layout = this.c;
        if (layout != null) {
            layout.draw(canvas);
        }
        canvas.restore();
    }

    public void e0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb62ef5", new Object[]{this, new Float(f)});
        } else {
            this.C = f;
        }
    }

    public Layout.Alignment f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("bd335135", new Object[]{this, new Integer(i)});
        }
        if (k() == 1) {
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i != 2) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        } else {
            if (i != 2) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public void f0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2e145", new Object[]{this, new Float(f)});
        } else {
            this.E = f;
        }
    }

    public Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f23992a;
    }

    public void g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23a9f28", new Object[]{this, new Integer(i)});
        } else {
            this.X = i;
        }
    }

    public final TextUtils.TruncateAt h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("692e091b", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 2) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i != 3) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b652322a", new Object[]{this, new Integer(i)});
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe9d67b", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public void i0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cd049c", new Object[]{this, new Integer(i)});
        } else {
            this.A = i;
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3e174a", new Object[]{this})).intValue();
        }
        return this.U;
    }

    public void j0(RichText richText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6ba144", new Object[]{this, richText});
            return;
        }
        this.s = null;
        this.b = richText;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff9eba39", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public void k0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a513881d", new Object[]{this, new Integer(i)});
        } else {
            this.K = i;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public void m0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public void n0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186d0d77", new Object[]{this, num});
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d37875", new Object[]{this, new Integer(i)});
        } else {
            this.z = i;
        }
    }

    public RichText p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RichText) ipChange.ipc$dispatch("7c80b290", new Object[]{this});
        }
        return this.b;
    }

    public void p0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513026fe", new Object[]{this, new Integer(i)});
        } else {
            this.Z = i;
        }
    }

    public <T> T[] q(int i, int i2, Class<T> cls) {
        CharSequence charSequence;
        Layout layout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (this.b == null) {
            return null;
        }
        if ((this.P instanceof Spannable) && (charSequence = this.f) != null && this.I == 3) {
            int length = charSequence.length() - this.P.length();
            int length2 = this.f.length();
            if (i >= length && i2 <= length2 && (layout = this.c) != null && this.Y > layout.getLineCount()) {
                CharSequence charSequence2 = this.P;
                return (T[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), cls);
            }
        }
        CharSequence renderText = this.b.renderText();
        if (!(renderText instanceof Spannable)) {
            return null;
        }
        return (T[]) ((Spannable) renderText).getSpans(i, i2, cls);
    }

    public int r(float f, float f2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("724f6069", new Object[]{this, new Float(f), new Float(f2)})).intValue();
        }
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = this.c;
        if (layout == null) {
            return -1;
        }
        int i4 = i2 - this.k;
        int lineForVertical = layout.getLineForVertical(i3 - this.o);
        int offsetForHorizontal = this.c.getOffsetForHorizontal(lineForVertical, i4);
        if (this.c.getPrimaryHorizontal(offsetForHorizontal) < f) {
            i = offsetForHorizontal + 1;
        } else {
            i = offsetForHorizontal - 1;
        }
        int lineStart = this.c.getLineStart(lineForVertical);
        int lineEnd = this.c.getLineEnd(lineForVertical);
        if (i < lineStart) {
            return lineStart;
        }
        if (i > lineEnd) {
            return lineEnd;
        }
        return i;
    }

    public final Typeface s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        if (this.x != null) {
            return Typeface.createFromAsset(g().getAssets(), this.x);
        }
        boolean z = this.v;
        if (z && this.w) {
            return Typeface.defaultFromStyle(3);
        }
        if (z) {
            return Typeface.defaultFromStyle(1);
        }
        if (this.w) {
            return Typeface.defaultFromStyle(2);
        }
        return Typeface.defaultFromStyle(0);
    }

    public final void t(int i, CharSequence charSequence) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e98d", new Object[]{this, new Integer(i), charSequence});
            return;
        }
        float measureText = this.g.measureText(DEFAULT_ELLIPSIS_TEXT.toString());
        int m = ((i - m()) - n()) - (this.y * 2);
        float f = m;
        float f2 = measureText + f;
        int[] iArr = {0};
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= this.H) {
                break;
            }
            int i6 = i3 + 1;
            iArr[0] = 0;
            CharSequence subSequence = charSequence.subSequence(i5, charSequence.length());
            Spanned spanned = (Spanned) TextUtils.ellipsize(subSequence, this.g, f2, TextUtils.TruncateAt.END, false, new a(this, iArr, subSequence)).subSequence(0, iArr[0]);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) spanned.toString());
            d(spanned, 0, spanned.length(), Object.class, spannableStringBuilder, length);
            spannableStringBuilder.append((CharSequence) "\n");
            i5 += spanned.length();
            if (i5 == charSequence.length()) {
                i4 = length;
                break;
            } else {
                i3 = i6;
                i4 = length;
            }
        }
        SpannableStringBuilder delete = spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        float desiredWidth = Layout.getDesiredWidth(delete, i4, delete.length(), this.g);
        while (desiredWidth > f) {
            i2++;
            desiredWidth = Layout.getDesiredWidth(delete, i4, delete.length() - i2, this.g);
        }
        if (i2 > 0) {
            delete = delete.delete(delete.length() - i2, delete.length());
        }
        this.c = z(m, delete, true);
    }

    public final void u() {
        Context x;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b392464", new Object[]{this});
            return;
        }
        RichText richText = this.b;
        if (richText != null) {
            CharSequence renderText = richText.renderText();
            if (!renderText.equals(this.s)) {
                this.s = renderText;
            }
        }
        if (this.s != null) {
            if (this.g == null) {
                this.g = new TextPaint();
            }
            if (this.h == null) {
                this.h = new Paint();
            }
            this.g.setAntiAlias(true);
            int i2 = this.t;
            if (i2 >= 0) {
                this.g.setTextSize(i2);
            }
            this.g.setColor(this.u);
            this.g.setTypeface(s());
            this.i = h(this.I);
            this.j = f(this.K);
            TextPaint textPaint = this.g;
            textPaint.bgColor = 0;
            float f = this.E;
            if (!(f == 0.0f || (i = this.D) == 0)) {
                textPaint.setShadowLayer(f, this.B, this.C, i);
            }
            if (this.N >= 0.0f && (x = DinamicXEngine.x()) != null) {
                TextPaint textPaint2 = this.g;
                textPaint2.setLetterSpacing(this.N / pb6.D(x, textPaint2.getTextSize()));
            }
            if (this.J > 0) {
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.s);
                valueOf.setSpan(new LeadingMarginSpan.Standard(this.J, 0), 0, valueOf.length(), 33);
                this.s = valueOf;
            }
            if (this.z == 1) {
                this.g.setUnderlineText(true);
            }
            if (this.A == 1) {
                this.g.setStrikeThruText(true);
            }
        }
    }

    public boolean v() {
        Layout layout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18ff6e71", new Object[]{this})).booleanValue();
        }
        if (this.P.equals(DEFAULT_ELLIPSIS_TEXT) || (layout = this.c) == null || this.Y <= layout.getLineCount()) {
            return false;
        }
        return true;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce1ec6a5", new Object[]{this})).booleanValue();
        }
        return this.O;
    }

    public final boolean x(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d433f184", new Object[]{this, new Character(c)})).booleanValue();
        }
        if (c < 9728 || c > 10239) {
            return false;
        }
        return true;
    }

    public final boolean y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7143db2b", new Object[]{this, str})).booleanValue();
        }
        return Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]").matcher(str).find();
    }

    public final Layout z(int i, CharSequence charSequence, boolean z) {
        int i2;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("f72ce855", new Object[]{this, new Integer(i), charSequence, new Boolean(z)});
        }
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (this.q >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.t;
        float descent = this.g.descent() - this.g.ascent();
        if (this.M < descent) {
            z3 = false;
        }
        this.o = o();
        this.p = l();
        if (z) {
            if (z2 && !z3) {
                float f2 = this.q - (descent - f);
                this.Q = f2;
                this.Q = Math.max(f2, 0.0f);
                this.R = false;
            }
            if (z3) {
                float f3 = descent - f;
                float f4 = this.M;
                int i3 = (int) (((f4 - descent) + f3) / 2.0f);
                int max = Math.max((int) (((f4 - descent) - f3) / 2.0f), 0);
                int max2 = Math.max(i3, 0);
                this.o = o() + max;
                this.p = l() + max2;
                if (z2) {
                    this.Q = max + max2 + this.q;
                } else {
                    this.Q = max + max2;
                }
                this.R = false;
            }
        }
        return new StaticLayout(charSequence, this.g, i2, this.j, 1.0f, this.Q, this.R);
    }

    static {
        t2o.a(444597203);
    }
}
