package io.unicorn.plugin.network;

import android.text.TextUtils;
import io.unicorn.plugin.network.ExternalAdapterNetworkProvider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bxh;
import tb.dxh;
import tb.gpc;
import tb.hdh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class b implements ExternalAdapterNetworkProvider {

    /* renamed from: a  reason: collision with root package name */
    public final gpc f15205a;

    static {
        t2o.a(945815797);
        t2o.a(945815794);
    }

    public b(gpc gpcVar) {
        this.f15205a = gpcVar;
    }

    @Override // io.unicorn.plugin.network.ExternalAdapterNetworkProvider
    public void sendRequest(ExternalAdapterNetworkProvider.Request request, ExternalAdapterNetworkProvider.RequestListener requestListener) {
        bxh bxhVar = new bxh();
        bxhVar.c = request.url;
        bxhVar.d = request.method;
        bxhVar.e = request.body;
        bxhVar.f = request.timeout;
        Map<String, String> map = request.params;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ((ConcurrentHashMap) bxhVar.b).put(entry.getKey(), entry.getValue());
            }
        }
        this.f15205a.a(bxhVar, new a(this, requestListener));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements gpc.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ExternalAdapterNetworkProvider.RequestListener f15206a;

        public a(b bVar, ExternalAdapterNetworkProvider.RequestListener requestListener) {
            this.f15206a = requestListener;
        }

        @Override // tb.gpc.a
        public void a(dxh dxhVar) {
            int parseInt;
            ExternalAdapterNetworkProvider.RequestListener requestListener;
            byte[] bArr;
            if (!TextUtils.isEmpty(dxhVar.f18133a)) {
                try {
                    parseInt = Integer.parseInt(dxhVar.f18133a);
                } catch (NumberFormatException unused) {
                    hdh.b("DefaultNetworkProvider", "onHttpFinish statusCode:" + dxhVar.f18133a);
                }
                requestListener = this.f15206a;
                if (parseInt >= 200 || parseInt > 299 || (bArr = dxhVar.b) == null) {
                    requestListener.onRequestFinish(parseInt, null);
                } else {
                    requestListener.onRequestFinish(parseInt, bArr);
                    return;
                }
            }
            parseInt = 0;
            requestListener = this.f15206a;
            if (parseInt >= 200) {
            }
            requestListener.onRequestFinish(parseInt, null);
        }

        @Override // tb.gpc.a
        public void onHttpStart() {
        }

        @Override // tb.gpc.a
        public void onHttpResponseProgress(int i) {
        }

        @Override // tb.gpc.a
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
        }
    }
}
