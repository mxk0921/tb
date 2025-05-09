package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class heh {

    /* renamed from: a  reason: collision with root package name */
    public final String f20583a;
    public final Map<String, ? extends Object> b;
    public final String c;
    public final String d;

    static {
        t2o.a(525337266);
    }

    public heh() {
        this.f20583a = "";
    }

    public heh(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "event", null);
        if (x != null) {
            this.f20583a = x;
            this.b = MegaUtils.s(map, TrtcConstants.TRTC_PARAMS_EXTENSION);
            this.c = MegaUtils.x(map, "id", null);
            this.d = MegaUtils.x(map, "parentID", null);
            return;
        }
        throw new RuntimeException("event 参数必传！");
    }
}
