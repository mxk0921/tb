package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kn4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f22775a;
    public final String b;
    public final String c;
    public final String d;
    public final vm4 e;
    public final String f;

    static {
        t2o.a(525336819);
    }

    public kn4() {
    }

    public kn4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "index", null);
        if (m != null) {
            this.f22775a = m.intValue();
            this.b = MegaUtils.x(map, pl4.KEY_PAGE_ID, null);
            this.c = MegaUtils.x(map, "iconNormal", null);
            this.d = MegaUtils.x(map, "iconSelected", null);
            this.e = (map == null || !map.containsKey("queryPass")) ? null : new vm4(MegaUtils.s(map, "queryPass"));
            this.f = MegaUtils.x(map, "label", null);
            return;
        }
        throw new RuntimeException("index 参数必传！");
    }
}
