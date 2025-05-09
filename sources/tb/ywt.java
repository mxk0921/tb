package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ywt {
    static {
        t2o.a(525337553);
    }

    public ywt() {
    }

    public ywt(Map<String, ? extends Object> map) {
        this();
        if (MegaUtils.x(map, "strongGuidePopTitle", null) == null) {
            throw new RuntimeException("strongGuidePopTitle 参数必传！");
        } else if (MegaUtils.x(map, "strongGuidePopDesc", null) == null) {
            throw new RuntimeException("strongGuidePopDesc 参数必传！");
        }
    }
}
