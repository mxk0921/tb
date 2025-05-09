package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
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
public class tss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f28938a;
    public final Map<String, String> b;
    public final String c;
    public List<String> d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28939a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f28939a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                tss.a(tss.this, this.f28939a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f28940a;
        public final String b;

        static {
            t2o.a(1017118822);
            t2o.a(1018167315);
        }

        public b(String str, String str2) {
            this.b = str2;
            this.f28940a = str;
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            i4g.a("tanx_click_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f28940a));
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            i4g.a("tanx_click_request_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f28940a));
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_success", this.b);
            String str2 = this.b;
            i4g.a("tanx_click_request_success", str2, "ifs=" + Uri.encode(this.f28940a));
        }
    }

    static {
        t2o.a(1017118820);
    }

    public tss(String str, Map<String, String> map, Map<String, String> map2) {
        this.c = str;
        this.f28938a = map;
        this.b = map2;
    }

    public static /* synthetic */ void a(tss tssVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707d8df", new Object[]{tssVar, str, str2});
        } else {
            tssVar.b(str, str2);
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b166ac4", new Object[]{this});
        }
        if (this.e == null) {
            this.e = vzo.c(this.f28938a);
        }
        return this.e;
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
            if (!wss.b().c() || !e()) {
                UserTrackLogs.trackAdLog("tanx_click_invoke_success", c());
                i4g.a("tanx_click_invoke_success", c());
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String host = Uri.parse(str).getHost();
                    if (TextUtils.isEmpty(host)) {
                        i4g.a("tanx_click_invalid_url", "msg=domain_not_right", c());
                    } else {
                        AdThreadExecutor.execute(new a(str, d(host)));
                    }
                }
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_report_exposer", c());
            i4g.a("tanx_click_report_exposer", c());
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f7d64e", new Object[]{this, str});
            return;
        }
        i4g.a("tanx_click_parse_error", c(), "error_msg=" + str, "tracking_json=" + Uri.encode(this.c));
        UserTrackLogs.trackAdLog("tanx_click_parse_error", c(), "error_msg=" + str, "tracking_json=" + Uri.encode(this.c));
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
        UserTrackLogs.trackAdLog("tanx_click_request", str2);
        i4g.a("tanx_click_request", str2, "ifs=" + Uri.encode(str));
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
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f28938a.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            ed0.h().a(this.d, new bd0.a().g(jSONObject).f(this.f28938a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).e());
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
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.f28938a == null) {
            this.f28938a = new HashMap();
        }
        JSONArray parseArray = JSON.parseArray(this.c);
        if (parseArray == null) {
            h("tracking_json_parse_error");
        }
        for (int i = 0; i < parseArray.size(); i++) {
            this.d.add(parseArray.getString(i));
        }
        if (TextUtils.isEmpty(this.f28938a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID))) {
            h("pid_empty");
        }
        if (this.d.size() == 0) {
            h("urlList_empty");
        }
        List<String> list = this.d;
        return list != null && list.size() > 0;
    }
}
