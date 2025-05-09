package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            IpChange ipChange2 = Downgrade.$ipChange;
        }
    }
}
