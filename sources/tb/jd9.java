package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jd9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21932a;
    public final boolean b;

    static {
        t2o.a(525336943);
    }

    public jd9() {
        this.f21932a = "";
    }

    public jd9(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "path", null);
        if (x != null) {
            this.f21932a = x;
            Boolean h = MegaUtils.h(map, "recursive", Boolean.FALSE);
            this.b = h != null ? h.booleanValue() : false;
            return;
        }
        throw new RuntimeException("path 参数必传！");
    }
}
