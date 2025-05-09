package com.alipay.mobile.common.transport.h5;

import com.alipay.mobile.common.transport.http.HttpForm;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpUriRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5HttpUrlRequest extends HttpUrlRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte HTTP_LINK = 2;
    public static final String OPERATION_TYPE = "h5_http_request";
    public static final byte SPDY_LINK = 1;
    public String H;
    public int linkType = 2;
    public boolean E = false;
    public boolean F = true;
    public boolean G = false;

    public H5HttpUrlRequest(String str) {
        super(str);
        init();
    }

    public static /* synthetic */ Object ipc$super(H5HttpUrlRequest h5HttpUrlRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/h5/H5HttpUrlRequest");
    }

    public String getRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a60c1e6f", new Object[]{this});
        }
        return this.H;
    }

    public boolean getUseCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f39d7bc", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean isAsyncMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa727327", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public boolean isGoHttp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("107d0ee5", new Object[]{this})).booleanValue();
        }
        if ((this.linkType & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isGoSpdy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98c2590f", new Object[]{this})).booleanValue();
        }
        if ((this.linkType & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isPrintUrlToMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bde9215c", new Object[]{this})).booleanValue();
        }
        return this.F;
    }

    public void setAsyncMonitorLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa68749", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public void setPrintUrlToMonitorLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b71c44", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public void setRefer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c850454f", new Object[]{this, str});
        } else {
            this.H = str;
        }
    }

    public void setUseCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad83890", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        addTags("operationType", OPERATION_TYPE);
        setCompress(false);
        setBgRpc(false);
        setUseHttpStdRetryModel(true);
        LogCatUtil.info("H5HttpUrlRequest", "url=" + getUrl());
    }

    public H5HttpUrlRequest(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, bArr, arrayList, hashMap);
        init();
    }

    public H5HttpUrlRequest(String str, HttpForm httpForm, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, httpForm, arrayList, hashMap);
        init();
    }

    public H5HttpUrlRequest(String str, HttpEntity httpEntity, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, httpEntity, arrayList, hashMap);
        init();
    }

    public H5HttpUrlRequest(String str, InputStream inputStream, int i, ArrayList<Header> arrayList, HashMap<String, String> hashMap) {
        super(str, inputStream, i, arrayList, hashMap);
        init();
    }

    public H5HttpUrlRequest(HttpUriRequest httpUriRequest) {
        super(httpUriRequest);
        init();
    }
}
