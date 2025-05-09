package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class plm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f26156a;
    public final String b;
    public final String c;

    static {
        t2o.a(525337448);
    }

    public plm() {
    }

    public plm(Map<String, ? extends Object> map) {
        this();
        this.f26156a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.x(map, "topic", null);
        MegaUtils.x(map, "from", null);
        this.c = MegaUtils.x(map, "context", null);
    }
}
