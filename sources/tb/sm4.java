package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sm4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f28143a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525336802);
    }

    public sm4() {
        this.f28143a = "";
    }

    public sm4(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "pageID", null);
        if (x != null) {
            this.f28143a = x;
            this.b = MegaUtils.s(map, "props");
            return;
        }
        throw new RuntimeException("pageID 参数必传！");
    }
}
