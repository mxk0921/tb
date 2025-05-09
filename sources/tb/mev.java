package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mev {

    /* renamed from: a  reason: collision with root package name */
    public final List<? extends Map<String, ? extends Object>> f24000a;
    public final Integer b;

    static {
        t2o.a(525337619);
    }

    public mev() {
    }

    public mev(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> o = MegaUtils.o(map, "deleteItems");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((Map) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("deleteItems 参数类型错误，必须是 List<Map<String, Any?>> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                }
                throw new RuntimeException("deleteItems 参数类型错误，必须是 List<Map<String, Any?>> 类型！" + e.getMessage());
            }
        }
        arrayList = null;
        this.f24000a = arrayList;
        this.b = MegaUtils.m(map, "leftCount", null);
    }
}
