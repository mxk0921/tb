package com.alipay.mobile.common.rpc;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.rpc.protocol.Deserializer;
import com.alipay.mobile.common.rpc.protocol.Serializer;
import com.alipay.mobile.common.rpc.protocol.json.JsonSerializer;
import com.alipay.mobile.common.rpc.protocol.json.JsonSerializerV2;
import com.alipay.mobile.common.rpc.protocol.json.SignJsonSerializer;
import com.alipay.mobile.common.rpc.protocol.protobuf.PBSerializer;
import com.alipay.mobile.common.rpc.protocol.protobuf.SimpleRpcPBSerializer;
import com.alipay.mobile.common.rpc.protocol.util.RPCProtoDesc;
import com.alipay.mobile.common.rpc.protocol.util.SerializerFactory;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.transport.RpcCaller;
import com.alipay.mobile.common.rpc.transport.http.HttpCaller;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.http.CookieAccessHelper;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.RpcSignUtil;
import com.alipay.mobile.common.transport.zfeatures.ServerTimeManager;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipay.mobile.framework.service.common.impl.RpcInterceptorManager;
import com.alipay.mobile.framework.service.ext.annotation.CheckLogin;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RpcFactory b;
    public SerializerFactory serializerFactory;
    public static final ThreadLocal<Object> c = new ThreadLocal<>();
    public static final ThreadLocal<Map<String, Object>> EXT_PARAM = new ThreadLocal<>();
    public static final AtomicReference<String> d = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public byte f4033a = 0;
    public AtomicInteger rpcSequence = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Handle {
        boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation);
    }

    public RpcInvoker(RpcFactory rpcFactory) {
        this.b = rpcFactory;
        this.serializerFactory = new SerializerFactory(rpcFactory);
    }

    public static /* synthetic */ RpcFactory access$000(RpcInvoker rpcInvoker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcFactory) ipChange.ipc$dispatch("6170b2f1", new Object[]{rpcInvoker});
        }
        return rpcInvoker.b;
    }

    public static /* synthetic */ ThreadLocal access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("d5dd74fc", new Object[0]);
        }
        return c;
    }

    public static void addProtocolArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7049def1", new Object[]{str, str2});
            return;
        }
        ThreadLocal<Map<String, Object>> threadLocal = EXT_PARAM;
        if (threadLocal.get() == null) {
            threadLocal.set(new HashMap());
        }
        threadLocal.get().put(str, str2);
    }

    public static boolean checkMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2e58f56", new Object[0])).booleanValue();
        }
        if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        return true;
    }

    public static boolean h(RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9a2645b", new Object[]{rpcException})).booleanValue();
        }
        if (rpcException.getCode() == 10 || rpcException.getCode() == 20 || rpcException.getCode() == 9 || rpcException.getCode() == 13 || rpcException.getCode() == 2 || rpcException.getCode() == 1 || rpcException.getCode() == 15 || rpcException.getCode() == 4 || rpcException.getCode() == 5 || rpcException.isServerError()) {
            return true;
        }
        return false;
    }

    public static boolean perfLog(RpcException rpcException, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccfd9a6b", new Object[]{rpcException, str})).booleanValue();
        }
        try {
            if (!h(rpcException)) {
                return false;
            }
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            monitorLoggerModel.setParam1("RPC_ERROR");
            monitorLoggerModel.setParam2("FATAL");
            monitorLoggerModel.setParam3("-");
            monitorLoggerModel.getExtPramas().put("ERR_CODE", String.valueOf(rpcException.getCode()));
            monitorLoggerModel.getExtPramas().put("ERR_MSG", MiscUtils.getRootCause(rpcException).toString());
            monitorLoggerModel.getExtPramas().put("API", str);
            LogCatUtil.debug("RpcInvoker", monitorLoggerModel.toString());
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInvoker", "[perfLog] Exception: " + th.toString(), th);
            return false;
        }
    }

    public void asyncNotifyRpcHeaderUpdateEvent(final Method method, final Object[] objArr, final HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c4c3ee", new Object[]{this, method, objArr, httpUrlResponse});
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.rpc.RpcInvoker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RpcHeader rpcHeader = new RpcHeader();
                    rpcHeader.operationType = RpcInvokerUtil.getOperationTypeValue(method, objArr);
                    rpcHeader.httpUrlHeader = httpUrlResponse.getHeader();
                    RpcInvoker.access$000(RpcInvoker.this).notifyRpcHeaderUpdateEvent(rpcHeader);
                }
            });
        }
    }

    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.f4033a = (byte) 1;
        }
    }

    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this});
        }
        this.f4033a = (byte) 0;
        return null;
    }

    public final Object c(Method method, Response response, RPCProtoDesc rPCProtoDesc, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8fa8e2a4", new Object[]{this, method, response, rPCProtoDesc, objArr});
        }
        Type genericReturnType = method.getGenericReturnType();
        Deserializer deserializer = this.serializerFactory.getDeserializer(genericReturnType, response, rPCProtoDesc);
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        MonitorInfoUtil.startLinkRecordPhase(operationTypeValue, "data_deserialize", null);
        try {
            Object parser = deserializer.parser();
            if (genericReturnType != Void.TYPE) {
                c.set(parser);
            }
            return parser;
        } finally {
            MonitorInfoUtil.endLinkRecordPhase(operationTypeValue, "data_deserialize", null);
        }
    }

    public final void d(Method method, Serializer serializer, RpcCaller rpcCaller, String str, byte[] bArr, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2703d041", new Object[]{this, method, serializer, rpcCaller, str, bArr, innerRpcInvokeContext});
        } else if (rpcCaller instanceof HttpCaller) {
            HttpCaller httpCaller = (HttpCaller) rpcCaller;
            boolean z = serializer instanceof SignJsonSerializer;
            if (z || TextUtils.equals(serializer.getClass().getName(), JsonSerializer.class.getName())) {
                if (z) {
                    SignJsonSerializer signJsonSerializer = (SignJsonSerializer) serializer;
                    httpCaller.setReqDataDigest(signJsonSerializer.getRequestDataDigest());
                    httpCaller.setSignData(signJsonSerializer.getSignData());
                } else {
                    httpCaller.setReqDataDigest(((JsonSerializer) serializer).getRequestDataDigest());
                }
                httpCaller.setContentType(HeaderConstant.HEADER_VALUE_OLD_TYPE);
                httpCaller.setRpcVersion("1");
                return;
            }
            if (serializer instanceof JsonSerializerV2) {
                httpCaller.setReqDataDigest(((JsonSerializerV2) serializer).getRequestDataDigest());
                httpCaller.setContentType("application/json");
            } else if (serializer instanceof SimpleRpcPBSerializer) {
                httpCaller.setContentType(HeaderConstant.HEADER_VALUE_PB_TYPE);
                httpCaller.setReqDataDigest(((SimpleRpcPBSerializer) serializer).getRequestDataDigest());
            } else if (serializer instanceof PBSerializer) {
                httpCaller.setContentType(HeaderConstant.HEADER_VALUE_PB_TYPE);
                httpCaller.setReqDataDigest(((PBSerializer) serializer).getRequestDataDigest());
            }
            httpCaller.setExtObjectParam(EXT_PARAM.get());
            httpCaller.setRpcVersion("2");
            httpCaller.setScene(getScene());
            g(method, str, bArr, innerRpcInvokeContext, httpCaller);
        }
    }

    public final void e(Method method, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1c2c15", new Object[]{this, method, innerRpcInvokeContext});
            return;
        }
        try {
            OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
            if (operationType != null && TransportStrategy.isAlipayUrl(innerRpcInvokeContext.gwUrl) && !innerRpcInvokeContext.bgRpc.booleanValue() && ((CheckLogin) method.getAnnotation(CheckLogin.class)) != null && ((com.alipay.mobile.framework.service.annotation.CheckLogin) method.getAnnotation(com.alipay.mobile.framework.service.annotation.CheckLogin.class)) != null) {
                String cookie = CookieAccessHelper.getCookie(innerRpcInvokeContext.gwUrl, getRpcFactory().getContext());
                if (TextUtils.isEmpty(cookie)) {
                    LogCatUtil.warn("RpcInvoker", "CheckLogin_prejudge: cookie is empty  API=[" + operationType.value() + "]");
                    throw new RpcException((Integer) 2000, "登录超时，请重新登录:登录超时，请重新登录");
                } else if (!cookie.contains("ALIPAYJSESSIONID")) {
                    LogCatUtil.warn("RpcInvoker", "CheckLogin_prejudge: cookie not contains ALIPAYJSESSIONID!  API=[" + operationType.value() + "]");
                    throw new RpcException((Integer) 2000, "登录超时，请重新登录:登录超时，请重新登录");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Finally extract failed */
    public void exceptionHandle(final Object obj, final byte[] bArr, final Class<?> cls, final Method method, final Object[] objArr, Annotation[] annotationArr, final RpcException rpcException, InnerRpcInvokeContext innerRpcInvokeContext, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bbe9be", new Object[]{this, obj, bArr, cls, method, objArr, annotationArr, rpcException, innerRpcInvokeContext, new Long(j)});
            return;
        }
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        MonitorInfoUtil.startLinkRecordPhase(operationTypeValue, "exceptionHandle", null);
        try {
            boolean i = i(annotationArr, new Handle() { // from class: com.alipay.mobile.common.rpc.RpcInvoker.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.rpc.RpcInvoker.Handle
                public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("475047f0", new Object[]{this, rpcInterceptor, annotation})).booleanValue();
                    }
                    LogCatUtil.info("RpcInvoker", " Start execute exceptionHandle. rpcInterceptor is ".concat(rpcInterceptor.getClass().getName()));
                    if (rpcInterceptor.exceptionHandle(obj, RpcInvoker.access$100(), bArr, cls, method, objArr, rpcException, annotation)) {
                        LogCatUtil.error("RpcInvoker", rpcException + " need throw exception");
                        return true;
                    }
                    LogCatUtil.error("RpcInvoker", rpcException + " need not throw exception");
                    return false;
                }
            });
            if (i) {
                i = RpcInterceptorManager.getInstance().exceptionHandle(obj, c, bArr, cls, method, objArr, rpcException);
            }
            if (!i) {
                MonitorInfoUtil.endLinkRecordPhase(operationTypeValue, "exceptionHandle", null);
            } else {
                printAllTimeLog(method, RpcInvokerUtil.getOperationTypeValue(method, objArr), j);
                throw rpcException;
            }
        } catch (Throwable th) {
            MonitorInfoUtil.endLinkRecordPhase(operationTypeValue, "exceptionHandle", null);
            throw th;
        }
    }

    public final void f(Method method, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6dbd6c", new Object[]{this, method, obj});
        } else if (!MiscUtils.isDebugger(getRpcFactory().getContext())) {
        } else {
            if (obj != null) {
                LogCatUtil.printInfo("RpcInvoker", "ThreadId=[" + Thread.currentThread().getId() + "] methodName=[" + method.getName() + "] returnObj=[" + JSON.toJSONString(obj) + "]");
                return;
            }
            LogCatUtil.printInfo("RpcInvoker", "ThreadId=[" + Thread.currentThread().getId() + "] methodName=[" + method.getName() + "] returnObj=[ is null ]");
        }
    }

    public final void g(Method method, String str, byte[] bArr, InnerRpcInvokeContext innerRpcInvokeContext, HttpCaller httpCaller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86ab3b9", new Object[]{this, method, str, bArr, innerRpcInvokeContext, httpCaller});
            return;
        }
        String str2 = ServerTimeManager.getInstance().get64HexCurrentTimeMillis();
        httpCaller.setTimeStamp(str2);
        if (!isNeedSign(method, innerRpcInvokeContext)) {
            httpCaller.setNeedSign(false);
            return;
        }
        int[] iArr = {0};
        httpCaller.setSignData(b(str, bArr, str2, innerRpcInvokeContext, iArr));
        httpCaller.setSignCost(iArr[0]);
        httpCaller.setNeedSign(true);
    }

    public RpcFactory getRpcFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcFactory) ipChange.ipc$dispatch("b9e63536", new Object[]{this});
        }
        return this.b;
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return d.get();
    }

    public Serializer getSerializer(Method method, Object[] objArr, String str, int i, InnerRpcInvokeContext innerRpcInvokeContext, RPCProtoDesc rPCProtoDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializer) ipChange.ipc$dispatch("43521d99", new Object[]{this, method, objArr, str, new Integer(i), innerRpcInvokeContext, rPCProtoDesc});
        }
        return this.serializerFactory.getSerializer(i, str, method, objArr, getScene(), innerRpcInvokeContext, rPCProtoDesc);
    }

    public SerializerFactory getSerializerFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SerializerFactory) ipChange.ipc$dispatch("f68f8ef2", new Object[]{this});
        }
        return this.serializerFactory;
    }

    public void printAllTimeLog(Method method, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad2c68", new Object[]{this, method, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        LogCatUtil.debug("RpcInvoker", "ThreadId=[" + Thread.currentThread().getId() + "] methodName=[" + method.getName() + "] API=[" + str + "] invokeTiming=[" + currentTimeMillis + "]");
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            d.set(str);
        }
    }

    public static boolean isNeedSign(Method method, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4cb075", new Object[]{method, innerRpcInvokeContext})).booleanValue();
        }
        Boolean bool = innerRpcInvokeContext.needSignature;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            LogCatUtil.info("RpcInvoker", "[isNeedSign] needSignature = " + booleanValue);
            return booleanValue;
        }
        SignCheck signCheck = (SignCheck) method.getAnnotation(SignCheck.class);
        if (signCheck == null) {
            return true;
        }
        return !TextUtils.equals(signCheck.value(), "no");
    }

    public final RpcSignUtil.SignData b(String str, byte[] bArr, String str2, InnerRpcInvokeContext innerRpcInvokeContext, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcSignUtil.SignData) ipChange.ipc$dispatch("48890f4e", new Object[]{this, str, bArr, str2, innerRpcInvokeContext, iArr});
        }
        StringBuffer stringBuffer = new StringBuffer("Operation-Type=");
        stringBuffer.append(str);
        stringBuffer.append("&Request-Data=");
        stringBuffer.append(Base64.encodeToString(bArr, 2));
        stringBuffer.append("&Ts=");
        stringBuffer.append(str2);
        String stringBuffer2 = stringBuffer.toString();
        if (MiscUtils.isDebugger(getRpcFactory().getContext())) {
            LogCatUtil.debug("RpcInvoker", "[getSignData] sign content: " + stringBuffer2);
        }
        boolean isAlipayGW = MiscUtils.isAlipayGW(innerRpcInvokeContext.gwUrl);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MonitorInfoUtil.startLinkRecordPhase(str, "sign", null);
        try {
            return RpcSignUtil.signature(this.b.getContext(), innerRpcInvokeContext.appKey, isReq2Online(innerRpcInvokeContext), stringBuffer2, isAlipayGW);
        } finally {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            iArr[0] = (int) elapsedRealtime2;
            LogCatUtil.debug("RpcInvoker", "[getSignData] sign time = " + elapsedRealtime2 + "ms. ");
            MonitorInfoUtil.endLinkRecordPhase(str, "sign", null);
        }
    }

    public final boolean i(Annotation[] annotationArr, Handle handle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9650ded", new Object[]{this, annotationArr, handle})).booleanValue();
        }
        try {
            boolean z = true;
            for (Annotation annotation : annotationArr) {
                RpcInterceptor findRpcInterceptor = this.b.findRpcInterceptor(annotation.annotationType());
                if (findRpcInterceptor != null && !(z = handle.handle(findRpcInterceptor, annotation))) {
                    break;
                }
            }
            return z;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInvoker", "handleAnnotations ex:" + th.toString());
            if (th instanceof RpcException) {
                throw th;
            }
            throw new RpcException((Integer) 9, (Throwable) th);
        }
    }

    public boolean isReq2Online(InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca53c21", new Object[]{this, innerRpcInvokeContext})).booleanValue();
        }
        if (TextUtils.isEmpty(innerRpcInvokeContext.gwUrl)) {
            LogCatUtil.warn("RpcInvoker", "handler.getConfig().getUrl() is null");
            return false;
        }
        try {
            URL url = new URL(innerRpcInvokeContext.gwUrl);
            if (url.getHost().contains("mobilegw") && url.getHost().contains("alipay")) {
                return url.getHost().lastIndexOf("alipay.com") != -1;
            }
        } catch (MalformedURLException e) {
            LogCatUtil.warn("RpcInvoker", e);
        }
        return false;
    }

    public void preHandle(final Object obj, final Class<?> cls, final Method method, final Object[] objArr, Annotation[] annotationArr, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9329b50", new Object[]{this, obj, cls, method, objArr, annotationArr, innerRpcInvokeContext});
            return;
        }
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        MonitorInfoUtil.startLinkRecordPhase(operationTypeValue, "preHandle", null);
        try {
            i(annotationArr, new Handle() { // from class: com.alipay.mobile.common.rpc.RpcInvoker.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.rpc.RpcInvoker.Handle
                public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("475047f0", new Object[]{this, rpcInterceptor, annotation})).booleanValue();
                    }
                    LogCatUtil.info("RpcInvoker", " Start execute preHandle. rpcInterceptor is ".concat(rpcInterceptor.getClass().getName()));
                    if (rpcInterceptor.preHandle(obj, RpcInvoker.access$100(), new byte[0], cls, method, objArr, annotation, RpcInvoker.EXT_PARAM)) {
                        return true;
                    }
                    throw new RpcException((Integer) 9, rpcInterceptor + "preHandle stop this call.");
                }
            });
            ThreadLocal<Map<String, Object>> threadLocal = EXT_PARAM;
            ThreadLocal<Object> threadLocal2 = c;
            RpcInvokerUtil.preHandleForBizInterceptor(obj, cls, method, objArr, innerRpcInvokeContext, threadLocal, threadLocal2);
            RpcInterceptorManager.getInstance().preHandle(obj, threadLocal2, new byte[0], cls, method, objArr, threadLocal);
        } finally {
            MonitorInfoUtil.endLinkRecordPhase(operationTypeValue, "preHandle", null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152  */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Object r22, java.lang.Class<?> r23, java.lang.reflect.Method r24, java.lang.Object[] r25, com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext r26) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.rpc.RpcInvoker.invoke(java.lang.Object, java.lang.Class, java.lang.reflect.Method, java.lang.Object[], com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext):java.lang.Object");
    }

    public void postHandle(final Object obj, final byte[] bArr, final Class<?> cls, final Method method, final Object[] objArr, Annotation[] annotationArr, InnerRpcInvokeContext innerRpcInvokeContext) {
        Map map;
        String str;
        String str2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e92d4", new Object[]{this, obj, bArr, cls, method, objArr, annotationArr, innerRpcInvokeContext});
            return;
        }
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        MonitorInfoUtil.startLinkRecordPhase(operationTypeValue, "postHandle", null);
        try {
            i(annotationArr, new Handle() { // from class: com.alipay.mobile.common.rpc.RpcInvoker.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.rpc.RpcInvoker.Handle
                public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("475047f0", new Object[]{this, rpcInterceptor, annotation})).booleanValue();
                    }
                    LogCatUtil.info("RpcInvoker", " Start execute postHandle. rpcInterceptor is ".concat(rpcInterceptor.getClass().getName()));
                    if (rpcInterceptor.postHandle(obj, RpcInvoker.access$100(), bArr, cls, method, objArr, annotation)) {
                        return true;
                    }
                    throw new RpcException((Integer) 9, rpcInterceptor + "postHandle stop this call.");
                }
            });
            ThreadLocal<Object> threadLocal = c;
            try {
                RpcInvokerUtil.postHandleForBizInterceptor(obj, bArr, cls, method, objArr, annotationArr, innerRpcInvokeContext, threadLocal);
                str2 = operationTypeValue;
                str = "postHandle";
                map = null;
                try {
                    RpcInterceptorManager.getInstance().postHandle(obj, threadLocal, bArr, cls, method, objArr);
                    MonitorInfoUtil.endLinkRecordPhase(str2, str, null);
                    RpcInvokerUtil.postHandleForPacketSize(method, objArr, innerRpcInvokeContext);
                } catch (Throwable th2) {
                    th = th2;
                    MonitorInfoUtil.endLinkRecordPhase(str2, str, map);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = operationTypeValue;
                str = "postHandle";
                map = null;
            }
        } catch (Throwable th4) {
            th = th4;
            str2 = operationTypeValue;
            map = null;
            str = "postHandle";
        }
    }

    public final Response a(Method method, Object[] objArr, String str, int i, InnerRpcInvokeContext innerRpcInvokeContext, RPCProtoDesc rPCProtoDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("be38659e", new Object[]{this, method, objArr, str, new Integer(i), innerRpcInvokeContext, rPCProtoDesc});
        }
        e(method, innerRpcInvokeContext);
        Serializer serializer = getSerializer(method, objArr, str, i, innerRpcInvokeContext, rPCProtoDesc);
        LogCatUtil.verbose("RpcInvoker", "operationType=" + str + ",serializerClass=" + serializer.getClass().getName());
        ThreadLocal<Map<String, Object>> threadLocal = EXT_PARAM;
        if (threadLocal.get() != null) {
            serializer.setExtParam(threadLocal.get());
        }
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        MonitorInfoUtil.startLinkRecordPhase(operationTypeValue, "data_serialize", null);
        try {
            byte[] packet = serializer.packet();
            if (packet != null) {
                HttpCaller httpCaller = new HttpCaller(this.b.getConfig(), method, i, str, packet, this.serializerFactory.getContentType(rPCProtoDesc), this.b.getContext(), innerRpcInvokeContext);
                d(method, serializer, httpCaller, str, packet, innerRpcInvokeContext);
                Response response = (Response) httpCaller.call();
                threadLocal.set(null);
                LogCatUtil.verbose("RpcInvoker", " operationType = " + str);
                return response;
            }
            throw new RpcException((Integer) 20, "Client serializer error. operation type = " + operationTypeValue);
        } finally {
            MonitorInfoUtil.endLinkRecordPhase(operationTypeValue, "data_serialize", null);
        }
    }
}
