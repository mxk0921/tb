package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import java.net.BindException;
import java.util.Map;
import java.util.concurrent.Future;
import org.java_websocket.WebSocket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ti4 implements si4<JsonRpcRequest, JsonRpcResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final t70 d;
    public Thread f;
    public HandlerThread g;
    public Handler h;
    public m80 i;
    public volatile boolean j;

    /* renamed from: a  reason: collision with root package name */
    public int f28727a = 63232;
    public WebSocket b = null;
    public WebSocket c = null;
    public final mwf e = new mwf(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ti4 ti4Var = ti4.this;
            t70 c = ti4.c(ti4.this);
            ti4 ti4Var2 = ti4.this;
            ti4.b(ti4Var, new m80(c, ti4Var2, ti4.d(ti4Var2), ti4.e(ti4.this)));
            ti4.a(ti4.this).run();
            try {
                ti4.a(ti4.this).J();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            ti4.f(ti4.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JsonRpcRequest c;

        public b(JsonRpcRequest jsonRpcRequest) {
            this.c = jsonRpcRequest;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/core/ConnectionManagerImpl$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                ti4.a(ti4.this).e(JSON.toJSONString(this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebSocket f28729a;
        public final /* synthetic */ String b;

        public c(WebSocket webSocket, String str) {
            this.f28729a = webSocket;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f28729a.isClosing() && !this.f28729a.isClosed()) {
                while (!this.f28729a.isOpen()) {
                    int i2 = i + 1;
                    if (i < 5) {
                        try {
                            Thread.sleep(20L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        i = i2;
                    }
                }
                try {
                    this.f28729a.send(this.b);
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        t2o.a(993001580);
        t2o.a(993001579);
    }

    public ti4(t70 t70Var) {
        this.d = t70Var;
    }

    public static /* synthetic */ m80 a(ti4 ti4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m80) ipChange.ipc$dispatch("c63666d2", new Object[]{ti4Var});
        }
        return ti4Var.i;
    }

    public static /* synthetic */ m80 b(ti4 ti4Var, m80 m80Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m80) ipChange.ipc$dispatch("81f0ee03", new Object[]{ti4Var, m80Var});
        }
        ti4Var.i = m80Var;
        return m80Var;
    }

    public static /* synthetic */ t70 c(ti4 ti4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t70) ipChange.ipc$dispatch("6ead0015", new Object[]{ti4Var});
        }
        return ti4Var.d;
    }

    public static /* synthetic */ mwf d(ti4 ti4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwf) ipChange.ipc$dispatch("e9d1ae58", new Object[]{ti4Var});
        }
        return ti4Var.e;
    }

    public static /* synthetic */ int e(ti4 ti4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc98a4c1", new Object[]{ti4Var})).intValue();
        }
        return ti4Var.f28727a;
    }

    public static /* synthetic */ boolean f(ti4 ti4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9842a08d", new Object[]{ti4Var, new Boolean(z)})).booleanValue();
        }
        ti4Var.j = z;
        return z;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        return this.f28727a;
    }

    public WebSocket h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket) ipChange.ipc$dispatch("7deccdac", new Object[]{this});
        }
        WebSocket webSocket = this.b;
        if (webSocket != null) {
            if (webSocket.isOpen()) {
                return this.b;
            }
            this.b = null;
        }
        WebSocket webSocket2 = this.c;
        if (webSocket2 != null) {
            if (webSocket2.isOpen()) {
                return this.c;
            }
            this.c = null;
        }
        return null;
    }

    public final void i(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137c5189", new Object[]{this, webSocket});
            return;
        }
        WebSocket webSocket2 = this.c;
        if (webSocket2 != null) {
            u(webSocket2, JsonRpcRequest.obtainMessage("connection.close").toString());
        }
        this.c = webSocket;
    }

    public final void j(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0560e22", new Object[]{this, webSocket});
            return;
        }
        WebSocket webSocket2 = this.b;
        if (webSocket2 != null) {
            u(webSocket2, JsonRpcRequest.obtainMessage("connection.close").toString());
        }
        this.b = webSocket;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9226bbf6", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final boolean l(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4553cd7", new Object[]{this, webSocket})).booleanValue();
        }
        return TextUtils.equals(webSocket.getLocalSocketAddress().getHostName(), webSocket.getRemoteSocketAddress().getHostName());
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final void n(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf631ac", new Object[]{this, webSocket});
            return;
        }
        u(webSocket, p80.j().toString());
        Map<String, String> l = oen.l();
        if (l != null) {
            JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.ABTest");
            obtainMessage.setParams((JSON) JSON.toJSON(l));
            t70.c().k(obtainMessage);
        }
    }

    public void q(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74afb4", new Object[]{this, webSocket, exc});
        } else if (exc instanceof BindException) {
            this.f28727a++;
            x();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66980407", new Object[]{this});
            return;
        }
        if (this.g == null) {
            HandlerThread handlerThread = new HandlerThread("ace-sender");
            this.g = handlerThread;
            handlerThread.start();
            this.h = new Handler(this.g.getLooper());
        }
        this.j = true;
    }

    /* renamed from: s */
    public void t(JsonRpcRequest jsonRpcRequest) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfaae2f", new Object[]{this, jsonRpcRequest});
        } else if (this.j && (handler = this.h) != null) {
            handler.post(new b(jsonRpcRequest));
        }
    }

    public void u(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b79d052", new Object[]{this, webSocket, str});
        } else {
            this.h.post(new c(webSocket, str));
        }
    }

    /* renamed from: v */
    public Future<JsonRpcResponse> w(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d7142c37", new Object[]{this, jsonRpcRequest});
        }
        return this.e.c(jsonRpcRequest);
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c684c", new Object[]{this});
        } else if (!this.j) {
            Thread thread = this.f;
            if (thread != null) {
                thread.interrupt();
            }
            Thread thread2 = new Thread(new a(), "ace-server");
            this.f = thread2;
            thread2.start();
        }
    }

    public void o(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac4c834", new Object[]{this, webSocket});
            return;
        }
        c4p.D("ConnectionManager", "onConnect", new Object[0]);
        if (l(webSocket)) {
            i(webSocket);
        } else {
            j(webSocket);
        }
        n(webSocket);
    }

    public void p(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e68989", new Object[]{this, webSocket, new Integer(i), str});
            return;
        }
        c4p.D("ConnectionManager", "onDisconnect: " + str, new Object[0]);
        if (webSocket == this.c) {
            this.c = null;
        } else if (webSocket == this.b) {
            this.b = null;
        }
    }
}
