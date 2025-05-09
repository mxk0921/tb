package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class scx {

    /* renamed from: a  reason: collision with root package name */
    public final String f27960a;

    static {
        t2o.a(525337674);
    }

    public scx() {
        this.f27960a = "";
    }

    public scx(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "typeID", null);
        if (x != null) {
            this.f27960a = x;
            return;
        }
        throw new RuntimeException("typeID 参数必传！");
    }
}
