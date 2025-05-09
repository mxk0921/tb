package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class m82 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23838a;
    public final List<l82> b;
    public final boolean c;
    public final Map<String, ? extends Object> d;

    static {
        t2o.a(525336731);
    }

    public m82() {
        this.f23838a = "";
        this.b = yz3.i();
    }

    public m82(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "scene", null);
        if (x != null) {
            this.f23838a = x;
            List<Object> o = MegaUtils.o(map, "items");
            if (o != null) {
                List<Object> list = o;
                ArrayList arrayList = new ArrayList(zz3.q(list, 10));
                for (Object obj : list) {
                    try {
                        arrayList.add(new l82((Map) (!(obj instanceof Map) ? null : obj)));
                    } catch (Exception e) {
                        throw new RuntimeException("items 参数类型错误， 必须是 List<BehaviXBHXVisualItem> 类型！" + e.getMessage());
                    }
                }
                this.b = arrayList;
                Boolean h = MegaUtils.h(map, "isFirstScreen", null);
                if (h != null) {
                    this.c = h.booleanValue();
                    this.d = MegaUtils.s(map, "bizArgs");
                    return;
                }
                throw new RuntimeException("isFirstScreen 参数必传！");
            }
            throw new RuntimeException("items 参数必传！");
        }
        throw new RuntimeException("scene 参数必传！");
    }
}
