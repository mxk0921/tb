package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s7p extends Component<View, jfw> implements piw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316832);
        t2o.a(503317209);
    }

    public static /* synthetic */ Object ipc$super(s7p s7pVar, String str, Object... objArr) {
        if (str.hashCode() == -613926416) {
            super.onLayout();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/SectionComponent");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(n nVar, int i, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i), nVar2});
            return;
        }
        n Y = this.node.Y();
        if (Y != null && Y.w0() != null && nVar2.r0().equals("header")) {
            ((ListViewComponent) Y.K()).setPatchTriggerName(this.node.Z());
            ((ListViewComponent) Y.K()).updateListChangedEvent(17, i, -1, false, nVar2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(n nVar, int i, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2e1a55", new Object[]{this, nVar, new Integer(i), nVar2});
            return;
        }
        n Y = this.node.Y();
        if (Y != null && Y.w0() != null && nVar2.r0().equals("header")) {
            ((ListViewComponent) Y.K()).setPatchTriggerName(this.node.Z());
            ((ListViewComponent) Y.K()).updateListChangedEvent(18, i, -1, false, nVar2);
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

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        Iterator it = ((ArrayList) this.node.d).iterator();
        while (it.hasNext()) {
            ((n) it.next()).V0(Float.NaN, Float.NaN);
        }
    }
}
