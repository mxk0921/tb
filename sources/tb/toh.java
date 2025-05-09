package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class toh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public long f28843a;
    public String b;
    public String c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337278);
        }

        public a() {
        }

        @JvmStatic
        public final toh a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (toh) ipChange.ipc$dispatch("9417704c", new Object[]{this, str, str2});
            }
            ckf.g(str, "key");
            ckf.g(str2, "value");
            toh tohVar = new toh((a07) null);
            tohVar.b = str;
            tohVar.c = str2;
            return tohVar;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337277);
    }

    public toh() {
        this.f28843a = 15000L;
        this.b = "";
        this.c = "";
        this.d = true;
    }

    @JvmStatic
    public static final toh a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (toh) ipChange.ipc$dispatch("9417704c", new Object[]{str, str2});
        }
        return Companion.a(str, str2);
    }

    public /* synthetic */ toh(a07 a07Var) {
        this();
    }

    public toh(Map<String, ? extends Object> map) {
        this();
        long j = 15000;
        Long q = MegaUtils.q(map, RemoteMessageConst.TTL, 15000L);
        this.f28843a = q != null ? q.longValue() : j;
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.b = x;
            String x2 = MegaUtils.x(map, "value", null);
            if (x2 != null) {
                this.c = x2;
                Boolean h = MegaUtils.h(map, "removeAfterRead", Boolean.TRUE);
                this.d = h != null ? h.booleanValue() : true;
                return;
            }
            throw new RuntimeException("value 参数必传！");
        }
        throw new RuntimeException("key 参数必传！");
    }
}
