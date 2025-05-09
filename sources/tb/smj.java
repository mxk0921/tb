package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class smj {

    /* renamed from: a  reason: collision with root package name */
    public final String f28147a;
    public final String b;

    static {
        t2o.a(525337290);
    }

    public smj() {
        this.f28147a = "";
        this.b = "";
    }

    public smj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, ccs.KEY_RIGHT_ITEM_LIGHT_IMAGE_URL, null);
        if (x != null) {
            this.f28147a = x;
            String x2 = MegaUtils.x(map, ccs.KEY_RIGHT_ITEM_DARK_IMAGE_URL, null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("darkImageUrl 参数必传！");
        }
        throw new RuntimeException("lightImageUrl 参数必传！");
    }
}
