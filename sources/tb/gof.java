package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gof implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20130a = "";
    public final AwesomeGetRequestParams b;

    static {
        t2o.a(729809810);
        t2o.a(729808960);
    }

    public gof(AwesomeGetRequestParams awesomeGetRequestParams) {
        this.b = awesomeGetRequestParams;
    }

    public final String a(AwesomeGetRequestParams awesomeGetRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77d86ce3", new Object[]{this, awesomeGetRequestParams});
        }
        AwesomeGetContainerParams awesomeGetContainerParams = awesomeGetRequestParams.containerParams.get(yyj.e().k());
        if (awesomeGetContainerParams == null) {
            return this.f20130a;
        }
        JSONObject jSONObject = awesomeGetContainerParams.bizParams;
        if (jSONObject != null && jSONObject.containsKey("itemId")) {
            this.f20130a = jSONObject.getString("itemId");
        }
        return this.f20130a;
    }

    @Override // tb.fjb
    public String build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        return a(this.b);
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "lastClickItemId";
    }
}
