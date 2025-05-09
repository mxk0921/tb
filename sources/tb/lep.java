package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lep {

    /* renamed from: a  reason: collision with root package name */
    public final String f23299a;

    static {
        t2o.a(525337498);
    }

    public lep() {
        this.f23299a = "";
    }

    public lep(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f23299a = x;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }
}
