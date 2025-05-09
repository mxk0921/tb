package tb;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.share.aidl.IShareCopy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tip {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String d;
    public static String e;
    public static String f;
    public static String g;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28737a = "ShareCopy";
    public static IShareCopy b = null;
    public static Context c = null;
    public static final ServiceConnection h = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.tip$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class AsyncTaskC1063a extends AsyncTask<Void, Void, Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public AsyncTaskC1063a(a aVar) {
            }

            public static /* synthetic */ Object ipc$super(AsyncTaskC1063a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/wvapi/servicebrige/ShareCopy$1$1");
            }

            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
                }
                try {
                    tip.b.copyToClipboard(tip.a(), tip.b(), tip.c(), tip.d());
                    return null;
                } catch (RemoteException e) {
                    tip.e();
                    e.printStackTrace();
                    return null;
                }
            }

            /* renamed from: b */
            public void onPostExecute(Void r5) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
                    return;
                }
                tip.g().unbindService(tip.f());
                tip.e();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            tip.b = IShareCopy.Stub.asInterface(iBinder);
            new AsyncTaskC1063a(this).execute(new Void[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            tip.b = null;
            tip.h(null);
            tip.e();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28738a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public b(Context context, String str, String str2, String str3, String str4) {
            this.f28738a = context;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/wvapi/servicebrige/ShareCopy$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            if (this.f28738a instanceof Activity) {
                try {
                    try {
                        IShareCopy iShareCopy = (IShareCopy) Services.get(tip.g(), IShareCopy.class);
                        tip.b = iShareCopy;
                        if (iShareCopy == null) {
                            tip.g().getApplicationContext().bindService(new Intent(IShareCopy.class.getName()), tip.f(), 1);
                            tip.e();
                        } else {
                            iShareCopy.copyToClipboard(this.b, this.c, this.d, this.e);
                        }
                    } catch (Exception e) {
                        tip.e();
                        e.printStackTrace();
                    }
                    tip.h(null);
                } catch (Throwable th) {
                    tip.h(null);
                    throw th;
                }
            } else if (tip.g() instanceof Application) {
                tip.g().bindService(new Intent(IShareCopy.class.getName()), tip.f(), 1);
            } else {
                tip.e();
                return null;
            }
            return null;
        }
    }

    static {
        t2o.a(663748630);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return f28737a;
    }

    public static /* synthetic */ ServiceConnection f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceConnection) ipChange.ipc$dispatch("53facb70", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3ce5e2f5", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ Context h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f1412a1", new Object[]{context});
        }
        c = context;
        return context;
    }

    public static boolean i(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d36dd67", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        c = context;
        d = str;
        f = str3;
        e = str2;
        g = str4;
        new b(context, str, str2, str3, str4).execute(new Void[0]);
        return true;
    }
}
