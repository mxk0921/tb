package tb;

import android.graphics.Rect;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f9g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705612);
    }

    public static float a(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb8b59cd", new Object[]{textPaint})).floatValue();
        }
        Rect rect = new Rect();
        textPaint.getTextBounds("a a", 0, 3, rect);
        Rect rect2 = new Rect();
        textPaint.getTextBounds(new char[]{'a'}, 0, 1, rect2);
        return rect.width() - (rect2.width() * 2);
    }

    public static CharSequence d(CharSequence charSequence, TextPaint textPaint, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("bc81fae2", new Object[]{charSequence, textPaint, new Integer(i)});
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(charSequence.toString(), 0, charSequence.length(), rect);
        if (rect.width() > i) {
            return charSequence;
        }
        int ceil = (int) Math.ceil((i - rect.width()) / a(textPaint));
        if (ceil <= 0) {
            return charSequence;
        }
        int length = charSequence.toString().length() + ceil;
        return c(b(charSequence.toString(), length / 2), length);
    }

    public static String b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bb5a188", new Object[]{str, new Integer(i)});
        }
        return String.format("%1$" + i + "s", str);
    }

    public static String c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd626897", new Object[]{str, new Integer(i)});
        }
        return String.format("%1$-" + i + "s", str);
    }
}
