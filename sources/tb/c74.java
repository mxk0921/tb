package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c74 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699174);
    }

    public c74(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(c74 c74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/config/CommonServerConfigBusiness");
    }

    public void K(INetDataObject iNetDataObject, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd7fc25", new Object[]{this, iNetDataObject, cls});
        } else if (iNetDataObject != null) {
            C(1, iNetDataObject, cls);
        }
    }
}
