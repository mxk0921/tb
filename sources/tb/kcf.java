package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import tb.oxj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kcf implements oxj.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dh7 f22563a;
    public DetailDataManager b;
    public cxj c;

    static {
        t2o.a(352321859);
        t2o.a(352321601);
    }

    public kcf(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager) {
        this.c = cxjVar;
        this.f22563a = dh7Var;
        this.b = detailDataManager;
    }

    @Override // tb.oxj.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce47951", new Object[]{this});
            return;
        }
        otm L = this.b.L();
        if (L != null) {
            L.c(this.c.i());
        }
    }

    @Override // tb.oxj.g
    public void b(VerticalAbsViewHolder verticalAbsViewHolder, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7124048", new Object[]{this, verticalAbsViewHolder, jSONObject, str});
        }
    }

    @Override // tb.oxj.g
    public void c(VerticalAbsViewHolder verticalAbsViewHolder, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724459fe", new Object[]{this, verticalAbsViewHolder, jSONObject});
        }
    }
}
