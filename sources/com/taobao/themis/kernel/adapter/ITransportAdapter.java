package com.taobao.themis.kernel.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import tb.e0d;
import tb.gcn;
import tb.hcn;
import tb.n8s;
import tb.t2o;
import tb.x9s;
import tb.y9s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITransportAdapter extends n8s {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909489);
        }

        public static /* synthetic */ hcn a(ITransportAdapter iTransportAdapter, gcn gcnVar, e0d e0dVar, int i, Object obj) throws InterruptedException, ExecutionException, IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hcn) ipChange.ipc$dispatch("3f5a246a", new Object[]{iTransportAdapter, gcnVar, e0dVar, new Integer(i), obj});
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    e0dVar = null;
                }
                return iTransportAdapter.httpRequest(gcnVar, e0dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpRequest");
        }
    }

    void addDownload(y9s y9sVar, x9s x9sVar);

    hcn httpRequest(gcn gcnVar, e0d e0dVar) throws InterruptedException, ExecutionException, IOException;
}
