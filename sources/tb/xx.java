package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.java_websocket.WebSocket;
import tb.oho;
import tb.rho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xx<REQUEST extends oho, RESPONSE extends rho> implements soi, tho<REQUEST> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dti<REQUEST> f31653a;
    public final hho<REQUEST, RESPONSE> b;
    public final si4<REQUEST, RESPONSE> c;
    public final tix d;

    static {
        t2o.a(993001600);
        t2o.a(993001602);
        t2o.a(993001623);
    }

    public xx(dti<REQUEST> dtiVar, hho<REQUEST, RESPONSE> hhoVar, si4<REQUEST, RESPONSE> si4Var, tix tixVar) {
        this.f31653a = dtiVar;
        this.b = hhoVar;
        this.c = si4Var;
        this.d = tixVar;
    }

    public void a(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f118db2", new Object[]{this, webSocket, str});
            return;
        }
        REQUEST e = e(str, webSocket);
        if (e == null || !g(e, webSocket)) {
            RESPONSE f = f(str);
            if (f != null && h(f)) {
                c(f);
                return;
            }
            return;
        }
        b(e, webSocket);
    }

    public final void b(REQUEST request, WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64db4460", new Object[]{this, request, webSocket});
            return;
        }
        mho<REQUEST> a2 = this.f31653a.a(request.getMethod());
        if (a2 == null) {
            d(request, webSocket);
        } else {
            a2.a(request, webSocket, this.d, this);
        }
    }

    public final void c(RESPONSE response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470a6aee", new Object[]{this, response});
        } else {
            ((wx) this.b).b(response);
        }
    }

    public abstract void d(REQUEST request, WebSocket webSocket);

    public abstract REQUEST e(String str, WebSocket webSocket);

    public abstract RESPONSE f(String str);

    public abstract boolean g(REQUEST request, WebSocket webSocket);

    public abstract boolean h(RESPONSE response);

    public void i(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b79d052", new Object[]{this, webSocket, str});
        } else {
            ((ti4) this.c).u(webSocket, str);
        }
    }
}
