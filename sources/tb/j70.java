package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class j70 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21806a;
    public final Map<String, ? extends Object> b;
    public final String c;
    public final String d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525336686);
    }

    public j70() {
        this.f21806a = "";
        this.b = a.h();
    }

    public j70(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "serviceID", null);
        if (x != null) {
            this.f21806a = x;
            Map<String, ? extends Object> s = MegaUtils.s(map, "data");
            if (s != null) {
                this.b = s;
                this.c = MegaUtils.x(map, LoggingSPCache.STORAGE_USERID, null);
                this.d = MegaUtils.x(map, "tag", null);
                this.e = MegaUtils.s(map, "options");
                return;
            }
            throw new RuntimeException("data 参数必传！");
        }
        throw new RuntimeException("serviceID 参数必传！");
    }
}
