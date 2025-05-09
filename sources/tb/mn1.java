package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772064);
    }

    public static zhb a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zhb) ipChange.ipc$dispatch("cc064928", new Object[]{str, str2});
        }
        if (!"taopasswordBackflow_goods".equals(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new rfa(str2);
    }
}
