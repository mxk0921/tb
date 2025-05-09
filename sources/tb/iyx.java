package tb;

import a.a.a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class iyx {

    /* renamed from: a  reason: collision with root package name */
    public a.a.a.a f21653a = null;
    public String b = null;
    public String c = null;
    public final Object d = new Object();
    public final ServiceConnection e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements ServiceConnection {
        static {
            t2o.a(147849221);
        }

        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            iyx.this.f21653a = a.AbstractBinderC0000a.a(iBinder);
            synchronized (iyx.this.d) {
                iyx.this.d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            iyx.this.f21653a = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final iyx f21655a = new iyx(null);

        static {
            t2o.a(147849223);
        }
    }

    static {
        t2o.a(147849222);
    }

    public /* synthetic */ iyx(a aVar) {
    }

    public synchronized String a(Context context, String str) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.f21653a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.e, 1)) {
                    synchronized (this.d) {
                        try {
                            this.d.wait(3000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (this.f21653a == null) {
                    return "";
                }
                try {
                    return c(context, str);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return "";
                }
            } else {
                try {
                    return c(context, str);
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                    return "";
                }
            }
            throw th;
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA1");
                    if (instance != null) {
                        byte[] digest = instance.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : digest) {
                            sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
                        }
                        str2 = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e2) {
                    e2.printStackTrace();
                }
            }
            this.c = str2;
        }
        String a2 = ((a.AbstractBinderC0000a.C0001a) this.f21653a).a(this.b, this.c, str);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        return a2;
    }

    public boolean b(Context context) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo != null && packageInfo.versionCode >= 1;
            }
            if (packageInfo == null) {
                return false;
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode >= 1;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
