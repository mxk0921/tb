package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tn6 extends vij {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DXWidgetNode e = null;

    static {
        t2o.a(444596428);
    }

    public static /* synthetic */ Object ipc$super(tn6 tn6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/DXWrapperNanoContext");
    }

    public DXWidgetNode i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("99cab402", new Object[]{this});
        }
        return this.e;
    }

    public void j(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.e = dXWidgetNode;
        }
    }
}
