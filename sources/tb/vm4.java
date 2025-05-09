package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vm4 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f30098a;
    public final List<String> b;

    static {
        t2o.a(525336805);
    }

    public vm4() {
    }

    public vm4(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> o = MegaUtils.o(map, oyl.PERMISSION_ALLOW);
        ArrayList arrayList2 = null;
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("allow 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("allow 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        arrayList = null;
        this.f30098a = arrayList;
        List<Object> o2 = MegaUtils.o(map, jwi.MATCH_IGNORE);
        if (o2 != null) {
            List<Object> list2 = o2;
            arrayList2 = new ArrayList(zz3.q(list2, 10));
            for (Object obj2 : list2) {
                if (obj2 != null) {
                    try {
                        arrayList2.add((String) obj2);
                    } catch (Exception e2) {
                        throw new RuntimeException("ignore 参数类型错误，必须是 List<String> 类型！" + e2.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("ignore 参数类型错误，必须是 List<String> 类型！" + e2.getMessage());
            }
        }
        this.b = arrayList2;
    }
}
