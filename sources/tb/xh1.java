package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xh1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31393a;

    static {
        t2o.a(525336719);
    }

    public xh1() {
    }

    public xh1(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "value", null);
        if (h != null) {
            this.f31393a = h.booleanValue();
            return;
        }
        throw new RuntimeException("value 参数必传！");
    }
}
