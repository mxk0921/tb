package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class db3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199380);
    }

    public static /* synthetic */ Object ipc$super(db3 db3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartExpandSelectedItemsSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        DataBizContext.CartGroupContext h = this.k.B().h();
        if (h != null) {
            h.setIsExpanded(!h.getIsExpanded());
            h.setHandleExpanded(true);
            kmb kmbVar = this.j;
            juv.b(kmbVar, "Page_ShoppingCart_SelectedItem_Expand", "isExpanded=" + h.getIsExpanded());
            this.j.e().B0();
        }
    }
}
