package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nt2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f24937a;
    public final String b;
    public final Integer c;
    public final Integer d;

    static {
        t2o.a(525336752);
    }

    public nt2() {
        this.f24937a = "";
    }

    public nt2(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "name", null);
        if (x != null) {
            this.f24937a = x;
            this.b = MegaUtils.x(map, "cacheTag", null);
            this.c = MegaUtils.m(map, "transferSize", null);
            this.d = MegaUtils.m(map, "encodedBodySize", null);
            return;
        }
        throw new RuntimeException("name 参数必传！");
    }
}
