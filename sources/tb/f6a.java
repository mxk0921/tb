package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class f6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f19047a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336964);
        }

        public a() {
        }

        @JvmStatic
        public final f6a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f6a) ipChange.ipc$dispatch("f2442731", new Object[]{this, str});
            }
            ckf.g(str, "key");
            f6a f6aVar = new f6a((a07) null);
            f6aVar.f19047a = str;
            return f6aVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336963);
    }

    public f6a() {
        this.f19047a = "";
    }

    public /* synthetic */ f6a(a07 a07Var) {
        this();
    }

    public f6a(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.f19047a = x;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }
}
