package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.NavBarThemeEnum;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class umj {

    /* renamed from: a  reason: collision with root package name */
    public final String f29494a;

    static {
        t2o.a(525337293);
    }

    public umj() {
        this.f29494a = "";
    }

    public umj(Map<String, ? extends Object> map) {
        this();
        String a2 = NavBarThemeEnum.Companion.a(MegaUtils.x(map, "theme", null));
        if (a2 != null) {
            this.f29494a = a2;
            return;
        }
        throw new RuntimeException("theme 参数必传！");
    }
}
