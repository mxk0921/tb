package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fel implements inc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031857);
        t2o.a(297795612);
    }

    @Override // tb.inc
    public void a(String str, String str2, String str3, String str4, int i, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2a56f9", new Object[]{this, str, str2, str3, str4, new Integer(i), th, strArr});
        }
    }

    @Override // tb.inc
    public void b(String str, String str2, String str3, String str4, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be51ddcf", new Object[]{this, str, str2, str3, str4, new Integer(i), strArr});
        } else {
            UnifyLog.l("order", str, str2, str3, str4, strArr);
        }
    }
}
