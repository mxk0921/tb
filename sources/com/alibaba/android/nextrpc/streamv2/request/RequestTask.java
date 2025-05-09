package com.alibaba.android.nextrpc.streamv2.request;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.a07;
import tb.a3o;
import tb.acl;
import tb.bh1;
import tb.ckf;
import tb.dh1;
import tb.fj9;
import tb.k7j;
import tb.l7j;
import tb.m7j;
import tb.mjd;
import tb.n9u;
import tb.q3o;
import tb.r5o;
import tb.szh;
import tb.xpc;
import tb.z0i;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 F2\u00020\u0001:\u0001GB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014J3\u0010#\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J+\u0010'\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010=\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010E¨\u0006H"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/RequestTask;", "Lcom/taobao/tao/stream/IMtopStreamListener;", "Ltb/a3o;", "request", "Ltb/q3o;", "requestClient", "Ltb/r5o;", "resultCallback", "Ltb/mjd;", "requestAspect", "<init>", "(Ltb/a3o;Ltb/q3o;Ltb/r5o;Ltb/mjd;)V", "", "isSuccess", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;", "errorType", "Ltb/xhv;", "requestFinish", "(ZLcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;)V", "handleTimeout", "()V", xpc.RECORD_EXECUTE, "Ltb/dh1;", "attachedResponse", "receiveAttachedResponse", "(Ltb/dh1;)V", "cancel", "Ltb/m7j;", "mtopStreamResponse", "Lmtopsdk/mtop/domain/BaseOutDo;", "baseOutDo", "", "requestType", "", "requestContext", "onReceiveData", "(Ltb/m7j;Lmtopsdk/mtop/domain/BaseOutDo;ILjava/lang/Object;)V", "Ltb/k7j;", "mtopStreamErrorEvent", "onError", "(Ltb/k7j;ILjava/lang/Object;)V", "Ltb/l7j;", "mtopStreamFinishEvent", "onFinish", "(Ltb/l7j;ILjava/lang/Object;)V", "Ltb/bh1;", "attachedQueue", "Ltb/bh1;", "nextrpcTimeout", TLogTracker.LEVEL_INFO, "Landroid/os/Handler;", "asyncHandler", "Landroid/os/Handler;", "isMainRemoteResponsed", "Z", "Ljava/util/concurrent/atomic/AtomicInteger;", "mainResponseSeqNum", "Ljava/util/concurrent/atomic/AtomicInteger;", "errorStreamResponse", "Ltb/m7j;", "isRequestFinished", "isFixedTaskDeadlock", "Ltb/a3o;", "getRequest", "()Ltb/a3o;", "Ltb/q3o;", "getRequestClient", "()Ltb/q3o;", "Ltb/r5o;", "Ltb/mjd;", "Companion", "a", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class RequestTask implements IMtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String RequestHeaderRequestId = "nextrpc-req-id";
    private static final Looper sAsyncLooper;
    private final Handler asyncHandler;
    private final bh1 attachedQueue = new bh1();
    private m7j errorStreamResponse;
    private final boolean isFixedTaskDeadlock;
    private volatile boolean isMainRemoteResponsed;
    private volatile boolean isRequestFinished;
    private volatile AtomicInteger mainResponseSeqNum;
    private final int nextrpcTimeout;
    private final a3o request;
    private final mjd requestAspect;
    private final q3o requestClient;
    private final r5o resultCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static final /* synthetic */ Looper a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Looper) ipChange.ipc$dispatch("5ce239fb", new Object[]{aVar});
            }
            return aVar.b();
        }

        public final Looper b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Looper) ipChange.ipc$dispatch("7fdb4d13", new Object[]{this});
            }
            HandlerThread handlerThread = new HandlerThread("NextRPCStreamV2");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            ckf.f(looper, "handlerThread.looper");
            return looper;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RequestTask.this.getRequest().c().cancelRequest();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (RequestTask.access$isMainRemoteResponsed$p(RequestTask.this)) {
                RequestTask.access$requestFinish(RequestTask.this, false, FinishErrorType.TIMEOUT);
                RequestTask.access$getRequestAspect$p(RequestTask.this).onTimeout();
            } else {
                RequestTask.access$handleTimeout(RequestTask.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ fj9 b;

        public d(fj9 fj9Var) {
            this.b = fj9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RequestTask.access$getRequestAspect$p(RequestTask.this).a(this.b, true);
            }
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        sAsyncLooper = a.a(aVar);
    }

    public RequestTask(a3o a3oVar, q3o q3oVar, r5o r5oVar, mjd mjdVar) {
        ckf.g(a3oVar, "request");
        ckf.g(q3oVar, "requestClient");
        ckf.g(r5oVar, "resultCallback");
        ckf.g(mjdVar, "requestAspect");
        this.request = a3oVar;
        this.requestClient = q3oVar;
        this.resultCallback = r5oVar;
        this.requestAspect = mjdVar;
        this.nextrpcTimeout = a3oVar.a() > 0 ? a3oVar.a() : 30000;
        this.asyncHandler = new Handler(sAsyncLooper);
        this.mainResponseSeqNum = new AtomicInteger();
        this.isFixedTaskDeadlock = acl.c();
    }

    public static final /* synthetic */ mjd access$getRequestAspect$p(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mjd) ipChange.ipc$dispatch("245b58d1", new Object[]{requestTask});
        }
        return requestTask.requestAspect;
    }

    public static final /* synthetic */ void access$handleTimeout(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c13d0", new Object[]{requestTask});
        } else {
            requestTask.handleTimeout();
        }
    }

    public static final /* synthetic */ boolean access$isMainRemoteResponsed$p(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b40c5161", new Object[]{requestTask})).booleanValue();
        }
        return requestTask.isMainRemoteResponsed;
    }

    public static final /* synthetic */ void access$requestFinish(RequestTask requestTask, boolean z, FinishErrorType finishErrorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c914e470", new Object[]{requestTask, new Boolean(z), finishErrorType});
        } else {
            requestTask.requestFinish(z, finishErrorType);
        }
    }

    public static final /* synthetic */ void access$setMainRemoteResponsed$p(RequestTask requestTask, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2389cf", new Object[]{requestTask, new Boolean(z)});
        } else {
            requestTask.isMainRemoteResponsed = z;
        }
    }

    private final void handleTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a58a20", new Object[]{this});
        } else {
            this.asyncHandler.postDelayed(new c(), this.nextrpcTimeout);
        }
    }

    private final synchronized void requestFinish(boolean z, FinishErrorType finishErrorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3170f6e0", new Object[]{this, new Boolean(z), finishErrorType});
            return;
        }
        if (this.isFixedTaskDeadlock) {
            if (!this.isRequestFinished) {
                fj9 fj9Var = new fj9(z, finishErrorType, this.request);
                this.resultCallback.b(fj9Var);
                this.asyncHandler.removeCallbacksAndMessages(null);
                this.asyncHandler.post(new d(fj9Var));
                this.isRequestFinished = true;
            }
        } else if (this.requestClient.f(this.request)) {
            this.requestClient.g(this.request);
            fj9 fj9Var2 = new fj9(z, finishErrorType, this.request);
            this.resultCallback.b(fj9Var2);
            this.asyncHandler.removeCallbacksAndMessages(null);
            this.requestAspect.a(fj9Var2, false);
        }
    }

    public final synchronized void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        requestFinish(false, FinishErrorType.CANCEL);
        this.asyncHandler.post(new b());
    }

    public final a3o getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a3o) ipChange.ipc$dispatch("bffc8eb", new Object[]{this});
        }
        return this.request;
    }

    public final q3o getRequestClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3o) ipChange.ipc$dispatch("9bdf2fd5", new Object[]{this});
        }
        return this.requestClient;
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public synchronized void onError(k7j k7jVar, int i, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
            return;
        }
        m7j m7jVar = this.errorStreamResponse;
        if (m7jVar == null || (str = m7jVar.f23820a) == null) {
            str = "";
        }
        if (m7jVar == null || (str2 = m7jVar.b) == null) {
            str2 = "";
        }
        boolean b2 = acl.b(this.requestClient.e());
        if (!b2 || k7jVar == null || (str7 = k7jVar.b) == null) {
            str3 = str;
        } else {
            str3 = str7;
        }
        if (!b2 || k7jVar == null || (str6 = k7jVar.c) == null) {
            str4 = str2;
        } else {
            str4 = str6;
        }
        this.isMainRemoteResponsed = true;
        int incrementAndGet = this.mainResponseSeqNum.incrementAndGet();
        if (k7jVar != null) {
            i2 = k7jVar.f;
        } else {
            i2 = 0;
        }
        if (k7jVar == null || (str5 = k7jVar.e) == null) {
            str5 = "";
        }
        this.resultCallback.c(new szh(incrementAndGet, str3, str4, i2, str5));
        requestFinish(false, FinishErrorType.MTOP_FAILURE);
        this.requestAspect.f(k7jVar);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public synchronized void onFinish(l7j l7jVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
            return;
        }
        this.isMainRemoteResponsed = true;
        if (this.attachedQueue.a()) {
            requestFinish(true, FinishErrorType.FINISH_NONE);
        }
        this.requestAspect.b(l7jVar);
    }

    public final synchronized void receiveAttachedResponse(dh1 dh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3dfe00", new Object[]{this, dh1Var});
            return;
        }
        ckf.g(dh1Var, "attachedResponse");
        n9u n9uVar = n9u.INSTANCE;
        TraceName traceName = TraceName.NEXTRPC_QUEUE_ATTACHED_RESPONSE;
        n9uVar.a(traceName);
        List<dh1> b2 = this.attachedQueue.b(dh1Var);
        n9uVar.b(traceName);
        if (this.isMainRemoteResponsed) {
            if (!b2.isEmpty()) {
                TraceName traceName2 = TraceName.NEXTRPC_RESULT_ATTACHED_RESPONSE;
                n9uVar.a(traceName2);
                this.resultCallback.e(b2, this.attachedQueue.a());
                n9uVar.b(traceName2);
            }
            if (this.attachedQueue.a()) {
                requestFinish(true, FinishErrorType.FINISH_NONE);
            }
            this.requestAspect.d(dh1Var.e(), dh1Var.c());
        }
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public synchronized void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
            return;
        }
        ckf.g(m7jVar, "mtopStreamResponse");
        this.request.e().d(this.mainResponseSeqNum.get() + 1);
        this.isMainRemoteResponsed = true;
        n9u n9uVar = n9u.INSTANCE;
        TraceName traceName = TraceName.NEXTRPC_CREATE_MAIN_RESPONSE;
        n9uVar.a(traceName);
        z0i z0iVar = new z0i(m7jVar, this.request);
        n9uVar.b(traceName);
        if (!z0iVar.j()) {
            this.errorStreamResponse = m7jVar;
            return;
        }
        z0iVar.m(this.mainResponseSeqNum.incrementAndGet());
        TraceName traceName2 = TraceName.NEXTRPC_QUEUE_MAIN_RESPONSE;
        n9uVar.a(traceName2);
        List<dh1> c2 = this.attachedQueue.c(z0iVar);
        n9uVar.b(traceName2);
        TraceName traceName3 = TraceName.NEXTRPC_RESULT_MAIN_RESPONSE;
        n9uVar.a(traceName3);
        boolean a2 = this.attachedQueue.a();
        this.resultCallback.a(z0iVar, c2, a2);
        n9uVar.b(traceName3);
        this.requestAspect.c(z0iVar, a2);
    }

    public final synchronized void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            n9u n9uVar = n9u.INSTANCE;
            TraceName traceName = TraceName.NEXTRPC_EXECUTE_TASK;
            n9uVar.a(traceName);
            this.resultCallback.d(this.request);
            if (this.nextrpcTimeout < this.request.c().mtopProp.connTimeout) {
                this.request.c().setConnectionTimeoutMilliSecond(this.nextrpcTimeout);
            }
            Map<String, String> requestHeaders = this.request.c().mtopProp.getRequestHeaders();
            if (requestHeaders == null) {
                requestHeaders = new LinkedHashMap<>();
            }
            requestHeaders.put("nextrpc-req-id", this.request.f());
            this.request.c().mtopProp.setRequestHeaders(requestHeaders);
            this.request.c().allowParseJson(false);
            this.request.c().allowSwitchToPOST(true);
            this.request.c().handler(this.asyncHandler);
            this.request.c().streamMode(true);
            this.request.e().e();
            TraceName traceName2 = TraceName.NEXTRPC_SEND_MTOP;
            n9uVar.a(traceName2);
            this.request.c().addListener((MtopListener) this).startRequest();
            n9uVar.b(traceName2);
            handleTimeout();
            this.requestAspect.a(this.request);
            n9uVar.b(traceName);
        } catch (Exception e) {
            UnifyLog.d("NextRPC", "RequestTask execute error msg=" + e.getMessage(), new Object[0]);
            n9u.INSTANCE.b(TraceName.NEXTRPC_EXECUTE_TASK);
        }
    }
}
