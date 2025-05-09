package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zm4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f32861a;
    public final int b;

    static {
        t2o.a(525336807);
    }

    public zm4() {
    }

    public zm4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "tabIndex", null);
        if (m != null) {
            this.f32861a = m.intValue();
            Integer m2 = MegaUtils.m(map, "index", null);
            if (m2 != null) {
                this.b = m2.intValue();
                return;
            }
            throw new RuntimeException("index 参数必传！");
        }
        throw new RuntimeException("tabIndex 参数必传！");
    }
}
