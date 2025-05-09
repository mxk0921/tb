package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vwi INSTANCE = new vwi();

    static {
        t2o.a(481297059);
    }

    @JvmStatic
    public static final void a(String str, Long l, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46240b4", new Object[]{str, l, l2});
        } else if (l != null && l.longValue() > 0) {
            wwi.INSTANCE.d(str, l, l2);
        }
    }
}
