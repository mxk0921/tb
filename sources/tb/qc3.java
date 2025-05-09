package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qc3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199395);
    }

    public static /* synthetic */ Object ipc$super(qc3 qc3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartPopItemExpandSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        IDMComponent iDMComponent = this.e;
        if (iDMComponent != null) {
            if (iDMComponent.getTag() == null || !this.e.getTag().startsWith("icartCalculate4Column")) {
                p();
            } else {
                q();
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c13f", new Object[]{this});
            return;
        }
        this.e.getFields().put("isExpanded", (Object) Boolean.valueOf(true ^ this.e.getFields().getBooleanValue("isExpanded")));
        this.j.e().G();
    }

    public final void q() {
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c393e68f", new Object[]{this});
            return;
        }
        List<IDMComponent> components = this.j.e().h0().getComponents();
        if (components != null) {
            for (int i = 0; i < components.size(); i++) {
                iDMComponent = components.get(i);
                if (TextUtils.equals(iDMComponent.getTag(), "checkedItemList")) {
                    break;
                }
            }
        }
        iDMComponent = null;
        if (iDMComponent != null) {
            iDMComponent.getFields().put("isExpanded", (Object) Boolean.valueOf(!iDMComponent.getFields().getBooleanValue("isExpanded")));
            this.j.e().w0();
        }
    }
}
