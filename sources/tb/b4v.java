package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b4v {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f16180a;
    public final String b;

    static {
        t2o.a(525337607);
    }

    public b4v() {
    }

    public b4v(Map<String, ? extends Object> map) {
        this();
        this.f16180a = MegaUtils.h(map, "useTopVisiblePage", null);
        this.b = MegaUtils.x(map, "utParamJsonStr", null);
    }
}
