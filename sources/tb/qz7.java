package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final qz7 INSTANCE = new qz7();
    public static final String TAG_FAST_ANIM = "dress_up无极缩放";

    static {
        t2o.a(918552609);
    }

    @JvmStatic
    public static final void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff8aadf", new Object[]{str, str2, th});
        } else if (str != null) {
            tpu.Companion.a(str, str2, th);
        }
    }
}
