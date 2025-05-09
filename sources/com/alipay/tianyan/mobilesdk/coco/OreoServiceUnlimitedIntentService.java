package com.alipay.tianyan.mobilesdk.coco;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimited;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class OreoServiceUnlimitedIntentService extends IntentService implements IOreoServiceUnlimited {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OreoServiceUnlimitedIntentService";

    /* renamed from: a  reason: collision with root package name */
    public volatile Looper f4551a;
    public volatile ServiceHandler b;
    public final String c;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class ServiceHandler extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ServiceHandler(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(ServiceHandler serviceHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/tianyan/mobilesdk/coco/OreoServiceUnlimitedIntentService$ServiceHandler");
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            OreoServiceUnlimitedIntentService.access$000(OreoServiceUnlimitedIntentService.this, (Intent) message.obj);
            OreoServiceUnlimitedIntentService.this.stopSelf(message.arg1);
        }
    }

    public OreoServiceUnlimitedIntentService(String str) {
        super(str);
        this.c = str;
    }

    public static /* synthetic */ void access$000(OreoServiceUnlimitedIntentService oreoServiceUnlimitedIntentService, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435f13c5", new Object[]{oreoServiceUnlimitedIntentService, intent});
        } else {
            oreoServiceUnlimitedIntentService.onHandleIntent(intent);
        }
    }

    public static /* synthetic */ Object ipc$super(OreoServiceUnlimitedIntentService oreoServiceUnlimitedIntentService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1899989668:
                super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 51128253:
                return super.onBind((Intent) objArr[0]);
            case 413640386:
                super.onCreate();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/tianyan/mobilesdk/coco/OreoServiceUnlimitedIntentService");
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (!OreoServiceUnlimited.shouldUseIt(this)) {
            return super.onBind(intent);
        }
        return new OreoServiceUnlimited.WrappedBinder(null, this);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (!OreoServiceUnlimited.shouldUseIt(this)) {
            super.onCreate();
        } else {
            HandlerThread handlerThread = new HandlerThread("IntentService[" + this.c + "]");
            handlerThread.start();
            this.f4551a = handlerThread.getLooper();
            this.b = new ServiceHandler(this.f4551a);
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!OreoServiceUnlimited.shouldUseIt(this)) {
            super.onDestroy();
        } else {
            this.f4551a.quitSafely();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
        } else if (!OreoServiceUnlimited.shouldUseIt(this)) {
            super.onStart(intent, i);
        } else {
            Message obtainMessage = this.b.obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = intent;
            this.b.sendMessage(obtainMessage);
        }
    }
}
