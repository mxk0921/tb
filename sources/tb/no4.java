package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class no4 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f24858a;
    public final Map<String, ? extends Object> b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525336846);
    }

    public no4() {
        this.f24858a = a.h();
    }

    public no4(Map<String, ? extends Object> map) {
        this();
        Map<String, ? extends Object> s = MegaUtils.s(map, "liveBizParams");
        if (s != null) {
            this.f24858a = s;
            this.b = MegaUtils.s(map, "extParams");
            this.c = MegaUtils.s(map, "config");
            return;
        }
        throw new RuntimeException("liveBizParams 参数必传！");
    }
}
