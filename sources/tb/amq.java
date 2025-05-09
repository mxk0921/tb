package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class amq {

    /* renamed from: a  reason: collision with root package name */
    public final String f15852a;
    public final String b;

    static {
        t2o.a(525337525);
    }

    public amq() {
        this.f15852a = "";
        this.b = "";
    }

    public amq(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "startTime", null);
        if (x != null) {
            this.f15852a = x;
            String x2 = MegaUtils.x(map, "endTime", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("endTime 参数必传！");
        }
        throw new RuntimeException("startTime 参数必传！");
    }
}
