package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ocx {

    /* renamed from: a  reason: collision with root package name */
    public final String f25304a;
    public final String b;

    static {
        t2o.a(525337673);
    }

    public ocx() {
        this.f25304a = "";
        this.b = "";
    }

    public ocx(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "typeID", null);
        if (x != null) {
            this.f25304a = x;
            String x2 = MegaUtils.x(map, "widgetType", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("widgetType 参数必传！");
        }
        throw new RuntimeException("typeID 参数必传！");
    }
}
