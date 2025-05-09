package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zbj {

    /* renamed from: a  reason: collision with root package name */
    public final String f32666a;
    public final boolean b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525337282);
    }

    public zbj() {
        this.f32666a = "";
    }

    public zbj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, mh1.PRD_P4P_URL, null);
        if (x != null) {
            this.f32666a = x;
            Boolean h = MegaUtils.h(map, "isOpenPage", Boolean.FALSE);
            this.b = h != null ? h.booleanValue() : false;
            this.c = MegaUtils.s(map, "extInfo");
            return;
        }
        throw new RuntimeException("clickUrl 参数必传！");
    }
}
