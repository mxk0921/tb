package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.BaseConnection;
import com.taobao.accs.utl.ALog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class us1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29583a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ BaseConnection c;

    public us1(BaseConnection baseConnection, String str, boolean z) {
        this.c = baseConnection;
        this.f29583a = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Message g = this.c.e.g(this.f29583a);
        if (g != null) {
            this.c.e.t(g, -9);
            this.c.B(this.f29583a, this.b, "receive data time out");
            String o = this.c.o();
            ALog.e(o, this.f29583a + "-> receive data time out!", new Object[0]);
        }
    }
}
