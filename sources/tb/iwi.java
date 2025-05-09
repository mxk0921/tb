package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iwi extends dv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151183);
    }

    public iwi(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(iwi iwiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/request/MixDragStructureRequest");
    }

    @Override // tb.s0c
    public void a(IDMComponent iDMComponent, IDMComponent iDMComponent2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9befe9a", new Object[]{this, iDMComponent, iDMComponent2, new Integer(i)});
        } else if (kw7.q(iDMComponent)) {
            e(iDMComponent, iDMComponent2);
        } else if (kw7.v(iDMComponent, iDMComponent2)) {
            if (i == 1) {
                f(iDMComponent, iDMComponent2);
            } else if (i == 2) {
                d(iDMComponent, iDMComponent2);
            } else if (kw7.y(iDMComponent2)) {
                d(iDMComponent, iDMComponent2);
            } else {
                f(iDMComponent, iDMComponent2);
            }
        } else if (i == 1) {
            c(iDMComponent, iDMComponent2);
        } else if (i == 2) {
            d(iDMComponent, iDMComponent2);
        } else if (kw7.y(iDMComponent2)) {
            d(iDMComponent, iDMComponent2);
        } else if (i == 4) {
            d(iDMComponent, iDMComponent2);
        } else {
            c(iDMComponent, iDMComponent2);
        }
    }
}
