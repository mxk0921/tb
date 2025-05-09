package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class one {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<tne> f25506a;
    public final Integer b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337218);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337217);
    }

    public one() {
    }

    public one(Map<String, ? extends Object> map) {
        this();
        ArrayList arrayList;
        List<Object> o = MegaUtils.o(map, "sources");
        if (o != null) {
            List<Object> list = o;
            arrayList = new ArrayList(zz3.q(list, 10));
            for (Object obj : list) {
                try {
                    arrayList.add(new tne((Map) (!(obj instanceof Map) ? null : obj)));
                } catch (Exception e) {
                    throw new RuntimeException("sources 参数类型错误，必须是 List<ImagePreviewSourceParam> 类型！" + e.getMessage());
                }
            }
        } else {
            arrayList = null;
        }
        this.f25506a = arrayList;
        this.b = MegaUtils.m(map, "index", null);
    }
}
