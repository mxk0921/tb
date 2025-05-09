package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pcu {

    /* renamed from: a  reason: collision with root package name */
    public final String f26019a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525337566);
    }

    public pcu() {
        this.f26019a = "";
        this.b = "";
    }

    public pcu(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizName", null);
        if (x != null) {
            this.f26019a = x;
            String x2 = MegaUtils.x(map, "uniqueKey", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.s(map, "extParams");
                return;
            }
            throw new RuntimeException("uniqueKey 参数必传！");
        }
        throw new RuntimeException("bizName 参数必传！");
    }
}
