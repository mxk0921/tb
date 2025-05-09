package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c98 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16923a;

    static {
        t2o.a(525336874);
    }

    public c98() {
        this.f16923a = "";
    }

    public c98(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "userId", null);
        if (x != null) {
            this.f16923a = x;
            return;
        }
        throw new RuntimeException("userId 参数必传！");
    }
}
