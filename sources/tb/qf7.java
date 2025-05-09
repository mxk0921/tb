package tb;

import com.alibaba.ability.MegaUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qf7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26719a;

    static {
        t2o.a(525336857);
    }

    public qf7() {
    }

    public qf7(Map<String, ? extends Object> map) {
        this();
        if (MegaUtils.x(map, "token", null) != null) {
            this.f26719a = MegaUtils.x(map, "voName", null);
            return;
        }
        throw new RuntimeException("token 参数必传！");
    }
}
