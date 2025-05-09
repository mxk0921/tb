package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kev {

    /* renamed from: a  reason: collision with root package name */
    public final String f22620a;
    public final Map<String, ? extends Object> b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525337616);
    }

    public kev() {
    }

    public kev(Map<String, ? extends Object> map) {
        this();
        this.f22620a = MegaUtils.x(map, "videoPath", null);
        this.b = MegaUtils.s(map, "videoInfo");
        this.c = MegaUtils.s(map, "coverImage");
    }
}
