package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bg;
import com.xiaomi.push.bh;
import com.xiaomi.push.bl;
import com.xiaomi.push.di;
import com.xiaomi.push.fd;
import com.xiaomi.push.ic;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.ji;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ao {

    /* renamed from: a  reason: collision with root package name */
    private static ao f14716a;

    /* renamed from: a  reason: collision with other field name */
    private static final ArrayList<a> f678a = new ArrayList<>();
    private static boolean b;

    /* renamed from: a  reason: collision with other field name */
    private long f679a;

    /* renamed from: a  reason: collision with other field name */
    private Context f680a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f682a;

    /* renamed from: a  reason: collision with other field name */
    private Messenger f683a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f687a;

    /* renamed from: a  reason: collision with other field name */
    private List<Message> f686a = new ArrayList();
    private boolean c = false;

    /* renamed from: b  reason: collision with other field name */
    private String f688b = null;

    /* renamed from: a  reason: collision with other field name */
    private Intent f681a = null;

    /* renamed from: a  reason: collision with other field name */
    private Integer f684a = null;

    /* renamed from: a  reason: collision with other field name */
    private String f685a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a<T extends jn<T, ?>> {

        /* renamed from: a  reason: collision with root package name */
        ic f14717a;

        /* renamed from: a  reason: collision with other field name */
        T f689a;

        /* renamed from: a  reason: collision with other field name */
        boolean f690a;
    }

    private ao(Context context) {
        this.f687a = false;
        this.f682a = null;
        this.f680a = context.getApplicationContext();
        this.f687a = m438c();
        b = m439d();
        this.f682a = new ap(this, Looper.getMainLooper());
        if (j.m869a(context)) {
            com.xiaomi.push.service.j.a(new aq(this));
        }
        Intent b2 = b();
        if (b2 != null) {
            b(b2);
        }
    }

    private synchronized int a() {
        return this.f680a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    private Intent b() {
        if (!"com.xiaomi.xmsf".equals(this.f680a.getPackageName())) {
            return c();
        }
        b.c("pushChannel xmsf create own channel");
        return e();
    }

    private Intent c() {
        if (m445a()) {
            b.c("pushChannel app start miui china channel");
            return d();
        }
        b.c("pushChannel app start  own channel");
        return e();
    }

    private Intent d() {
        Intent intent = new Intent();
        String packageName = this.f680a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m437a());
        intent.putExtra("mipush_app_package", packageName);
        h();
        return intent;
    }

    private Intent e() {
        Intent intent = new Intent();
        String packageName = this.f680a.getPackageName();
        i();
        intent.setComponent(new ComponentName(this.f680a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    private void g() {
        this.f679a = SystemClock.elapsedRealtime();
    }

    private void h() {
        try {
            PackageManager packageManager = this.f680a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f680a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable unused) {
        }
    }

    private void i() {
        try {
            PackageManager packageManager = this.f680a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f680a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable unused) {
        }
    }

    public void f() {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a2.putExtra(bj.E, this.f680a.getPackageName());
        a2.putExtra(bj.J, bl.b(this.f680a.getPackageName()));
        c(a2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m441a() {
        return this.f679a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m447b() {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        c(a2);
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m449c() {
        if (this.f681a != null) {
            g();
            c(this.f681a);
            this.f681a = null;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m450d() {
        ArrayList<a> arrayList = f678a;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                a(next.f689a, next.f14717a, next.f690a, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f678a.clear();
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    public void m451e() {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) bh.a(ProcessUtils.ACTIVITY_THREAD, "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f680a.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            b.m410a("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        a2.putExtra(bj.E, packageName);
        c(a2);
    }

    private synchronized void c(int i) {
        this.f680a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    private synchronized void d(Intent intent) {
        try {
            if (this.c) {
                Message a2 = a(intent);
                if (this.f686a.size() >= 50) {
                    this.f686a.remove(0);
                }
                this.f686a.add(a2);
                return;
            }
            if (this.f683a == null) {
                this.f680a.bindService(intent, new as(this), 1);
                this.c = true;
                this.f686a.clear();
                this.f686a.add(a(intent));
            } else {
                try {
                    this.f683a.send(a(intent));
                } catch (RemoteException unused) {
                    this.f683a = null;
                    this.c = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m440e() {
        String packageName = this.f680a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f680a.getApplicationInfo().flags & 1) != 0;
    }

    public void b(int i) {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a2.putExtra(bj.E, this.f680a.getPackageName());
        a2.putExtra(bj.H, i);
        String str = bj.J;
        a2.putExtra(str, bl.b(this.f680a.getPackageName() + i));
        c(a2);
    }

    /* renamed from: a  reason: collision with other method in class */
    private Intent m436a() {
        return (!m445a() || "com.xiaomi.xmsf".equals(this.f680a.getPackageName())) ? e() : d();
    }

    private void b(Intent intent) {
        try {
            if (j.m868a() || Build.VERSION.SDK_INT < 26) {
                this.f680a.startService(intent);
            } else {
                d(intent);
            }
        } catch (Exception e) {
            b.a(e);
        }
    }

    private void c(Intent intent) {
        az a2 = az.a(this.f680a);
        int a3 = ih.ServiceBootMode.a();
        id idVar = id.START;
        int a4 = a2.a(a3, idVar.a());
        int a5 = a();
        id idVar2 = id.BIND;
        boolean z = a4 == idVar2.a() && b;
        int a6 = z ? idVar2.a() : idVar.a();
        if (a6 != a5) {
            m446a(a6);
        }
        if (z) {
            d(intent);
        } else {
            b(intent);
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m439d() {
        if (m445a()) {
            try {
                return this.f680a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m438c() {
        try {
            PackageInfo packageInfo = this.f680a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m448b() {
        if (!m445a() || !m440e()) {
            return true;
        }
        if (this.f684a == null) {
            Integer valueOf = Integer.valueOf(bm.a(this.f680a).a());
            this.f684a = valueOf;
            if (valueOf.intValue() == 0) {
                this.f680a.getContentResolver().registerContentObserver(bm.a(this.f680a).m1055a(), false, new ar(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f684a.intValue() != 0;
    }

    public static synchronized ao a(Context context) {
        ao aoVar;
        synchronized (ao.class) {
            try {
                if (f14716a == null) {
                    f14716a = new ao(context);
                }
                aoVar = f14716a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aoVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private String m437a() {
        String str = this.f688b;
        if (str != null) {
            return str;
        }
        try {
            if (this.f680a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f688b = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f688b = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m442a() {
        b(m436a());
    }

    public void a(int i) {
        a(i, 0);
    }

    public void a(int i, int i2) {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a2.putExtra(bj.E, this.f680a.getPackageName());
        a2.putExtra(bj.F, i);
        a2.putExtra(bj.G, i2);
        c(a2);
    }

    public void a(int i, String str) {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.thirdparty");
        a2.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        a2.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        b(a2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m443a(Context context) {
        if (!j.m868a()) {
            ag a2 = n.a(context);
            if (ag.HUAWEI.equals(a2)) {
                a((String) null, au.UPLOAD_HUAWEI_TOKEN, e.ASSEMBLE_PUSH_HUAWEI, "update");
            }
            if (ag.OPPO.equals(a2)) {
                a((String) null, au.UPLOAD_COS_TOKEN, e.ASSEMBLE_PUSH_COS, "update");
            }
            if (ag.VIVO.equals(a2)) {
                a((String) null, au.UPLOAD_FTOS_TOKEN, e.ASSEMBLE_PUSH_FTOS, "update");
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m444a(Intent intent) {
        intent.fillIn(m436a(), 24);
        c(intent);
    }

    public final void a(ig igVar) {
        Intent a2 = m436a();
        byte[] a3 = jm.a(igVar);
        if (a3 == null) {
            b.m410a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        a2.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        a2.putExtra("mipush_payload", a3);
        b(a2);
    }

    public final void a(jc jcVar, boolean z) {
        fd.a(this.f680a.getApplicationContext()).a(this.f680a.getPackageName(), "E100003", jcVar.a(), 6001, null);
        this.f681a = null;
        b.m452a(this.f680a).f695a = jcVar.a();
        Intent a2 = m436a();
        byte[] a3 = jm.a(ai.a(this.f680a, jcVar, ic.Registration));
        if (a3 == null) {
            b.m410a("register fail, because msgBytes is null.");
            return;
        }
        a2.setAction("com.xiaomi.mipush.REGISTER_APP");
        a2.putExtra("mipush_app_id", b.m452a(this.f680a).m453a());
        a2.putExtra("mipush_payload", a3);
        a2.putExtra("mipush_session", this.f685a);
        a2.putExtra("mipush_env_chanage", z);
        a2.putExtra("mipush_env_type", b.m452a(this.f680a).a());
        if (!bg.b(this.f680a) || !m448b()) {
            this.f681a = a2;
            return;
        }
        g();
        c(a2);
    }

    public final void a(ji jiVar) {
        byte[] a2 = jm.a(ai.a(this.f680a, jiVar, ic.UnRegistration));
        if (a2 == null) {
            b.m410a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent a3 = m436a();
        a3.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        a3.putExtra("mipush_app_id", b.m452a(this.f680a).m453a());
        a3.putExtra("mipush_payload", a2);
        c(a3);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, ip ipVar) {
        a((ao) t, icVar, !icVar.equals(ic.Registration), ipVar);
    }

    public <T extends jn<T, ?>> void a(T t, ic icVar, boolean z) {
        a aVar = new a();
        aVar.f689a = t;
        aVar.f14717a = icVar;
        aVar.f690a = z;
        ArrayList<a> arrayList = f678a;
        synchronized (arrayList) {
            try {
                arrayList.add(aVar);
                if (arrayList.size() > 10) {
                    arrayList.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, ip ipVar) {
        a(t, icVar, z, true, ipVar, true);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, ip ipVar, boolean z2) {
        a(t, icVar, z, true, ipVar, z2);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3) {
        a(t, icVar, z, z2, ipVar, z3, this.f680a.getPackageName(), b.m452a(this.f680a).m453a());
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3, String str, String str2) {
        a(t, icVar, z, z2, ipVar, z3, str, str2, true);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3, String str, String str2, boolean z4) {
        a(t, icVar, z, z2, ipVar, z3, str, str2, z4, true);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (!z5 || b.m452a(this.f680a).m461c()) {
            iy a2 = z4 ? ai.a(this.f680a, t, icVar, z, str, str2) : ai.b(this.f680a, t, icVar, z, str, str2);
            if (ipVar != null) {
                a2.a(ipVar);
            }
            byte[] a3 = jm.a(a2);
            if (a3 == null) {
                b.m410a("send message fail, because msgBytes is null.");
                return;
            }
            di.a(this.f680a.getPackageName(), this.f680a, t, icVar, a3.length);
            Intent a4 = m436a();
            a4.setAction("com.xiaomi.mipush.SEND_MESSAGE");
            a4.putExtra("mipush_payload", a3);
            a4.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
            c(a4);
        } else if (z2) {
            a((ao) t, icVar, z);
        } else {
            b.m410a("drop the message before initialization.");
        }
    }

    public final void a(String str, au auVar, e eVar, String str2) {
        af.a(this.f680a).a(auVar, "syncing");
        HashMap<String, String> a2 = i.m470a(this.f680a, eVar);
        a2.put("third_sync_reason", str2);
        a(str, auVar, false, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, au auVar, boolean z, HashMap<String, String> hashMap) {
        jb jbVar;
        String str2;
        String str3 = str;
        if (b.m452a(this.f680a).m459b() && bg.b(this.f680a)) {
            jb jbVar2 = new jb();
            jbVar2.a(true);
            Intent a2 = m436a();
            if (TextUtils.isEmpty(str)) {
                str3 = bc.a();
                jbVar2.a(str3);
                jbVar = z ? new jb(str3, true) : null;
                synchronized (af.class) {
                    af.a(this.f680a).m432a(str3);
                }
            } else {
                jbVar2.a(str3);
                jbVar = z ? new jb(str3, true) : null;
            }
            switch (at.f14722a[auVar.ordinal()]) {
                case 1:
                    im imVar = im.DisablePushMessage;
                    jbVar2.c(imVar.f1168a);
                    jbVar.c(imVar.f1168a);
                    if (hashMap != null) {
                        jbVar2.a(hashMap);
                        jbVar.a(hashMap);
                    }
                    str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                    a2.setAction(str2);
                    break;
                case 2:
                    im imVar2 = im.EnablePushMessage;
                    jbVar2.c(imVar2.f1168a);
                    jbVar.c(imVar2.f1168a);
                    if (hashMap != null) {
                        jbVar2.a(hashMap);
                        jbVar.a(hashMap);
                    }
                    str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                    a2.setAction(str2);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    jbVar2.c(im.ThirdPartyRegUpdate.f1168a);
                    if (hashMap != null) {
                        jbVar2.a(hashMap);
                        break;
                    }
                    break;
            }
            b.e("type:" + auVar + ", " + str3);
            jbVar2.b(b.m452a(this.f680a).m453a());
            jbVar2.d(this.f680a.getPackageName());
            ic icVar = ic.Notification;
            a((ao) jbVar2, icVar, false, (ip) null);
            if (z) {
                jbVar.b(b.m452a(this.f680a).m453a());
                jbVar.d(this.f680a.getPackageName());
                Context context = this.f680a;
                byte[] a3 = jm.a(ai.a(context, jbVar, icVar, false, context.getPackageName(), b.m452a(this.f680a).m453a()));
                if (a3 != null) {
                    di.a(this.f680a.getPackageName(), this.f680a, jbVar, icVar, a3.length);
                    a2.putExtra("mipush_payload", a3);
                    a2.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    a2.putExtra("mipush_app_id", b.m452a(this.f680a).m453a());
                    a2.putExtra("mipush_app_token", b.m452a(this.f680a).b());
                    c(a2);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = auVar.ordinal();
            obtain.obj = str3;
            obtain.arg1 = ordinal;
            if (!(hashMap == null || hashMap.get("third_sync_reason") == null)) {
                Bundle bundle = new Bundle();
                bundle.putString("third_sync_reason", hashMap.get("third_sync_reason"));
                obtain.setData(bundle);
            }
            this.f682a.sendMessageDelayed(obtain, 5000L);
        }
    }

    public void a(String str, String str2) {
        Intent a2 = m436a();
        a2.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a2.putExtra(bj.E, this.f680a.getPackageName());
        a2.putExtra(bj.K, str);
        a2.putExtra(bj.L, str2);
        c(a2);
    }

    public final void a(boolean z) {
        a(z, (String) null);
    }

    public final void a(boolean z, String str) {
        au auVar;
        af a2;
        au auVar2;
        if (z) {
            af a3 = af.a(this.f680a);
            auVar = au.DISABLE_PUSH;
            a3.a(auVar, "syncing");
            a2 = af.a(this.f680a);
            auVar2 = au.ENABLE_PUSH;
        } else {
            af a4 = af.a(this.f680a);
            auVar = au.ENABLE_PUSH;
            a4.a(auVar, "syncing");
            a2 = af.a(this.f680a);
            auVar2 = au.DISABLE_PUSH;
        }
        a2.a(auVar2, "");
        a(str, auVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m445a() {
        return this.f687a && 1 == b.m452a(this.f680a).a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m446a(int i) {
        if (!b.m452a(this.f680a).m459b()) {
            return false;
        }
        c(i);
        jb jbVar = new jb();
        jbVar.a(bc.a());
        jbVar.b(b.m452a(this.f680a).m453a());
        jbVar.d(this.f680a.getPackageName());
        jbVar.c(im.ClientABTest.f1168a);
        HashMap hashMap = new HashMap();
        jbVar.f1308a = hashMap;
        hashMap.put("boot_mode", i + "");
        a(this.f680a).a((ao) jbVar, ic.Notification, false, (ip) null);
        return true;
    }
}
