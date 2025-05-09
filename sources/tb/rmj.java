package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rmj {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27467a;

    static {
        t2o.a(525337288);
    }

    public rmj() {
    }

    public rmj(Map<String, ? extends Object> map) {
        this();
        Boolean h = MegaUtils.h(map, gl4.CONFIG_IMMERSIVE, null);
        if (h != null) {
            this.f27467a = h.booleanValue();
            return;
        }
        throw new RuntimeException("immersive 参数必传！");
    }
}
