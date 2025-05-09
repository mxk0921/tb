package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mcx {

    /* renamed from: a  reason: collision with root package name */
    public final String f23954a;
    public final String b;

    static {
        t2o.a(525337669);
    }

    public mcx() {
        this.f23954a = "";
        this.b = "";
    }

    public mcx(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "typeID", null);
        if (x != null) {
            this.f23954a = x;
            String x2 = MegaUtils.x(map, "widgetID", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("widgetID 参数必传！");
        }
        throw new RuntimeException("typeID 参数必传！");
    }
}
