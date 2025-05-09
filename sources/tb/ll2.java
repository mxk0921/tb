package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ll2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f23391a;
    public String b;
    public Map<String, ? extends Object> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336739);
        }

        public a() {
        }

        @JvmStatic
        public final ll2 a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ll2) ipChange.ipc$dispatch("a3c39c9a", new Object[]{this, str});
            }
            ckf.g(str, "eventName");
            ll2 ll2Var = new ll2((a07) null);
            ll2Var.b = str;
            return ll2Var;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336738);
    }

    public ll2() {
        this.b = "";
    }

    @JvmStatic
    public static final ll2 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ll2) ipChange.ipc$dispatch("a3c39c9a", new Object[]{str});
        }
        return Companion.a(str);
    }

    public /* synthetic */ ll2(a07 a07Var) {
        this();
    }

    public ll2(Map<String, ? extends Object> map) {
        this();
        this.f23391a = MegaUtils.x(map, "bizId", null);
        String x = MegaUtils.x(map, "eventName", null);
        if (x != null) {
            this.b = x;
            this.c = MegaUtils.s(map, "detail");
            return;
        }
        throw new RuntimeException("eventName 参数必传！");
    }
}
