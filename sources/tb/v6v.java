package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopBusiness f29819a;

    static {
        t2o.a(153092139);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.f29819a;
        if (mtopBusiness != null) {
            mtopBusiness.cancelRequest();
        }
    }

    public void b(w55 w55Var, IRemoteBaseListener iRemoteBaseListener) {
        MtopNetworkProp mtopNetworkProp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76509c09", new Object[]{this, w55Var, iRemoteBaseListener});
            return;
        }
        String t = w55Var.t();
        if (TextUtils.isEmpty(t)) {
            iRemoteBaseListener.onError(-1, new MtopResponse("-1", "api is empty"), null);
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(t);
        mtopRequest.setVersion(w55Var.K());
        mtopRequest.setNeedSession(mtopRequest.isNeedSession());
        mtopRequest.setNeedEcode(mtopRequest.isNeedEcode());
        HashMap hashMap = new HashMap();
        if (w55Var.R()) {
            hashMap.put("feature", "{\"gzip\":\"true\"}");
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(hashMap);
            mtopRequest.setData(jSONObject.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        this.f29819a = build;
        if (w55Var.h0()) {
            build.useWua();
        }
        if (w55Var.b0()) {
            build.reqMethod(MethodEnum.POST);
        }
        String B = w55Var.B();
        if (B != null) {
            build.setCustomDomain(B);
        }
        int v = w55Var.v();
        if (-1 != v) {
            build.setBizId(v);
        }
        String J = w55Var.J();
        if (J != null) {
            build.setUnitStrategy(J);
        }
        Map<String, String> D = w55Var.D();
        if (!(D == null || (mtopNetworkProp = build.mtopProp) == null)) {
            mtopNetworkProp.setRequestHeaders(D);
        }
        build.setErrorNotifyAfterCache(true);
        String H = w55Var.H();
        if (H != null) {
            build.setTraceId(H);
        }
        build.registerListener((IRemoteListener) iRemoteBaseListener);
        Class<?> G = w55Var.G();
        if (G == null) {
            build.startRequest();
        } else {
            build.startRequest(G);
        }
    }
}
