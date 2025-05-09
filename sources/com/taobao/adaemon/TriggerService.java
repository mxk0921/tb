package com.taobao.adaemon;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.TriggerService;
import com.taobao.aranger.exception.IPCException;
import com.taobao.login4android.qrcode.data.QrCodeData;
import com.taobao.monitor.impl.common.ProcessStart;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f;
import tb.mf;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TriggerService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FLAG_AUTO_START = "auto_start";
    public static final String FLAG_PROVIDER_START = "provider_start";
    public static final String KEY_TYPE = "type";
    public static final int TYPE_COMMAND = 2;
    public static final int TYPE_NONE = -1;
    public static final int TYPE_PUSH = 4;
    public static final int TYPE_RECENT = 8;
    public static final int TYPE_SCHEDULE = 1;
    public static final int TYPE_UNKNOW = 64;
    public static boolean c;
    public static boolean d;
    public static int f;
    public static final Method h;
    public static final ITrigger i;

    /* renamed from: a  reason: collision with root package name */
    public final Messenger f6134a = new Messenger(g);
    public static final AtomicBoolean b = new AtomicBoolean();
    public static volatile int e = -1;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void f(Intent intent) {
        Method method = h;
        if (method != null) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("isTriggerAlive", false);
                method.invoke(null, Integer.valueOf(booleanExtra ? 1 : 0));
                s55.i("TriggerService", "main isTrigger:" + booleanExtra, new Object[0]);
            } catch (Exception e2) {
                s55.h("TriggerService", "invoke set process start type into apm error", e2, new Object[0]);
            }
        }
    }

    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f87135", new Object[0]);
        } else if (g.P()) {
            ProcessController.IPC.d(i);
        }
    }

    public static /* synthetic */ Object ipc$super(TriggerService triggerService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/adaemon/TriggerService");
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        s55.i("TriggerService", "attachBaseContext()", new Object[0]);
    }

    public final /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b14e0d", new Object[]{this});
            return;
        }
        s55.i("TriggerService", "delay start", new Object[0]);
        l(getApplicationContext());
    }

    public final /* synthetic */ boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2bf6592", new Object[]{this})).booleanValue();
        }
        s55.i("TriggerService", "main idle", new Object[0]);
        l(getApplicationContext());
        return false;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        g.Y(true);
        s55.i("TriggerService", "onCreate()", new Object[0]);
        b.set(false);
    }

    public static /* synthetic */ void j(String str) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b229740c", new Object[]{str});
            return;
        }
        try {
            if (ITrigger.TYPE_SYS_SCHEDULE.equals(str)) {
                l(g.l());
            }
        } catch (Throwable th) {
            s55.h("TriggerService", "trigger err", th, new Object[0]);
        }
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df05e0e", new Object[]{context});
            return;
        }
        try {
            if (g.P() && g.S() && TimeMeter.a("adaemon_trigger", QrCodeData.QR_CODE_VALID_PERIOD)) {
                context.startService(new Intent(context, TriggerService.class));
                b.set(true);
                s55.i("TriggerService", "startService success", new Object[0]);
            }
        } catch (Throwable th) {
            s55.h("TriggerService", "startService err", th, new Object[0]);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i2), new Integer(i3)})).intValue();
        }
        s55.i("TriggerService", "onStartCommand()", new Object[0]);
        k(intent);
        return 2;
    }

    public final void k(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1513400", new Object[]{this, intent});
            return;
        }
        int intExtra = intent == null ? 64 : intent.getIntExtra("type", 64);
        f |= intExtra;
        if (e == -1) {
            e = intExtra;
            s55.i("TriggerService", "setType()", "triggerType", Integer.valueOf(e));
            if (e != -1 && e != 64) {
                mf.l(new Runnable() { // from class: tb.jgu
                    @Override // java.lang.Runnable
                    public final void run() {
                        TriggerService.i();
                    }
                });
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(final Intent intent) {
        MessageQueue queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        mf.l(new Runnable() { // from class: tb.ggu
            @Override // java.lang.Runnable
            public final void run() {
                TriggerService.f(intent);
            }
        });
        k(intent);
        if (!c) {
            c = true;
            boolean booleanExtra = intent.getBooleanExtra(FLAG_AUTO_START, true);
            d = intent.getBooleanExtra(FLAG_PROVIDER_START, false);
            s55.i("TriggerService", "startService from onBind", "autoStart", Boolean.valueOf(booleanExtra), "fromProviderStart", Boolean.valueOf(d), "tiny", Boolean.valueOf(g.S()));
            if (booleanExtra) {
                l(getApplicationContext());
            } else if (Build.VERSION.SDK_INT >= 23) {
                try {
                    if (f.i()) {
                        mf.k(new Runnable() { // from class: tb.hgu
                            @Override // java.lang.Runnable
                            public final void run() {
                                TriggerService.this.g();
                            }
                        }, 10L, TimeUnit.SECONDS);
                    } else {
                        queue = Looper.getMainLooper().getQueue();
                        queue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: tb.igu
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                boolean h2;
                                h2 = TriggerService.this.h();
                                return h2;
                            }
                        });
                    }
                } catch (Throwable th) {
                    s55.h("TriggerService", "startService when idle", th, new Object[0]);
                }
            }
        }
        return this.f6134a.getBinder();
    }

    static {
        t2o.a(349175882);
        try {
            Method method = ProcessStart.class.getMethod("setProcessStartType", Integer.TYPE);
            h = method;
            method.setAccessible(true);
        } catch (Throwable unused) {
            h = null;
        }
        i = new ITrigger() { // from class: com.taobao.adaemon.f
            @Override // com.taobao.adaemon.ITrigger
            public final void onTrigger(String str) {
                TriggerService.j(str);
            }
        };
    }
}
