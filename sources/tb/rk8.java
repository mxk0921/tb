package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rk8 implements lnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092147);
        t2o.a(156237888);
    }

    public void a(String str, String str2, String str3, String str4, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be51ddcf", new Object[]{this, str, str2, str3, str4, new Integer(i), strArr});
        } else {
            UnifyLog.l("ultroncommonpage", str, str2, str3, str4, strArr);
        }
    }
}
