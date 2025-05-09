package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class an4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15864a;

    static {
        t2o.a(525336808);
    }

    public an4() {
    }

    public an4(Map<String, ? extends Object> map) {
        this();
        Integer m = MegaUtils.m(map, "index", null);
        if (m != null) {
            this.f15864a = m.intValue();
            return;
        }
        throw new RuntimeException("index 参数必传！");
    }
}
