package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ty8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f29030a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525336902);
    }

    public ty8() {
        this.f29030a = "";
    }

    public ty8(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizid", null);
        if (x != null) {
            this.f29030a = x;
            this.b = MegaUtils.s(map, "extInfo");
            return;
        }
        throw new RuntimeException("bizid 参数必传！");
    }
}
