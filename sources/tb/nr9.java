package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstanceConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class nr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nr9 INSTANCE = new nr9();

    static {
        t2o.a(468714708);
    }

    public final FluidInstanceConfig a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstanceConfig) ipChange.ipc$dispatch("4189ca3f", new Object[]{this, context});
        }
        ckf.g(context, "context");
        FluidInstanceConfig d = FluidInstanceConfig.a.p().e(context).t(Boolean.TRUE).b(mr9.BIZ_NAME_RECOMMEND_TAB).a(sj4.BIZ_GROUP_NAME).r("preloadVideo").d();
        ckf.f(d, "FluidInstanceConfig.Buil…NES)\n            .build()");
        return d;
    }
}
