package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rn4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f27481a;
    public final int b;

    static {
        t2o.a(525336825);
    }

    public rn4() {
    }

    public rn4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "originIndex", null);
        if (m != null) {
            this.f27481a = m.intValue();
            Integer m2 = MegaUtils.m(map, "targetIndex", null);
            if (m2 != null) {
                this.b = m2.intValue();
                return;
            }
            throw new RuntimeException("targetIndex 参数必传！");
        }
        throw new RuntimeException("originIndex 参数必传！");
    }
}
