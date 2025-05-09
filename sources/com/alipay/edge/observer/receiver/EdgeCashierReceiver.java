package com.alipay.edge.observer.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.bcy;
import tb.cvx;
import tb.gvx;
import tb.pdy;
import tb.rdy;
import tb.tdy;
import tb.uux;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EdgeCashierReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f3839a;
    public static volatile EdgeCashierReceiver b;

    private EdgeCashierReceiver() {
    }

    public static EdgeCashierReceiver a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EdgeCashierReceiver) ipChange.ipc$dispatch("916200c6", new Object[0]);
        }
        if (b == null) {
            synchronized (EdgeCashierReceiver.class) {
                try {
                    if (b == null) {
                        b = new EdgeCashierReceiver();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static /* synthetic */ Object ipc$super(EdgeCashierReceiver edgeCashierReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/edge/observer/receiver/EdgeCashierReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String a2 = tdy.b().a("proactive_on", "false");
            if ("KEnterMiniPayViewNotification".equals(action) && "true".equals(a2)) {
                new Thread(new Runnable() { // from class: com.alipay.edge.observer.receiver.EdgeCashierReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            rdy a3 = EdgeCashierReceiver.a(applicationContext, "proactive_enter");
                            pdy.b();
                            pdy.a(applicationContext, a3);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, "APSecuritySdk").start();
            }
        }
    }

    public static /* synthetic */ rdy a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdy) ipChange.ipc$dispatch("57c0aef4", new Object[]{context, str});
        }
        rdy rdyVar = new rdy();
        ArrayList arrayList = new ArrayList();
        arrayList.add(yah.SP_PREFIX_KEY);
        rdyVar.j = APSecuritySdk.getInstance(context).getTokenResult().apdid;
        rdyVar.i = APSecuritySdk.getInstance(context).getTokenResult().apdidToken;
        cvx.b();
        rdyVar.d = cvx.a(context);
        rdyVar.c = context.getPackageName();
        gvx.b();
        rdyVar.g = gvx.g();
        gvx.b();
        rdyVar.h = gvx.l();
        rdyVar.f = "android";
        rdyVar.e = "3.5.0.20240702";
        rdyVar.b = str;
        rdyVar.l = uux.a(context);
        rdyVar.f27307a = arrayList;
        rdyVar.k = bcy.k();
        return rdyVar;
    }
}
