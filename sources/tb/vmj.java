package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vmj {

    /* renamed from: a  reason: collision with root package name */
    public final String f30104a;

    static {
        t2o.a(525337296);
    }

    public vmj() {
        this.f30104a = "";
    }

    public vmj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "title", null);
        if (x != null) {
            this.f30104a = x;
            return;
        }
        throw new RuntimeException("title 参数必传！");
    }
}
