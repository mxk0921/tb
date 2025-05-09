package anet.channel.session;

import android.net.Network;
import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpSslUtil;
import anet.channel.util.ProxySetting;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HttpConnector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HttpConnector";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Response {
        public int contentLength;
        public String encodeType;
        public Map<String, List<String>> header;
        public int httpCode;
        public byte[] out;
        public int supportEncodeType;

        static {
            t2o.a(607125712);
        }
    }

    static {
        t2o.a(607125710);
    }

    private HttpConnector() {
    }

    public static Response connect(Request request) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Response) ipChange.ipc$dispatch("720c2b49", new Object[]{request}) : connectImpl(request, null, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:(17:562|15|516|16|(16:498|18|19|570|20|542|21|22|560|23|544|24|25|558|26|27)(1:93)|548|94|95|(5:550|97|98|546|99)(3:109|509|110)|111|(1:113)|114|115|556|116|117|(10:564|118|119|120|121|511|122|123|(5:125|126|568|127|128)|140))|(3:540|142|(2:144|(10:146|147|552|148|531|149|490|150|577|153)(20:574|168|169|170|566|171|172|502|184|(1:189)(1:188)|190|515|(3:200|(1:312)|313)(15:201|(1:203)(1:204)|205|(3:211|212|(1:214)(1:215))|(1:217)|218|494|219|(1:221)(1:222)|223|(3:526|225|226)(1:229)|230|488|231|(2:233|(1:236)))|314|315|(1:317)|(1:320)|520|321|479))(1:573))(1:572)|183|502|184|(1:186)|189|190|515|(1:192)|200|(0)|313|314|315|(0)|(1:320)|520|321|479|530|12) */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04e6, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04ec, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04f2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04ff, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0500, code lost:
        r14 = "http disconnect";
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0501, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0566, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x056c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0570, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0576, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x057c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0582, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0588, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0659, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x065a, code lost:
        r2 = r13.rs.bizReqId;
        r3 = new java.lang.Object[2];
        r3[r15] = " bizReqId";
        r3[1] = r2;
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r14, null, r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06fc, code lost:
        r4 = r1.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0701, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0702, code lost:
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x070e, code lost:
        anet.channel.strategy.SchemeGuesser.getInstance().onSslFail(r13.getHost());
        onException(r13, r11, r33, anet.channel.util.ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x071f, code lost:
        onException(r13, r11, r33, -101, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x073b, code lost:
        r19.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0740, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0741, code lost:
        r2 = r13.rs.bizReqId;
        r3 = new java.lang.Object[2];
        r3[r15] = " bizReqId";
        r3[1] = r2;
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r14, null, r0, r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05df A[Catch: all -> 0x04e6, Exception -> 0x04ec, CancellationException -> 0x04f2, IOException -> 0x0566, SSLException -> 0x056c, SSLHandshakeException -> 0x0570, ConnectException -> 0x0576, ConnectTimeoutException -> 0x057c, SocketTimeoutException -> 0x0582, UnknownHostException -> 0x0588, TRY_ENTER, TryCatch #78 {SSLException -> 0x056c, blocks: (B:254:0x050b, B:256:0x0535, B:257:0x0544, B:259:0x054d, B:261:0x0553, B:263:0x0559, B:265:0x055e, B:281:0x058e, B:312:0x05df, B:313:0x05e6, B:314:0x05f7, B:317:0x0623, B:320:0x064d), top: B:515:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0623 A[Catch: all -> 0x04e6, Exception -> 0x04ec, CancellationException -> 0x04f2, IOException -> 0x0566, SSLException -> 0x056c, SSLHandshakeException -> 0x0570, ConnectException -> 0x0576, ConnectTimeoutException -> 0x057c, SocketTimeoutException -> 0x0582, UnknownHostException -> 0x0588, TRY_ENTER, TryCatch #78 {SSLException -> 0x056c, blocks: (B:254:0x050b, B:256:0x0535, B:257:0x0544, B:259:0x054d, B:261:0x0553, B:263:0x0559, B:265:0x055e, B:281:0x058e, B:312:0x05df, B:313:0x05e6, B:314:0x05f7, B:317:0x0623, B:320:0x064d), top: B:515:0x03f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06fc A[Catch: all -> 0x0701, TryCatch #147 {all -> 0x0701, blocks: (B:381:0x06f6, B:383:0x06fc, B:387:0x0705, B:389:0x070e, B:390:0x071f, B:391:0x0724, B:399:0x075a, B:407:0x07a3, B:450:0x0900, B:458:0x093c, B:466:0x0978, B:474:0x09b2), top: B:530:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x070e A[Catch: all -> 0x0701, TryCatch #147 {all -> 0x0701, blocks: (B:381:0x06f6, B:383:0x06fc, B:387:0x0705, B:389:0x070e, B:390:0x071f, B:391:0x0724, B:399:0x075a, B:407:0x07a3, B:450:0x0900, B:458:0x093c, B:466:0x0978, B:474:0x09b2), top: B:530:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x071f A[Catch: all -> 0x0701, TryCatch #147 {all -> 0x0701, blocks: (B:381:0x06f6, B:383:0x06fc, B:387:0x0705, B:389:0x070e, B:390:0x071f, B:391:0x0724, B:399:0x075a, B:407:0x07a3, B:450:0x0900, B:458:0x093c, B:466:0x0978, B:474:0x09b2), top: B:530:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0819 A[Catch: all -> 0x04e6, TRY_LEAVE, TryCatch #129 {all -> 0x04e6, blocks: (B:231:0x04bb, B:233:0x04ca, B:236:0x04d2, B:254:0x050b, B:257:0x0544, B:259:0x054d, B:261:0x0553, B:263:0x0559, B:265:0x055e, B:281:0x058e, B:312:0x05df, B:313:0x05e6, B:314:0x05f7, B:317:0x0623, B:320:0x064d, B:414:0x07e2, B:417:0x0812, B:419:0x0819, B:423:0x0845, B:432:0x0875, B:435:0x08a4, B:437:0x08ab, B:440:0x08d5), top: B:530:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08ab A[Catch: all -> 0x04e6, TRY_LEAVE, TryCatch #129 {all -> 0x04e6, blocks: (B:231:0x04bb, B:233:0x04ca, B:236:0x04d2, B:254:0x050b, B:257:0x0544, B:259:0x054d, B:261:0x0553, B:263:0x0559, B:265:0x055e, B:281:0x058e, B:312:0x05df, B:313:0x05e6, B:314:0x05f7, B:317:0x0623, B:320:0x064d, B:414:0x07e2, B:417:0x0812, B:419:0x0819, B:423:0x0845, B:432:0x0875, B:435:0x08a4, B:437:0x08ab, B:440:0x08d5), top: B:530:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x09dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x09f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0995 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x07bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0959 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0784 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x091d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x084e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x073b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v120 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v137 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v67 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v89, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static anet.channel.session.HttpConnector.Response connectImpl(anet.channel.request.Request r32, anet.channel.RequestCb r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 2589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.HttpConnector.connectImpl(anet.channel.request.Request, anet.channel.RequestCb, boolean):anet.channel.session.HttpConnector$Response");
    }

    public static Response connect(Request request, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Response) ipChange.ipc$dispatch("f9b3c4bd", new Object[]{request, new Boolean(z)}) : connectImpl(request, null, z);
    }

    public static void connect(Request request, RequestCb requestCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df26c90", new Object[]{request, requestCb});
        } else {
            connectImpl(request, requestCb, false);
        }
    }

    public static void connect(Request request, RequestCb requestCb, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05bd844", new Object[]{request, requestCb, new Boolean(z)});
        } else {
            connectImpl(request, requestCb, z);
        }
    }

    private static HttpURLConnection getConnection(Request request, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        URLConnection openConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("9e106f45", new Object[]{request, new Boolean(z)});
        }
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = wifiProxy != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue())) : null;
        ProxySetting proxySetting = ProxySetting.get();
        if (NetworkStatusHelper.getStatus().isMobile() && proxySetting != null) {
            proxy = proxySetting.getProxy();
        }
        URL url = request.getUrl();
        Network cellularNetwork = NetworkStatusHelper.getCellularNetwork();
        if (z && cellularNetwork != null && Build.VERSION.SDK_INT >= 23) {
            ALog.e(TAG, "openConnection by cellular", request.getSeq(), " bizReqId", request.rs.bizReqId);
            if (proxy != null) {
                openConnection = cellularNetwork.openConnection(url, proxy);
                httpURLConnection = (HttpURLConnection) openConnection;
            } else {
                httpURLConnection = (HttpURLConnection) cellularNetwork.openConnection(url);
            }
        } else if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        String str = headers.get(HttpConstant.HOST);
        if (str == null) {
            str = request.getHost();
        }
        if (request.getHttpUrl().containsNonDefaultPort()) {
            str = StringUtils.concatString(str, ":", String.valueOf(request.getHttpUrl().getPort()));
        }
        httpURLConnection.setRequestProperty(HttpConstant.HOST, str);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            httpURLConnection.setRequestProperty(HttpConstant.X_ONLINE_HOST, str);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (proxySetting != null) {
            httpURLConnection.setRequestProperty("Authorization", proxySetting.getBasicAuthorization());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            supportHttps(httpURLConnection, request, request.getHost());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Unknown variable types count: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int postData(java.net.HttpURLConnection r11, anet.channel.request.Request r12) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.String r3 = "postData"
            java.lang.String r4 = " bizReqId"
            java.lang.String r5 = "awcn.HttpConnector"
            com.android.alibaba.ip.runtime.IpChange r6 = anet.channel.session.HttpConnector.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0024
            java.lang.String r3 = "df43198c"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            r1[r0] = r12
            java.lang.Object r11 = r6.ipc$dispatch(r3, r1)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            return r11
        L_0x0024:
            boolean r6 = r12.containsBody()
            if (r6 == 0) goto L_0x00c0
            r6 = 0
            java.io.OutputStream r6 = r11.getOutputStream()     // Catch: all -> 0x0050, Exception -> 0x0052
            int r11 = r12.postBody(r6)     // Catch: all -> 0x0050, Exception -> 0x0052
            if (r6 == 0) goto L_0x004e
            r6.flush()     // Catch: IOException -> 0x003c
            r6.close()     // Catch: IOException -> 0x003c
            goto L_0x004e
        L_0x003c:
            r6 = move-exception
            java.lang.String r7 = r12.getSeq()
            anet.channel.statist.RequestStatistic r8 = r12.rs
            java.lang.String r8 = r8.bizReqId
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r0] = r8
            anet.channel.util.ALog.e(r5, r3, r7, r6, r1)
        L_0x004e:
            r2 = r11
            goto L_0x0082
        L_0x0050:
            r11 = move-exception
            goto L_0x00a4
        L_0x0052:
            r11 = move-exception
            java.lang.String r7 = "postData error"
            java.lang.String r8 = r12.getSeq()     // Catch: all -> 0x0050
            anet.channel.statist.RequestStatistic r9 = r12.rs     // Catch: all -> 0x0050
            java.lang.String r9 = r9.bizReqId     // Catch: all -> 0x0050
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: all -> 0x0050
            r10[r2] = r4     // Catch: all -> 0x0050
            r10[r0] = r9     // Catch: all -> 0x0050
            anet.channel.util.ALog.e(r5, r7, r8, r11, r10)     // Catch: all -> 0x0050
            if (r6 == 0) goto L_0x0082
            r6.flush()     // Catch: IOException -> 0x0070
            r6.close()     // Catch: IOException -> 0x0070
            goto L_0x0082
        L_0x0070:
            r11 = move-exception
            java.lang.String r6 = r12.getSeq()
            anet.channel.statist.RequestStatistic r7 = r12.rs
            java.lang.String r7 = r7.bizReqId
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r0] = r7
            anet.channel.util.ALog.e(r5, r3, r6, r11, r1)
        L_0x0082:
            anet.channel.statist.RequestStatistic r11 = r12.rs
            long r0 = r11.reqBodyInflateSize
            r3 = 0
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x0091
            anet.channel.statist.RequestStatistic r11 = r12.rs
            long r0 = (long) r2
            r11.reqBodyInflateSize = r0
        L_0x0091:
            anet.channel.statist.RequestStatistic r11 = r12.rs
            long r0 = r11.reqBodyDeflateSize
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x009e
            anet.channel.statist.RequestStatistic r11 = r12.rs
            long r0 = (long) r2
            r11.reqBodyDeflateSize = r0
        L_0x009e:
            anet.channel.statist.RequestStatistic r11 = r12.rs
            long r0 = (long) r2
            r11.sendDataSize = r0
            goto L_0x00c0
        L_0x00a4:
            if (r6 == 0) goto L_0x00bf
            r6.flush()     // Catch: IOException -> 0x00ad
            r6.close()     // Catch: IOException -> 0x00ad
            goto L_0x00bf
        L_0x00ad:
            r6 = move-exception
            java.lang.String r7 = r12.getSeq()
            anet.channel.statist.RequestStatistic r12 = r12.rs
            java.lang.String r12 = r12.bizReqId
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r0] = r12
            anet.channel.util.ALog.e(r5, r3, r7, r6, r1)
        L_0x00bf:
            throw r11
        L_0x00c0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.HttpConnector.postData(java.net.HttpURLConnection, anet.channel.request.Request):int");
    }

    private static void supportHttps(HttpURLConnection httpURLConnection, Request request, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03f3115", new Object[]{httpURLConnection, request, str});
        } else if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.e(TAG, "supportHttps", "[supportHttps]Froyo 以下版本不支持https", " bizReqId", request.rs.bizReqId);
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (request.getSslSocketFactory() != null) {
                httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
            } else if (HttpSslUtil.getSSLSocketFactory() != null) {
                httpsURLConnection.setSSLSocketFactory(HttpSslUtil.getSSLSocketFactory());
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "HttpSslUtil", request.getSeq(), "SslSocketFactory", HttpSslUtil.getSSLSocketFactory(), " bizReqId", request.rs.bizReqId);
                }
            }
            if (request.getHostnameVerifier() != null) {
                httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
            } else if (HttpSslUtil.getHostnameVerifier() != null) {
                httpsURLConnection.setHostnameVerifier(HttpSslUtil.getHostnameVerifier());
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "HttpSslUtil", request.getSeq(), "HostnameVerifier", HttpSslUtil.getHostnameVerifier(), " bizReqId", request.rs.bizReqId);
                }
            } else {
                httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: anet.channel.session.HttpConnector.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // javax.net.ssl.HostnameVerifier
                    public boolean verify(String str2, SSLSession sSLSession) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str2, sSLSession})).booleanValue();
                        }
                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02d9 A[Catch: all -> 0x02d5, TryCatch #8 {all -> 0x02d5, blocks: (B:130:0x02d1, B:134:0x02d9, B:135:0x02e8, B:137:0x02f4, B:138:0x0301), top: B:157:0x02d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8 A[Catch: all -> 0x02d5, TryCatch #8 {all -> 0x02d5, blocks: (B:130:0x02d1, B:134:0x02d9, B:135:0x02e8, B:137:0x02f4, B:138:0x0301), top: B:157:0x02d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f4 A[Catch: all -> 0x02d5, TryCatch #8 {all -> 0x02d5, blocks: (B:130:0x02d1, B:134:0x02d9, B:135:0x02e8, B:137:0x02f4, B:138:0x0301), top: B:157:0x02d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0301 A[Catch: all -> 0x02d5, TRY_LEAVE, TryCatch #8 {all -> 0x02d5, blocks: (B:130:0x02d1, B:134:0x02d9, B:135:0x02e8, B:137:0x02f4, B:138:0x0301), top: B:157:0x02d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int parseBody(java.net.HttpURLConnection r22, anet.channel.request.Request r23, anet.channel.session.HttpConnector.Response r24, anet.channel.RequestCb r25, anet.channel.strategy.dispatch.DispatchZstdDictEvent r26, anet.channel.encode.ZstdResponseHelper r27) throws java.io.IOException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.HttpConnector.parseBody(java.net.HttpURLConnection, anet.channel.request.Request, anet.channel.session.HttpConnector$Response, anet.channel.RequestCb, anet.channel.strategy.dispatch.DispatchZstdDictEvent, anet.channel.encode.ZstdResponseHelper):int");
    }

    private static void onException(Request request, Response response, RequestCb requestCb, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9fbb65", new Object[]{request, response, requestCb, new Integer(i), th});
            return;
        }
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.e(TAG, "onException", request.getSeq(), "errorCode", Integer.valueOf(i), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost(), " bizReqId", request.rs.bizReqId);
        if (response != null) {
            response.httpCode = i;
        }
        if (!request.rs.isDone.get()) {
            request.rs.statusCode = i;
            request.rs.msg = errMsg;
            request.rs.rspEnd = System.currentTimeMillis();
            AnalysisFactory.getV3Instance().log(request.rs.span, "netRspRecvEnd", null);
            if (i != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i, errMsg, request.rs, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i, errMsg, request.rs);
        }
    }
}
