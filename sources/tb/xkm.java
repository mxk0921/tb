package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xkm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f31443a;
    public final Boolean b;
    public final String c;
    public final Map<String, ? extends Object> d;

    static {
        t2o.a(525337425);
    }

    public xkm() {
    }

    public xkm(Map<String, ? extends Object> map) {
        this();
        this.f31443a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.h(map, "needACK", null);
        this.c = MegaUtils.x(map, "topic", null);
        this.d = MegaUtils.s(map, "params");
    }
}
