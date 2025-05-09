package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.GlobalMenuSupportModifyItemType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zba {

    /* renamed from: a  reason: collision with root package name */
    public final List<yba> f32663a;
    public final List<String> b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(525336969);
    }

    public zba() {
    }

    public zba(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> o = MegaUtils.o(map, "customItems");
        ArrayList arrayList2 = null;
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                try {
                    arrayList.add(new yba((Map) (!(obj instanceof Map) ? null : obj)));
                } catch (Exception e) {
                    throw new RuntimeException("customItems 参数类型错误，必须是 List<GlobalMenuCustomItem> 类型！" + e.getMessage());
                }
            }
        } else {
            arrayList = null;
        }
        this.f32663a = arrayList;
        List<Object> o2 = MegaUtils.o(map, "deleteItemTypes");
        if (o2 != null) {
            List<Object> list2 = o2;
            ArrayList arrayList3 = new ArrayList(zz3.q(list2, 10));
            for (Object obj2 : list2) {
                String a2 = GlobalMenuSupportModifyItemType.Companion.a((String) (!(obj2 instanceof String) ? null : obj2));
                if (a2 != null) {
                    arrayList3.add(a2);
                } else {
                    throw new RuntimeException("deleteItemTypes 参数类型错误，必须是 List<GlobalMenuSupportModifyItemType> 类型！");
                }
            }
            arrayList2 = arrayList3;
        }
        this.b = arrayList2;
        this.c = MegaUtils.s(map, "pageUserInfo");
    }
}
