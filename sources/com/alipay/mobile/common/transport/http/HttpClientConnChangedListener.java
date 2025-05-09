package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpClientConnChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static HttpClientConnChangedListener b;

    /* renamed from: a  reason: collision with root package name */
    public List<ClientConnectionManager> f4077a;

    public static final HttpClientConnChangedListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpClientConnChangedListener) ipChange.ipc$dispatch("c34004ed", new Object[0]);
        }
        HttpClientConnChangedListener httpClientConnChangedListener = b;
        if (httpClientConnChangedListener != null) {
            return httpClientConnChangedListener;
        }
        synchronized (HttpClientConnChangedListener.class) {
            try {
                HttpClientConnChangedListener httpClientConnChangedListener2 = b;
                if (httpClientConnChangedListener2 != null) {
                    return httpClientConnChangedListener2;
                }
                HttpClientConnChangedListener httpClientConnChangedListener3 = new HttpClientConnChangedListener();
                b = httpClientConnChangedListener3;
                return httpClientConnChangedListener3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<ClientConnectionManager> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<ClientConnectionManager> list = this.f4077a;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            try {
                List<ClientConnectionManager> list2 = this.f4077a;
                if (list2 != null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(5);
                this.f4077a = arrayList;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addClientConnectionManager(ClientConnectionManager clientConnectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbda8467", new Object[]{this, clientConnectionManager});
            return;
        }
        try {
            a().add(clientConnectionManager);
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientConnChangedListener", "[addClientConnectionManager] Exception: " + th.toString());
        }
    }

    public void notifyNetworkChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825a4292", new Object[]{this});
            return;
        }
        List<ClientConnectionManager> a2 = a();
        if (a2 == null) {
            LogCatUtil.info("HttpClientConnChangedListener", "[notifyNetworkChangedEvent] clientConnectionManagers maybe null.");
            return;
        }
        try {
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                a2.get(i).closeIdleConnections(0L, TimeUnit.MILLISECONDS);
            }
            LogCatUtil.info("HttpClientConnChangedListener", "[notifyNetworkChangedEvent] Idle connection is closed.");
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientConnChangedListener", "[notifyNetworkChangedEvent] Exception: " + th.toString());
        }
    }

    public void removeClientConnectionManager(ClientConnectionManager clientConnectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b74cbe4", new Object[]{this, clientConnectionManager});
            return;
        }
        try {
            a().remove(clientConnectionManager);
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientConnChangedListener", "[removeClientConnectionManager] Exception: " + th.toString());
        }
    }
}
