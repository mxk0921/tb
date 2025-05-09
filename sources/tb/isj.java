package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class isj implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b0d f21551a;
    public final c0d b;
    public final NetRequest c;

    static {
        t2o.a(779093407);
        t2o.a(806355932);
    }

    public isj(NetRequest netRequest, b0d b0dVar, c0d c0dVar) {
        this.c = netRequest;
        this.f21551a = b0dVar;
        this.b = c0dVar;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f21551a;
        if (b0dVar != null) {
            b0dVar.onError(i, netResponse, obj);
        }
        c0d c0dVar = this.b;
        if (c0dVar != null) {
            ((m3h) c0dVar).h(i, this.c, netResponse, obj);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        b0d b0dVar = this.f21551a;
        if (b0dVar != null) {
            b0dVar.onSuccess(i, netResponse, netBaseOutDo, obj);
        }
        c0d c0dVar = this.b;
        if (c0dVar != null) {
            ((m3h) c0dVar).i(i, this.c, netResponse, netBaseOutDo, obj);
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f21551a;
        if (b0dVar != null) {
            b0dVar.onSystemError(i, netResponse, obj);
        }
        c0d c0dVar = this.b;
        if (c0dVar != null) {
            ((m3h) c0dVar).j(i, this.c, netResponse, obj);
        }
    }
}
