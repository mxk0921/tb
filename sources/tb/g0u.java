package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f19667a;
    public double b;
    public final Double c;
    public String d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337559);
        }

        public a() {
        }

        @JvmStatic
        public final g0u a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g0u) ipChange.ipc$dispatch("f70b696d", new Object[]{this, str});
            }
            ckf.g(str, "content");
            g0u g0uVar = new g0u((a07) null);
            g0uVar.f19667a = str;
            return g0uVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337558);
    }

    public g0u() {
        this.f19667a = "";
        this.b = 1500.0d;
    }

    @JvmStatic
    public static final g0u a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0u) ipChange.ipc$dispatch("f70b696d", new Object[]{str});
        }
        return Companion.a(str);
    }

    public /* synthetic */ g0u(a07 a07Var) {
        this();
    }

    public g0u(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "content", null);
        if (x != null) {
            this.f19667a = x;
            double d = 1500.0d;
            Double j = MegaUtils.j(map, "duration", Double.valueOf(1500.0d));
            this.b = j != null ? j.doubleValue() : d;
            this.c = MegaUtils.j(map, "delay", null);
            this.d = MegaUtils.x(map, "iconFont", null);
            this.e = MegaUtils.x(map, "iconURL", null);
            return;
        }
        throw new RuntimeException("content 参数必传！");
    }
}
