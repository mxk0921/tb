package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.PowerMsgMsgFetchMode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class slm {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f28133a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        t2o.a(525337451);
    }

    public slm() {
    }

    public slm(Map<String, ? extends Object> map) {
        this();
        this.f28133a = MegaUtils.m(map, "bizCode", null);
        this.b = MegaUtils.x(map, "topic", null);
        this.c = PowerMsgMsgFetchMode.Companion.a(MegaUtils.x(map, "mode", null));
        MegaUtils.x(map, l2o.COL_BTAG, null);
        this.d = MegaUtils.x(map, "from", null);
        this.e = MegaUtils.x(map, "ext", null);
    }
}
