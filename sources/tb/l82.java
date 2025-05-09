package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class l82 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23165a;
    public final k82 b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final k82 g;
    public final Map<String, ? extends Object> h;

    static {
        t2o.a(525336730);
    }

    public l82() {
    }

    public l82(Map<String, ? extends Object> map) {
        this();
        k82 k82Var = null;
        this.f23165a = MegaUtils.x(map, "bizID", null);
        this.b = (map == null || !map.containsKey("rect")) ? null : new k82(MegaUtils.s(map, "rect"));
        this.c = MegaUtils.m(map, "index", null);
        this.d = MegaUtils.x(map, "pvID", null);
        this.e = MegaUtils.x(map, yj4.PARAM_SEARCH_KEYWORD_RN, null);
        this.f = MegaUtils.x(map, "firstRN", null);
        if (map != null && map.containsKey("visualRect")) {
            k82Var = new k82(MegaUtils.s(map, "visualRect"));
        }
        this.g = k82Var;
        this.h = MegaUtils.s(map, "ext");
    }
}
