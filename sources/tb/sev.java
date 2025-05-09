package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.umipublish.draft.DraftManager;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sev {

    /* renamed from: a  reason: collision with root package name */
    public final String f27997a;
    public final String b;
    public final Boolean c;
    public final Map<String, ? extends Object> d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525337639);
    }

    public sev() {
    }

    public sev(Map<String, ? extends Object> map) {
        this();
        this.f27997a = MegaUtils.x(map, "biz", null);
        this.b = MegaUtils.x(map, "draftId", null);
        this.c = MegaUtils.h(map, DraftManager.KEY_AUTO_SAVE, null);
        this.d = MegaUtils.s(map, "rawJson");
        this.e = MegaUtils.s(map, "meta");
    }
}
