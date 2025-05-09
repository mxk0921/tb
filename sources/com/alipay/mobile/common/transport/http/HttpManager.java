package com.alipay.mobile.common.transport.http;

import android.content.Context;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.http.inner.CoreHttpManager;
import com.alipay.mobile.common.transport.rpc.RpcHttpWorker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HttpManager";
    public CoreHttpManager coreHttpManager;

    public HttpManager(Context context) {
        if (context != null) {
            this.coreHttpManager = CoreHttpManager.getInstance(context);
            return;
        }
        throw new IllegalArgumentException("context may not be null");
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
        } else {
            this.coreHttpManager.addConnectTime(j);
        }
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.coreHttpManager.addDataSize(j);
        }
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.coreHttpManager.addSocketTime(j);
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.coreHttpManager.close();
        }
    }

    public String dumpPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5581c", new Object[]{this});
        }
        return this.coreHttpManager.dumpPerf(getClass().getSimpleName());
    }

    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("439d65a6", new Object[]{this, request});
        }
        return this.coreHttpManager.execute(this, request);
    }

    public HttpWorker generateWorker(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpWorker) ipChange.ipc$dispatch("c83fc7de", new Object[]{this, httpUrlRequest});
        }
        return new RpcHttpWorker(this, httpUrlRequest);
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue();
        }
        return this.coreHttpManager.getAverageConnectTime();
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue();
        }
        return this.coreHttpManager.getAverageSpeed();
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.coreHttpManager.getContext();
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this});
        }
        return this.coreHttpManager.getHttpClient();
    }

    public void setHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1befe96", new Object[]{this, androidHttpClient});
        } else {
            this.coreHttpManager.setHttpClient(androidHttpClient);
        }
    }
}
