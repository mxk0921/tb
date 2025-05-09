package com.taobao.accs.center;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.IGlobalClientInfoService;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.center.IAccsMainBinder;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.intf.ProcessStateListener;
import java.util.concurrent.ConcurrentHashMap;
import tb.brt;
import tb.c71;
import tb.re;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AccsMainCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = AccsMainCenter.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final AccsMainBinderImpl f6024a;
    public final Context b;
    public volatile boolean c;
    public volatile boolean d;
    public final ConcurrentHashMap<String, Service> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class AccsMainBinderImpl extends IAccsMainBinder.Stub {
        static {
            t2o.a(343933023);
        }

        private AccsMainBinderImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMessage$30(Intent intent) {
            ALog.e(AccsMainCenter.b(), "AccsMainBinderImpl onMessage called", new Object[0]);
            if (intent != null) {
                AccsMainCenter.c(AccsMainCenter.this, intent);
            }
        }

        @Override // com.taobao.accs.center.IAccsMainBinder
        public void onMessage(final Intent intent) throws RemoteException {
            brt.d().execute(new Runnable() { // from class: com.taobao.accs.center.a
                @Override // java.lang.Runnable
                public final void run() {
                    AccsMainCenter.AccsMainBinderImpl.this.lambda$onMessage$30(intent);
                }
            });
        }

        public /* synthetic */ AccsMainBinderImpl(AccsMainCenter accsMainCenter, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ProcessStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("107b37c3", new Object[]{this, str});
            } else if ("com.taobao.taobao:channel".equals(str)) {
                ALog.e(AccsMainCenter.b(), "on channel process start", "mHasPublish", Boolean.valueOf(AccsMainCenter.d(AccsMainCenter.this)));
                AccsMainCenter.f(AccsMainCenter.this);
            }
        }

        @Override // com.taobao.aranger.intf.ProcessStateListener
        public void onProcessStop(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a7dcc3", new Object[]{this, str});
            } else if ("com.taobao.taobao:channel".equals(str)) {
                ALog.e(AccsMainCenter.b(), "on channel process stop", new Object[0]);
                AccsMainCenter.e(AccsMainCenter.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AccsMainCenter f6026a = new AccsMainCenter(null);

        static {
            t2o.a(343933024);
        }

        public static /* synthetic */ AccsMainCenter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccsMainCenter) ipChange.ipc$dispatch("c419547a", new Object[0]);
            }
            return f6026a;
        }
    }

    static {
        t2o.a(343933021);
    }

    public /* synthetic */ AccsMainCenter(a aVar) {
        this();
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ void c(AccsMainCenter accsMainCenter, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94380373", new Object[]{accsMainCenter, intent});
        } else {
            accsMainCenter.g(intent);
        }
    }

    public static /* synthetic */ boolean d(AccsMainCenter accsMainCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c044b59", new Object[]{accsMainCenter})).booleanValue();
        }
        return accsMainCenter.c;
    }

    public static /* synthetic */ boolean e(AccsMainCenter accsMainCenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c75725", new Object[]{accsMainCenter, new Boolean(z)})).booleanValue();
        }
        accsMainCenter.c = z;
        return z;
    }

    public static /* synthetic */ void f(AccsMainCenter accsMainCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bd8f4", new Object[]{accsMainCenter});
        } else {
            accsMainCenter.k();
        }
    }

    public static AccsMainCenter h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsMainCenter) ipChange.ipc$dispatch("6b3b14d3", new Object[0]);
        }
        return b.a();
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
        } else if (!this.d) {
            this.d = true;
            l(z);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314cacb4", new Object[]{this});
        } else {
            brt.h().execute(new Runnable() { // from class: tb.g70
                @Override // java.lang.Runnable
                public final void run() {
                    AccsMainCenter.this.j();
                }
            });
        }
    }

    public AccsMainCenter() {
        this.e = new ConcurrentHashMap<>();
        AccsMainBinderImpl accsMainBinderImpl = new AccsMainBinderImpl(this, null);
        this.f6024a = accsMainBinderImpl;
        Context context = GlobalClientInfo.getContext();
        this.b = context;
        GlobalClientInfo.getInstance(context).setMainBinder(accsMainBinderImpl);
    }

    public final void g(Intent intent) {
        String str = f;
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                String packageName = component.getPackageName();
                if (packageName == null || "com.taobao.taobao".equals(packageName)) {
                    String className = component.getClassName();
                    ConcurrentHashMap<String, Service> concurrentHashMap = this.e;
                    if (concurrentHashMap.containsKey(className)) {
                        ALog.e(str, "use cached", className);
                        concurrentHashMap.get(className).onStartCommand(intent, 0, 0);
                        return;
                    }
                    ALog.e(str, "reflect", "className", className);
                    Service service = (Service) Class.forName(className).newInstance();
                    concurrentHashMap.put(className, service);
                    service.onStartCommand(intent, 0, 0);
                }
            } catch (Throwable th) {
                ALog.e(str, "dispatchByClassName err:", th, new Object[0]);
            }
        }
    }

    public final /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82729d5f", new Object[]{this});
            return;
        }
        ALog.e(f, "publishMainBinderAsync", "mHasPublish", Boolean.valueOf(this.c));
        if (!this.c) {
            try {
                ((IGlobalClientInfoService) re.q(new ComponentName(this.b, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, this.b))).registerRemoteMainBinder(this.f6024a);
                this.c = true;
            } catch (Throwable th) {
                c71.a("accs", BaseMonitor.ALARM_PUBLISH_FAIL, "", "-1", th.toString());
                ALog.e(f, "publishMainBinderAsync exception", th, new Object[0]);
            }
        }
    }

    public void m(IGlobalClientInfoService iGlobalClientInfoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f69b03", new Object[]{this, iGlobalClientInfoService});
        } else if (!this.c && iGlobalClientInfoService != null) {
            ALog.e(f, "publishMainBinderNow", new Object[0]);
            try {
                iGlobalClientInfoService.registerRemoteMainBinder(this.f6024a);
                this.c = true;
            } catch (Throwable th) {
                c71.a("accs", BaseMonitor.ALARM_PUBLISH_FAIL, "", "-1", th.toString());
                ALog.e(f, "publishMainBinderNow exception", th, new Object[0]);
            }
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2d233b", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = f;
        ALog.e(str, "publishMainBinder", "force", Boolean.valueOf(z));
        re.C(new a());
        if (z || UtilityImpl.isChannelProcessAlive(this.b)) {
            ALog.e(str, "channel alive, publish now", new Object[0]);
            k();
        }
    }
}
