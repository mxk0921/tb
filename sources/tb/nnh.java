package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class nnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792331);
    }

    public static final Integer a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5382e812", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ckf.d(str);
        if (str.length() != 4) {
            return Integer.valueOf(qrl.b(str, 0));
        }
        String substring = str.substring(1);
        ckf.f(substring, "substring(...)");
        return Integer.valueOf(qrl.b("#" + substring + substring, 0));
    }
}
