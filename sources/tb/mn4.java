package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mn4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f24160a;
    public final int b;

    static {
        t2o.a(525336821);
    }

    public mn4() {
    }

    public mn4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "swiperIndex", null);
        if (m != null) {
            this.f24160a = m.intValue();
            int i = 0;
            Integer m2 = MegaUtils.m(map, "tabIndex", 0);
            this.b = m2 != null ? m2.intValue() : i;
            return;
        }
        throw new RuntimeException("swiperIndex 参数必传！");
    }
}
