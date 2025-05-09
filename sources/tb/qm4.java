package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qm4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26823a;
    public final Integer b;
    public final List<String> c;

    static {
        t2o.a(525336797);
    }

    public qm4() {
    }

    public qm4(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList = null;
        this.f26823a = MegaUtils.x(map, "fallbackPage", null);
        this.b = MegaUtils.m(map, "minDocumentSize", null);
        List<Object> o = MegaUtils.o(map, "requiredElementsDetection");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                if (obj != null) {
                    try {
                        arrayList.add((String) obj);
                    } catch (Exception e) {
                        throw new RuntimeException("requiredElementsDetection 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new RuntimeException("requiredElementsDetection 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
            }
        }
        this.c = arrayList;
        if (map != null && map.containsKey("blankScreenDetection")) {
            new om4(MegaUtils.s(map, "blankScreenDetection"));
        }
    }
}
