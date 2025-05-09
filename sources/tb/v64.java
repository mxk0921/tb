package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v64 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286518);
    }

    public static /* synthetic */ Object ipc$super(v64 v64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonRouterEventSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        fsb b;
        IDMComponent componentByName;
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields != null) {
            String string = fields.getString("type");
            String string2 = fields.getString("target");
            if (!(TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (b = b8vVar.n().b()) == null || (componentByName = b.getComponentByName(string2)) == null || componentByName.getEventMap() == null || (list = componentByName.getEventMap().get(string)) == null)) {
                f8v eventHandler = b8vVar.n().getEventHandler();
                for (gsb gsbVar : list) {
                    b8v e = eventHandler.e();
                    e.t(gsbVar.getType());
                    e.p(componentByName);
                    e.r(gsbVar);
                    e.u("isFromRouterEvent", Boolean.TRUE);
                    eventHandler.k(e);
                }
            }
        }
    }
}
