package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class tq2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f28879a;
    public final String b;

    static {
        t2o.a(525336745);
    }

    public tq2() {
        this.b = "";
    }

    public tq2(Map<String, ? extends Object> map) {
        this();
        Long q = MegaUtils.q(map, "timestamp", null);
        if (q != null) {
            this.f28879a = q.longValue();
            MegaUtils.x(map, LoggingSPCache.STORAGE_LANGUAGE, null);
            String x = MegaUtils.x(map, "customPattern", null);
            if (x != null) {
                this.b = x;
                return;
            }
            throw new RuntimeException("customPattern 参数必传！");
        }
        throw new RuntimeException("timestamp 参数必传！");
    }
}
