package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class jbq {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21905a;
    public final String b;

    static {
        t2o.a(525337522);
    }

    public jbq() {
    }

    public jbq(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "continuous", Boolean.FALSE);
        this.f21905a = h != null ? h.booleanValue() : false;
        this.b = MegaUtils.x(map, "vocabularyID", null);
    }
}
