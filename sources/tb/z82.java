package tb;

import com.alibaba.ability.MegaUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class z82 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32599a;
    public final String b;
    public final j82 c;
    public final List<l82> d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(525336733);
    }

    public z82() {
        this.f32599a = "";
        this.b = "";
        this.c = new j82();
        this.d = yz3.i();
    }

    public z82(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "scene", null);
        if (x != null) {
            this.f32599a = x;
            String x2 = MegaUtils.x(map, "actionName", null);
            if (x2 != null) {
                this.b = x2;
                if (map == null || !map.containsKey("currentOffset")) {
                    throw new RuntimeException("currentOffset 参数必传！");
                }
                this.c = new j82(MegaUtils.s(map, "currentOffset"));
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
                    this.d = arrayList;
                    this.e = MegaUtils.s(map, "bizArgs");
                    return;
                }
                throw new RuntimeException("items 参数必传！");
            }
            throw new RuntimeException("actionName 参数必传！");
        }
        throw new RuntimeException("scene 参数必传！");
    }
}
