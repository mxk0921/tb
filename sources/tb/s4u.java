package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s4u implements dzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f27797a;

    static {
        t2o.a(729809609);
        t2o.a(488636444);
    }

    public s4u(cfc cfcVar) {
        this.f27797a = cfcVar;
    }

    @Override // tb.dzc
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        ITopViewService iTopViewService = (ITopViewService) this.f27797a.a(ITopViewService.class);
        if (iTopViewService != null) {
            return iTopViewService.getSubTabSearchBarData();
        }
        return null;
    }
}
