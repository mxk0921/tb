package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.weex.ui.view.gesture.WXGesture;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199363);
    }

    public static /* synthetic */ Object ipc$super(t93 t93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAddGroupPopupWindowSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        List<IDMComponent> B = cb4.B(this.k, g());
        if (B != null) {
            for (IDMComponent iDMComponent : B) {
                JSONObject fields = iDMComponent.getFields();
                if (fields == null) {
                    fields = new JSONObject();
                }
                fields.put("componentKey", (Object) this.e.getKey());
                fields.put("cartId", (Object) cb4.r(this.e));
                fields.put("from", (Object) "cart");
                fields.put("fromBundleId", (Object) cb4.p(this.e));
                fields.put("to", (Object) "");
                fields.put("toBundleId", (Object) "");
                if (cb4.Q(this.e)) {
                    str = WXGesture.MOVE;
                } else {
                    str = "add";
                }
                fields.put("type", (Object) str);
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
