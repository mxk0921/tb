package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class y2l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31808a;
    public final String b;
    public final int c;
    public final String d;
    public final Map<String, ? extends Object> e;
    public final String f;

    static {
        t2o.a(525337341);
    }

    public y2l() {
        this.f31808a = true;
        this.b = "";
        this.c = 1;
    }

    public y2l(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "showSKU", Boolean.TRUE);
        int i = 1;
        this.f31808a = h != null ? h.booleanValue() : true;
        String x = MegaUtils.x(map, "itemId", null);
        if (x != null) {
            this.b = x;
            Integer m = MegaUtils.m(map, "quantity", 1);
            this.c = m != null ? m.intValue() : i;
            this.d = MegaUtils.x(map, q2q.KEY_SKU_ID, null);
            this.e = MegaUtils.s(map, "exParams");
            this.f = MegaUtils.x(map, "cartFrom", null);
            return;
        }
        throw new RuntimeException("itemId 参数必传！");
    }
}
