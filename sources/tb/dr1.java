package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.WebSocket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dr1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ oho f18024a;
    public final /* synthetic */ tho b;
    public final /* synthetic */ WebSocket c;
    public final /* synthetic */ er1 d;

    public dr1(er1 er1Var, oho ohoVar, tho thoVar, WebSocket webSocket) {
        this.f18024a = ohoVar;
        this.b = thoVar;
        this.c = webSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            ((nwf) this.b).k(this.f18024a, th, this.c);
        }
    }
}
