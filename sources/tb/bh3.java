package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bh3 extends Component<View, jfw> implements piw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316703);
        t2o.a(503317209);
    }

    public static /* synthetic */ Object ipc$super(bh3 bh3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/CellsComponent");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(n nVar, int i, n nVar2) {
        n nVar3;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i), nVar2});
            return;
        }
        n Y = this.node.Y();
        if (Y != null) {
            nVar3 = Y.Y();
        } else {
            nVar3 = null;
        }
        if (nVar3 != null && nVar3.w0() != null) {
            ((ListViewComponent) nVar3.K()).setPatchTriggerName(this.node.Z());
            ListViewComponent listViewComponent = (ListViewComponent) nVar3.K();
            if (((ArrayList) this.node.d).size() >= i + 1) {
                z = true;
            } else {
                z = false;
            }
            listViewComponent.updateListChangedEvent(1, i, -1, z, nVar2);
            if (akt.R()) {
                handleChildChanged(nVar3.L(), nVar3);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(n nVar, int i, n nVar2) {
        n nVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2e1a55", new Object[]{this, nVar, new Integer(i), nVar2});
            return;
        }
        n Y = this.node.Y();
        if (Y != null) {
            nVar3 = Y.Y();
        } else {
            nVar3 = null;
        }
        if (nVar3 != null && nVar3.w0() != null) {
            ((ListViewComponent) nVar3.K()).setPatchTriggerName(this.node.Z());
            ((ListViewComponent) nVar3.K()).updateListChangedEvent(2, i, -1, false, nVar2);
            if (akt.R()) {
                handleChildChanged(nVar3.L(), nVar3);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(n nVar, int i, int i2, n nVar2) {
        n nVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d053a6", new Object[]{this, nVar, new Integer(i), new Integer(i2), nVar2});
            return;
        }
        n Y = this.node.Y();
        if (Y != null) {
            nVar3 = Y.Y();
        } else {
            nVar3 = null;
        }
        if (nVar3 != null && nVar3.w0() != null) {
            ((ListViewComponent) nVar3.K()).setPatchTriggerName(this.node.Z());
            ((ListViewComponent) nVar3.K()).updateListChangedEvent(8, i, i2, false, nVar2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return null;
    }
}
