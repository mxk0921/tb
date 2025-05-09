package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.ut.share.business.interf.IHasTaoPassword;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i8t implements IHasTaoPassword {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(793772039);
        t2o.a(663748659);
    }

    @Override // com.ut.share.business.interf.IHasTaoPassword
    public boolean hasTaoPassword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6785886e", new Object[]{this})).booleanValue();
        }
        return ClipUrlWatcherControl.z().y();
    }
}
