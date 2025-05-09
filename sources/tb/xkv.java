package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(856686605);
    }

    public static String a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcb09f0d", new Object[]{str});
        }
        return wp1.k(str.getBytes());
    }
}
