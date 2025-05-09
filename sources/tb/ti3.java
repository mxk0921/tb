package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ti3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f28725a = new Object();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static com.taobao.android.riverlogger.inspector.a c;
    public static mxn d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements RVLRemoteConnectCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mxn f28726a;
        public final /* synthetic */ RVLRemoteConnectCallback b;

        public a(mxn mxnVar, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
            this.f28726a = mxnVar;
            this.b = rVLRemoteConnectCallback;
        }

        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
        public void finish(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str});
                return;
            }
            if (z) {
                ti3.a(this.f28726a);
            }
            RVLRemoteConnectCallback rVLRemoteConnectCallback = this.b;
            if (rVLRemoteConnectCallback != null) {
                rVLRemoteConnectCallback.finish(z, str);
            }
        }
    }

    static {
        t2o.a(649068570);
    }

    public static void a(com.taobao.android.riverlogger.inspector.a aVar) {
        boolean B;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f655ee13", new Object[]{aVar});
        } else if (!aVar.e) {
            synchronized (f28725a) {
                try {
                    if (aVar instanceof mxn) {
                        mxn mxnVar = d;
                        if (mxnVar != null) {
                            mxnVar.i("connect new");
                        }
                        d = (mxn) aVar;
                    }
                    com.taobao.android.riverlogger.inspector.a aVar2 = c;
                    if (aVar2 == null) {
                        c = aVar;
                    } else if (aVar2 instanceof xh0) {
                        c = ((xh0) aVar2).E(aVar);
                    } else {
                        c = new xh0(aVar, c);
                    }
                    B = c.B();
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.g();
            zbf.h(true, B);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f158e86f", new Object[]{str});
            return;
        }
        mxn mxnVar = d;
        if (mxnVar != null) {
            mxnVar.i(str);
        }
    }

    public static com.taobao.android.riverlogger.inspector.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.riverlogger.inspector.a) ipChange.ipc$dispatch("9f141b00", new Object[0]);
        }
        return c;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0b6fb8", new Object[0]);
            return;
        }
        com.taobao.android.riverlogger.inspector.a aVar = c;
        if (aVar == null) {
            zbf.i(null);
        } else {
            Set<String> l = aVar.l();
            zbf.i(l);
            z = l.contains("log");
        }
        if (!b.compareAndSet(!z, z)) {
            return;
        }
        if (z) {
            lcn.l(si3.instance);
        } else {
            lcn.o(si3.instance);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c007a85", new Object[]{str});
            return;
        }
        com.taobao.android.riverlogger.inspector.a aVar = c;
        if (aVar == null) {
            zbf.j(str, null);
        } else if (aVar.m(str) == null) {
            zbf.j(str, null);
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<dcf> it = aVar.m(str).iterator();
            while (it.hasNext()) {
                sb.append(it.next().c);
                sb.append('\n');
            }
            zbf.j(str, sb.toString());
        }
    }

    public static void g(com.taobao.android.riverlogger.inspector.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f69c910", new Object[]{aVar});
        } else if (c != null) {
            synchronized (f28725a) {
                try {
                    com.taobao.android.riverlogger.inspector.a aVar2 = c;
                    if (aVar2 instanceof xh0) {
                        c = ((xh0) aVar2).F(aVar);
                    } else if (aVar2 == aVar) {
                        c = null;
                    } else {
                        return;
                    }
                    if (aVar == d) {
                        d = null;
                    }
                    aVar.t();
                    com.taobao.android.riverlogger.inspector.a aVar3 = c;
                    if (aVar3 == null) {
                        zbf.h(false, false);
                    } else {
                        zbf.h(true, aVar3.B());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void h(Context context) {
        mxn J;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (c == null && (J = mxn.J(context.getDir("riverlogger", 0).getAbsolutePath())) != null) {
            a(J);
            lcn.a(RVLLevel.Info, qcn.RVLModuleName).k("openRemote", J.A()).a("server", J.L()).a("persisted", Boolean.TRUE).f();
        }
    }

    public static void e(String str, String str2, boolean z, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea9eab1", new Object[]{str, str2, new Boolean(z), rVLRemoteConnectCallback});
        } else if (str == null) {
            if (rVLRemoteConnectCallback != null) {
                rVLRemoteConnectCallback.finish(false, "Invalid server");
            }
        } else if (str.startsWith("ws://") || str.startsWith("wss://")) {
            mxn mxnVar = new mxn(str);
            if (z) {
                mxnVar.O(rVLRemoteConnectCallback);
                mxnVar.z(str2);
                lcn.a(RVLLevel.Info, qcn.RVLModuleName).k("openRemote", mxnVar.A()).a("server", str).a("sessionId", str2).f();
                a(mxnVar);
                return;
            }
            mxnVar.P(true);
            lcn.a(RVLLevel.Info, qcn.RVLModuleName).k("openRemote", mxnVar.A()).a("server", str).a("connectId", str2).f();
            mxnVar.C(str2, new a(mxnVar, rVLRemoteConnectCallback));
        } else if (rVLRemoteConnectCallback != null) {
            rVLRemoteConnectCallback.finish(false, "WebSocket can only be created with ws or wss schemes");
        }
    }
}
