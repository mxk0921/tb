package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ClientPrerenderSolutionType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f24034a;
    public final String b;
    public final Map<String, ? extends Object> c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525336773);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(525336772);
    }

    public mgy() {
        this.f24034a = "";
        this.b = "";
    }

    public mgy(Map<String, ? extends Object> map) {
        this();
        String x = MegaUtils.x(map, "url", null);
        if (x != null) {
            this.f24034a = x;
            String a2 = ClientPrerenderSolutionType.Companion.a(MegaUtils.x(map, "type", null));
            if (a2 != null) {
                this.b = a2;
                this.c = MegaUtils.s(map, "needVerifyQuerys");
                Boolean h = MegaUtils.h(map, "skipReportStatus", Boolean.FALSE);
                this.d = h != null ? h.booleanValue() : false;
                return;
            }
            throw new RuntimeException("type 参数必传！");
        }
        throw new RuntimeException("url 参数必传！");
    }
}
