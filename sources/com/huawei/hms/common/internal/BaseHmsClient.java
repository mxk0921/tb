package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    protected static final int TIMEOUT_DISCONNECTED = 6;
    private static final Object i = new Object();
    private static final AtomicInteger j = new AtomicInteger(1);
    private static final AtomicInteger k = new AtomicInteger(1);
    private static BinderAdapter l;
    private static BinderAdapter m;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5307a;
    private String b;
    private final ClientSettings c;
    private volatile IAIDLInvoke d;
    private final ConnectionCallbacks e;
    private final OnConnectionFailedListener f;
    private Handler g = null;
    private HuaweiApi.RequestHandler h;
    protected String sessionId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class ConnectionResultWrapper {

        /* renamed from: a  reason: collision with root package name */
        private HuaweiApi.RequestHandler f5312a;
        private ConnectionResult b;

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
            this.f5312a = requestHandler;
            this.b = connectionResult;
        }

        public ConnectionResult getConnectionResult() {
            return this.b;
        }

        public HuaweiApi.RequestHandler getRequest() {
            return this.f5312a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.f5307a = context;
        this.c = clientSettings;
        if (clientSettings != null) {
            this.b = clientSettings.getAppID();
        }
        this.f = onConnectionFailedListener;
        this.e = connectionCallbacks;
    }

    private BinderAdapter.BinderCallBack d() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i2) {
                onBinderFailed(i2, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.b(1);
                BaseHmsClient.this.a(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.i("BaseHmsClient", "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.i("BaseHmsClient", "Enter onServiceDisconnected.");
                BaseHmsClient.this.b(1);
                RequestManager.getHandler().sendEmptyMessage(10013);
                if (BaseHmsClient.this.e != null && !(BaseHmsClient.this.e instanceof HuaweiApi.RequestHandler)) {
                    BaseHmsClient.this.e.onConnectionSuspended(1);
                }
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.b(6);
                if (BaseHmsClient.this.e != null && !(BaseHmsClient.this.e instanceof HuaweiApi.RequestHandler)) {
                    BaseHmsClient.this.e.onConnectionSuspended(1);
                }
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i2, Intent intent) {
                if (intent != null) {
                    Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                    if (activeActivity != null) {
                        HMSLog.i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
                        long time = new Timestamp(System.currentTimeMillis()).getTime();
                        FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                            @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                            public void binderCallBack(int i3) {
                                if (i3 != 0) {
                                    BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                                    BaseHmsClient.this.d = null;
                                }
                            }
                        });
                        intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                        activeActivity.startActivity(intent);
                        return;
                    }
                    HMSLog.i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.a(new ConnectionResult(10, ya.c(BaseHmsClient.this.f5307a, 11, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)));
                    BaseHmsClient.this.d = null;
                    return;
                }
                HMSLog.i("BaseHmsClient", "onBinderFailed: intent is null!");
                BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                BaseHmsClient.this.d = null;
            }
        };
    }

    private void e() {
        HMSLog.w("BaseHmsClient", "Failed to get service as interface, trying to unbind.");
        if (this.c.isUseInnerHms()) {
            BinderAdapter binderAdapter = m;
            if (binderAdapter == null) {
                HMSLog.w("BaseHmsClient", "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = l;
            if (binderAdapter2 == null) {
                HMSLog.w("BaseHmsClient", "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        b(1);
        a(10);
    }

    private void f() {
        if (this.c.isUseInnerHms()) {
            BinderAdapter binderAdapter = m;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = l;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(int i2) {
        a(i2, false);
    }

    public void connectedInternal(IBinder iBinder) {
        this.d = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.d == null) {
            HMSLog.e("BaseHmsClient", "mService is null, try to unBind.");
            e();
            return;
        }
        onConnecting();
    }

    public final void connectionConnected() {
        b(3);
        RequestManager.getHandler().sendEmptyMessage(10011);
        ConnectionCallbacks connectionCallbacks = this.e;
        if (connectionCallbacks != null && !(connectionCallbacks instanceof HuaweiApi.RequestHandler)) {
            connectionCallbacks.onConnected();
        }
    }

    public void disconnect() {
        AtomicInteger atomicInteger;
        if (this.c.isUseInnerHms()) {
            atomicInteger = k;
        } else {
            atomicInteger = j;
        }
        int i2 = atomicInteger.get();
        HMSLog.i("BaseHmsClient", "Enter disconnect, Connection Status: " + i2);
        if (i2 == 3) {
            f();
            b(1);
        } else if (i2 == 5) {
            b();
            b(1);
        }
    }

    public BinderAdapter getAdapter() {
        HMSLog.i("BaseHmsClient", "getAdapter:isInner:" + this.c.isUseInnerHms() + ", mInnerBinderAdapter:" + m + ", mOuterBinderAdapter:" + l);
        if (this.c.isUseInnerHms()) {
            return m;
        }
        return l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.c.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.b;
    }

    public ClientSettings getClientSettings() {
        return this.c;
    }

    public int getConnectionStatus() {
        AtomicInteger atomicInteger;
        if (this.c.isUseInnerHms()) {
            atomicInteger = k;
        } else {
            atomicInteger = j;
        }
        return atomicInteger.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f5307a;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.c.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.c.getClientPackageName();
    }

    public int getRequestHmsVersionCode() {
        return getMinApkVersion();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.d;
    }

    public String getServiceAction() {
        HMSPackageManager instance = HMSPackageManager.getInstance(this.f5307a);
        if (this.c.isUseInnerHms()) {
            return instance.getInnerServiceAction();
        }
        return instance.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.c.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (!this.c.isUseInnerHms() ? j.get() != 3 : k.get() != 3) {
            return false;
        }
        return true;
    }

    public boolean isConnecting() {
        AtomicInteger atomicInteger;
        if (this.c.isUseInnerHms()) {
            atomicInteger = k;
        } else {
            atomicInteger = j;
        }
        if (atomicInteger.get() == 5) {
            return true;
        }
        return false;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
        this.h = requestHandler;
    }

    public void setService(IAIDLInvoke iAIDLInvoke) {
        this.d = iAIDLInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return HMSPackageManager.getInstance(this.f5307a).getHMSPackageStatesForMultiService() == PackageManagerHelper.PackageStates.ENABLED;
    }

    public void b(int i2) {
        if (this.c.isUseInnerHms()) {
            k.set(i2);
        } else {
            j.set(i2);
        }
    }

    public void connect(int i2, boolean z) {
        a(i2, z);
    }

    private void b() {
        synchronized (i) {
            try {
                Handler handler = this.g;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        String innerHmsPkg = this.c.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.i("BaseHmsClient", "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        a(innerHmsPkg, serviceAction);
    }

    private void a(String str, String str2) {
        if (this.c.isUseInnerHms()) {
            m = InnerBinderAdapter.getInstance(this.f5307a, str2, str);
            if (isConnected()) {
                HMSLog.i("BaseHmsClient", "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            }
            b(5);
            m.binder(d());
            return;
        }
        l = OuterBinderAdapter.getInstance(this.f5307a, str2, str);
        if (isConnected()) {
            HMSLog.i("BaseHmsClient", "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
            return;
        }
        b(5);
        l.binder(d());
    }

    private void b(AvailableAdapter availableAdapter, int i2) {
        HMSLog.i("BaseHmsClient", "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f5307a, i2, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i3) {
                    if (i3 != 0 || !BaseHmsClient.this.c()) {
                        BaseHmsClient.this.a(i3);
                    } else {
                        BaseHmsClient.this.a();
                    }
                }
            });
        } else {
            a(26);
        }
    }

    private void a(int i2, boolean z) {
        HMSLog.i("BaseHmsClient", "====== HMSSDK version: 61100302 ======");
        int i3 = (this.c.isUseInnerHms() ? k : j).get();
        HMSLog.i("BaseHmsClient", "Enter connect, Connection Status: " + i3);
        if (z || !(i3 == 3 || i3 == 5)) {
            if (getMinApkVersion() > i2) {
                i2 = getMinApkVersion();
            }
            HMSLog.i("BaseHmsClient", "connect minVersion:" + i2 + " packageName:" + this.c.getInnerHmsPkg());
            if (this.f5307a.getPackageName().equals(this.c.getInnerHmsPkg())) {
                HMSLog.i("BaseHmsClient", "service packageName is same, bind core service return");
                a();
            } else if (Util.isAvailableLibExist(this.f5307a)) {
                AvailableAdapter availableAdapter = new AvailableAdapter(i2);
                int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(this.f5307a);
                HMSLog.i("BaseHmsClient", "check available result: " + isHuaweiMobileServicesAvailable);
                if (isHuaweiMobileServicesAvailable == 0) {
                    a();
                } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start resolution now.");
                    b(availableAdapter, isHuaweiMobileServicesAvailable);
                } else if (availableAdapter.isUserNoticeError(isHuaweiMobileServicesAvailable)) {
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start notice now.");
                    a(availableAdapter, isHuaweiMobileServicesAvailable);
                } else {
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail: " + isHuaweiMobileServicesAvailable + " is not resolvable.");
                    a(isHuaweiMobileServicesAvailable);
                }
            } else {
                int isHuaweiMobileServicesAvailable2 = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f5307a, i2);
                HMSLog.i("BaseHmsClient", "HuaweiApiAvailability check available result: " + isHuaweiMobileServicesAvailable2);
                if (isHuaweiMobileServicesAvailable2 == 0) {
                    a();
                } else {
                    a(isHuaweiMobileServicesAvailable2);
                }
            }
        }
    }

    private void a(AvailableAdapter availableAdapter, int i2) {
        HMSLog.i("BaseHmsClient", "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i2 == 29) {
                i2 = 9;
            }
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f5307a, i2, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i3) {
                    BaseHmsClient.this.a(i3);
                }
            });
        } else {
            a(26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + i2);
        Message message = new Message();
        message.what = 10012;
        message.obj = new ConnectionResultWrapper(this.h, new ConnectionResult(i2));
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f;
        if (onConnectionFailedListener != null && !(onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ConnectionResult connectionResult) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = 10012;
        HuaweiApi.RequestHandler requestHandler = this.h;
        this.h = null;
        message.obj = new ConnectionResultWrapper(requestHandler, connectionResult);
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f;
        if (onConnectionFailedListener != null && !(onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            onConnectionFailedListener.onConnectionFailed(connectionResult);
        }
    }
}
