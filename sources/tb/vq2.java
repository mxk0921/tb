package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vq2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f30169a;

    static {
        t2o.a(525336747);
    }

    public vq2() {
        this.f30169a = "";
    }

    public vq2(Map<String, ? extends Object> map) {
        this();
        MegaUtils.x(map, LoggingSPCache.STORAGE_LANGUAGE, null);
        String x = MegaUtils.x(map, "number", null);
        if (x != null) {
            this.f30169a = x;
            return;
        }
        throw new RuntimeException("number 参数必传！");
    }
}
