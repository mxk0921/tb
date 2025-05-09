package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import java.net.InetSocketAddress;
import java.util.Collections;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m80 extends c1x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String q = "AceServer";
    private final si4<JsonRpcRequest, JsonRpcResponse> o;
    private final soi p;

    static {
        t2o.a(993001578);
    }

    public m80(t70 t70Var, si4<JsonRpcRequest, JsonRpcResponse> si4Var, mwf mwfVar, int i) {
        super(new InetSocketAddress("0.0.0.0", i), Collections.singletonList(new a()));
        setReuseAddr(true);
        this.p = new nwf(t70Var.d(), mwfVar, si4Var, t70Var.e());
        this.o = si4Var;
    }

    public static /* synthetic */ Object ipc$super(m80 m80Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/core/AceServer");
    }

    @Override // tb.c1x
    public void A(WebSocket webSocket, mu3 mu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6555ef07", new Object[]{this, webSocket, mu3Var});
        } else {
            ((ti4) this.o).o(webSocket);
        }
    }

    @Override // tb.c1x
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        c4p.m(q, "onStart: ");
        ((ti4) this.o).r();
    }

    @Override // tb.c1x
    public void s(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb40b69", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            ((ti4) this.o).p(webSocket, i, str);
        }
    }

    @Override // tb.c1x
    public void w(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74afb4", new Object[]{this, webSocket, exc});
            return;
        }
        c4p.n(q, "onError:" + exc);
        ((ti4) this.o).q(webSocket, exc);
    }

    @Override // tb.c1x
    public void y(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfaef9b", new Object[]{this, webSocket, str});
        } else {
            ((xx) this.p).a(webSocket, str);
        }
    }
}
