package tb;

import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ob3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199387);
    }

    public static /* synthetic */ Object ipc$super(ob3 ob3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartHideItemSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        long j;
        ViewManager Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        IDMComponent iDMComponent = this.e;
        ckf.f(iDMComponent, "mComponent");
        JSONObject data = iDMComponent.getData();
        ckf.f(data, "mComponent.data");
        data.put((JSONObject) "status", "hidden");
        kmb kmbVar = this.j;
        if (!(kmbVar == null || (Z = kmbVar.e()) == null)) {
            Z.D();
        }
        gsb g = g();
        ckf.f(g, "idmEvent");
        String string = g.getFields().getString("hideSeconds");
        try {
            ckf.f(string, "hideSecond");
            j = Long.parseLong(string);
        } catch (Exception unused) {
            j = 0;
        }
        IDMComponent iDMComponent2 = this.e;
        ckf.f(iDMComponent2, "mComponent");
        String key = iDMComponent2.getKey();
        ckf.f(key, "mComponent.key");
        nb3.h(key, j);
    }
}
