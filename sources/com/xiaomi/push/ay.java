package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ay implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14767a;

    /* renamed from: a  reason: collision with other field name */
    private Context f754a;

    /* renamed from: a  reason: collision with other field name */
    private ServiceConnection f755a;

    /* renamed from: a  reason: collision with other field name */
    private volatile int f753a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile a f756a = null;

    /* renamed from: a  reason: collision with other field name */
    private final Object f757a = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with other field name */
        String f758a;
        String b;
        String c;
        String d;

        private a() {
            this.f758a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ay(Context context) {
        this.f754a = context;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        try {
            Signature[] signatureArr = this.f754a.getPackageManager().getPackageInfo(this.f754a.getPackageName(), 64).signatures;
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : instance.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b  reason: collision with other method in class */
    public void m489b() {
        ServiceConnection serviceConnection = this.f755a;
        if (serviceConnection != null) {
            try {
                this.f754a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo506a() {
        a("getOAID");
        if (this.f756a == null) {
            return null;
        }
        return this.f756a.b;
    }

    private void a() {
        boolean z;
        this.f755a = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        int i = 1;
        try {
            z = this.f754a.bindService(intent, this.f755a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f753a = i;
    }

    private void a(String str) {
        if (this.f753a == 1 && Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (this.f757a) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.m410a("oppo's " + str + " wait...");
                    this.f757a.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo506a() {
        return f14767a;
    }

    public static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f14767a = longVersionCode >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ay.this.f756a == null) {
                new Thread(new ba(this, iBinder)).start();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
