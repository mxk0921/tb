package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class fzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1022362009);
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2a15034", new Object[0]);
        }
        String uuid = UUID.randomUUID().toString();
        ckf.f(uuid, "toString(...)");
        return uuid;
    }
}
