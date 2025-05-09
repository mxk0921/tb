package tb;

import com.alibaba.ability.MegaUtils;
import com.taobao.android.abilityidl.ability.SharePannelShareTarget;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rjp {

    /* renamed from: a  reason: collision with root package name */
    public final String f27426a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map<String, ? extends Object> f;
    public final Map<String, ? extends Object> g;
    public final List<String> h;

    static {
        t2o.a(525337504);
    }

    public rjp() {
        this.f27426a = "";
        this.b = "";
    }

    public rjp(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList = null;
        String x = MegaUtils.x(map, PopConst.BRIDGE_KEY_BUSINESS_ID, null);
        if (x != null) {
            this.f27426a = x;
            String x2 = MegaUtils.x(map, "url", null);
            if (x2 != null) {
                this.b = x2;
                this.c = MegaUtils.x(map, "title", null);
                this.d = MegaUtils.x(map, "desc", null);
                this.e = MegaUtils.x(map, "imageURL", null);
                this.f = MegaUtils.s(map, "templateParams");
                this.g = MegaUtils.s(map, "extendParams");
                List<Object> o = MegaUtils.o(map, "targets");
                if (o != null) {
                    List<Object> list = o;
                    ArrayList arrayList2 = new ArrayList(zz3.q(list, 10));
                    for (Object obj : list) {
                        String a2 = SharePannelShareTarget.Companion.a((String) (!(obj instanceof String) ? null : obj));
                        if (a2 != null) {
                            arrayList2.add(a2);
                        } else {
                            throw new RuntimeException("targets 参数类型错误，必须是 List<SharePannelShareTarget> 类型！");
                        }
                    }
                    arrayList = arrayList2;
                }
                this.h = arrayList;
                return;
            }
            throw new RuntimeException("url 参数必传！");
        }
        throw new RuntimeException("businessID 参数必传！");
    }
}
