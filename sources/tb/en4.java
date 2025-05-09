package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContainerPrewarmMode;
import com.taobao.android.abilityidl.ability.ContainerResourceType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class en4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18691a;
    public final String b;
    public final String c;

    static {
        t2o.a(525336812);
    }

    public en4() {
        this.f18691a = "";
        this.b = "";
        this.c = "only_if_cached";
    }

    public en4(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "src", null);
        if (x != null) {
            this.f18691a = x;
            String a2 = ContainerResourceType.Companion.a(MegaUtils.x(map, "type", null));
            if (a2 != null) {
                this.b = a2;
                String str = "only_if_cached";
                String a3 = ContainerPrewarmMode.Companion.a(MegaUtils.x(map, "mode", str));
                this.c = a3 != null ? a3 : str;
                return;
            }
            throw new RuntimeException("type 参数必传！");
        }
        throw new RuntimeException("src 参数必传！");
    }
}
