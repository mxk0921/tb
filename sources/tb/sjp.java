package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sjp {

    /* renamed from: a  reason: collision with root package name */
    public final String f28093a;
    public final String b;
    public final String c;

    static {
        t2o.a(525337505);
    }

    public sjp() {
        this.f28093a = "";
        this.b = "";
        this.c = "";
    }

    public sjp(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "platform", null);
        if (x != null) {
            this.f28093a = x;
            String x2 = MegaUtils.x(map, "qrType", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "qr4ScanOnly", null);
                if (x3 != null) {
                    this.c = x3;
                    return;
                }
                throw new RuntimeException("qr4ScanOnly 参数必传！");
            }
            throw new RuntimeException("qrType 参数必传！");
        }
        throw new RuntimeException("platform 参数必传！");
    }
}
