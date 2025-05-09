package com.taobao.android.ultron.datamodel.imp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b3k;
import tb.cw6;
import tb.eq6;
import tb.fsb;
import tb.hav;
import tb.kjf;
import tb.o0d;
import tb.o1n;
import tb.pav;
import tb.q9v;
import tb.t2o;
import tb.u55;
import tb.ux;
import tb.v55;
import tb.v9v;
import tb.vuv;
import tb.vxu;
import tb.w55;
import tb.x2k;
import tb.x55;
import tb.xav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NextRpcRequester implements o0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";
    public static final int INVALID_BIZID = -1;
    public static final String KEY_IS_CACHE_DATA = "isCachaData";
    public static final String KEY_SP_FILE_NAME = "ultornSdkSpName";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USER_NAME = "userName";
    public static String z;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9859a;
    public final MtopRequest b;
    public final fsb c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final int i;
    public final boolean j;
    public final Map<String, String> k;
    public final IDMComponent l;
    public Map<String, String> m;
    public final String n;
    public final String o;
    public final String p;
    public final Context q;
    public final boolean r;
    public final double s;
    public final NextRpcAttachedResponseStrategy t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public ThreadPoolExecutor x;
    public final NextRpcRequest y;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.ultron.datamodel.imp.NextRpcRequester$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AnonymousClass1 implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                UnifyLog.k(NextRpcRequester.this.n, "NextRpcRequester", "uploadDataForTest onError", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse != null) {
                UnifyLog.k(NextRpcRequester.this.n, "NextRpcRequester", "uploadDataForTest onSuccess", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.NET_RESPONSE, new String[0]);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                UnifyLog.k(NextRpcRequester.this.n, "NextRpcRequester", "uploadDataForTest onSystemError", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum NextRpcAttachedResponseStrategy {
        IMMEDIATELY,
        FULL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NextRpcAttachedResponseStrategy nextRpcAttachedResponseStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/NextRpcRequester$NextRpcAttachedResponseStrategy");
        }

        public static NextRpcAttachedResponseStrategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NextRpcAttachedResponseStrategy) ipChange.ipc$dispatch("d69c8e61", new Object[]{str});
            }
            return (NextRpcAttachedResponseStrategy) Enum.valueOf(NextRpcAttachedResponseStrategy.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/NextRpcRequester$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                NextRpcRequester nextRpcRequester = NextRpcRequester.this;
                xav.d(nextRpcRequester.q, nextRpcRequester.n);
                return null;
            } catch (Throwable th) {
                UnifyLog.m(NextRpcRequester.this.c.getBizName(), "NextRpcRequester", "getInstance", th.getMessage());
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$ultron$datamodel$imp$NextRpcRequester$NextRpcAttachedResponseStrategy;

        static {
            int[] iArr = new int[NextRpcAttachedResponseStrategy.values().length];
            $SwitchMap$com$taobao$android$ultron$datamodel$imp$NextRpcRequester$NextRpcAttachedResponseStrategy = iArr;
            try {
                iArr[NextRpcAttachedResponseStrategy.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$ultron$datamodel$imp$NextRpcRequester$NextRpcAttachedResponseStrategy[NextRpcAttachedResponseStrategy.IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements b3k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final u55 f9861a;
        public final ux b;
        public final MtopBusiness c;
        public final long d = System.currentTimeMillis();
        public long e;
        public final boolean f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements ThreadFactory {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "NextRpcRequester-asyncParse-thread");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RemoteMainResponse f9862a;
            public final /* synthetic */ List b;
            public final /* synthetic */ MtopResponse c;
            public final /* synthetic */ int d;
            public final /* synthetic */ Object e;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ParseResponseHelper f9863a;

                public a(ParseResponseHelper parseResponseHelper) {
                    this.f9863a = parseResponseHelper;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = b.this;
                    c.g(c.this, bVar.c, bVar.d, bVar.e, this.f9863a);
                }
            }

            public b(RemoteMainResponse remoteMainResponse, List list, MtopResponse mtopResponse, int i, Object obj) {
                this.f9862a = remoteMainResponse;
                this.b = list;
                this.c = mtopResponse;
                this.d = i;
                this.e = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ParseResponseHelper parseResponseHelper = new ParseResponseHelper(c.this.f9861a);
                if (c.h(c.this, this.f9862a, this.b, this.c, parseResponseHelper)) {
                    new Handler(Looper.getMainLooper()).post(new a(parseResponseHelper));
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.ultron.datamodel.imp.NextRpcRequester$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0511c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RemoteMainResponse f9864a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ ParseResponseHelper c;

            public RunnableC0511c(RemoteMainResponse remoteMainResponse, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
                this.f9864a = remoteMainResponse;
                this.b = mtopResponse;
                this.c = parseResponseHelper;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    c.this.b.a(this.f9864a.getMtopRequestType(), this.b, this.f9864a.getMtopRequestContext(), true, this.c.f());
                } catch (Exception e) {
                    UnifyLog.e("NextRpcRequester", e.getMessage());
                }
            }
        }

        static {
            t2o.a(83886180);
        }

        public c(MtopBusiness mtopBusiness, ux uxVar, u55 u55Var, boolean z) {
            this.c = mtopBusiness;
            this.f9861a = u55Var;
            this.b = uxVar;
            this.f = z;
        }

        public static /* synthetic */ void g(c cVar, MtopResponse mtopResponse, int i, Object obj, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c945797b", new Object[]{cVar, mtopResponse, new Integer(i), obj, parseResponseHelper});
            } else {
                cVar.j(mtopResponse, i, obj, parseResponseHelper);
            }
        }

        public static /* synthetic */ boolean h(c cVar, RemoteMainResponse remoteMainResponse, List list, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96747476", new Object[]{cVar, remoteMainResponse, list, mtopResponse, parseResponseHelper})).booleanValue();
            }
            return cVar.k(remoteMainResponse, list, mtopResponse, parseResponseHelper);
        }

        @Override // tb.b3k
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0800fd", new Object[]{this, list});
                return;
            }
            UnifyLog.d("NextRpcRequester", "remoteMainResponseReqId = " + NextRpcRequester.d() + " identityHashCode=" + System.identityHashCode(this));
            if (list != null && !list.isEmpty()) {
                HashMap hashMap = new HashMap();
                if (this.b.n(NextRpcRequester.d(), list)) {
                    hashMap.put("isValid", "1");
                    this.b.c(NextRpcRequester.b(NextRpcRequester.this, list));
                } else {
                    hashMap.put("isValid", "0");
                }
                NextRpcRequester.e(NextRpcRequester.this, this.c, hashMap);
            }
        }

        public final void i(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list, MtopResponse mtopResponse, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c94c9f3", new Object[]{this, remoteMainResponse, list, mtopResponse, new Integer(i), obj});
                return;
            }
            if (NextRpcRequester.i(NextRpcRequester.this) == null) {
                NextRpcRequester.j(NextRpcRequester.this, new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this)));
                NextRpcRequester.i(NextRpcRequester.this).allowCoreThreadTimeOut(true);
            }
            NextRpcRequester.i(NextRpcRequester.this).execute(new b(remoteMainResponse, list, mtopResponse, i, obj));
        }

        public final void l(RemoteMainResponse remoteMainResponse, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper, byte[] bArr, Exception exc) {
            String message;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b66626dd", new Object[]{this, remoteMainResponse, mtopResponse, parseResponseHelper, bArr, exc});
            } else if (this.b == null) {
                UnifyLog.e("NextRpcRequester", "mOuterCallback is null");
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC0511c(remoteMainResponse, mtopResponse, parseResponseHelper));
                String str2 = NextRpcRequester.this.n;
                if (exc == null) {
                    message = "";
                } else {
                    message = exc.getMessage();
                }
                vxu.f("Ultron", "AURAMonitor", "AURAMonitor", str2, null, "parseResponseException", message);
                StringBuilder sb = new StringBuilder("parseResponseException#bizName=");
                sb.append(NextRpcRequester.this.n);
                sb.append("#responseByteData=");
                if (bArr == null) {
                    str = "none";
                } else {
                    str = new String(bArr);
                }
                sb.append(str);
                UnifyLog.e("NextRpcRequester", sb.toString());
            }
        }

        @Override // tb.b3k
        public void b(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f21c02c6", new Object[]{this, remoteMainResponse});
                return;
            }
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            int mtopRequestType = remoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = remoteMainResponse.getMtopRequestContext();
            x55.g(NextRpcRequester.this.q, mtopResponse);
            NextRpcRequester.f(NextRpcRequester.this, this.c);
            String bizName = this.f9861a.getBizName();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.k(bizName, "NextRpcRequester", "onError", "", "", eventType, "request: " + NextRpcRequester.this.b.toString());
            String bizName2 = this.f9861a.getBizName();
            UnifyLog.k(bizName2, "NextRpcRequester", "onError", "", "", eventType, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + NextRpcRequester.this.b.toString());
            this.f9861a.n0(false);
            try {
                ux uxVar = this.b;
                if (uxVar != null && !uxVar.e(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, false, null);
                }
                ux uxVar2 = this.b;
                if (uxVar2 != null) {
                    uxVar2.f(mtopRequestType, mtopResponse, mtopRequestContext);
                }
            } catch (Exception e) {
                UnifyLog.m(this.f9861a.getBizName(), "NextRpcRequester", "onError 节点onError回调处理错误出错", e.getMessage());
            }
            u55 u55Var = this.f9861a;
            NextRpcRequester nextRpcRequester = NextRpcRequester.this;
            vxu.e(u55Var, mtopResponse, nextRpcRequester.b, false, NextRpcRequester.c(nextRpcRequester));
        }

        @Override // tb.b3k
        public void f(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a607b1d7", new Object[]{this, remoteMainResponse});
                return;
            }
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            int mtopRequestType = remoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = remoteMainResponse.getMtopRequestContext();
            NextRpcRequester.f(NextRpcRequester.this, this.c);
            String bizName = this.f9861a.getBizName();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.k(bizName, "NextRpcRequester", "onSystemError", "", "", eventType, "request: " + NextRpcRequester.this.b.toString());
            String bizName2 = this.f9861a.getBizName();
            UnifyLog.k(bizName2, "NextRpcRequester", "onSystemError", "", "", eventType, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + NextRpcRequester.this.b.toString());
            this.f9861a.n0(false);
            try {
                ux uxVar = this.b;
                if (uxVar != null && !uxVar.e(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.a(mtopRequestType, mtopResponse, mtopRequestContext, false, null);
                }
                ux uxVar2 = this.b;
                if (uxVar2 != null) {
                    uxVar2.f(mtopRequestType, mtopResponse, mtopRequestContext);
                }
            } catch (Exception e) {
                UnifyLog.k(this.f9861a.getBizName(), "NextRpcRequester", "onSystemError 节点onError回调处理错误出错", "", "", UnifyLog.EventType.ERROR, e.getMessage());
            }
            u55 u55Var = this.f9861a;
            NextRpcRequester nextRpcRequester = NextRpcRequester.this;
            vxu.e(u55Var, mtopResponse, nextRpcRequester.b, false, NextRpcRequester.c(nextRpcRequester));
        }

        @Override // tb.b3k
        public void c(CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32e3a7b8", new Object[]{this, cachedMainResponse});
            } else if (this.f) {
                MtopResponse mtopResponse = cachedMainResponse.getMtopCacheEvent().getMtopResponse();
                Object mtopRequestContext = cachedMainResponse.getMtopRequestContext();
                NextRpcRequester.f(NextRpcRequester.this, this.c);
                String bizName = this.f9861a.getBizName();
                UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
                UnifyLog.k(bizName, "NextRpcRequester", "onCached", "", "", eventType, "request: " + NextRpcRequester.this.b.toString());
                if (mtopResponse != null) {
                    String bizName2 = this.f9861a.getBizName();
                    UnifyLog.m(bizName2, "NextRpcRequester", "onCached", "response: " + mtopResponse.getDataJsonObject());
                }
                this.f9861a.n0(true);
                try {
                    if (this.b.e(10000, mtopResponse, mtopRequestContext)) {
                        this.b.h(10000, mtopResponse, mtopRequestContext);
                        this.b.f(10000, mtopResponse, mtopRequestContext);
                        return;
                    }
                } catch (Throwable unused) {
                }
                if (NextRpcRequester.this.f) {
                    try {
                        this.b.b(10000, mtopResponse, mtopRequestContext, this.f9861a, null);
                        vxu.e(this.f9861a, mtopResponse, null, true, NextRpcRequester.c(NextRpcRequester.this));
                    } catch (Throwable th) {
                        UnifyLog.m(this.f9861a.getBizName(), "NextRpcRequester", "submit onSuccess callback error", th.getMessage());
                    }
                } else {
                    ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f9861a);
                    parseResponseHelper.r(mtopResponse);
                    try {
                        if (parseResponseHelper.i()) {
                            this.b.b(10000, mtopResponse, mtopRequestContext, this.f9861a, parseResponseHelper.f());
                            vxu.e(this.f9861a, mtopResponse, null, true, NextRpcRequester.c(NextRpcRequester.this));
                        } else {
                            parseResponseHelper.d("isCachaData", "true");
                            this.b.a(10000, mtopResponse, mtopRequestContext, true, parseResponseHelper.f());
                            vxu.e(this.f9861a, mtopResponse, null, false, NextRpcRequester.c(NextRpcRequester.this));
                        }
                    } catch (Throwable th2) {
                        UnifyLog.m(this.f9861a.getBizName(), "NextRpcRequester", "submit onSuccess callback error", th2.getMessage());
                    }
                }
            }
        }

        @Override // tb.b3k
        public void e(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebdbd0", new Object[]{this, remoteMainResponse, list});
                return;
            }
            hav.d(this.f9861a.getBizName(), "NextRpcRequester#remoteResponse");
            this.e = System.currentTimeMillis();
            x55.h(NextRpcRequester.this.q, remoteMainResponse.getMtopResponse());
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            int mtopRequestType = remoteMainResponse.getMtopRequestType();
            Object mtopRequestContext = remoteMainResponse.getMtopRequestContext();
            NextRpcRequester.f(NextRpcRequester.this, this.c);
            NextRpcRequester nextRpcRequester = NextRpcRequester.this;
            q9v.b(nextRpcRequester.q, nextRpcRequester.n, mtopResponse.getDataJsonObject());
            if (this.f9861a.d()) {
                if (NextRpcRequester.g(NextRpcRequester.this)) {
                    this.f9861a.m0();
                }
                this.f9861a.n0(false);
            }
            try {
                if (this.b.e(mtopRequestType, mtopResponse, mtopRequestContext)) {
                    this.b.h(mtopRequestType, mtopResponse, mtopRequestContext);
                    this.b.f(mtopRequestType, mtopResponse, mtopRequestContext);
                    x55.d(NextRpcRequester.this.q, true, mtopResponse);
                    return;
                }
            } catch (Throwable unused) {
            }
            NextRpcRequester nextRpcRequester2 = NextRpcRequester.this;
            if (nextRpcRequester2.f) {
                try {
                    this.b.b(mtopRequestType, mtopResponse, mtopRequestContext, this.f9861a, null);
                    x55.d(NextRpcRequester.this.q, true, mtopResponse);
                } catch (Throwable th) {
                    UnifyLog.m(NextRpcRequester.this.n, "NextRpcRequester", "submit onSuccess callback error", th.getMessage());
                }
            } else {
                if (NextRpcRequester.h(nextRpcRequester2)) {
                    UnifyLog.m(NextRpcRequester.this.n, "NextRpcRequester", "mAsyncParseRpcResponse is true", new String[0]);
                    i(remoteMainResponse, list, mtopResponse, mtopRequestType, mtopRequestContext);
                } else {
                    ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f9861a);
                    if (k(remoteMainResponse, list, mtopResponse, parseResponseHelper)) {
                        j(mtopResponse, mtopRequestType, mtopRequestContext, parseResponseHelper);
                    } else {
                        return;
                    }
                }
                x55.d(NextRpcRequester.this.q, false, mtopResponse);
            }
        }

        public final void j(MtopResponse mtopResponse, int i, Object obj, ParseResponseHelper parseResponseHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ffd1d0e", new Object[]{this, mtopResponse, new Integer(i), obj, parseResponseHelper});
                return;
            }
            try {
                if (parseResponseHelper.i()) {
                    this.b.b(i, mtopResponse, obj, this.f9861a, parseResponseHelper.f());
                    u55 u55Var = this.f9861a;
                    NextRpcRequester nextRpcRequester = NextRpcRequester.this;
                    vxu.e(u55Var, mtopResponse, nextRpcRequester.b, true, NextRpcRequester.c(nextRpcRequester));
                } else {
                    this.b.a(i, mtopResponse, obj, true, parseResponseHelper.f());
                    Map<String, Object> f = parseResponseHelper.f();
                    if (f != null) {
                        Object obj2 = f.get("protocolVersion");
                        if (obj2 instanceof String) {
                            try {
                                if (Float.parseFloat((String) obj2) > 2.1d) {
                                    u55 u55Var2 = this.f9861a;
                                    NextRpcRequester nextRpcRequester2 = NextRpcRequester.this;
                                    vxu.e(u55Var2, mtopResponse, nextRpcRequester2.b, false, NextRpcRequester.c(nextRpcRequester2));
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                UnifyLog.m(NextRpcRequester.this.n, "NextRpcRequester", "submit onSuccess callback error", th.getMessage());
            }
        }

        public final boolean k(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list, MtopResponse mtopResponse, ParseResponseHelper parseResponseHelper) {
            Exception e;
            byte[] bArr;
            byte[] bytedata;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae7a95bc", new Object[]{this, remoteMainResponse, list, mtopResponse, parseResponseHelper})).booleanValue();
            }
            x55.i(NextRpcRequester.this.q, mtopResponse);
            try {
                bytedata = mtopResponse.getBytedata();
            } catch (Exception e2) {
                e = e2;
                bArr = null;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = (JSONObject) JSON.parseObject(bytedata, JSONObject.class, new Feature[0]);
                String str2 = new String(bytedata);
                Log.e("ultronXPerformance", "next rpc parseObject cost:" + (System.currentTimeMillis() - currentTimeMillis));
                long currentTimeMillis2 = System.currentTimeMillis();
                new String(bytedata);
                Log.e("ultronXPerformance", "next rpc new String cost:" + (System.currentTimeMillis() - currentTimeMillis2));
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    l(remoteMainResponse, mtopResponse, parseResponseHelper, bytedata, null);
                    return false;
                }
                parseResponseHelper.p(jSONObject2);
                if (parseResponseHelper.h(o1n.FEATURE_CONTAINER_CACHE)) {
                    NextRpcRequester nextRpcRequester = NextRpcRequester.this;
                    str = str2;
                    parseResponseHelper.v(nextRpcRequester.q, nextRpcRequester.n, jSONObject2, true, true);
                } else {
                    str = str2;
                }
                parseResponseHelper.t(jSONObject, str);
                if (list != null) {
                    parseResponseHelper.o(NextRpcRequester.b(NextRpcRequester.this, list));
                }
                x55.e(NextRpcRequester.this.q, mtopResponse, jSONObject2, this.d, this.e);
                return true;
            } catch (Exception e3) {
                e = e3;
                bArr = bytedata;
                l(remoteMainResponse, mtopResponse, parseResponseHelper, bArr, e);
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Handler h = new Handler(Looper.getMainLooper());
        public final Handler i;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RemoteMainResponse f9865a;
            public final /* synthetic */ List b;

            public a(RemoteMainResponse remoteMainResponse, List list) {
                this.f9865a = remoteMainResponse;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.m(d.this, this.f9865a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RemoteMainResponse f9866a;

            public b(RemoteMainResponse remoteMainResponse) {
                this.f9866a = remoteMainResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.n(d.this, this.f9866a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RemoteMainResponse f9867a;

            public c(RemoteMainResponse remoteMainResponse) {
                this.f9867a = remoteMainResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.o(d.this, this.f9867a);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.ultron.datamodel.imp.NextRpcRequester$d$d  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0512d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CachedMainResponse f9868a;

            public RunnableC0512d(CachedMainResponse cachedMainResponse) {
                this.f9868a = cachedMainResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.p(d.this, this.f9868a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f9869a;

            public e(List list) {
                this.f9869a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.q(d.this, this.f9869a);
                }
            }
        }

        static {
            t2o.a(83886185);
        }

        public d(NextRpcRequester nextRpcRequester, MtopBusiness mtopBusiness, ux uxVar, u55 u55Var, boolean z) {
            super(mtopBusiness, uxVar, u55Var, z);
            Handler c2 = pav.c("backgroundThread");
            this.i = c2;
            mtopBusiness.handler(c2);
            hav.d("NextRpcRequester", "使用外部传递线程的方式调用mtop接口");
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1895300867:
                    super.a((List) objArr[0]);
                    return null;
                case -1509445161:
                    super.f((RemoteMainResponse) objArr[0]);
                    return null;
                case -233045306:
                    super.b((RemoteMainResponse) objArr[0]);
                    return null;
                case 619437008:
                    super.e((RemoteMainResponse) objArr[0], (List) objArr[1]);
                    return null;
                case 853780408:
                    super.c((CachedMainResponse) objArr[0]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/NextRpcRequester$WorkerThreadResponse");
            }
        }

        public static /* synthetic */ void m(d dVar, RemoteMainResponse remoteMainResponse, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba7e45c3", new Object[]{dVar, remoteMainResponse, list});
            } else {
                super.e(remoteMainResponse, list);
            }
        }

        public static /* synthetic */ void n(d dVar, RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ed47671", new Object[]{dVar, remoteMainResponse});
            } else {
                super.b(remoteMainResponse);
            }
        }

        public static /* synthetic */ void o(d dVar, RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("feb95010", new Object[]{dVar, remoteMainResponse});
            } else {
                super.f(remoteMainResponse);
            }
        }

        public static /* synthetic */ void p(d dVar, CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef58d53", new Object[]{dVar, cachedMainResponse});
            } else {
                super.c(cachedMainResponse);
            }
        }

        public static /* synthetic */ void q(d dVar, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f262860e", new Object[]{dVar, list});
            } else {
                super.a(list);
            }
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.c, tb.b3k
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0800fd", new Object[]{this, list});
            } else {
                this.h.post(new e(list));
            }
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.c, tb.b3k
        public void b(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f21c02c6", new Object[]{this, remoteMainResponse});
                return;
            }
            this.h.post(new b(remoteMainResponse));
            r();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.c, tb.b3k
        public void c(CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32e3a7b8", new Object[]{this, cachedMainResponse});
                return;
            }
            this.h.post(new RunnableC0512d(cachedMainResponse));
            r();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.c, tb.b3k
        public void e(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebdbd0", new Object[]{this, remoteMainResponse, list});
                return;
            }
            this.h.post(new a(remoteMainResponse, list));
            r();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.NextRpcRequester.c, tb.b3k
        public void f(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a607b1d7", new Object[]{this, remoteMainResponse});
                return;
            }
            this.h.post(new c(remoteMainResponse));
            r();
        }

        public final void r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6938564", new Object[]{this});
                return;
            }
            try {
                this.i.getLooper().quitSafely();
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(83886174);
        t2o.a(83886126);
    }

    public NextRpcRequester(w55 w55Var) {
        this.f9859a = true;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = true;
        this.i = -1;
        this.j = false;
        this.n = "default";
        this.r = true;
        this.v = false;
        if (w55Var != null) {
            boolean R = w55Var.R();
            this.g = R;
            if (w55Var.A() != null) {
                this.c = w55Var.A();
            } else {
                this.c = new u55(R);
            }
            this.k = w55Var.D();
            w55Var.B();
            this.h = w55Var.J();
            this.e = w55Var.M();
            this.f = w55Var.g0();
            this.j = w55Var.h0();
            this.d = w55Var.b0();
            this.i = w55Var.v();
            this.l = w55Var.I();
            this.m = w55Var.F();
            w55Var.G();
            this.n = w55Var.w();
            this.o = w55Var.y();
            this.p = w55Var.x();
            w55Var.m0();
            w55Var.Q();
            w55Var.H();
            this.s = w55Var.s();
            this.t = w55Var.u();
            this.v = w55Var.N();
            this.r = w55Var.i0();
            this.w = w55Var.d0();
            this.u = w55Var.L();
            MtopRequest mtopRequest = new MtopRequest();
            this.b = mtopRequest;
            mtopRequest.setApiName(w55Var.t());
            mtopRequest.setVersion(w55Var.K());
            mtopRequest.setNeedSession(w55Var.Y());
            mtopRequest.setNeedEcode(w55Var.W());
            fsb fsbVar = this.c;
            if (fsbVar instanceof u55) {
                v55 v = ((u55) fsbVar).v();
                if (v != null) {
                    v.p(w55Var.a0());
                    v.q(w55Var.f0());
                }
                if (!(v == null || w55Var.C() == null)) {
                    for (eq6.a aVar : w55Var.C()) {
                        v.f().c(aVar);
                    }
                }
            }
            this.q = w55Var.z();
            this.f9859a = w55Var.O();
            this.c.a(this.n);
            this.c.f(this.o);
            ((u55) this.c).q0(w55Var.z());
            MtopBusiness build = MtopBusiness.build(this.b);
            NextRpcRequest.AttachedResponseStrategy attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY;
            NextRpcAttachedResponseStrategy nextRpcAttachedResponseStrategy = this.t;
            if (nextRpcAttachedResponseStrategy != null && b.$SwitchMap$com$taobao$android$ultron$datamodel$imp$NextRpcRequester$NextRpcAttachedResponseStrategy[nextRpcAttachedResponseStrategy.ordinal()] == 1) {
                attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.FULL;
            }
            o(build, w55Var);
            this.y = new NextRpcRequest(build, this.s, attachedResponseStrategy);
        }
    }

    public static /* synthetic */ List b(NextRpcRequester nextRpcRequester, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5043c2a5", new Object[]{nextRpcRequester, list});
        }
        return nextRpcRequester.n(list);
    }

    public static /* synthetic */ Map c(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a376f27", new Object[]{nextRpcRequester});
        }
        return nextRpcRequester.m();
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cab2cd57", new Object[0]);
        }
        return z;
    }

    public static /* synthetic */ void e(NextRpcRequester nextRpcRequester, MtopBusiness mtopBusiness, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6be21f3", new Object[]{nextRpcRequester, mtopBusiness, map});
        } else {
            nextRpcRequester.r(mtopBusiness, map);
        }
    }

    public static /* synthetic */ void f(NextRpcRequester nextRpcRequester, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d140be4", new Object[]{nextRpcRequester, mtopBusiness});
        } else {
            nextRpcRequester.q(mtopBusiness);
        }
    }

    public static /* synthetic */ boolean g(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f8fa80b", new Object[]{nextRpcRequester})).booleanValue();
        }
        return nextRpcRequester.w;
    }

    public static /* synthetic */ boolean h(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d4f200c", new Object[]{nextRpcRequester})).booleanValue();
        }
        return nextRpcRequester.v;
    }

    public static /* synthetic */ ThreadPoolExecutor i(NextRpcRequester nextRpcRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("79deade9", new Object[]{nextRpcRequester});
        }
        return nextRpcRequester.x;
    }

    public static /* synthetic */ ThreadPoolExecutor j(NextRpcRequester nextRpcRequester, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("ae822165", new Object[]{nextRpcRequester, threadPoolExecutor});
        }
        nextRpcRequester.x = threadPoolExecutor;
        return threadPoolExecutor;
    }

    @Override // tb.o0d
    public String a(x2k x2kVar, Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("775d99ea", new Object[]{this, x2kVar, obj, uxVar});
        }
        return l(x2kVar, obj, uxVar);
    }

    @Override // tb.o0d
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public final void k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65073f0", new Object[]{this, map});
        } else if (this.f9859a) {
            try {
                if (kjf.a()) {
                    JSONObject parseObject = JSON.parseObject(map.get("exParams"));
                    if (parseObject == null) {
                        parseObject = new JSONObject();
                    }
                    parseObject.put("inner", (Object) "1");
                    map.put("exParams", parseObject.toJSONString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final List<JSONObject> n(List<AttachedResponse> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b66cc66e", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() >= 1) {
            try {
                for (AttachedResponse attachedResponse : list) {
                    if (attachedResponse != null) {
                        arrayList.add(JSON.parseObject(attachedResponse.getBody()));
                    }
                }
            } catch (Throwable th) {
                UnifyLog.d("NextRpcRequester", th.getMessage());
            }
        }
        return arrayList;
    }

    public final void o(MtopBusiness mtopBusiness, w55 w55Var) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f588fef7", new Object[]{this, mtopBusiness, w55Var});
            return;
        }
        mtopBusiness.supportStreamJson(w55Var.P());
        if (this.d) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        mtopBusiness.reqMethod(methodEnum);
        if (!this.d && this.u) {
            mtopBusiness.allowSwitchToPOST(true);
        }
        if (this.j) {
            mtopBusiness.useWua();
        }
        int i = this.i;
        if (i != -1) {
            try {
                mtopBusiness.setBizId(i);
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(this.p)) {
            mtopBusiness.setBizTopic(this.p);
        }
        if (!TextUtils.isEmpty(this.h)) {
            mtopBusiness.setUnitStrategy(this.h);
        }
        Map<String, String> map = this.k;
        if (map != null) {
            mtopBusiness.headers(map);
        }
    }

    public final void p(MtopRequest mtopRequest, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb0706e", new Object[]{this, mtopRequest, map});
        } else if (mtopRequest != null) {
            mtopRequest.dataParams = map;
        }
    }

    public final void q(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db91015", new Object[]{this, mtopBusiness});
        }
    }

    public final void r(MtopBusiness mtopBusiness, Map<String, String> map) {
        String str;
        MtopRequest mtopRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac668f73", new Object[]{this, mtopBusiness, map});
            return;
        }
        if (mtopBusiness == null || (mtopRequest = mtopBusiness.request) == null) {
            str = "";
        } else {
            str = mtopRequest.getApiName();
        }
        vuv.b("ultron-nextrpc-attached-response", str, "", map);
    }

    public final String l(x2k x2kVar, Object obj, ux uxVar) {
        b3k b3kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c930e95", new Object[]{this, x2kVar, obj, uxVar});
        }
        String str = this.n;
        if (str != null && xav.e(str) == null) {
            new a().execute(new Void[0]);
        }
        fsb fsbVar = this.c;
        if (!(fsbVar instanceof u55)) {
            return "";
        }
        u55 u55Var = (u55) fsbVar;
        if (this.m == null) {
            this.m = new HashMap();
        }
        k(this.m);
        if (this.e) {
            if (this.g) {
                this.m.put("feature", "{\"gzip\":\"true\"}");
            }
            this.m.put("params", u55Var.v().a(u55Var, this.l));
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.m);
            this.b.setData(jSONObject.toJSONString());
            p(this.b, this.m);
        } else if (this.f) {
            if (this.g) {
                this.m.put("feature", "{\"gzip\":\"true\"}");
            }
            this.m.put("params", u55Var.v().t(u55Var));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.m);
            this.b.setData(jSONObject2.toJSONString());
            p(this.b, this.m);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(this.m);
            this.b.setData(jSONObject3.toJSONString());
            p(this.b, this.m);
        }
        vxu.d(this.c, this.b);
        x55.j(this.q);
        if (v9v.i("newUltron_container", "mtopCallbackInWorkerThread", false) || cw6.b()) {
            b3kVar = new d(this, this.y.getMtopBusiness(), uxVar, u55Var, this.r);
        } else {
            b3kVar = new c(this.y.getMtopBusiness(), uxVar, u55Var, this.r);
        }
        String b2 = x2kVar.b(this.y, b3kVar);
        z = b2;
        return b2;
    }

    public final Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this});
        }
        if (!(this.q instanceof Activity)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String[] strArr = {"preBizName"};
            for (int i = 0; i < 1; i++) {
                String str = strArr[i];
                String queryParameter = ((Activity) this.q).getIntent().getData().getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
