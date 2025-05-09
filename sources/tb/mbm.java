package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mbm {

    /* renamed from: a  reason: collision with root package name */
    public final String f23920a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final Boolean g;
    public final Map<String, ? extends Object> h;

    static {
        t2o.a(525337419);
    }

    public mbm() {
        this.f23920a = "";
        this.b = "";
    }

    public mbm(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "type", null);
        if (x != null) {
            this.f23920a = x;
            String x2 = MegaUtils.x(map, "layerType", null);
            if (x2 != null) {
                this.b = x2;
                if (MegaUtils.x(map, "sceneCheck", null) != null) {
                    this.c = MegaUtils.x(map, "cdnId", null);
                    this.d = MegaUtils.x(map, pl4.KEY_PAGE_ID, null);
                    this.e = MegaUtils.x(map, "url", null);
                    this.f = MegaUtils.h(map, WXBasicComponentType.EMBED, null);
                    this.g = MegaUtils.h(map, "actionCallBack", null);
                    this.h = MegaUtils.s(map, "style");
                    return;
                }
                throw new RuntimeException("sceneCheck 参数必传！");
            }
            throw new RuntimeException("layerType 参数必传！");
        }
        throw new RuntimeException("type 参数必传！");
    }
}
