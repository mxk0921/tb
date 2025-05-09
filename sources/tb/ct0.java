package tb;

import android.content.Context;
import android.content.Intent;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ct0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17294a;

        public a(Context context) {
            this.f17294a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Intent intent = new Intent();
            intent.setAction("com.alipay.phonecashier.prepay");
            intent.setPackage("com.taobao.taobao");
            this.f17294a.sendBroadcast(intent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17295a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements PayTask.CupDirectAppsCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // com.alipay.android.app.pay.PayTask.CupDirectAppsCallback
            public void onResult(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
                    return;
                }
                rbb g = ck.g();
                g.d("getCupDirectApps result = " + z);
            }
        }

        public b(Context context) {
            this.f17295a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PayTask.getCupDirectApps(this.f17295a, new a(this));
            }
        }
    }

    static {
        t2o.a(708837508);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5553922", new Object[]{context});
        } else if (!AliBuyPerfSwitcher.enableSchedulePerf()) {
            dn.h(new a(context));
        }
    }

    public static String b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fe83a34", new Object[]{context, new Boolean(z)});
        }
        return xp3.f(context, z);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80867afb", new Object[]{context});
        } else if (y8r.e()) {
            ck.g().d("preGetCupDirectApps");
            dn.h(new b(context));
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1dbd5b", new Object[]{context});
        } else {
            xp3.b(context);
        }
    }
}
