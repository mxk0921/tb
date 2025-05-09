package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vn6 extends wij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tn6 f30121a;

    static {
        t2o.a(444596430);
    }

    public vn6(tn6 tn6Var) {
        this.f30121a = tn6Var;
    }

    public static /* synthetic */ Object ipc$super(vn6 vn6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/DXWrapperNanoEventEmitter");
    }

    public void a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8334041c", new Object[]{this, dXEvent});
            return;
        }
        DXWidgetNode i = this.f30121a.i();
        if (i != null) {
            i.postEvent(dXEvent);
        }
    }
}
