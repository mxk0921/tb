package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.feeds.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321964);
    }

    public static b a(dh7 dh7Var, cxj cxjVar, VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("55fac63c", new Object[]{dh7Var, cxjVar, verticalAbsViewHolder});
        }
        if ("vertical".equals(cxjVar.j().R().m)) {
            return new y3w(dh7Var, cxjVar, verticalAbsViewHolder);
        }
        return new qra(dh7Var, cxjVar, verticalAbsViewHolder);
    }
}
