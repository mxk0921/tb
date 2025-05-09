package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class kbm {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f22537a;

    static {
        t2o.a(525337413);
    }

    public kbm() {
        this.f22537a = yz3.i();
    }

    public kbm(Map<String, ? extends Object> map) {
        this();
        List<Object> o = MegaUtils.o(map, "codes");
        if (o != null) {
            List<Object> list = o;
            ArrayList arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("codes 参数类型错误， 必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("codes 参数类型错误， 必须是 List<String> 类型！" + e.getMessage());
            }
            this.f22537a = arrayList;
            return;
        }
        throw new RuntimeException("codes 参数必传！");
    }
}
