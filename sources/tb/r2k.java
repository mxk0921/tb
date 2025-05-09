package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class r2k {

    /* renamed from: a  reason: collision with root package name */
    public final String f27062a;

    static {
        t2o.a(525337316);
    }

    public r2k() {
        this.f27062a = "";
    }

    public r2k(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, FluidException.SERVICE_NAME, null);
        if (x != null) {
            this.f27062a = x;
            return;
        }
        throw new RuntimeException("serviceName 参数必传！");
    }
}
