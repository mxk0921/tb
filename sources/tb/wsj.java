package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class wsj implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092160);
        t2o.a(806355932);
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        tfs.e("NetWorkListenerImpl", "2.onError,i:" + i + " netResponse:" + netResponse + " o:" + obj);
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        tfs.e("NetWorkListenerImpl", "2.onSystemError,i:" + i + " netResponse:" + netResponse + " o:" + obj);
    }
}
