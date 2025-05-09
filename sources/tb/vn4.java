package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContainerTabBarStyleMode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vn4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f30120a;

    static {
        t2o.a(525336832);
    }

    public vn4() {
        this.f30120a = "default";
    }

    public vn4(Map<String, ? extends Object> map) {
        this();
        String str = "default";
        String a2 = ContainerTabBarStyleMode.Companion.a(MegaUtils.x(map, "mode", str));
        this.f30120a = a2 != null ? a2 : str;
    }
}
