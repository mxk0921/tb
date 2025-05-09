package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class i71 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21134a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525336716);
    }

    public i71() {
        this.f21134a = "";
        this.b = "";
    }

    public i71(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "module", null);
        if (x != null) {
            this.f21134a = x;
            String x2 = MegaUtils.x(map, "monitorPoint", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.s(map, "args");
                return;
            }
            throw new RuntimeException("monitorPoint 参数必传！");
        }
        throw new RuntimeException("module 参数必传！");
    }
}
