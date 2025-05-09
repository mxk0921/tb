package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ln4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23434a;
    public final double b;

    static {
        t2o.a(525336820);
    }

    public ln4() {
        this.f23434a = "";
    }

    public ln4(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "headerPageId", null);
        if (x != null) {
            this.f23434a = x;
            Double j = MegaUtils.j(map, "height", null);
            if (j != null) {
                this.b = j.doubleValue();
                return;
            }
            throw new RuntimeException("height 参数必传！");
        }
        throw new RuntimeException("headerPageId 参数必传！");
    }
}
