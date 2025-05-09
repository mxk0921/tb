package com.taobao.adaemon;

import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TriggerChannelService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_BINDER = "binder";
    public static final String EXTRA_CHANNEL = "channel";
    public static final String EXTRA_MAIN = "main";
    public static final String EXTRA_ORIGIN = "origin";
    public static final String EXTRA_TYPE = "type";
    public static final int TRIGGER_VERSION_CODE = 305;
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final Messenger f6130a = new Messenger(b);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6131a;

        public a(int i) {
            this.f6131a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Intent intent = new Intent(TriggerChannelService.this.getPackageName() + "_ACTION_TP_TRIGGER");
            intent.setPackage(TriggerChannelService.this.getPackageName());
            TriggerChannelService.this.sendBroadcast(intent);
            s55.i("TriggerChannelService", "send broadcast: TP_TRIGGER " + this.f6131a, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f6132a;

        static {
            t2o.a(349175881);
        }

        public b(Application application) {
            this.f6132a = application;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            } else {
                this.f6132a.unbindService(this);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                this.f6132a.unbindService(this);
            }
        }
    }

    static {
        t2o.a(349175879);
    }

    public static /* synthetic */ Object ipc$super(TriggerChannelService triggerChannelService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/TriggerChannelService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        a(intent.getExtras());
        return this.f6130a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        s55.i("TriggerChannelService", null, "onCreate()");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.adaemon.TriggerChannelService.a(android.os.Bundle):void");
    }
}
