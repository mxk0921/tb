package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ml4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f24117a;

    static {
        t2o.a(525336789);
    }

    public ml4() {
        this.f24117a = "";
    }

    public ml4(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "color", null);
        if (x != null) {
            this.f24117a = x;
            return;
        }
        throw new RuntimeException("color 参数必传！");
    }
}
