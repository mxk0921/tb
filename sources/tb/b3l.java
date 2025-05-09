package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b3l {

    /* renamed from: a  reason: collision with root package name */
    public final String f16157a;

    static {
        t2o.a(525337343);
    }

    public b3l() {
        this.f16157a = "";
    }

    public b3l(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "scopeNicks", null);
        if (x != null) {
            this.f16157a = x;
            return;
        }
        throw new RuntimeException("scopeNicks 参数必传！");
    }
}
