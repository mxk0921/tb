package com.alipay.mobile.common.transportext.biz.mmtp.mrpc;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportClient;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.HttpUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.RetryService;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.cookie.MRFC2109DomainHandler;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcRequest;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.cookie.BestMatchSpec;
import org.apache.http.impl.cookie.RFC2109Spec;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HttpContext;
import tb.mj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MRpcClient implements ExtTransportClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static MRpcClient b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4202a;

    public MRpcClient(Context context) {
        this.f4202a = context;
    }

    public static final MRpcClient getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcClient) ipChange.ipc$dispatch("b2cd063", new Object[]{context});
        }
        MRpcClient mRpcClient = b;
        if (mRpcClient != null) {
            return mRpcClient;
        }
        MRpcClient mRpcClient2 = new MRpcClient(context);
        b = mRpcClient2;
        return mRpcClient2;
    }

    public final MRpcResponse a(MRpcRequest mRpcRequest, MRpcTransport mRpcTransport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcResponse) ipChange.ipc$dispatch("2d38c719", new Object[]{this, mRpcRequest, mRpcTransport});
        }
        return mRpcTransport.execute(mRpcRequest);
    }

    public final HttpResponse b(MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("ca22ecc7", new Object[]{this, mRpcResponse});
        }
        BasicHttpResponse h = h(mRpcResponse);
        Map<String, String> headers = mRpcResponse.getHeaders();
        if (headers != null && !headers.isEmpty()) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    h.addHeader(entry.getKey(), entry.getValue());
                }
            }
        }
        if (h.getStatusLine().getStatusCode() != 304 || mRpcResponse.body.length > 0) {
            h.setEntity(new InputStreamEntity(new ByteArrayInputStream(mRpcResponse.body), mRpcResponse.body.length));
        }
        return h;
    }

    public final CookieSpec c(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieSpec) ipChange.ipc$dispatch("b15a4695", new Object[]{this, httpResponse});
        }
        Header firstHeader = httpResponse.getFirstHeader("Set-Cookie");
        if (firstHeader == null || TextUtils.isEmpty(firstHeader.getValue()) || (!firstHeader.getValue().contains("Version=1") && !firstHeader.getValue().contains("version=1"))) {
            return new BestMatchSpec();
        }
        RFC2109Spec rFC2109Spec = new RFC2109Spec();
        rFC2109Spec.registerAttribHandler("domain", new MRFC2109DomainHandler());
        return rFC2109Spec;
    }

    public final void d(TransportContext transportContext, MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4f1e2d", new Object[]{this, transportContext, mRpcResponse});
            return;
        }
        try {
            Map<String, String> headers = mRpcResponse.getHeaders();
            if (!(headers == null || headers.size() == 0)) {
                String str = headers.get("mmtp-ext-utc");
                if (!TextUtils.isEmpty(str)) {
                    headers.remove("mmtp-ext-utc");
                    long parseLong = Long.parseLong(str);
                    String dataItem = transportContext.getCurrentDataContainer().getDataItem(RPCDataItems.AIR_TIME);
                    long parseLong2 = Long.parseLong(dataItem) - parseLong;
                    LogCatUtil.debug("MRpcClient", "oriAirTime:" + dataItem + ",serverTime:" + str + ",airTime:" + parseLong2);
                    DataItemsUtil.putDataItem2ContainerAnyway(transportContext.getCurrentDataContainer(), RPCDataItems.AIR_TIME, String.valueOf(parseLong2));
                    DataItemsUtil.putDataItem2ContainerAnyway(transportContext.getCurrentDataContainer(), RPCDataItems.UTC_TIME, str);
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("MRpcClient", "processAirTime ex:" + th.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ExtTransportClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("9bd8925c", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        LogCatUtil.info("MRpcClient", "MRPCClient execute.");
        TransportContext transportContext = (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT);
        MRpcRequest mRpcRequest = new MRpcRequest(HttpUtils.getRequestURI(httpRequest).toString());
        g(httpRequest, (HttpUrlRequest) httpContext.getAttribute(TransportConstants.KEY_ORIGIN_REQUEST), mRpcRequest, httpContext);
        MRpcTransport mRpcTransport = new MRpcTransport();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            MRpcResponse a2 = a(mRpcRequest, mRpcTransport);
            int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
            if (MiscUtils.isDebugger(ExtTransportEnv.getAppContext())) {
                LogCatUtil.printInfo("MRpcClient", "AMTP Transport RESPONSE_notimeout.request=" + mRpcRequest + ".response=" + a2);
            }
            e(transportContext, a2, mRpcRequest, currentTimeMillis2);
            HttpResponse b2 = b(a2);
            extractCookiesFromResponse(httpHost, httpRequest, b2, httpContext);
            return b2;
        } catch (Exception e) {
            String targetHost = mRpcTransport.getTargetHost();
            if (!TextUtils.isEmpty(targetHost)) {
                transportContext.getCurrentDataContainer().putDataItem("TARGET_HOST", targetHost);
            }
            String str = mRpcTransport.getMRpcConneciton().getMrpcConnContext().get(MonitorLoggerUtils.LIB_VERSION);
            if (!TextUtils.isEmpty(str)) {
                if (TextUtils.equals(MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2, str)) {
                    transportContext.getCurrentDataContainer().putDataItem("NETTUNNEL", MonitorLoggerUtils.NETTUNNEL_ULib_h2);
                }
                transportContext.getCurrentDataContainer().putDataItem(MonitorLoggerUtils.LIB_VERSION, str);
            }
            transportContext.getCurrentDataContainer().putDataItem("ERROR", e.getMessage());
            String str2 = mRpcTransport.getMRpcConneciton().getMrpcConnContext().get(RPCDataItems.IP_STACK);
            if (!TextUtils.isEmpty(str2)) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.IP_STACK, str2);
            }
            throw e;
        }
    }

    public final void f(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f5bfe5", new Object[]{this, headerIterator, cookieSpec, cookieOrigin, cookieStore});
            return;
        }
        while (headerIterator.hasNext()) {
            try {
                for (Cookie cookie : cookieSpec.parse(headerIterator.nextHeader(), cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                    } catch (Exception e) {
                        LogCatUtil.error("MRpcClient", e);
                    }
                }
            } catch (Exception e2) {
                LogCatUtil.error("MRpcClient", e2);
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ExtTransportClient
    public int getModuleCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73c6acfa", new Object[]{this})).intValue();
        }
        return 1;
    }

    public final BasicHttpResponse h(MRpcResponse mRpcResponse) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicHttpResponse) ipChange.ipc$dispatch("1d702e96", new Object[]{this, mRpcResponse});
        }
        Map<String, String> headers = mRpcResponse.getHeaders();
        if (headers == null || !TextUtils.equals(headers.get(HeaderConstant.HEADER_KEY_RESULT_STATUS), "8001")) {
            str = mj4.CONTROL_NAME_OK;
            i = 200;
        } else {
            i = 304;
            str = "Not Modified";
        }
        return new BasicHttpResponse(HttpVersion.HTTP_1_1, i, str);
    }

    public final void i(TransportContext transportContext, MRpcResponse mRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a906c0ee", new Object[]{this, transportContext, mRpcResponse});
            return;
        }
        try {
            String[] split = mRpcResponse.queneStorage.split("-");
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AMNET_QUENE, String.valueOf(split[0]));
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AMNET_ST, String.valueOf(split[1]));
        } catch (Throwable th) {
            LogCatUtil.error("MRpcClient", th);
        }
    }

    public void extractCookiesFromResponse(HttpHost httpHost, HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b9b200", new Object[]{this, httpHost, httpRequest, httpResponse, httpContext});
            return;
        }
        CookieStore cookieStore = (CookieStore) httpContext.getAttribute("http.cookie-store");
        if (cookieStore != null) {
            CookieOrigin cookieOrigin = new CookieOrigin(httpHost.getHostName(), MiscUtils.getEffectivePort(httpHost.getSchemeName(), httpHost.getPort()), HttpUtils.getRequestURI(httpRequest).getPath(), true);
            LogCatUtil.printInfo("MRpcClient", " set Cookie. host=" + cookieOrigin.getHost() + ",port=" + cookieOrigin.getPort() + ",path=" + cookieOrigin.getPath());
            f(httpResponse.headerIterator("Set-Cookie"), c(httpResponse), cookieOrigin, cookieStore);
        }
    }

    public final void e(TransportContext transportContext, MRpcResponse mRpcResponse, MRpcRequest mRpcRequest, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e3e0c2", new Object[]{this, transportContext, mRpcResponse, mRpcRequest, new Integer(i)});
            return;
        }
        LogCatUtil.printInfo("MRpcClient", "fillLogDataItem start.");
        try {
            if (!TextUtils.isEmpty(mRpcResponse.targetHost)) {
                transportContext.getCurrentDataContainer().putDataItem("TARGET_HOST", mRpcResponse.targetHost);
            }
            int i3 = mRpcResponse.dnsTiming;
            if (i3 > 0) {
                transportContext.getCurrentDataContainer().putDataItem("DNS_TIME", Integer.toString(mRpcResponse.dnsTiming));
                i2 = i3;
            }
            int i4 = mRpcResponse.tcpTiming;
            if (i4 > 0) {
                i2 += i4;
                transportContext.getCurrentDataContainer().putDataItem("TCP_TIME", Integer.toString(mRpcResponse.tcpTiming));
            }
            int i5 = mRpcResponse.sslTiming;
            if (i5 > 0) {
                i2 += i5;
                transportContext.getCurrentDataContainer().putDataItem("SSL_TIME", Integer.toString(mRpcResponse.sslTiming));
            }
            if (mRpcResponse.tcpNtv > 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.NTCP_TIME, Integer.toString(mRpcResponse.tcpNtv));
            }
            if (mRpcResponse.sslNtv > 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.NSSL_TIME, Integer.toString(mRpcResponse.sslNtv));
            }
            if (mRpcResponse.readTiming >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.READ_TIME, Integer.toString(mRpcResponse.readTiming));
            }
            if (mRpcResponse.jtcTiming >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.JTC_TIME, Integer.toString(mRpcResponse.jtcTiming));
            }
            if (mRpcResponse.amnetWaitTiming >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AW_TIME, Integer.toString(mRpcResponse.amnetWaitTiming));
            }
            if (mRpcResponse.ipcP2m > 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.IPC_TIME2, Integer.toString(mRpcResponse.ipcP2m));
            }
            if (mRpcResponse.amnetStalledTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AMNET_STALLED_TIME, Integer.toString(mRpcResponse.amnetStalledTime));
            }
            if (mRpcResponse.airTime > 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AIR_TIME, Integer.toString(mRpcResponse.airTime));
            }
            LogCatUtil.printInfo("MRpcClient", "sentTime:" + i2);
            if (i > i2) {
                i -= i2;
            }
            int i6 = mRpcResponse.readTiming;
            if (i > i6) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.WAIT_TIME, Integer.toString(i - i6));
            }
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.REQ_SIZE, Integer.toString(mRpcResponse.reqSize));
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.RES_SIZE, Integer.toString(mRpcResponse.respSize));
            transportContext.getCurrentDataContainer().timeItemRelease("ALL_TIME");
            if (mRpcResponse.retried) {
                transportContext.getCurrentDataContainer().putDataItem("RETRY", "T");
            }
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.RPCID, String.valueOf(mRpcResponse.streamId));
            if (mRpcResponse.saTime > 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.SA_TIME, Integer.toString(mRpcResponse.saTime));
                AlipayQosService.getInstance().estimate(mRpcResponse.saTime, (byte) 1);
            }
            if (mRpcResponse.isOnShort) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.ONSHORT, "T");
            } else if (mRpcResponse.useShort) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.ONSHORT, UTConstant.Args.UT_SUCCESS_F);
            }
            if (!TextUtils.isEmpty(mRpcResponse.targetHostShort)) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.TARGET_HOST_SHORT, mRpcResponse.targetHostShort);
            }
            if (mRpcResponse.qoeCur >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.QOE_CUR, String.valueOf(mRpcResponse.qoeCur));
            }
            if (!TextUtils.isEmpty(mRpcResponse.queneStorage)) {
                i(transportContext, mRpcResponse);
            }
            if (mRpcResponse.isFlexible) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.FLEXIBLE, "T");
            }
            Map<String, String> map = mRpcResponse.headers;
            if (map != null) {
                String str = map.get("cps");
                if (!TextUtils.isEmpty(str)) {
                    LogCatUtil.printInfo("MRpcClient", "cps:" + str);
                    transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.CPS, str);
                }
            }
            if (mRpcResponse.ctjOutTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.CTJ_OUT_TIME, Integer.toString(mRpcResponse.ctjOutTime));
            }
            if (mRpcResponse.ntIOTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.NT_IO_TIME, Integer.toString(mRpcResponse.ntIOTime));
            }
            if (mRpcResponse.queueOutTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.QUEUE_OUT_TIME, Integer.toString(mRpcResponse.queueOutTime));
            }
            if (mRpcResponse.amnetHungTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AMNET_HUNG_TIME, Integer.toString(mRpcResponse.amnetHungTime));
            }
            if (mRpcResponse.amnetEncodeTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AMNET_ENCODE_TIME, Integer.toString(mRpcResponse.amnetEncodeTime));
            }
            if (mRpcResponse.amnetAllTime >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.AMNET_ALL_TIME, Integer.toString(mRpcResponse.amnetAllTime));
            }
            transportContext.getCurrentDataContainer().putDataItem("CID", Long.toString(mRpcResponse.cid));
            if (!TextUtils.isEmpty(mRpcResponse.clientIp)) {
                transportContext.getCurrentDataContainer().putDataItem("CIP", mRpcResponse.clientIp);
            }
            if (mRpcResponse.reqZipType >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.UP_ZIP_TYPE, String.valueOf(mRpcResponse.reqZipType));
            }
            if (mRpcResponse.rspZipType >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.DOWN_ZIP_TYPE, String.valueOf(mRpcResponse.rspZipType));
            }
            transportContext.getCurrentDataContainer().removeDataItem(MonitorLoggerUtils.LIB_VERSION);
            if (!mRpcResponse.isUseBifrost) {
                transportContext.getCurrentDataContainer().putDataItem(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_OLD);
            } else if (mRpcResponse.isUseHttp2) {
                transportContext.getCurrentDataContainer().putDataItem(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2);
                transportContext.getCurrentDataContainer().putDataItem("NETTUNNEL", MonitorLoggerUtils.NETTUNNEL_ULib_h2);
            } else {
                transportContext.getCurrentDataContainer().putDataItem(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST);
            }
            d(transportContext, mRpcResponse);
            if (mRpcResponse.ipStack >= 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.IP_STACK, String.valueOf(mRpcResponse.ipStack));
            }
            if (mRpcRequest.isMultiLink) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.MULTIPLEX_LINK, "T");
            }
        } catch (Exception e) {
            LogCatUtil.warn("MRpcClient", e);
        }
    }

    public final void g(HttpRequest httpRequest, HttpUrlRequest httpUrlRequest, MRpcRequest mRpcRequest, HttpContext httpContext) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a5aa79", new Object[]{this, httpRequest, httpUrlRequest, mRpcRequest, httpContext});
            return;
        }
        for (Header header : httpRequest.getAllHeaders()) {
            String value = header.getValue();
            if (!TextUtils.isEmpty(value)) {
                mRpcRequest.addHeader(header.getName(), value);
            }
        }
        TransportContext transportContext = (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT);
        if (!TextUtils.isEmpty(transportContext.rpcUUID)) {
            mRpcRequest.addHeader(HeaderConstant.HEADER_KEY_PARAM_TRACEID, transportContext.rpcUUID);
        }
        mRpcRequest.localAmnet = transportContext.transportByLocalAmnet;
        mRpcRequest.isUrgent = transportContext.urgentFlag;
        mRpcRequest.setDatas(httpUrlRequest.getReqData());
        int soTimeout = HttpConnectionParams.getSoTimeout(httpRequest.getParams());
        if (soTimeout > 0) {
            mRpcRequest.readTimeout = soTimeout;
        } else {
            mRpcRequest.readTimeout = TransportStrategy.getReadTimeout(ExtTransportEnv.getAppContext());
        }
        mRpcRequest.connTimeout = TransportStrategy.getConnTimeout(ExtTransportEnv.getAppContext());
        mRpcRequest.sslTimeout = TransportStrategy.getHandshakTimeout();
        if (TextUtils.equals(httpUrlRequest.getTag(TransportConstants.KEY_IS_CUST_GW_URL), "true")) {
            mRpcRequest.isCustGwUrl = true;
        }
        if (RetryService.getInstance().isSupportResend(mRpcRequest.getHeaders().get(HeaderConstant.HEADER_KEY_OPERATION_TYPE), httpUrlRequest.allowRetry)) {
            mRpcRequest.important = true;
        }
        if (TextUtils.equals(mRpcRequest.getHeaders().get(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK), "1")) {
            mRpcRequest.isMultiLink = true;
        }
        if (MiscUtils.isDebugger(this.f4202a)) {
            LogCatUtil.printInfo("MRpcClient", "AMTP Transport REQUEST START! operationType=" + httpUrlRequest.getTag("operationType") + ",requestline=" + httpRequest.getRequestLine() + ",request=" + mRpcRequest);
        }
    }
}
