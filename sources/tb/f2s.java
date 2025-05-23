package tb;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f2s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMEN_SUFFIX_AP = "ap";
    public static final String DIMEN_SUFFIX_NP = "np";

    static {
        t2o.a(301989922);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7166a16c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("ap") || str.contains("np")) {
            return str;
        }
        return str.concat("np");
    }

    public static GradientDrawable b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("67bd2d0e", new Object[]{list});
        }
        return c(list, null);
    }

    public static GradientDrawable c(List<String> list, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("e347f63", new Object[]{list, fArr});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        if (list.size() == 1) {
            list.add(list.get(0));
        }
        return e((String[]) list.toArray(new String[list.size()]), fArr);
    }

    public static GradientDrawable d(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("b4600596", new Object[]{strArr});
        }
        return e(strArr, null);
    }

    public static GradientDrawable e(String[] strArr, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("bd8355eb", new Object[]{strArr, fArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        if (strArr.length == 1) {
            strArr = new String[]{strArr[0], strArr[0]};
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!(str instanceof String)) {
                str = null;
            }
            arrayList.add(Integer.valueOf(g(str, 0)));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        return gradientDrawable;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e369bcf1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.contains("ap")) {
                Float.parseFloat(str.replace("ap", ""));
            } else if (str.contains("np")) {
                Float.parseFloat(str.replace("np", ""));
            } else {
                Float.parseFloat(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 7 || sb2.length() == 9) {
            return Color.parseColor(sb2);
        }
        return i;
    }
}
