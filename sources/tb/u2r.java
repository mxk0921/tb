package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class u2r {

    /* renamed from: a  reason: collision with root package name */
    public final String f29092a;

    static {
        t2o.a(525337530);
    }

    public u2r() {
        this.f29092a = "";
    }

    public u2r(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "android", null);
        if (x != null) {
            this.f29092a = x;
            if (MegaUtils.x(map, "iOSScheme", null) == null) {
                throw new RuntimeException("iOSScheme 参数必传！");
            } else if (MegaUtils.x(map, "ohosScheme", null) == null) {
                throw new RuntimeException("ohosScheme 参数必传！");
            }
        } else {
            throw new RuntimeException("android 参数必传！");
        }
    }
}
