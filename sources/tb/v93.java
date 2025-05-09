package tb;

import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199366);
    }

    public static /* synthetic */ Object ipc$super(v93 v93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAddItemSelectSubscriber");
    }

    public final void p(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e846977", new Object[]{this, iDMComponent, new Boolean(z)});
            return;
        }
        for (IDMComponent iDMComponent2 : cb4.D(iDMComponent, this.j)) {
            r(iDMComponent2, z);
        }
    }

    public final void r(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47b1a01", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (iDMComponent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("_addItemIsChecked", String.valueOf(z));
            k(iDMComponent, hashMap);
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        if (!"true".equals((String) lcuVar.e("isChecked")) && q(this.e)) {
            z = false;
        }
        r(this.e, z);
        p(this.e, z);
        ViewManager Z = this.j.e();
        if (Z != null) {
            Z.B0();
        }
    }

    public final boolean q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0cf0cb4", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("_addItemIsChecked") && "true".equals(fields.getString("_addItemIsChecked"));
    }
}
