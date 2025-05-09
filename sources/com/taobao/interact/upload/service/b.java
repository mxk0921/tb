package com.taobao.interact.upload.service;

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
import com.taobao.interact.upload.service.FileUploadBaseListener;
import com.taobao.interact.upload.service.IUploadService;
import com.taobao.interact.upload.service.UploadCallBack;
import java.util.List;
import java.util.Stack;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b implements com.taobao.interact.upload.service.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Stack<ServiceConnection> f = new Stack<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10859a;
    public IUploadService b;
    public final Application c;
    public final Application.ActivityLifecycleCallbacks d;
    public final Intent e;

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
                b.this.g();
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
    /* renamed from: com.taobao.interact.upload.service.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0570b extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;
        public final /* synthetic */ MtopInfo c;
        public final /* synthetic */ UploadCallBack.Stub d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0570b(List list, MtopInfo mtopInfo, UploadCallBack.Stub stub) {
            super();
            this.b = list;
            this.c = mtopInfo;
            this.d = stub;
        }

        public static /* synthetic */ Object ipc$super(C0570b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/upload/service/UploadClient$3");
        }

        @Override // com.taobao.interact.upload.service.b.d
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67795c3b", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                b.b(b.this).uploadNewFiles(this.b, this.c, this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ MtopInfo c;
        public final /* synthetic */ FileUploadBaseListener.Stub d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, MtopInfo mtopInfo, FileUploadBaseListener.Stub stub) {
            super();
            this.b = str;
            this.c = mtopInfo;
            this.d = stub;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/upload/service/UploadClient$5");
        }

        @Override // com.taobao.interact.upload.service.b.d
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67795c3b", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                b.b(b.this).uploadFile(this.b, this.c, this.d);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public abstract class d implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(495976509);
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
            synchronized (b.this) {
                try {
                    if (b.b(b.this) == null) {
                        b.c(b.this, IUploadService.Stub.asInterface(iBinder));
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
                b.c(b.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(495976510);
        }

        public e(b bVar) {
            super();
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/interact/upload/service/UploadClient$UploadServiceConnAdapter");
        }

        @Override // com.taobao.interact.upload.service.b.d
        public void a(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67795c3b", new Object[]{this, componentName, iBinder});
            }
        }
    }

    static {
        t2o.a(495976503);
        t2o.a(495976494);
    }

    public b(Context context) {
        a aVar = new a();
        this.d = aVar;
        this.f10859a = context;
        h();
        Intent intent = new Intent("com.taobao.interact.upload.service.IUploadService");
        this.e = intent;
        intent.setPackage(context.getPackageName());
        d(new e(this));
        Application e2 = e(context);
        this.c = e2;
        e2.registerActivityLifecycleCallbacks(aVar);
    }

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ae769154", new Object[]{bVar});
        }
        return bVar.f10859a;
    }

    public static /* synthetic */ IUploadService b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploadService) ipChange.ipc$dispatch("2f7e34df", new Object[]{bVar});
        }
        return bVar.b;
    }

    public static /* synthetic */ IUploadService c(b bVar, IUploadService iUploadService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUploadService) ipChange.ipc$dispatch("78ea08ff", new Object[]{bVar, iUploadService});
        }
        bVar.b = iUploadService;
        return iUploadService;
    }

    public static Application e(Context context) {
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
            return e(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Failed to find application from context: " + context);
    }

    public final void d(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28892c6", new Object[]{this, serviceConnection});
            return;
        }
        f.push(serviceConnection);
        this.f10859a.bindService(this.e, serviceConnection, 1);
    }

    public final synchronized boolean f() {
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

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        h();
        Application application = this.c;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.d);
        }
    }

    public final synchronized void h() {
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
                        this.f10859a.unbindService(pop);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
    }

    public void i(String str, MtopInfo mtopInfo, FileUploadBaseListener.Stub stub) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e691525c", new Object[]{this, str, mtopInfo, stub});
        } else if (f()) {
            this.b.uploadFile(str, mtopInfo, stub);
        } else {
            d(new c(str, mtopInfo, stub));
        }
    }

    public void j(List<String> list, MtopInfo mtopInfo, UploadCallBack.Stub stub) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c183de", new Object[]{this, list, mtopInfo, stub});
        } else if (f()) {
            this.b.uploadNewFiles(list, mtopInfo, stub);
        } else {
            d(new C0570b(list, mtopInfo, stub));
        }
    }
}
