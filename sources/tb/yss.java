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
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import tb.bd0;
import tb.tp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yss {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Queue<String> g = new ConcurrentLinkedQueue();
    public static final Map<String, wrj> h = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f32325a;
    public Map<String, String> b;
    public final Map<String, String> c;
    public final String d;
    public List<String> e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32326a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f32326a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yss.a(yss.this, this.f32326a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f32327a;
        public final String b;
        public final String c;

        static {
            t2o.a(1017118830);
            t2o.a(1018167315);
        }

        public b(yss yssVar, String str, String str2, String str3) {
            this.f32327a = str;
            this.c = str3;
            this.b = str2;
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_request_tmp_fail", this.c, "error_code=" + str, "error_msg=" + str2);
            i4g.a("tanx_imp_request_tmp_fail", this.c, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.b));
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_request_fail", this.c, "error_code=" + str, "error_msg=" + str2);
            i4g.a("tanx_imp_request_fail", this.c, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.b));
            yss.b().remove(this.f32327a);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_request_success", this.c);
            String str2 = this.c;
            i4g.a("tanx_imp_request_success", str2, "ifs=" + Uri.encode(this.b));
            yss.b().remove(this.f32327a);
            if (yss.c().size() >= 1000) {
                yss.c().poll();
            }
            yss.c().offer(this.f32327a);
        }
    }

    static {
        t2o.a(1017118828);
    }

    public yss(String str, Map<String, String> map, Map<String, String> map2) {
        this.d = str;
        this.b = map;
        this.c = map2;
        this.f32325a = vzo.o(str);
    }

    public static /* synthetic */ void a(yss yssVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea1b390", new Object[]{yssVar, str, str2, str3});
        } else {
            yssVar.d(str, str2, str3);
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("e2a0e399", new Object[0]);
        }
        return g;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b166ac4", new Object[]{this});
        }
        if (this.f == null) {
            String str = "json_hash=" + this.f32325a;
            String c = vzo.c(this.b);
            if (!TextUtils.isEmpty(c)) {
                str = str + "," + c;
            }
            this.f = str;
        }
        return this.f;
    }

    public final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7aa701d", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder(e());
        if (!TextUtils.isEmpty(str)) {
            sb.append(",host=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(",ifs_hash=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc57eaa", new Object[]{this});
        } else if (i()) {
            if (!g() || !wss.b().c()) {
                UserTrackLogs.trackAdLog("tanx_imp_invoke_success", e());
                i4g.a("tanx_imp_invoke_success", e());
                Iterator it = ((ArrayList) this.e).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String o = vzo.o(str);
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(o)) {
                        i4g.a("tanx_imp_invalid_url", "msg=url_is_empty_or_hash_error", e());
                    } else {
                        String host = Uri.parse(str).getHost();
                        if (TextUtils.isEmpty(host)) {
                            i4g.a("tanx_imp_invalid_url", "msg=domain_not_right", e());
                        } else {
                            String f = f(host, o);
                            if (((ConcurrentLinkedQueue) g).contains(o)) {
                                UserTrackLogs.trackAdLog("tanx_imp_request_duplicated", f);
                                i4g.a("tanx_imp_request_duplicated", f);
                            } else {
                                AdThreadExecutor.execute(new a(str, o, f));
                            }
                        }
                    }
                }
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_report_exposer", e());
            i4g.a("tanx_imp_report_exposer", e());
        }
    }

    public final void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305dae49", new Object[]{this, str, str2, str3});
        } else if (((ConcurrentLinkedQueue) g).contains(str2)) {
            UserTrackLogs.trackAdLog("tanx_imp_request_duplicated", str3);
            i4g.a("tanx_imp_request_duplicated", str3);
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h;
            wrj wrjVar = (wrj) concurrentHashMap.get(str2);
            if (wrjVar != null) {
                wrjVar.a();
                i4g.a("tanx_imp_request_pending", str3);
                return;
            }
            Map<String, String> map = this.c;
            if (map != null && !map.isEmpty()) {
                str = n0j.a(str, Uri.encode(vzo.n(this.c)));
            }
            UserTrackLogs.trackAdLog("tanx_imp_request", str3);
            i4g.a("tanx_imp_request", str3, "ifs=" + Uri.encode(str));
            tp0.a aVar = new tp0.a(str, jsj.RETRY_FIVE_TIMES);
            aVar.o(true);
            aVar.p(3);
            aVar.n(20000);
            aVar.q(30000);
            aVar.m(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
            tp0 tp0Var = new tp0(aVar);
            tp0Var.k(new b(this, str2, str, str3));
            concurrentHashMap.put(str2, gsj.a().c(tp0Var));
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e96e9eb", new Object[]{this})).booleanValue();
        }
        try {
            if (!vm2.t()) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            ed0.h().b(this.e, new bd0.a().g(jSONObject).f(this.b.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).e());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dc0c73b", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        String a2 = bts.a(this.d, this.e, this.b);
        if (!TextUtils.isEmpty(a2)) {
            i4g.a("tanx_imp_parse_error", e(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
            UserTrackLogs.trackAdLog("tanx_imp_parse_error", e(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
        }
        List<String> list = this.e;
        return list != null && list.size() > 0;
    }
}
