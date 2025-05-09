package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import java.util.HashMap;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t70 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile t70 e;

    /* renamed from: a  reason: collision with root package name */
    public Context f28518a;
    public final dti<JsonRpcRequest> b = new owf();
    public final si4<JsonRpcRequest, JsonRpcResponse> c = new ti4(this);
    public final tix d = new uix();

    static {
        t2o.a(993001577);
    }

    public t70() {
        new HashMap();
        i();
    }

    public static t70 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t70) ipChange.ipc$dispatch("5c45c997", new Object[0]);
        }
        if (e == null) {
            synchronized (t70.class) {
                try {
                    if (e == null) {
                        e = new t70();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        return this.f28518a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("960b5ede", new Object[]{this})).intValue();
        }
        return ((ti4) this.c).g();
    }

    public dti<JsonRpcRequest> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dti) ipChange.ipc$dispatch("5b5ac624", new Object[]{this});
        }
        return this.b;
    }

    public tix e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tix) ipChange.ipc$dispatch("9a92c538", new Object[]{this});
        }
        return this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9226bbf6", new Object[]{this})).booleanValue();
        }
        return ((ti4) this.c).k();
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.f28518a == null) {
            this.f28518a = context.getApplicationContext();
            ((ti4) this.c).x();
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return ((ti4) this.c).m();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e016f9", new Object[]{this});
            return;
        }
        j("get.appInfo", new q7a());
        j("selectMock", new n9p());
        j("removeMock", new rzn());
        j("selectStrategy", new r9p());
        j("removeStrategy", new uzn());
        j("clearStrategy", new qt3());
        j("selectABTest", new a9p());
        j("clearABTest", new zs3());
    }

    public void j(String str, mho<JsonRpcRequest> mhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59415e92", new Object[]{this, str, mhoVar});
        } else {
            ((owf) this.b).b(str, mhoVar);
        }
    }

    public void k(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfaae2f", new Object[]{this, jsonRpcRequest});
        } else {
            ((ti4) this.c).t(jsonRpcRequest);
        }
    }

    public Future<JsonRpcResponse> l(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d7142c37", new Object[]{this, jsonRpcRequest});
        }
        return ((ti4) this.c).w(jsonRpcRequest);
    }
}
