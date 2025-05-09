package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v14 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(706740231);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            if (!str.startsWith("0x")) {
                return 0;
            }
            str = "#" + str.substring(2);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
