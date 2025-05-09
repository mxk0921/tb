package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ngj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946267);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89574296", new Object[]{str, str2});
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
