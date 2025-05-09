package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class r9l {

    /* renamed from: a  reason: collision with root package name */
    public final String f27211a;

    static {
        t2o.a(525337359);
    }

    public r9l() {
        this.f27211a = "";
    }

    public r9l(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "group", null);
        if (x != null) {
            this.f27211a = x;
            return;
        }
        throw new RuntimeException("group 参数必传！");
    }
}
