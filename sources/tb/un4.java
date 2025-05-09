package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class un4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f29508a;
    public final String b;

    static {
        t2o.a(525336828);
    }

    public un4() {
        this.b = "";
    }

    public un4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "index", null);
        if (m != null) {
            this.f29508a = m.intValue();
            String x = MegaUtils.x(map, "text", null);
            if (x != null) {
                this.b = x;
                return;
            }
            throw new RuntimeException("text 参数必传！");
        }
        throw new RuntimeException("index 参数必传！");
    }
}
