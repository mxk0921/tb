package com.alibaba.analytics.core.logbuilder;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.iaq;
import tb.nhh;
import tb.t2o;
import tb.vyp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GoogleAdvertisingIdClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f2118a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AdvertisingInterface implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        public final IBinder f2119a;

        static {
            t2o.a(962592891);
        }

        public AdvertisingInterface(IBinder iBinder) {
            this.f2119a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f2119a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f2119a;
        }

        public boolean b(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.f2119a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Context context) {
            super(str);
            this.f2120a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/logbuilder/GoogleAdvertisingIdClient$1");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                GoogleAdvertisingIdClient.b(this.f2120a);
                nhh.f("GoogleAdvertisingIdClient", "initAdvertisingIdInfo");
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f2121a;
        public final boolean b;

        static {
            t2o.a(962592889);
        }

        public b(String str, boolean z) {
            this.f2121a = str;
            this.b = z;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.f2121a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4da072c1", new Object[]{this})).booleanValue();
            }
            return this.b;
        }
    }

    static {
        t2o.a(962592887);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f6c96a61", new Object[0]);
        }
        return f2118a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2122a;
        public final LinkedBlockingQueue<IBinder> b;

        static {
            t2o.a(962592890);
        }

        public c() {
            this.f2122a = false;
            this.b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("aacdd736", new Object[]{this});
            }
            if (!this.f2122a) {
                this.f2122a = true;
                return this.b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static synchronized void b(Context context) {
        synchronized (GoogleAdvertisingIdClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69abf4c4", new Object[]{context});
            } else if (f2118a == null) {
                try {
                    String str = null;
                    c cVar = new c(null);
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, cVar, 1)) {
                        try {
                            IBinder a2 = cVar.a();
                            if (a2 != null) {
                                AdvertisingInterface advertisingInterface = new AdvertisingInterface(a2);
                                String a3 = advertisingInterface.a();
                                boolean b2 = advertisingInterface.b(true);
                                nhh.f("GoogleAdvertisingIdClient", "advertisingId", a3, "limitAdTrackingEnabled", Boolean.valueOf(b2));
                                if (b2 || TextUtils.isEmpty(a3)) {
                                    f2118a = new b(a3, b2);
                                } else {
                                    b bVar = f2118a;
                                    if (bVar != null) {
                                        str = bVar.a();
                                    }
                                    if (!a3.equalsIgnoreCase(str)) {
                                        f2118a = new b(a3, b2);
                                        iaq.b(vyp.i().g(), "_gaid", a3);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            nhh.u("GoogleAdvertisingIdClient", e, new Object[0]);
                        }
                        context.unbindService(cVar);
                    }
                } catch (Throwable unused) {
                }
                if (f2118a == null) {
                    f2118a = new b("", true);
                }
            }
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a859875", new Object[]{context});
        } else if (f2118a == null) {
            String a2 = iaq.a(vyp.i().g(), "_gaid");
            if (!TextUtils.isEmpty(a2)) {
                f2118a = new b(a2, false);
            }
            nhh.f("GoogleAdvertisingIdClient", "gaidSp", a2);
            new a("UtGaid", context).start();
        }
    }
}
