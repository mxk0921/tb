package com.taobao.android.ultron.datamodel.imp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.cw6;
import tb.eq6;
import tb.fsb;
import tb.hav;
import tb.hsb;
import tb.kjf;
import tb.o1n;
import tb.pav;
import tb.t2o;
import tb.u55;
import tb.ux;
import tb.v55;
import tb.v9v;
import tb.vxu;
import tb.w55;
import tb.x55;
import tb.xav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DMRequester implements hsb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HEADER_FEATURE_KEY = "feature";
    public static final String HEADER_FEATURE_VAL = "{\"gzip\":\"true\"}";
    public static final int INVALID_BIZID = -1;
    public static final String KEY_IS_CACHE_DATA = "isCachaData";
    public static final String KEY_SP_FILE_NAME = "ultornSdkSpName";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USER_NAME = "userName";
    public static final ExecutorService y = pav.e(1, 1, 1000, TimeUnit.MILLISECONDS, "DMRequester-asyncResponse-thread");

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9850a;
    public final MtopRequest b;
    public MtopBusiness c;
    public final fsb d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final int l;
    public final boolean m;
    public final Map<String, String> n;
    public final IDMComponent o;
    public Map<String, String> p;
    public final Class<?> q;
    public final String r;
    public final String s;
    public final Context t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.ultron.datamodel.imp.DMRequester$1  reason: invalid class name */
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
                UnifyLog.k(DMRequester.this.r, "DMRequester", "uploadDataForTest onError", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse != null) {
                UnifyLog.k(DMRequester.this.r, "DMRequester", "uploadDataForTest onSuccess", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.NET_RESPONSE, new String[0]);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                UnifyLog.k(DMRequester.this.r, "DMRequester", "uploadDataForTest onSystemError", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), UnifyLog.EventType.ERROR, new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AsyncResponse extends Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9851a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ BaseOutDo c;
            public final /* synthetic */ Object d;

            public a(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                this.f9851a = i;
                this.b = mtopResponse;
                this.c = baseOutDo;
                this.d = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AsyncResponse.access$801(AsyncResponse.this, this.f9851a, this.b, this.c, this.d);
                }
            }
        }

        static {
            t2o.a(83886160);
        }

        public AsyncResponse(ux uxVar, u55 u55Var, MtopBusiness mtopBusiness) {
            super(uxVar, u55Var, mtopBusiness);
        }

        public static /* synthetic */ void access$801(AsyncResponse asyncResponse, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f423e85e", new Object[]{asyncResponse, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
        }

        public static /* synthetic */ Object ipc$super(AsyncResponse asyncResponse, String str, Object... objArr) {
            if (str.hashCode() == 2057952281) {
                super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/DMRequester$AsyncResponse");
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                DMRequester.f().execute(new a(i, mtopResponse, baseOutDo, obj));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class Response implements IRemoteBaseListener, IRemoteCacheListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public u55 mDMContext;
        public MtopBusiness mMBusiness;
        public ux mOuterCallback;
        private final long mStartRequestTimeMills = System.currentTimeMillis();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends AsyncTask {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f9852a;

            public a(MtopResponse mtopResponse) {
                this.f9852a = mtopResponse;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/DMRequester$Response$1");
            }

            @Override // android.os.AsyncTask
            public Object doInBackground(Object[] objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                }
                String bizName = Response.this.mDMContext.getBizName();
                UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                UnifyLog.k(bizName, "DMRequester", "onSuccess", "", "", eventType, "request: " + DMRequester.this.b.toString());
                if (this.f9852a == null) {
                    return null;
                }
                String bizName2 = Response.this.mDMContext.getBizName();
                UnifyLog.k(bizName2, "DMRequester", "onSuccess", "", "", eventType, "response: " + this.f9852a.getDataJsonObject());
                return null;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b extends AsyncTask {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopResponse f9853a;
            public final /* synthetic */ Map b;

            public b(MtopResponse mtopResponse, Map map) {
                this.f9853a = mtopResponse;
                this.b = map;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/DMRequester$Response$2");
            }

            @Override // android.os.AsyncTask
            public Object doInBackground(Object[] objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                }
                Response response = Response.this;
                vxu.e(response.mDMContext, this.f9853a, DMRequester.this.b, true, this.b);
                return null;
            }
        }

        static {
            t2o.a(83886163);
            t2o.a(589299719);
            t2o.a(589299720);
        }

        public Response(ux uxVar, u55 u55Var, MtopBusiness mtopBusiness) {
            this.mDMContext = u55Var;
            this.mOuterCallback = uxVar;
            this.mMBusiness = mtopBusiness;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            x55.g(DMRequester.this.t, mtopResponse);
            DMRequester.b(DMRequester.this, this.mMBusiness);
            String bizName = this.mDMContext.getBizName();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.k(bizName, "DMRequester", "onError", "", "", eventType, "request: " + DMRequester.this.b.toString());
            String bizName2 = this.mDMContext.getBizName();
            UnifyLog.k(bizName2, "DMRequester", "onError", "", "", eventType, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + DMRequester.this.b.toString());
            this.mDMContext.n0(false);
            try {
                ux uxVar = this.mOuterCallback;
                if (uxVar != null && !uxVar.e(i, mtopResponse, obj)) {
                    this.mOuterCallback.a(i, mtopResponse, obj, false, null);
                }
            } catch (Exception e) {
                UnifyLog.m(this.mDMContext.getBizName(), "DMRequester", "onError 节点onError回调处理错误出错", e.getMessage());
            }
            u55 u55Var = this.mDMContext;
            DMRequester dMRequester = DMRequester.this;
            vxu.e(u55Var, mtopResponse, dMRequester.b, false, DMRequester.e(dMRequester));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            DMRequester.b(DMRequester.this, this.mMBusiness);
            String bizName = this.mDMContext.getBizName();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.k(bizName, "DMRequester", "onSystemError", "", "", eventType, "request: " + DMRequester.this.b.toString());
            String bizName2 = this.mDMContext.getBizName();
            UnifyLog.k(bizName2, "DMRequester", "onSystemError", "", "", eventType, "errorCode:" + mtopResponse.getRetCode() + ",errorMsg:" + mtopResponse.getRetMsg() + ",request: " + DMRequester.this.b.toString());
            this.mDMContext.n0(false);
            try {
                ux uxVar = this.mOuterCallback;
                if (uxVar != null && !uxVar.e(i, mtopResponse, obj)) {
                    this.mOuterCallback.a(i, mtopResponse, obj, false, null);
                }
            } catch (Exception e) {
                UnifyLog.k(this.mDMContext.getBizName(), "DMRequester", "onSystemError 节点onError回调处理错误出错", "", "", UnifyLog.EventType.ERROR, e.getMessage());
            }
            u55 u55Var = this.mDMContext;
            DMRequester dMRequester = DMRequester.this;
            vxu.e(u55Var, mtopResponse, dMRequester.b, false, DMRequester.e(dMRequester));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            String bizName = this.mDMContext.getBizName();
            UnifyLog.EventType eventType = UnifyLog.EventType.ERROR;
            UnifyLog.k(bizName, "DMRequester", "onCached", "", "", eventType, "request: " + DMRequester.this.b.toString());
            if (mtopCacheEvent.getMtopResponse() != null) {
                String bizName2 = this.mDMContext.getBizName();
                UnifyLog.m(bizName2, "DMRequester", "onCached", "response: " + mtopCacheEvent.getMtopResponse().getDataJsonObject());
            }
            this.mDMContext.n0(true);
            MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
            try {
                if (this.mOuterCallback.e(10000, mtopResponse, obj)) {
                    this.mOuterCallback.h(10000, mtopResponse, obj);
                    return;
                }
            } catch (Throwable unused) {
            }
            if (DMRequester.this.h) {
                try {
                    this.mOuterCallback.b(10000, mtopResponse, obj, this.mDMContext, null);
                    vxu.e(this.mDMContext, mtopResponse, null, true, DMRequester.e(DMRequester.this));
                } catch (Throwable th) {
                    UnifyLog.m(this.mDMContext.getBizName(), "DMRequester", "submit onSuccess callback error", th.getMessage());
                }
            } else {
                ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.mDMContext);
                parseResponseHelper.r(mtopResponse);
                try {
                    if (parseResponseHelper.i()) {
                        this.mOuterCallback.b(10000, mtopResponse, obj, this.mDMContext, parseResponseHelper.f());
                        vxu.e(this.mDMContext, mtopResponse, null, true, DMRequester.e(DMRequester.this));
                    } else {
                        parseResponseHelper.d("isCachaData", "true");
                        this.mOuterCallback.a(10000, mtopResponse, obj, true, parseResponseHelper.f());
                        vxu.e(this.mDMContext, mtopResponse, null, false, DMRequester.e(DMRequester.this));
                    }
                } catch (Throwable th2) {
                    UnifyLog.m(this.mDMContext.getBizName(), "DMRequester", "submit onSuccess callback error", th2.getMessage());
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            x55.h(DMRequester.this.t, mtopResponse);
            DMRequester.b(DMRequester.this, this.mMBusiness);
            if (DMRequester.c(DMRequester.this)) {
                new a(mtopResponse).execute(new Object[0]);
            } else {
                String bizName = this.mDMContext.getBizName();
                UnifyLog.EventType eventType = UnifyLog.EventType.NET;
                UnifyLog.k(bizName, "DMRequester", "onSuccess", "", "", eventType, "request: " + DMRequester.this.b.toString());
                if (mtopResponse != null) {
                    String bizName2 = this.mDMContext.getBizName();
                    UnifyLog.k(bizName2, "DMRequester", "onSuccess", "", "", eventType, "response: " + mtopResponse.getDataJsonObject());
                }
            }
            if (this.mDMContext.d()) {
                this.mDMContext.m0();
                this.mDMContext.n0(false);
            }
            try {
                if (this.mOuterCallback.e(i, mtopResponse, obj)) {
                    this.mOuterCallback.h(i, mtopResponse, obj);
                    x55.d(DMRequester.this.t, true, mtopResponse);
                    return;
                }
            } catch (Throwable unused) {
            }
            DMRequester dMRequester = DMRequester.this;
            if (dMRequester.h) {
                try {
                    this.mOuterCallback.b(i, mtopResponse, obj, this.mDMContext, null);
                    x55.d(DMRequester.this.t, true, mtopResponse);
                } catch (Throwable th) {
                    UnifyLog.m(DMRequester.this.r, "DMRequester", "submit onSuccess callback error", th.getMessage());
                }
            } else {
                x55.i(dMRequester.t, mtopResponse);
                ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.mDMContext);
                JSONObject jSONObject = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                parseResponseHelper.p(jSONObject2);
                if (parseResponseHelper.h(o1n.FEATURE_CONTAINER_CACHE)) {
                    DMRequester dMRequester2 = DMRequester.this;
                    parseResponseHelper.v(dMRequester2.t, dMRequester2.r, jSONObject2, true, true);
                }
                parseResponseHelper.q(jSONObject);
                x55.e(DMRequester.this.t, mtopResponse, jSONObject2, this.mStartRequestTimeMills, currentTimeMillis);
                try {
                    if (parseResponseHelper.i()) {
                        this.mOuterCallback.b(i, mtopResponse, obj, this.mDMContext, parseResponseHelper.f());
                        if (DMRequester.d(DMRequester.this)) {
                            new b(mtopResponse, DMRequester.e(DMRequester.this)).execute(new Object[0]);
                        } else {
                            u55 u55Var = this.mDMContext;
                            DMRequester dMRequester3 = DMRequester.this;
                            vxu.e(u55Var, mtopResponse, dMRequester3.b, true, DMRequester.e(dMRequester3));
                        }
                    } else {
                        this.mOuterCallback.a(i, mtopResponse, obj, true, parseResponseHelper.f());
                        Map<String, Object> f = parseResponseHelper.f();
                        if (f != null) {
                            Object obj2 = f.get("protocolVersion");
                            if (obj2 instanceof String) {
                                try {
                                    if (Float.parseFloat((String) obj2) > 2.1d) {
                                        u55 u55Var2 = this.mDMContext;
                                        DMRequester dMRequester4 = DMRequester.this;
                                        vxu.e(u55Var2, mtopResponse, dMRequester4.b, false, DMRequester.e(dMRequester4));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    x55.d(DMRequester.this.t, false, mtopResponse);
                } catch (Throwable th2) {
                    UnifyLog.m(DMRequester.this.r, "DMRequester", "submit onSuccess callback error", th2.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class WorkerThreadResponse extends Response {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Handler mainHandler = new Handler(Looper.getMainLooper());
        private final Handler requestHandler;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9854a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ BaseOutDo c;
            public final /* synthetic */ Object d;

            public a(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                this.f9854a = i;
                this.b = mtopResponse;
                this.c = baseOutDo;
                this.d = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WorkerThreadResponse.access$001(WorkerThreadResponse.this, this.f9854a, this.b, this.c, this.d);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9855a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ Object c;

            public b(int i, MtopResponse mtopResponse, Object obj) {
                this.f9855a = i;
                this.b = mtopResponse;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WorkerThreadResponse.access$101(WorkerThreadResponse.this, this.f9855a, this.b, this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f9856a;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ Object c;

            public c(int i, MtopResponse mtopResponse, Object obj) {
                this.f9856a = i;
                this.b = mtopResponse;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WorkerThreadResponse.access$201(WorkerThreadResponse.this, this.f9856a, this.b, this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MtopCacheEvent f9857a;
            public final /* synthetic */ BaseOutDo b;
            public final /* synthetic */ Object c;

            public d(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
                this.f9857a = mtopCacheEvent;
                this.b = baseOutDo;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WorkerThreadResponse.access$301(WorkerThreadResponse.this, this.f9857a, this.b, this.c);
                }
            }
        }

        static {
            t2o.a(83886166);
        }

        public WorkerThreadResponse(ux uxVar, u55 u55Var, MtopBusiness mtopBusiness) {
            super(uxVar, u55Var, mtopBusiness);
            Handler c2 = pav.c("backgroundThread");
            this.requestHandler = c2;
            mtopBusiness.handler(c2);
            hav.d("DMRequester", "使用外部传递线程的方式调用mtop接口");
        }

        public static /* synthetic */ void access$001(WorkerThreadResponse workerThreadResponse, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10731440", new Object[]{workerThreadResponse, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                super.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
        }

        public static /* synthetic */ void access$101(WorkerThreadResponse workerThreadResponse, int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afb4a671", new Object[]{workerThreadResponse, new Integer(i), mtopResponse, obj});
            } else {
                super.onSystemError(i, mtopResponse, obj);
            }
        }

        public static /* synthetic */ void access$201(WorkerThreadResponse workerThreadResponse, int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff808f10", new Object[]{workerThreadResponse, new Integer(i), mtopResponse, obj});
            } else {
                super.onError(i, mtopResponse, obj);
            }
        }

        public static /* synthetic */ void access$301(WorkerThreadResponse workerThreadResponse, MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e21f2b0c", new Object[]{workerThreadResponse, mtopCacheEvent, baseOutDo, obj});
            } else {
                super.onCached(mtopCacheEvent, baseOutDo, obj);
            }
        }

        public static /* synthetic */ Object ipc$super(WorkerThreadResponse workerThreadResponse, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -743105213:
                    super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                    return null;
                case -662674828:
                    super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                    return null;
                case 1945372761:
                    super.onCached((MtopCacheEvent) objArr[0], (BaseOutDo) objArr[1], objArr[2]);
                    return null;
                case 2057952281:
                    super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/DMRequester$WorkerThreadResponse");
            }
        }

        private void safeQuitRequestThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6938564", new Object[]{this});
                return;
            }
            try {
                this.requestHandler.getLooper().quitSafely();
            } catch (Throwable unused) {
            }
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            this.mainHandler.post(new d(mtopCacheEvent, baseOutDo, obj));
            safeQuitRequestThread();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mainHandler.post(new c(i, mtopResponse, obj));
            safeQuitRequestThread();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            this.mainHandler.post(new a(i, mtopResponse, baseOutDo, obj));
            safeQuitRequestThread();
        }

        @Override // com.taobao.android.ultron.datamodel.imp.DMRequester.Response, com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mainHandler.post(new b(i, mtopResponse, obj));
            safeQuitRequestThread();
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/DMRequester$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                DMRequester dMRequester = DMRequester.this;
                xav.d(dMRequester.t, dMRequester.r);
                return null;
            } catch (Throwable th) {
                UnifyLog.m(DMRequester.this.d.getBizName(), "DMRequester", "getInstance", th.getMessage());
                return null;
            }
        }
    }

    static {
        t2o.a(83886157);
        t2o.a(83886123);
    }

    public DMRequester(w55 w55Var) {
        this.f9850a = true;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.l = -1;
        this.m = false;
        this.r = "default";
        this.s = "";
        this.u = true;
        this.v = false;
        this.w = false;
        if (w55Var != null) {
            boolean R = w55Var.R();
            this.i = R;
            if (w55Var.A() != null) {
                this.d = w55Var.A();
            } else {
                this.d = new u55(R);
            }
            this.n = w55Var.D();
            this.j = w55Var.B();
            this.k = w55Var.J();
            this.g = w55Var.M();
            this.h = w55Var.g0();
            this.m = w55Var.h0();
            this.e = w55Var.b0();
            this.f = w55Var.L();
            this.l = w55Var.v();
            this.o = w55Var.I();
            this.p = w55Var.F();
            this.q = w55Var.G();
            String w = w55Var.w();
            this.r = w;
            String y2 = w55Var.y();
            this.s = w55Var.x();
            this.v = w55Var.m0();
            this.w = w55Var.o0();
            w55Var.Q();
            this.x = w55Var.H();
            this.u = w55Var.a0();
            MtopRequest mtopRequest = new MtopRequest();
            this.b = mtopRequest;
            mtopRequest.setApiName(w55Var.t());
            mtopRequest.setVersion(w55Var.K());
            mtopRequest.setNeedSession(w55Var.Y());
            mtopRequest.setNeedEcode(w55Var.W());
            this.t = w55Var.z();
            this.f9850a = w55Var.O();
            this.d.a(w);
            this.d.f(y2);
            ((u55) this.d).q0(w55Var.z());
            fsb fsbVar = this.d;
            if (fsbVar instanceof u55) {
                v55 v = ((u55) fsbVar).v();
                if (!(v == null || w55Var.C() == null)) {
                    for (eq6.a aVar : w55Var.C()) {
                        v.f().c(aVar);
                    }
                }
                v.p(this.u);
            }
        }
    }

    public static /* synthetic */ void b(DMRequester dMRequester, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfddc12c", new Object[]{dMRequester, mtopBusiness});
        } else {
            dMRequester.k(mtopBusiness);
        }
    }

    public static /* synthetic */ boolean c(DMRequester dMRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3647cb1", new Object[]{dMRequester})).booleanValue();
        }
        return dMRequester.v;
    }

    public static /* synthetic */ boolean d(DMRequester dMRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9684810", new Object[]{dMRequester})).booleanValue();
        }
        return dMRequester.w;
    }

    public static /* synthetic */ Map e(DMRequester dMRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cfb64e60", new Object[]{dMRequester});
        }
        return dMRequester.i();
    }

    public static /* synthetic */ ExecutorService f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("8c45465b", new Object[0]);
        }
        return y;
    }

    @Override // tb.hsb
    public boolean a(Object obj, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("430439b1", new Object[]{this, obj, uxVar})).booleanValue();
        }
        return h(obj, uxVar);
    }

    @Override // tb.hsb
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.c;
        if (mtopBusiness != null) {
            mtopBusiness.cancelRequest();
        }
    }

    public final void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65073f0", new Object[]{this, map});
        } else if (this.f9850a) {
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

    public final void j(MtopRequest mtopRequest, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb0706e", new Object[]{this, mtopRequest, map});
        } else if (mtopRequest != null) {
            mtopRequest.dataParams = map;
        }
    }

    public final void k(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db91015", new Object[]{this, mtopBusiness});
        }
    }

    public final boolean h(Object obj, ux uxVar) {
        MtopListener mtopListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32529e6", new Object[]{this, obj, uxVar})).booleanValue();
        }
        String str = this.r;
        if (str != null && xav.e(str) == null) {
            new a().execute(new Void[0]);
        }
        fsb fsbVar = this.d;
        if (!(fsbVar instanceof u55)) {
            return false;
        }
        u55 u55Var = (u55) fsbVar;
        if (this.p == null) {
            this.p = new HashMap();
        }
        g(this.p);
        if (this.g) {
            if (this.i) {
                this.p.put("feature", "{\"gzip\":\"true\"}");
            }
            this.p.put("params", u55Var.v().a(u55Var, this.o));
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.p);
            this.b.setData(jSONObject.toJSONString());
            j(this.b, this.p);
        } else if (this.h) {
            if (this.i) {
                this.p.put("feature", "{\"gzip\":\"true\"}");
            }
            this.p.put("params", u55Var.v().t(u55Var));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(this.p);
            this.b.setData(jSONObject2.toJSONString());
            j(this.b, this.p);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(this.p);
            this.b.setData(jSONObject3.toJSONString());
            j(this.b, this.p);
        }
        MtopBusiness build = MtopBusiness.build(this.b);
        if (this.m) {
            build.useWua();
        }
        if (this.e) {
            build.reqMethod(MethodEnum.POST);
        } else {
            boolean z = this.f;
            if (z) {
                build.allowSwitchToPOST(z);
            }
        }
        String str2 = this.j;
        if (str2 != null) {
            build.setCustomDomain(str2);
        }
        int i = this.l;
        if (-1 != i) {
            build.setBizId(i);
        }
        if (!TextUtils.isEmpty(this.s)) {
            build.setBizTopic(this.s);
        }
        String str3 = this.k;
        if (str3 != null) {
            build.setUnitStrategy(str3);
        }
        Map<String, String> map = this.n;
        if (map != null) {
            build.mtopProp.setRequestHeaders(map);
        }
        if (obj != null) {
            build.reqContext(obj);
        }
        build.setErrorNotifyAfterCache(true);
        String str4 = this.x;
        if (str4 != null) {
            build.setTraceId(str4);
        }
        this.c = build;
        x55.j(this.t);
        if (uxVar.d()) {
            mtopListener = new AsyncResponse(uxVar, u55Var, build);
        } else if (v9v.i("newUltron_container", "mtopCallbackInWorkerThread", false) || cw6.b()) {
            mtopListener = new WorkerThreadResponse(uxVar, u55Var, build);
        } else {
            mtopListener = new Response(uxVar, u55Var, build);
        }
        if (this.q == null) {
            build.addListener(mtopListener).startRequest();
        } else {
            build.addListener(mtopListener).startRequest(this.q);
        }
        vxu.d(this.d, this.b);
        return true;
    }

    public final Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79854d7f", new Object[]{this});
        }
        if (!(this.t instanceof Activity)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String[] strArr = {"preBizName"};
            for (int i = 0; i < 1; i++) {
                String str = strArr[i];
                String queryParameter = ((Activity) this.t).getIntent().getData().getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
