package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.FootprintType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iv9 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21598a;

    static {
        t2o.a(525336955);
    }

    public iv9() {
        this.f21598a = "";
    }

    public iv9(Map<String, ? extends Object> map) {
        this();
        String a2 = FootprintType.Companion.a(MegaUtils.x(map, "type", null));
        if (a2 != null) {
            this.f21598a = a2;
            return;
        }
        throw new RuntimeException("type 参数必传！");
    }
}
