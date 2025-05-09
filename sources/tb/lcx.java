package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class lcx {

    /* renamed from: a  reason: collision with root package name */
    public final String f23265a;
    public final String b;
    public final String c;

    static {
        t2o.a(525337667);
    }

    public lcx() {
        this.f23265a = "";
        this.b = "";
        this.c = "";
    }

    public lcx(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "typeID", null);
        if (x != null) {
            this.f23265a = x;
            String x2 = MegaUtils.x(map, "widgetType", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "channel", null);
                if (x3 != null) {
                    this.c = x3;
                    return;
                }
                throw new RuntimeException("channel 参数必传！");
            }
            throw new RuntimeException("widgetType 参数必传！");
        }
        throw new RuntimeException("typeID 参数必传！");
    }
}
