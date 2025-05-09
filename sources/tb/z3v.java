package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.UTStatus;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class z3v {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f32513a;
    public final String b;

    static {
        t2o.a(525337605);
    }

    public z3v() {
    }

    public z3v(Map<String, ? extends Object> map) {
        this();
        this.f32513a = MegaUtils.h(map, "useTopVisiblePage", null);
        this.b = UTStatus.Companion.a(MegaUtils.x(map, "utStatus", null));
    }
}
