package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515985);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("343bc0cf", new Object[]{str, str2});
        }
        return "";
    }
}
