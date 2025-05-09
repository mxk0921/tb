package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b0d f26418a;
    public final Context b;

    static {
        t2o.a(806355959);
        t2o.a(806355932);
    }

    public q(b0d b0dVar, Context context) {
        this.f26418a = b0dVar;
        this.b = context;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f26418a;
        if (b0dVar != null) {
            b0dVar.onError(i, netResponse, obj);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        t0.a(netResponse.getHeaderFields(), this.b);
        b0d b0dVar = this.f26418a;
        if (b0dVar != null) {
            b0dVar.onSuccess(i, netResponse, netBaseOutDo, obj);
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        b0d b0dVar = this.f26418a;
        if (b0dVar != null) {
            b0dVar.onSystemError(i, netResponse, obj);
        }
    }
}
