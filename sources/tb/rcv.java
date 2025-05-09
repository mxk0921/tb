package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286743);
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe32d663", new Object[]{iDMComponent})).booleanValue();
        }
        if ((iDMComponent instanceof DMComponent) && ((DMComponent) iDMComponent).getDeltaOpType() != null) {
            return true;
        }
        return false;
    }
}
