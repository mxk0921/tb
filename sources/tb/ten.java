package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ten {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(856686640);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("374b20c5", new Object[0]);
        }
        try {
            return UUID.randomUUID().toString().replace("-", "");
        } catch (Exception unused) {
            return null;
        }
    }
}
