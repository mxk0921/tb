package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fg7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f19272a;
    public final String b;

    static {
        t2o.a(525336859);
    }

    public fg7() {
        this.f19272a = "";
    }

    public fg7(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "token", null);
        if (x != null) {
            this.f19272a = x;
            this.b = MegaUtils.x(map, "itemID", null);
            MegaUtils.x(map, TBImageFlowMonitor.INVALID_PARAM_ORIGINAL_URL, null);
            return;
        }
        throw new RuntimeException("token 参数必传！");
    }
}
