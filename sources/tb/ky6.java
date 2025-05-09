package tb;

import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.proxy.ClientServiceProxy;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ky6 extends js1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IClientService f22999a;

    static {
        t2o.a(393216044);
    }

    public ky6(IBinder iBinder) {
        this.f22999a = ClientServiceProxy.getProxy(iBinder);
    }

    public static /* synthetic */ Object ipc$super(ky6 ky6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/ipc/channel/DefaultClientChannel");
    }

    @Override // tb.vmb
    public void a(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c8618e", new Object[]{this, list});
            return;
        }
        try {
            this.f22999a.recycle(list);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            } else if (e instanceof RemoteException) {
                throw new IPCException(27, e);
            } else {
                throw new IPCException(9, e);
            }
        }
    }

    @Override // tb.js1
    public Reply b(Callback callback) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("1c9ad4a0", new Object[]{this, callback});
        }
        try {
            return this.f22999a.sendCallback(callback);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            } else if (e instanceof RemoteException) {
                throw new IPCException(2, e);
            } else {
                throw new IPCException(9, e);
            }
        }
    }
}
