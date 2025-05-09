package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class i70 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21133a;
    public final String b;

    static {
        t2o.a(525336685);
    }

    public i70() {
        this.b = "";
    }

    public i70(Map<String, ? extends Object> map) {
        this();
        this.f21133a = MegaUtils.x(map, "tag", null);
        String x = MegaUtils.x(map, "listenerKey", null);
        if (x != null) {
            this.b = x;
            return;
        }
        throw new RuntimeException("listenerKey 参数必传！");
    }
}
