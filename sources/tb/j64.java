package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j64 extends kx implements IPopViewEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public j64(bbd bbdVar) {
        super(bbdVar);
    }

    public static /* synthetic */ Object ipc$super(j64 j64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/listener/CommonPopEventListener");
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
    public void onEvent(int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
        } else if (i != 3) {
            if (yhm.e(i)) {
                c(i, null, iPopData);
                a(iPopData);
            }
            if (yhm.f(i)) {
                d(iPopData);
            }
        }
    }
}
