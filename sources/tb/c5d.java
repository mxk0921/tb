package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16871a;
    public Messenger b;
    public int d;
    public Bundle e;
    public Handler f;
    public final Class g;
    public boolean c = false;
    public final ServiceConnection h = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            yv8.a("ChannelServiceManager.onServiceConnected.", new Object[0]);
            c5d.a(c5d.this, new Messenger(iBinder));
            c5d.b(c5d.this, true);
            c5d c5dVar = c5d.this;
            c5dVar.h(c5d.c(c5dVar), c5d.d(c5d.this), c5d.e(c5d.this));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            yv8.a("ChannelServiceManager.onServiceDisconnected.", new Object[0]);
            c5d.a(c5d.this, null);
            c5d.b(c5d.this, false);
        }
    }

    static {
        t2o.a(435159091);
    }

    public c5d(Context context, Class cls) {
        if (context.getApplicationContext() != null) {
            this.f16871a = context.getApplicationContext();
        } else {
            this.f16871a = context;
        }
        this.g = cls;
    }

    public static /* synthetic */ Messenger a(c5d c5dVar, Messenger messenger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Messenger) ipChange.ipc$dispatch("521bd79c", new Object[]{c5dVar, messenger});
        }
        c5dVar.b = messenger;
        return messenger;
    }

    public static /* synthetic */ boolean b(c5d c5dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adaeae3f", new Object[]{c5dVar, new Boolean(z)})).booleanValue();
        }
        c5dVar.c = z;
        return z;
    }

    public static /* synthetic */ int c(c5d c5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a285e38d", new Object[]{c5dVar})).intValue();
        }
        return c5dVar.d;
    }

    public static /* synthetic */ Bundle d(c5d c5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("7b8f64bd", new Object[]{c5dVar});
        }
        return c5dVar.e;
    }

    public static /* synthetic */ Handler e(c5d c5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2caf6aee", new Object[]{c5dVar});
        }
        return c5dVar.f;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b38611b", new Object[]{this});
            return;
        }
        try {
            if (!g()) {
                Intent intent = new Intent();
                intent.setClassName(this.f16871a.getPackageName(), this.g.getName());
                yv8.a("ChannelServiceManager.bindWidgetService.isBind=%s", Boolean.valueOf(this.f16871a.bindService(intent, this.h, 1)));
            }
        } catch (Throwable th) {
            yv8.b("ChannelServiceManager.bindWidgetService error", th);
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88c5e72e", new Object[]{this})).booleanValue();
        }
        yv8.c("isWidgetServiceConnect " + this.c);
        return this.c;
    }

    public void h(int i, Bundle bundle, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad86d1", new Object[]{this, new Integer(i), bundle, handler});
            return;
        }
        try {
            this.d = i;
            this.e = bundle;
            this.f = handler;
            if (g()) {
                i();
                j(this.h);
            } else {
                f();
            }
        } catch (Exception e) {
            yv8.b("ChannelServiceManager.workWidgetService error", e);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7414477a", new Object[]{this});
        } else if (this.b != null) {
            Message obtain = Message.obtain();
            obtain.what = this.d;
            if (this.f != null) {
                obtain.replyTo = new Messenger(this.f);
            }
            obtain.setData(this.e);
            try {
                this.b.send(obtain);
            } catch (Throwable th) {
                yv8.b("ChannelServiceManager.sendWidgetServiceData.error", th);
            }
            this.e = null;
            this.f = null;
        }
    }

    public void j(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a08e9e", new Object[]{this, serviceConnection});
            return;
        }
        try {
            this.f16871a.unbindService(serviceConnection);
            this.c = false;
            yv8.a("ChannelServiceManager.unBindService.", new Object[0]);
        } catch (Throwable th) {
            yv8.b("ChannelServiceManager.unBindService.error", th);
        }
    }
}
