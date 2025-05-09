package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class d4l {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f17571a;

    static {
        t2o.a(525337355);
    }

    public d4l() {
    }

    public d4l(Map<String, ? extends Object> map) {
        this();
        if (MegaUtils.x(map, "apiName", null) != null) {
            this.f17571a = MegaUtils.s(map, "params");
            return;
        }
        throw new RuntimeException("apiName 参数必传！");
    }
}
