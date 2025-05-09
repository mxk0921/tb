package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mbj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515974);
    }

    public static String a(String str, String[] strArr, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("322a29c3", new Object[]{str, strArr, str2});
        }
        return "";
    }
}
