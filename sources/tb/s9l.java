package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class s9l {

    /* renamed from: a  reason: collision with root package name */
    public final String f27885a;
    public final String b;

    static {
        t2o.a(525337360);
    }

    public s9l() {
        this.f27885a = "";
        this.b = "";
    }

    public s9l(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "group", null);
        if (x != null) {
            this.f27885a = x;
            String x2 = MegaUtils.x(map, "key", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("key 参数必传！");
        }
        throw new RuntimeException("group 参数必传！");
    }
}
