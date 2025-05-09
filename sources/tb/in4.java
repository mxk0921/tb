package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContainerScreenOrientation;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class in4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21444a;

    static {
        t2o.a(525336817);
    }

    public in4() {
    }

    public in4(Map<String, ? extends Object> map) {
        this();
        this.f21444a = ContainerScreenOrientation.Companion.a(MegaUtils.x(map, "orientation", null));
    }
}
