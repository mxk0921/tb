package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jn4 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22088a;
    public final int b;

    static {
        t2o.a(525336818);
    }

    public jn4() {
    }

    public jn4(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "enable", null);
        if (h != null) {
            this.f22088a = h.booleanValue();
            Integer m = MegaUtils.m(map, "tabIndex", null);
            if (m != null) {
                this.b = m.intValue();
                return;
            }
            throw new RuntimeException("tabIndex 参数必传！");
        }
        throw new RuntimeException("enable 参数必传！");
    }
}
