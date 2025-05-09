package tb;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.widget.FontDO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710275);
    }

    public static void a(TextPaint textPaint, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd972205", new Object[]{textPaint, new Integer(i), new Integer(i2), str});
        } else {
            textPaint.setTypeface(d(textPaint, i, i2, str));
        }
    }

    public static Typeface c(int i, int i2, String str) {
        Typeface typeface;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("6af54763", new Object[]{new Integer(i), new Integer(i2), str});
        }
        if (i2 != 1) {
            i3 = 0;
        }
        if (i == 2) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = f(str, i3);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return Typeface.create(typeface, i3);
        }
        return Typeface.defaultFromStyle(i3);
    }

    public static Typeface d(TextPaint textPaint, int i, int i2, String str) {
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("67326d63", new Object[]{textPaint, new Integer(i), new Integer(i2), str});
        }
        Typeface typeface = textPaint.getTypeface();
        if (typeface == null) {
            i3 = 0;
        } else {
            i3 = typeface.getStyle();
        }
        if (i == 1 || ((i3 & 1) != 0 && i == -1)) {
            i4 = 1;
        }
        if (i2 == 2 || ((i3 & 2) != 0 && i2 == -1)) {
            i4 |= 2;
        }
        if (str != null) {
            typeface = f(str, i4);
        }
        if (typeface != null) {
            return Typeface.create(typeface, i4);
        }
        return Typeface.defaultFromStyle(i4);
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10923261", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 53430:
                if (str.equals("600")) {
                    c = 0;
                    break;
                }
                break;
            case 54391:
                if (str.equals("700")) {
                    c = 1;
                    break;
                }
                break;
            case 55352:
                if (str.equals("800")) {
                    c = 2;
                    break;
                }
                break;
            case 56313:
                if (str.equals("900")) {
                    c = 3;
                    break;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public static Typeface f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("e87fe39c", new Object[]{str, new Integer(i)});
        }
        FontDO e = pu9.g().e(str);
        if (e == null || e.e() == null) {
            return Typeface.create(str, i);
        }
        return e.e();
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28fe2d70", new Object[]{str})).intValue();
        }
        return TextUtils.equals(str, "italic") ? 2 : 0;
    }
}
