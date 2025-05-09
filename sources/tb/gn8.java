package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gn8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f20108a;
    public final String b;
    public final Map<String, ? extends Object> c;
    public final String d;

    static {
        t2o.a(525336885);
    }

    public gn8() {
        this.f20108a = "";
        this.b = "";
    }

    public gn8(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, MUSMonitor.MODULE_DIM_ABILITY, null);
        if (x != null) {
            this.f20108a = x;
            String x2 = MegaUtils.x(map, "api", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.s(map, "params");
                this.d = MegaUtils.x(map, "endFlag", null);
                return;
            }
            throw new RuntimeException("api 参数必传！");
        }
        throw new RuntimeException("ability 参数必传！");
    }
}
