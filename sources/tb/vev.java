package tb;

import com.alibaba.ability.MegaUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vev {

    /* renamed from: a  reason: collision with root package name */
    public final String f29974a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Map<String, ? extends Object> f;
    public final Map<String, ? extends Object> g;
    public final Map<String, ? extends Object> h;

    static {
        t2o.a(525337644);
    }

    public vev() {
    }

    public vev(Map<String, ? extends Object> map) {
        this();
        this.f29974a = MegaUtils.x(map, "api", null);
        this.b = MegaUtils.x(map, "apiVersion", null);
        this.c = MegaUtils.x(map, "triggerName", null);
        this.d = MegaUtils.x(map, "formName", null);
        this.e = MegaUtils.h(map, "saveToAlbum", null);
        this.f = MegaUtils.s(map, MspGlobalDefine.SESSION);
        this.g = MegaUtils.s(map, "inputInfo");
        this.h = MegaUtils.s(map, "extraParams");
    }
}
