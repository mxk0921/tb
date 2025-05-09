package com.huawei.nfc.sdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import tb.bzx;
import tb.l9b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    public final WeakReference b;
    public ICUPOnlinePayService c;
    public l9b d;
    public boolean e;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5530a = new byte[0];
    public final ServiceConnection f = new b(this, null);
    public final ICUPOnlinePayCallBackService g = new ICUPOnlinePayCallBackService.Stub() { // from class: com.huawei.nfc.sdk.service.HwOpenPayTask$1
        @Override // com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService
        public void onError(String str, String str2) {
            boolean z;
            StringBuilder sb = new StringBuilder("getUnionOnlinePayStatus---onError--- errorCode is ");
            sb.append(str);
            sb.append(" and errorMsg is ");
            sb.append(str2);
            c.this.getClass();
            z = c.this.e;
            if (z) {
                c.this.l();
            }
        }

        @Override // com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService
        public void onResult(Bundle bundle) {
            boolean z;
            c.this.getClass();
            z = c.this.e;
            if (z) {
                c.this.l();
            }
        }
    };

    public c(Context context) {
        this.b = new WeakReference(context);
    }

    public final void l() {
        ServiceConnection serviceConnection;
        if (this.e) {
            this.e = false;
            this.c = null;
            WeakReference weakReference = this.b;
            if (weakReference != null && (serviceConnection = this.f) != null) {
                try {
                    Context context = (Context) weakReference.get();
                    if (context != null) {
                        context.unbindService(serviceConnection);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void m() {
        l9b l9bVar = this.d;
        if (l9bVar != null) {
            ((bzx) l9bVar).a(0, new Bundle());
        }
        l();
    }

    public final void n() {
        boolean z;
        Context context;
        synchronized (this.f5530a) {
            try {
                if (this.c == null) {
                    Intent intent = new Intent("com.huawei.nfc.action.OPEN_AIDL_API_PAY");
                    intent.setPackage("com.huawei.wallet");
                    WeakReference weakReference = this.b;
                    if (weakReference == null || (context = (Context) weakReference.get()) == null) {
                        z = false;
                    } else {
                        z = context.bindService(intent, this.f, 1);
                    }
                    new StringBuilder("---bindService---end:").append(z);
                    if (z) {
                        this.e = true;
                        if (this.c == null) {
                            try {
                                this.f5530a.wait();
                            } catch (Exception unused) {
                            }
                        }
                    }
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(String str, l9b l9bVar) {
        Executors.newCachedThreadPool().execute(new a(this, l9bVar, str));
    }
}
