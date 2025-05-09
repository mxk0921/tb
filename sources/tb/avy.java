package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.tab2interact.core.component.revisitedu.data.RevisitEduDialogModel;
import com.taobao.tab2interact.core.component.revisitedu.data.RevisitEduDialogRequestParams;
import com.taobao.tab2interact.core.utils.MtopUtils;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class avy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final b f16033a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963093);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(RevisitEduDialogModel revisitEduDialogModel, long j);

        void h(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements MtopUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        public c(long j) {
            this.b = j;
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b63e5d", new Object[]{this, mtopResponse});
            } else {
                avy.b(avy.this, this.b, mtopResponse);
            }
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
            } else {
                avy.a(avy.this, this.b, mtopResponse);
            }
        }
    }

    static {
        t2o.a(689963092);
    }

    public avy(b bVar) {
        ckf.g(bVar, "dataCallback");
        this.f16033a = bVar;
    }

    public static final /* synthetic */ void a(avy avyVar, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402902b8", new Object[]{avyVar, new Long(j), mtopResponse});
        } else {
            avyVar.c(j, mtopResponse);
        }
    }

    public static final /* synthetic */ void b(avy avyVar, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4341b1d", new Object[]{avyVar, new Long(j), mtopResponse});
        } else {
            avyVar.d(j, mtopResponse);
        }
    }

    public final void c(long j, MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc993848", new Object[]{this, new Long(j), mtopResponse});
            return;
        }
        if (mtopResponse != null) {
            try {
                byte[] bytedata = mtopResponse.getBytedata();
                if (bytedata != null) {
                    str = new String(bytedata, uj3.UTF_8);
                    vgh.c(this, "RevisitEduDialogDataRequester", "数据请求失败，result=" + str);
                    t0j.b("RevisitEduDialogRequestData", "RequestError", "数据请求失败", "result=" + str);
                    e(j);
                }
            } catch (Exception e) {
                vgh.d(this, "RevisitEduDialogDataRequester", "数据请求失败，处理返回结果异常", e);
                t0j.c("RevisitEduDialogRequestData", "HandleErrorException", "处理失败数据异常", null, e);
                e(j);
                return;
            }
        }
        str = null;
        vgh.c(this, "RevisitEduDialogDataRequester", "数据请求失败，result=" + str);
        t0j.b("RevisitEduDialogRequestData", "RequestError", "数据请求失败", "result=" + str);
        e(j);
    }

    public final void d(long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784f226d", new Object[]{this, new Long(j), mtopResponse});
            return;
        }
        try {
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "response.bytedata");
                String str = new String(bytedata, uj3.UTF_8);
                JSONObject jSONObject = JSON.parseObject(str).getJSONObject("data");
                dvy dvyVar = dvy.INSTANCE;
                RevisitEduDialogModel a2 = dvyVar.a(jSONObject);
                if (dvyVar.c(a2)) {
                    vgh.c(this, "RevisitEduDialogDataRequester", "数据请求成功，判断解析的数据有效，result=".concat(str));
                    t0j.d("RevisitEduDialogRequestData", null);
                    if (a2 != null) {
                        f(j, a2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.tab2interact.core.component.revisitedu.data.RevisitEduDialogModel");
                }
                vgh.c(this, "RevisitEduDialogDataRequester", "数据请求成功，判断解析的数据无效，result=".concat(str));
                t0j.b("RevisitEduDialogRequestData", "VerifyNotValid", "验证数据无效", "result=".concat(str));
                e(j);
                return;
            }
            vgh.c(this, "RevisitEduDialogDataRequester", "数据请求成功，response为空");
            t0j.b("RevisitEduDialogRequestData", "ResponseNull", "response为空", null);
            e(j);
        } catch (Exception e) {
            vgh.d(this, "RevisitEduDialogDataRequester", "数据请求成功，处理返回结果异常", e);
            t0j.c("RevisitEduDialogRequestData", "HandleSuccessException", "处理成功数据异常", null, e);
            e(j);
        }
    }

    public final void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f466310", new Object[]{this, new Long(j)});
        } else {
            this.f16033a.h(SystemClock.elapsedRealtime() - j);
        }
    }

    public final void f(long j, RevisitEduDialogModel revisitEduDialogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a38845", new Object[]{this, new Long(j), revisitEduDialogModel});
        } else {
            this.f16033a.a(revisitEduDialogModel, SystemClock.elapsedRealtime() - j);
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4f18aa", new Object[]{this, str});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("extParams", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MUSMonitor.MODULE_DIM_ABILITY, (Object) "resource-fetch");
        jSONObject2.put("subType", (Object) "backEducation");
        jSONObject2.put("exParams", (Object) jSONObject);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "bizType", "wangzhuan");
        jSONObject3.put((JSONObject) "models", JSON.toJSONString(jSONArray));
        vgh.c(this, "RevisitEduDialogDataRequester", "请求数据，data=" + jSONObject3);
        RevisitEduDialogRequestParams revisitEduDialogRequestParams = new RevisitEduDialogRequestParams();
        revisitEduDialogRequestParams.setData(jSONObject3);
        MtopUtils.INSTANCE.e(revisitEduDialogRequestParams, new c(elapsedRealtime));
    }
}
