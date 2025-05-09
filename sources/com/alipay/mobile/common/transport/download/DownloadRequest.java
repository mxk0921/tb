package com.alipay.mobile.common.transport.download;

import com.alipay.mobile.common.transport.GlobalTransportCallbackObservable;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.Header;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DownloadRequest extends HttpUrlRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATION_TYPE = "download_request";
    public String E;
    public boolean F = false;
    public boolean G = false;
    public boolean H = true;
    public boolean I = false;

    public DownloadRequest(String str) {
        super(str);
        addTags("operationType", OPERATION_TYPE);
    }

    public static /* synthetic */ Object ipc$super(DownloadRequest downloadRequest, String str, Object... objArr) {
        if (str.hashCode() == -998684407) {
            return super.getCallback();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/download/DownloadRequest");
    }

    @Override // com.alipay.mobile.common.transport.Request
    public TransportCallback getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportCallback) ipChange.ipc$dispatch("c4794909", new Object[]{this});
        }
        TransportCallback callback = super.getCallback();
        if (callback != null) {
            return callback;
        }
        return GlobalTransportCallbackObservable.getInstance();
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return this.E;
    }

    public boolean isAllowRetryForErrorHttpStatusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23a8e5a", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean isOnlyWifiRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1cd526f", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public boolean isRedownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9729aa90", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public boolean isUrgentResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddbc7244", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public void setAllowRetryForErrorHttpStatusCode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d9e306", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public void setOnlyWifiRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea79101", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public void setPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{this, str});
        } else if (str != null) {
            this.E = str;
        } else {
            throw new IllegalArgumentException("Not set valid path.");
        }
    }

    public void setRedownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f5390", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    @Override // com.alipay.mobile.common.transport.Request
    public void setTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1df508", new Object[]{this, transportCallback});
        } else {
            this.mCallback = new DownloadTransportCallbackWrapper(transportCallback);
        }
    }

    public void setUrgentResource(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd235e5c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.G = z;
        setUrgentFlag(z);
    }

    public DownloadRequest(String str, byte[] bArr, ArrayList<Header> arrayList) {
        super(str, bArr, arrayList, (HashMap<String, String>) null);
        addTags("operationType", OPERATION_TYPE);
    }

    public DownloadRequest(String str, String str2, byte[] bArr, ArrayList<Header> arrayList) {
        super(str, bArr, arrayList, (HashMap<String, String>) null);
        addTags("operationType", OPERATION_TYPE);
        setPath(str2);
    }
}
