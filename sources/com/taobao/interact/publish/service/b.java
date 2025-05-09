package com.taobao.interact.publish.service;

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
import com.taobao.interact.publish.service.IPublishService;
import com.taobao.interact.publish.service.IServiceCallBack;
import java.util.Stack;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b implements com.taobao.interact.publish.service.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Stack<ServiceConnection> g = new Stack<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10848a;
    public PublishConfig b;
    public IPublishService c;
    public final Application d;
    public final Application.ActivityLifecycleCallbacks e;
    public final Intent f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            } else if (b.a(b.this).equals(activity)) {
                b.this.k();
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
    /* renamed from: com.taobao.interact.publish.service.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0569b extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ IServiceCallBack.Stub b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0569b(IServiceCallBack.Stub stub) {
            super();
            this.b = stub;
        }

        public static /* synthetic */ Object ipc$super(C0569b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/PublishClient$2");
        }

        @Override // com.taobao.interact.publish.service.b.f
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                b.b(b.this).registerCallback(this.b);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            super();
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/PublishClient$4");
        }

        @Override // com.taobao.interact.publish.service.b.f
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                b.b(b.this).showChoiceDialog();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
            super();
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/PublishClient$5");
        }

        @Override // com.taobao.interact.publish.service.b.f
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                b.b(b.this).callGallery();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
            super();
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/PublishClient$6");
        }

        @Override // com.taobao.interact.publish.service.b.f
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                b.b(b.this).callCamera();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public abstract class f implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(495976483);
        }

        public f() {
        }

        public abstract void a(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            synchronized (b.this) {
                if (b.b(b.this) == null) {
                    b.c(b.this, IPublishService.Stub.asInterface(iBinder));
                    try {
                        b.b(b.this).initConfig(b.d(b.this));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
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
                b.c(b.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(495976484);
        }

        public g(b bVar) {
            super();
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/publish/service/PublishClient$PublishServiceConnAdapter");
        }

        @Override // com.taobao.interact.publish.service.b.f
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9498a4cb", new Object[]{this, componentName, iBinder});
            }
        }
    }

    static {
        t2o.a(495976476);
        t2o.a(495976467);
    }

    public b(Context context, PublishConfig publishConfig) {
        a aVar = new a();
        this.e = aVar;
        this.f10848a = context;
        this.b = publishConfig;
        o();
        Intent i = i(context);
        this.f = i;
        context.startService(i);
        e(new g(this));
        Application h = h(context);
        this.d = h;
        h.registerActivityLifecycleCallbacks(aVar);
    }

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e66c2c8", new Object[]{bVar});
        }
        return bVar.f10848a;
    }

    public static /* synthetic */ IPublishService b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPublishService) ipChange.ipc$dispatch("e1bcf231", new Object[]{bVar});
        }
        return bVar.c;
    }

    public static /* synthetic */ IPublishService c(b bVar, IPublishService iPublishService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPublishService) ipChange.ipc$dispatch("a88e6a47", new Object[]{bVar, iPublishService});
        }
        bVar.c = iPublishService;
        return iPublishService;
    }

    public static /* synthetic */ PublishConfig d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublishConfig) ipChange.ipc$dispatch("71b0974e", new Object[]{bVar});
        }
        return bVar.b;
    }

    public static Application h(Context context) {
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
            return h(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    public final synchronized void e(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11132d3a", new Object[]{this, serviceConnection});
            return;
        }
        g.push(serviceConnection);
        this.f10848a.bindService(this.f, serviceConnection, 1);
    }

    public void f() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a8a62a", new Object[]{this});
        } else if (j()) {
            this.c.callCamera();
        } else {
            e(new e());
        }
    }

    public void g() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1657a99b", new Object[]{this});
        } else if (j()) {
            this.c.callGallery();
        } else {
            e(new d());
        }
    }

    public final Intent i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("eb7510c3", new Object[]{this, context});
        }
        Intent intent = new Intent("com.taobao.interact.publish.service.IPublishService");
        intent.setPackage(context.getPackageName());
        return intent;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e0c8ff0", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        o();
        this.c = null;
        Application application = this.d;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.e);
        }
        this.f10848a.stopService(this.f);
    }

    public void l(IServiceCallBack.Stub stub) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a407162b", new Object[]{this, stub});
        } else if (j()) {
            this.c.registerCallback(stub);
        } else {
            e(new C0569b(stub));
        }
    }

    public void m(PublishConfig publishConfig) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8fef25", new Object[]{this, publishConfig});
            return;
        }
        this.b = publishConfig;
        if (j()) {
            this.c.initConfig(publishConfig);
        }
    }

    public void n() throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e79876d", new Object[]{this});
        } else if (j()) {
            this.c.showChoiceDialog();
        } else {
            e(new c());
        }
    }

    public final synchronized void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0d866", new Object[]{this});
            return;
        }
        while (true) {
            Stack<ServiceConnection> stack = g;
            if (!stack.isEmpty()) {
                ServiceConnection pop = stack.pop();
                if (pop != null) {
                    try {
                        this.f10848a.unbindService(pop);
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
