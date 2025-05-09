package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.perf.model.PerformanceFlowModel;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30989a;
    public Map<String, String> b;
    public final String c;
    public final PerformanceFlowModel d;
    public final Map<String, Long> e = new HashMap();
    public final List<String> f = new ArrayList();
    public final b g = new b();
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30990a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f30990a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                wxl.a(wxl.this, this.f30990a, this.b);
                wxl wxlVar = wxl.this;
                wxl.c(wxlVar, wxl.b(wxlVar), this.f30990a, this.b);
                String jSONString = JSON.toJSONString(wxl.d(wxl.this));
                HashMap hashMap = new HashMap();
                hashMap.put("performance", jSONString);
                wxl.e(wxl.this, "tbcashdesk", hashMap);
                bf3.j("taobao.cashdesk.pay", wxl.f(wxl.this), wxl.g(wxl.this), 0.1f);
                hav.d("PerformanceTrace", wxl.f(wxl.this).toString());
                hav.d("PerformanceTrace", wxl.g(wxl.this).toString());
            } catch (Throwable th) {
                hav.d("PerformanceTrace", th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f30991a = 0;
        public long b = 0;
        public long c = 0;
        public long d = 0;
        public long e = 0;
        public long f = 0;
        public long g = 0;
    }

    public wxl(Context context, String str) {
        this.f30989a = context;
        PerformanceFlowModel performanceFlowModel = new PerformanceFlowModel("tbcashdesk", "收银台", null, null, "taobao.cashdesk.pay");
        this.d = performanceFlowModel;
        performanceFlowModel.setStartMills(System.currentTimeMillis());
        this.c = str;
    }

    public static /* synthetic */ void a(wxl wxlVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8956f283", new Object[]{wxlVar, str, str2});
        } else {
            wxlVar.i(str, str2);
        }
    }

    public static /* synthetic */ Map b(wxl wxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b214025", new Object[]{wxlVar});
        }
        return wxlVar.b;
    }

    public static /* synthetic */ void c(wxl wxlVar, Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8722b88", new Object[]{wxlVar, map, str, str2});
        } else {
            wxlVar.h(map, str, str2);
        }
    }

    public static /* synthetic */ PerformanceFlowModel d(wxl wxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerformanceFlowModel) ipChange.ipc$dispatch("d1378960", new Object[]{wxlVar});
        }
        return wxlVar.d;
    }

    public static /* synthetic */ void e(wxl wxlVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf9e1e8", new Object[]{wxlVar, str, map});
        } else {
            wxlVar.m(str, map);
        }
    }

    public static /* synthetic */ Map f(wxl wxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27d00d29", new Object[]{wxlVar});
        }
        return wxlVar.e;
    }

    public static /* synthetic */ List g(wxl wxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5471eab2", new Object[]{wxlVar});
        }
        return wxlVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wxl.i(java.lang.String, java.lang.String):void");
    }

    public final String j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61b45c48", new Object[]{this, map});
        }
        String str = map.get("orderids");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.valueOf(str.split(",").length);
    }

    public final String l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e837e440", new Object[]{this, map});
        }
        String str = map.get("signStr");
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public final void m(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4228f930", new Object[]{this, str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("EndToEnd_Performance_Detection", 19997, str, "", "", map).build());
        }
    }

    public final boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7252d150", new Object[]{this, str})).booleanValue();
        }
        return !"9000".equals(str);
    }

    public void p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
        } else {
            q(map, true);
        }
    }

    public void q(Map<String, String> map, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3402ab1", new Object[]{this, map, new Boolean(z)});
            return;
        }
        JSONObject a2 = igy.a(map);
        this.b = map;
        if (a2 != null) {
            str = a2.getString("paymentType");
        } else {
            str = "未知";
        }
        this.h = str;
        this.g.e = System.currentTimeMillis();
        Context context = this.f30989a;
        if (context instanceof Activity) {
            this.g.d = z ? ((Activity) context).getIntent().getLongExtra("NAV_START_ACTIVITY_TIME", 0L) : 0L;
        }
        if (a2 != null) {
            this.g.f30991a = u(a2.getString("startTime"), 0L);
            this.g.b = u(a2.getString("beforeRequestTime"), 0L);
            this.g.c = u(a2.getString("startToPay"), 0L);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3edd1d", new Object[]{this, str});
        } else {
            s(null, null, str);
        }
    }

    public void s(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603a87b1", new Object[]{this, str, str2, str3});
            return;
        }
        this.g.g = System.currentTimeMillis();
        if (!o(str3)) {
            pav.k(new a(str, str2));
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248549da", new Object[]{this});
        } else {
            this.g.f = System.currentTimeMillis();
        }
    }

    public final long u(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a0fe0d0", new Object[]{this, str, new Long(j)})).longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public final void h(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af80329", new Object[]{this, map, str, str2});
            return;
        }
        String valueOf = String.valueOf(n(map));
        String j = j(map);
        String str3 = map.get("from");
        HashMap hashMap = new HashMap(3);
        hashMap.put("litePay", valueOf);
        if (str != null) {
            hashMap.put(MspGlobalDefine.OPEN_TIME, str);
        }
        if (str2 != null) {
            hashMap.put("renderTime", str2);
        }
        hashMap.put("itemCount", j);
        hashMap.put("signStr", l(map));
        hashMap.put("cashierType", this.c);
        hashMap.put("litePay", valueOf);
        if (str3 != null) {
            hashMap.put("from", str3);
        }
        hashMap.put("paymentType", this.h);
        this.d.addCommonArgs(hashMap);
        List<String> list = this.f;
        ((ArrayList) list).add("类型：" + this.c);
        List<String> list2 = this.f;
        ((ArrayList) list2).add("免密：" + valueOf);
        List<String> list3 = this.f;
        ((ArrayList) list3).add("数量：" + j);
        List<String> list4 = this.f;
        ((ArrayList) list4).add("来源：" + str3);
        List<String> list5 = this.f;
        ((ArrayList) list5).add("支付：" + this.h);
    }

    public final boolean n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0ee8592", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("signStr");
        return str != null && str.contains("&agreement_no=") && str.contains("payService=\"litePay\"");
    }
}
