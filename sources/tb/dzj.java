package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809834);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b61a69f", new Object[]{str});
        }
        return "lastResultVersion_" + str;
    }
}
