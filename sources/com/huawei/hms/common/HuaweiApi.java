package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f7l;
import tb.fdt;
import tb.tct;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    private Context f5291a;
    private TOption b;
    private Context c;
    private AbstractClientBuilder<?, TOption> d;
    private String e;
    private String f;
    private SubAppInfo g;
    private WeakReference<Activity> h;
    private int i;
    private int j = 1;
    private boolean k = false;
    private String l;
    private boolean m;
    private RequestManager n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final AnyClient b;
        private final HuaweiApi<OptionsT> d;
        private ResolveClientBean e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* renamed from: a  reason: collision with root package name */
        private final Queue<TaskApiCallbackWrapper> f5293a = new LinkedList();
        private ConnectionResult c = null;

        public RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.d = huaweiApi;
            this.b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            Context context;
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.f5293a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            if (((HuaweiApi) this.d).c == null) {
                context = this.d.getContext();
            } else {
                context = ((HuaweiApi) this.d).c;
            }
            String packageName = context.getPackageName();
            if (((HuaweiApi) this.d).c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.d;
                huaweiApi.b(((HuaweiApi) huaweiApi).c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.d.getAppID() + "|" + this.d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.d.getApiLevel(), taskApiCall.getApiLevel()));
            this.b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack b = taskApiCallbackWrapper.b();
                    if (b != null) {
                        b.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f5293a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* renamed from: a  reason: collision with root package name */
                private AtomicBoolean f5294a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.a();
                        HMSLog.i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f5294a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.d.getContext(), responseHeader, String.valueOf(RequestHandler.this.d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            HMSLog.i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", "run queue size = " + this.f5293a.size());
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                a(taskApiCallbackWrapper);
            }
            for (TaskApiCallbackWrapper taskApiCallbackWrapper2 : this.f5293a) {
                a(taskApiCallbackWrapper2);
            }
            this.callbackWaitQueue.clear();
            this.f5293a.clear();
            this.c = null;
            this.b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.c = connectionResult;
            boolean z = true;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                TaskApiCallWrapper a2 = taskApiCallbackWrapper.a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + a(connectionResult) + f7l.BRACKET_START_STR + connectionResult.getErrorCode() + f7l.BRACKET_END_STR);
                responseHeader.setTransactionId(a2.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.d.getContext(), responseHeader, String.valueOf(this.d.getKitSdkVersion()));
                if (this.c.getResolution() != null && z) {
                    responseHeader.setParcelable(this.c.getResolution());
                    if (Util.isAvailableLibExist(this.d.getContext()) && this.c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z = false;
                }
                int errorCode = this.c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                a2.getTaskApiCall().onResponse(this.b, responseHeader, null, a2.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f5293a.clear();
            this.c = null;
            this.b.disconnect();
        }

        public void a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper b = b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.d).f5291a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.b.isConnected() && !((HuaweiApi) this.d).m && ((BaseHmsClient) this.b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.b.disconnect();
                }
            }
            if (this.b.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(b);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(b);
            ConnectionResult connectionResult = this.c;
            if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                RequestManager.addRequestToQueue(this);
                AnyClient anyClient = this.b;
                if (anyClient instanceof BaseHmsClient) {
                    ((BaseHmsClient) anyClient).setInternalRequest(this);
                }
                a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), b);
                return;
            }
            HMSLog.i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.c.getErrorCode());
            onConnectionFailed(this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.c = null;
            this.f5293a.clear();
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                postMessage(taskApiCallbackWrapper);
            }
            this.callbackWaitQueue.clear();
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.d.getAppID(), str2) : str;
        }

        public synchronized void a(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.b.isConnected()) {
                HMSLog.d("HuaweiApi", "client is connected");
            } else if (this.b.isConnecting()) {
                HMSLog.d("HuaweiApi", "client is isConnecting");
            } else {
                if (this.d.getActivity() != null) {
                    if (this.e == null) {
                        this.e = new ResolveClientBean(this.b, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.e)) {
                        HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                        return;
                    }
                    BindResolveClients.getInstance().register(this.e);
                }
                this.b.connect(i);
            }
        }

        public void a() {
            this.b.disconnect();
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper a2 = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(a2.getTaskApiCall().getTransactionId());
            a2.getTaskApiCall().onResponse(this.b, responseHeader, null, a2.getTaskCompletionSource());
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
            if (r9 != 10) goto L_0x0032;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String a(com.huawei.hms.api.ConnectionResult r9) {
            /*
                r8 = this;
                com.huawei.hms.common.HuaweiApi<OptionsT extends com.huawei.hms.api.Api$ApiOptions> r0 = r8.d
                android.content.Context r0 = r0.getContext()
                boolean r0 = com.huawei.hms.utils.Util.isAvailableLibExist(r0)
                java.lang.String r1 = "get update result, but has other error codes"
                java.lang.String r2 = "internal error"
                java.lang.String r3 = "application configuration error, please developer check configuration"
                java.lang.String r4 = "unknown errorReason"
                r5 = 10
                r6 = 8
                r7 = -1
                if (r0 == 0) goto L_0x004d
                int r9 = r9.getErrorCode()
                if (r9 == r7) goto L_0x0058
                r0 = 3
                if (r9 == r0) goto L_0x004a
                if (r9 == r6) goto L_0x0048
                if (r9 == r5) goto L_0x0046
                r0 = 13
                if (r9 == r0) goto L_0x0042
                r0 = 21
                if (r9 == r0) goto L_0x003f
                switch(r9) {
                    case 25: goto L_0x003c;
                    case 26: goto L_0x0038;
                    case 27: goto L_0x0034;
                    default: goto L_0x0032;
                }
            L_0x0032:
                r1 = r4
                goto L_0x0058
            L_0x0034:
                java.lang.String r1 = "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while"
                goto L_0x0058
            L_0x0038:
                java.lang.String r1 = "update failed, because no activity incoming, can't pop update page"
                goto L_0x0058
            L_0x003c:
                java.lang.String r1 = "failed to get update result"
                goto L_0x0058
            L_0x003f:
                java.lang.String r1 = "device is too old to be support"
                goto L_0x0058
            L_0x0042:
                java.lang.String r1 = "update cancelled"
                goto L_0x0058
            L_0x0046:
                r1 = r3
                goto L_0x0058
            L_0x0048:
                r1 = r2
                goto L_0x0058
            L_0x004a:
                java.lang.String r1 = "HuaWei Mobile Service is disabled"
                goto L_0x0058
            L_0x004d:
                int r9 = r9.getErrorCode()
                if (r9 == r7) goto L_0x0058
                if (r9 == r6) goto L_0x0048
                if (r9 == r5) goto L_0x0046
                goto L_0x0032
            L_0x0058:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.RequestHandler.a(com.huawei.hms.api.ConnectionResult):java.lang.String");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class TaskApiCallbackWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final TaskApiCallWrapper f5300a;
        private final AnyClient.CallBack b;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f5300a = taskApiCallWrapper;
            this.b = callBack;
        }

        public TaskApiCallWrapper a() {
            return this.f5300a;
        }

        public AnyClient.CallBack b() {
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final HuaweiApi<OptionsT> f5301a;
        private final TaskApiCallWrapper b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f5301a = huaweiApi;
            this.b = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(com.huawei.hms.common.HuaweiApi.RequestHandler r8, java.lang.Throwable r9) {
            /*
                r7 = this;
                java.lang.String r0 = "HuaweiApi"
                r1 = 0
                com.huawei.hms.common.internal.AnyClient r8 = r8.getClient()     // Catch: all -> 0x0036
                com.huawei.hms.common.internal.ResponseHeader r2 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: all -> 0x0033
                java.lang.String r9 = r9.getMessage()     // Catch: all -> 0x0033
                r3 = 1
                r4 = 907135001(0x3611c819, float:2.1723156E-6)
                r2.<init>(r3, r4, r9)     // Catch: all -> 0x0033
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch: all -> 0x002f
                r9.<init>()     // Catch: all -> 0x002f
                java.lang.String r9 = r9.toString()     // Catch: all -> 0x002f
                com.huawei.hms.common.internal.TaskApiCallWrapper r3 = r7.b     // Catch: all -> 0x002c
                tb.fdt r3 = r3.getTaskCompletionSource()     // Catch: all -> 0x002c
                com.huawei.hms.common.internal.TaskApiCallWrapper r4 = r7.b     // Catch: all -> 0x002a
                com.huawei.hms.common.internal.TaskApiCall r1 = r4.getTaskApiCall()     // Catch: all -> 0x002a
                goto L_0x0051
            L_0x002a:
                r4 = move-exception
                goto L_0x003c
            L_0x002c:
                r4 = move-exception
                r3 = r1
                goto L_0x003c
            L_0x002f:
                r4 = move-exception
                r9 = r1
                r3 = r9
                goto L_0x003c
            L_0x0033:
                r9 = move-exception
                r4 = r9
                goto L_0x0039
            L_0x0036:
                r8 = move-exception
                r4 = r8
                r8 = r1
            L_0x0039:
                r9 = r1
                r2 = r9
                r3 = r2
            L_0x003c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "<notifyCpException> "
                r5.<init>(r6)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.huawei.hms.support.log.HMSLog.e(r0, r4)
            L_0x0051:
                if (r8 == 0) goto L_0x005f
                if (r2 == 0) goto L_0x005f
                if (r9 == 0) goto L_0x005f
                if (r3 == 0) goto L_0x005f
                if (r1 == 0) goto L_0x005f
                r1.onResponse(r8, r2, r9, r3)
                goto L_0x0064
            L_0x005f:
                java.lang.String r8 = "<notifyCpException> isNotify is false, Can not notify CP."
                com.huawei.hms.support.log.HMSLog.e(r0, r8)
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.a.a(com.huawei.hms.common.HuaweiApi$RequestHandler, java.lang.Throwable):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f5301a);
            try {
                requestHandler.a(this.b);
            } catch (Throwable th) {
                a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, null);
    }

    @Deprecated
    public tct<Boolean> disconnectService() {
        final fdt fdtVar = new fdt();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a(this, fdtVar);
            }
        });
        return fdtVar.b();
    }

    public <TResult, TClient extends AnyClient> tct<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        String str;
        this.k = true;
        if (taskApiCall == null) {
            HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
            fdt fdtVar = new fdt();
            fdtVar.c(new ApiException(Status.FAILURE));
            return fdtVar.b();
        }
        if (TextUtils.isEmpty(this.g.getSubAppID())) {
            str = this.f;
        } else {
            str = this.g.getSubAppID();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.f5291a, taskApiCall.getUri(), str, taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.n == null) {
            this.n = RequestManager.getInstance();
        }
        return a(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.j;
    }

    public String getAppID() {
        return this.f;
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.d.buildClient(this.f5291a, getClientSetting(), requestHandler, requestHandler);
    }

    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.f5291a.getPackageName(), this.f5291a.getClass().getName(), getScopes(), this.e, null, this.g);
        if (!this.m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f5291a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.l = hMSPackageNameForMultiService;
            HMSLog.i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.l);
        }
        clientSettings.setInnerHmsPkg(this.l);
        clientSettings.setUseInnerHms(this.m);
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.f5291a;
    }

    public int getKitSdkVersion() {
        return this.i;
    }

    public TOption getOption() {
        return this.b;
    }

    public List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.g.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.j = i;
    }

    public void setHostContext(Context context) {
        this.c = context;
    }

    public void setInnerHms() {
        this.l = this.f5291a.getPackageName();
        this.m = true;
        HMSLog.i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.l);
    }

    public void setKitSdkVersion(int i) {
        this.i = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        } else if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        } else {
            String subAppID = subAppInfo.getSubAppID();
            if (TextUtils.isEmpty(subAppID)) {
                HMSLog.e("HuaweiApi", "subAppId is empty");
                return false;
            } else if (subAppID.equals(this.e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
                return false;
            } else if (this.k) {
                HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
                return false;
            } else {
                this.g = new SubAppInfo(subAppInfo);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.e = appId;
        this.f = appId;
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.f5291a = context.getApplicationContext();
        this.b = toption;
        this.d = abstractClientBuilder;
        b(context);
        this.g = new SubAppInfo("");
        this.i = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is ".concat(str));
                this.g = new SubAppInfo(str);
            }
        }
        a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, fdt<Boolean> fdtVar) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            fdtVar.d(Boolean.TRUE);
        } catch (Exception e) {
            HMSLog.w("HuaweiApi", "disconnect the binder failed for:" + e.getMessage());
        }
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, str);
    }

    private <TResult, TClient extends AnyClient> tct<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        fdt fdtVar = new fdt();
        RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, fdtVar)));
        return fdtVar.b();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
