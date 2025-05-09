package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class crp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412005);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c83bc6", new Object[]{str, str2, str3, str4});
        } else if (str != null && str2 != null && str3 != null && str4 != null) {
            TBS.Adv.ctrlClickedOnPage(str, CT.valueOf(str2), str3, str4);
        }
    }
}
