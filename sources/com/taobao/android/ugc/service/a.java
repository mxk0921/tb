package com.taobao.android.ugc.service;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.service.IMicroPublishService;
import java.util.Stack;
import tb.jq4;
import tb.puc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements puc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_ACTION_NAME = "com.taobao.ugc.mini.service.publish";
    public static final Stack<ServiceConnection> f = new Stack<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9834a;
    public IMicroPublishService b;
    public final Application c;
    public final Application.ActivityLifecycleCallbacks d;
    public final Intent e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.ugc.service.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0508a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0508a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (a.a(a.this).equals(activity)) {
                a.this.k();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ICallback d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, ICallback iCallback) {
            super();
            this.b = str;
            this.c = str2;
            this.d = iCallback;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ugc/service/MicroPublishClient$2");
        }

        @Override // com.taobao.android.ugc.service.a.d
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                a.c(a.this).showView(a.b(a.this), this.b, this.c, this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Intent d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, Intent intent) {
            super();
            this.b = i;
            this.c = i2;
            this.d = intent;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ugc/service/MicroPublishClient$3");
        }

        @Override // com.taobao.android.ugc.service.a.d
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                a.c(a.this).onActivityResult(a.b(a.this), this.b, this.c, this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public abstract class d implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(758120522);
        }

        public d() {
        }

        public abstract void a(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            synchronized (a.this) {
                try {
                    if (a.c(a.this) == null) {
                        a.d(a.this, IMicroPublishService.Stub.asInterface(iBinder));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(componentName, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                a.d(a.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(758120523);
        }

        public e(a aVar) {
            super();
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ugc/service/MicroPublishClient$PublishServiceConnAdapter");
        }

        @Override // com.taobao.android.ugc.service.a.d
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
            }
        }
    }

    static {
        t2o.a(758120518);
        t2o.a(758120508);
    }

    public a(Context context) {
        C0508a aVar = new C0508a();
        this.d = aVar;
        this.f9834a = context;
        jq4.a(h(), context);
        Intent intent = new Intent(SERVICE_ACTION_NAME);
        this.e = intent;
        intent.setPackage(context.getPackageName());
        e(new e(this));
        Application g = g(context);
        this.c = g;
        g.registerActivityLifecycleCallbacks(aVar);
    }

    public static /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2ff033a1", new Object[]{aVar});
        }
        return aVar.f9834a;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ec646d8", new Object[]{aVar});
        }
        return aVar.h();
    }

    public static /* synthetic */ IMicroPublishService c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMicroPublishService) ipChange.ipc$dispatch("7a9aa06c", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ IMicroPublishService d(a aVar, IMicroPublishService iMicroPublishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMicroPublishService) ipChange.ipc$dispatch("25d59c95", new Object[]{aVar, iMicroPublishService});
        }
        aVar.b = iMicroPublishService;
        return iMicroPublishService;
    }

    public static Application g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("e3af6c79", new Object[]{context});
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        if (context instanceof ContextWrapper) {
            return g(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    public final synchronized void e(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10ffc25", new Object[]{this, serviceConnection});
            return;
        }
        f.push(serviceConnection);
        this.f9834a.bindService(this.e, serviceConnection, 1);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (i()) {
            try {
                this.b.dismiss(h());
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68335f89", new Object[]{this});
        }
        return this.f9834a.toString();
    }

    public final synchronized boolean i() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3e0c8ff0", new Object[]{this})).booleanValue();
            }
            if (this.b != null) {
                z = true;
            }
            return z;
        }
    }

    public void j(int i, int i2, Intent intent) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i()) {
            this.b.onActivityResult(h(), i, i2, intent);
        } else {
            e(new c(i, i2, intent));
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        m();
        Application application = this.c;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.d);
        }
        f();
        this.b = null;
    }

    public void l(String str, String str2, ICallback iCallback) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7924a4c9", new Object[]{this, str, str2, iCallback});
        } else if (i()) {
            this.b.showView(h(), str, str2, iCallback);
        } else {
            e(new b(str, str2, iCallback));
        }
    }

    public final synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0d866", new Object[]{this});
            return;
        }
        while (true) {
            Stack<ServiceConnection> stack = f;
            if (!stack.isEmpty()) {
                ServiceConnection pop = stack.pop();
                if (pop != null) {
                    try {
                        this.f9834a.unbindService(pop);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
    }
}
