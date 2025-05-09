package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.layer.h5.data.H5InteractLayerRequestParams;
import com.taobao.tab2interact.core.utils.MtopUtils;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class apa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final b f15916a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963128);
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
        void b(JSONObject jSONObject, long j);

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
                apa.b(apa.this, this.b, mtopResponse);
            }
        }

        @Override // com.taobao.tab2interact.core.utils.MtopUtils.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
            } else {
                apa.a(apa.this, this.b, mtopResponse);
            }
        }
    }

    static {
        t2o.a(689963127);
    }

    public apa(b bVar) {
        ckf.g(bVar, "dataCallback");
        this.f15916a = bVar;
    }

    public static final /* synthetic */ void a(apa apaVar, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201907d5", new Object[]{apaVar, new Long(j), mtopResponse});
        } else {
            apaVar.c(j, mtopResponse);
        }
    }

    public static final /* synthetic */ void b(apa apaVar, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd52f50", new Object[]{apaVar, new Long(j), mtopResponse});
        } else {
            apaVar.d(j, mtopResponse);
        }
    }

    public final void c(long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc993848", new Object[]{this, new Long(j), mtopResponse});
            return;
        }
        try {
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "response.bytedata");
                String str = new String(bytedata, uj3.UTF_8);
                vgh.c(this, "H5InteractLayerDataRequester", "数据请求失败，response不为空，result=".concat(str));
                t0j.b("H5RequestData", "RequestError", "数据请求失败", "result=".concat(str));
                e(j);
            } else {
                vgh.c(this, "H5InteractLayerDataRequester", "数据请求失败，response为空");
                t0j.b("H5RequestData", "ResponseNull", "response为空", null);
                e(j);
            }
        } catch (Exception e) {
            vgh.d(this, "H5InteractLayerDataRequester", "数据请求失败，处理返回结果异常", e);
            t0j.c("H5RequestData", "HandleErrorException", "处理失败数据异常", null, e);
            e(j);
        }
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
                vgh.c(this, "H5InteractLayerDataRequester", "数据请求成功，response不为空，result=".concat(str));
                t0j.d("H5RequestData", null);
                Object obj = JSON.parseObject(str).get("data");
                if (obj != null) {
                    f(j, (JSONObject) obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            vgh.c(this, "H5InteractLayerDataRequester", "数据请求成功，response为空");
            t0j.b("H5RequestData", "ResponseNull", "response为空", null);
            e(j);
        } catch (Exception e) {
            vgh.d(this, "H5InteractLayerDataRequester", "数据请求成功，处理返回结果异常", e);
            t0j.c("H5RequestData", "HandleSuccessException", "处理成功数据异常", null, e);
            e(j);
        }
    }

    public final void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f466310", new Object[]{this, new Long(j)});
        } else {
            this.f15916a.h(SystemClock.elapsedRealtime() - j);
        }
    }

    public final void f(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63acf24", new Object[]{this, new Long(j), jSONObject});
        } else {
            this.f15916a.b(jSONObject, SystemClock.elapsedRealtime() - j);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e6e0", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        H5InteractLayerRequestParams h5InteractLayerRequestParams = new H5InteractLayerRequestParams();
        JSONObject k = j0r.k();
        vgh.c(this, "H5InteractLayerDataRequester", "请求数据，requestBody=" + k);
        ckf.f(k, "requestBody");
        h5InteractLayerRequestParams.setData(k);
        MtopUtils.INSTANCE.e(h5InteractLayerRequestParams, new c(elapsedRealtime));
    }
}
