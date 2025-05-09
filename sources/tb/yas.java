package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yas {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yas INSTANCE = new yas();

    static {
        t2o.a(847249545);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7651a66e", new Object[0]);
        } else if (yox.g() == null) {
            ppx.b();
        }
    }
}
