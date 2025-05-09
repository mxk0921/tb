package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class uoh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f29535a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337280);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525337279);
    }

    public uoh() {
        this.f29535a = 15000L;
        this.b = "";
    }

    public uoh(Map<String, ? extends Object> map) {
        this();
        long j = 15000;
        Long q = MegaUtils.q(map, RemoteMessageConst.TTL, 15000L);
        this.f29535a = q != null ? q.longValue() : j;
        String x = MegaUtils.x(map, "key", null);
        if (x != null) {
            this.b = x;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }
}
