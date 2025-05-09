package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iqj {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21509a;

    static {
        t2o.a(525337304);
    }

    public iqj() {
        this.f21509a = true;
    }

    public iqj(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "animated", Boolean.TRUE);
        this.f21509a = h != null ? h.booleanValue() : true;
    }
}
