package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pn4 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26193a;

    static {
        t2o.a(525336822);
    }

    public pn4() {
    }

    public pn4(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "status", null);
        if (h != null) {
            this.f26193a = h.booleanValue();
            return;
        }
        throw new RuntimeException("status 参数必传！");
    }
}
