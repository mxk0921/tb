package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class log {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23469a;
    public static final log INSTANCE = new log();
    public static long b = System.currentTimeMillis();
    public static long c = System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CaptureManager f23470a;

        public a(CaptureManager captureManager) {
            this.f23470a = captureManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                log.a(log.INSTANCE, this.f23470a, true, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CaptureManager f23471a;

        public b(CaptureManager captureManager) {
            this.f23471a = captureManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                log.a(log.INSTANCE, this.f23471a, false, false);
            }
        }
    }

    static {
        t2o.a(481296508);
    }

    public static final /* synthetic */ void a(log logVar, CaptureManager captureManager, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2676425", new Object[]{logVar, captureManager, new Boolean(z), new Boolean(z2)});
        } else {
            logVar.e(captureManager, z, z2);
        }
    }

    public final boolean b(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4d367e8", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            j = c;
        } else {
            j = b;
        }
        if (System.currentTimeMillis() - j > 1000) {
            return true;
        }
        return false;
    }

    public final void c(Activity activity, CaptureManager captureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e993c1f", new Object[]{this, activity, captureManager, new Boolean(z)});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        if (!captureManager.K() && !f23469a && b(true)) {
            c = System.currentTimeMillis();
            activity.runOnUiThread(new a(captureManager));
        }
    }

    public final void d(Activity activity, CaptureManager captureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d6395d", new Object[]{this, activity, captureManager, new Boolean(z)});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        if (!captureManager.J() && f23469a && b(false)) {
            b = System.currentTimeMillis();
            activity.runOnUiThread(new b(captureManager));
        }
    }

    public final void e(CaptureManager captureManager, boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248d5f5c", new Object[]{this, captureManager, new Boolean(z), new Boolean(z2)});
        } else if (captureManager.B().q()) {
            f23469a = z;
            if (z) {
                str = "show";
            } else {
                str = "hide";
            }
            if (z2) {
                str2 = "open";
            } else {
                str2 = "close";
            }
            captureManager.B().t(new qog(str, str2));
        }
    }
}
