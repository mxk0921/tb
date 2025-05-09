package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class e71 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18336a;
    public final String b;
    public final double c;
    public final Map<String, ? extends Object> d;

    static {
        t2o.a(525336714);
    }

    public e71() {
        this.f18336a = "";
        this.b = "";
        this.c = 1.0d;
    }

    public e71(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "module", null);
        if (x != null) {
            this.f18336a = x;
            String x2 = MegaUtils.x(map, "monitorPoint", null);
            if (x2 != null) {
                this.b = x2;
                double d = 1.0d;
                Double j = MegaUtils.j(map, "value", Double.valueOf(1.0d));
                this.c = j != null ? j.doubleValue() : d;
                this.d = MegaUtils.s(map, "args");
                return;
            }
            throw new RuntimeException("monitorPoint 参数必传！");
        }
        throw new RuntimeException("module 参数必传！");
    }
}
