package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xjg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_COLOR = -16777216;
    public static final String ERROR_COLOR_STRING = "#ff000000";

    static {
        t2o.a(511705624);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e97e34ee", new Object[]{new Integer(i)});
        }
        try {
            return "#" + Integer.toHexString(i);
        } catch (Exception unused) {
            odg.c("LcColorUtil", "from int into string. origin =" + i);
            return ERROR_COLOR_STRING;
        }
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f571fcf7", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.startsWith("#")) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                odg.c("LcColorUtil", "parsing color string :" + str + " error:" + e);
            }
        }
        if (str.startsWith("0x") || str.startsWith("0X")) {
            try {
                return Color.parseColor("#" + str.substring(2));
            } catch (Exception e2) {
                odg.c("LcColorUtil", "parsing color int1 :" + str + " error:" + e2);
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e3) {
            odg.c("LcColorUtil", "parsing color int2 :" + str + " error:" + e3);
            odg.c("LcColorUtil", "parsing color failed due to value =".concat(str));
            return -16777216;
        }
    }
}
