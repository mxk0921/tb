package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mru {

    /* renamed from: a  reason: collision with root package name */
    public final String f24264a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525337585);
    }

    public mru() {
        this.f24264a = "";
        this.b = "";
        this.c = a.h();
    }

    public mru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f24264a = x;
            String x2 = MegaUtils.x(map, "pageKey", null);
            if (x2 != null) {
                this.b = x2;
                Map<String, ? extends Object> s = MegaUtils.s(map, "info");
                if (s != null) {
                    this.c = s;
                    return;
                }
                throw new RuntimeException("info 参数必传！");
            }
            throw new RuntimeException("pageKey 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
