package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class v2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final v2i INSTANCE = new v2i();

    static {
        t2o.a(839909911);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        o2u.INSTANCE.i();
        ahv.INSTANCE.d();
    }
}
