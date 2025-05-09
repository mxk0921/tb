package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bsv {

    /* renamed from: a  reason: collision with root package name */
    public final String f16608a;

    static {
        t2o.a(525337663);
    }

    public bsv() {
    }

    public bsv(Map<String, ? extends Object> map) {
        this();
        MegaUtils.h(map, "autoLoginOnly", Boolean.FALSE);
        this.f16608a = MegaUtils.x(map, "source", null);
    }
}
