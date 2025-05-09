package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538209);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaa0f6b2", new Object[]{str})).intValue();
        }
        return b(str, 0);
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("697e5417", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
            return i;
        }
        return Integer.parseInt(str);
    }
}
