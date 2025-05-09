package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.taobao.android.abilityidl.ability.CLDRFormatType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uq2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f29554a;
    public final String b;

    static {
        t2o.a(525336746);
    }

    public uq2() {
        this.b = "";
    }

    public uq2(Map<String, ? extends Object> map) {
        this();
        Long q = MegaUtils.q(map, "timestamp", null);
        if (q != null) {
            this.f29554a = q.longValue();
            MegaUtils.x(map, LoggingSPCache.STORAGE_LANGUAGE, null);
            String a2 = CLDRFormatType.Companion.a(MegaUtils.x(map, "type", null));
            if (a2 != null) {
                this.b = a2;
                return;
            }
            throw new RuntimeException("type 参数必传！");
        }
        throw new RuntimeException("timestamp 参数必传！");
    }
}
