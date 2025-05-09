package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hl4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f20718a;
    public final String b;
    public final int c;

    static {
        t2o.a(525336787);
    }

    public hl4() {
        this.b = "";
    }

    public hl4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "index", null);
        if (m != null) {
            this.f20718a = m.intValue();
            String x = MegaUtils.x(map, pl4.KEY_PAGE_ID, null);
            if (x != null) {
                this.b = x;
                Integer m2 = MegaUtils.m(map, "tabIndex", null);
                if (m2 != null) {
                    this.c = m2.intValue();
                    return;
                }
                throw new RuntimeException("tabIndex 参数必传！");
            }
            throw new RuntimeException("pageId 参数必传！");
        }
        throw new RuntimeException("index 参数必传！");
    }
}
