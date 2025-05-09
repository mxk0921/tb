package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tcf extends kcf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321860);
    }

    public tcf(cxj cxjVar, dh7 dh7Var, DetailDataManager detailDataManager) {
        super(cxjVar, dh7Var, detailDataManager);
    }

    public static /* synthetic */ Object ipc$super(tcf tcfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/instancelistener/handler/InstanceTppHandler");
    }

    @Override // tb.kcf, tb.oxj.g
    public void b(VerticalAbsViewHolder verticalAbsViewHolder, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7124048", new Object[]{this, verticalAbsViewHolder, jSONObject, str});
        }
    }

    @Override // tb.kcf, tb.oxj.g
    public void c(VerticalAbsViewHolder verticalAbsViewHolder, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724459fe", new Object[]{this, verticalAbsViewHolder, jSONObject});
        } else if (verticalAbsViewHolder != null && verticalAbsViewHolder.u0() == 0) {
            if (verticalAbsViewHolder.t0() == null || verticalAbsViewHolder.t0().z) {
                this.b.t(this.c.j().u(), false);
            }
        }
    }
}
