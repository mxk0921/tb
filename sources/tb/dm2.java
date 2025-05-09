package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.BrowserBadge;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeRequestParams;
import com.taobao.tab2interact.core.utils.MtopUtils;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dm2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f17909a;
    public final b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17910a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.f17910a = str;
            this.b = j;
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b63e5d", new Object[]{this, mtopResponse});
                return;
            }
            dm2.b(dm2.this, 0);
            dm2.c(dm2.this, this.f17910a, this.b, mtopResponse);
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                return;
            }
            dm2 dm2Var = dm2.this;
            dm2.b(dm2Var, dm2.a(dm2Var) + 1);
            dm2.d(dm2.this, this.f17910a, this.b, mtopResponse);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(689963023);
    }

    public dm2(b bVar) {
        this.b = bVar;
    }

    public static /* synthetic */ int a(dm2 dm2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("491ba8eb", new Object[]{dm2Var})).intValue();
        }
        return dm2Var.f17909a;
    }

    public static /* synthetic */ int b(dm2 dm2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a32c400", new Object[]{dm2Var, new Integer(i)})).intValue();
        }
        dm2Var.f17909a = i;
        return i;
    }

    public static /* synthetic */ void c(dm2 dm2Var, String str, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96e9848", new Object[]{dm2Var, str, new Long(j), mtopResponse});
        } else {
            dm2Var.f(str, j, mtopResponse);
        }
    }

    public static /* synthetic */ void d(dm2 dm2Var, String str, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84263b09", new Object[]{dm2Var, str, new Long(j), mtopResponse});
        } else {
            dm2Var.e(str, j, mtopResponse);
        }
    }

    public final void e(String str, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142b587e", new Object[]{this, str, new Long(j), mtopResponse});
            return;
        }
        try {
            String str2 = new String(mtopResponse.getBytedata());
            vgh.c(this, "BrowserBadgeDataRequester", "数据请求失败，result=".concat(str2));
            t0j.b("BrowserRequestData", "RequestError", "数据请求失败", "result=".concat(str2));
            g(str, j);
        } catch (Exception e) {
            vgh.d(this, "BrowserBadgeDataRequester", "数据请求失败，处理返回结果异常", e);
            t0j.c("BrowserRequestData", "HandleErrorException", "处理失败数据异常", null, e);
            g(str, j);
        }
    }

    public final void g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e987786", new Object[]{this, str, new Long(j)});
            return;
        }
        b bVar = this.b;
        if (bVar != null) {
            ((BrowserBadge) bVar).Z0(str, SystemClock.elapsedRealtime() - j);
        }
    }

    public final void h(String str, long j, JSONObject jSONObject, BrowserBadgeModel browserBadgeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df99aa8a", new Object[]{this, str, new Long(j), jSONObject, browserBadgeModel});
            return;
        }
        b bVar = this.b;
        if (bVar != null) {
            ((BrowserBadge) bVar).a1(str, jSONObject, browserBadgeModel, SystemClock.elapsedRealtime() - j);
        }
    }

    public void i(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed293aa4", new Object[]{this, str, new Long(j), str2});
        } else if (this.f17909a >= 5) {
            vgh.c(this, "BrowserBadgeDataRequester", "请求数据，达到最大请求数据失败次数");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("duration", (Object) Long.valueOf(j));
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("extParams", (Object) str2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("entityId", (Object) "94269");
            jSONObject2.put("params", (Object) JSON.toJSONString(jSONObject));
            vgh.c(this, "BrowserBadgeDataRequester", "请求数据，data=" + JSON.toJSONString(jSONObject2));
            BrowserBadgeRequestParams browserBadgeRequestParams = new BrowserBadgeRequestParams();
            browserBadgeRequestParams.setData(jSONObject2);
            MtopUtils.INSTANCE.e(browserBadgeRequestParams, new a(str, elapsedRealtime));
        }
    }

    public final void f(String str, long j, MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639ae363", new Object[]{this, str, new Long(j), mtopResponse});
            return;
        }
        try {
            String str2 = new String(mtopResponse.getBytedata());
            JSONObject jSONObject2 = JSON.parseObject(str2).getJSONObject("data");
            if (!(jSONObject2 == null || !(this.b instanceof BrowserBadge) || (jSONObject = jSONObject2.getJSONObject(com.taobao.tab2interact.core.component.browser.data.a.KEY_OPTBALANCES)) == null)) {
                JSONObject jSONObject3 = new JSONObject(1);
                jSONObject3.put(com.taobao.tab2interact.core.component.browser.data.a.KEY_OPTBALANCES, (Object) jSONObject);
                ((BrowserBadge) this.b).i1(jSONObject3);
            }
            com.taobao.tab2interact.core.component.browser.data.a.p(jSONObject2);
            BrowserBadgeModel a2 = com.taobao.tab2interact.core.component.browser.data.a.a(jSONObject2);
            if (com.taobao.tab2interact.core.component.browser.data.a.r(a2)) {
                vgh.c(this, "BrowserBadgeDataRequester", "数据请求成功，判断解析的数据有效，result=".concat(str2));
                t0j.d("BrowserRequestData", null);
                com.taobao.tab2interact.core.component.browser.data.a.q(a2);
                h(str, j, jSONObject2, a2);
                return;
            }
            vgh.c(this, "BrowserBadgeDataRequester", "数据请求成功，判断解析的数据无效，result=".concat(str2));
            t0j.b("BrowserRequestData", "VerifyNotValid", "验证数据无效", "result=".concat(str2));
            g(str, j);
        } catch (Exception e) {
            vgh.d(this, "BrowserBadgeDataRequester", "数据请求成功，处理返回结果异常", e);
            t0j.c("BrowserRequestData", "HandleSuccessException", "处理成功数据异常", null, e);
            g(str, j);
        }
    }
}
