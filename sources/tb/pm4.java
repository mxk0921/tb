package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContainerPageCloseType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pm4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26179a;

    static {
        t2o.a(525336794);
    }

    public pm4() {
    }

    public pm4(Map<String, ? extends Object> map) {
        this();
        MegaUtils.h(map, "supportSwipeBack", null);
        this.f26179a = ContainerPageCloseType.Companion.a(MegaUtils.x(map, "type", null));
    }
}
