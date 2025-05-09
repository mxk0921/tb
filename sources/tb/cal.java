package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class cal {

    /* renamed from: a  reason: collision with root package name */
    public final String f16941a;

    static {
        t2o.a(525337363);
    }

    public cal() {
        this.f16941a = "";
    }

    public cal(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "group", null);
        if (x != null) {
            this.f16941a = x;
            return;
        }
        throw new RuntimeException("group 参数必传！");
    }
}
