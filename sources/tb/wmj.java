package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class wmj {

    /* renamed from: a  reason: collision with root package name */
    public final String f30778a;

    static {
        t2o.a(525337297);
    }

    public wmj() {
        this.f30778a = "";
    }

    public wmj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f30778a = x;
            return;
        }
        throw new RuntimeException("url 参数必传！");
    }
}
