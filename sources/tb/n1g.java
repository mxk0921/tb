package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class n1g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f24441a;
    public final String b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337241);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337240);
    }

    public n1g() {
        this.f24441a = "";
        this.b = "";
        this.c = "";
    }

    public n1g(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizID", null);
        if (x != null) {
            this.f24441a = x;
            String x2 = MegaUtils.x(map, "key", null);
            if (x2 != null) {
                this.b = x2;
                String x3 = MegaUtils.x(map, "value", null);
                if (x3 != null) {
                    this.c = x3;
                    return;
                }
                throw new RuntimeException("value 参数必传！");
            }
            throw new RuntimeException("key 参数必传！");
        }
        throw new RuntimeException("bizID 参数必传！");
    }
}
