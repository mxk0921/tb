package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ia3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21184a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525336758);
    }

    public ia3() {
        this.f21184a = "";
    }

    public ia3(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "callbackID", null);
        if (x != null) {
            this.f21184a = x;
            MegaUtils.h(map, "success", null);
            this.b = MegaUtils.s(map, "data");
            return;
        }
        throw new RuntimeException("callbackID 参数必传！");
    }
}
