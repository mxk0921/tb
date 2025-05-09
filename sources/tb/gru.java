package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gru {

    /* renamed from: a  reason: collision with root package name */
    public final String f20183a;
    public final String b;
    public final String c;

    static {
        t2o.a(525337577);
    }

    public gru() {
        this.f20183a = "";
        this.b = "";
    }

    public gru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f20183a = x;
            String x2 = MegaUtils.x(map, "pageKey", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.x(map, "name", null);
                return;
            }
            throw new RuntimeException("pageKey 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
