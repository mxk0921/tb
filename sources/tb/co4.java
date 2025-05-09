package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class co4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f17193a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final String j;
    public final String k;
    public final Boolean l;

    static {
        t2o.a(525336836);
    }

    public co4() {
    }

    public co4(Map<String, ? extends Object> map) {
        this();
        this.f17193a = MegaUtils.x(map, "title", null);
        this.b = MegaUtils.x(map, "titleImage", null);
        this.c = MegaUtils.x(map, "titleColor", null);
        this.d = MegaUtils.h(map, "inheritDocumentTitle", null);
        this.e = MegaUtils.x(map, "navBarBgColor", null);
        this.f = MegaUtils.h(map, "navBarImmersive", null);
        this.g = MegaUtils.x(map, "navBarTheme", null);
        this.h = MegaUtils.h(map, "navBarHide", null);
        this.i = MegaUtils.h(map, "statusBarHide", null);
        this.j = MegaUtils.x(map, "pageBgColor", null);
        this.k = MegaUtils.x(map, "orientation", null);
        MegaUtils.h(map, "disableSwipeBack", null);
        MegaUtils.h(map, "disablePageBounce", null);
        this.l = MegaUtils.h(map, "hideHomeIndicator", null);
        MegaUtils.h(map, "deferScreenEdgesGesture", null);
        MegaUtils.x(map, "navigationBarTitleText", null);
        MegaUtils.h(map, "navigationBarHide", null);
    }
}
