package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.CartCallNativeMethodEnum;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ja3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21861a;
    public final String b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525336762);
    }

    public ja3() {
        this.f21861a = "";
        this.b = "";
    }

    public ja3(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "instanceID", null);
        if (x != null) {
            this.f21861a = x;
            String a2 = CartCallNativeMethodEnum.Companion.a(MegaUtils.x(map, "method", null));
            if (a2 != null) {
                this.b = a2;
                this.c = MegaUtils.s(map, "params");
                return;
            }
            throw new RuntimeException("method 参数必传！");
        }
        throw new RuntimeException("instanceID 参数必传！");
    }
}
