package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.HashMap;
import mtopsdk.common.util.SymbolExpUtil;
import tb.hqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ir2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COLOR_BACKGROUND = 2;
    public static final int COLOR_FOREGROUND = 1;
    public static final int COLOR_TEXT = 0;
    public static final String THEME_AUTO = "auto";
    public static final String THEME_FORCE_DARK = "forcedark";
    public static final int UNDEFINED_COLOR = 1;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Integer> f21518a = new HashMap<>();

    static {
        t2o.a(503316526);
    }

    public static boolean b(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb2bf425", new Object[]{strArr, strArr2})).booleanValue();
        }
        if (strArr != null && strArr.length == 0) {
            strArr = null;
        }
        if (strArr2 != null && strArr2.length == 0) {
            strArr2 = null;
        }
        if (strArr == strArr2) {
            return true;
        }
        if (!(strArr == null || strArr2 == null)) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (TextUtils.equals(str, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static YogaAlign c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaAlign) ipChange.ipc$dispatch("1208aea3", new Object[]{str});
        }
        if (str.equals(pg1.ATOM_EXT_UDL_flex_start)) {
            return YogaAlign.FLEX_START;
        }
        if (str.equals(pg1.ATOM_EXT_UDL_flex_end)) {
            return YogaAlign.FLEX_END;
        }
        if (str.equals("center")) {
            return YogaAlign.CENTER;
        }
        if (str.equals("stretch")) {
            return YogaAlign.STRETCH;
        }
        if (str.equals("auto")) {
            return YogaAlign.AUTO;
        }
        tfs.d("unknow alignItems ".concat(str));
        return YogaAlign.FLEX_START;
    }

    public static int d(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a3c8ec4", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        nxb h = od0.D().h();
        if (h == null || !h.a(context) || !h.c(context)) {
            return i2;
        }
        return y(i, i2);
    }

    public static int e(Context context, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ac529c1", new Object[]{context, new Integer(i), obj})).intValue();
        }
        return d(context, i, j(obj));
    }

    public static int f(Context context, int i, Object obj, n.i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae5a08d2", new Object[]{context, new Integer(i), obj, iVar, new Boolean(z)})).intValue();
        }
        if (iVar != null && z && iVar.b) {
            if ("auto".equals(iVar.f12248a)) {
                return e(context, i, obj);
            }
            if (THEME_FORCE_DARK.equals(iVar.f12248a)) {
                return y(i, j(obj));
            }
        }
        return j(obj);
    }

    public static int g(Context context, int i, Object obj, n.i iVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ce7c5c8", new Object[]{context, new Integer(i), obj, iVar, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (iVar != null && z && iVar.b) {
            if ("auto".equals(iVar.f12248a)) {
                return h(context, i, obj, z2);
            }
            if (THEME_FORCE_DARK.equals(iVar.f12248a)) {
                return y(i, j(obj));
            }
        }
        return j(obj);
    }

    public static int h(Context context, int i, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cde0c2b9", new Object[]{context, new Integer(i), obj, new Boolean(z)})).intValue();
        }
        return l(context, i, j(obj), z);
    }

    @Deprecated
    public static int i(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d84663af", new Object[]{context, new Integer(i), str})).intValue();
        }
        return d(context, i, k(str));
    }

    public static int j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c97fe906", new Object[]{obj})).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof CharSequence) {
            return k(obj.toString());
        }
        return 1;
    }

    public static int l(Context context, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bad46b51", new Object[]{context, new Integer(i), new Integer(i2), new Boolean(z)})).intValue();
        }
        nxb h = od0.D().h();
        if (h == null || ((!h.a(context) && (!z || !h.b(context))) || !h.c(context))) {
            return i2;
        }
        return y(i, i2);
    }

    public static YogaDisplay m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaDisplay) ipChange.ipc$dispatch("566f8343", new Object[]{str});
        }
        if ("none".equals(str)) {
            return YogaDisplay.NONE;
        }
        return YogaDisplay.FLEX;
    }

    public static TextUtils.TruncateAt n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("c9e5f9e1", new Object[]{str});
        }
        if (str.equals("start")) {
            return TextUtils.TruncateAt.START;
        }
        if (str.equals("middle")) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (str.equals("end")) {
            return TextUtils.TruncateAt.END;
        }
        if (str.equals("marquee")) {
            return TextUtils.TruncateAt.MARQUEE;
        }
        if (str.equals("clip")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public static YogaFlexDirection o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaFlexDirection) ipChange.ipc$dispatch("8cf1b183", new Object[]{str});
        }
        if (str.equals(pg1.ATOM_EXT_row)) {
            return YogaFlexDirection.ROW;
        }
        if (str.equals(pg1.ATOM_EXT_column)) {
            return YogaFlexDirection.COLUMN;
        }
        if (str.equals(pg1.ATOM_EXT_UDL_row_reverse)) {
            return YogaFlexDirection.ROW_REVERSE;
        }
        if (str.equals(pg1.ATOM_EXT_UDL_column_reverse)) {
            return YogaFlexDirection.COLUMN_REVERSE;
        }
        tfs.d("unknow flexDirection ".concat(str));
        return YogaFlexDirection.COLUMN;
    }

    public static String[] p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f9f534cb", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return nwv.G(str.replace(f7l.BRACKET_END_STR, "").replace(f7l.BRACKET_START_STR, ",").replace(" ", ""), ',');
    }

    public static int q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fc4745f", new Object[]{str})).intValue();
        }
        String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        if (split == null) {
            return 0;
        }
        int i = 0;
        for (String str2 : split) {
            i |= r(str2.trim());
        }
        return i;
    }

    public static String[] s(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("2b18393e", new Object[]{obj});
        }
        if (obj instanceof String) {
            return ((String) obj).split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        }
        return null;
    }

    public static YogaJustify t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaJustify) ipChange.ipc$dispatch("28d4e982", new Object[]{str});
        }
        if (str.equals(pg1.ATOM_EXT_UDL_flex_start)) {
            return YogaJustify.FLEX_START;
        }
        if (str.equals(pg1.ATOM_EXT_UDL_flex_end)) {
            return YogaJustify.FLEX_END;
        }
        if (str.equals("center")) {
            return YogaJustify.CENTER;
        }
        if (str.equals(pg1.ATOM_EXT_UDL_space_between)) {
            return YogaJustify.SPACE_BETWEEN;
        }
        if (str.equals(pg1.ATOM_EXT_UDL_space_around)) {
            return YogaJustify.SPACE_AROUND;
        }
        tfs.d("unknow justifyContent ".concat(str));
        return YogaJustify.FLEX_START;
    }

    public static YogaPositionType u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaPositionType) ipChange.ipc$dispatch("a39fdd81", new Object[]{str});
        }
        if (str.equals(pg1.ATOM_EXT_absolute) || str.equals("fixed")) {
            return YogaPositionType.ABSOLUTE;
        }
        return YogaPositionType.RELATIVE;
    }

    public static int v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f38a2d5", new Object[]{str})).intValue();
        }
        return fru.b(str);
    }

    public static YogaWrap x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaWrap) ipChange.ipc$dispatch("33545099", new Object[]{str});
        }
        if (str.equals(pg1.ATOM_EXT_wrap)) {
            return YogaWrap.WRAP;
        }
        if (str.equals(pg1.ATOM_EXT_nowrap)) {
            return YogaWrap.NO_WRAP;
        }
        return YogaWrap.WRAP;
    }

    public static int y(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9821d931", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        nxb h = od0.D().h();
        if (h != null) {
            return h.transformColor(i, i2);
        }
        return i2;
    }

    public static int r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8056607c", new Object[]{str})).intValue();
        }
        if (str.equals("center")) {
            return 17;
        }
        if (str.equals("center-horizontal")) {
            return 1;
        }
        if (str.equals("center-vertical")) {
            return 16;
        }
        return (!str.equals("left") && str.equals("right")) ? GravityCompat.END : GravityCompat.START;
    }

    public static String a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a47eaa2", new Object[]{strArr});
        }
        if (strArr == null) {
            return null;
        }
        hqq.b a2 = hqq.a();
        for (int i = 0; i < strArr.length; i++) {
            a2.b(strArr[i]);
            if (i < strArr.length - 1) {
                a2.b("|");
            }
        }
        return a2.toString();
    }

    @Deprecated
    public static int k(String str) {
        String str2;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (str == null || str.isEmpty()) {
            return 1;
        }
        if (str.equals(pg1.ATOM_EXT_random)) {
            int currentTimeMillis = (int) (System.currentTimeMillis() % 255);
            return Color.argb(255, currentTimeMillis, currentTimeMillis, currentTimeMillis);
        }
        Integer num = f21518a.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = 0;
        if (str.startsWith("rgb(")) {
            String[] split = str.substring(4, str.length() - 1).split(",");
            num2 = Integer.valueOf(Color.rgb(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue()));
        } else if (str.startsWith("rgba(")) {
            String[] split2 = str.substring(5, str.length() - 1).split(",");
            float f2 = 1.0f;
            try {
                f = Float.parseFloat(split2[3].trim());
            } catch (Exception unused) {
                f = 1.0f;
            }
            if (f <= 1.0f) {
                f2 = f;
            }
            num2 = Integer.valueOf(Color.argb((int) (f2 * 255.0f), Integer.valueOf(split2[0].trim()).intValue(), Integer.valueOf(split2[1].trim()).intValue(), Integer.valueOf(split2[2].trim()).intValue()));
        } else {
            try {
                if (str.charAt(0) == '#') {
                    if (str.length() > 7) {
                        str2 = "#" + str.substring(7) + str.substring(1, 7);
                    } else if (str.length() < 7) {
                        if (str.length() == 4) {
                            str2 = "#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3);
                        } else if (str.length() == 5) {
                            str2 = "#" + str.charAt(4) + str.charAt(4) + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3);
                        }
                    }
                    num2 = Integer.valueOf(Color.parseColor(str2));
                }
                num2 = Integer.valueOf(Color.parseColor(str2));
            } catch (IllegalArgumentException unused2) {
                tfs.d("unknown color " + str2);
            }
            str2 = str;
        }
        f21518a.put(str, num2);
        return num2.intValue();
    }

    public static int w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78722ec0", new Object[]{str})).intValue();
        }
        if (str.equals("center")) {
            return 0;
        }
        if (str.equals("top")) {
            return 1;
        }
        return str.equals("bottom") ? 2 : 0;
    }
}
