package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xeh {

    /* renamed from: a  reason: collision with root package name */
    public final String f31336a;
    public final Map<String, ? extends Object> b;
    public final String c;
    public final String d;

    static {
        t2o.a(525337270);
    }

    public xeh() {
        this.f31336a = "";
    }

    public xeh(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "event", null);
        if (x != null) {
            this.f31336a = x;
            this.b = MegaUtils.s(map, TrtcConstants.TRTC_PARAMS_EXTENSION);
            this.c = MegaUtils.x(map, "id", null);
            this.d = MegaUtils.x(map, "parentID", null);
            return;
        }
        throw new RuntimeException("event 参数必传！");
    }
}
