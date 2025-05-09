package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ed9 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18500a;

    static {
        t2o.a(525336938);
    }

    public ed9() {
    }

    public ed9(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "multiple", Boolean.FALSE);
        this.f18500a = h != null ? h.booleanValue() : false;
    }
}
