package com.alibaba.openid.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.hihonor.cloudservice.oaid.IOAIDCallBack;
import com.hihonor.cloudservice.oaid.IOAIDService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.izb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HonorDeviceIdSupplier implements izb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f2514a = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2515a;
        public final LinkedBlockingQueue<IBinder> b;

        static {
            t2o.a(147849230);
        }

        public b() {
            this.f2515a = false;
            this.b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("aacdd736", new Object[]{this});
            }
            if (!this.f2515a) {
                this.f2515a = true;
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
    }

    static {
        t2o.a(147849228);
        t2o.a(147849225);
    }

    public static /* synthetic */ boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("415b7b87", new Object[]{str})).booleanValue();
        }
        return d(str);
    }

    public static /* synthetic */ String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed2ba65a", new Object[]{str});
        }
        f2514a = str;
        return str;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95a4b06a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("00000000-0000-0000-0000-000000000000")) {
            return false;
        }
        return true;
    }

    @Override // tb.izb
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        try {
            if (!Boolean.parseBoolean(Settings.Secure.getString(context.getContentResolver(), "oaid_limit_state"))) {
                String string = Settings.Global.getString(context.getContentResolver(), "oaid");
                if (d(string)) {
                    f2514a = string;
                    return string;
                }
            }
        } catch (Throwable unused) {
        }
        b bVar = new b();
        Intent intent = new Intent();
        intent.setAction("com.hihonor.id.HnOaIdService");
        intent.setPackage("com.hihonor.id");
        if (context.bindService(intent, bVar, 1)) {
            try {
                IOAIDService.Stub.asInterface(bVar.a()).getOAID(new OAIDCallBack());
                return f2514a;
            } catch (Exception unused2) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class OAIDCallBack extends IOAIDCallBack.Stub {
        static {
            t2o.a(147849231);
        }

        private OAIDCallBack() {
        }

        @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
        public void handleResult(int i, Bundle bundle) throws RemoteException {
            if (i == 0 && bundle != null) {
                String string = bundle.getString("oa_id_flag");
                if (HonorDeviceIdSupplier.b(string)) {
                    HonorDeviceIdSupplier.c(string);
                }
            }
        }

        @Override // com.hihonor.cloudservice.oaid.IOAIDCallBack
        public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
        }
    }
}
