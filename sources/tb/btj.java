package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmProxy;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class btj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355617);
    }

    public final void a(String str, NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711feb02", new Object[]{this, str, netRequest});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onAsyncRequest(str, netRequest);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(String str, int i, NetRequest netRequest, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d30a1880", new Object[]{this, str, new Integer(i), netRequest, netResponse, obj});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onAsyncRequestError(str, i, netRequest, netResponse, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final void c(String str, int i, NetRequest netRequest, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cb86c9", new Object[]{this, str, new Integer(i), netRequest, netResponse, netBaseOutDo, obj});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onAsyncRequestSuccess(str, i, netRequest, netResponse, netBaseOutDo, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final void d(String str, int i, NetRequest netRequest, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c7cf11", new Object[]{this, str, new Integer(i), netRequest, netResponse, obj});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onAsyncRequestSystemError(str, i, netRequest, netResponse, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final void e(String str, NetRequest netRequest, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbb9e1a", new Object[]{this, str, netRequest, netResponse});
            return;
        }
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onSyncRequest(str, netRequest, netResponse);
            }
        } catch (Exception unused) {
        }
    }
}
