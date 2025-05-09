package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kqj {

    /* renamed from: a  reason: collision with root package name */
    public final String f22854a;
    public final Map<String, ? extends Object> b;
    public final Map<String, ? extends Object> c;
    public final String d;
    public final lqj e;
    public final boolean f;

    static {
        t2o.a(525337309);
    }

    public kqj() {
        this.f22854a = "";
        this.f = true;
    }

    public kqj(Map<String, ? extends Object> map) {
        this();
        lqj lqjVar = null;
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f22854a = x;
            this.b = MegaUtils.s(map, "extQuery");
            this.c = MegaUtils.s(map, "nativeParams");
            this.d = MegaUtils.x(map, "elementID", null);
            if (map != null && map.containsKey("elementRect")) {
                lqjVar = new lqj(MegaUtils.s(map, "elementRect"));
            }
            this.e = lqjVar;
            Boolean h = MegaUtils.h(map, "animated", Boolean.TRUE);
            this.f = h != null ? h.booleanValue() : true;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
