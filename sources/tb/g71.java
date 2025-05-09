package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g71 {

    /* renamed from: a  reason: collision with root package name */
    public final String f19766a;
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525336715);
    }

    public g71() {
        this.f19766a = "";
        this.b = "";
    }

    public g71(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "module", null);
        if (x != null) {
            this.f19766a = x;
            String x2 = MegaUtils.x(map, "monitorPoint", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.x(map, "errorCode", null);
                this.d = MegaUtils.x(map, "errorMessage", null);
                this.e = MegaUtils.s(map, "args");
                return;
            }
            throw new RuntimeException("monitorPoint 参数必传！");
        }
        throw new RuntimeException("module 参数必传！");
    }
}
