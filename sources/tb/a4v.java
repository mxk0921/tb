package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a4v {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f15545a;
    public final String b;

    static {
        t2o.a(525337606);
    }

    public a4v() {
        this.b = "";
    }

    public a4v(Map<String, ? extends Object> map) {
        this();
        this.f15545a = MegaUtils.h(map, "useTopVisiblePage", null);
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.b = x;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
