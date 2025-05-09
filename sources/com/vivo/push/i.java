package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.vivo.push.util.aa;
import com.vivo.push.util.ag;
import com.vivo.push.util.u;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14610a = new Object();
    private static Map<String, i> b = new HashMap();
    private boolean c;
    private String d;
    private Context e;
    private volatile IPCInvoke g;
    private String i;
    private Handler j;
    private Object h = new Object();
    private AtomicInteger f = new AtomicInteger(1);

    private i(Context context, String str) {
        this.d = null;
        this.j = null;
        this.e = context;
        this.i = str;
        boolean z = true;
        this.j = new Handler(Looper.getMainLooper(), new j(this));
        String a2 = aa.a(context);
        this.d = a2;
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(this.i)) {
            Context context2 = this.e;
            u.c(context2, "init error : push pkgname is " + this.d + " ; action is " + this.i);
            this.c = false;
            return;
        }
        this.c = ag.a(context, this.d) < 1260 ? false : z;
        b();
    }

    private void d() {
        this.j.removeMessages(1);
        this.j.sendEmptyMessageDelayed(1, 3000L);
    }

    private void e() {
        this.j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            this.e.unbindService(this);
        } catch (Exception e) {
            u.a("AidlManager", "On unBindServiceException:" + e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        u.b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e();
        this.g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.g == null) {
            u.d("AidlManager", "onServiceConnected error : aidl must not be null.");
            f();
            this.f.set(1);
            return;
        }
        if (this.f.get() == 2) {
            a(4);
        } else if (this.f.get() != 4) {
            f();
        }
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.g = null;
        a(1);
    }

    public static i a(Context context, String str) {
        i iVar = b.get(str);
        if (iVar == null) {
            synchronized (f14610a) {
                try {
                    iVar = b.get(str);
                    if (iVar == null) {
                        iVar = new i(context, str);
                        b.put(str, iVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return iVar;
    }

    private void b() {
        int i = this.f.get();
        u.d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i)));
        if (i != 4 && i != 2 && i != 3 && i != 5 && this.c) {
            a(2);
            if (!c()) {
                a(1);
                u.a("AidlManager", "bind core service fail");
                return;
            }
            d();
        }
    }

    private boolean c() {
        Intent intent = new Intent(this.i);
        intent.setPackage(this.d);
        try {
            return this.e.bindService(intent, this, 1);
        } catch (Exception e) {
            u.a("AidlManager", "bind core error", e);
            return false;
        }
    }

    public final boolean a() {
        String a2 = aa.a(this.e);
        this.d = a2;
        boolean z = false;
        if (TextUtils.isEmpty(a2)) {
            u.c(this.e, "push pkgname is null");
            return false;
        }
        if (ag.a(this.e, this.d) >= 1260) {
            z = true;
        }
        this.c = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.f.set(i);
    }

    public final boolean a(Bundle bundle) {
        b();
        if (this.f.get() == 2) {
            synchronized (this.h) {
                try {
                    this.h.wait(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            int i = this.f.get();
            if (i == 4) {
                this.j.removeMessages(2);
                this.j.sendEmptyMessageDelayed(2, 30000L);
                this.g.asyncCall(bundle, null);
                return true;
            }
            u.d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i)));
            return false;
        } catch (Exception e2) {
            u.a("AidlManager", "invoke error ", e2);
            int i2 = this.f.get();
            u.d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i2)));
            if (i2 == 2) {
                e();
                a(1);
                return false;
            } else if (i2 == 3) {
                a(1);
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                a(1);
                f();
                return false;
            }
        }
    }
}
