package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class te {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28654a;
    public final int b;
    public final kei c;
    public final Map<?, ?> d;

    static {
        t2o.a(98566145);
    }

    public te(Map<String, ? extends Object> map, Map<?, ?> map2) {
        ckf.g(map, "data");
        Boolean g = MegaUtils.g(map, "useCache", Boolean.TRUE);
        ckf.d(g);
        this.f28654a = g.booleanValue();
        Integer l = MegaUtils.l(map, "startPosition", 0);
        ckf.d(l);
        this.b = l.intValue();
        Map<String, Object> r = MegaUtils.r(map, yj4.PARAM_MEDIA_INFO);
        if (r != null) {
            this.c = new kei(r);
            this.d = map2;
            return;
        }
        throw new RuntimeException("mediaInfo invalid");
    }
}
