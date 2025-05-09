package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093544);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8312b388", new Object[0]);
        }
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
