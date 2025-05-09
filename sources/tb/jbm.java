package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jbm {

    /* renamed from: a  reason: collision with root package name */
    public final String f21893a;

    static {
        t2o.a(525337411);
    }

    public jbm() {
        this.f21893a = "";
    }

    public jbm(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "action", null);
        if (x != null) {
            this.f21893a = x;
            return;
        }
        throw new RuntimeException("action 参数必传！");
    }
}
