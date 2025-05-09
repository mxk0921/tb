package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.java_websocket.WebSocket;
import tb.oho;
import tb.rho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class wx<REQUEST extends oho, RESPONSE extends rho> implements hho<REQUEST, RESPONSE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final si4<REQUEST, RESPONSE> f30978a;
    public final Map<String, s70<RESPONSE>> b = new HashMap();

    static {
        t2o.a(993001603);
        t2o.a(993001606);
    }

    public wx(si4<REQUEST, RESPONSE> si4Var) {
        this.f30978a = si4Var;
    }

    public abstract String a(REQUEST request);

    public void b(RESPONSE response) {
        s70 s70Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3beb4c", new Object[]{this, response});
            return;
        }
        String id = response.getId();
        if (!TextUtils.isEmpty(id) && (s70Var = (s70) ((HashMap) this.b).remove(id)) != null) {
            s70Var.a(response);
        }
    }

    public Future<RESPONSE> c(REQUEST request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("689991bf", new Object[]{this, request});
        }
        WebSocket h = ((ti4) this.f30978a).h();
        if (h == null) {
            return null;
        }
        return d(request, h);
    }

    public Future<RESPONSE> d(REQUEST request, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("223e2fa1", new Object[]{this, request, webSocket});
        }
        if (webSocket == null || !webSocket.isOpen()) {
            return null;
        }
        ((ti4) this.f30978a).u(webSocket, a(request));
        s70 s70Var = new s70();
        ((HashMap) this.b).put(request.getId(), s70Var);
        FutureTask futureTask = new FutureTask(s70Var);
        futureTask.run();
        return futureTask;
    }
}
