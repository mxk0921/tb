package tb;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199589);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        if (!str.startsWith("#")) {
            str = "#".concat(str);
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

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            Log.e("SafeParser", Log.getStackTraceString(e));
            return i;
        }
    }
}
