package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rve {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "homepage_switch";

    static {
        t2o.a(487587941);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        return ry8.b().a(str, str2, str3);
    }
}
