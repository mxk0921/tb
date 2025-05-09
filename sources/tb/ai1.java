package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ai1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15755a;

    static {
        t2o.a(525336724);
    }

    public ai1() {
    }

    public ai1(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "position", null);
        if (m != null) {
            this.f15755a = m.intValue();
            return;
        }
        throw new RuntimeException("position 参数必传！");
    }
}
