package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199367);
    }

    public static /* synthetic */ Object ipc$super(y93 y93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAddressEyeClickSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (this.e != null && (objArr = (Object[]) lcuVar.e("extraParams")) != null && objArr.length >= 2) {
            JSONObject fields = this.e.getFields();
            boolean z = !Boolean.parseBoolean(String.valueOf(objArr[1]));
            fields.put("isHideAddress", (Object) Boolean.valueOf(z));
            this.k.B().n().setHideAddress(z);
            this.j.e().E(1);
        }
    }
}
