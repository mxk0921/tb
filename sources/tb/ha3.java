package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ha3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f20496a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525336757);
    }

    public ha3() {
        this.f20496a = "";
        this.b = "";
    }

    public ha3(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "instanceID", null);
        if (x != null) {
            this.f20496a = x;
            String x2 = MegaUtils.x(map, "method", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.s(map, "params");
                return;
            }
            throw new RuntimeException("method 参数必传！");
        }
        throw new RuntimeException("instanceID 参数必传！");
    }
}
