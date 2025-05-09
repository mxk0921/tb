package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class d98 {

    /* renamed from: a  reason: collision with root package name */
    public final String f17665a;

    static {
        t2o.a(525336875);
    }

    public d98() {
        this.f17665a = "";
    }

    public d98(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f17665a = x;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
