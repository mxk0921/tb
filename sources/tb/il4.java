package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class il4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f21375a;
    public final String b;
    public final String c;
    public final String d;
    public final vm4 e;
    public final String f;

    static {
        t2o.a(525336788);
    }

    public il4() {
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public il4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "index", null);
        if (m != null) {
            this.f21375a = m.intValue();
            String x = MegaUtils.x(map, pl4.KEY_PAGE_ID, null);
            if (x != null) {
                this.b = x;
                String x2 = MegaUtils.x(map, "iconNormal", null);
                if (x2 != null) {
                    this.c = x2;
                    String x3 = MegaUtils.x(map, "iconSelected", null);
                    if (x3 != null) {
                        this.d = x3;
                        this.e = (map == null || !map.containsKey("queryPass")) ? null : new vm4(MegaUtils.s(map, "queryPass"));
                        this.f = MegaUtils.x(map, "label", null);
                        return;
                    }
                    throw new RuntimeException("iconSelected 参数必传！");
                }
                throw new RuntimeException("iconNormal 参数必传！");
            }
            throw new RuntimeException("pageId 参数必传！");
        }
        throw new RuntimeException("index 参数必传！");
    }
}
