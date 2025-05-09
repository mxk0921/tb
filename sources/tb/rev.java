package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rev {

    /* renamed from: a  reason: collision with root package name */
    public final String f27324a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(525337636);
    }

    public rev() {
    }

    public rev(Map<String, ? extends Object> map) {
        this();
        this.f27324a = MegaUtils.x(map, "action", null);
        this.b = MegaUtils.s(map, "params");
    }
}
