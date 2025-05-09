package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j3r {

    /* renamed from: a  reason: collision with root package name */
    public final String f21744a;

    static {
        t2o.a(525337539);
    }

    public j3r() {
        this.f21744a = "";
    }

    public j3r(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f21744a = x;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
