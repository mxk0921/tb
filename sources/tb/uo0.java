package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uo0 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = String.valueOf(true);
    public static final String m = String.valueOf(false);

    static {
        t2o.a(479199362);
    }

    public static /* synthetic */ Object ipc$super(uo0 uo0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/AliCartCheckAllSubscriber");
    }

    public final void q(IDMComponent iDMComponent, Map<String, String> map) {
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cceb42d", new Object[]{this, iDMComponent, map});
        } else if (iDMComponent != null && iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("checkClick")) != null && !list.isEmpty()) {
            for (gsb gsbVar : list) {
                lcu d = this.j.g().d();
                d.l(gsbVar.getType());
                d.i(iDMComponent);
                d.q("checkClick");
                d.k(gsbVar);
                d.n(map);
                this.j.g().h(d);
            }
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        IDMComponent a2 = lcuVar.a();
        if (a2 != null && this.j != null && (fields = a2.getFields()) != null) {
            String str = m;
            if (!fields.getBooleanValue("isChecked")) {
                str = l;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("是否选中", str);
            ub3.n("CheckAll", "总耗时", hashMap);
            p(l.equals(str));
            fields.put("isChecked", (Object) str);
            a2.writeBackFields(fields, false);
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6de60c", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isChecked", String.valueOf(z));
        hashMap.put(cb4.KEY_IS_CHECKED_ALL_FROM_NAVIVE, String.valueOf(true));
        q(this.k.u("submit"), hashMap);
    }
}
