package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ld9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23270a;
    public final String b;

    static {
        t2o.a(525336946);
    }

    public ld9() {
        this.f23270a = "";
        this.b = "";
    }

    public ld9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "src", null);
        if (x != null) {
            this.f23270a = x;
            String x2 = MegaUtils.x(map, "dest", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("dest 参数必传！");
        }
        throw new RuntimeException("src 参数必传！");
    }
}
