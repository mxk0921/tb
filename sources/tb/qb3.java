package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26645a = false;

    static {
        t2o.a(478150888);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372e1514", new Object[0]);
        } else if (!f26645a) {
            f26645a = true;
            vav.h(c9x.CART_BIZ_NAME, new de3());
            Config config = new Config();
            config.walSize = 1048576;
            m9v.e(c9x.CART_BIZ_NAME, config);
        }
    }
}
