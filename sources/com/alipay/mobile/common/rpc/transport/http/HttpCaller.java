package com.alipay.mobile.common.rpc.transport.http;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoUtil;
import com.alipay.mobile.common.rpc.Config;
import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.impl.RpcLifeManagerImpl;
import com.alipay.mobile.common.rpc.transport.AbstractRpcCaller;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpException;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.RpcSignUtil;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.MtopConnection;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpCaller extends AbstractRpcCaller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Config f4042a;
    public String b;
    public String c;
    public RpcSignUtil.SignData d;
    public String e;
    public String f;
    public Map<String, String> g;
    public final Context h;
    public final InnerRpcInvokeContext k;
    public String i = "";
    public String j = "";
    public long l = -1;
    public long m = -1;
    public boolean n = true;
    public String o = "";
    public int p = 0;

    public HttpCaller(Config config, Method method, int i, String str, byte[] bArr, String str2, Context context, InnerRpcInvokeContext innerRpcInvokeContext) {
        super(method, i, str, bArr, str2, innerRpcInvokeContext.resetCookie.booleanValue());
        this.f4042a = config;
        this.h = context;
        this.k = innerRpcInvokeContext;
    }

    public static /* synthetic */ Object ipc$super(HttpCaller httpCaller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/transport/http/HttpCaller");
    }

    public final int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 11) {
            return 18;
        }
        if (i == 50) {
            return 24;
        }
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return 9;
        }
    }

    public final String b(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f220884", new Object[]{this, httpUrlRequest});
        }
        if (!MiscUtils.isInLogBackList(this.mOperationType) && MiscUtils.isDebugger(this.h)) {
            return httpUrlRequest.toString();
        }
        ArrayList<Header> headers = httpUrlRequest.getHeaders();
        StringBuilder sb = new StringBuilder(363);
        Iterator<Header> it = headers.iterator();
        while (it.hasNext()) {
            Header next = it.next();
            sb.append(next.getName());
            sb.append("=");
            sb.append(next.getValue());
            sb.append(",");
        }
        sb.append(",   根据相关法律法规和政策，部分内容未予显示");
        return sb.toString();
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            return "";
        }
        try {
            URI uri = new URI(str);
            if (TextUtils.equals(uri.getScheme(), "https") && uri.getHost().endsWith("alipay.net")) {
                String str2 = h1p.HTTP_PREFIX + uri.getHost() + uri.getPath();
                LogCatUtil.info("HttpCaller", "getRequestUrl.   " + uri + " replace to " + str2);
                return str2;
            }
        } catch (URISyntaxException e) {
            LogCatUtil.error("HttpCaller", e);
        }
        return "";
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.o = h();
        if (this.k.isGetMethod) {
            this.o += "?" + new String(this.mReqData);
        }
        if (TransportStrategy.isHitBifrostH2MultiplexByUrl(this.o)) {
            this.k.setRpcProtocol(ProtocolVersions.HTTP_2_0);
            this.k.setUseMultiplexLink(true);
        }
    }

    public final void e(HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee52ad84", new Object[]{this, httpUrlResponse});
        } else if (httpUrlResponse == null || httpUrlResponse.getHeader() == null) {
            LogCatUtil.warn("HttpCaller", "[setResponseHeaders] response or header is null.");
        } else {
            httpUrlResponse.getHeader().setHead(HeaderConstant.HEADER_KEY_X_RPC_REQ_TICK, String.valueOf(this.l));
            httpUrlResponse.getHeader().setHead(HeaderConstant.HEADER_KEY_X_RPC_RES_TICK, String.valueOf(this.m));
            this.k.responseHeader = httpUrlResponse.getHeader().getHeaders();
            this.f4042a.giveResponseHeader(this.mOperationType, httpUrlResponse.getHeader());
        }
    }

    public final void f(boolean z) {
        InnerRpcInvokeContext innerRpcInvokeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z && (innerRpcInvokeContext = this.k) != null) {
            innerRpcInvokeContext.responseHeader = Collections.EMPTY_MAP;
        }
    }

    public final Response g(HttpUrlRequest httpUrlRequest) {
        Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("60e09d9", new Object[]{this, httpUrlRequest});
        }
        System.currentTimeMillis();
        this.l = SystemClock.elapsedRealtime();
        Future<Response> execute = k().execute(httpUrlRequest);
        RpcLifeManagerImpl.getInstance().addFuture(execute);
        MonitorInfoUtil.startLinkRecordPhase(this.mOperationType, "rpc_network_task", null);
        MonitorInfoUtil.endLinkRecordPhase(this.mOperationType, "rpc_first_half", null);
        try {
            long j = this.k.timeout;
            if (j > 0) {
                response = execute.get(j, TimeUnit.MILLISECONDS);
            } else {
                response = execute.get(TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.RPC_TOTAL_TIMEOUT), TimeUnit.MILLISECONDS);
            }
            MonitorInfoUtil.endLinkRecordPhase(this.mOperationType, "rpc_network_task", null);
            MonitorInfoUtil.startLinkRecordPhase(this.mOperationType, "rpc_second_half", null);
            RpcLifeManagerImpl.getInstance().removeFuture(execute);
            this.m = SystemClock.elapsedRealtime();
            if (response != null) {
                return response;
            }
            LogCatUtil.info("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; Response fail: [response is null]. mOperationType=[" + this.mOperationType + "] ");
            throw new RpcException((Integer) 9, "response is null");
        } catch (Throwable th) {
            MonitorInfoUtil.endLinkRecordPhase(this.mOperationType, "rpc_network_task", null);
            MonitorInfoUtil.startLinkRecordPhase(this.mOperationType, "rpc_second_half", null);
            RpcLifeManagerImpl.getInstance().removeFuture(execute);
            this.m = SystemClock.elapsedRealtime();
            throw th;
        }
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        return this.mContentType;
    }

    public Map<String, String> getExtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df1125e", new Object[]{this});
        }
        return this.g;
    }

    public String getReqDataDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15d17323", new Object[]{this});
        }
        return this.b;
    }

    public String getRpcVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b056bb70", new Object[]{this});
        }
        return this.e;
    }

    public int getSignCost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0f94d1a", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public RpcSignUtil.SignData getSignData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcSignUtil.SignData) ipChange.ipc$dispatch("590f6efc", new Object[]{this});
        }
        return this.d;
    }

    public String getTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b946cb9", new Object[]{this});
        }
        return this.c;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        this.j = i();
        String m = m();
        this.i = m;
        if (!TextUtils.isEmpty(m)) {
            return this.i;
        }
        return this.j;
    }

    public void httpException2RpcException(HttpException httpException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b65691", new Object[]{this, httpException});
            return;
        }
        RpcException rpcException = new RpcException(Integer.valueOf(a(httpException.getCode())), httpException.getMsg());
        if (httpException.getCode() == 50) {
            rpcException.setAlert(0);
        }
        throw rpcException;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!MiscUtils.isDebugger(this.h)) {
            return this.k.gwUrl;
        }
        InnerRpcInvokeContext innerRpcInvokeContext = this.k;
        if (innerRpcInvokeContext.isCustGwUrl) {
            return innerRpcInvokeContext.gwUrl;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MOBILEGW_URL);
        if (!TextUtils.isEmpty(stringValue)) {
            LogCatUtil.info("HttpCaller", "getRequestUrl.   config gw url: " + stringValue);
            return stringValue;
        }
        try {
            if (!TransportStrategy.isAlipayUrl(this.k.gwUrl)) {
                LogCatUtil.info("HttpCaller", "getRequestUrl.   Not alipay url: " + this.k.gwUrl);
                return this.k.gwUrl;
            }
            String c = c(this.k.gwUrl);
            if (!TextUtils.isEmpty(c)) {
                return c;
            }
            LogCatUtil.info("HttpCaller", "getRequestUrl.  default gw url: " + this.k.gwUrl);
            return this.k.gwUrl;
        } catch (MalformedURLException e) {
            LogCatUtil.error("HttpCaller", e);
            return this.k.gwUrl;
        }
    }

    public boolean isRpcVersion2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("414315e0", new Object[]{this})).booleanValue();
        }
        if (TextUtils.equals(this.e, "2")) {
            return true;
        }
        return false;
    }

    public final void j(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9409d89e", new Object[]{this, httpUrlRequest});
            return;
        }
        p(httpUrlRequest);
        this.f4042a.addExtHeaders(httpUrlRequest);
        l(httpUrlRequest);
        if (!isRpcVersion2()) {
            httpUrlRequest.setHeader(new BasicHeader(MtopConnection.KEY_DID, DeviceInfoUtil.getDeviceId()));
            httpUrlRequest.setHeader(new BasicHeader("clientId", DeviceInfoUtil.getClientId()));
            httpUrlRequest.setHeader(new BasicHeader("TRACKERID", AppInfoUtil.getTrackerID()));
            RpcSignUtil.SignData signData = getSignData();
            if (!(signData == null || TextUtils.isEmpty(signData.sign) || signData.signType == -1)) {
                httpUrlRequest.setHeader(new BasicHeader("signType", String.valueOf(signData.signType)));
            }
        } else {
            o(httpUrlRequest);
            String deviceId = DeviceInfoUtil.getDeviceId();
            if (!TextUtils.isEmpty(deviceId)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_DID, deviceId));
            }
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_VERSION, "2"));
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, this.mOperationType));
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_TS, this.c));
            httpUrlRequest.setHeader(new BasicHeader("Content-Type", this.mContentType));
            if (!TextUtils.isEmpty(this.f)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_SENCE, this.f));
            }
            RpcSignUtil.SignData signData2 = getSignData();
            if (signData2 != null && !TextUtils.isEmpty(signData2.sign)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_SIGN, signData2.sign));
                if (signData2.signType != -1) {
                    httpUrlRequest.setHeader(new BasicHeader("signType", String.valueOf(signData2.signType)));
                }
            }
        }
        n(httpUrlRequest);
        q(httpUrlRequest);
        s(httpUrlRequest);
    }

    public final Transport k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("21fbcc45", new Object[]{this});
        }
        if (this.f4042a.getTransport() != null) {
            return this.f4042a.getTransport();
        }
        throw new RpcException((Integer) 1, "Not find this type Transport");
    }

    public final void l(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7f791f", new Object[]{this, httpUrlRequest});
        } else if (!TextUtils.isEmpty(this.k.appId)) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, this.k.appId));
        } else {
            String appIdForMPaaS = AppInfoUtil.getAppIdForMPaaS();
            if (!TextUtils.isEmpty(appIdForMPaaS)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, appIdForMPaaS));
                return;
            }
            String appId = MpaasPropertiesUtil.getAppId(this.h, this.k.appKey);
            httpUrlRequest.addHeader(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, appId));
            Context context = this.h;
            if (context != null && !MiscUtils.isInAlipayClient(context)) {
                httpUrlRequest.putLogAttachment("APP_ID", appId);
            }
        }
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        try {
        } catch (Exception e) {
            LogCatUtil.error("HttpCaller", e);
        }
        if (!MiscUtils.isInAlipayClient(this.h)) {
            return "";
        }
        String str = this.mOperationType;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.CDN_APIS);
        if (TextUtils.isEmpty(stringValue)) {
            return "";
        }
        String stringValue2 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.CDN_URL);
        if (TextUtils.isEmpty(stringValue2)) {
            return "";
        }
        for (String str2 : stringValue.split(",")) {
            if (TextUtils.equals(str, str2)) {
                LogCatUtil.info("HttpCaller", "Modify gw url to cdn url. operationType=[" + str + "], cdnUrl=[" + stringValue2 + "]");
                return stringValue2;
            }
        }
        return "";
    }

    public final void n(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f519a0", new Object[]{this, httpUrlRequest});
            return;
        }
        try {
            if (MiscUtils.isInAlipayClient(this.h)) {
                if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.ALIPAY_CLIENT_VERSION, "T")) {
                    String productVersion = AppInfoUtil.getProductVersion();
                    if (!TextUtils.isEmpty(productVersion)) {
                        httpUrlRequest.setHeader(new BasicHeader("clientVersion", productVersion));
                    }
                }
                if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.ALIPAY_USER_ID, "T")) {
                    String lastUserId = UserInfoUtil.getLastUserId();
                    if (!TextUtils.isEmpty(lastUserId)) {
                        httpUrlRequest.setHeader(new BasicHeader("userId", lastUserId));
                    }
                }
            }
        } catch (Throwable th) {
            LogCatUtil.warn("HttpCaller", "add ext header exception. " + th.toString());
        }
    }

    @Deprecated
    public final void o(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36aba21", new Object[]{this, httpUrlRequest});
            return;
        }
        Map<String, String> map = this.g;
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, String> entry : this.g.entrySet()) {
                httpUrlRequest.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
            }
        }
    }

    public final void p(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de05aa2", new Object[]{this, httpUrlRequest});
            return;
        }
        Map<String, String> map = this.k.requestHeaders;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : this.k.requestHeaders.entrySet()) {
                httpUrlRequest.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
            }
        }
        Map<String, String> mpaasProperties = MpaasPropertiesUtil.getMpaasProperties(this.h);
        if (mpaasProperties != null && !mpaasProperties.isEmpty()) {
            for (Map.Entry<String, String> entry2 : mpaasProperties.entrySet()) {
                httpUrlRequest.addHeader(new BasicHeader(entry2.getKey(), entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.k.workspaceId)) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, this.k.workspaceId));
            return;
        }
        String workspaceIdForMPaaS = AppInfoUtil.getWorkspaceIdForMPaaS();
        if (!TextUtils.isEmpty(workspaceIdForMPaaS)) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, workspaceIdForMPaaS));
        }
    }

    public final void q(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3855fb23", new Object[]{this, httpUrlRequest});
        } else if (!TextUtils.isEmpty(this.i)) {
            httpUrlRequest.addTags(TransportConstants.KEY_FORCE_HTTP, "true");
            try {
                URL url = new URL(this.j);
                try {
                    HttpDns.HttpdnsIP ipInfoByHost = AlipayHttpDnsClient.getDnsClient().getIpInfoByHost(url.getHost());
                    if (ipInfoByHost != null) {
                        String ip = ipInfoByHost.getIp();
                        if (!TextUtils.isEmpty(ip)) {
                            httpUrlRequest.setHeader(new BasicHeader("backend", ip));
                            return;
                        }
                    }
                } catch (Exception e) {
                    LogCatUtil.warn("HttpCaller", e);
                }
                httpUrlRequest.setHeader(new BasicHeader("backend", url.getHost()));
            } catch (Exception e2) {
                throw new RuntimeException("originGwUrl=" + this.j, e2);
            }
        }
    }

    public final void r(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cb9ba4", new Object[]{this, httpUrlRequest});
            return;
        }
        httpUrlRequest.addTags("id", String.valueOf(this.mId));
        httpUrlRequest.addTags("operationType", this.mOperationType);
        httpUrlRequest.addTags(TransportConstants.KEY_REQ_DATA_DIGEST, getReqDataDigest());
        httpUrlRequest.addTags(TransportConstants.KEY_RPC_VERSION, this.e);
        httpUrlRequest.addTags(TransportConstants.KEY_UUID, DeviceInfoUtil.getDeviceId() + this.c);
        httpUrlRequest.addTags(TransportConstants.KEY_IS_NEED_SIGN, String.valueOf(this.n));
        httpUrlRequest.addTags(TransportConstants.KEY_IS_CUST_GW_URL, String.valueOf(this.k.isCustGwUrl));
        if (this.k.useMultiplexLink) {
            httpUrlRequest.addTags(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK, "1");
        }
        int i = this.k.loggerLevel;
        if (i != -1) {
            httpUrlRequest.addTags(TransportConstants.KEY_LOGGER_LEVEL, String.valueOf(i));
        }
        int signCost = getSignCost();
        if (signCost != 0) {
            httpUrlRequest.addTags(TransportConstants.KEY_SIGN_TIME, String.valueOf(signCost));
        }
    }

    public final void s(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad413c25", new Object[]{this, httpUrlRequest});
            return;
        }
        if (this.k.shortOnly) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_PARAM_SHORTLINK_ONLY, "1"));
            if (!TextUtils.isEmpty(this.k.getShortLinkIPList())) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_PARAM_SHORTLINK_IPLIST, this.k.getShortLinkIPList()));
            }
        }
        if (this.k.useMultiplexLink) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK, "1"));
        }
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.mContentType = str;
        }
    }

    public void setExtObjectParam(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70844b0f", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            this.g = hashMap;
        }
    }

    public void setExtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00aebf0", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public void setNeedSign(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b501f258", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void setReqDataDigest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fcd31b", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setRpcVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16a3a06", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setSignCost(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1073130", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void setSignData(RpcSignUtil.SignData signData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d600f678", new Object[]{this, signData});
        } else {
            this.d = signData;
        }
    }

    public void setTimeStamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a936e645", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // com.alipay.mobile.common.rpc.transport.RpcCaller
    public Object call() {
        InterruptedException e;
        ExecutionException e2;
        String str;
        CancellationException e3;
        TimeoutException e4;
        Throwable th;
        HttpCaller httpCaller = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{httpCaller});
        }
        d();
        HttpUrlRequest httpUrlRequest = new HttpUrlRequest(httpCaller.o);
        httpUrlRequest.setReqData(httpCaller.mReqData);
        httpUrlRequest.setContentType(httpCaller.mContentType);
        httpUrlRequest.setResetCookie(httpCaller.k.resetCookie.booleanValue());
        httpUrlRequest.setCompress(httpCaller.k.compress.booleanValue());
        httpUrlRequest.setBgRpc(httpCaller.k.bgRpc.booleanValue());
        httpUrlRequest.setUrgentFlag(httpCaller.k.isUrgent);
        httpUrlRequest.allowRetry = httpCaller.k.allowRetry.booleanValue();
        httpUrlRequest.setTimeout(httpCaller.k.timeout);
        httpUrlRequest.setAllowNonNet(httpCaller.k.allowNonNet);
        httpUrlRequest.setSwitchLoginRpc(httpCaller.k.switchUserLoginRpc);
        httpUrlRequest.setDisableEncrypt(httpCaller.k.disableEnctypt);
        httpUrlRequest.setEnableEncrypt(httpCaller.k.enableEncrypt);
        httpUrlRequest.setBizLog(httpCaller.k.bizLog);
        httpUrlRequest.setRpcHttp2(!ProtocolVersions.HTTP_1_1.equals(httpCaller.k.protocolVersion));
        httpCaller.r(httpUrlRequest);
        if (httpCaller.k.isGetMethod) {
            httpUrlRequest.setRequestMethod("GET");
            httpUrlRequest.setReqData(null);
        } else {
            httpUrlRequest.setRequestMethod("POST");
        }
        httpCaller.j(httpUrlRequest);
        LogCatUtil.info("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; Request info: " + httpCaller.b(httpUrlRequest));
        try {
            try {
                Response g = httpCaller.g(httpUrlRequest);
                HttpUrlResponse httpUrlResponse = (HttpUrlResponse) g;
                StringBuilder sb = new StringBuilder("threadid=");
                try {
                    sb.append(Thread.currentThread().getId());
                    sb.append(" Response success.");
                    LogCatUtil.info("HttpCaller", sb.toString());
                    httpCaller = this;
                    httpCaller.e(httpUrlResponse);
                    httpCaller.f(true);
                    return g;
                } catch (InterruptedException e5) {
                    e = e5;
                    httpUrlRequest.cancel("InterruptedException");
                    LogCatUtil.error("HttpCaller", "InterruptedException:" + MiscUtils.getRootCause(e));
                    throw new RpcException(13, "InterruptedException", e);
                } catch (CancellationException e6) {
                    e3 = e6;
                    httpUrlRequest.cancel("CancellationException");
                    LogCatUtil.error("HttpCaller", "CancellationException:" + MiscUtils.getRootCause(e3));
                    throw new RpcException(13, "CancellationException", e3);
                } catch (ExecutionException e7) {
                    e2 = e7;
                    httpCaller = this;
                    httpUrlRequest.cancel("ExecutionException");
                    Throwable cause = e2.getCause();
                    LogCatUtil.debug("HttpCaller", "ExecutionException:" + cause);
                    if (cause != null && (cause instanceof HttpException)) {
                        httpCaller.httpException2RpcException((HttpException) cause);
                    }
                    MonitorErrorLogHelper.log("HttpCaller", cause);
                    if (cause != null) {
                        str = cause.toString();
                    } else {
                        str = "";
                    }
                    throw new RpcException(9, str, cause);
                } catch (TimeoutException e8) {
                    e4 = e8;
                    httpUrlRequest.cancel("TimeoutException");
                    LogCatUtil.error("HttpCaller", "TimeoutException: " + MiscUtils.getRootCause(e4));
                    throw new RpcException(13, "TimeoutException", e4);
                } catch (Throwable th2) {
                    th = th2;
                    httpUrlRequest.cancel("Throwable");
                    Throwable rootCause = MiscUtils.getRootCause(th);
                    LogCatUtil.error("HttpCaller", "Throwable: " + rootCause);
                    throw new RpcException(9, rootCause.toString(), th);
                }
            } catch (Throwable th3) {
                httpCaller.f(false);
                throw th3;
            }
        } catch (InterruptedException e9) {
            e = e9;
        } catch (CancellationException e10) {
            e3 = e10;
        } catch (ExecutionException e11) {
            e2 = e11;
        } catch (TimeoutException e12) {
            e4 = e12;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
