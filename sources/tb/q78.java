package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(456130657);
    }

    public static void a(q1c q1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfd2cb8", new Object[]{q1cVar});
        } else {
            r78.b().c(q1cVar);
        }
    }
}
