package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class az7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final az7 INSTANCE = new az7();
    public static final String VALUE_TRUE = "true";

    static {
        t2o.a(918552583);
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3c0d8c", new Object[0])).booleanValue();
        }
        return INSTANCE.a("dress_up_enable_mask_frame_anim", "true");
    }

    public final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daca078", new Object[]{this, str, str2})).booleanValue();
        }
        return ckf.b("true", byj.Z(str, str2));
    }
}
