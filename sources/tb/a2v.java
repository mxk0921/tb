package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a2v {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f15519a;
    public final String b;

    static {
        t2o.a(525337591);
    }

    public a2v() {
    }

    public a2v(Map<String, ? extends Object> map) {
        this();
        this.f15519a = MegaUtils.h(map, "useTopVisiblePage", null);
        this.b = MegaUtils.x(map, "pageName", null);
    }
}
