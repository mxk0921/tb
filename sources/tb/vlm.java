package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vlm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f30088a;
    public final Integer b;
    public final Integer c;
    public final String d;

    static {
        t2o.a(525337454);
    }

    public vlm() {
    }

    public vlm(Map<String, ? extends Object> map) {
        this();
        this.f30088a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.m(map, "index", null);
        this.c = MegaUtils.m(map, "pageSize", null);
        this.d = MegaUtils.x(map, "topic", null);
    }
}
