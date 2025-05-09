package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tev {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f28669a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525337641);
    }

    public tev() {
    }

    public tev(Map<String, ? extends Object> map) {
        this();
        this.f28669a = MegaUtils.h(map, "success", null);
        this.b = MegaUtils.s(map, "data");
        MegaUtils.x(map, "errorCode", null);
        MegaUtils.x(map, "errorMsg", null);
    }
}
