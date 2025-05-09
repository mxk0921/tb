package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dcn {

    /* renamed from: a  reason: collision with root package name */
    public final String f17728a;
    public final String b;

    static {
        t2o.a(525337467);
    }

    public dcn() {
        this.f17728a = "";
        this.b = "";
    }

    public dcn(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f17728a = x;
            String x2 = MegaUtils.x(map, "value", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("value 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
