package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z14 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093651);
    }

    public static int a(String str) throws IllegalArgumentException {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str) || str.charAt(0) != '#') {
            throw new IllegalArgumentException("Unknown color");
        }
        long parseLong = Long.parseLong(str.substring(1), 16);
        if (str.length() == 7) {
            j = parseLong | (-16777216);
        } else if (str.length() == 9) {
            j = (parseLong >> 8) | ((255 & parseLong) << 24);
        } else {
            throw new IllegalArgumentException("Unknown color");
        }
        return (int) j;
    }
}
