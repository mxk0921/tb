package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.AccsMainService;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.center.IAccsMainBinder;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.brt;
import tb.lef;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lef {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IntentDispatch";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f23291a;
    public static final ConcurrentHashMap<String, Messenger> b = new ConcurrentHashMap<>();
    public static ScheduledThreadPoolExecutor c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends ScheduledThreadPoolExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.lef$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0979a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f23292a;

            public RunnableC0979a(Runnable runnable) {
                this.f23292a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f23292a.run();
                } catch (Throwable th) {
                    ALog.e(lef.TAG, "getIpcScheduledExecutor err", th, new Object[0]);
                }
            }
        }

        public a(int i, ThreadFactory threadFactory) {
            super(i, threadFactory);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 452660730) {
                super.execute((Runnable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/dispatch/IntentDispatch$1");
        }

        @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                super.execute(new RunnableC0979a(runnable));
            }
        }
    }

    public static /* synthetic */ void b(Context context, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a66ee9b", new Object[]{context, str, str2, str3, str4, new Boolean(z)});
        } else {
            m(context, str, str2, str3, str4, z);
        }
    }

    public static /* synthetic */ ConcurrentHashMap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("21008e2e", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ void d(Context context, ServiceConnection serviceConnection, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09b6979", new Object[]{context, serviceConnection, componentName});
        } else {
            l(context, serviceConnection, componentName);
        }
    }

    public static void g(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe72662", new Object[]{context, str, str2});
        } else if (!((ArrayList) f23291a).contains(str2)) {
            ALog.i(TAG, "dynamicEnableService, not exist in list", new Object[0]);
        } else {
            ALog.i(TAG, "dynamicEnableService start", new Object[0]);
            ComponentName componentName = new ComponentName(str, str2);
            if (!UtilityImpl.getServiceEnabled(context, componentName)) {
                UtilityImpl.enableService(context, componentName);
            }
        }
    }

    public static ScheduledThreadPoolExecutor h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f983ab57", new Object[0]);
        }
        if (c == null) {
            synchronized (lef.class) {
                try {
                    if (c == null) {
                        a aVar = new a(1, new brt.a("ACCS-IPC"));
                        c = aVar;
                        aVar.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        c.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static b i(Context context, Intent intent, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aa2d2de6", new Object[]{context, intent, str, new Boolean(z), str2});
        }
        return new b(context, intent, str, z, str2);
    }

    public static void m(Context context, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b3e91", new Object[]{context, str, str2, str3, str4, new Boolean(z)});
        } else if (context.getPackageName().equals(str)) {
            if (z) {
                c71.b("accs", BaseMonitor.ALARM_POINT_BIND, str2);
            } else {
                c71.a("accs", BaseMonitor.ALARM_POINT_BIND, str2, str3, str4);
            }
        }
    }

    public static void l(Context context, ServiceConnection serviceConnection, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3952d8ca", new Object[]{context, serviceConnection, componentName});
            return;
        }
        try {
            if (!m8l.r() || componentName == null || !xd0.channelService.equals(componentName.getClassName())) {
                context.unbindService(serviceConnection);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "saveUnbindService err", th, new Object[0]);
        }
    }

    static {
        t2o.a(343933101);
        ArrayList arrayList = new ArrayList();
        f23291a = arrayList;
        arrayList.add("org.android.agoo.accs.AgooService");
        arrayList.add("com.taobao.taobao.TaobaoIntentService");
        arrayList.add(xd0.msgService);
    }

    public static void k(Context context, Intent intent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156be370", new Object[]{context, intent});
            return;
        }
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(intent.getComponent(), 4);
            if (serviceInfo != null) {
                if (serviceInfo.processName.endsWith(":channel")) {
                    z = com.taobao.accs.connection.state.a.v().y(context);
                } else {
                    z = com.taobao.accs.connection.state.a.v().A(context);
                }
                if (!z) {
                    ALog.e(TAG, "recordStartProcService", "service", intent);
                    c71.c("accs", BaseMonitor.COUNT_START_PROC_SERVICE, serviceInfo.name, vu3.b.GEO_NOT_SUPPORT);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void j(b bVar, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94206e9", new Object[]{bVar, str, new Boolean(z), new Integer(i)});
        } else if (!b.b(bVar)) {
            ALog.e(TAG, "ipc timeout ", "dataId", str, "sc", Integer.valueOf(bVar.hashCode()), "bindServiceRet", Boolean.valueOf(z));
            c71.c("accs", BaseMonitor.COUNT_IPC_TIMEOUT, str + "|" + z + "|" + i, 1.0d);
        }
    }

    public static void f(Context context, Intent intent) {
        String str;
        String str2;
        Messenger messenger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8613e8", new Object[]{context, intent});
        } else if (context == null || intent == null) {
            ALog.e(TAG, "dispatchIntent context or intent is null", new Object[0]);
        } else {
            Context applicationContext = context.getApplicationContext();
            try {
                if (intent.getComponent() == null) {
                    str = intent.toString();
                    str2 = "";
                } else {
                    str = intent.getComponent().getClassName();
                    str2 = intent.getComponent().getPackageName();
                }
                g(applicationContext, str2, str);
                if ((AccsMainService.className.equals(str) && h.c()) || (xd0.msgService.equals(str) && h.f())) {
                    ALog.e(TAG, "try use MainBinder", FluidException.SERVICE_NAME, str);
                    IBinder mainBinder = GlobalClientInfo.getInstance(context).getMainBinder();
                    if (mainBinder != null) {
                        IAccsMainBinder.Stub.asInterface(mainBinder).onMessage(intent);
                        c71.b("accs", BaseMonitor.ALARM_MAIN_BINDER_IPC_RES, str);
                        return;
                    }
                    ALog.e(TAG, "MainBinder null, downgrade", "service", str);
                    if (UtilityImpl.isMainProcessAlive(context)) {
                        String valueOf = String.valueOf(com.taobao.accs.connection.state.a.v().A(context));
                        c71.a("accs", BaseMonitor.ALARM_MAIN_BINDER_IPC_RES, pg1.ATOM_EXT_Null, "-1", valueOf);
                        c71.a("accs", BaseMonitor.ALARM_MAIN_BINDER_IPC_FAIL, pg1.ATOM_EXT_Null, "-1", valueOf);
                    }
                }
                if (czv.h(applicationContext)) {
                    ALog.e(TAG, "dispatchIntent bind service start", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent.toString());
                    String stringExtra = intent.getStringExtra("serviceId");
                    boolean z = j8l.z(applicationContext, 3, stringExtra);
                    boolean z2 = (!z || intent.getBooleanExtra(Constants.KEY_REUSE_BINDER, true)) ? z : false;
                    if (!z2 || (messenger = b.get(stringExtra)) == null) {
                        e(applicationContext, intent, str2, z2, stringExtra, str);
                        return;
                    }
                    Message message = new Message();
                    message.getData().putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
                    messenger.send(message);
                    ALog.e(TAG, "reuseBinder succ", new Object[0]);
                    m(context, str2, TriggerChannelService.EXTRA_BINDER, null, null, true);
                    return;
                }
                ALog.e(TAG, "dispatchIntent start service ", new Object[0]);
                applicationContext.startService(intent);
            } catch (Exception e) {
                ALog.e(TAG, "dispatchIntent method call with exception ", e, new Object[0]);
                if (czv.h(applicationContext)) {
                    m(context, null, "bind_svc", "2003", UtilityImpl.getExceptionMsg(e), false);
                }
            }
        }
    }

    public static void e(Context context, Intent intent, String str, boolean z, String str2, String str3) {
        final boolean z2;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f6fe78", new Object[]{context, intent, str, new Boolean(z), str2, str3});
            return;
        }
        int i = (!z || !UtilityImpl.isAppKeepAlive()) ? 1 : 33;
        k(context, intent);
        final b i2 = i(context, intent, str, z, str2);
        if (!UtilityImpl.isChannelProcess(context) || Build.VERSION.SDK_INT < 31) {
            z2 = context.bindService(intent, i2, i);
        } else {
            z2 = context.bindService(intent, i, h(), i2);
        }
        final int i3 = tv9.h().i();
        final String stringExtra = intent.getStringExtra("dataId");
        Boolean valueOf = Boolean.valueOf(z);
        if (i3 == 1) {
            str4 = "fore";
        } else {
            str4 = "back";
        }
        ALog.e(TAG, "bindService， ", "serviceId", str2, "dataId", stringExtra, "reuseBinder", valueOf, "ForeBack", str4, "bindServiceRet", Boolean.valueOf(z2), "sc", Integer.valueOf(i2.hashCode()));
        if (!z2) {
            c71.c("accs", BaseMonitor.COUNT_MSG_LOST, "bindService", 1.0d);
            m(context, str, "bind_svc", "2001", null, false);
        }
        if (Constants.IMPAAS.equals(str2)) {
            brt.h().schedule(new Runnable() { // from class: tb.kef
                @Override // java.lang.Runnable
                public final void run() {
                    lef.j(lef.b.this, stringExtra, z2, i3);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f23293a;
        public final Intent b;
        public final String c;
        public final boolean d;
        public final String e;
        public boolean f = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements IBinder.DeathRecipient {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IBinder f23294a;

            public a(IBinder iBinder) {
                this.f23294a = iBinder;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                    return;
                }
                ALog.e(lef.TAG, "on binderDied", new Object[0]);
                try {
                    lef.c().remove(b.a(b.this));
                    this.f23294a.unlinkToDeath(this, 0);
                } catch (Throwable th) {
                    ALog.e(lef.TAG, "binderDied err", th, new Object[0]);
                }
            }
        }

        static {
            t2o.a(343933104);
        }

        public b(Context context, Intent intent, String str, boolean z, String str2) {
            this.f23293a = context;
            this.b = intent;
            this.c = str;
            this.d = z;
            this.e = str2;
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43ff98f6", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1b7d4e2c", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            ALog.e(lef.TAG, "bindService on disconnect", "componentName", componentName.toString());
            if (!m8l.r()) {
                lef.d(this.f23293a, this, componentName);
            }
            if (this.d) {
                lef.c().remove(this.e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            this.f = true;
            if (componentName == null || !"com.alibaba.dingtalk.accs.connection.AccsBridgeService".equals(componentName.getClassName())) {
                ALog.d(lef.TAG, "bindService connected", "componentName", componentName.toString(), "sc", Integer.valueOf(hashCode()));
            } else {
                ALog.e(lef.TAG, "bindService connected", "componentName", componentName.toString(), "sc", Integer.valueOf(hashCode()));
            }
            Messenger messenger = new Messenger(iBinder);
            Message message = new Message();
            try {
                message.getData().putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.b);
                messenger.send(message);
                lef.b(this.f23293a, this.c, "bind_svc", null, null, true);
                if (this.d) {
                    lef.c().put(this.e, messenger);
                    iBinder.linkToDeath(new a(iBinder), 0);
                }
                if (this.d) {
                    return;
                }
            } catch (Throwable th) {
                try {
                    ALog.e(lef.TAG, "dispatch intent with exception", th, "\nCause:", th.getCause());
                    String exceptionMsg = UtilityImpl.getExceptionMsg(th);
                    lef.b(this.f23293a, this.c, "bind_svc", "2002", exceptionMsg, false);
                    c71.c("accs", BaseMonitor.COUNT_MSG_LOST, "bindService_ipc", vu3.b.GEO_NOT_SUPPORT);
                    if (com.taobao.accs.connection.state.a.v().A(this.f23293a) && j8l.z(this.f23293a, 6, this.e) && exceptionMsg.startsWith("android.os.DeadObjectException")) {
                        ALog.e(lef.TAG, "turn to using listener", new Object[0]);
                        AccsDataListener listener = GlobalClientInfo.getInstance(this.f23293a).getListener(this.e);
                        if (listener != null) {
                            f70.h(this.f23293a, this.b, listener);
                        }
                        if (Constants.IMPAAS.equals(this.e)) {
                            AccsDataListener listener2 = GlobalClientInfo.getInstance(this.f23293a).getListener(Constants.IMPAAS_MOCK);
                            if (listener2 != null) {
                                String stringExtra = this.b.getStringExtra("dataId");
                                ALog.e(lef.TAG, "callback by mockListener", "dataId", stringExtra);
                                c71.c("accs", BaseMonitor.COUNT_TRY_MOCK_LISTENER, stringExtra, 1.0d);
                                f70.h(this.f23293a, this.b, listener2);
                            }
                        } else {
                            c71.c("accs", BaseMonitor.COUNT_VERIFY, "turnToListener", vu3.b.GEO_NOT_SUPPORT);
                        }
                    }
                    if (this.d) {
                        return;
                    }
                } catch (Throwable th2) {
                    if (!this.d) {
                        lef.d(this.f23293a, this, componentName);
                    }
                    throw th2;
                }
            }
            lef.d(this.f23293a, this, componentName);
        }
    }
}
