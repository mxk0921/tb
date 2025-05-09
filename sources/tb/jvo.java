package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jvo {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22242a;

    static {
        t2o.a(525337486);
    }

    public jvo() {
    }

    public jvo(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "on", null);
        if (h != null) {
            this.f22242a = h.booleanValue();
            return;
        }
        throw new RuntimeException("on 参数必传！");
    }
}
