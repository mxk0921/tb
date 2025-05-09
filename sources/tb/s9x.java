package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s9x implements AsyncProcessor.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r9x f27894a;

    public s9x(r9x r9xVar) {
        this.f27894a = r9xVar;
    }

    @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe679aeb", new Object[]{this, jSONObject, jSONObject2});
        } else if (yc4.q(this.f27894a.mComponentData)) {
            this.f27894a.fireExposeEvent(new RuntimeAbilityParam[0]);
            r9x.v(this.f27894a);
            r9x r9xVar = this.f27894a;
            r9x.w(r9xVar, r9xVar.mComponentData, jSONObject);
            this.f27894a.getParentComponent().updateComponent();
        } else {
            onFail("not set component fields asyncStatus=success");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
    public void onFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
        } else {
            r9x.x(this.f27894a, false);
        }
    }
}
