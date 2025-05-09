package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ga0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qqu<ActivateTypedBean, ja0> f19819a;

    static {
        t2o.a(815793090);
    }

    public ga0(yko ykoVar) {
        this.f19819a = new qqu<>(ykoVar, new p3x(), new f8j());
    }

    public ActivateTypedBean a(JSONObject jSONObject, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivateTypedBean) ipChange.ipc$dispatch("e8b92e37", new Object[]{this, jSONObject, ja0Var});
        }
        return (ActivateTypedBean) this.f19819a.d(jSONObject, ja0Var);
    }

    public void b(pq1 pq1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3a89b4", new Object[]{this, pq1Var});
        } else {
            this.f19819a.f(pq1Var);
        }
    }
}
