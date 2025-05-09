package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.tao.powermsg.outter.PowerMsg4WW;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nlm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f24812a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Boolean g;
    public final String h;

    static {
        t2o.a(525337442);
    }

    public nlm() {
    }

    public nlm(Map<String, ? extends Object> map) {
        this();
        this.f24812a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.x(map, "topic", null);
        this.c = MegaUtils.x(map, "context", null);
        this.d = MegaUtils.m(map, PowerMsg4WW.KEY_START_SEQ, null);
        this.e = MegaUtils.m(map, PowerMsg4WW.KEY_SEQ_INTERVAL, null);
        this.f = MegaUtils.x(map, PowerMsg4WW.KEY_ROUTE_GROUP, null);
        this.g = MegaUtils.h(map, PowerMsg4WW.KEY_REENTRANT, null);
        this.h = MegaUtils.x(map, "timeout", null);
    }
}
