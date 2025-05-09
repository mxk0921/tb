package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tmj {

    /* renamed from: a  reason: collision with root package name */
    public final String f28804a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map<String, ? extends Object> f;

    static {
        t2o.a(525337292);
    }

    public tmj() {
        this.f28804a = "";
        this.e = "";
    }

    public tmj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "businessId", null);
        if (x != null) {
            this.f28804a = x;
            this.b = MegaUtils.x(map, "title", null);
            this.c = MegaUtils.x(map, "text", null);
            this.d = MegaUtils.x(map, "image", null);
            String x2 = MegaUtils.x(map, "url", null);
            if (x2 != null) {
                this.e = x2;
                this.f = MegaUtils.s(map, "templateParams");
                return;
            }
            throw new RuntimeException("url 参数必传！");
        }
        throw new RuntimeException("businessId 参数必传！");
    }
}
