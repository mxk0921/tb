package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class eg7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18555a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525336858);
    }

    public eg7() {
        this.f18555a = "";
    }

    public eg7(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "token", null);
        if (x != null) {
            this.f18555a = x;
            this.b = MegaUtils.s(map, "data");
            return;
        }
        throw new RuntimeException("token 参数必传！");
    }
}
