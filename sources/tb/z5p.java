package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class z5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z5p INSTANCE = new z5p();

    static {
        t2o.a(993002176);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66b3b647", new Object[0]);
        }
        return null;
    }
}
