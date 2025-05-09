package tb;

import android.app.ActivityThread;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IContentProvider;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.ARangerChannelService;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.proxy.RemoteServiceProxy;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IRemoteService;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.ReflectUtils;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f9n extends wz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> f = new CopyOnWriteArraySet();
    public static Field i;
    public final Uri c;
    public final String d;
    public IRemoteService e;
    public final AtomicBoolean h = new AtomicBoolean();
    public final ActivityThread b = ActivityThread.currentActivityThread();

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f19118a = re.r().getContentResolver();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f19121a;

        public b(f9n f9nVar, boolean[] zArr) {
            this.f19121a = zArr;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            b5d.i("QuickRemoteChannel", "bindChannelService, onServiceConnected", new Object[0]);
            this.f19121a[0] = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                b5d.i("QuickRemoteChannel", "bindChannelService, onServiceDisconnected", new Object[0]);
            }
        }
    }

    static {
        t2o.a(393216049);
    }

    public f9n(Uri uri) {
        this.c = uri;
        this.d = h5d.i(uri);
    }

    public static /* synthetic */ Set f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c8f10726", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ Object ipc$super(f9n f9nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/ipc/channel/QuickRemoteChannel");
    }

    public static /* synthetic */ void k(boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518c8f43", new Object[]{zArr});
        } else {
            d5d.b(d5d.POINT_BIND_CHANNEL, zArr[0], new String[0]);
        }
    }

    @Override // tb.vmb
    public void a(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c8618e", new Object[]{this, list});
            return;
        }
        try {
            g(this.c).recycle(list);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            } else if (e instanceof RemoteException) {
                throw new IPCException(1, e);
            } else {
                throw new IPCException(9, e);
            }
        }
    }

    @Override // tb.wz1
    public Reply c(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("b5789e92", new Object[]{this, call});
        }
        try {
            return g(this.c).sendCall(call);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            } else if (e instanceof RemoteException) {
                throw new IPCException(1, e);
            } else {
                throw new IPCException(9, e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements IBinder.DeathRecipient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final IBinder f19119a;
        public final String b;

        /* compiled from: Taobao */
        /* renamed from: tb.f9n$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0923a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0923a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    CallbackManager.f().g(a.a(a.this));
                }
            }
        }

        static {
            t2o.a(393216051);
        }

        public a(IBinder iBinder, String str) {
            this.f19119a = iBinder;
            this.b = str;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4a4caf64", new Object[]{aVar});
            }
            return aVar.b;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            b5d.i("QuickRemoteChannel", "binderDied", new Object[0]);
            try {
                this.f19119a.unlinkToDeath(this, 0);
                synchronized (f9n.class) {
                    if (TextUtils.isEmpty(this.b) || !f9n.f().contains(this.b)) {
                        z = false;
                    } else {
                        Intent intent = new Intent();
                        intent.setAction(Constants.ACTION_DISCONNECT);
                        intent.putExtra("processName", this.b);
                        intent.setPackage(re.r().getPackageName());
                        re.r().sendBroadcast(intent);
                        f9n.f().remove(this.b);
                    }
                }
                if (z) {
                    g5d.b(false, false, new RunnableC0923a());
                }
            } catch (Exception e) {
                b5d.h("QuickRemoteChannel", "[QuickBinderDeathRecipient][binderDied]", e, new Object[0]);
            }
        }
    }

    public final void j(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19287ebe", new Object[]{this, new Boolean(z)});
            return;
        }
        Context r = re.r();
        Uri uri = this.c;
        if (uri == null) {
            str = "";
        } else {
            str = uri.getAuthority();
        }
        if (k8l.d() && cp.h(r) && !TextUtils.isEmpty(str) && str.endsWith("channel")) {
            if (this.h.getAndSet(true)) {
                b5d.i("QuickRemoteChannel", "binding ChannelService ", new Object[0]);
                return;
            }
            b5d.i("QuickRemoteChannel", "bindChannelService", new Object[0]);
            try {
                final boolean[] zArr = {false};
                Intent intent = new Intent();
                intent.setPackage(r.getPackageName());
                intent.setClass(r, ARangerChannelService.class);
                intent.putExtra("seed", System.currentTimeMillis());
                r.bindService(intent, new b(this, zArr), 1);
                if (z) {
                    g5d.c(new Runnable() { // from class: tb.ukz
                        @Override // java.lang.Runnable
                        public final void run() {
                            f9n.k(zArr);
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
            } finally {
                this.h.set(false);
            }
        }
    }

    public final IContentProvider h(Uri uri, int i2) throws InvocationTargetException, IllegalAccessException {
        int i3 = i2 - 1;
        if (i2 <= 0) {
            b5d.i("QuickRemoteChannel", "retryGetProvider limit", new Object[0]);
            d5d.b(d5d.POINT_ACQUIRE_PROVIDER, false, "limit");
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        IContentProvider iContentProvider = (IContentProvider) h5d.a().invoke(this.f19118a, uri);
        if (iContentProvider != null) {
            b5d.i("QuickRemoteChannel", "retryGetProvider success", "retry", Integer.valueOf(i3), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri);
            d5d.b(d5d.POINT_ACQUIRE_PROVIDER, true, String.valueOf(i3));
            return iContentProvider;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 >= 10000) {
            b5d.i("QuickRemoteChannel", "retryGetProvider timeout", "dur", Long.valueOf(elapsedRealtime2), "retry", Integer.valueOf(i3), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri);
            d5d.b(d5d.POINT_ACQUIRE_PROVIDER, false, "timeout_" + i3);
            return h(uri, i3);
        }
        if (i == null && Build.VERSION.SDK_INT >= 30) {
            i = StaticHook.m(ContentResolver.class, "CONTENT_PROVIDER_READY_TIMEOUT_MILLIS");
        }
        Field field = i;
        b5d.i("QuickRemoteChannel", "retryGetProvider < 10s", "dur", Long.valueOf(elapsedRealtime2), "retry", Integer.valueOf(i3), NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, uri, "providerTimeout(ms)", Integer.valueOf(field != null ? ((Integer) field.get(null)).intValue() : 0));
        d5d.b(d5d.POINT_ACQUIRE_PROVIDER, false, "dur<10s");
        j(true);
        return null;
    }

    public final IRemoteService g(Uri uri) throws Exception {
        boolean z = true;
        IRemoteService iRemoteService = this.e;
        if (iRemoteService == null || (iRemoteService.isRemote() && !this.e.asBinder().isBinderAlive())) {
            try {
                IContentProvider h = h(uri, k8l.c());
                boolean z2 = h == null;
                ContentResolver contentResolver = this.f19118a;
                if (h == null) {
                    try {
                        String authority = uri.getAuthority();
                        Method hideMethod = ReflectUtils.getHideMethod(ContentResolver.class, Constants.ACQUIRE_UNSTABLE_PROVIDER, String.class);
                        hideMethod.setAccessible(true);
                        h = (IContentProvider) hideMethod.invoke(contentResolver, authority);
                    } catch (Exception e) {
                        b5d.h("QuickRemoteChannel", "[getRemoteService][acquireUnstableProvider]", e, new Object[0]);
                    }
                }
                if (h == null) {
                    try {
                        String authority2 = uri.getAuthority();
                        Method hideMethod2 = ReflectUtils.getHideMethod(ContentResolver.class, Constants.ACQUIRE_UNSTABLE_PROVIDER, Context.class, String.class);
                        hideMethod2.setAccessible(true);
                        h = (IContentProvider) hideMethod2.invoke(contentResolver, re.r(), authority2);
                    } catch (Exception e2) {
                        b5d.h("QuickRemoteChannel", "[getRemoteService][acquireUnstableProvider]", e2, new Object[0]);
                    }
                }
                if (h == null) {
                    try {
                        h = this.b.acquireProvider(re.r(), h5d.c(uri.getAuthority()), h5d.j(uri.getAuthority(), Process.myUserHandle().hashCode()), false);
                    } catch (Exception e3) {
                        b5d.h("QuickRemoteChannel", "[getRemoteService][acquireUnstableProvider] 2", e3, new Object[0]);
                        try {
                            ContentProviderClient acquireUnstableContentProviderClient = re.r().getContentResolver().acquireUnstableContentProviderClient(uri);
                            Field declaredField = ContentProviderClient.class.getDeclaredField(Constants.CONTENT_PROVIDER);
                            declaredField.setAccessible(true);
                            h = (IContentProvider) declaredField.get(acquireUnstableContentProviderClient);
                        } catch (Exception e4) {
                            b5d.h("QuickRemoteChannel", "[getRemoteService][acquireUnstableContentProviderClient] err", e4, new Object[0]);
                        }
                    }
                }
                if (z2) {
                    if (h == null) {
                        z = false;
                    }
                    d5d.b(d5d.POINT_RETRY_ACQUIRE_PROVIDER, z, new String[0]);
                }
                if (h != null) {
                    this.e = RemoteServiceProxy.a(h.asBinder());
                    j(false);
                } else {
                    throw new IPCException(19, "can't get content provider");
                }
            }
        }
        if (this.e.isRemote()) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) f;
            String str = this.d;
            if (!copyOnWriteArraySet.contains(str)) {
                copyOnWriteArraySet.add(str);
                IBinder asBinder = this.e.asBinder();
                try {
                    asBinder.linkToDeath(new a(asBinder, str), 0);
                } catch (RemoteException e5) {
                    b5d.h("QuickRemoteChannel", "[getRemoteService][linkToDeath]", e5, new Object[0]);
                }
            }
        }
        return this.e;
    }
}
