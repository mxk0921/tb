package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ccj {

    /* renamed from: a  reason: collision with root package name */
    public final String f16973a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525337285);
    }

    public ccj() {
        this.f16973a = "";
        this.b = "";
        this.c = "";
    }

    public ccj(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f16973a = x;
            String x2 = MegaUtils.x(map, "sellerID", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "itemID", null);
                if (x3 != null) {
                    this.c = x3;
                    Boolean h = MegaUtils.h(map, "isTmall", Boolean.FALSE);
                    this.d = h != null ? h.booleanValue() : false;
                    this.e = MegaUtils.s(map, "extInfo");
                    return;
                }
                throw new RuntimeException("itemID 参数必传！");
            }
            throw new RuntimeException("sellerID 参数必传！");
        }
        throw new RuntimeException("url 参数必传！");
    }
}
