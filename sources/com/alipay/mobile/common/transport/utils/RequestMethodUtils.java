package com.alipay.mobile.common.transport.utils;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.http.RequestMethodConstants;
import com.alipay.mobile.common.transport.http.ZNetworkHttpEntityWrapper;
import com.alipay.mobile.common.transport.http.method.HttpGetExt;
import com.alipay.mobile.common.transport.http.method.HttpPostExt;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RequestMethodUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final HttpUriRequest createHttpUriRequestByMethod(HttpEntity httpEntity, String str, URI uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("94927d1b", new Object[]{httpEntity, str, uri});
        }
        if (TextUtils.equals(str, "PUT")) {
            HttpPut httpPut = new HttpPut(uri);
            if (httpEntity != null) {
                httpPut.setEntity(new ZNetworkHttpEntityWrapper(httpEntity));
            }
            return httpPut;
        } else if (TextUtils.equals(str, "POST")) {
            HttpPost httpPost = new HttpPost(uri);
            if (httpEntity != null) {
                httpPost.setEntity(new ZNetworkHttpEntityWrapper(httpEntity));
            }
            return httpPost;
        } else if (TextUtils.equals(str, "HEAD")) {
            return new HttpHead(uri);
        } else {
            if (TextUtils.equals(str, "DELETE")) {
                return new HttpDelete(uri);
            }
            if (TextUtils.equals(str, "OPTIONS")) {
                return new HttpOptions(uri);
            }
            if (TextUtils.equals(str, RequestMethodConstants.TRACE_METHOD)) {
                return new HttpTrace(uri);
            }
            if (TextUtils.equals(str, "GET")) {
                return new HttpGet(uri);
            }
            if (httpEntity == null) {
                return new HttpGetExt(uri, str);
            }
            HttpPostExt httpPostExt = new HttpPostExt(uri, str);
            httpPostExt.setEntity(new ZNetworkHttpEntityWrapper(httpEntity));
            return httpPostExt;
        }
    }

    public static final String getMethodByHttpUriRequest(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1374a15", new Object[]{httpRequest});
        }
        if (httpRequest instanceof HttpPut) {
            return "PUT";
        }
        if (httpRequest instanceof HttpPost) {
            return "POST";
        }
        if (httpRequest instanceof HttpHead) {
            return "HEAD";
        }
        if (httpRequest instanceof HttpDelete) {
            return "DELETE";
        }
        if (httpRequest instanceof HttpOptions) {
            return "OPTIONS";
        }
        return "GET";
    }
}
