package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cho {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f17064a;
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525337472);
    }

    public cho() {
    }

    public cho(Map<String, ? extends Object> map) {
        this();
        this.f17064a = MegaUtils.s(map, "windowInfo");
        this.b = MegaUtils.x(map, "type", null);
        this.c = MegaUtils.x(map, "url", null);
        this.d = MegaUtils.x(map, "pageID", null);
        this.e = MegaUtils.s(map, "props");
    }
}
