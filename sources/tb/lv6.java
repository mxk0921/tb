package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lv6 implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AwesomeGetRequestParams f23589a;

    static {
        t2o.a(729808974);
        t2o.a(729808960);
    }

    public lv6(AwesomeGetRequestParams awesomeGetRequestParams) {
        this.f23589a = awesomeGetRequestParams;
    }

    @Override // tb.fjb
    public String build() {
        AwesomeGetContainerParams awesomeGetContainerParams;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = this.f23589a;
        if (awesomeGetRequestParams == null || (awesomeGetContainerParams = awesomeGetRequestParams.containerParams.get(yyj.e().k())) == null || (jSONObject = awesomeGetContainerParams.bizParams) == null || !jSONObject.containsKey(kv6.FILTER_KEY)) {
            return null;
        }
        return jSONObject.getString(kv6.FILTER_KEY);
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return kv6.FILTER_KEY;
    }
}
