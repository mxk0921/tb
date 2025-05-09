package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.NextRPCAttachedResponseStrategy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class v2k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29745a;
    public final t2k b;

    static {
        t2o.a(525337329);
    }

    public v2k() {
    }

    public v2k(Map<String, ? extends Object> map) {
        this();
        Boolean bool = Boolean.FALSE;
        MegaUtils.h(map, "useStream", bool);
        Boolean h = MegaUtils.h(map, svf.sParamsKeyDisableJSONParse, bool);
        this.f29745a = h != null ? h.booleanValue() : false;
        NextRPCAttachedResponseStrategy.Companion.a(MegaUtils.x(map, "attachedResponseStrategy", "IMMEDIATELY"));
        this.b = (map == null || !map.containsKey("mtopRequestParams")) ? null : new t2k(MegaUtils.s(map, "mtopRequestParams"));
    }
}
