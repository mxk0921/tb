package com.alipay.mobile.common.transport.http.inner;

import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpClientPlannerHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static HttpRoute determineRoute(AndroidHttpClient androidHttpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpRoute) ipChange.ipc$dispatch("55602349", new Object[]{androidHttpClient, httpHost, httpRequest, httpContext});
        }
        if (httpRequest == null) {
            throw new IllegalStateException("Request must not be null.");
        } else if (httpHost != null) {
            InetAddress localAddress = ConnRouteParams.getLocalAddress(httpRequest.getParams());
            HttpHost defaultProxy = ConnRouteParams.getDefaultProxy(httpRequest.getParams());
            boolean isLayered = androidHttpClient.getConnectionManager().getSchemeRegistry().getScheme(httpHost.getSchemeName()).isLayered();
            if (defaultProxy == null) {
                return new HttpRoute(httpHost, localAddress, isLayered);
            }
            return new HttpRoute(httpHost, localAddress, defaultProxy, isLayered);
        } else {
            throw new IllegalStateException("Target host must not be null.");
        }
    }
}
