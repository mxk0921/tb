package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContentCommissionActionSourceType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oo4 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f25523a;
    public final Map<String, ? extends Object> b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525336847);
    }

    public oo4() {
    }

    public oo4(Map<String, ? extends Object> map) {
        this();
        if (MegaUtils.x(map, "liveID", null) == null) {
            throw new RuntimeException("liveID 参数必传！");
        } else if (ContentCommissionActionSourceType.Companion.a(MegaUtils.x(map, "actionSource", null)) != null) {
            MegaUtils.x(map, "itemID", null);
            MegaUtils.x(map, "spm", null);
            MegaUtils.x(map, "liveSource", null);
            MegaUtils.x(map, "entryLiveSource", null);
            this.f25523a = MegaUtils.s(map, "context");
            this.b = MegaUtils.s(map, "extParams");
            this.c = MegaUtils.s(map, "config");
        } else {
            throw new RuntimeException("actionSource 参数必传！");
        }
    }
}
