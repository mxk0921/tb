package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nru {

    /* renamed from: a  reason: collision with root package name */
    public final String f24912a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525337586);
    }

    public nru() {
        this.f24912a = "";
        this.b = a.h();
    }

    public nru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f24912a = x;
            Map<String, ? extends Object> s = MegaUtils.s(map, "info");
            if (s != null) {
                this.b = s;
                return;
            }
            throw new RuntimeException("info 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
