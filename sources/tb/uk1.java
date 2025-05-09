package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class uk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final uk1 INSTANCE = new uk1();

    static {
        t2o.a(730857698);
    }

    @JvmStatic
    public static final long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be73d75d", new Object[]{context})).longValue();
        }
        ckf.g(context, "context");
        if (lg4.K4()) {
            return 300000L;
        }
        long B1 = lg4.B1();
        if (!lg4.o1()) {
            return B1;
        }
        if (lg4.R1() > 0) {
            return lg4.Q1();
        }
        long z3 = lg4.z3();
        if (u7m.d(context)) {
            long j = 1000;
            if (System.currentTimeMillis() > (trl.d(lk0.a(), System.currentTimeMillis() / j) + ((long) ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) * j) {
                return B1;
            }
        }
        return z3;
    }
}
