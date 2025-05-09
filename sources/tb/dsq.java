package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dsq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(703594525);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16ad9700", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("1") || str.length() != 11) {
            return str;
        }
        return str.substring(0, 3) + " " + str.substring(3, 7) + " " + str.substring(7);
    }
}
