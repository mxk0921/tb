package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import tb.xg4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BinderAdapter implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5253a;
    private final String b;
    private final String c;
    private BinderCallBack d;
    private IBinder e;
    private final Object f = new Object();
    private boolean g = false;
    private Handler h = null;
    private Handler i = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface BinderCallBack {
        void onBinderFailed(int i);

        void onBinderFailed(int i, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.f5253a = context;
        this.b = str;
        this.c = str2;
    }

    private void c() {
        synchronized (this.f) {
            try {
                Handler handler = this.h;
                if (handler != null) {
                    handler.removeMessages(getConnTimeOut());
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null || message.what != BinderAdapter.this.getMsgDelayDisconnect()) {
                    return false;
                }
                HMSLog.i("BinderAdapter", "The serviceConnection has been bind for 1800s, need to unbind.");
                BinderAdapter.this.unBind();
                BinderCallBack f = BinderAdapter.this.f();
                if (f == null) {
                    return true;
                }
                f.onTimedDisconnected();
                return true;
            }
        });
        this.i = handler;
        handler.sendEmptyMessageDelayed(getMsgDelayDisconnect(), xg4.DEFAULT_SMALL_MAX_AGE);
    }

    private void e() {
        HMSLog.e("BinderAdapter", "In connect, bind core service fail");
        try {
            ComponentName componentName = new ComponentName(this.f5253a.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());
            BinderCallBack f = f();
            if (f != null) {
                f.onBinderFailed(-1, intent);
            }
        } catch (RuntimeException e) {
            HMSLog.e("BinderAdapter", "getBindFailPendingIntent failed " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BinderCallBack f() {
        return this.d;
    }

    private void g() {
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(getConnTimeOut());
        } else {
            this.h = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message == null || message.what != BinderAdapter.this.getConnTimeOut()) {
                        return false;
                    }
                    HMSLog.e("BinderAdapter", "In connect, bind core service time out");
                    BinderAdapter.this.b();
                    return true;
                }
            });
        }
        this.h.sendEmptyMessageDelayed(getConnTimeOut(), 10000L);
    }

    private void h() {
        HMSLog.d("BinderAdapter", "removeDelayDisconnectTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack != null) {
            this.d = binderCallBack;
            a();
        }
    }

    public int getConnTimeOut() {
        return 0;
    }

    public int getMsgDelayDisconnect() {
        return 0;
    }

    public String getServiceAction() {
        return this.b;
    }

    public IBinder getServiceBinder() {
        return this.e;
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        HMSLog.e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.g) {
            this.g = false;
            return;
        }
        unBind();
        c();
        BinderCallBack f = f();
        if (f != null) {
            f.onNullBinding(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.e = iBinder;
        c();
        BinderCallBack f = f();
        if (f != null) {
            f.onServiceConnected(componentName, iBinder);
        }
        d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack f = f();
        if (f != null) {
            f.onServiceDisconnected(componentName);
        }
        h();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f5253a, this);
    }

    public void updateDelayTask() {
        HMSLog.d("BinderAdapter", "updateDelayTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                    this.i.sendEmptyMessageDelayed(getMsgDelayDisconnect(), xg4.DEFAULT_SMALL_MAX_AGE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) {
            e();
        }
        Intent intent = new Intent(this.b);
        try {
            intent.setPackage(this.c);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
            e();
        }
        synchronized (this.f) {
            try {
                if (this.f5253a.bindService(intent, this, 1)) {
                    g();
                    return;
                }
                this.g = true;
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BinderCallBack f = f();
        if (f != null) {
            f.onBinderFailed(-1);
        }
    }
}
