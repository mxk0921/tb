package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.TradeHybridBizLifecycleType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ncu {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f24648a;

    static {
        t2o.a(525337561);
    }

    public ncu() {
    }

    public ncu(Map<String, ? extends Object> map) {
        this();
        if (TradeHybridBizLifecycleType.Companion.a(MegaUtils.x(map, "type", null)) == null) {
            throw new RuntimeException("type 参数必传！");
        } else if (MegaUtils.x(map, "bizName", null) != null) {
            MegaUtils.x(map, "code", "unknown");
            MegaUtils.x(map, "message", "unknown");
            this.f24648a = MegaUtils.s(map, "extParams");
        } else {
            throw new RuntimeException("bizName 参数必传！");
        }
    }
}
