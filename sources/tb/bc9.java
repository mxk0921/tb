package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bc9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16314a;

    static {
        t2o.a(525336920);
    }

    public bc9() {
        this.f16314a = "";
    }

    public bc9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f16314a = x;
            return;
        }
        throw new RuntimeException("path 参数必传！");
    }
}
