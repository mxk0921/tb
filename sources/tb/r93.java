package tb;

import com.alibaba.android.icart.core.performance.preloader.task.impl.CartFirstPageRequestPreloader;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class r93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r93 INSTANCE = new r93();

    static {
        t2o.a(479199357);
    }

    public final void a(Map<Object, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68683d64", new Object[]{this, map});
        } else if (map != null && !map.isEmpty() && vav.b(c9x.CART_BIZ_NAME, na3.sResetPreRequestDataWhenAddCart, false, true)) {
            CartFirstPageRequestPreloader.INSTANCE.h(to8.ADD_CART);
        }
    }
}
