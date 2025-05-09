package com.alipay.mobile.common.transport.h5;

import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5HttpUrlResponse extends HttpUrlResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final InputStream g;
    public StatusLine h;
    public HttpResponse httpResponse;

    public H5HttpUrlResponse(HttpUrlHeader httpUrlHeader, int i, String str, InputStream inputStream) {
        super(httpUrlHeader, i, str, null);
        this.g = inputStream;
    }

    public static /* synthetic */ Object ipc$super(H5HttpUrlResponse h5HttpUrlResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/h5/H5HttpUrlResponse");
    }

    public HttpResponse getHttpResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("b24cc325", new Object[]{this});
        }
        return this.httpResponse;
    }

    public InputStream getInputStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this});
        }
        return this.g;
    }

    public StatusLine getStatusLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatusLine) ipChange.ipc$dispatch("21c0da2b", new Object[]{this});
        }
        return this.h;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        HttpResponse httpResponse = this.httpResponse;
        if (httpResponse == null) {
            LogCatUtil.warn("H5HttpUrlResponse", "httpResponse is null");
            return;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                entity.consumeContent();
                LogCatUtil.info("H5HttpUrlResponse", "enter release()");
            }
        } catch (Throwable th) {
            LogCatUtil.warn("H5HttpUrlResponse", "release fail", th);
        }
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6aa6a7", new Object[]{this, httpResponse});
        } else {
            this.httpResponse = httpResponse;
        }
    }

    public void setStatusLine(StatusLine statusLine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7579407", new Object[]{this, statusLine});
        } else {
            this.h = statusLine;
        }
    }
}
