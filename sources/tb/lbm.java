package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lbm {

    /* renamed from: a  reason: collision with root package name */
    public final String f23235a;
    public final mbm b;
    public final String c;

    static {
        t2o.a(525337418);
    }

    public lbm() {
        this.f23235a = "";
    }

    public lbm(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "code", null);
        if (x != null) {
            this.f23235a = x;
            if (MegaUtils.h(map, "isOnline", null) != null) {
                this.b = (map == null || !map.containsKey("config")) ? null : new mbm(MegaUtils.s(map, "config"));
                this.c = MegaUtils.x(map, "params", null);
                return;
            }
            throw new RuntimeException("isOnline 参数必传！");
        }
        throw new RuntimeException("code 参数必传！");
    }
}
