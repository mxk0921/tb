package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zh1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32767a;

    static {
        t2o.a(525336723);
    }

    public zh1() {
        this.f32767a = "";
    }

    public zh1(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "src", null);
        if (x != null) {
            this.f32767a = x;
            return;
        }
        throw new RuntimeException("src 参数必传！");
    }
}
