package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jru {

    /* renamed from: a  reason: collision with root package name */
    public final String f22177a;
    public final String b;

    static {
        t2o.a(525337580);
    }

    public jru() {
        this.f22177a = "";
        this.b = "";
    }

    public jru(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f22177a = x;
            String x2 = MegaUtils.x(map, "pageKey", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("pageKey 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
