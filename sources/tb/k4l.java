package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k4l extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699629);
    }

    public k4l() {
        super(null);
    }

    public static /* synthetic */ Object ipc$super(k4l k4lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/push/business/OpenPushBusiness");
    }

    public void K(INetDataObject iNetDataObject, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a706871", new Object[]{this, iNetDataObject, cls, str});
        } else {
            L(iNetDataObject, cls, str, false, false);
        }
    }

    public void L(INetDataObject iNetDataObject, Class<?> cls, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500e6ab1", new Object[]{this, iNetDataObject, cls, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        NetRequest netRequest = new NetRequest();
        if (iNetDataObject != null) {
            netRequest = qsj.b(iNetDataObject);
        }
        netRequest.setPost(z2);
        netRequest.setData(str);
        I(1, netRequest, cls, z);
    }

    public void M(INetDataObject iNetDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256e73b7", new Object[]{this, iNetDataObject, cls});
        } else {
            C(1, iNetDataObject, cls);
        }
    }

    public k4l(b0d b0dVar) {
        super(b0dVar);
    }
}
