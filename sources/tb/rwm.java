package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.StringUtil;
import java.text.DecimalFormat;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792528);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45600f", new Object[]{str});
        }
        if (!StringUtil.isEmpty(str)) {
            try {
                double parseDouble = Double.parseDouble(str);
                Double valueOf = Double.valueOf(parseDouble);
                String str2 = "";
                try {
                    if (parseDouble >= vu3.b.GEO_NOT_SUPPORT && parseDouble < 10000.0d) {
                        str2 = String.valueOf(valueOf.intValue());
                    } else if (parseDouble >= 10000.0d && parseDouble < 100000.0d) {
                        Double valueOf2 = Double.valueOf(parseDouble / 10000.0d);
                        DecimalFormat decimalFormat = new DecimalFormat(".#");
                        str2 = decimalFormat.format(valueOf2) + "万";
                    } else if (parseDouble >= 100000.0d) {
                        Double valueOf3 = Double.valueOf(parseDouble / 10000.0d);
                        str2 = String.valueOf(valueOf3.intValue()) + "万";
                    }
                    if (!StringUtil.isEmpty(str2)) {
                        return str2;
                    }
                } catch (Exception unused) {
                    b4p.b("PriceRangeParser", "转换出错");
                    return null;
                }
            } catch (NumberFormatException unused2) {
                b4p.b("PriceRangeParser", "String转double出错");
            }
        }
        return null;
    }
}
