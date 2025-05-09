package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.tao.powermsg.outter.PowerMsg4WW;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class olm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f25461a;
    public final String b;
    public final Integer c;
    public final Integer d;

    static {
        t2o.a(525337446);
    }

    public olm() {
    }

    public olm(Map<String, ? extends Object> map) {
        this();
        this.f25461a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.x(map, "topic", null);
        this.c = MegaUtils.m(map, PowerMsg4WW.KEY_START_SEQ, null);
        this.d = MegaUtils.m(map, PowerMsg4WW.KEY_END_SEQ, null);
    }
}
