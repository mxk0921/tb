package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lru {

    /* renamed from: a  reason: collision with root package name */
    public final String f23535a;
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525337584);
    }

    public lru() {
        this.f23535a = "";
        this.b = "";
    }

    public lru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f23535a = x;
            String x2 = MegaUtils.x(map, "pageKey", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.x(map, "name", null);
                this.d = MegaUtils.x(map, "type", null);
                this.e = MegaUtils.s(map, "info");
                return;
            }
            throw new RuntimeException("pageKey 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
