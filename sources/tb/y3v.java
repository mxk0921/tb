package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class y3v {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f31836a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525337604);
    }

    public y3v() {
    }

    public y3v(Map<String, ? extends Object> map) {
        this();
        this.f31836a = MegaUtils.h(map, "useTopVisiblePage", null);
        this.b = MegaUtils.s(map, "utData");
    }
}
