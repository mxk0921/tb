package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hru {

    /* renamed from: a  reason: collision with root package name */
    public final String f20847a;
    public final String b;
    public final Boolean c;

    static {
        t2o.a(525337578);
    }

    public hru() {
        this.f20847a = "";
        this.b = "";
    }

    public hru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f20847a = x;
            String x2 = MegaUtils.x(map, "name", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.h(map, "useTopVisiblePage", null);
                return;
            }
            throw new RuntimeException("name 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
