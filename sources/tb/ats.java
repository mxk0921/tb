package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.bd0;
import tb.tp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ats {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f15996a;
    public final Map<String, String> b;
    public final Map<String, String> c;
    public final String d;
    public List<String> e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15997a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f15997a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ats.a(ats.this, this.f15997a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f15998a;
        public final String b;

        static {
            t2o.a(1017118834);
            t2o.a(1018167315);
        }

        public b(String str, String str2) {
            this.b = str2;
            this.f15998a = str;
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            i4g.a("tanx_interact_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f15998a));
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_request_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            i4g.a("tanx_interact_request_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f15998a));
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_request_success", this.b);
            String str2 = this.b;
            i4g.a("tanx_interact_request_success", str2, "ifs=" + Uri.encode(this.f15998a));
        }
    }

    static {
        t2o.a(1017118832);
    }

    public ats(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this.d = str;
        this.f15996a = map;
        this.b = map2;
        this.c = map3;
    }

    public static /* synthetic */ void a(ats atsVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b8007a", new Object[]{atsVar, str, str2});
        } else {
            atsVar.b(str, str2);
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b166ac4", new Object[]{this});
        }
        if (this.f == null) {
            this.f = vzo.c(this.f15996a);
        }
        return this.f;
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da6ad067", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(c());
        if (!TextUtils.isEmpty(str)) {
            sb.append(",host=");
            sb.append(str);
        }
        return sb.toString();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc57eaa", new Object[]{this});
        } else if (g()) {
            if (!e() || !wss.b().c()) {
                UserTrackLogs.trackAdLog("tanx_interact_invoke_success", c());
                i4g.a("tanx_interact_invoke_success", c());
                Iterator it = ((ArrayList) this.e).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String host = Uri.parse(str).getHost();
                    if (TextUtils.isEmpty(host)) {
                        i4g.a("tanx_interact_invalid_url", "msg=domain_not_right", c());
                    } else {
                        AdThreadExecutor.execute(new a(str, d(host)));
                    }
                }
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_report_exposer", c());
            i4g.a("tanx_interact_report_exposer", c());
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7bf63f", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> map = this.b;
        if (map != null && !map.isEmpty()) {
            str = n0j.a(str, Uri.encode(vzo.n(this.b)));
        }
        Map<String, String> map2 = this.c;
        if (map2 != null && !map2.isEmpty()) {
            str = n0j.b(str, this.c);
        }
        UserTrackLogs.trackAdLog("tanx_interact_request", str2);
        i4g.a("tanx_interact_request", str2, "ifs=" + Uri.encode(str));
        tp0.a aVar = new tp0.a(str, jsj.RETRY_FIVE_TIMES);
        aVar.o(true);
        aVar.p(3);
        aVar.n(20000);
        aVar.q(30000);
        aVar.m(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
        tp0 tp0Var = new tp0(aVar);
        tp0Var.k(new b(str, str2));
        gsj.a().c(tp0Var);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e96e9eb", new Object[]{this})).booleanValue();
        }
        try {
            if (!vm2.t()) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f15996a.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            ed0.h().c(this.e, new bd0.a().g(jSONObject).f(this.f15996a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).e());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dc0c73b", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.f15996a == null) {
            this.f15996a = new HashMap();
        }
        String a2 = bts.a(this.d, this.e, this.f15996a);
        if (!TextUtils.isEmpty(a2)) {
            i4g.a("tanx_interact_parse_error", c(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
            UserTrackLogs.trackAdLog("tanx_interact_parse_error", c(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
        }
        List<String> list = this.e;
        return list != null && list.size() > 0;
    }
}
