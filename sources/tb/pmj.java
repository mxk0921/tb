package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pmj {

    /* renamed from: a  reason: collision with root package name */
    public final String f26186a;

    static {
        t2o.a(525337287);
    }

    public pmj() {
        this.f26186a = "";
    }

    public pmj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "color", null);
        if (x != null) {
            this.f26186a = x;
            return;
        }
        throw new RuntimeException("color 参数必传！");
    }
}
