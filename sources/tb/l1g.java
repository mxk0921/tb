package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class l1g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f23052a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337239);
        }

        public a() {
        }

        @JvmStatic
        public final l1g a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l1g) ipChange.ipc$dispatch("fcc31bee", new Object[]{this, str, str2});
            }
            ckf.g(str, "bizID");
            ckf.g(str2, "key");
            l1g l1gVar = new l1g((a07) null);
            l1gVar.f23052a = str;
            l1gVar.b = str2;
            return l1gVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337238);
    }

    public l1g() {
        this.f23052a = "";
        this.b = "";
    }

    public /* synthetic */ l1g(a07 a07Var) {
        this();
    }

    public l1g(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "bizID", null);
        if (x != null) {
            this.f23052a = x;
            String x2 = MegaUtils.x(map, "key", null);
            if (x2 != null) {
                this.b = x2;
                return;
            }
            throw new RuntimeException("key 参数必传！");
        }
        throw new RuntimeException("bizID 参数必传！");
    }
}
