package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yh1 {

    /* renamed from: a  reason: collision with root package name */
    public final double f32084a;

    static {
        t2o.a(525336720);
    }

    public yh1() {
    }

    public yh1(Map<String, ? extends Object> map) {
        this();
        Double j = MegaUtils.j(map, "value", null);
        if (j != null) {
            this.f32084a = j.doubleValue();
            return;
        }
        throw new RuntimeException("value 参数必传！");
    }
}
