package tb;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.view.View;
import androidx.core.text.TextDirectionHeuristicCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.android.weex_uikit.widget.text.TextLayoutBuilder;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hlt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BREAK_VALUE = "breakValue";
    public static boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f20734a;
    public int b;
    public int c;
    public CharSequence d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements LineHeightSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f20735a;

        public a(float f) {
            this.f20735a = f;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646418b3", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fontMetricsInt});
                return;
            }
            float f = this.f20735a;
            int i5 = fontMetricsInt.descent;
            int i6 = fontMetricsInt.ascent;
            int i7 = (int) ((f - (i5 - i6)) / 2.0f);
            fontMetricsInt.top -= i7;
            fontMetricsInt.bottom += i7;
            fontMetricsInt.ascent = i6 - i7;
            fontMetricsInt.descent = i5 + i7;
        }
    }

    static {
        t2o.a(986710263);
    }

    public hlt(UINode uINode) {
        this.f20734a = uINode;
    }

    public static Layout b(int i, TextUtils.TruncateAt truncateAt, boolean z, int i2, float f, float f2, float f3, int i3, boolean z2, CharSequence charSequence, int i4, ColorStateList colorStateList, int i5, int i6, float f4, float f5, float f6, int i7, Typeface typeface, Layout.Alignment alignment, boolean z3, int i8, int i9, int i10, int i11, int i12, float f7, int i13, int i14, int i15, TextDirectionHeuristicCompat textDirectionHeuristicCompat, float f8) {
        int i16;
        int i17;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("3a50ba53", new Object[]{new Integer(i), truncateAt, new Boolean(z), new Integer(i2), new Float(f), new Float(f2), new Float(f3), new Integer(i3), new Boolean(z2), charSequence, new Integer(i4), colorStateList, new Integer(i5), new Integer(i6), new Float(f4), new Float(f5), new Float(f6), new Integer(i7), typeface, alignment, new Boolean(z3), new Integer(i8), new Integer(i9), new Integer(i10), new Integer(i11), new Integer(i12), new Float(f7), new Integer(i13), new Integer(i14), new Integer(i15), textDirectionHeuristicCompat, new Float(f8)});
        }
        CharSequence charSequence2 = charSequence;
        float f9 = f8 > 0.0f ? f8 : i6 * (-f8);
        TextLayoutBuilder textLayoutBuilder = new TextLayoutBuilder();
        textLayoutBuilder.r(false);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i16 = 2;
        } else if (mode == 0) {
            i16 = 0;
        } else if (mode == 1073741824) {
            i16 = 1;
        } else {
            throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i));
        }
        TextUtils.TruncateAt truncateAt2 = (truncateAt != null || i2 == Integer.MAX_VALUE) ? truncateAt : TextUtils.TruncateAt.END;
        if (f9 == Float.MAX_VALUE || (charSequence2 instanceof SpannableString)) {
            i17 = i16;
        } else {
            SpannableString spannableString = new SpannableString(charSequence2);
            i17 = i16;
            spannableString.setSpan(new a(f9), 0, spannableString.length(), 33);
            charSequence2 = spannableString;
        }
        if (truncateAt == TextUtils.TruncateAt.MIDDLE && i2 == 1) {
            charSequence2 = m(charSequence2, i6, View.MeasureSpec.getSize(i));
        }
        textLayoutBuilder.e(f7).f(truncateAt2).m(i2).q(f, f2, f3, i3).s(z2).t(charSequence2).x(i6).C(View.MeasureSpec.getSize(i), i17).h(z).y(f4).z(f5).c(alignment).k(i5).d(i13).g(i14);
        if (Build.VERSION.SDK_INT >= 26) {
            textLayoutBuilder.i(i15);
        }
        textLayoutBuilder.j(f6);
        if (i9 != -1) {
            textLayoutBuilder.o(i9);
        } else {
            textLayoutBuilder.p(i11);
        }
        if (i10 != Integer.MIN_VALUE) {
            textLayoutBuilder.l(i10);
        } else {
            textLayoutBuilder.n(i12);
        }
        if (i4 != 0) {
            textLayoutBuilder.u(i4);
        } else {
            textLayoutBuilder.v(colorStateList);
        }
        if (!tkt.DEFAULT_TYPEFACE.equals(typeface)) {
            textLayoutBuilder.B(typeface);
        } else {
            textLayoutBuilder.A(i7);
        }
        if (textDirectionHeuristicCompat != null) {
            textLayoutBuilder.w(textDirectionHeuristicCompat);
        }
        return textLayoutBuilder.a();
    }

    public static int f(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b6fb857", new Object[]{layout})).intValue();
        }
        for (int i = 0; i < layout.getLineCount(); i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence m(java.lang.CharSequence r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hlt.m(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public static int n(int i, int i2, Layout layout, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("386be056", new Object[]{new Integer(i), new Integer(i2), layout, new Boolean(z), new Integer(i3)})).intValue();
        }
        if (layout == null) {
            return 0;
        }
        int d = gjg.d(i, i2, layout.getWidth());
        if (z && layout.getLineCount() > 1) {
            int d2 = gjg.d(i, i2, gjg.c(layout));
            if (d - d2 > i3) {
                return d2;
            }
        }
        return d;
    }

    public static CharSequence o(CharSequence charSequence, CharSequence charSequence2, Layout layout, int i, float f) {
        Rect rect;
        int lineStart;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("5629dd2a", new Object[]{charSequence, charSequence2, layout, new Integer(i), new Float(f)});
        }
        if (TextUtils.isEmpty(charSequence2)) {
            int ellipsisStart = layout.getEllipsisStart(i);
            if (ellipsisStart < charSequence.length()) {
                ellipsisStart++;
            }
            if (Layout.getDesiredWidth(charSequence.subSequence(layout.getLineStart(i), layout.getLineStart(i) + ellipsisStart), layout.getPaint()) > layout.getWidth()) {
                ellipsisStart--;
            }
            return charSequence.subSequence(0, layout.getLineStart(i) + ellipsisStart);
        }
        layout.getPaint().getTextBounds(charSequence2.toString(), 0, charSequence2.length(), new Rect());
        int offsetForHorizontal = layout.getOffsetForHorizontal(i, (f - rect.width()) + layout.getLineLeft(i));
        if (offsetForHorizontal <= 0) {
            return charSequence;
        }
        int i2 = offsetForHorizontal - 1;
        if (layout.getEllipsisCount(i) > 0 && i2 > (lineStart = layout.getLineStart(i) + layout.getEllipsisStart(i))) {
            i2 = lineStart;
        }
        return TextUtils.concat(charSequence.subSequence(0, i2), charSequence2);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return ((Integer) this.f20734a.getAttribute("color")).intValue();
    }

    public TextUtils.TruncateAt e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("afffd5d4", new Object[]{this});
        }
        String str = (String) this.f20734a.getAttribute("textOverflow");
        int hashCode = str.hashCode();
        if (hashCode == 3056464) {
            str.equals("clip");
            return null;
        } else if (hashCode == 188702929 && str.equals("ellipsis")) {
            return a((String) this.f20734a.getAttribute("ellipsisPosition"));
        } else {
            return null;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db8bfe0", new Object[]{this})).intValue();
        }
        return ((Integer) this.f20734a.getAttribute("fontSize")).intValue();
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80b2228", new Object[]{this})).floatValue();
        }
        return ((Float) this.f20734a.getAttribute("lineHeight")).floatValue();
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9558ad43", new Object[]{this})).intValue();
        }
        Integer num = (Integer) this.f20734a.getAttribute(Constants.Name.LINES);
        int intValue = num == null ? Integer.MAX_VALUE : num.intValue();
        if (intValue == Integer.MAX_VALUE && TextUtils.equals((String) this.f20734a.getAttribute(pg1.ATOM_EXT_whiteSpace), pg1.ATOM_EXT_nowrap)) {
            return 1;
        }
        return intValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r1.equals("left") != false) goto L_0x0056;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.Layout.Alignment j() {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.hlt.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "8b241eed"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.Object r0 = r1.ipc$dispatch(r2, r3)
            android.text.Layout$Alignment r0 = (android.text.Layout.Alignment) r0
            return r0
        L_0x0015:
            com.taobao.android.weex_uikit.ui.UINode r1 = r6.f20734a
            java.lang.String r2 = "textAlign"
            java.lang.Object r1 = r1.getAttribute(r2)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r4 = 2
            r5 = 3
            if (r2 == r3) goto L_0x004b
            r3 = 3317767(0x32a007, float:4.649182E-39)
            if (r2 == r3) goto L_0x0041
            r0 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r2 == r0) goto L_0x0036
            goto L_0x0055
        L_0x0036:
            java.lang.String r0 = "right"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r2 = "left"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "center"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2
            goto L_0x0056
        L_0x0055:
            r0 = -1
        L_0x0056:
            if (r0 == r4) goto L_0x0060
            if (r0 == r5) goto L_0x005d
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L_0x005d:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L_0x0060:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hlt.j():android.text.Layout$Alignment");
    }

    public static CharSequence c(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("bcce7b59", new Object[]{charSequence});
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * 2);
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt >= 56320) {
                sb.append(charAt);
                sb.append("\u200b");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r6.equals("start") == false) goto L_0x0050;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.TextUtils.TruncateAt a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.hlt.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "9855e4b4"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            android.text.TextUtils$TruncateAt r6 = (android.text.TextUtils.TruncateAt) r6
            return r6
        L_0x0018:
            if (r6 != 0) goto L_0x001d
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            return r6
        L_0x001d:
            int r3 = r6.hashCode()
            r4 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            if (r3 == r4) goto L_0x0045
            r2 = 100571(0x188db, float:1.4093E-40)
            if (r3 == r2) goto L_0x003b
            r2 = 109757538(0x68ac462, float:5.219839E-35)
            if (r3 == r2) goto L_0x0031
            goto L_0x0050
        L_0x0031:
            java.lang.String r2 = "start"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0050
            goto L_0x0051
        L_0x003b:
            java.lang.String r1 = "end"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0050
            r1 = 1
            goto L_0x0051
        L_0x0045:
            java.lang.String r1 = "middle"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0050
            r1 = 2
            goto L_0x0051
        L_0x0050:
            r1 = -1
        L_0x0051:
            if (r1 == 0) goto L_0x005b
            if (r1 == r0) goto L_0x0058
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.MIDDLE
            return r6
        L_0x0058:
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            return r6
        L_0x005b:
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.START
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hlt.a(java.lang.String):android.text.TextUtils$TruncateAt");
    }

    public void k(boolean z, int i, int i2, int i3, int i4, int[] iArr, int i5, UINode uINode) {
        int i6 = i;
        int i7 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201ff41", new Object[]{this, new Boolean(z), new Integer(i6), new Integer(i7), new Integer(i3), new Integer(i4), iArr, new Integer(i5), uINode});
            return;
        }
        CharSequence charSequence = (CharSequence) uINode.getAttribute("value");
        if (!z && i5 == 2 && charSequence != null) {
            charSequence = c(charSequence);
            uINode.setAttribute(BREAK_VALUE, charSequence);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (i3 != 1073741824) {
                i6 = 0;
            }
            if (i4 != 1073741824) {
                i7 = 0;
            }
            iArr[0] = i6;
            iArr[1] = i7;
            uINode.setExtra(mmt.EXTRA_LAYOUT, null);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i3);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, i4);
        Layout b = b(makeMeasureSpec, e(), false, i(), 0.0f, 0.0f, 0.0f, tkt.DEFAULT_SHADOW_COLOR, false, charSequence, d(), tkt.TEXT_COLOR_STATE_LIST, tkt.DEFAULT_LINK_COLOR, g(), 0.0f, 1.0f, 0.0f, tkt.TEXT_STYLE, (Typeface) uINode.getExtra("fontFace"), j(), false, gjg.b(), -1, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, uINode.getInstance().getContext().a().getResources().getDisplayMetrics().density, 0, 0, 0, tkt.DEFAULT_TEXT_DIRECTION, h());
        iArr[0] = n(makeMeasureSpec, Integer.MAX_VALUE, b, false, 0);
        int d = gjg.d(makeMeasureSpec2, Integer.MAX_VALUE, Math.max(0, gjg.a(b)));
        iArr[1] = d;
        int i8 = iArr[0];
        if (i8 < 0 || d < 0) {
            iArr[0] = Math.max(i8, 0);
            iArr[1] = Math.max(iArr[1], 0);
        }
        this.b = iArr[0];
        this.c = iArr[1];
        uINode.setExtra(mmt.EXTRA_LAYOUT, b);
    }

    public void l(boolean z, int i, int i2, int i3, int i4, int i5, UINode uINode) {
        int i6;
        int i7;
        int i8;
        String str;
        int f;
        int i9 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc94000", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), uINode});
            return;
        }
        CharSequence charSequence = this.d;
        CharSequence charSequence2 = (CharSequence) uINode.getAttribute("value");
        this.d = charSequence2;
        if (TextUtils.isEmpty(charSequence2)) {
            uINode.setExtra(mmt.EXTRA_LAYOUT, null);
            return;
        }
        if (!z && i5 == 2) {
            CharSequence charSequence3 = (CharSequence) uINode.getAttribute(BREAK_VALUE);
            if (TextUtils.isEmpty(charSequence3)) {
                CharSequence charSequence4 = this.d;
                if (charSequence4 != null) {
                    CharSequence c = c(charSequence4);
                    this.d = c;
                    uINode.setAttribute(BREAK_VALUE, c);
                }
            } else {
                this.d = charSequence3;
            }
        }
        boolean z2 = e && !TextUtils.equals(charSequence, this.d);
        Layout layout = (Layout) uINode.getExtra(mmt.EXTRA_LAYOUT);
        Rect A = uINode.getNodeInfo().A();
        BorderProp s = uINode.getNodeInfo().s(false);
        if (s != null) {
            i9 = s.g(0);
            i7 = s.g(2);
            i6 = s.g(1);
            i8 = s.g(3);
        } else {
            i8 = 0;
            i7 = 0;
            i6 = 0;
        }
        float f2 = ((((i3 - i) - A.left) - A.right) - i9) - i7;
        float f3 = ((((i4 - i2) - A.top) - A.bottom) - i6) - i8;
        TextUtils.TruncateAt e2 = e();
        if (e2 == null) {
            str = "";
        } else {
            str = "...";
        }
        if (z2 || layout == null || this.b != f2 || this.c != f3) {
            if (e) {
                this.b = (int) f2;
                this.c = (int) f3;
            }
            layout = b(View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824), e2, false, i(), 0.0f, 0.0f, 0.0f, tkt.DEFAULT_SHADOW_COLOR, false, this.d, d(), tkt.TEXT_COLOR_STATE_LIST, tkt.DEFAULT_LINK_COLOR, g(), 0.0f, 1.0f, 0.0f, tkt.TEXT_STYLE, (Typeface) uINode.getExtra("fontFace"), j(), false, gjg.b(), -1, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, uINode.getInstance().getContext().a().getResources().getDisplayMetrics().density, 0, 0, 0, tkt.DEFAULT_TEXT_DIRECTION, h());
            uINode.setExtra(mmt.EXTRA_LAYOUT, layout);
        }
        if ((e2 == null || (!TextUtils.isEmpty(str) && !TextUtils.equals("...", str))) && (f = f(layout)) != -1) {
            CharSequence o = o(this.d, str, layout, f, f2);
            int i10 = (int) f2;
            Layout b = b(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), e2, false, i(), 0.0f, 0.0f, 0.0f, tkt.DEFAULT_SHADOW_COLOR, false, o, d(), tkt.TEXT_COLOR_STATE_LIST, tkt.DEFAULT_LINK_COLOR, g(), 0.0f, 1.0f, 0.0f, tkt.TEXT_STYLE, (Typeface) uINode.getExtra("fontFace"), j(), false, gjg.b(), -1, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, uINode.getInstance().getContext().a().getResources().getDisplayMetrics().density, 0, 0, 0, tkt.DEFAULT_TEXT_DIRECTION, h());
            if (e) {
                this.b = i10;
                this.c = (int) f3;
            }
            uINode.setExtra(mmt.EXTRA_LAYOUT, b);
        }
    }
}
