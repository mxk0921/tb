package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.UmiPrivatePublishMediaType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iev {

    /* renamed from: a  reason: collision with root package name */
    public final String f21280a;

    static {
        t2o.a(525337612);
    }

    public iev() {
    }

    public iev(Map<String, ? extends Object> map) {
        this();
        this.f21280a = UmiPrivatePublishMediaType.Companion.a(MegaUtils.x(map, "type", null));
        MegaUtils.m(map, "remain", null);
    }
}
