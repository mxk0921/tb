package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nc {

    /* renamed from: a  reason: collision with root package name */
    public final String f24627a;
    public final double b;

    static {
        t2o.a(525336585);
    }

    public nc() {
        this.f24627a = "";
    }

    public nc(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f24627a = x;
            Double j = MegaUtils.j(map, "value", null);
            if (j != null) {
                this.b = j.doubleValue();
                return;
            }
            throw new RuntimeException("value 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
