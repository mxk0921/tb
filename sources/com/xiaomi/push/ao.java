package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ao implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14758a;

    /* renamed from: a  reason: collision with other field name */
    private Context f732a;

    /* renamed from: a  reason: collision with other field name */
    private ServiceConnection f733a;

    /* renamed from: a  reason: collision with other field name */
    private volatile int f731a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile String f735a = null;

    /* renamed from: b  reason: collision with other field name */
    private volatile boolean f736b = false;
    private volatile String b = null;

    /* renamed from: a  reason: collision with other field name */
    private final Object f734a = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static String a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public static boolean m485a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean z = false;
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ao(Context context) {
        this.f732a = context;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ServiceConnection serviceConnection = this.f733a;
        if (serviceConnection != null) {
            try {
                this.f732a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public String mo506a() {
        a("getOAID");
        return this.f735a;
    }

    private void a() {
        boolean z;
        this.f733a = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        int i = 1;
        try {
            z = this.f732a.bindService(intent, this.f733a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f731a = i;
    }

    private void a(String str) {
        if (this.f731a == 1 && Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (this.f734a) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.m410a("huawei's " + str + " wait...");
                    this.f734a.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public boolean mo506a() {
        return f14758a;
    }

    public static boolean a(Context context) {
        boolean z;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z = (packageInfo.applicationInfo.flags & 1) != 0;
            f14758a = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new aq(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
