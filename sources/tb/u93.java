package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.util.List;
import tb.cb4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements cb4.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(u93 u93Var) {
        }

        public boolean a(IDMComponent iDMComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c40a4929", new Object[]{this, iDMComponent})).booleanValue();
            }
            return iDMComponent.getFields().getBooleanValue("_addItemIsChecked");
        }
    }

    static {
        t2o.a(479199364);
    }

    public static /* synthetic */ Object ipc$super(u93 u93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAddItemConfirmSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        IDMComponent i = cb4.i(this.d, c().getString("bundleId"));
        if (i == null) {
            UnifyLog.e("CartAddItemConfirmSubscriber", "bundleHeader component is null");
            return;
        }
        List<IDMComponent> c = this.j.e().l0().c();
        if (!(c == null || c.isEmpty())) {
            String t = cb4.t(c, new a(this));
            if (TextUtils.isEmpty(t)) {
                be3.c(this.b, Localization.q(R.string.taobao_app_1028_1_21678));
                return;
            }
            String p = cb4.p(i);
            for (gsb gsbVar : i.getEventMap().get("confirmAddItemToGroup")) {
                if ("reorderClick".equals(gsbVar.getType())) {
                    JSONObject fields = gsbVar.getFields();
                    fields.clear();
                    fields.put("from", (Object) t);
                    fields.put("toBundleId", (Object) p);
                    fields.put("type", (Object) "addItemToGroup");
                    lcu d = this.j.g().d();
                    d.q("confirmAddItemToGroup");
                    d.l(gsbVar.getType());
                    d.k(gsbVar);
                    d.i(i);
                    this.j.g().h(d);
                }
            }
            this.j.e().k(false);
        }
    }
}
