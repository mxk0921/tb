package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cc8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(850395152);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5279c45", new Object[]{this, str});
        } else {
            ckf.g(str, "title");
        }
    }
}
