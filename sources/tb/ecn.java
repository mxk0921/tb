package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ecn {

    /* renamed from: a  reason: collision with root package name */
    public final String f18475a;
    public final double b;

    static {
        t2o.a(525337470);
    }

    public ecn() {
        this.f18475a = "";
    }

    public ecn(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f18475a = x;
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
