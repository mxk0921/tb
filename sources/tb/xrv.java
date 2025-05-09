package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xrv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f31560a;
    public String b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337661);
        }

        public a() {
        }

        @JvmStatic
        public final xrv a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xrv) ipChange.ipc$dispatch("64e56e18", new Object[]{this, str, str2, str3});
            }
            ckf.g(str, "bizID");
            ckf.g(str2, "key");
            ckf.g(str3, "value");
            xrv xrvVar = new xrv((a07) null);
            xrvVar.f31560a = str;
            xrvVar.b = str2;
            xrvVar.c = str3;
            return xrvVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337660);
    }

    public xrv() {
        this.f31560a = "";
        this.b = "";
        this.c = "";
    }

    public /* synthetic */ xrv(a07 a07Var) {
        this();
    }

    public xrv(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizID", null);
        if (x != null) {
            this.f31560a = x;
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
