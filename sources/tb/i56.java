package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic_v35.view.DXNanoScrollerIndicator;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i56 extends un6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596455);
    }

    public i56(tn6 tn6Var) {
        super(tn6Var);
    }

    public static /* synthetic */ Object ipc$super(i56 i56Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/widget/DXNanoScrollerIndicatorCoordinator");
    }

    @Override // tb.un6
    public boolean c(DXEvent dXEvent) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() != 5288751146867425108L) {
            return false;
        }
        DXNanoScrollerIndicator dXNanoScrollerIndicator = (DXNanoScrollerIndicator) this.f29509a.d();
        DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
        int i = dXScrollEvent.getContentSize().f29533a - dXScrollEvent.getScrollerSize().f29533a;
        int offsetX = dXScrollEvent.getOffsetX();
        if (i > 0) {
            d = offsetX / i;
        } else {
            d = vu3.b.GEO_NOT_SUPPORT;
        }
        dXNanoScrollerIndicator.refreshScrollIndicator(d);
        return true;
    }
}
