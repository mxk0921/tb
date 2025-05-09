package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tk6 extends s8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<DXRootView> i;
    public WeakReference<DXWidgetNode> j;

    static {
        t2o.a(444596692);
    }

    public static /* synthetic */ Object ipc$super(tk6 tk6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/eventchain/DXUIAbilityRuntimeContext");
    }

    public DXRootView o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("39124f9f", new Object[]{this});
        }
        WeakReference<DXRootView> weakReference = this.i;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.i.get();
    }

    public DXRuntimeContext p() {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("2cbca918", new Object[]{this});
        }
        DXRootView o = o();
        if (o == null || (expandWidgetNode = o.getExpandWidgetNode()) == null) {
            return null;
        }
        return expandWidgetNode.getDXRuntimeContext();
    }

    public DXWidgetNode q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("99cab402", new Object[]{this});
        }
        WeakReference<DXWidgetNode> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.j.get();
    }

    public void r(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d929f0c5", new Object[]{this, dXRootView});
        } else {
            this.i = new WeakReference<>(dXRootView);
        }
    }

    public void s(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.j = new WeakReference<>(dXWidgetNode);
        }
    }
}
