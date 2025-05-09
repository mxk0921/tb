package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.click.cpa.O2OCpaSendRequest;
import com.o2o.ad.click.cpa.O2OCpaSendResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28627a;
    public final Map<String, String> b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1019215886);
            t2o.a(1018167315);
        }

        public a() {
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
            }
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            ztv.b("o2o_cpa_request_fail", vzo.c(tc0.a(tc0.this)));
            j4g.a("o2o_cpa_request_fail", "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            ztv.b("o2o_cpa_request_success", vzo.c(tc0.a(tc0.this)));
            j4g.a("o2o_cpa_request_success", vzo.c(tc0.a(tc0.this)));
        }
    }

    static {
        t2o.a(1019215885);
    }

    public tc0(String str, String str2, Map<String, String> map) {
        this.f28627a = str;
        this.c = str2;
        this.b = map;
    }

    public static /* synthetic */ Map a(tc0 tc0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d568699", new Object[]{tc0Var});
        }
        return tc0Var.b;
    }

    public String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d44a65", new Object[]{this, map});
        }
        return c(map);
    }

    public final String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("991037c2", new Object[]{this, map});
        }
        if (TextUtils.isEmpty(this.f28627a)) {
            return "";
        }
        String d = d();
        O2OCpaSendRequest o2OCpaSendRequest = new O2OCpaSendRequest();
        Map b = apv.b(this.f28627a);
        if (b == null) {
            b = new HashMap();
        }
        b.put(com.taobao.android.weex_uikit.widget.input.a.EXTRA_ACTION_ID, d);
        b.put("actionType", this.c);
        if (map != null && !map.isEmpty()) {
            b.putAll(map);
        }
        o6j o6jVar = new o6j(this.f28627a, jsj.DEFAULT_NO_RETRY, o2OCpaSendRequest, b, O2OCpaSendResponse.class);
        o6jVar.k(new a());
        gsj.a().c(o6jVar);
        ztv.b("o2o_cpa_request_send", vzo.c(this.b));
        j4g.a("o2o_cpa_request_send", vzo.c(this.b));
        return d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4428d586", new Object[]{this});
        }
        return "O2O_A2_" + vzo.d();
    }
}
