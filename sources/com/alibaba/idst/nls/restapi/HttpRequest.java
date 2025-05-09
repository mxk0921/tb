package com.alibaba.idst.nls.restapi;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String CONTENT_TYPE = "application/json";
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HEADER_CONTENT_MD5 = "Content-MD5";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_DATE = "Date";
    public static final String HEADER_X_NLS_TOKEN = "X-NLS-Token";
    public static final String METHOD_POST = "POST";
    private static final String URL_PREFIX = "https://nls-gateway-inner.aliyuncs.com:443/stream/v1/tts";
    public Map<String, String> header;
    private String requestBody;
    public String method = "POST";
    private String url = URL_PREFIX;

    static {
        t2o.a(199229491);
    }

    public String getBodyString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6f6ea50", new Object[]{this});
        }
        return this.requestBody;
    }

    public Map<String, String> getHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65ea693f", new Object[]{this});
        }
        return this.header;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return "POST";
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public HttpResponse parse(int i, byte[] bArr, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("f9a462b7", new Object[]{this, new Integer(i), bArr, new Boolean(z)});
        }
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setStatusCode(i);
        String str = new String(bArr, "UTF-8");
        if (httpResponse.getStatusCode() != 200 || !z) {
            httpResponse.setErrorMessage(str);
        } else {
            httpResponse.setAudioBody(bArr);
        }
        return httpResponse;
    }

    public void setBody(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf870b5", new Object[]{this, str});
        } else {
            this.requestBody = str;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }
}
