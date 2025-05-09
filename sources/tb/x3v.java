package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class x3v {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f31126a;
    public final String b;

    static {
        t2o.a(525337603);
    }

    public x3v() {
        this.b = "";
    }

    public x3v(Map<String, ? extends Object> map) {
        this();
        this.f31126a = MegaUtils.h(map, "useTopVisiblePage", null);
        String x = MegaUtils.x(map, "pageName", null);
        if (x != null) {
            this.b = x;
            return;
        }
        throw new RuntimeException("pageName 参数必传！");
    }
}
