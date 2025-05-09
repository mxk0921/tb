package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bmq {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16484a;

    static {
        t2o.a(525337526);
    }

    public bmq() {
    }

    public bmq(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "status", null);
        if (h != null) {
            this.f16484a = h.booleanValue();
            return;
        }
        throw new RuntimeException("status 参数必传！");
    }
}
