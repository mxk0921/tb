package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f27669a;

    static {
        t2o.a(491782791);
    }

    public ry(cfc cfcVar) {
        this.f27669a = cfcVar;
    }

    public abstract JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject);

    public cfc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("b1bd3794", new Object[]{this});
        }
        return this.f27669a;
    }
}
