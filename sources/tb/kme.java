package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.StringUtil;
import tb.epe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kme {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792197);
    }

    public static String a(String str) {
        epe.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f92dc87", new Object[]{str});
        }
        if (StringUtil.isEmpty(str) || (a2 = p8t.a(str)) == null || TextUtils.isEmpty(a2.f18739a)) {
            return str;
        }
        return a2.f18739a;
    }
}
