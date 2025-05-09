package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class meh {

    /* renamed from: a  reason: collision with root package name */
    public final String f23989a;
    public final String b;
    public final String c;
    public final Map<String, ? extends Object> d;
    public final String e;
    public final String f;

    static {
        t2o.a(525337269);
    }

    public meh() {
        this.f23989a = "";
    }

    public meh(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "event", null);
        if (x != null) {
            this.f23989a = x;
            this.b = MegaUtils.x(map, "errorCode", null);
            this.c = MegaUtils.x(map, "errorMessage", null);
            this.d = MegaUtils.s(map, TrtcConstants.TRTC_PARAMS_EXTENSION);
            this.e = MegaUtils.x(map, "id", null);
            this.f = MegaUtils.x(map, "parentID", null);
            return;
        }
        throw new RuntimeException("event 参数必传！");
    }
}
