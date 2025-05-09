package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m58 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f23778a = new JSONObject();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m58.a(m58.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f23780a;
        public final /* synthetic */ IContainerDataService b;
        public final /* synthetic */ long c;

        public b(long j, IContainerDataService iContainerDataService, long j2) {
            this.f23780a = j;
            this.b = iContainerDataService;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            m58.a(m58.this).put("zeroScrollTimestamp", (Object) Long.valueOf(this.f23780a));
            m58.a(m58.this).put("sessionId", (Object) m58.c(m58.this, this.b));
            m58.a(m58.this).put("dataType", (Object) m58.d(m58.this, this.b));
            m58.a(m58.this).put("dataOnscreenTimestamp", (Object) Long.valueOf(this.c));
            fve.e("DynamicRtUserTracer", "第0页滚动开始点位：" + m58.a(m58.this).toJSONString());
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_first_screen_scroll_trigger", null, null, gqv.a(m58.a(m58.this)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IContainerDataService f23781a;
        public final /* synthetic */ String b;

        public c(IContainerDataService iContainerDataService, String str) {
            this.f23781a = iContainerDataService;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            m58 m58Var = m58.this;
            JSONObject a2 = m58.a(m58Var);
            String str = this.b;
            m58.b(m58Var, m58Var.g(a2, str, ul4.b(this.f23781a.getContainerData()) + "", m58.c(m58.this, this.f23781a), m58.e(m58.this, this.f23781a) + "", uptimeMillis + ""));
            StringBuilder sb = new StringBuilder("翻页请求开始点位：");
            sb.append(m58.a(m58.this).toJSONString());
            fve.e("DynamicRtUserTracer", sb.toString());
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_prefetch_request_trigger", null, null, gqv.a(m58.a(m58.this)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23782a;

        public d(String str) {
            this.f23782a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (m58.a(m58.this) != null && !m58.a(m58.this).isEmpty()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                JSONObject a2 = m58.a(m58.this);
                a2.put("requestDidFinished", (Object) (uptimeMillis + ""));
                m58.a(m58.this).put("extendedTime", (Object) this.f23782a);
                fve.e("DynamicRtUserTracer", "翻页请求完成点位：" + m58.a(m58.this).toJSONString());
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_prefetch_request_did_finished", null, null, gqv.a(m58.a(m58.this)));
                m58 m58Var = m58.this;
                if (m58.f(m58Var, m58.a(m58Var))) {
                    m58.a(m58.this).clear();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f23783a;

        public e(Map map) {
            this.f23783a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (m58.a(m58.this) != null && !m58.a(m58.this).isEmpty()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                JSONObject a2 = m58.a(m58.this);
                a2.put("lastModelWillDisplay", (Object) (uptimeMillis + ""));
                Map map = this.f23783a;
                if (map != null && !map.isEmpty()) {
                    m58.a(m58.this).putAll(this.f23783a);
                }
                fve.e("DynamicRtUserTracer", "翻页请求最后一张完成点位：" + m58.a(m58.this).toJSONString());
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_show_last_model_will_display", null, null, gqv.a(m58.a(m58.this)));
                m58 m58Var = m58.this;
                if (m58.f(m58Var, m58.a(m58Var))) {
                    m58.a(m58.this).clear();
                }
            }
        }
    }

    static {
        t2o.a(491782682);
    }

    public static /* synthetic */ JSONObject a(m58 m58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f4313089", new Object[]{m58Var});
        }
        return m58Var.f23778a;
    }

    public static /* synthetic */ JSONObject b(m58 m58Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85520b05", new Object[]{m58Var, jSONObject});
        }
        m58Var.f23778a = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String c(m58 m58Var, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8e45e8", new Object[]{m58Var, iContainerDataService});
        }
        return m58Var.o(iContainerDataService);
    }

    public static /* synthetic */ String d(m58 m58Var, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("918cade9", new Object[]{m58Var, iContainerDataService});
        }
        return m58Var.m(iContainerDataService);
    }

    public static /* synthetic */ int e(m58 m58Var, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79063969", new Object[]{m58Var, iContainerDataService})).intValue();
        }
        return m58Var.n(iContainerDataService);
    }

    public static /* synthetic */ boolean f(m58 m58Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22dd5627", new Object[]{m58Var, jSONObject})).booleanValue();
        }
        return m58Var.p(jSONObject);
    }

    public JSONObject g(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c12c2dbf", new Object[]{this, jSONObject, str, str2, str3, str4, str5});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                fve.c("DynamicRtUserTracer", "bxFeatures encode error", e2);
            }
            jSONObject.put("bxFeatures", (Object) str);
        }
        jSONObject.put("pageNum", (Object) str2);
        jSONObject.put("sessionId", (Object) str3);
        jSONObject.put("pageLastIndex", (Object) str4);
        jSONObject.put("requestStart", (Object) str5);
        return jSONObject;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9614fb", new Object[]{this});
        } else {
            get.a().e(new a());
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be6eff6", new Object[]{this, str});
        } else {
            get.a().e(new d(str));
        }
    }

    public void j(String str, IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9a1a05", new Object[]{this, str, iContainerDataService});
        } else {
            get.a().e(new c(iContainerDataService, str));
        }
    }

    public void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9473a145", new Object[]{this, map});
        } else {
            get.a().e(new e(map));
        }
    }

    public void l(IContainerDataService<?> iContainerDataService, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fadb0da", new Object[]{this, iContainerDataService, new Long(j), new Long(j2)});
        } else {
            get.a().e(new b(j, iContainerDataService, j2));
        }
    }

    public final String m(IContainerDataService<?> iContainerDataService) {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28fde97f", new Object[]{this, iContainerDataService});
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null || (base = containerData.getBase()) == null) {
            return "unknown";
        }
        if (base.isRemote()) {
            return "remote";
        }
        return "cache";
    }

    public final int n(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d76b038", new Object[]{this, iContainerDataService})).intValue();
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            return -1;
        }
        return containerData.getTotalData().size() - 1;
    }

    public final String o(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2cf95e0", new Object[]{this, iContainerDataService});
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            return null;
        }
        List totalData = containerData.getTotalData();
        if (totalData.isEmpty()) {
            return null;
        }
        Object b2 = kr8.b("args.utLogMapEdge.sessionId", (BaseSectionModel) totalData.get(0));
        if (b2 instanceof String) {
            return (String) b2;
        }
        return null;
    }

    public final boolean p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3451169c", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject.containsKey("requestDidFinished") && jSONObject.containsKey("lastModelWillDisplay");
    }
}
