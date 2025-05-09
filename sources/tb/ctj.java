package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ctj implements wzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wzc f17316a;
    public c0d b;

    static {
        t2o.a(779093409);
        t2o.a(806355931);
    }

    @Override // tb.wzc
    public NetResponse a(NetRequest netRequest) {
        NetResponse netResponse;
        c0d c0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("f7b345c2", new Object[]{this, netRequest});
        }
        wzc wzcVar = this.f17316a;
        if (wzcVar != null) {
            netResponse = wzcVar.a(netRequest);
        } else {
            netResponse = null;
        }
        if (wd0.a() && (c0dVar = this.b) != null) {
            ((m3h) c0dVar).l(netRequest, netResponse);
        }
        return netResponse;
    }

    @Override // tb.wzc
    public void b(NetRequest netRequest, b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423b5a6f", new Object[]{this, netRequest, b0dVar});
        } else if (wd0.a()) {
            c0d c0dVar = this.b;
            if (c0dVar != null) {
                ((m3h) c0dVar).g(netRequest);
            }
            isj isjVar = new isj(netRequest, b0dVar, this.b);
            wzc wzcVar = this.f17316a;
            if (wzcVar != null) {
                wzcVar.b(netRequest, isjVar);
            }
        } else {
            wzc wzcVar2 = this.f17316a;
            if (wzcVar2 != null) {
                wzcVar2.b(netRequest, b0dVar);
            }
        }
    }

    public void c(wzc wzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8395026f", new Object[]{this, wzcVar});
        } else {
            this.f17316a = wzcVar;
        }
    }

    public void d(c0d c0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18551f3", new Object[]{this, c0dVar});
        } else {
            this.b = c0dVar;
        }
    }
}
