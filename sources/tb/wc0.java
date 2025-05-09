package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.click.cps.O2OCpsSendRequest;
import com.o2o.ad.click.cps.O2OCpsSendResponse;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30601a = vzo.g();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f30602a;

        static {
            t2o.a(1019215893);
            t2o.a(1018167315);
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
            ztv.b("o2o_cps_request_fail", "req_id=" + wc0.a(wc0.this));
            j4g.a("o2o_cps_request_fail", "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            ztv.b("o2o_cps_request_success", "req_id=" + wc0.a(wc0.this));
            j4g.a("o2o_cps_request_success", vzo.c(this.f30602a));
        }

        public b(Map<String, String> map) {
            this.f30602a = map;
        }
    }

    static {
        t2o.a(1019215891);
    }

    public static /* synthetic */ String a(wc0 wc0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e245421", new Object[]{wc0Var});
        }
        return wc0Var.f30601a;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfdf39b", new Object[]{this, map});
            return;
        }
        O2OCpsSendRequest o2OCpsSendRequest = new O2OCpsSendRequest();
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        o6j o6jVar = new o6j(null, jsj.DEFAULT_NO_RETRY, o2OCpsSendRequest, hashMap, O2OCpsSendResponse.class);
        o6jVar.k(new b(hashMap));
        gsj.a().c(o6jVar);
        String c = vzo.c(hashMap);
        ztv.b("o2o_cps_request_send", c, "req_id=" + this.f30601a);
        j4g.a("o2o_cps_request_send", new String[0]);
    }
}
