package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tb3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199388);
    }

    public static /* synthetic */ Object ipc$super(tb3 tb3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartItemMorePopupSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        List<IDMComponent> B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject c = c();
        if (!(c == null || c.isEmpty() || (B = cb4.B(this.k, g())) == null)) {
            for (IDMComponent iDMComponent : B) {
                JSONObject fields = iDMComponent.getFields();
                if (fields != null) {
                    fields.put("componentKey", (Object) this.e.getKey());
                    JSONObject jSONObject = this.e.getFields().getJSONObject("operate");
                    if (jSONObject != null && jSONObject.size() > 0) {
                        fields.put("operate", (Object) jSONObject);
                    }
                }
            }
            lcu d = this.j.g().d();
            d.q(lcuVar.g());
            d.l("openPopupWindow");
            d.k(this.f23048a.c());
            d.i(this.e);
            this.j.g().h(d);
        }
    }
}
