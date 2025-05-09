package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ErrorViewWidgetButtonStyle;
import com.taobao.android.abilityidl.ability.ErrorViewWidgetRequestError;
import com.taobao.android.abilityidl.ability.ErrorViewWidgetUserInterfaceStyle;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ui8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f29395a;
    public final int b;
    public final String c;
    public final String d;
    public final ErrorViewWidgetRequestError e;
    public final String f;
    public final String g;

    static {
        t2o.a(525336882);
    }

    public ui8() {
        this.e = new ErrorViewWidgetRequestError();
    }

    public ui8(Map<String, ? extends Object> map) {
        this();
        this.f29395a = MegaUtils.x(map, "topic", null);
        Integer m = MegaUtils.m(map, "bottomMargin", null);
        if (m != null) {
            this.b = m.intValue();
            this.c = ErrorViewWidgetButtonStyle.Companion.a(MegaUtils.x(map, "buttonStyle", null));
            this.d = ErrorViewWidgetUserInterfaceStyle.Companion.a(MegaUtils.x(map, "userInterfaceStyle", null));
            if (map == null || !map.containsKey("requestError")) {
                throw new RuntimeException("requestError 参数必传！");
            }
            this.e = new ErrorViewWidgetRequestError(MegaUtils.s(map, "requestError"));
            this.f = MegaUtils.x(map, "title", null);
            this.g = MegaUtils.x(map, "refreshButtonTitle", null);
            return;
        }
        throw new RuntimeException("bottomMargin 参数必传！");
    }
}
