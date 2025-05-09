package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ScreenOrientation;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rvo {

    /* renamed from: a  reason: collision with root package name */
    public final String f27641a;

    static {
        t2o.a(525337493);
    }

    public rvo() {
    }

    public rvo(Map<String, ? extends Object> map) {
        this();
        this.f27641a = ScreenOrientation.Companion.a(MegaUtils.x(map, "orientation", null));
    }
}
