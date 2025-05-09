package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.connection.IConnection;
import com.taobao.accs.utl.ALog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class wi4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile IConnection f30712a;
    public volatile boolean b;

    static {
        t2o.a(343933053);
    }

    public abstract IConnection a(String str, AccsClientConfig accsClientConfig);

    public abstract List<IConnection> b();

    public abstract boolean c();

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4899a3b", new Object[]{this, new Boolean(z)});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db20c54", new Object[]{this});
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
            return;
        }
        ALog.e("ConnectionService", DMComponent.RESET, new Object[0]);
        this.f30712a = null;
    }
}
