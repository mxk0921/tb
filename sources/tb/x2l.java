package tb;

import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class x2l {

    /* renamed from: a  reason: collision with root package name */
    public final String f31103a;
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525337337);
    }

    public x2l() {
        this.f31103a = "";
    }

    public x2l(Map<String, ? extends Object> map) {
        this();
        MegaUtils.x(map, "callMethod", null);
        String x = MegaUtils.x(map, "scopeNicks", null);
        if (x != null) {
            this.f31103a = x;
            this.b = MegaUtils.x(map, "isvAppId", null);
            this.c = MegaUtils.x(map, ov2.ALIPAY_ACCOUNT_SITE, null);
            this.d = MegaUtils.x(map, ParamsConstants.Key.PARAM_SCENE_CODE, null);
            this.e = MegaUtils.s(map, "extInfo");
            return;
        }
        throw new RuntimeException("scopeNicks 参数必传！");
    }
}
