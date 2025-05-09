package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lf0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f23307a;
    public final String b;
    public final String c;

    static {
        t2o.a(525336691);
    }

    public lf0() {
        this.b = "";
    }

    public lf0(Map<String, ? extends Object> map) {
        this();
        this.f23307a = MegaUtils.s(map, "data");
        String x = MegaUtils.x(map, "scene", null);
        if (x != null) {
            this.b = x;
            this.c = MegaUtils.x(map, "url", null);
            MegaUtils.x(map, "bizId", null);
            return;
        }
        throw new RuntimeException("scene 参数必传！");
    }
}
