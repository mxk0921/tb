package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.BrowserApplication;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class om2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile AtomicBoolean f25485a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                new BrowserActivity();
                Log.e("BrowserInitTask", "BrowserActivity newInstance use time = " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(619708456);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b21572", new Object[]{application});
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca555bec", new Object[]{application});
            return;
        }
        vmm.a();
        vmm.b(application);
        km2.a().c(new a());
    }

    public static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (h8s.a(application.getApplicationContext())) {
            TMSLogger.b("BrowserInitTask", "skip TMSEarlyInitializer");
        } else {
            d(application, hashMap);
        }
    }

    public static void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{application, hashMap});
        } else if (f25485a.compareAndSet(false, true)) {
            BrowserApplication.setupOpenMultiMode();
            BrowserApplication.initMonitor();
            BrowserApplication.registerConfig();
            BrowserApplication.registerOrangeListener();
            b(application);
            a(application);
        }
    }
}
