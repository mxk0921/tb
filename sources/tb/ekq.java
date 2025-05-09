package tb;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ekq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        r2 = android.text.StaticLayout.class.getDeclaredField("mLines");
        r2.setAccessible(true);
        r0 = android.text.StaticLayout.class.getDeclaredField("mColumns");
        r0.setAccessible(true);
        r2 = (int[]) r2.get(r7);
        r7 = r0.getInt(r7);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r0 >= r7) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = (r7 * r4) + r0;
        e(r2, r3, r3 + r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.text.StaticLayout r7) {
        /*
            java.lang.Class<android.text.StaticLayout> r0 = android.text.StaticLayout.class
            r1 = 0
            int r2 = r7.getLineStart(r1)
            int r3 = r7.getLineCount()
            r4 = 0
        L_0x000c:
            r5 = 1
            if (r4 >= r3) goto L_0x0046
            int r6 = r7.getLineEnd(r4)
            if (r6 >= r2) goto L_0x0042
            java.lang.String r2 = "mLines"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: Exception -> 0x0046
            r2.setAccessible(r5)     // Catch: Exception -> 0x0046
            java.lang.String r3 = "mColumns"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: Exception -> 0x0046
            r0.setAccessible(r5)     // Catch: Exception -> 0x0046
            java.lang.Object r2 = r2.get(r7)     // Catch: Exception -> 0x0046
            int[] r2 = (int[]) r2     // Catch: Exception -> 0x0046
            int r7 = r0.getInt(r7)     // Catch: Exception -> 0x0046
            r0 = 0
        L_0x0034:
            if (r0 >= r7) goto L_0x0041
            int r3 = r7 * r4
            int r3 = r3 + r0
            int r6 = r3 + r7
            e(r2, r3, r6)     // Catch: Exception -> 0x0046
            int r0 = r0 + 1
            goto L_0x0034
        L_0x0041:
            return r1
        L_0x0042:
            int r4 = r4 + 1
            r2 = r6
            goto L_0x000c
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ekq.a(android.text.StaticLayout):boolean");
    }

    public static StaticLayout b(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("68872121", new Object[]{charSequence, new Integer(i), new Integer(i2), textPaint, new Integer(i3), alignment, new Float(f), new Float(f2), new Boolean(z), truncateAt, new Integer(i4), new Integer(i5), textDirectionHeuristicCompat});
        }
        try {
            return fkq.a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        } catch (Exception unused) {
            return c(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        }
    }

    public static StaticLayout c(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StaticLayout) ipChange.ipc$dispatch("6c757ca0", new Object[]{charSequence, new Integer(i), new Integer(i2), textPaint, new Integer(i3), alignment, new Float(f), new Float(f2), new Boolean(z), truncateAt, new Integer(i4)}) : new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
    }

    public static StaticLayout d(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        int lineStart;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder textDirection;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout.Builder indents;
        StaticLayout build;
        CharSequence charSequence2 = charSequence;
        int i9 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("e8bbaa45", new Object[]{charSequence2, new Integer(i), new Integer(i2), textPaint, new Integer(i3), alignment, new Float(f), new Float(f2), new Boolean(z), truncateAt, new Integer(i4), new Integer(i9), textDirectionHeuristicCompat, new Integer(i6), new Integer(i7), new Integer(i8), iArr, iArr2});
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            obtain = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(f2, f);
            includePad = lineSpacing.setIncludePad(z);
            ellipsize = includePad.setEllipsize(truncateAt);
            ellipsizedWidth = ellipsize.setEllipsizedWidth(i4);
            maxLines = ellipsizedWidth.setMaxLines(i9);
            textDirection = maxLines.setTextDirection(fkq.b(textDirectionHeuristicCompat));
            breakStrategy = textDirection.setBreakStrategy(i6);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i7);
            indents = hyphenationFrequency.setIndents(iArr, iArr2);
            if (i10 >= 26) {
                indents.setJustificationMode(i8);
            }
            build = indents.build();
            return build;
        }
        StaticLayout b = b(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        if (i9 > 0) {
            StaticLayout staticLayout = b;
            int i11 = i2;
            while (staticLayout.getLineCount() > i9 && (lineStart = staticLayout.getLineStart(i9)) < i11) {
                int i12 = lineStart;
                while (i12 > i && Character.isSpace(charSequence2.charAt(i12 - 1))) {
                    i12--;
                }
                staticLayout = b(charSequence, i, i12, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                if (staticLayout.getLineCount() < i9 || staticLayout.getEllipsisCount(i9 - 1) != 0) {
                    charSequence2 = charSequence;
                } else {
                    StringBuilder sb = new StringBuilder();
                    charSequence2 = charSequence;
                    sb.append((Object) charSequence2.subSequence(i, i12));
                    sb.append(" …");
                    String sb2 = sb.toString();
                    staticLayout = b(sb2, 0, sb2.length(), textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                }
                i9 = i5;
                i11 = i12;
            }
            b = staticLayout;
        }
        do {
        } while (!a(b));
        return b;
    }

    public static void e(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c01b88", new Object[]{iArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
