package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kru {

    /* renamed from: a  reason: collision with root package name */
    public final String f22876a;

    static {
        t2o.a(525337581);
    }

    public kru() {
        this.f22876a = "";
    }

    public kru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f22876a = x;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }
}
