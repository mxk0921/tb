package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class amm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f15838a;
    public final String b;

    static {
        t2o.a(525337458);
    }

    public amm() {
    }

    public amm(Map<String, ? extends Object> map) {
        this();
        this.f15838a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.x(map, "topic", null);
        MegaUtils.x(map, l2o.COL_BTAG, null);
        MegaUtils.x(map, "from", null);
    }
}
