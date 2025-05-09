package anet.channel.session.okhttp;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.OkHttpAvailableStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.okhttp.Call;
import com.android.okhttp.Callback;
import com.android.okhttp.Dns;
import com.android.okhttp.Headers;
import com.android.okhttp.MediaType;
import com.android.okhttp.Protocol;
import com.android.okhttp.RequestBody;
import com.android.okhttp.Response;
import com.android.okhttp.ResponseBody;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import tb.h1p;
import tb.t2o;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OkHttpConnector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.OkHttpConnector";
    private static Method builder_addHeader;
    private static Method builder_build;
    private static Constructor builder_constructor;
    private static Method builder_method;
    private static Method builder_url;
    public static Method call_cancel;
    private static Method call_enqueue;
    private static Method call_execute;
    private static Class clazz_OkHttpClient;
    private static Class clazz_Request_Builder;
    private static Method client_newCall;
    private static Method client_setDns;
    private static Method client_setFollowRedirects;
    private static Method client_setProtocols;
    private static Method headers_toMultimap;
    private static Object instance_OkHttpClient;
    private static volatile boolean mAvailable = false;
    private static final AtomicBoolean mChecked = new AtomicBoolean(false);
    private static Method mediaType_parse;
    private static Object protocol_http1;
    private static Object protocol_http2;
    private static Method requestBody_create;
    private static Method request_headers;
    private static Method responseBody_byteStream;
    private static Method response_body;
    private static Method response_code;
    private static Method response_headers;
    private static Method response_protocol;

    static {
        t2o.a(607125739);
    }

    public static /* synthetic */ void access$000(String str) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            doPreBuildConnectionTask(str);
        }
    }

    public static /* synthetic */ void access$100(Request request, RequestCb requestCb, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2011129", new Object[]{request, requestCb, new Integer(i), th});
        } else {
            onException(request, requestCb, i, th);
        }
    }

    public static /* synthetic */ void access$200(Response response, Request request, RequestCb requestCb) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa240409", new Object[]{response, request, requestCb});
        } else {
            handlerResponse(response, request, requestCb);
        }
    }

    public static boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
        }
        return mAvailable;
    }

    public static boolean isOkHttpEnable(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ea40cb4", new Object[]{httpUrl})).booleanValue();
        }
        if (!AwcnConfig.isOkHttpEnable() || !checkEnvAvailable() || httpUrl == null || !AwcnConfig.isInOkhttpWhiteList(httpUrl.host())) {
            return false;
        }
        return true;
    }

    private static void preBuildConnection(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe3889a", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.okhttp.OkHttpConnector.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        OkHttpConnector.access$000(str);
                    } catch (Exception e) {
                        ALog.e(OkHttpConnector.TAG, "[preBuildConnection]error", null, e, new Object[0]);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    public static void preBuildConnections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d5ee51", new Object[0]);
            return;
        }
        List<String> okhttpPreBuildList = AwcnConfig.getOkhttpPreBuildList();
        if (!(okhttpPreBuildList == null || okhttpPreBuildList.isEmpty())) {
            for (String str : okhttpPreBuildList) {
                preBuildConnection(str);
            }
        }
    }

    private static void doPreBuildConnectionTask(String str) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!AwcnConfig.isOkHttpEnable() || !checkEnvAvailable()) {
            ALog.e(TAG, "[preBuildConnection]okhttp disable.", null, new Object[0]);
            return;
        }
        Object newInstance = builder_constructor.newInstance(new Object[0]);
        Method method = builder_url;
        method.invoke(newInstance, h1p.HTTPS_PREFIX + str);
        Response response = (Response) call_execute.invoke((Call) client_newCall.invoke(instance_OkHttpClient, (com.android.okhttp.Request) builder_build.invoke(newInstance, new Object[0])), new Object[0]);
        if (response != null) {
            Integer num = (Integer) response_code.invoke(response, new Object[0]);
            num.intValue();
            ALog.e(TAG, "[preBuildConnection]", null, "host", str, "httpCode", num, "protocol", response_protocol.invoke(response, new Object[0]).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean checkEnvAvailable() {
        if (AwcnConfig.isOkHttpEnable() && mChecked.compareAndSet(false, true)) {
            try {
                Class<?> cls = Class.forName("com.android.okhttp.OkHttpClient");
                clazz_OkHttpClient = cls;
                client_setDns = ReflectUtils.getDeclaredMethod(cls, "setDns", Dns.class);
                client_setProtocols = ReflectUtils.getDeclaredMethod(clazz_OkHttpClient, "setProtocols", List.class);
                client_setFollowRedirects = ReflectUtils.getDeclaredMethod(clazz_OkHttpClient, "setFollowRedirects", Boolean.TYPE);
                protocol_http2 = Class.forName("com.android.okhttp.Protocol").getEnumConstants()[3];
                protocol_http1 = Class.forName("com.android.okhttp.Protocol").getEnumConstants()[1];
                Class<?> cls2 = Class.forName("com.android.okhttp.Request$Builder");
                clazz_Request_Builder = cls2;
                builder_constructor = ReflectUtils.getConstructor(cls2, new Class[0]);
                builder_url = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, "url", String.class);
                builder_addHeader = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, "addHeader", String.class, String.class);
                builder_method = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, "method", String.class, RequestBody.class);
                builder_build = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, CartRecommendRefreshScene.build, new Class[0]);
                request_headers = ReflectUtils.getDeclaredMethod(com.android.okhttp.Request.class, "headers", new Class[0]);
                client_newCall = ReflectUtils.getDeclaredMethod(clazz_OkHttpClient, "newCall", com.android.okhttp.Request.class);
                call_enqueue = ReflectUtils.getDeclaredMethod(Call.class, "enqueue", Callback.class);
                call_cancel = ReflectUtils.getDeclaredMethod(Call.class, "cancel", new Class[0]);
                call_execute = ReflectUtils.getDeclaredMethod(Call.class, xpc.RECORD_EXECUTE, new Class[0]);
                response_code = ReflectUtils.getDeclaredMethod(Response.class, "code", new Class[0]);
                response_protocol = ReflectUtils.getDeclaredMethod(Response.class, "protocol", new Class[0]);
                response_headers = ReflectUtils.getDeclaredMethod(Response.class, "headers", new Class[0]);
                response_body = ReflectUtils.getDeclaredMethod(Response.class, AgooConstants.MESSAGE_BODY, new Class[0]);
                responseBody_byteStream = ReflectUtils.getDeclaredMethod(ResponseBody.class, "byteStream", new Class[0]);
                headers_toMultimap = ReflectUtils.getDeclaredMethod(Headers.class, "toMultimap", new Class[0]);
                mediaType_parse = ReflectUtils.getMethod(MediaType.class, "parse", String.class);
                requestBody_create = ReflectUtils.getMethod(RequestBody.class, "create", MediaType.class, byte[].class);
                Object newInstance = clazz_OkHttpClient.newInstance();
                instance_OkHttpClient = newInstance;
                client_setDns.invoke(newInstance, new OkHttpDnsResolver());
                ArrayList arrayList = new ArrayList();
                arrayList.add((Protocol) protocol_http2);
                arrayList.add((Protocol) protocol_http1);
                client_setProtocols.invoke(instance_OkHttpClient, arrayList);
                client_setFollowRedirects.invoke(instance_OkHttpClient, Boolean.FALSE);
                mAvailable = true;
                ALog.e(TAG, "[checkEnvAvailable success]", null, new Object[0]);
                AppMonitor.getInstance().commitStat(new OkHttpAvailableStat(1));
            } catch (Throwable th) {
                mAvailable = false;
                ALog.e(TAG, "[checkEnvAvailable error]", null, th, new Object[0]);
                OkHttpAvailableStat okHttpAvailableStat = new OkHttpAvailableStat(0);
                okHttpAvailableStat.error = th.getMessage();
                AppMonitor.getInstance().commitStat(okHttpAvailableStat);
            }
        }
        return mAvailable;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(4:(19:36|43|(1:45)|(2:47|48)(1:49)|124|50|118|51|(1:53)(1:54)|55|(2:57|58)(1:64)|65|116|66|67|(1:69)(1:70)|120|71|(2:73|(1:76)))|120|71|(0))|124|50|118|51|(0)(0)|55|(0)(0)|65|116|66|67|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c2, code lost:
        r14 = r1;
        r17 = r6;
        r15 = r7;
        r12 = anet.channel.session.okhttp.OkHttpConnector.TAG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0214, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150 A[Catch: all -> 0x006e, InvocationTargetException -> 0x02eb, IllegalAccessException -> 0x02f3, TryCatch #8 {all -> 0x006e, blocks: (B:3:0x0012, B:5:0x004b, B:7:0x0054, B:11:0x0074, B:22:0x00dd, B:27:0x010c, B:29:0x0110, B:37:0x0122, B:41:0x012c, B:42:0x0133, B:43:0x013b, B:45:0x0150, B:47:0x0156), top: B:125:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156 A[Catch: all -> 0x006e, InvocationTargetException -> 0x02eb, IllegalAccessException -> 0x02f3, TRY_LEAVE, TryCatch #8 {all -> 0x006e, blocks: (B:3:0x0012, B:5:0x004b, B:7:0x0054, B:11:0x0074, B:22:0x00dd, B:27:0x010c, B:29:0x0110, B:37:0x0122, B:41:0x012c, B:42:0x0133, B:43:0x013b, B:45:0x0150, B:47:0x0156), top: B:125:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e A[Catch: all -> 0x01bd, IOException -> 0x01c1, InvocationTargetException -> 0x02eb, IllegalAccessException -> 0x02f3, TRY_LEAVE, TryCatch #3 {IOException -> 0x01c1, blocks: (B:51:0x017a, B:55:0x018c, B:57:0x019e), top: B:118:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3 A[Catch: all -> 0x020f, IOException -> 0x0212, InvocationTargetException -> 0x02eb, IllegalAccessException -> 0x02f3, TryCatch #5 {IOException -> 0x0212, blocks: (B:71:0x01e9, B:73:0x01f3, B:76:0x01fb), top: B:120:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a4 A[Catch: all -> 0x020f, InvocationTargetException -> 0x02eb, IllegalAccessException -> 0x02f3, TRY_ENTER, TryCatch #9 {all -> 0x020f, blocks: (B:66:0x01dd, B:71:0x01e9, B:73:0x01f3, B:76:0x01fb, B:80:0x0216, B:82:0x0248, B:84:0x024e, B:86:0x0254, B:88:0x0259, B:89:0x0260, B:95:0x0271, B:96:0x027a, B:99:0x02a4, B:103:0x02cd), top: B:127:0x00c6 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void handlerResponse(com.android.okhttp.Response r24, anet.channel.request.Request r25, anet.channel.RequestCb r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.okhttp.OkHttpConnector.handlerResponse(com.android.okhttp.Response, anet.channel.request.Request, anet.channel.RequestCb):void");
    }

    public static Cancelable request(final Request request, final RequestCb requestCb, boolean z) throws Throwable {
        char c;
        char c2;
        Object obj;
        int i;
        if (request == null || request.getUrl() == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), new RequestStatistic(null, null));
            }
            return OkHttpCancelable.NULL;
        }
        Object newInstance = builder_constructor.newInstance(new Object[0]);
        builder_url.invoke(newInstance, request.getUrlString());
        ALog.e(TAG, "", request.getSeq(), "request URL", request.getUrlString(), " bizReqId", request.rs.bizReqId);
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder_addHeader.invoke(newInstance, entry.getKey(), entry.getValue());
        }
        String str = headers.get(HttpConstant.HOST);
        if (str == null) {
            str = request.getHost();
        }
        if (request.getHttpUrl().containsNonDefaultPort()) {
            str = StringUtils.concatString(str, ":", String.valueOf(request.getHttpUrl().getPort()));
        }
        builder_addHeader.invoke(newInstance, HttpConstant.HOST, str);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            builder_addHeader.invoke(newInstance, HttpConstant.X_ONLINE_HOST, str);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            builder_addHeader.invoke(newInstance, "Accept-Encoding", "gzip");
        }
        request.rs.sendStart = System.currentTimeMillis();
        RequestStatistic requestStatistic = request.rs;
        requestStatistic.processTime = requestStatistic.sendStart - request.rs.start;
        byte[] bodyBytes = request.getBodyBytes();
        if (bodyBytes != null) {
            int length = bodyBytes.length;
            Method method = mediaType_parse;
            Object[] objArr = {Charset.defaultCharset().toString()};
            Method method2 = requestBody_create;
            Object[] objArr2 = {(MediaType) method.invoke(MediaType.class, objArr), request.getBodyBytes()};
            obj = newInstance;
            builder_method.invoke(obj, request.getMethod(), (RequestBody) method2.invoke(RequestBody.class, objArr2));
            if (request.rs.reqBodyInflateSize <= 0) {
                request.rs.reqBodyInflateSize = length;
            }
            if (request.rs.reqBodyDeflateSize <= 0) {
                request.rs.reqBodyDeflateSize = length;
            }
            request.rs.sendDataSize = length;
            c2 = 0;
            c = 1;
        } else {
            obj = newInstance;
            c2 = 0;
            c = 1;
            builder_method.invoke(obj, request.getMethod(), null);
        }
        String seq = request.getSeq();
        String method3 = request.getMethod();
        String str2 = request.rs.bizReqId;
        Object[] objArr3 = new Object[4];
        objArr3[c2] = "request Method";
        objArr3[c] = method3;
        objArr3[2] = " bizReqId";
        objArr3[3] = str2;
        ALog.e(TAG, "", seq, objArr3);
        request.rs.sendEnd = System.currentTimeMillis();
        RequestStatistic requestStatistic2 = request.rs;
        requestStatistic2.sendDataTime = requestStatistic2.sendEnd - request.rs.sendStart;
        com.android.okhttp.Request request2 = (com.android.okhttp.Request) builder_build.invoke(obj, new Object[0]);
        Map map = (Map) headers_toMultimap.invoke(request_headers.invoke(request2, new Object[0]), new Object[0]);
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "", request.getSeq(), "request headers", map, " bizReqId", request.rs.bizReqId);
        }
        request.rs.reqHeadDeflateSize = map.toString().length();
        RequestStatistic requestStatistic3 = request.rs;
        requestStatistic3.reqHeadInflateSize = requestStatistic3.reqHeadDeflateSize;
        Call call = (Call) client_newCall.invoke(instance_OkHttpClient, request2);
        if (!z) {
            handlerResponse((Response) call_execute.invoke(call, new Object[0]), request, requestCb);
            i = 1;
        } else {
            i = 1;
            call_enqueue.invoke(call, new Callback() { // from class: anet.channel.session.okhttp.OkHttpConnector.2
                public void onFailure(com.android.okhttp.Request request3, IOException iOException) {
                    OkHttpConnector.access$100(Request.this, requestCb, -500, iOException);
                }

                public void onResponse(Response response) throws IOException {
                    try {
                        OkHttpConnector.access$200(response, Request.this, requestCb);
                    } catch (Throwable th) {
                        OkHttpConnector.access$100(Request.this, requestCb, ErrorConstant.ERROR_OKHTTP_RESPONSE_ERROR, th);
                    }
                }
            });
        }
        request.rs.useOkHttp = i;
        return new OkHttpCancelable(call, request.getSeq());
    }

    private static void onException(Request request, RequestCb requestCb, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728949a8", new Object[]{request, requestCb, new Integer(i), th});
            return;
        }
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.e(TAG, "onException", request.getSeq(), "errorCode", Integer.valueOf(i), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost(), th, " bizReqId", request.rs.bizReqId);
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

    /* JADX WARN: Removed duplicated region for block: B:117:0x025a A[Catch: all -> 0x0256, TryCatch #12 {all -> 0x0256, blocks: (B:113:0x0252, B:117:0x025a, B:118:0x0269, B:120:0x0275, B:121:0x0282), top: B:147:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0269 A[Catch: all -> 0x0256, TryCatch #12 {all -> 0x0256, blocks: (B:113:0x0252, B:117:0x025a, B:118:0x0269, B:120:0x0275, B:121:0x0282), top: B:147:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0275 A[Catch: all -> 0x0256, TryCatch #12 {all -> 0x0256, blocks: (B:113:0x0252, B:117:0x025a, B:118:0x0269, B:120:0x0275, B:121:0x0282), top: B:147:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282 A[Catch: all -> 0x0256, TRY_LEAVE, TryCatch #12 {all -> 0x0256, blocks: (B:113:0x0252, B:117:0x025a, B:118:0x0269, B:120:0x0275, B:121:0x0282), top: B:147:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int parseBody(java.io.InputStream r19, anet.channel.request.Request r20, anet.channel.RequestCb r21, java.lang.String r22, java.lang.String r23, int r24, int r25, anet.channel.strategy.dispatch.DispatchZstdDictEvent r26, anet.channel.encode.ZstdResponseHelper r27) throws java.io.IOException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.okhttp.OkHttpConnector.parseBody(java.io.InputStream, anet.channel.request.Request, anet.channel.RequestCb, java.lang.String, java.lang.String, int, int, anet.channel.strategy.dispatch.DispatchZstdDictEvent, anet.channel.encode.ZstdResponseHelper):int");
    }
}
