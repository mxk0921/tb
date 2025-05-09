package com.ifaa.seccam;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.IFAASecCamInterface;
import tb.pi4;
import tb.v6p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IFAASecCamInterface f5544a;
    public static long b;
    public static pi4 c;
    public static final ServiceConnection d = new ServiceConnectionC0270a();

    /* compiled from: Taobao */
    /* renamed from: com.ifaa.seccam.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ServiceConnectionC0270a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            String a2 = a.a();
            v6p.a(a2, "Try connect miseccam aidl time = " + (System.currentTimeMillis() - a.b()));
            a.d(IFAASecCamInterface.Stub.asInterface(iBinder));
            if (a.c() == null) {
                v6p.a(a.a(), "Try connect seccam aidl fail!");
                a.e().a(null);
                return;
            }
            v6p.a(a.a(), "Try connect seccam aidl success!");
            SecCamManager.h().c = a.c();
            a.e().a(a.c());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            String a2 = a.a();
            v6p.a(a2, "Try connect onServiceDisconnected, time = " + (System.currentTimeMillis() - a.b()));
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "SecCam BindAidlService";
    }

    public static /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue();
        }
        return b;
    }

    public static /* synthetic */ IFAASecCamInterface c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFAASecCamInterface) ipChange.ipc$dispatch("78125659", new Object[0]);
        }
        return f5544a;
    }

    public static /* synthetic */ IFAASecCamInterface d(IFAASecCamInterface iFAASecCamInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFAASecCamInterface) ipChange.ipc$dispatch("2ce8a575", new Object[]{iFAASecCamInterface});
        }
        f5544a = iFAASecCamInterface;
        return iFAASecCamInterface;
    }

    public static /* synthetic */ pi4 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pi4) ipChange.ipc$dispatch("c222c44b", new Object[0]);
        }
        return c;
    }

    public static boolean f(Context context, pi4 pi4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d596fe", new Object[]{context, pi4Var})).booleanValue();
        }
        try {
            v6p.a("BindAidlService", "bindSecCamService!");
            c = pi4Var;
            b = System.currentTimeMillis();
            Intent intent = new Intent();
            intent.setAction("com.ifaa.seccam.IFAASecCamService");
            intent.setPackage("com.ifaa.seccam");
            return context.getApplicationContext().bindService(intent, d, 1);
        } catch (Exception e) {
            v6p.a("SecCam BindAidlService", "bind service error.e = " + e.toString());
            return false;
        }
    }
}
