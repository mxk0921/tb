package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class k70 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22442a;
    public final String b;

    static {
        t2o.a(525336687);
    }

    public k70() {
        this.f22442a = "";
    }

    public k70(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "serviceID", null);
        if (x != null) {
            this.f22442a = x;
            this.b = MegaUtils.x(map, "tag", null);
            return;
        }
        throw new RuntimeException("serviceID 参数必传！");
    }
}
