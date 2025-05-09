package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.ContainerRendererMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ym4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32188a;
    public final String b;
    public final String c;
    public final String d;
    public final List<String> e;
    public final rm4 f;
    public final co4 g;
    public final qm4 h;

    static {
        t2o.a(525336806);
    }

    public ym4() {
        this.f32188a = "";
        this.b = "";
        this.c = "web";
    }

    public ym4(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        qm4 qm4Var = null;
        String x = MegaUtils.x(map, pl4.KEY_PAGE_ID, null);
        if (x != null) {
            this.f32188a = x;
            String x2 = MegaUtils.x(map, "url", null);
            if (x2 != null) {
                this.b = x2;
                String str = "web";
                String a2 = ContainerRendererMode.Companion.a(MegaUtils.x(map, "renderer", str));
                this.c = a2 != null ? a2 : str;
                this.d = MegaUtils.x(map, "pageType", null);
                List<Object> o = MegaUtils.o(map, "children");
                if (o != null) {
                    List<Object> list = o;
                    arrayList = new ArrayList(zz3.q(list, 10));
                    for (Object obj : list) {
                        if (obj != null) {
                            try {
                                arrayList.add((String) obj);
                            } catch (Exception e) {
                                throw new RuntimeException("children 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        throw new RuntimeException("children 参数类型错误，必须是 List<String> 类型！" + e.getMessage());
                    }
                }
                arrayList = null;
                this.e = arrayList;
                this.f = (map == null || !map.containsKey("groupConfig")) ? null : new rm4(MegaUtils.s(map, "groupConfig"));
                this.g = (map == null || !map.containsKey(pg1.ATOM_EXT_window)) ? null : new co4(MegaUtils.s(map, pg1.ATOM_EXT_window));
                if (map != null && map.containsKey("fallbackStrategy")) {
                    qm4Var = new qm4(MegaUtils.s(map, "fallbackStrategy"));
                }
                this.h = qm4Var;
                return;
            }
            throw new RuntimeException("url 参数必传！");
        }
        throw new RuntimeException("pageId 参数必传！");
    }
}
