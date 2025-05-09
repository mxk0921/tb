package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class soh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f28171a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337276);
        }

        public a() {
        }

        @JvmStatic
        public final soh a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (soh) ipChange.ipc$dispatch("996dd09b", new Object[]{this, str});
            }
            ckf.g(str, "key");
            soh sohVar = new soh((a07) null);
            sohVar.f28171a = str;
            return sohVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337275);
    }

    public soh() {
        this.f28171a = "";
    }

    public /* synthetic */ soh(a07 a07Var) {
        this();
    }

    public soh(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f28171a = x;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }
}
