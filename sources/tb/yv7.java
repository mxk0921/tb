package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Double f32373a;

    static {
        t2o.a(1022361668);
    }

    public yv7(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f32373a = ht4.b(map, "progress");
    }

    public final Double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("ba08bf76", new Object[]{this});
        }
        return this.f32373a;
    }
}
