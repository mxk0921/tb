package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.NavBarVisibilityAnimationType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xmj {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31472a;
    public final String b;

    static {
        t2o.a(525337298);
    }

    public xmj() {
        this.b = "OTHER";
    }

    public xmj(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, "animation", Boolean.FALSE);
        this.f31472a = h != null ? h.booleanValue() : false;
        String str = "OTHER";
        String a2 = NavBarVisibilityAnimationType.Companion.a(MegaUtils.x(map, "animationType", str));
        this.b = a2 != null ? a2 : str;
    }
}
