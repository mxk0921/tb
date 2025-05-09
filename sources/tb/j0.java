package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21673a;
    public final String b;
    public final String c;

    static {
        t2o.a(525336582);
    }

    public j0() {
        this.f21673a = "";
        this.b = "";
        this.c = "";
    }

    public j0(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "component", null);
        if (x != null) {
            this.f21673a = x;
            String x2 = MegaUtils.x(map, "module", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "variable", null);
                if (x3 != null) {
                    this.c = x3;
                    return;
                }
                throw new RuntimeException("variable 参数必传！");
            }
            throw new RuntimeException("module 参数必传！");
        }
        throw new RuntimeException("component 参数必传！");
    }
}
