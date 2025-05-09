package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lqj {

    /* renamed from: a  reason: collision with root package name */
    public final double f23513a;
    public final double b;
    public final double c;
    public final double d;

    static {
        t2o.a(525337310);
    }

    public lqj() {
    }

    public lqj(Map<String, ? extends Object> map) {
        this();
        Double j = MegaUtils.j(map, "x", null);
        if (j != null) {
            this.f23513a = j.doubleValue();
            Double j2 = MegaUtils.j(map, "y", null);
            if (j2 != null) {
                this.b = j2.doubleValue();
                Double j3 = MegaUtils.j(map, "width", null);
                if (j3 != null) {
                    this.c = j3.doubleValue();
                    Double j4 = MegaUtils.j(map, "height", null);
                    if (j4 != null) {
                        this.d = j4.doubleValue();
                        return;
                    }
                    throw new RuntimeException("height 参数必传！");
                }
                throw new RuntimeException("width 参数必传！");
            }
            throw new RuntimeException("y 参数必传！");
        }
        throw new RuntimeException("x 参数必传！");
    }
}
