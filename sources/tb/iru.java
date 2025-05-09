package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iru {

    /* renamed from: a  reason: collision with root package name */
    public final String f21534a;
    public final String b;

    static {
        t2o.a(525337579);
    }

    public iru() {
        this.f21534a = "";
        this.b = "";
    }

    public iru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f21534a = x;
            String x2 = MegaUtils.x(map, "name", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("name 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
