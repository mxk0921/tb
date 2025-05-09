package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u64 extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189335);
    }

    public static /* synthetic */ Object ipc$super(u64 u64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/common/CommonRouterEventSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        fsb b;
        IDMComponent componentByName;
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject fields = g().getFields();
        if (fields != null) {
            String string = fields.getString(hxj.EVENT_KEY);
            String string2 = fields.getString("target");
            if (!(TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (b = this.c.b()) == null || (componentByName = b.getComponentByName(string2)) == null || componentByName.getEventMap() == null || (list = componentByName.getEventMap().get(string)) == null)) {
                for (gsb gsbVar : list) {
                    mcu g = this.c.g();
                    lcu d = g.d();
                    d.l(gsbVar.getType());
                    d.i(componentByName);
                    d.k(gsbVar);
                    d.m("isFromRouterEvent", Boolean.TRUE);
                    g.h(d);
                }
            }
        }
    }
}
