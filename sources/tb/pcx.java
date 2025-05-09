package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.service.DesktopMainService;
import com.taobao.desktop.widget.service.RemoteData;
import com.taobao.desktop.widget.service.WidgetLauncherService;
import com.taobao.login4android.api.Login;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile pcx k;
    public static ajb l;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26020a;
    public Messenger b;
    public Messenger c;
    public RemoteData g;
    public Messenger h;
    public boolean d = false;
    public boolean e = false;
    public int f = 1;
    public final ServiceConnection i = new a();
    public final ServiceConnection j = new b();

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
            hgh.d("onServiceConnected " + componentName);
            pcx.a(pcx.this, new Messenger(iBinder));
            pcx.b(pcx.this, true);
            pcx pcxVar = pcx.this;
            pcxVar.s(pcx.c(pcxVar));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            hgh.d("onServiceDisconnected " + componentName);
            pcx.a(pcx.this, null);
            pcx.b(pcx.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            hgh.d("onServiceConnected " + componentName);
            try {
                pcx.d(pcx.this, new Messenger(iBinder));
                pcx.e(pcx.this, true);
                pcx.f(pcx.this);
            } catch (Throwable th) {
                hgh.d("onServiceConnected error" + th);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            hgh.d("onServiceDisconnected " + componentName);
            pcx.d(pcx.this, null);
            pcx.e(pcx.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(pcx pcxVar, Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/service/WidgetServiceManager$3");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 3) {
                super.handleMessage(message);
            } else {
                try {
                    hgh.b("MSG_MAIN_PROCESS receiver reply msg widget main process " + message.getData());
                    if (pcx.g() != null) {
                        pcx.g().a();
                        bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().w("widget_state_default_reply"));
                    }
                } catch (Throwable th) {
                    hgh.b("receiver msg from main process error" + th.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(437256296);
    }

    public pcx(Context context) {
        if (context.getApplicationContext() != null) {
            this.f26020a = context.getApplicationContext();
        } else {
            this.f26020a = context;
        }
    }

    public static /* synthetic */ Messenger a(pcx pcxVar, Messenger messenger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Messenger) ipChange.ipc$dispatch("19a75ec9", new Object[]{pcxVar, messenger});
        }
        pcxVar.c = messenger;
        return messenger;
    }

    public static /* synthetic */ boolean b(pcx pcxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eaa1e4a", new Object[]{pcxVar, new Boolean(z)})).booleanValue();
        }
        pcxVar.e = z;
        return z;
    }

    public static /* synthetic */ int c(pcx pcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1446a180", new Object[]{pcxVar})).intValue();
        }
        return pcxVar.f;
    }

    public static /* synthetic */ Messenger d(pcx pcxVar, Messenger messenger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Messenger) ipChange.ipc$dispatch("61ed9626", new Object[]{pcxVar, messenger});
        }
        pcxVar.b = messenger;
        return messenger;
    }

    public static /* synthetic */ boolean e(pcx pcxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99cd29e7", new Object[]{pcxVar, new Boolean(z)})).booleanValue();
        }
        pcxVar.d = z;
        return z;
    }

    public static /* synthetic */ void f(pcx pcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef52e50", new Object[]{pcxVar});
        } else {
            pcxVar.q();
        }
    }

    public static /* synthetic */ ajb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajb) ipChange.ipc$dispatch("f34ca1a2", new Object[0]);
        }
        return l;
    }

    public static pcx l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pcx) ipChange.ipc$dispatch("53174df4", new Object[]{context});
        }
        if (k == null) {
            synchronized (pcx.class) {
                try {
                    if (k == null) {
                        k = new pcx(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf88df46", new Object[]{this});
            return;
        }
        try {
            if (!m()) {
                Intent intent = new Intent();
                intent.setClassName(this.f26020a.getPackageName(), DesktopMainService.class.getName());
                boolean bindService = this.f26020a.bindService(intent, this.i, 1);
                hgh.d("bindMainService isBind = " + bindService);
            }
        } catch (Throwable th) {
            hgh.d("bindMainService error = " + th.getMessage());
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b38611b", new Object[]{this});
            return;
        }
        try {
            if (!n()) {
                Intent intent = new Intent();
                intent.setClassName(this.f26020a.getPackageName(), WidgetLauncherService.class.getName());
                boolean bindService = this.f26020a.bindService(intent, this.j, 1);
                hgh.d("bindWidgetService isBind = " + bindService);
            }
        } catch (Throwable th) {
            hgh.d("bindWidgetService error = " + th.getMessage());
        }
    }

    public final Bundle j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("63693c5c", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putString("widget_data", obx.f(this.f26020a).h());
        hgh.b("sendMainServiceData ");
        return bundle;
    }

    public final Bundle k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("17c15da7", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        try {
            if (Login.getUserId() != null) {
                str = Login.getUserId();
            } else {
                str = "";
            }
            bundle.putString("login_uid", str);
            bundle.putString("login_encrypt_uid", vd7.e(this.f26020a).d());
            bundle.putString("process_share_orange", JSON.toJSONString(o8l.f25213a));
            bundle.putString("widget_data", obx.f(this.f26020a).h());
            obx.f(this.f26020a).k();
            bundle.putString("mockSet", vd7.e(this.f26020a).g());
            RemoteData remoteData = this.g;
            if (remoteData != null) {
                bundle.putString("widget_id", remoteData.getChangeWidgetId());
                bundle.putString("widget_type_id", this.g.getTypeId());
            }
        } catch (Exception e) {
            hgh.d("buildWidgetData error: " + e);
        }
        hgh.b("sendWidgetServiceData ");
        return bundle;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6debc9e3", new Object[]{this})).booleanValue();
        }
        hgh.d("isMainServiceConnect " + this.e);
        return this.e;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88c5e72e", new Object[]{this})).booleanValue();
        }
        hgh.d("isWidgetServiceConnect " + this.d);
        return this.d;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e045157e", new Object[]{this});
        } else {
            this.h = new Messenger(new c(this, Looper.getMainLooper()));
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e591965", new Object[]{this});
        } else if (this.c != null) {
            Message obtain = Message.obtain((Handler) null, this.f);
            obtain.setData(j());
            try {
                this.c.send(obtain);
            } catch (RemoteException e) {
                hgh.d("sendWidgetServiceData error = " + e.getMessage());
            }
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7414477a", new Object[]{this});
        } else if (this.b != null) {
            Message obtain = Message.obtain((Handler) null, this.f);
            obtain.setData(k());
            if (b9l.o(this.f26020a).booleanValue() && l != null) {
                o();
                obtain.replyTo = this.h;
            }
            try {
                this.b.send(obtain);
            } catch (RemoteException e) {
                hgh.d("sendWidgetServiceData error = " + e.getMessage());
            }
        }
    }

    public void r(ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a08e9e", new Object[]{this, serviceConnection});
            return;
        }
        try {
            this.f26020a.unbindService(serviceConnection);
            hgh.d("unBindService  success");
        } catch (Throwable th) {
            hgh.d("unBindService error = " + th.getMessage());
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac4f751", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.f = i;
            if (m()) {
                p();
                r(this.i);
            } else {
                h();
            }
        } catch (Exception e) {
            hgh.d("workWidgetService error = " + e.getMessage());
        }
    }

    public void t(int i, RemoteData remoteData, ajb ajbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553374f9", new Object[]{this, new Integer(i), remoteData, ajbVar});
            return;
        }
        try {
            this.f = i;
            this.g = remoteData;
            l = ajbVar;
            if (n()) {
                q();
            } else {
                i();
            }
        } catch (Exception e) {
            hgh.d("workWidgetService error = " + e.getMessage());
        }
    }
}
