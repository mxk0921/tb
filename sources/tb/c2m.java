package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c2m {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f16794a;

    static {
        t2o.a(525337403);
    }

    public c2m() {
    }

    public c2m(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> o = MegaUtils.o(map, "sources");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("sources 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("sources 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        arrayList = null;
        this.f16794a = arrayList;
    }
}
