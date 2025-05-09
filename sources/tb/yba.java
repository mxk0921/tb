package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yba {

    /* renamed from: a  reason: collision with root package name */
    public final String f31962a;
    public final String b;

    static {
        t2o.a(525336966);
    }

    public yba() {
        this.f31962a = "";
        this.b = "";
    }

    public yba(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "title", null);
        if (x != null) {
            this.f31962a = x;
            String x2 = MegaUtils.x(map, "iconFont", null);
            if (x2 != null) {
                this.b = x2;
                MegaUtils.x(map, "imageUrl", null);
                return;
            }
            throw new RuntimeException("iconFont 参数必传！");
        }
        throw new RuntimeException("title 参数必传！");
    }
}
