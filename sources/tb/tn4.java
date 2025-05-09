package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tn4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f28821a;

    static {
        t2o.a(525336827);
    }

    public tn4() {
    }

    public tn4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "index", null);
        if (m != null) {
            this.f28821a = m.intValue();
            return;
        }
        throw new RuntimeException("index 参数必传！");
    }
}
