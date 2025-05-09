package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p90 extends uct {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "action";

    static {
        t2o.a(404750400);
    }

    public p90(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    public static /* synthetic */ Object ipc$super(p90 p90Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/task/ActionTask");
    }

    @Override // tb.uct
    public void g() {
        w80 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null && (a2 = j90.a(jSONObject.getString("taskActionName"))) != null) {
            a2.a(e(), this.c);
        }
    }
}
