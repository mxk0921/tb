package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mc {

    /* renamed from: a  reason: collision with root package name */
    public final String f23933a;
    public final String b;

    static {
        t2o.a(525336584);
    }

    public mc() {
        this.f23933a = "";
        this.b = "";
    }

    public mc(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f23933a = x;
            String x2 = MegaUtils.x(map, "value", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("value 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
