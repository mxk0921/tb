package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ma3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199376);
    }

    public static /* synthetic */ Object ipc$super(ma3 ma3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartConfirmGroupClickSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IDMComponent componentByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        DataBizContext.CartGroupContext h = this.k.B().h();
        if (h != null) {
            h.setItemsInOtherGroup(null);
            h.setOriginItems(null);
            this.j.e().k(false);
            List<String> items = h.getItems();
            if (items == null) {
                items = new ArrayList<>();
            }
            int type = h.getType();
            if (!items.isEmpty() || type != 2) {
                IDMComponent componentByName2 = this.d.getComponentByName(h.getTriggerComponentKey());
                String s = cb4.s(cb4.q(cb4.o(componentByName2)));
                StringBuilder sb = new StringBuilder();
                for (String str : items) {
                    if (!(str == null || (componentByName = this.d.getComponentByName(str)) == null)) {
                        sb.append(componentByName.getFields().getString("cartId"));
                        sb.append(",");
                    }
                }
                if (sb.toString().endsWith(",")) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                String sb2 = sb.toString();
                String p = cb4.p(componentByName2);
                for (gsb gsbVar : componentByName2.getEventMap().get("confirmEditGroup")) {
                    if ("reorderClick".equals(gsbVar.getType())) {
                        JSONObject fields = gsbVar.getFields();
                        fields.put("from", (Object) s);
                        fields.put("to", (Object) sb2);
                        fields.put("toBundleId", (Object) p);
                        fields.put("name", (Object) h.getName());
                        lcu d = this.j.g().d();
                        d.q("confirmEditGroup");
                        d.l(gsbVar.getType());
                        d.k(gsbVar);
                        d.i(componentByName2);
                        this.j.g().h(d);
                    }
                }
                return;
            }
            String q = Localization.q(R.string.taobao_app_1028_1_21661);
            be3.c(this.b, q);
            ub3.f(q);
        }
    }
}
